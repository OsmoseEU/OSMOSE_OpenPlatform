package tu.org.msee.slmtoolbox.modeling.editor.graigrid;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.msee.slmtoolbox.modeling.app.utils.UtilsFolder;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;

/**
 * test : retrieve the project ID of a BSM project 
 */
public class PiHandler extends AbstractHandler {

	/**
	 * Execute the test
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Get the current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			// find decision center
			IProject project = UtilsFolder.findProject(selection);
			if (null != UtilsFolder.findFileBsm(project)) {
				BsmAppService bsmService = new BsmAppService(project);
				
				TestFrame frame = new TestFrame(bsmService);
				frame.pack();
				frame.setVisible(true);
				frame.setResizable(false);
				return null;
			}
			
		}
		return null;
	}
}
