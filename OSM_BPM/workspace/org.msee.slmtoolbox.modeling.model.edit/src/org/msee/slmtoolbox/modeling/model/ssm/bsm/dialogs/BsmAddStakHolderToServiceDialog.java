package org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder;

/**
 * 
 * @author HBA6
 * this is the dialog to add resources to a process
 *
 */
public class BsmAddStakHolderToServiceDialog extends AbstractBsmElementDialog<BsmService, BsmStakeholder> {
	
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
	public BsmAddStakHolderToServiceDialog(Shell parentShell, ILabelProvider labelProvider,
			BsmService bsmService) {
		super(parentShell, labelProvider, bsmService, "String Selection", "Select a String (* = any string, ? = any char):", BsmStakeholder.class);
	}

	@Override
	protected List<BsmStakeholder> getListSource() {
		List<BsmStakeholder> listSource = new ArrayList<BsmStakeholder>();
		if(null != getElementBeCompleted()) {
			listSource.addAll(getElementBeCompleted().getBsmModel().getStakeholders());
		}
		return listSource;
	}

	@Override
	protected List<BsmStakeholder> getListFiltre() {
		List<BsmStakeholder> listFilter = new ArrayList<BsmStakeholder>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getStakeholders());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(BsmStakeholder newElement) {
		getElementBeCompleted().getStakeholders().add(newElement);
	}
}
