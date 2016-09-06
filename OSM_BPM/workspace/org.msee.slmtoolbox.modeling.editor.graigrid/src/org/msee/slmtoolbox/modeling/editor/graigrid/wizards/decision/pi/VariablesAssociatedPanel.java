package org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision.pi;

import java.util.ArrayList;
import java.util.List;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;

public class VariablesAssociatedPanel extends AbstractElementAssociatedPanel<BsmDecisionVariable> {
	
	/**
	 * Default constructor
	 */
	public VariablesAssociatedPanel(BsmAppService bsmService, BsmPerformanceIndicator bsmPi) {
		super(bsmService, bsmPi);
	}

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	@Override
	protected List<BsmDecisionVariable> getElementsUnselected() {
		List<BsmDecisionVariable> list  = new ArrayList<BsmDecisionVariable>();
		for(BsmDecisionVariable variable : getBsmPi().getDecision().getVariables()) {
			if (!getBsmPi().getVariables().contains(variable)) {
				list.add(variable);
			}
		}
		return list;
	}

	@Override
	protected List<BsmDecisionVariable> getElementsSelected() {
		return getBsmPi().getVariables();
	}

	@Override
	protected void addLink(BsmDecisionVariable elementToAdd) {
		getBsmService().addLinkPiAndVariable(this.getBsmPi(), elementToAdd);
	}

	@Override
	protected void removeLink(BsmDecisionVariable elementToRemove) {
		getBsmService().removeLinkPiAndVariable(this.getBsmPi(), elementToRemove);
	}


}
