package org.msee.slmtoolbox.modeling.editor.eaStar.util;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;

/**
 * Responsible for the connection and reconnection of Support flow
 * 
 * @author HBA6
 * 
 */
public class EaSupportFLowUtil extends EaFlowUtil {

	/**
	 * Constructor with param
	 * 
	 * @param fp
	 */
	public EaSupportFLowUtil(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * 
	 * @param source
	 * @param target
	 * @param targetAnchor
	 * @return boolean if it is allowed to connect the flow to the target
	 *         depending on target's type and flow constraints
	 */
	public boolean canCreate(EaFlowNode source, EaFlowNode target, Anchor anchor) {
		// return true if both anchors belong to an EClass
		// and those EClasses are not identical

		if (source != null && target != null && source != target) {
			if (target instanceof EaExtendedActivity)
				return anchor.isVisible();
		}

		return false;
	}

	/**
	 * 
	 * @param source
	 * @param anchor
	 * @return boolean if it is allowed to start connection or not depending on
	 *         the flow constraints
	 */
	public boolean canStartConnection(EaFlowNode source, Anchor anchor) {

		if (source instanceof EaExtendedActivity)
			return anchor.isVisible();
		else if (source instanceof EaResource)
			return true;
		return false;

	}

	@Override
	public void showSource() {
		getToolBehaviorProvider().showSupportPossibleSources();
		
	}

	@Override
	public void showTarget(EaFlowNode source) {
		getToolBehaviorProvider().showSupportPossibleTargets();
	}
	
	public void showSourceReconnect() {
		getToolBehaviorProvider().startSupportReConnectingSource();
		
	}
	
	public void showTargetReconnect(EaFlowNode source) {
		getToolBehaviorProvider().startSupportReConnectingTarget();
	}
}
