package org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;

/**
 * 
 * @author HBA6
 * this is the dialog to add resources to a process
 *
 */
public class BsmAddProductToServiceDialog extends AbstractBsmElementDialog<BsmService, BsmProduct> {
	
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
	public BsmAddProductToServiceDialog(Shell parentShell, ILabelProvider labelProvider,
			BsmService bsmService) {
		super(parentShell, labelProvider, bsmService, "String Selection", "Select a String (* = any string, ? = any char):", BsmProduct.class);
	}

	@Override
	protected List<BsmProduct> getListSource() {
		List<BsmProduct> listSource = new ArrayList<BsmProduct>();
		if(null != getElementBeCompleted()) {
			listSource.addAll(getElementBeCompleted().getBsmModel().getProducts());
		}
		return listSource;
	}

	@Override
	protected List<BsmProduct> getListFiltre() {
		List<BsmProduct> listFilter = new ArrayList<BsmProduct>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getProducts());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(BsmProduct newElement) {
		newElement.setService(getElementBeCompleted());
		getElementBeCompleted().getProducts().add(newElement);
	}
}
