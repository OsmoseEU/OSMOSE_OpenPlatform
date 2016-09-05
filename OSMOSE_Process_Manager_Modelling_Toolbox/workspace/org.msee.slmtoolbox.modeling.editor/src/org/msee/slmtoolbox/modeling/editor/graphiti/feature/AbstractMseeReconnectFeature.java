/**
 * 
 */
package org.msee.slmtoolbox.modeling.editor.graphiti.feature;


import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IReconnectionContext;
import org.eclipse.graphiti.features.context.impl.ReconnectionContext;
import org.eclipse.graphiti.features.impl.DefaultReconnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;

/**
 * 
 * abstract class to reconnect a MSeE feature
 * @author fto
 *
 * @param <T> Flow's Class
 * @param <N> Node's Class
 */
public abstract class AbstractMseeReconnectFeature<F,N> extends DefaultReconnectionFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public AbstractMseeReconnectFeature(IFeatureProvider fp) {
		super(fp);	
	}
	
	/**
	 * Define if can reconnect
	 * @param context of reconnect
	 */
	@Override
	@SuppressWarnings("unchecked")
	public boolean canReconnect (IReconnectionContext context)	{
		// vérify if all element are good object
		try {
			// flow must be type F
			F flow = (F) getBusinessObjectForPictogramElement(context
					.getConnection());
			Anchor newAnchor = context.getNewAnchor();
			if (null == newAnchor || null == newAnchor.getParent()) {
				return false;
			}
			// newNode must be type N
			N newNode = (N) getBusinessObjectForPictogramElement(newAnchor
					.getParent());
			Anchor oldAnchor = context.getOldAnchor();
			if (null == oldAnchor || null == oldAnchor.getParent()) {
				return false;
			}
			// oldNode must be type N
			N oldNode = (N) getBusinessObjectForPictogramElement(oldAnchor
					.getParent());

			// node can be old an new
			if (oldNode.equals(newNode)) {
				return false;
			} else if (context.getReconnectType().equals(
					ReconnectionContext.RECONNECT_SOURCE)) {
				return canSourceReconnection(context, oldNode, flow, newNode);
			} else {
				return canTargetReconnection(context, oldNode, flow, newNode);
			}
		} catch (ClassCastException e) {
			return false;
		}
	}
	
	/**
	 * Define if can reconnect a connector's source
	 * @param context 	of reconnect
	 * @param oldNode 	object business of old node of connector's source
	 * @param flow		object business connector
	 * @param newNode 	object business of new node of connector's source
	 * @return if can
	 */
	protected abstract boolean canSourceReconnection(IReconnectionContext context, N oldNode, F flow, N newNode);
	
	/**
	 * Define if can reconnect a connector's target
	 * @param context 	of reconnect
	 * @param oldNode 	object business of old node of connector's target
	 * @param flow		object business connector
	 * @param newNode 	object business of new node of connector's target
	 * @return if can
	 */
	protected abstract boolean canTargetReconnection(IReconnectionContext context, N oldNode, F flow, N newNode);
	
	/**
	 * Reconnect the objects business
	 * @param context 	for reconnect
	 */
	@Override
	@SuppressWarnings("unchecked")
	public void postReconnect(IReconnectionContext context) {
		// Reconnect Business Object
		// find BO flow
		F flow = (F) getBusinessObjectForPictogramElement(context.getConnection());
		// find BO new target
		Anchor newAnchor = context.getNewAnchor();
		N newNode = (N) getBusinessObjectForPictogramElement(newAnchor.getParent());
		// find BO old target
		Anchor oldAnchor = context.getOldAnchor();
		N oldNode = (N) getBusinessObjectForPictogramElement(oldAnchor.getParent());
		
		if (context.getReconnectType().equals(ReconnectionContext.RECONNECT_SOURCE)){
			reconnectSource(context, oldNode, flow, newNode);
		} else {
			reconnectTarget(context, oldNode, flow, newNode);
		}
		
	}
	
	/**
	 * Reconnect a connector's source
	 * @param context 	of reconnect
	 * @param oldNode 	object business of old node of connector's source
	 * @param flow		object business connector
	 * @param newNode 	object business of new node of connector's source
	 */
	protected abstract void reconnectSource(IReconnectionContext context, N oldNode, F flow, N newNode);
	
	/**
	 * Reconnect a connector's target
	 * @param context 	of reconnect
	 * @param oldNode 	object business of old node of connector's target
	 * @param flow		object business connector
	 * @param newNode 	object business of new node of connector's target
	 */
	protected abstract void reconnectTarget(IReconnectionContext context, N oldNode, F flow, N newNode);
}
