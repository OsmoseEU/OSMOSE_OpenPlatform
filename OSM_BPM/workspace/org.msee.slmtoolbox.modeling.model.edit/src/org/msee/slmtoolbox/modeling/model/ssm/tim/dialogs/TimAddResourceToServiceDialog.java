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
public class TimAddResourceToServiceDialog extends AbstractTimElementDialog<TimService, TimResource> {
	
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
	public TimAddResourceToServiceDialog(Shell parentShell, ILabelProvider labelProvider,
			TimService elementBeCompleted) {
		super(parentShell, labelProvider, elementBeCompleted, "String Selection", "Select a String (* = any string, ? = any char):", TimResource.class);
	}

	@Override
	protected List<TimResource> getListSource() {
		List<TimResource> listSource = new ArrayList<TimResource>();
		if(null != getElementBeCompleted()) {
			listSource.addAll(getElementBeCompleted().getModel().getResources());
		}
		return listSource;
	}

	@Override
	protected List<TimResource> getListFiltre() {
		List<TimResource> listFilter = new ArrayList<TimResource>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getResources());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(TimResource newElement) {
		newElement.getServices().add(getElementBeCompleted());
		getElementBeCompleted().getResources().add(newElement);
	}
}
