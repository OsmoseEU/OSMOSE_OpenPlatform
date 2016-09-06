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
import org.msee.slmtoolbox.modeling.app.natures.BsmNature;
import org.msee.slmtoolbox.modeling.app.properties.MseeProperties.FolderMSeE;
import org.msee.slmtoolbox.modeling.app.service.BsmProjectManager;
import org.msee.slmtoolbox.modeling.app.utils.BSMFolder;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin.SsmProjectFile;
import org.msee.slmtoolbox.modeling.app.utils.UtilsFolder;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;


/**
 * BSM project manager implementation
 */
public class BsmProjectManagerImpl implements BsmProjectManager {

	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(BsmProjectManagerImpl.class);

	/**
	 * Init a BSM project manager implementation
	 */
	public static BsmProjectManager init() {
		return new BsmProjectManagerImpl();
	}

	/**
	 * Create a configuration file for BSM Msee project
	 * 
	 * @param project target project
	 * @param bsmProject business object of project
	 * @param monitor monitor
	 */
	public void createConfigurationFileMsee(IProject project, BsmModel bsmProject, IProgressMonitor monitor) {
		InputStream confmsseStream = null;
		try {
			BsmNature.createProjectNature(project);
			// create a file confMsse
			IFile confMsse = project.getFile(SsmProjectFile.FILE_NAME);
			// create contained
			StringBuffer bufferCongMsee = new StringBuffer();
			// add id of ssm
			bufferCongMsee.append(SsmProjectFile.KEY_BSM_ID);
			bufferCongMsee.append(SsmProjectFile.SEPARATOR);
			bufferCongMsee.append(bsmProject.getId());

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
		BSMFolder folderRoot = new BSMFolder();
		for (BSMFolder folder : folderRoot.getFolders()) {
			if (null != folder.getName() && !folder.getName().equals("")) {
				IFolder ifolder = project.getFolder(folder.getName());
				if (!ifolder.exists()) {
					ifolder.create(false, true, null);
				}
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
			BSMFolder folderRoot) throws CoreException {

		for (BSMFolder folder : folderRoot.getFolders()) {
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
	public boolean isBsmProject(Object selection) {
		boolean isBsmProject = false;
		IProject project = UtilsFolder.findProject(selection);
		
		try {
			if (null != project
					&& project.getNature(BsmNature.NATURE_ID) instanceof BsmNature) {
				isBsmProject = true;
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return isBsmProject;
	}
	
	/**
	 * Get a id of bsm project
	 * 
	 * @param selection
	 * @return the is bsm
	 */
	public String getIdBsm(Object selection) {
		String idBsm = null;
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
					if (SsmProjectFile.KEY_BSM_ID.equals(temp)
							&& i+1 < configuration.length) {
						idBsm = configuration[i+1].trim();
						i = configuration.length;
					}
				}
				
				
			} catch (CoreException e) {
				log.error(e.getMessage());
			} catch (IOException e) {
				log.error(e.getMessage());
				throw new MseeException(e);
			}
		}

		return idBsm;
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
		
	/**
	 * Find project for a url diagram
	 * @param urlDiagram
	 * @return
	 */
	private static IProject findProject(String urlDiagram) {
		IFile fileDiagram = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(urlDiagram));
		return fileDiagram.getProject();
	}
	
	/**
	 * Create an AppService for Bsm
	 * @param diagramUri	uri diagram
	 * @return an appService
	 */
	public BsmAppService createBsmService(IProject project) {
		return new BsmAppService(project);
	}

	/**
	 * Create an AppService for EaStar
	 * @param diagramUri	uri diagram
	 * @return an appService
	 */
	@Override
	public EAStarAppService createEaService(URI diagramUri) {
		IFolder folder = findFolder(diagramUri, FolderMSeE.BSM_FOLDER_EA);
		return new EAStarAppService(folder);
	}

	/**
	 * Create an AppService for GraiGrid
	 * @param diagramUri	uri diagram
	 * @return an appService
	 */
	@Override
	public GgAppService createGgService(URI diagramUri) {
		IFolder folder = findFolder(diagramUri, FolderMSeE.BSM_FOLDER_GG);
		return new GgAppService(folder);
	}

}
