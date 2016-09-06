/**
 * 
 */
package org.msee.slmtoolbox.modeling.editor.graigrid.features.flow;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeReconnectFeature;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow;

/**
 *  Management class of the reconnect Decision Frame action 
 * @author FTO
 */
public class GgReconnectFlowForDecisionCenterFeature
		extends
		AbstractMseeReconnectFeature<GgFlow, GgDecisionCenter> {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature sprovider
	 */
	public GgReconnectFlowForDecisionCenterFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Define if can reconnect a connector's source
	 * @param context 	of reconnect
	 * @param oldNode 	object business of old node of connector's source
	 * @param flow		object business connector
	 * @param newNode 	object business of new node of connector's source
	 * @return if can
	 */
	@Override
	protected boolean canSourceReconnection(IReconnectionContext context, GgDecisionCenter oldNode,
			GgFlow flow, GgDecisionCenter newNode) {
		return !flow.getTarget().equals(newNode);
	}

	/**
	 * Define if can reconnect a connector's target
	 * @param context 	of reconnect
	 * @param oldNode 	object business of old node of connector's target
	 * @param flow		object business connector
	 * @param newNode 	object business of new node of connector's target
	 * @return if can
	 */
	@Override
	protected boolean canTargetReconnection(IReconnectionContext context, GgDecisionCenter oldNode,
			GgFlow flow, GgDecisionCenter newNode) {
		return !flow.getSource().equals(newNode);
	}
	
	/**
	 * Reconnect a connector's source
	 * @param context 	of reconnect
	 * @param oldNode 	object business of old node of connector's source
	 * @param flow		object business connector
	 * @param newNode 	object business of new node of connector's source
	 */
	@Override
	protected void reconnectSource(IReconnectionContext context, GgDecisionCenter oldNode,
			GgFlow flow, GgDecisionCenter newNode) {
		oldNode.getInFlows().remove(flow);
		flow.setSource(newNode);
		newNode.getInFlows().add(flow);
	}
	
	/**
	 * Reconnect a connector's target
	 * @param context 	of reconnect
	 * @param oldNode 	object business of old node of connector's target
	 * @param flow		object business connector
	 * @param newNode 	object business of new node of connector's target
	 */
	@Override
	protected void reconnectTarget(IReconnectionContext context, GgDecisionCenter oldNode,
			GgFlow flow, GgDecisionCenter newNode) {
		oldNode.getOutFlows().remove(flow);
		flow.setTarget(newNode);
		newNode.getOutFlows().add(flow);
	}
}
