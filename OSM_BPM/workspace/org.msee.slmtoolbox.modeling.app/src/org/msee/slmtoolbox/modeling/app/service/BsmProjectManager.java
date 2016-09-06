package org.msee.slmtoolbox.modeling.app.service;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.msee.slmtoolbox.modeling.app.service.impl.BsmProjectManagerImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;

/** SSM project manager interface */
public interface BsmProjectManager {

	/** Instance for ssm project manager */
	BsmProjectManager eInstance = BsmProjectManagerImpl.init();
	
	/**
	 * Create a configuration file for Msee project
	 * @param project 		target project
	 * @param bsmProject	business object of project
	 * @param monitor 		monitor
	 */
	public void createConfigurationFileMsee(IProject project, BsmModel bsmProject, IProgressMonitor monitor);

	/** 
	 * Create a tree of project
	 * @param project 		target project
	 */
	public void createTreeForProject(IProject project) throws CoreException ;
	
	/**
	 * TODO
	 * @param selection
	 * @return
	 */
	public boolean isBsmProject(Object selection);
		
	/**
	 * Get a id of ssm project
	 * @param selection	in the eclipse explorer
	 * @return the is ssm
	 * @deprecated use isBsmProject(...)
	 */
	public String getIdBsm(Object selection);
	
	/**
	 * Create an AppService for Bsm
	 * @param diagramUri	uri diagram
	 * @param project 		project select
	 * @return an appService
	 */
	public BsmAppService createBsmService(IProject project);

	/**
	 * Create an AppService for EaStar
	 * @param diagramUri	uri diagram
	 * @return an appService
	 */
	public EAStarAppService createEaService(URI diagramUri);

	/**
	 * Create an AppService for GraiGrid
	 * @param diagramUri	uri diagram
	 * @return an appService
	 */
	public GgAppService createGgService(URI diagramUri);

}
