package org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;

/**
 * 
 * @author HBA6
 * this is the dialog to add resources to a process
 *
 */
public class BsmAddCustomerToServiceDialog extends AbstractBsmElementDialog<BsmService, BsmCustomer> {
	
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
	public BsmAddCustomerToServiceDialog(Shell parentShell, ILabelProvider labelProvider,
			BsmService bsmService) {
		super(parentShell, labelProvider, bsmService, "String Selection", "Select a String (* = any string, ? = any char):", BsmCustomer.class);
	}

	@Override
	protected List<BsmCustomer> getListSource() {
		List<BsmCustomer> listSource = new ArrayList<BsmCustomer>();
		if(null != getElementBeCompleted()) {
			listSource.addAll(getElementBeCompleted().getBsmModel().getCustomers());
		}
		return listSource;
	}

	@Override
	protected List<BsmCustomer> getListFiltre() {
		List<BsmCustomer> listFilter = new ArrayList<BsmCustomer>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getCustomers());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(BsmCustomer newElement) {
		getElementBeCompleted().getCustomers().add(newElement);
	}
}
