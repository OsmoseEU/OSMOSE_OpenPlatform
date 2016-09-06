package org.msee.slmtoolbox.modeling.editor.eaStar.features.flow;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.context.impl.ReconnectionContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.msee.slmtoolbox.modeling.editor.eaStar.diagram.EaToolBehaviorProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaFlowUtil;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeReconnectFeature;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;

/**
 *  Abstract management class of the reconnect EAStar Flow action 
 * @author FTO
 */
public abstract class AbstractEaReconnectFeature<U extends EaFlowUtil> extends AbstractMseeReconnectFeature<EaFlow, EaFlowNode> {
	
	/** Class util for reconnect a EAStar flow*/
	private U flowUtil;

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public AbstractEaReconnectFeature(IFeatureProvider fp, U connectUtil) {
		super(fp);
		this.flowUtil = connectUtil;
	}

	/**
	 * @return the flowUtil
	 */
	protected U getFlowUtil() {
		return flowUtil;
	}
	
	/**
	 * action when canceled reconnect
	 * @param context 	of reconnect
	 */
	@Override
	public void canceledReconnect(IReconnectionContext context) {
		getToolBehaviorProvider().endReConnecting();
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
	protected boolean canSourceReconnection(IReconnectionContext context, EaFlowNode oldNode,
			EaFlow flow, EaFlowNode newNode) {
		return !flow.getTarget().equals(newNode)
				&& this.getFlowUtil().canStartConnection(newNode, context.getNewAnchor());
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
	protected boolean canTargetReconnection(IReconnectionContext context, EaFlowNode oldNode,
			EaFlow flow, EaFlowNode newNode) {
		return !flow.getSource().equals(newNode)
				&& this.getFlowUtil().canCreate(oldNode, newNode, context.getNewAnchor());
	}
	
	/**
	 * Reconnect a connector's source
	 * @param context 	of reconnect
	 * @param oldNode 	object business of old node of connector's source
	 * @param flow		object business connector
	 * @param newNode 	object business of new node of connector's source
	 */
	@Override
	protected void reconnectSource(IReconnectionContext context, EaFlowNode oldNode, EaFlow flow,
			EaFlowNode newNode) {
		flow.setSource(newNode);
		getToolBehaviorProvider().endReConnecting();
	}

	/**
	 * Reconnect a connector's target
	 * @param context 	of reconnect
	 * @param oldNode 	object business of old node of connector's target
	 * @param flow		object business connector
	 * @param newNode 	object business of new node of connector's target
	 */
	@Override
	protected void reconnectTarget(IReconnectionContext context, EaFlowNode oldNode, EaFlow flow,
			EaFlowNode newNode) {
		flow.setTarget(newNode);
		getToolBehaviorProvider().endReConnecting();
	}


	/**
	 * Define if can reconnect a EAStar Flow
	 * @param context of reconnect
	 */
	public boolean canReconnect (IReconnectionContext context)	{
		// display a graphical element for reconnection a flow (source or target)
		if (context.getReconnectType().equals(ReconnectionContext.RECONNECT_SOURCE)) {
			getFlowUtil().showSourceReconnect();
		} else {
			getFlowUtil().showTargetReconnect(getFlowNode(context.getConnection().getStart()));
		}
		return super.canReconnect(context);
	}

	/**
	 * Returns the FlowNode belonging to the anchor, or null if not available.
	 */
	protected EaFlowNode getFlowNode(Anchor anchor) {
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor.getParent());
			if (object instanceof EaFlowNode) {
				return (EaFlowNode) object;
			}
		}
		return null;
	}
	
	/**
	 * @return the toolBehaviorProvider
	 */
	private EaToolBehaviorProvider getToolBehaviorProvider() {
		return (EaToolBehaviorProvider) getFeatureProvider().getDiagramTypeProvider().getCurrentToolBehaviorProvider();
	}

}
