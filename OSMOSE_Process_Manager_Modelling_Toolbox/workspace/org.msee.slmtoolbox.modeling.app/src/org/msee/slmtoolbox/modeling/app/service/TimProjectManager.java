package org.msee.slmtoolbox.modeling.app.service;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.msee.slmtoolbox.modeling.app.service.impl.TimProjectManagerImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel;

public interface TimProjectManager {

	/** Instance for ssm project manager */
	TimProjectManager eInstance = TimProjectManagerImpl.init();
	
	/**
	 * Create a configuration file for Msee project
	 * @param project 		target project
	 * @param bsmProject	business object of project
	 * @param monitor 		monitor
	 */
	public void createConfigurationFileMsee(IProject project, TimModel bsmProject, IProgressMonitor monitor);

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
	public boolean isTimProject(Object selection);
	
	/**
	 * Get a id of ssm project
	 * @param selection	in the eclipse explorer
	 * @return the is ssm
	 */
	public String getIdTim(Object selection);
	
}
