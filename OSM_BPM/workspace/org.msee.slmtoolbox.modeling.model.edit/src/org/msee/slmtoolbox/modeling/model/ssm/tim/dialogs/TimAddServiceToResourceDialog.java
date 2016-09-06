package org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService;

/**
 * 
 * @author HBA6
 * this is the dialog to add resources to a process
 *
 */
public class TimAddServiceToResourceDialog extends AbstractTimElementDialog<TimResource, TimService> {
	
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
	public TimAddServiceToResourceDialog(Shell parentShell, ILabelProvider labelProvider,
			TimResource elementBeCompleted) {
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
		newElement.getResources().add(getElementBeCompleted());
		getElementBeCompleted().getServices().add(newElement);
	}
}
