package org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;

/**
 * 
 * @author HBA6
 * this is the dialog to add resources to a process
 *
 */
public class BsmAddMseServiceToOrganizationDialog extends AbstractBsmElementDialog<BsmOrganization, BsmMseService> {
	
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
	public BsmAddMseServiceToOrganizationDialog(Shell parentShell, ILabelProvider labelProvider,
			BsmOrganization organization) {
		super(parentShell, labelProvider, organization, "String Selection", "Select a String (* = any string, ? = any char):", BsmMseService.class);
	}

	@Override
	protected List<BsmMseService> getListSource() {
		List<BsmMseService> listSource = new ArrayList<BsmMseService>();
		if(null != getElementBeCompleted()) {
			for (BsmProcess process : getElementBeCompleted().getBsmModel().getProcesses()) {
				if (null != process.getMseService()) { 
					listSource.add(process.getMseService());
				}
			}
		}
		return listSource;
	}

	@Override
	protected List<BsmMseService> getListFiltre() {
		List<BsmMseService> listFilter = new ArrayList<BsmMseService>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getMseService());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(BsmMseService newElement) {
		newElement.setOrganization(getElementBeCompleted());
		getElementBeCompleted().getMseService().add(newElement);
	}
}
