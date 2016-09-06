package org.msee.slmtoolbox.modeling.editor.eaStar.features.flow;


import org.eclipse.graphiti.features.IFeatureProvider;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaControlFlowUtil;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.flow.AbstractCreateEaFlowDialog;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.flow.CreateEaControlFlowDialog;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;

/**
 * Class to create a Control flow
 * @author fto
 */
public class EaCreateControlFlowFeature extends AbstractEaCreateConnectionFeature<EaControlFlowUtil> {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaCreateControlFlowFeature(IFeatureProvider fp) {
		super(fp, "Control Flow", "Create Control Flow", new EaControlFlowUtil(fp));
	}
	
	/**
	 * Gets the create image id.
	 * 
	 * @return image for UI representation
	 */
	@Override
	public String getCreateImageId() {
		return EaImageProvider.IMG_CONTROL_FLOW;
	}

	/**
	 * Creates a Flow between two FlowNode.
	 */
	protected AbstractCreateEaFlowDialog createFlowDialog(EaFlowNode source, EaFlowNode target) {
		return new CreateEaControlFlowDialog(UtilsWizards.getShell(),
				findProcess(), source, target, getAppService());
	}
}