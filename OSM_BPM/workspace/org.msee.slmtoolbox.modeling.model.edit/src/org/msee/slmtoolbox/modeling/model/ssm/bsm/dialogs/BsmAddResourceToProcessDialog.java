package org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;

/**
 * 
 * @author HBA6
 * this is the dialog to add resources to a process
 *
 */
public class BsmAddResourceToProcessDialog extends AbstractBsmElementDialog<BsmProcess, BsmResource> {
	
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
	public BsmAddResourceToProcessDialog(Shell parentShell, ILabelProvider labelProvider,
			BsmProcess process) {
		super(parentShell, labelProvider, process, "String Selection", "Select a String (* = any string, ? = any char):", BsmResource.class);
	}

	@Override
	protected List<BsmResource> getListSource() {
		List<BsmResource> listSource = new ArrayList<BsmResource>();
		if(null != getElementBeCompleted()
				&& null != getElementBeCompleted().getOrganizations()) {
			for (BsmOrganization organization : getElementBeCompleted().getOrganizations()) {
				if (organization instanceof BsmEnterprise)
				listSource.addAll(((BsmEnterprise)organization).getResources());
			}
		}
		return listSource;
	}

	@Override
	protected List<BsmResource> getListFiltre() {
		List<BsmResource> listFilter = new ArrayList<BsmResource>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getResources());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(BsmResource newElement) {
		newElement.getProcesses().add(getElementBeCompleted());
		getElementBeCompleted().getResources().add(newElement);
	}
}
