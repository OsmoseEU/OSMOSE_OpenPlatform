package org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure;

/**
 * 
 * @author HBA6
 * this is the dialog to add resources to a process
 *
 */
public class BsmAddDecisionToDecisionStructureDialog extends AbstractBsmElementDialog<BsmDecisionStructure, BsmDecision> {
	
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
	 *            process
	 * @param labelProvider
	 *            labelProvider
	 * 
	 */
	public BsmAddDecisionToDecisionStructureDialog(Shell parentShell, ILabelProvider labelProvider,
			BsmDecisionStructure bsmDecisionStructure) {
		super(parentShell, labelProvider, bsmDecisionStructure, "String Selection", "Select a String (* = any string, ? = any char):", BsmDecision.class);
	}

	@Override
	protected List<BsmDecision> getListSource() {
		List<BsmDecision> listSource = new ArrayList<BsmDecision>();
		if(null != getElementBeCompleted()) {
			listSource.addAll(getElementBeCompleted().getBsmModel().getDecisions());
		}
		return listSource;
	}

	@Override
	protected List<BsmDecision> getListFiltre() {
		List<BsmDecision> listFilter = new ArrayList<BsmDecision>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getDecisions());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(BsmDecision newElement) {
		newElement.setDecisionStructure(getElementBeCompleted());
		getElementBeCompleted().getDecisions().add(newElement);
	}
}
