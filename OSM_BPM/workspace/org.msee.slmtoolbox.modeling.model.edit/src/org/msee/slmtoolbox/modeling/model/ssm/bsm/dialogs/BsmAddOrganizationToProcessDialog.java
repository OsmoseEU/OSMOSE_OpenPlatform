package org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;

public class BsmAddOrganizationToProcessDialog extends AbstractBsmElementDialog<BsmProcess, BsmOrganization> {

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
	public BsmAddOrganizationToProcessDialog(Shell parentShell, ILabelProvider labelProvider,
			BsmProcess process) {
		super(parentShell, labelProvider, process, "String Selection", "Select a String (* = any string, ? = any char):", BsmOrganization.class);
	}

	@Override
	protected List<BsmOrganization> getListSource() {
		List<BsmOrganization> listSource = new ArrayList<BsmOrganization>();
		if(null != getElementBeCompleted()) {
			listSource.addAll(getElementBeCompleted().getBsmModel().getOrganizations());
		}
		return listSource;
	}

	@Override
	protected List<BsmOrganization> getListFiltre() {
		List<BsmOrganization> listFilter = new ArrayList<BsmOrganization>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getOrganizations());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(BsmOrganization newElement) {
		newElement.getProcesses().add(getElementBeCompleted());
		getElementBeCompleted().getOrganizations().add(newElement);
	}
}
