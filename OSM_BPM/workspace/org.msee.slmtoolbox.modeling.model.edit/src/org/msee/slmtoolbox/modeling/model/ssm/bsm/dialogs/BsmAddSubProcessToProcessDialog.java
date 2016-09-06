package org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;


/**
 * Dialog for create a ProcessConnector
 * 
 * @author fto
 * 
 */
public class BsmAddSubProcessToProcessDialog extends AbstractBsmElementDialog<BsmProcess, BsmProcess> {
	
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
	public BsmAddSubProcessToProcessDialog(Shell parentShell, ILabelProvider labelProvider,
			BsmProcess process) {
		super(parentShell, labelProvider, process, "String Selection", "Select a String (* = any string, ? = any char):", BsmProcess.class);
	}

	@Override
	protected List<BsmProcess> getListSource() {
		List<BsmProcess> listSource = new ArrayList<BsmProcess>();
		if(null != getElementBeCompleted()) {
			listSource.addAll(getElementBeCompleted().getBsmModel().getProcesses());
		}
		return listSource;
	}

	@Override
	protected List<BsmProcess> getListFiltre() {
		List<BsmProcess> listFilter = new ArrayList<BsmProcess>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getSubProcess());
			listFilter.add(getElementBeCompleted());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(BsmProcess newElement) {
		newElement.setMainProcess(newElement);
		getElementBeCompleted().getSubProcess().add(newElement);
	}
}
