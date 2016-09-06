package org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization;

/**
 * 
 * @author HBA6
 * this is the dialog to add resources to a process
 *
 */
public class TimAddOrganizationToProcessDialog extends AbstractTimElementDialog<TimProcess, TimOrganization> {
	
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
	public TimAddOrganizationToProcessDialog(Shell parentShell, ILabelProvider labelProvider,
			TimProcess elementBeCompleted) {
		super(parentShell, labelProvider, elementBeCompleted, "String Selection", "Select a String (* = any string, ? = any char):", TimOrganization.class);
	}

	@Override
	protected List<TimOrganization> getListSource() {
		List<TimOrganization> listSource = new ArrayList<TimOrganization>();
		if(null != getElementBeCompleted()) {
			listSource.addAll(getElementBeCompleted().getModel().getOrganizations());
		}
		return listSource;
	}

	@Override
	protected List<TimOrganization> getListFiltre() {
		List<TimOrganization> listFilter = new ArrayList<TimOrganization>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getOrganizations());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(TimOrganization newElement) {
		newElement.getProcesses().add(getElementBeCompleted());
		getElementBeCompleted().getOrganizations().add(newElement);
	}
}
