package org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;

/**
 * 
 * @author HBA6
 * this is the dialog to add resources to a process
 *
 */
public class BsmAddPartnerToServiceDialog extends AbstractBsmElementDialog<BsmService, BsmPartner> {
	
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
	public BsmAddPartnerToServiceDialog(Shell parentShell, ILabelProvider labelProvider,
			BsmService bsmService) {
		super(parentShell, labelProvider, bsmService, "String Selection", "Select a String (* = any string, ? = any char):", BsmPartner.class);
	}

	@Override
	protected List<BsmPartner> getListSource() {
		List<BsmPartner> listSource = new ArrayList<BsmPartner>();
		if(null != getElementBeCompleted()) {
			listSource.addAll(getElementBeCompleted().getBsmModel().getPartners());
		}
		return listSource;
	}

	@Override
	protected List<BsmPartner> getListFiltre() {
		List<BsmPartner> listFilter = new ArrayList<BsmPartner>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getPartners());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(BsmPartner newElement) {
		getElementBeCompleted().getPartners().add(newElement);
	}
}
