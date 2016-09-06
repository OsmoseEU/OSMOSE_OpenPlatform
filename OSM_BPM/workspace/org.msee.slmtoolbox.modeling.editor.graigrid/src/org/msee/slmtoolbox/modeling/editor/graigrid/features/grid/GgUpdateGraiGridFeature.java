package org.msee.slmtoolbox.modeling.editor.graigrid.features.grid;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeUpdateFeature;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;

/**
 *  Management class of the update Graigrid 
 * @author fto
 */
public class GgUpdateGraiGridFeature extends AbstractMseeUpdateFeature<GgAppService> {
	
	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
    public GgUpdateGraiGridFeature(IFeatureProvider fp) {
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
        return (bo instanceof GgGraiGrid);
    }

    /**
     * If need an update
	 * @param context for update
     */
    public IReason updateNeeded(IUpdateContext context) {
        PictogramElement pictogramElement = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        // verify bo
        if (bo instanceof GgGraiGrid) {
        	GgGraiGrid ggGraiGrid = (GgGraiGrid) bo;
        	// verify element for update
    		if(pictogramElement.getGraphicsAlgorithm() instanceof Rectangle) {
    			Rectangle rectangle = (Rectangle) pictogramElement.getGraphicsAlgorithm();
    			// if have text
    			if (rectangle.getGraphicsAlgorithmChildren().size()>0
    					&& rectangle.getGraphicsAlgorithmChildren().get(0) instanceof AbstractText ) {
    				AbstractText text = (AbstractText) rectangle.getGraphicsAlgorithmChildren().get(0);
    				
    				 // test if need bsm update
    		        boolean needUpdateBsm = getAppService().needUpdate(ggGraiGrid);
    		        // update needed, if names are different
    		        boolean updateNameNeeded = (text.getValue() == null && ggGraiGrid.getName() != null)
    						|| (text.getValue() != null && !text.getValue().equals(ggGraiGrid.getName()));
    		        if (needUpdateBsm && !updateNameNeeded) {
    		            return Reason.createTrueReason("Name is not updated with the BSM model");
    		        } else if (updateNameNeeded) {
    					return Reason.createTrueReason("Name is out of date");
    				}
    			}
    		}
        	return Reason.createFalseReason();
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
        PictogramElement pictogramElement = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        // update data
        if (bo instanceof GgGraiGrid) {
        	GgGraiGrid grid = (GgGraiGrid) bo;
        	
        	if(pictogramElement.getGraphicsAlgorithm() instanceof Rectangle) {
    			Rectangle rectangle = (Rectangle) pictogramElement.getGraphicsAlgorithm();
    			// if have text
    			if (rectangle.getGraphicsAlgorithmChildren().size()>0
    					&& rectangle.getGraphicsAlgorithmChildren().get(0) instanceof AbstractText ) {
    				AbstractText text = (AbstractText) rectangle.getGraphicsAlgorithmChildren().get(0);
    				
		        	// if need update BSM
		        	if (getAppService().needUpdate(grid) 
		        			&& grid.getName().equals(text.getValue())) {
		        		getAppService().updateGg(grid);
		        	} else {
		        		getAppService().updateBsm(grid);
		        	}
		            text.setValue(grid.getName());
    			}
        	}
        }
        
        return false;
    }
    
}

 

