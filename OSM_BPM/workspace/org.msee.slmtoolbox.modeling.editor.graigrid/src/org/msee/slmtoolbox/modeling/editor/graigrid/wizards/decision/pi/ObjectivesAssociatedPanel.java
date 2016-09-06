package org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision.pi;

import java.util.ArrayList;
import java.util.List;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;

public class ObjectivesAssociatedPanel extends AbstractElementAssociatedPanel<BsmDecisionObjective> {
	
	/**
	 * Default constructor
	 */
	public ObjectivesAssociatedPanel(BsmAppService bsmService, BsmPerformanceIndicator bsmPi) {
		super(bsmService, bsmPi);
	}

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	@Override
	protected List<BsmDecisionObjective> getElementsUnselected() {
		List<BsmDecisionObjective> list  = new ArrayList<BsmDecisionObjective>();
		for(BsmDecisionObjective objective : getBsmPi().getDecision().getObjectives()) {
			if (!getBsmPi().getObjectives().contains(objective)) {
				list.add(objective);
			}
		}
		return list;
	}

	@Override
	protected List<BsmDecisionObjective> getElementsSelected() {
		return getBsmPi().getObjectives();
	}

	
	@Override
	protected void addLink(BsmDecisionObjective elementToAdd) {
		getBsmService().addLinkPiAndObjective(this.getBsmPi(), elementToAdd);
	}

	@Override
	protected void removeLink(BsmDecisionObjective elementToRemove) {
		getBsmService().removeLinkPiAndObjective(this.getBsmPi(), elementToRemove);
	}

}
