package org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.flow;

import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

public class CreateEaSupportFlowDialog extends AbstractCreateEaFlowDialog {

	 /**
     * Creates an input dialog with OK and Cancel buttons. Note that the dialog
     * will have no visual representation (no widgets) until it is told to open.
     * <p>
     * Note that the <code>open</code> method blocks for input dialogs.
     * </p>
     * 
     * @param parentShell
     *            the parent shell, or <code>null</code> to create a top-level
     *            shell
     * @param process 
     * 				process
     * @param service
     * 				AppService
	 * @param eaOrganization 
     */
    public CreateEaSupportFlowDialog(Shell parentShell, EaProcess process,EaFlowNode source, EaFlowNode target, EAStarAppService service) {
		super(parentShell, process, source, target, service, "Create a Support flow");

    }

	@Override
	protected EaFlow createFlow(EaProcess process, EaFlowNode source, EaFlowNode target) {
		return getAppService().createSupportFlow(process, source, target);
	}

}
