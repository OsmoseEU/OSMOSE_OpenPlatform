package org.msee.slmtoolbox.modeling.editor.graigrid.features.function;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;

/**
 *  Management class of the update InformationSource action 
 * @author fto
 */
public class GgUpdateInformationSourceFeature extends AbstractUpdateFeature {
	
	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
    public GgUpdateInformationSourceFeature(IFeatureProvider fp) {
        super(fp);
    }

	/**
	 * Can update an function
	 * @param context for update
	 */
    public boolean canUpdate(IUpdateContext context) {
        // return true, if linked business object is a EnterpriseFunction
        Object bo =
            getBusinessObjectForPictogramElement(context.getPictogramElement());
        return (bo instanceof GgInformationSource);
    }

    /**
     * If need an update
	 * @param context for update
     */
    public IReason updateNeeded(IUpdateContext context) {
        // retrieve name from pictogram model
    	String[] businessNames = {null, null};
        PictogramElement pictogramElement = context.getPictogramElement();
        if (pictogramElement instanceof ContainerShape) {
            ContainerShape cs = (ContainerShape) pictogramElement;
            for(int i = 0; i<cs.getChildren().size()-1; i++)
            {
            	if (cs.getChildren().get(i).getGraphicsAlgorithm() instanceof Text){
            	Text text = (Text)cs.getChildren().get(i).getGraphicsAlgorithm();
            	businessNames[i] = text.getValue();
            	}
            }
           
            }
        // retrieve name from business model
        String businessName = null;
        String businessCode = null;
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof GgInformationSource) {
        	GgInformationSource informationSource = (GgInformationSource) bo;
            businessName = informationSource.getName();
            businessCode = informationSource.getCode();
        }
 
        // update needed, if names are different
        boolean updateNameNeeded =
            ((businessNames[0] == null && businessName != null) 
            		|| (businessNames[1] == null && businessCode != null) 
            		|| (businessNames[0] != null && !businessNames[0] .equals(businessName))
            		|| (businessNames[1] != null && !businessNames[1] .equals(businessCode))
            		);
        if (updateNameNeeded) {
            return Reason.createTrueReason("Name or Code is out of date");
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
    	String[] businessNames = {null, null , null};
      
        PictogramElement pictogramElement = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof GgInformationSource) {
        	GgInformationSource informationSource = (GgInformationSource) bo;
            businessNames[0] = informationSource.getName();
            businessNames[1] = informationSource.getCode();   
            businessNames[2] = informationSource.getCode(); 
        }      
        // Set name in pictogram model
        if (pictogramElement instanceof ContainerShape) {
            ContainerShape cs = (ContainerShape) pictogramElement;
            for(int i = 0; i<cs.getChildren().size(); i++)
            {
            	if (cs.getChildren().get(i).getGraphicsAlgorithm() instanceof Text){
            	Text text = (Text)cs.getChildren().get(i).getGraphicsAlgorithm();
            	text.setValue(businessNames[i]);
            	}
            }
           
            }
        return false;
    }

}
