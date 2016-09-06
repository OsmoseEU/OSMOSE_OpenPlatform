/**
 * 
 */
package org.msee.slmtoolbox.modeling.editor.eaStar.util;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaLogicalOperator;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;

/**
 * Responsible for the connection and reconnection of Control flow
 * 
 * @author HBA6
 * 
 */
public class EaControlFlowUtil extends EaFlowUtil {

	/**
	 * Constructor with param
	 * @param fp
	 */
	public EaControlFlowUtil(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * 
	 * @param source
	 * @param anchor
	 * @return boolean if it is allowed to start connection or not depending on
	 *         the flow constraints
	 */
	public boolean canStartConnection(EaFlowNode source, Anchor anchor) {
		if (source instanceof EaConnector)
			return true;
		if (source instanceof EaExtendedActivity)
			return anchor.isVisible();
		if (source instanceof EaLogicalOperator) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param source
	 * @param target
	 * @param targetAnchor
	 * @return boolean if it is allowed to connect the flow to the target
	 *         depending on target's type and flow constraints
	 */
	public boolean canCreate(EaFlowNode source, EaFlowNode target,
			Anchor targetAnchor) {
		if (source != null && target != null && source != target) {
			if (target instanceof EaExtendedActivity
					&& !(source instanceof EaResource)) {
				return targetAnchor.isVisible();
			}
		}
		return false;
	}
	
	public void showSource() {
		getToolBehaviorProvider().showControlPossibleSources();
		
	}

	public void showTarget(EaFlowNode source) {
		getToolBehaviorProvider().showControlPossibleTargets();
	}
	
	public void showSourceReconnect() {
		getToolBehaviorProvider().startControlReConnectingSource();
		
	}
	
	public void showTargetReconnect(EaFlowNode source) {
		getToolBehaviorProvider().startControlReConnectingTarget();
	}
}
