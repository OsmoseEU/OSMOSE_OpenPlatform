package org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVirtualEnterprise;

public class BsmAddVeParticipationToEnterpriseDialog extends AbstractBsmElementDialog<BsmEnterprise, BsmVEParticipation> {
	
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
	public BsmAddVeParticipationToEnterpriseDialog(Shell parentShell, ILabelProvider labelProvider,
			BsmEnterprise bsmEnterprise) {
		super(parentShell, labelProvider, bsmEnterprise, "String Selection", "Select a String (* = any string, ? = any char):", BsmVEParticipation.class);
	}

	@Override
	protected List<BsmVEParticipation> getListSource() {
		List<BsmVEParticipation> listSource = new ArrayList<BsmVEParticipation>();
		if(null != getElementBeCompleted()) {
			for (BsmOrganization organization :getElementBeCompleted().getBsmModel().getOrganizations()) {
				if (organization instanceof BsmVirtualEnterprise) {
					listSource.addAll(((BsmVirtualEnterprise)organization).getVeParticipations());
				}
			}
		}
		return listSource;
	}

	@Override
	protected List<BsmVEParticipation> getListFiltre() {
		List<BsmVEParticipation> listFilter = new ArrayList<BsmVEParticipation>();
		if(null != getElementBeCompleted()) {
			listFilter.addAll(getElementBeCompleted().getVeParticipations());
		}
		return listFilter;
	}

	@Override
	protected void addNewElementToElementTarget(BsmVEParticipation newElement) {
		newElement.setEnterprise(getElementBeCompleted());
		getElementBeCompleted().getVeParticipations().add(newElement);
	}
}