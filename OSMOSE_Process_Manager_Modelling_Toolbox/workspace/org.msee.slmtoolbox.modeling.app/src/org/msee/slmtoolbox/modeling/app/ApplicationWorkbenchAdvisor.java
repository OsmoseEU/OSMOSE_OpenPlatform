package org.msee.slmtoolbox.modeling.app;

import java.net.URL;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IWorkbenchPreferenceConstants;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin;
import org.osgi.framework.Bundle;

/**
 * manage the configuration of the workbench
  */
@SuppressWarnings("restriction")
public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {
	
	@Override
	public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

	@Override
	public String getInitialWindowPerspectiveId() {
		return MSeEPlugin.MSEE_PERSPECTIVE_ID;
	}

	@Override
	public void initialize(IWorkbenchConfigurer configurer) {

		super.initialize(configurer);

		// allow the workbench window state to be stored and retrieved
		configurer.setSaveAndRestore(false);

		// here's some typical RCP type configuration
		PlatformUI.getPreferenceStore().setValue(IWorkbenchPreferenceConstants.SHOW_TRADITIONAL_STYLE_TABS, false);

		IDE.registerAdapters();

		// insure that projects icons are shown		
		final String ICONS_PATH = "icons/full/";

		Bundle ideBundle = Platform.getBundle(IDEWorkbenchPlugin.IDE_WORKBENCH);

		declareWorkbenchImage(
				configurer, 
				ideBundle,
				IDE.SharedImages.IMG_OBJ_PROJECT, 
				ICONS_PATH + "obj16/prj_obj.gif",
				true);

		declareWorkbenchImage(
				configurer, 
				ideBundle,
				IDE.SharedImages.IMG_OBJ_PROJECT_CLOSED, 
				ICONS_PATH + "obj16/cprj_obj.gif", 
				true);
	}

	private void declareWorkbenchImage(IWorkbenchConfigurer configurer_p, Bundle ideBundle, String symbolicName, String path, boolean shared) {
	    URL url = ideBundle.getEntry(path);
	    ImageDescriptor desc = ImageDescriptor.createFromURL(url);
	    configurer_p.declareImage(symbolicName, desc, shared);
	}

	@Override
	public IAdaptable getDefaultPageInput() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}
}
