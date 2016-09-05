package org.msee.slmtoolbox.modeling.app.service.impl;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.msee.slmtoolbox.modeling.app.exception.MseeException;
import org.msee.slmtoolbox.modeling.app.natures.TimNature;
import org.msee.slmtoolbox.modeling.app.service.TimProjectManager;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin.SsmProjectFile;
import org.msee.slmtoolbox.modeling.app.utils.TIMFolder;
import org.msee.slmtoolbox.modeling.app.utils.UtilsFolder;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel;


/**
 * TIM project manager implementation
 */
public class TimProjectManagerImpl implements TimProjectManager {

	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(TimProjectManagerImpl.class);

	/**
	 * Init a TIM project manager implementation
	 */
	public static TimProjectManager init() {
		return new TimProjectManagerImpl();
	}

	/**
	 * Create a configuration file for TIM Msee project
	 * 
	 * @param project target project
	 * @param timProject business object of project
	 * @param monitor monitor
	 */
	public void createConfigurationFileMsee(IProject project, TimModel timProject, IProgressMonitor monitor) {
		InputStream confmsseStream = null;
		try {
			TimNature.createProjectNature(project);
			// create a file confMsse
			IFile confMsse = project.getFile(SsmProjectFile.FILE_NAME);
			// create contained
			StringBuffer bufferCongMsee = new StringBuffer();
			// add id of ssm
			bufferCongMsee.append(SsmProjectFile.KEY_TIM_ID);
			bufferCongMsee.append(SsmProjectFile.SEPARATOR);
			if (null != timProject) {
				bufferCongMsee.append(timProject.getId());
			} else {
				bufferCongMsee.append("-1");
			}

			confmsseStream = new ByteArrayInputStream(
					bufferCongMsee.toString().getBytes());
			// save the file confMsse
			if (!confMsse.exists())
				confMsse.create(confmsseStream, true, monitor);
			confMsse.setHidden(true);
		} catch (CoreException e) {
			log.error(e.getMessage());
			throw new MseeException(e);
		} finally {
			if (null != confmsseStream) {
				try {
					confmsseStream.close();
				} catch (IOException e) {
					log.error(e.getMessage());
					throw new MseeException(e);
				}
			}
		}
	}

	/**
	 * Create a tree of project
	 * 
	 * @param project
	 *            target project
	 */
	public void createTreeForProject(IProject project) throws CoreException {
		TIMFolder folderRoot = new TIMFolder();
		for (TIMFolder folder : folderRoot.getFolders()) {
			if (null != folder.getName() && !folder.getName().equals("")) {
				IFolder ifolder = project.getFolder(folder.getName());
				ifolder.create(false, true, null);
				if (null != folderRoot.getFolders()
						&& folderRoot.getFolders().size() > 0) {
					createTreeForProjectIterate(ifolder, folder);
				}

			}
		}

	}

	/**
	 * Iterate of create a tree of project
	 * 
	 * @param iFolderRoot
	 *            project's folder
	 * @param folderRoot
	 *            bean's folder
	 */
	private void createTreeForProjectIterate(IFolder iFolderRoot,
			TIMFolder folderRoot) throws CoreException {

		for (TIMFolder folder : folderRoot.getFolders()) {
			if (null != folder.getName() && !folder.getName().equals("")) {
				IFolder ifolder = iFolderRoot.getFolder(folder.getName());
				ifolder.create(false, true, null);
				if (null != folderRoot.getFolders()
						&& folderRoot.getFolders().size() > 0) {
					createTreeForProjectIterate(ifolder, folder);
				}
			}
		}
	}
	
	/**
	 * TODO
	 * @param selection
	 * @return
	 */
	public boolean isTimProject(Object selection) {
		boolean isBsmProject = false;
		IProject project = UtilsFolder.findProject(selection);
		
		try {
			if (null != project
					&& project.getNature(TimNature.NATURE_ID) instanceof TimNature) {
				isBsmProject = true;
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return isBsmProject;
	}

	/**
	 * Get a id of tim project
	 * 
	 * @param selection
	 * @return the is tim
	 */
	public String getIdTim(Object selection) {
		String idTim = null;
		IProject project = UtilsFolder.findProject(selection);

		// find is
		if (null != project) {
			try {
				// find conf file
				IFile confMsse = project.getFile(SsmProjectFile.FILE_NAME);
				// and read a file
				StringWriter writer=new StringWriter();
				InputStreamReader streamReader=new InputStreamReader(confMsse.getContents());
				BufferedReader buffer=new BufferedReader(streamReader);
				
				String line="";
				while ( null!=(line=buffer.readLine())){
					writer.write(line); 
				}
				
				String[] configuration =  writer.toString().split("=");
				
				for (int i = 0; i<configuration.length; i++ ){
					String temp = configuration[i];
					temp = temp.trim();
					if (SsmProjectFile.KEY_TIM_ID.equals(temp)
							&& i+1 < configuration.length) {
						idTim = configuration[i+1].trim();
						i = configuration.length;
					}
				}
				
				
			} catch (CoreException e) {
				log.error(e.getMessage());
				return idTim;
			} catch (IOException e) {
				log.error(e.getMessage());
				return idTim;
			}
		}

		return idTim;
	}

	/**
	 * Find a folder in workspace
	 * @param diagramUri	for find project
	 * @param folderName	to find
	 * @return a ifolder or null;
	 */
	private IFolder findFolder(URI diagramUri, String folderName) {
		IFolder folder = null;
		// if uri is in platform resource
		if (null != diagramUri && diagramUri.isPlatformResource()) {
			IProject project = findProject(diagramUri.toPlatformString(true));
			if (null != project) {
				folder = project.getFolder(folderName);
			}
		}
		return folder;
	}
	
	private static IProject findProject(String urlDiagram) {
		IFile fileDiagram = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(urlDiagram));
		return fileDiagram.getProject();
	}
}
