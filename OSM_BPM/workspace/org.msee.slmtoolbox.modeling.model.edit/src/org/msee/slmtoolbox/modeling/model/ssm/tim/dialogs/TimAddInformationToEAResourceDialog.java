package org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet;

public class TimAddInformationToEAResourceDialog extends AbstractTimElementDialog<TimEnterpriseApplicationResource, TimInformationSet> {
	
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
	public TimAddInformationToEAResourceDialog(Shell parentShell, ILabelProvider labelProvider,
			TimEnterpriseApplicationResource elementBeCompleted) {
		super(parentShell, labelProvider, elementBeCompleted, "String Selection", "Select a String (* = any string, ? = any char):", TimInformationSet.class);
	}

	@Override
	protected List<TimInformationSet> getListSource() {
		List<TimInformationSet> listSource = new ArrayList<TimInformationSet>();
		if(null != getElementBeCompleted()) {
			listSource.addAll(getElementBeCompleted().getModel().getInformations());
		}
		return listSource;
	}

	@Override
	protected List<TimInformationSet> getListFiltre() {
		List<TimInformationSet> listFilter = new ArrayList<TimInformationSet>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getInformations());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(TimInformationSet newElement) {
		newElement.getEntrepriseApplications().add(getElementBeCompleted());
		getElementBeCompleted().getInformations().add(newElement);
	}
}

