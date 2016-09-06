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
public class BsmAddPIToObjectiveDialog extends AbstractBsmElementDialog<BsmDecisionObjective, BsmPerformanceIndicator> {
	
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
	public BsmAddPIToObjectiveDialog(Shell parentShell, ILabelProvider labelProvider,
			BsmDecisionObjective bsmObjective) {
		super(parentShell, labelProvider, bsmObjective, "String Selection", "Select a String (* = any string, ? = any char):", BsmPerformanceIndicator.class);
	}

	@Override
	protected List<BsmPerformanceIndicator> getListSource() {
		List<BsmPerformanceIndicator> listSource = new ArrayList<BsmPerformanceIndicator>();
		
		if(null != getElementBeCompleted() && null != getElementBeCompleted().getDecision()) {	
			
				listSource.addAll(getElementBeCompleted().getDecision().getPerformanceIndicators());
				
			}
		
		return listSource;
	}

	@Override
	protected List<BsmPerformanceIndicator> getListFiltre() {
		List<BsmPerformanceIndicator> listFilter = new ArrayList<BsmPerformanceIndicator>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getPerformanceIndicators());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(BsmPerformanceIndicator newElement) {
		newElement.getObjectives().add(getElementBeCompleted());
		getElementBeCompleted().getPerformanceIndicators().add(newElement);
	}
}
