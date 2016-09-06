package org.msee.slmtoolbox.modeling.editor.eaStar.features.resource;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.ConstantesEAResource;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeUpdateFeature;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaLogicalOperator;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;
public class EaUpdateResourceFeature extends AbstractMseeUpdateFeature<EAStarAppService> {

	private static int UPDATED_WIDTH = 90;
	
	public EaUpdateResourceFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canUpdate(IUpdateContext context) {
		// return true, if linked business object is a EClass
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		return (bo instanceof EaResource || bo instanceof EaLogicalOperator);
	}

	public IReason updateNeeded(IUpdateContext context) {
		// retrieve name from pictogram model
		String pictogramName = null;
		String idIcon = null;
		boolean testIcon = true; // test icon only test update for all graphical element of Resource
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape containerShape = (ContainerShape) pictogramElement;
			if (containerShape.getChildren().size() > 0) {
				AbstractText text = (AbstractText) containerShape.getChildren().get(0).getGraphicsAlgorithm();
				pictogramName = text.getValue();
			}
			if (containerShape.getChildren().size()> ConstantesEAResource.MSE_ICON_ID) {
				Shape shape = containerShape.getChildren().get(ConstantesEAResource.MSE_ICON_ID);
				idIcon = ((Image) shape.getGraphicsAlgorithm()).getId();
			}
		} else if (pictogramElement instanceof Shape) {
			Shape shape = (Shape) pictogramElement;
			AbstractText text = (AbstractText) shape.getGraphicsAlgorithm();
			pictogramName = text.getValue();
			testIcon = false; // update for resource text only
		}
		
		// retrieve name from business model
		String businessName = null;
		boolean businessMseAsset = false;
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof EaResource) {
			EaResource eClass = (EaResource) bo;
			businessName = eClass.getName();
			businessMseAsset = null != getAppService().getMseServiceToResource(eClass);
		}
		if (bo instanceof EaLogicalOperator) {
			EaFlowNode eClass = (EaLogicalOperator)bo;
			businessName = eClass.getName();
		}
        
        // test if need bsm update
        boolean needUpdateBsm = false;
        String orgnization = null;
        if (bo instanceof EaResource) {
        	needUpdateBsm = getAppService().needUpdate((EaResource) bo);
        	orgnization = getAppService().getOrganizationNameIfnotGood((EaResource) bo);
        }
        

		// update needed, if names are different
		boolean updateNameNeeded = ((pictogramName == null && businessName != null) || (pictogramName != null && !pictogramName
				.equals(businessName)));
		
		// if need bsm update and not update name
        if (needUpdateBsm && !updateNameNeeded) {
            return Reason.createTrueReason("Name is not updated with the BSM model");
        } else if (null != orgnization && !updateNameNeeded) {
            return Reason.createTrueReason("Orgnization is out date. BSM define '" + orgnization + "' as the organization.");
        } else  if (updateNameNeeded) {
            return Reason.createTrueReason("Name is out of date");
		} else if (testIcon && (
				(null == idIcon && businessMseAsset)
				|| (null != idIcon) && (!businessMseAsset || !EaImageProvider.IMG_MSE_ASSET_PLUS.equals(idIcon)))) {
            return Reason.createTrueReason("Icon is out of date");
		} else {
			return Reason.createFalseReason();
		}
	}

	public boolean update(IUpdateContext context) {
		// retrieve name from business model
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		String businessName = ((EaFlowNode) bo).getName();

		// update pictogram element
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape containerShape = (ContainerShape) pictogramElement;
			//for text
			if (containerShape.getChildren().size() > 0 && 
					containerShape.getChildren().get(0).getGraphicsAlgorithm() instanceof AbstractText) {
				AbstractText text = (AbstractText) containerShape.getChildren().get(0).getGraphicsAlgorithm();
				 // update for EaResource
                if (bo instanceof EaResource) {
                	EaResource resource = (EaResource) bo;
                	// if need update BSM
                	if (getAppService().needUpdate(resource) 
                			&& businessName.equals(text.getValue())) {
                		getAppService().updateEa(resource);
                	} else {
                		getAppService().update(resource);
                	}
                }
                
				text.setValue(businessName);
				updateContainerWidth(businessName, containerShape, text);
			}
			// for icon
            if (bo instanceof EaResource) {
            	EaResource resource = (EaResource) bo;
            	boolean haveMseIcon = null != getAppService().getMseServiceToResource(resource);
            	if (haveMseIcon) {
        			if (containerShape.getChildren().size()> ConstantesEAResource.MSE_ICON_ID) {
        				Shape shape = containerShape.getChildren().get(ConstantesEAResource.MSE_ICON_ID);
        				((Image) shape.getGraphicsAlgorithm()).setId(EaImageProvider.IMG_MSE_ASSET_PLUS);
        				updateIconGraphics((Image) shape.getGraphicsAlgorithm());
        			} else {
        				// create image
        				IPeCreateService peCreateService = Graphiti.getPeCreateService();
        				Shape shape = peCreateService.createShape(containerShape, false);
        				
        		        IGaService gaService = Graphiti.getGaService();
        		        
//        				GraphicsAlgorithm activityGA = containerShape.getGraphicsAlgorithm();
        		    	Image img = gaService.createImage(shape, EaImageProvider.IMG_MSE_ASSET_PLUS);
        		    	gaService.setLocationAndSize(img, 
        		    			UPDATED_WIDTH - ConstantesEAResource.MSE_ICON_SIZE - ConstantesEAResource.MARGE,
        		    			ConstantesEAResource.MARGE,
        		    			ConstantesEAResource.MSE_ICON_SIZE, 
        		    			ConstantesEAResource.MSE_ICON_SIZE);
        			}
            	} else if (containerShape.getChildren().size()> ConstantesEAResource.MSE_ICON_ID) {
            		containerShape.getChildren().remove(ConstantesEAResource.MSE_ICON_ID);
            	}
			}
		}

		return false;
	}

	private void updateContainerWidth(String businessName, ContainerShape containerShape,
			AbstractText text) {
		setUpdatedWidth(businessName);
		containerShape.getGraphicsAlgorithm().setWidth(UPDATED_WIDTH);
		text.setWidth(UPDATED_WIDTH);
		Image img = (Image)containerShape.getGraphicsAlgorithm().getGraphicsAlgorithmChildren().get(0);
		img.setWidth(UPDATED_WIDTH);
	}
	
	private void updateIconGraphics(Image image){
		image.setX(UPDATED_WIDTH - ConstantesEAResource.MSE_ICON_SIZE - ConstantesEAResource.MARGE);
	}
	
	private void setUpdatedWidth(String businessName){
		int textWidth = EaUtils.getTextWidth(businessName, getDiagram());
		if (textWidth > AbstractEAStarAddResourceFeature.WIDTH)
			UPDATED_WIDTH = textWidth;
		else
			UPDATED_WIDTH = AbstractEAStarAddResourceFeature.WIDTH;
	}
}
