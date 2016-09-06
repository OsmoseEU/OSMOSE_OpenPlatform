package org.msee.slmtoolbox.modeling.editor.graigrid.features.flow;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.msee.slmtoolbox.modeling.editor.graigrid.GraiGridImageProvider;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.PropertiesGraiGrid.DecisionFrameProperties;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;

/**
 *  Management class of the create Decision Frame action 
 * @author fto
 */
public class GgCreateDecisionFrameFeature extends AbstractGgCreateDefaultFlowFeature {
	
	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
    public GgCreateDecisionFrameFeature (IFeatureProvider fp) {
    	// provide name and description for the UI, e.g. the palette
        super(fp, DecisionFrameProperties.MENU_ENTRY_NAME, DecisionFrameProperties.MENU_ENTRY_TOOLTIP);
    }
    
	/**
	 * get the menu entry image key in GraiGridImageProvider
	 */
	public String getCreateImageId() {
		return GraiGridImageProvider.IMG_16_DECISION_FRAME;
	}

	/**
	 * Can create a Decision Frame
	 * @param context for create
	 */
    public boolean canCreate(ICreateConnectionContext context) {
        // return true if both anchors belong to an AbstractCenter
        // and those AbstractCenter are not identical
    	GgDecisionCenter source = getDecisionCenter(context.getSourceAnchor());
    	GgDecisionCenter target = getDecisionCenter(context.getTargetAnchor());
        if (source != null && target != null && source != target) {
            return true;
        }
        return false;
    }

	/**
	 * Can start a connection for a Decision Frame
	 * @param context for create
	 */
    public boolean canStartConnection(ICreateConnectionContext context) {
        // return true if start anchor belongs to a AbstractCenter
        if (getDecisionCenter(context.getSourceAnchor()) != null) {
            return true;
        }
        return false;
    }
 
    /**
    * Creates a EReference between two EClasses.
    */
    protected GgFlow createFlow(GgNode source, GgNode target) {
    	return getAppService().createDecisionFrame(source, target);
    }
}