package org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;

/**
 * 
 * @author HBA6
 * this is the dialog to add resources to a process
 *
 */
public class BsmAddVariableToPIDialog extends AbstractBsmElementDialog<BsmPerformanceIndicator, BsmDecisionVariable> {
	
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
	public BsmAddVariableToPIDialog(Shell parentShell, ILabelProvider labelProvider,
			BsmPerformanceIndicator bsmPI) {
		super(parentShell, labelProvider, bsmPI, "String Selection", "Select a String (* = any string, ? = any char):", BsmDecisionVariable.class);
	}

	@Override
	protected List<BsmDecisionVariable> getListSource() {
		List<BsmDecisionVariable> listSource = new ArrayList<BsmDecisionVariable>();
		
		if(null != getElementBeCompleted() && null != getElementBeCompleted().getDecision()) {	
			
				listSource.addAll(getElementBeCompleted().getDecision().getVariables());
				
			}
		
		return listSource;
	}

	@Override
	protected List<BsmDecisionVariable> getListFiltre() {
		List<BsmDecisionVariable> listFilter = new ArrayList<BsmDecisionVariable>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getVariables());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(BsmDecisionVariable newElement) {
		newElement.getPerformanceIndicators().add(getElementBeCompleted());
		getElementBeCompleted().getVariables().add(newElement);
	}
}
