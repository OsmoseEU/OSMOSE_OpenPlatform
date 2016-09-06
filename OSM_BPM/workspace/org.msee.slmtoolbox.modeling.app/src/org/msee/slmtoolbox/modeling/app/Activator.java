package org.msee.slmtoolbox.modeling.app;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.msee.slmtoolbox.modeling.service.util.log.PluginLogListener;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
// public class Activator extends AbstractActivatorMsee {
public class Activator extends AbstractUIPlugin {
	
	// The plug-in ID
	public static final String PLUGIN_ID = "org.msee.slmtoolbox.modeling.app"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;
	
	// logger instance
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Activator.class);
	
	// important to store the PluginLogListener instances - not to be trashed by the garbage collector
	final List<PluginLogListener> pluginLogHooks = new ArrayList<PluginLogListener>();
	
	/**
	 * The constructor
	 */
	public Activator() {
		
		/**
		 * Setup logging with log4j
		 * http://coopology.com/2011/04/using-log4j-in-eclipse-rcp-and-forcing-all-other-plugins-to-use-it-too/
		 * http://www.ibm.com/developerworks/library/os-eclog/
		 */
		URL confURL = getBundle().getEntry("properties/log4j.properties");
		
		try {
			PropertyConfigurator.configure(FileLocator.toFileURL(confURL).getFile());
			log.debug("(Logging using log4j and configuration " + FileLocator.toFileURL(confURL).getFile() + ")");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		
	    log.debug("Starting application...");
	    
	    hookPluginLoggers(context);
	    
		super.start(context);
		
		plugin = this;

		/* Following the change management repository : the data service is without CDO
		// prepare epackage instances list
		List<EPackage> ePackageInstances = new ArrayList<EPackage>();
		ePackageInstances.add(BsmPackage.eINSTANCE);
		ePackageInstances.add(org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage.eINSTANCE);
		ePackageInstances.add(org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootPackage.eINSTANCE);
		ePackageInstances.add(org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage.eINSTANCE);
		ePackageInstances.add(org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage.eINSTANCE);
		ePackageInstances.add(org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.RootPackage.eINSTANCE);
		ePackageInstances.add(org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage.eINSTANCE);
		
		// prepare TIM epackage instances list
		ePackageInstances.add(TimPackage.eINSTANCE);
		ePackageInstances.add(org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage.eINSTANCE);
		ePackageInstances.add(org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage.eINSTANCE);
		ePackageInstances.add(org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage.eINSTANCE);
		ePackageInstances.add(org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.PhysicalMeanRelatedPartPackage.eINSTANCE);

		// try to configure CDO session
		try {
			CDOSessionFactory.getInstance().configureSession(
					ResourcesProperties.DATA_REPOSITORY_NAME,
					ResourcesProperties.DATA_URL, ePackageInstances);
		}
		catch (LifecycleException e) {
			
			log.error("No Model Repository Available - Can not initialize connection to CDO server, make sure that your repository is running");

			// open a Message Dialog and close application after confirmation from the user
			Shell shell = new Shell(SWT.TOOL | SWT.NO_TRIM);
			shell.setActive();
			
			MessageDialog.openError(shell, "No Model Repository Available", "Can not initialize connection to CDO server, make sure that your repository is running");

			throw e;
		}*/
		log.debug("Application started.");
	}

	/**
	 * hooks the dependent plugins to the logging framework
	 */
	private void hookPluginLoggers (BundleContext context) {
		
		// for each bundle executed in the context...
		for (Bundle bundle : context.getBundles()) {
			
			ILog pluginLogger = Platform.getLog(bundle);
			
			// add a loging listener
			pluginLogHooks.add(
					new PluginLogListener(pluginLogger, Logger.getLogger(bundle.getSymbolicName())));
			
			log.debug("Added logging hook for bundle: " + bundle.getSymbolicName());
		}
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		
		log.debug("stoping application...");
		
		plugin = null;
		super.stop(context);
		
		log.debug("application stoped");
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given
	 * plug-in relative path
	 *
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
}
