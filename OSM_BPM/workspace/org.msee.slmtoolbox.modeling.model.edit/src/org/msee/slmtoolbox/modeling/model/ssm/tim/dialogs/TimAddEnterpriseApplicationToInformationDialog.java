package org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet;

public class TimAddEnterpriseApplicationToInformationDialog  extends AbstractTimElementDialog<TimInformationSet, TimEnterpriseApplicationResource> {
	
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
	public TimAddEnterpriseApplicationToInformationDialog(Shell parentShell, ILabelProvider labelProvider,
			TimInformationSet elementBeCompleted) {
		super(parentShell, labelProvider, elementBeCompleted, "String Selection", "Select a String (* = any string, ? = any char):", TimEnterpriseApplicationResource.class);
	}

	@Override
	protected List<TimEnterpriseApplicationResource> getListSource() {
		List<TimEnterpriseApplicationResource> listSource = new ArrayList<TimEnterpriseApplicationResource>();
		if(null != getElementBeCompleted() && null != getElementBeCompleted().getModel()) {
			for (TimResource resource : getElementBeCompleted().getModel().getResources()) {
				if (resource instanceof TimEnterpriseApplicationResource) {
					listSource.add((TimEnterpriseApplicationResource) resource);
				}
			}
		}
		return listSource;
	}

	@Override
	protected List<TimEnterpriseApplicationResource> getListFiltre() {
		List<TimEnterpriseApplicationResource> listFilter = new ArrayList<TimEnterpriseApplicationResource>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getEntrepriseApplications());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(TimEnterpriseApplicationResource newElement) {
		newElement.getInformations().add(getElementBeCompleted());
		getElementBeCompleted().getEntrepriseApplications().add(newElement);
	}
}
