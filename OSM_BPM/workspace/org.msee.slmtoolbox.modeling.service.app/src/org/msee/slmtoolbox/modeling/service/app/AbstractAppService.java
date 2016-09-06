package org.msee.slmtoolbox.modeling.service.app;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * Class main for a service app
 * @author fto
 */
public abstract class AbstractAppService {

	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(AbstractAppService.class);
	
	/**
	 * Data model resource
	 */
	protected Resource resource;
	
	/**
	 * Folder for find element
	 */
	private IFolder folder;
	
	/**
	 * Project for find element
	 */
	private IProject project;
	
	/**
	 * Default Constructor
	 */
	public AbstractAppService() {
	}
	
	/**
	 * Constructor by copie
	 * @param appService with param for service
	 */
	public AbstractAppService(AbstractAppService appService) {
		if (null != appService) {
			this.setResource(appService.getResource());
			this.setFolder(appService.getFolder());
			this.setProject(appService.getProject());
		}
	}

	/**
	 * Constructor with object configuration
	 * @param configuartionService	object for configuration service	
	 */
	public AbstractAppService(Object configuartionService) {
		
		if (configuartionService instanceof IFolder) {
			this.setFolder((IFolder) configuartionService);
		} else if (configuartionService instanceof IProject) {
			this.setProject((IProject) configuartionService);
		}
	}

	/**
	 * @return the resource
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * @param resource the resource to set
	 */
	private void setResource(Resource resource) {
		this.resource = resource;
	}

	/**
	 * @return the folder
	 */
	public IFolder getFolder() {
		return folder;
	}

	/**
	 * @param folder the folder to set
	 */
	private void setFolder(IFolder folder) {
		this.folder = folder;
	}

	/**
	 * @return the project
	 */
	public IProject getProject() {
		if (null != this.project) {
			return this.project;
		} else if (null != this.folder) {
			return this.folder.getProject();
		} else {
			log.error("Can't found bsm file, project and folder not define");
			return null;
		}
	}

	/**
	 * @param project the project to set
	 */
	private void setProject(IProject project) {
		this.project = project;
	}
	
	
}
