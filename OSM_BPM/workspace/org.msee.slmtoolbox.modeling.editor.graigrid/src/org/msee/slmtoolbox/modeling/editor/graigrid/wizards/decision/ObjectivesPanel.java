package org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;

/**
 * Decisions Objectives panel
 * @author fto
 *
 */
public class ObjectivesPanel extends AbstractElementPanel<BsmDecisionObjective> {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/**
	 * Default Constructor
	 * @param appService		Graigrid service
	 * @param elements			Graigrid decision
	 */
	public ObjectivesPanel(GgAppService appService, GgDecisionCenter center) {
		super(appService, center, "Objectives");
		setElements(getBsmService().findObjectives(center));
	}

	@Override
	protected BsmDecisionObjective addElement() {
		return getBsmService().createDecisionObjective(getDecision());
	}

	@Override
	protected void deleteElement(BsmDecisionObjective deleteElement) {
		getBsmService().removeObjective(getDecision(), deleteElement);
	}
	
	/**
	 * Update element selected
	 * @param updateElement	element selected
	 */
	protected void updateElement(BsmDecisionObjective updateElement) {
		// update valeur
		updateElement.setName(getJtextName().getText());
		updateElement.setDescription(getJtextDescription().getText());
		// update file
		getBsmService().updateObjective(getDecision(), updateElement);
		
	}
	
	/**
	 * Update data in informations part
	 */
	public void updateDataInformations() {
		super.updateDataInformations();
		BsmDecisionObjective elementSelect = (BsmDecisionObjective) getJlistElements().getSelectedValue();
		if (null != elementSelect) {
			this.getJtextDescription().setText(elementSelect.getDescription());
		} else {
			this.getJtextDescription().setText("");
		}
	}

	@Override
	public void setDecision(GgDecisionCenter decision) {
		setElements(getBsmService().findObjectives(decision));
	}
	
}
