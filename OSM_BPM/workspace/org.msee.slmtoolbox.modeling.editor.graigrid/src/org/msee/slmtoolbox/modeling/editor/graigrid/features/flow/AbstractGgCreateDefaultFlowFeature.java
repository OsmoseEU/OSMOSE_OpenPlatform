package org.msee.slmtoolbox.modeling.editor.graigrid.features.flow;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.AbstractGgCreateConnectionFeature;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;

/**
 *  Abstract management class of the create flow action 
 * @author fto
 */
public abstract class AbstractGgCreateDefaultFlowFeature extends AbstractGgCreateConnectionFeature {

	/**
	 * Construct with param
	 * @param fp			grai grid feature provider
	 * @param name			menu entry name
	 * @param description	menu entry tooltip
	 */
	public AbstractGgCreateDefaultFlowFeature(IFeatureProvider fp, String name,
			String description) {
		super(fp, name, description);
	}

	/**
	 * Can start a connection for a Decision Frame
	 * @param context for create
	 */
    public boolean canStartConnection(ICreateConnectionContext context) {
        // return true if start anchor belongs to a AbstractCenter
        if (getCenter(context.getSourceAnchor()) != null) {
            return true;
        }
        return false;
    }

	/**
	 * Can create a Decision Frame
	 * @param context for create
	 */
    public boolean canCreate(ICreateConnectionContext context) {
        // return true if both anchors belong to an AbstractCenter
        // and those AbstractCenter are not identical
    	GgNode source = getCenter(context.getSourceAnchor());
    	GgNode target = getCenter(context.getTargetAnchor());
        if (source != null && target != null && source != target) {
            return true;
        }
        return false;
    }

    
    /**
     * Returns the AbstractCenter belonging to the anchor, or null if not available.
     */
    protected GgNode getCenter(Anchor anchor) {
        if (anchor != null) {
            Object object = getBusinessObjectForPictogramElement(anchor.getParent());
            if (object instanceof GgNode) {
                return (GgNode) object;
            }
        }
        return null;
    }
 
    /**
     * Returns the DecisionCenter belonging to the anchor, or null if not available.
     */
    protected GgDecisionCenter getDecisionCenter(Anchor anchor) {
        if (anchor != null) {
            Object object = getBusinessObjectForPictogramElement(anchor.getParent());
            if (object instanceof GgDecisionCenter) {
                return (GgDecisionCenter) object;
            }
        }
        return null;
    }

	/**
	 * Create a flow
	 * @param context for create
	 */
    public Connection create(ICreateConnectionContext context) {
        Connection newConnection = null;
 
        // get AbstractCenter which should be connected
        GgNode source = getCenter(context.getSourceAnchor());
        GgNode target = getCenter(context.getTargetAnchor());
 
        if (source != null && target != null) {
            // create new business object
        	GgFlow flow = createFlow(source, target);

            // add connection for business object
            AddConnectionContext addContext = new AddConnectionContext(context.getSourceAnchor(), context.getTargetAnchor());
            addContext.setNewObject(flow);
            newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
        }
       
        return newConnection;
    }

    
    /**
    * Creates a EReference between two EClasses.
    */
    abstract protected GgFlow createFlow(GgNode source, GgNode target);
}
