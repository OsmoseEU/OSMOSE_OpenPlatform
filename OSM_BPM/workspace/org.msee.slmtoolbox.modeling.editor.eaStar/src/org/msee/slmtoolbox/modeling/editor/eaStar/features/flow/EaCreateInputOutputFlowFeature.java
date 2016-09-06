package org.msee.slmtoolbox.modeling.editor.eaStar.features.flow;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaInputOutputFlowUtil;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.flow.AbstractCreateEaFlowDialog;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.flow.CreateEaOutputInputFlowDialog;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;

/**
 * Class to create a InputOutput flow
 * @author fto
 */
public class EaCreateInputOutputFlowFeature extends AbstractEaCreateConnectionFeature<EaInputOutputFlowUtil> {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaCreateInputOutputFlowFeature(IFeatureProvider fp) {
		super(fp, "InputOutPut Flow", "Create InputOutput Flow", new EaInputOutputFlowUtil(fp));
	}
	
	/**
	 * Gets the create image id.
	 * 
	 * @return image for UI representation
	 */
	@Override
	public String getCreateImageId() {
		return EaImageProvider.IMG_INPUT_OUTPUT_FLOW;
	}

	/**
	 * Creates a Flow between two FlowNode.
	 */
	protected AbstractCreateEaFlowDialog createFlowDialog(EaFlowNode source, EaFlowNode target) {
		return new CreateEaOutputInputFlowDialog(UtilsWizards.getShell(),
				findProcess(), source, target, getAppService());
	}
}