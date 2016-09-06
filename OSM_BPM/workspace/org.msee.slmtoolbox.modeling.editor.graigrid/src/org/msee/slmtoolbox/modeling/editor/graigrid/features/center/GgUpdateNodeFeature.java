package org.msee.slmtoolbox.modeling.editor.graigrid.features.center;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.MultiText;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeUpdateFeature;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;

/**
 *  Management class of the center action 
 * @author fto
 */
public class GgUpdateNodeFeature extends AbstractMseeUpdateFeature<GgAppService> {
	
	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
    public GgUpdateNodeFeature(IFeatureProvider fp) {
        super(fp);
    }

	/**
	 * Can update a center
	 * @param context for update
	 */
    public boolean canUpdate(IUpdateContext context) {
        // return true, if linked business object is a AbstractCenter
        Object bo =
            getBusinessObjectForPictogramElement(context.getPictogramElement());
        return (bo instanceof GgNode);
    }

    /**
     * If need an update
	 * @param context for update
     */
    public IReason updateNeeded(IUpdateContext context) {
        // retrieve name from pictogram model
        String pictogramName = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        if (!(pictogramElement instanceof ContainerShape) || 
        		!(pictogramElement.getGraphicsAlgorithm() instanceof RoundedRectangle)) {
        	return  Reason.createFalseReason();
        } else {
        	RoundedRectangle rectangle = (RoundedRectangle) pictogramElement.getGraphicsAlgorithm();
            for (GraphicsAlgorithm child : rectangle.getGraphicsAlgorithmChildren()) {
                if (child instanceof MultiText) {
                	MultiText text = (MultiText) child;
                    if (null == pictogramName) {
                    	pictogramName = text.getValue();
                    }
                }
            }
        }
 
        // retrieve name from business model
        String businessName = null;
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof GgNode) {
        	GgNode center = (GgNode) bo;
            businessName = center.getName();
        }
        
        // test if need bsm update
        boolean needUpdateBsm = false;
        if (bo instanceof GgDecisionCenter) {
        	needUpdateBsm = getAppService().needUpdate((GgDecisionCenter) bo);
        }
        // update needed, if names are different
        boolean updateNameNeeded =
            ((pictogramName == null && businessName != null)
    		|| (pictogramName != null && !pictogramName.equals(businessName)));
 
        // if need bsm update and not update name
        if (needUpdateBsm && !updateNameNeeded) {
            return Reason.createTrueReason("Name is not updated with the BSM model");
        } else  if (updateNameNeeded) {
            return Reason.createTrueReason("Name is out of date");
        } else {
            return Reason.createFalseReason();
        }
    }
 
    /***
     * Update graphic element
	 * @param context for update
     */
    public boolean update(IUpdateContext context) {
        // retrieve name from business model
        String businessName = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        
        if (bo instanceof GgNode) {
        	GgNode center = (GgNode) bo;
            businessName = center.getName();
        }
        
        // Set name in pictogram model
        if (pictogramElement instanceof ContainerShape) {
        	RoundedRectangle rectangle = (RoundedRectangle) pictogramElement.getGraphicsAlgorithm();
        	if (rectangle.getGraphicsAlgorithmChildren().size()>0) {
        		GraphicsAlgorithm child = rectangle.getGraphicsAlgorithmChildren().get(0);
                if (child instanceof MultiText) {
                	MultiText text = (MultiText) child;

                    // update for DecisionCenter
                    if (bo instanceof GgDecisionCenter) {
                    	GgDecisionCenter center = (GgDecisionCenter) bo;
                    	// if need update BSM
                    	if (getAppService().needUpdate(center) 
                    			&& center.getName().equals(text.getValue())) {
                    		getAppService().updateGg(center);
                    	} else {
                    		getAppService().updateBsm(center);
                    	}
                    }
                    text.setValue(businessName);
                }
            }
        }
        
        return false;
    }
    
}

 

