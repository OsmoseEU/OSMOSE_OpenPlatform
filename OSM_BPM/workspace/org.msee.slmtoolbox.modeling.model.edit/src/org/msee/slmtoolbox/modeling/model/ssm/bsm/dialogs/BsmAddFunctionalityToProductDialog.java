package org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct;

/**
 * 
 * @author HBA6
 * this is the dialog to add resources to a process
 *
 */
public class BsmAddFunctionalityToProductDialog extends AbstractBsmElementDialog<BsmProduct, BsmFunctionality> {
	
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
	public BsmAddFunctionalityToProductDialog(Shell parentShell, ILabelProvider labelProvider,
			BsmProduct bsmProduct) {
		super(parentShell, labelProvider, bsmProduct, "String Selection", "Select a String (* = any string, ? = any char):", BsmFunctionality.class);
	}

	@Override
	protected List<BsmFunctionality> getListSource() {
		List<BsmFunctionality> listSource = new ArrayList<BsmFunctionality>();
		
		if(null != getElementBeCompleted()) {	
			
				listSource.addAll(getElementBeCompleted().getBsmModel().getFunctionalities());
				
			}
		
		return listSource;
	}

	@Override
	protected List<BsmFunctionality> getListFiltre() {
		List<BsmFunctionality> listFilter = new ArrayList<BsmFunctionality>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getFunctionalities());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(BsmFunctionality newElement) {
		newElement.setProduct(getElementBeCompleted());
		getElementBeCompleted().getFunctionalities().add(newElement);
	}
}
