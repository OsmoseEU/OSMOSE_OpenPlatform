package org.msee.slmtoolbox.modeling.app.natures;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;

public class BsmNature implements IProjectNature {

    private IProject project;
    
    public static final String NATURE_ID = "org.msee.slmtoolbox.modeling.app.bsmNature";
    
	public void configure() throws CoreException {
       // Add nature-specific information
       // for the project, such as adding a builder
       // to a project's build spec.
    }
    public void deconfigure() throws CoreException {
       // Remove the nature-specific information here.
    }
    public IProject getProject() {
       return project;
    }
    public void setProject(IProject value) {
       project = value;
    }
    
    /**
     * TODO
     * @param project
     */
    public static void createProjectNature(IProject project) {
		try {
			if (!project.hasNature(NATURE_ID)) {
				IProjectDescription description = project.getDescription();
				String[] natures = description.getNatureIds();
				String[] newNatures = new String[natures.length + 1];
				System.arraycopy(natures, 0, newNatures, 0, natures.length);
				newNatures[natures.length] = NATURE_ID;
				IStatus status = project.getWorkspace().validateNatureSet(
						newNatures);

				// check the status and decide what to do
				if (status.getCode() == IStatus.OK) {
					description.setNatureIds(newNatures);
					project.setDescription(description, null);
				} else {
					// raise a user error
				}
			}
		} catch (CoreException e) {
			// Something went wrong
		}
    }
 }
