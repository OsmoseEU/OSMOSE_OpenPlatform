package org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;

public class BsmAddDecisionStructureToOrganizationDialog extends AbstractBsmElementDialog<BsmOrganization, BsmDecisionStructure> {
	
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
	public BsmAddDecisionStructureToOrganizationDialog(Shell parentShell, ILabelProvider labelProvider,
			BsmOrganization organization) {
		super(parentShell, labelProvider, organization, "String Selection", "Select a String (* = any string, ? = any char):", BsmDecisionStructure.class);
	}

	@Override
	protected List<BsmDecisionStructure> getListSource() {
		List<BsmDecisionStructure> listSource = new ArrayList<BsmDecisionStructure>();
		if(null != getElementBeCompleted()) {
			listSource.addAll(getElementBeCompleted().getBsmModel().getDecisionStructures());
		}
		return listSource;
	}

	@Override
	protected List<BsmDecisionStructure> getListFiltre() {
		List<BsmDecisionStructure> listFilter = new ArrayList<BsmDecisionStructure>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getDecisionStructures());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(BsmDecisionStructure newElement) {
		newElement.getOrganizations().add(getElementBeCompleted());
		getElementBeCompleted().getDecisionStructures().add(newElement);
	}
}

