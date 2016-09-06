package org.msee.slmtoolbox.modeling.editor.graigrid.features.function;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtils;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeUpdateFeature;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;

/**
 *  Management class of the update Organization action 
 * @author fto
 */
public class GgUpdateOrganizationFeature  extends  AbstractMseeUpdateFeature<GgAppService> {
	
	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
    public GgUpdateOrganizationFeature(IFeatureProvider fp) {
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
        return (bo instanceof GgOrganization);
    }

    /**
     * If need an update
	 * @param context for update
     */
    public IReason updateNeeded(IUpdateContext context) {
        // retrieve name from pictogram model
    	String graphicName = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        if (pictogramElement instanceof ContainerShape) {
            ContainerShape cs = (ContainerShape) pictogramElement;
			for (int i = 0; i < cs.getChildren().size() - 1; i++) {
				if (cs.getChildren().get(i).getGraphicsAlgorithm() instanceof Text) {
					Text text = (Text) cs.getChildren().get(i)
							.getGraphicsAlgorithm();
					graphicName = text.getValue();
					break;
				}
			}

		}
        // retrieve name from business model
        String businessName = null;
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof GgOrganization) {
        	GgOrganization organization = (GgOrganization) bo;
            businessName = GgUtils.getNameWithCode(organization);
        }
        
        // test if need bsm update
        boolean needUpdateBsm = false;
        if (bo instanceof GgOrganization) {
        	needUpdateBsm = getAppService().needUpdate((GgOrganization) bo);
        }
 
        // update needed, if names are different
        boolean updateNameNeeded =
            ((graphicName == null && businessName != null) 
            		|| (graphicName != null && !graphicName .equals(businessName))
            		);
        
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
        if (bo instanceof GgOrganization) {
        	GgOrganization organization = (GgOrganization) bo;
            businessName = GgUtils.getNameWithCode(organization);
        }      
        // Set name in pictogram model
        if (pictogramElement instanceof ContainerShape) {
            ContainerShape cs = (ContainerShape) pictogramElement;
            for(int i = 0; i<cs.getChildren().size(); i++){
            	if (cs.getChildren().get(i).getGraphicsAlgorithm() instanceof Text){
	            	Text text = (Text)cs.getChildren().get(i).getGraphicsAlgorithm();

                    // update for GgOrganization
                    if (bo instanceof GgOrganization) {
                    	GgOrganization organization = (GgOrganization) bo;
                    	// if need update BSM
                    	if (getAppService().needUpdate(organization) 
                    			&& businessName.equals(text.getValue())) {
                    		getAppService().updateGg(organization);
                    	} else {
                    		getAppService().updateBsm(organization);
                    	}
                    }
                    text.setValue(businessName);
	                return false;
            	}
            }
        }
        return false;
    }

}
