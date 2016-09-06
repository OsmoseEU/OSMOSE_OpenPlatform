package org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet;

public class TimAddRelationShipInToEntityDialog extends AbstractTimElementDialog<TimInformationEntity, TimInformationRelationship> {
	
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
	public TimAddRelationShipInToEntityDialog(Shell parentShell, ILabelProvider labelProvider,
			TimInformationEntity elementBeCompleted) {
		super(parentShell, labelProvider, elementBeCompleted, "String Selection", "Select a String (* = any string, ? = any char):", TimInformationRelationship.class);
	}

	@Override
	protected List<TimInformationRelationship> getListSource() {
		List<TimInformationRelationship> listSource = new ArrayList<TimInformationRelationship>();
		if(null != getElementBeCompleted() && null != getElementBeCompleted().getInformation()) {
			for (TimInformationSet information : getElementBeCompleted().getInformation().getModel().getInformations()) {
				listSource.addAll(information.getRelationships());
			}
		}
		return listSource;
	}

	@Override
	protected List<TimInformationRelationship> getListFiltre() {
		List<TimInformationRelationship> listFilter = new ArrayList<TimInformationRelationship>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getInRelations());
			listFilter.addAll(getElementBeCompleted().getOutRelations());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(TimInformationRelationship newElement) {
		newElement.setTargetEntity(getElementBeCompleted());
		getElementBeCompleted().getInRelations().add(newElement);
	}
}