package org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmValue;

/**
 * 
 * @author HBA6
 * this is the dialog to add resources to a process
 *
 */
public class BsmAddValueToServiceDialog extends AbstractBsmElementDialog<BsmService, BsmValue> {
	
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
	public BsmAddValueToServiceDialog(Shell parentShell, ILabelProvider labelProvider,
			BsmService bsmService) {
		super(parentShell, labelProvider, bsmService, "String Selection", "Select a String (* = any string, ? = any char):", BsmValue.class);
	}

	@Override
	protected List<BsmValue> getListSource() {
		List<BsmValue> listSource = new ArrayList<BsmValue>();
		if(null != getElementBeCompleted()) {
			listSource.addAll(getElementBeCompleted().getBsmModel().getValues());
		}
		return listSource;
	}

	@Override
	protected List<BsmValue> getListFiltre() {
		List<BsmValue> listFilter = new ArrayList<BsmValue>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getValues());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(BsmValue newElement) {
		newElement.setService(getElementBeCompleted());
		getElementBeCompleted().getValues().add(newElement);
	}
}
