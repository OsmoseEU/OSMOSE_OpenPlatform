package org.msee.slmtoolbox.modeling.editor.graigrid.features.level;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;



/**
 *  Management class of the update Level action 
 * @author nco
 */
public class GgUpdateLevelFeature extends AbstractUpdateFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
    public GgUpdateLevelFeature(IFeatureProvider fp) {
        super(fp);
    }

	/**
	 * Can update a level
	 * @param context for update
	 */
    public boolean canUpdate(IUpdateContext context) {
        // return true, if linked business object is a FunctionGrai
        Object bo =
            getBusinessObjectForPictogramElement(context.getPictogramElement());
        return (bo instanceof GgLevel);
    }


    /**
     * If need an update
	 * @param context for update
     */
    public IReason updateNeeded(IUpdateContext context) {
//    	return Reason.createTrueReason( " is out of date");
        // retrieve Horizon, Period and UnitTreatment from pictogram
        String pictogramHorizon = null;
        String pictogramPeriod = null;
        String pictogramUnit = null;
        String pictogramName = null;
        String pictogramCode = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        if (!(pictogramElement instanceof ContainerShape)) {
        	return  Reason.createFalseReason();
        } else {
            ContainerShape cs = (ContainerShape) pictogramElement;
            // find pictograme level name
        	if (cs.getChildren().size() > GgUtilsLevel.LEVEL_ID_NAME
        			&& cs.getChildren().get(GgUtilsLevel.LEVEL_ID_NAME).getGraphicsAlgorithm() instanceof AbstractText) {
        		pictogramName = ((AbstractText) cs.getChildren().get(GgUtilsLevel.LEVEL_ID_NAME).getGraphicsAlgorithm()).getValue();
        	}
            // find pictograme level code
        	if (cs.getChildren().size() > GgUtilsLevel.LEVEL_ID_CODE
        			&& cs.getChildren().get(GgUtilsLevel.LEVEL_ID_CODE).getGraphicsAlgorithm() instanceof AbstractText) {
        		pictogramCode = ((AbstractText) cs.getChildren().get(GgUtilsLevel.LEVEL_ID_CODE).getGraphicsAlgorithm()).getValue();
        	}
            // find pictograme level horizon
        	if (cs.getChildren().size() > GgUtilsLevel.LEVEL_ID_HORIZON
        			&& cs.getChildren().get(GgUtilsLevel.LEVEL_ID_HORIZON).getGraphicsAlgorithm() instanceof AbstractText) {
        		pictogramHorizon = ((AbstractText) cs.getChildren().get(GgUtilsLevel.LEVEL_ID_HORIZON).getGraphicsAlgorithm()).getValue();
        	}
            // find pictograme level period
        	if (cs.getChildren().size() > GgUtilsLevel.LEVEL_ID_PERIOD
        			&& cs.getChildren().get(GgUtilsLevel.LEVEL_ID_PERIOD).getGraphicsAlgorithm() instanceof AbstractText) {
        		pictogramPeriod = ((AbstractText) cs.getChildren().get(GgUtilsLevel.LEVEL_ID_PERIOD).getGraphicsAlgorithm()).getValue();
        	}
            // find pictograme level period
        	if (cs.getChildren().size() > GgUtilsLevel.LEVEL_ID_UNIT
        			&& cs.getChildren().get(GgUtilsLevel.LEVEL_ID_UNIT).getGraphicsAlgorithm() instanceof AbstractText) {
        		pictogramUnit = ((AbstractText) cs.getChildren().get(GgUtilsLevel.LEVEL_ID_UNIT).getGraphicsAlgorithm()).getValue();
        	}
        }
 
        // retrieve Horizon, Period and UnitTreatment from business model
        String nameText = null;
        String codeText = null;
        String horizonText = null;
        String periodText = null;
        String unitText = null;
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof GgLevel) {
        	nameText = ((GgLevel) bo).getName();
        	codeText = ((GgLevel) bo).getCode();
        	horizonText = GgUtilsLevel.getTextHorizon((GgLevel) bo);
        	periodText = GgUtilsLevel.getTextPeriod((GgLevel) bo);
        	unitText = GgUtilsLevel.getTextProcessingUnit((GgLevel) bo);
        }
        
        // Get fields to update list
        List<String> errorLst = new ArrayList<String>();
        if ((pictogramName == null && nameText != null) 
        		|| (pictogramName != null && !pictogramName.equals(nameText))) {
        	errorLst.add("Name");
        }
        if ((pictogramCode == null && codeText != null) 
        		|| (pictogramCode != null && !pictogramCode.equals(codeText))) {
        	errorLst.add("Code");
        }
        if ((pictogramHorizon == null && horizonText != null) 
        		|| (pictogramHorizon != null && !pictogramHorizon.equals(horizonText))) {
        	errorLst.add("Horizon");
        }
        if ((pictogramUnit == null && unitText != null) 
        		|| (pictogramUnit != null && !pictogramUnit.equals(unitText))) {
        	errorLst.add("Processing Unit");
        }
        if ((pictogramPeriod == null && periodText != null) 
        		|| (pictogramPeriod != null && !pictogramPeriod.equals(periodText))) {
        	errorLst.add("Period");
        } 
        
        if(errorLst.isEmpty()) {
        	// All fields are up to date
            return Reason.createFalseReason();        	
        } else {
        	// Construct error message
	        StringBuffer errorMsg = new StringBuffer();
	        for (int i=0; i < errorLst.size(); i++) {
	        	errorMsg.append(errorLst.get(i));
	        	if (i < errorLst.size() - 1) {
		        	errorMsg.append(", ");
	        	} else {
		        	errorMsg.append(" and ");
	        	}
	        }
	        return Reason.createTrueReason(errorMsg + " is out of date");
        }
    }

    /***
     * Update graphic element
	 * @param context for update
     */
    public boolean update(IUpdateContext context) {
        // retrieve Horizon and Period from business model
        PictogramElement pictogramElement = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        
        if (bo instanceof GgLevel) {
        	GgLevel level = (GgLevel) bo;
        	
             if (pictogramElement instanceof ContainerShape) {
                 ContainerShape cs = (ContainerShape) pictogramElement;
                 IGaService gaService = Graphiti.getGaService();
                 // find pictograme level name
             	if (cs.getChildren().size() > GgUtilsLevel.LEVEL_ID_NAME
             			&& cs.getChildren().get(GgUtilsLevel.LEVEL_ID_NAME).getGraphicsAlgorithm() instanceof AbstractText) {
             		AbstractText text = ((AbstractText) cs.getChildren().get(GgUtilsLevel.LEVEL_ID_NAME).getGraphicsAlgorithm());
             		text.setValue(level.getName());
             	}
                 // find pictograme level code
             	if (cs.getChildren().size() > GgUtilsLevel.LEVEL_ID_CODE
             			&& cs.getChildren().get(GgUtilsLevel.LEVEL_ID_CODE).getGraphicsAlgorithm() instanceof AbstractText) {
             		AbstractText text = ((AbstractText) cs.getChildren().get(GgUtilsLevel.LEVEL_ID_CODE).getGraphicsAlgorithm());
             		text.setValue(level.getCode());
             	}
                 // find pictograme level horizon
             	if (cs.getChildren().size() > GgUtilsLevel.LEVEL_ID_HORIZON
             			&& cs.getChildren().get(GgUtilsLevel.LEVEL_ID_HORIZON).getGraphicsAlgorithm() instanceof AbstractText) {
             		AbstractText text = ((AbstractText) cs.getChildren().get(GgUtilsLevel.LEVEL_ID_HORIZON).getGraphicsAlgorithm());
             		GgUtilsLevel.getLocationHorizon(gaService, level, text);
             		text.setValue(GgUtilsLevel.getTextHorizon(level));
             	}
                 // find pictograme level period
             	if (cs.getChildren().size() > GgUtilsLevel.LEVEL_ID_PERIOD
             			&& cs.getChildren().get(GgUtilsLevel.LEVEL_ID_PERIOD).getGraphicsAlgorithm() instanceof AbstractText) {
             		AbstractText text = ((AbstractText) cs.getChildren().get(GgUtilsLevel.LEVEL_ID_PERIOD).getGraphicsAlgorithm());
             		GgUtilsLevel.getLocationPeriod(gaService, level, text);
             		text.setValue(GgUtilsLevel.getTextPeriod(level));
             	}
                 // find pictograme level period
             	if (cs.getChildren().size() > GgUtilsLevel.LEVEL_ID_UNIT
             			&& cs.getChildren().get(GgUtilsLevel.LEVEL_ID_UNIT).getGraphicsAlgorithm() instanceof AbstractText) {
             		AbstractText text = ((AbstractText) cs.getChildren().get(GgUtilsLevel.LEVEL_ID_UNIT).getGraphicsAlgorithm());
             		GgUtilsLevel.getLocationProcessingUnit(gaService, level, text);
             		text.setValue(GgUtilsLevel.getTextProcessingUnit(level));
             	}
             }
        }
        return false;
    }
    
}

 

