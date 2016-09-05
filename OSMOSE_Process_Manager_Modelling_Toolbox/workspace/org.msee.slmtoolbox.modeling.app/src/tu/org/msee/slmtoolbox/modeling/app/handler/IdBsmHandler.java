package tu.org.msee.slmtoolbox.modeling.app.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.msee.slmtoolbox.modeling.app.service.BsmProjectManager;

/**
 * test : retrieve the project ID of a BSM project 
 */
public class IdBsmHandler extends AbstractHandler {

	/**
	 * Execute the test
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Get the current selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			BsmProjectManager manager = BsmProjectManager.eInstance;
			boolean isGoodProject = manager.isBsmProject((IStructuredSelection) selection);
			if(isGoodProject) {
				System.out.print("\n Is Bsm project " );
			}
		}
		return null;
	}
}
