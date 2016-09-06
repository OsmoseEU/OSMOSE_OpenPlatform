package org.msee.slmtoolbox.modeling.editor.eaStar.features.flow;


import org.eclipse.graphiti.features.IFeatureProvider;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaSupportFLowUtil;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.flow.AbstractCreateEaFlowDialog;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.flow.CreateEaSupportFlowDialog;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;

/**
 * Class to create a Support flow
 * @author fto
 */
public class EaCreateSupportFlowFeature extends AbstractEaCreateConnectionFeature<EaSupportFLowUtil> {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaCreateSupportFlowFeature(IFeatureProvider fp) {
		super(fp, "Support Flow", "Create Support Flow", new EaSupportFLowUtil(fp));
	}
	
	/**
	 * Gets the create image id.
	 * 
	 * @return image for UI representation
	 */
	@Override
	public String getCreateImageId() {
		return EaImageProvider.IMG_SUPPORT_FLOW;
	}


	/**
	 * Creates a Flow between two FlowNode.
	 */
	protected AbstractCreateEaFlowDialog createFlowDialog(EaFlowNode source, EaFlowNode target) {
		return new CreateEaSupportFlowDialog(UtilsWizards.getShell(),
				findProcess(), source, target, getAppService());
	}

}