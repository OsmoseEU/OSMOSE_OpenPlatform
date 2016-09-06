package org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;

/**
 * Decisions Variable panel
 * @author fto
 *
 */
public class VariablePanel extends AbstractElementPanel<BsmDecisionVariable> {

	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/**
	 * Default Constructor
	 * @param appService		Graigrid service
	 * @param elements			Graigrid decision
	 */
	public VariablePanel(GgAppService appService, GgDecisionCenter center) {
		super(appService, center, "Decisions Variables");
		setElements(getBsmService().findVariables(center));
	}

	@Override
	protected BsmDecisionVariable addElement() { 
		return getBsmService().createDecisionVariable(getDecision());
	}

	@Override
	protected void deleteElement(BsmDecisionVariable deleteElement) {
		getBsmService().removeVariable(getDecision(), deleteElement);
	}
	
	/**
	 * Update element selected
	 * @param updateElement		element selected
	 */
	protected void updateElement(BsmDecisionVariable updateElement) {
		// update valeur
		updateElement.setName(getJtextName().getText());
		updateElement.setDescription(getJtextDescription().getText());
		// update file
		getBsmService().updateVariable(getDecision(), updateElement);
		
	}
	
	/**
	 * Update data in informations part
	 */
	public void updateDataInformations() {
		super.updateDataInformations();
		BsmDecisionVariable elementSelect = (BsmDecisionVariable) getJlistElements().getSelectedValue();
		if (null != elementSelect) {
			this.getJtextDescription().setText(elementSelect.getDescription());
		} else {
			this.getJtextDescription().setText("");
		}
	}

	@Override
	public void setDecision(GgDecisionCenter decision) {
		setElements(getBsmService().findVariables(decision));
	}
	
}
