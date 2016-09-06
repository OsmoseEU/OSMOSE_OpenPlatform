package org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;

/**
 * 
 * @author HBA6
 * this is the dialog to add resources to a process
 *
 */
public class BsmAddObjectiveToPIDialog extends AbstractBsmElementDialog<BsmPerformanceIndicator, BsmDecisionObjective> {
	
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
	public BsmAddObjectiveToPIDialog(Shell parentShell, ILabelProvider labelProvider,
			BsmPerformanceIndicator bsmPI) {
		super(parentShell, labelProvider, bsmPI, "String Selection", "Select a String (* = any string, ? = any char):", BsmDecisionObjective.class);
	}

	@Override
	protected List<BsmDecisionObjective> getListSource() {
		List<BsmDecisionObjective> listSource = new ArrayList<BsmDecisionObjective>();
		
		if(null != getElementBeCompleted() && null != getElementBeCompleted().getDecision()) {	
			
				listSource.addAll(getElementBeCompleted().getDecision().getObjectives());
				
			}
		
		return listSource;
	}

	@Override
	protected List<BsmDecisionObjective> getListFiltre() {
		List<BsmDecisionObjective> listFilter = new ArrayList<BsmDecisionObjective>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getObjectives());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(BsmDecisionObjective newElement) {
		newElement.getPerformanceIndicators().add(getElementBeCompleted());
		getElementBeCompleted().getObjectives().add(newElement);
	}
}
