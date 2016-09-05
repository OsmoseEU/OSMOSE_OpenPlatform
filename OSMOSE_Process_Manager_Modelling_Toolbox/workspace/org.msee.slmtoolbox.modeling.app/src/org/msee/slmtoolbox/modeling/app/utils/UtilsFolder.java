package org.msee.slmtoolbox.modeling.app.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.msee.slmtoolbox.modeling.app.service.BsmProjectManager;
import org.msee.slmtoolbox.modeling.app.service.TimProjectManager;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin.SsmProjectFile;

public class UtilsFolder {


	/**
	 * Find project for a selection
	 * 
	 * @return null if project not found
	 */
	public static IProject findProject(Object selection) {
		IProject project = null;
		if (selection instanceof IProject) {
			project = (IProject) selection;
		} else if (selection instanceof TreeSelection) {
			TreeSelection treeSelection = (TreeSelection) selection;
			if (treeSelection.getFirstElement() instanceof IResource) {
				project = ((IResource) treeSelection.getFirstElement()).getProject();
			} else if (treeSelection.getFirstElement() instanceof IPath) {
				IPath pathSelection = (IPath) treeSelection.getFirstElement();
				IResource resource = (IResource) ResourcesPlugin.getWorkspace().getRoot().findMember(pathSelection);
				project = resource.getProject();
			} 
		} else if ((selection instanceof IStructuredSelection)) {
			// find first class
			Object first = ((IStructuredSelection) selection).getFirstElement();
			// if IResource return project source
			if ((first instanceof IResource)) {
				IResource resource = (IResource) first;
				project = resource.getProject();
			}
		} 
		return project;
	}

	/**
	 * Get file selected
	 * @param iSelection
	 * @return null if not selected file
	 */
	public static IFile findFile(Object selection) {
		if (selection instanceof IFile) {
			return (IFile) selection;
		} else if(selection instanceof ITreeSelection) {
			ITreeSelection treeSelection = (ITreeSelection) selection;
			return findFile(treeSelection.getFirstElement());
		}
		return null;
	}

	/**
	 * Find a project path for a selection
	 * @param selection
	 * @return
	 */
	public static String findProjectPath(Object selection) {
		IProject project = findProject(selection);
		if (null != project) {
			return project.getFullPath().toString();
		}
		return null;
	}

	/**
	 * Get a project array according to a type (<code>SsmProjectFile</code>)
	 * @param projects		array with all project
	 * @param typeProject	type project
	 * @return array with all project
	 */
	public static Object[] getProjectForType(IProject[] projects,
			String typeProject) {
		// create a project list
		List<IProject> project = new ArrayList<IProject>();
		for (int i=0; i <projects.length; i++) {
			boolean goodProject = false;
			// find id for the typeProject
			if (SsmProjectFile.BSM_PROJECT_TYPE.equals(typeProject)) {
				// if project find is BSM
				goodProject = BsmProjectManager.eInstance.isBsmProject(projects[i]);
			} else if (SsmProjectFile.TIM_PROJECT_TYPE.equals(typeProject)) {
				// if project find is TIM
				goodProject = TimProjectManager.eInstance.isTimProject(projects[i]);
			}
			// if id is not null add project
			if (goodProject) {
				project.add(projects[i]);
			}
		}
		return project.toArray();
	}

	/**
	 * @param name project name testing
	 * @return true if a workspace project have the name
	 */
	public static boolean isExistInProject(String name) {
		if (null != name) {
			// for all project in workspace
			IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
			for (int index = 0; index < projects.length; index++) {
				// return true if one project exist with name
				if (projects[index].getName().equals(name)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * @param nameFile		name file to find
	 * @param path			can be null, for search to root
	 * @param project		prospected project	
	 * @return true if name file is used in path in project
	 */
	public static boolean isExistFileInProject(String nameFile,
			String path, IProject project) {
		if (null != nameFile) {
			// creat path file in project
			StringBuffer bufferPath = new StringBuffer();
			// not path define
			if (null != path) {
				bufferPath.append(path);
				bufferPath.append("/");
			}
			bufferPath.append(nameFile);
			// search to root
			IFile file = project.getFile(new Path(bufferPath.toString()));
			if (null != file && file.isAccessible()) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Search the bsm file in project
	 * @param project
	 * @return null if not found
	 */
	public static IFile findFileBsm(IProject project) {
		try {
			IResource[] resources = project.members();
			// for all resource in project
			for (int index = 0; index < resources.length; index++) {
				if (resources[index] instanceof IFile) {
					IFile file = (IFile) resources[index];
					if ("bsm".equals(file.getFileExtension())) {
						return file;
					}
				}
				
			}
		} catch (CoreException exception) {
			//TODO FTO : exception
		}
		return null;
	}

	/**
	 * Get name file without extension file
	 * @param file
	 * @return "" if can't find name
	 */
	public static String getNameFile(IFile file) {
		if (null != file && null!=file.getName()) {
			String name = file.getName();
			int indexEnd = name.lastIndexOf(".");
			if (-1 == indexEnd) {
				return name;
			} else {
				return name.substring(0,name.lastIndexOf("."));
			}
		}
		return "";
	}

}
