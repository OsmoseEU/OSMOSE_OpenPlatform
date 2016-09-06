package org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService;

/**
 * 
 * @author HBA6
 * this is the dialog to add resources to a process
 *
 */
public class TimAddServiceToProcessDialog extends AbstractTimElementDialog<TimProcess, TimService> {
	
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
	public TimAddServiceToProcessDialog(Shell parentShell, ILabelProvider labelProvider,
			TimProcess elementBeCompleted) {
		super(parentShell, labelProvider, elementBeCompleted, "String Selection", "Select a String (* = any string, ? = any char):", TimService.class);
	}

	@Override
	protected List<TimService> getListSource() {
		List<TimService> listSource = new ArrayList<TimService>();
		if(null != getElementBeCompleted()) {
			listSource.addAll(getElementBeCompleted().getModel().getServices());
		}
		return listSource;
	}

	@Override
	protected List<TimService> getListFiltre() {
		List<TimService> listFilter = new ArrayList<TimService>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getServices());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(TimService newElement) {
		newElement.getProcesses().add(getElementBeCompleted());
		getElementBeCompleted().getServices().add(newElement);
	}
}
