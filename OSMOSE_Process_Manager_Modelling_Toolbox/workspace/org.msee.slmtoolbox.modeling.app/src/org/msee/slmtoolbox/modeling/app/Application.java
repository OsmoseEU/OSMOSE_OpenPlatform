package org.msee.slmtoolbox.modeling.app;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

/**
 * This class controls all aspects of the application's execution, from start to stop
 */
public class Application implements IApplication {

	/**
	 * (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.IApplicationContext)
	 */
	public Object start(IApplicationContext context) throws Exception {
		Display display = PlatformUI.createDisplay();
		try {
			// creates the workbench instance with its configuration (ApplicationWorkbenchAdvisor)
			// run the workbench instance synchronously
			int returnCode = PlatformUI.createAndRunWorkbench(display, new ApplicationWorkbenchAdvisor());
			
			// when the workbench instance is closed... (i.e. : exit)
			if (returnCode == PlatformUI.RETURN_RESTART)
				return IApplication.EXIT_RESTART;
			else
				return IApplication.EXIT_OK;
		}
		finally {
			// in any case (i.e. : exception), the display is disposed
			display.dispose();
		}
	}

	/**
	 * (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	public void stop() {
		
		// if workbench is not running, return
		if (!PlatformUI.isWorkbenchRunning())
			return;
		
		final IWorkbench workbench = PlatformUI.getWorkbench();
		final Display display = workbench.getDisplay();
		
		display.syncExec(new Runnable() {
			public void run() {
				if (!display.isDisposed())
					// close the workbench when display is not disposed
					workbench.close();
			}
		});
	}
}
