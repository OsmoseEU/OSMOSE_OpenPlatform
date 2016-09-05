package com.sap.research.msee.slmtoolbox.uml.wizards;


import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;

public class SlmWizardUtils {

    public static IContainer createProjectIfNecessary() throws CoreException {
	IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
	if (root.getProjects().length == 0) {
	    IProgressMonitor progressMonitor = new NullProgressMonitor();
	    root.getProjects();
	    final String PROJECT_NAME = "SLMProject";
	    IProject project = root.getProject(PROJECT_NAME);
	    project.create(progressMonitor);
	    project.open(progressMonitor);
	    return project;
	} else if (root.getProjects().length == 1) {
	    return root.getProjects()[0];
	}
	return null;
    }

}