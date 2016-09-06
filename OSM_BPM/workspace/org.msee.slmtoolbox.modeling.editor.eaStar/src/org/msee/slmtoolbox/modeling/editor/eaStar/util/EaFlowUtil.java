package org.msee.slmtoolbox.modeling.editor.eaStar.util;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.msee.slmtoolbox.modeling.editor.eaStar.diagram.EaToolBehaviorProvider;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;

public abstract class EaFlowUtil {

	private IFeatureProvider fp;

	/**
	 * Constructor with param
	 * 
	 * @param fp
	 */
	public EaFlowUtil(IFeatureProvider fp) {
		this.fp = fp;
	}
	
	/**
	 * @return the toolBehaviorProvider
	 */
	protected EaToolBehaviorProvider getToolBehaviorProvider() {
		return (EaToolBehaviorProvider) fp.getDiagramTypeProvider().getCurrentToolBehaviorProvider();
	}

	/**
	 * 
	 * @param source
	 * @param anchor
	 * @return boolean if it is allowed to start connection or not depending on
	 *         the flow constraints
	 */
	public abstract boolean canStartConnection(EaFlowNode source, Anchor anchor);

	/**
	 * 
	 * @param source
	 * @param target
	 * @param targetAnchor
	 * @return boolean if it is allowed to connect the flow to the target
	 *         depending on target's type and flow constraints
	 */
	public abstract boolean canCreate(EaFlowNode source, EaFlowNode target,
			Anchor targetAnchor);
	
	public abstract void showSource();
	
	public abstract void showTarget(EaFlowNode source);
	
	public abstract void showSourceReconnect();
	
	public abstract void showTargetReconnect(EaFlowNode source);
}
