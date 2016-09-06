package org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.structural;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.EaUpdateActivityFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.ConstantesEAStarActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;

public class EaUpdateStrucutralActivityFeature extends EaUpdateActivityFeature {

	Object bo;
	
	/**
	 * Default constructor
	 * @param fp
	 */
	public EaUpdateStrucutralActivityFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Check whether the values in the pictogram element are up to date, that
	 * means whether the graphics algorithm of this pictogram element contain
	 * the latest values from the business objects.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return true if parts of the pictogram model needs to be updated with the
	 *         latest values from the business model
	 */
	public IReason updateNeeded(IUpdateContext context) {
		IReason reason = super.updateNeeded(context);
		String idImage  = null;
		
		if (!reason.toBoolean()) {
			PictogramElement pictogramElement = context.getPictogramElement();
			
			if (pictogramElement instanceof ContainerShape) {
				ContainerShape container = (ContainerShape) pictogramElement;
				// test code
				if (container.getChildren().size()>ConstantesEAStarActivity.STRUCUTRAL_ICON_ID) {
					Shape children = container.getChildren().get(ConstantesEAStarActivity.STRUCUTRAL_ICON_ID);
					if (children.getGraphicsAlgorithm() instanceof Image) {
						idImage = ((Image)children.getGraphicsAlgorithm()).getId();
					}
				}
				
				// retrieve name from business model
				Object bo = getBusinessObjectForPictogramElement(pictogramElement);
				if (bo instanceof EaStructuralExtendedActivity) {
					EaStructuralExtendedActivity eaObject = (EaStructuralExtendedActivity) bo;
					boolean haveMseService = getAppService().haveMseService(eaObject);
					if (null != idImage && (
							(EaImageProvider.IMG_PLUS_SIGN.equals(idImage) && !haveMseService)
							|| (EaImageProvider.IMG_MSE_SERVICE_PLUS.equals(idImage) && haveMseService))) {
							return 	reason;
					} else {
		        		return Reason.createTrueReason("Icon is out of date");
					}
				}
			}
		}
		return reason;
	}

	public boolean update(IUpdateContext context) {
		super.update(context);
		// update icon structural
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		boolean haveMseService = false;
		if (bo instanceof EaStructuralExtendedActivity) {
			EaStructuralExtendedActivity eaObject = (EaStructuralExtendedActivity) bo;
			haveMseService = getAppService().haveMseService(eaObject);
		}
		
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape container = (ContainerShape) pictogramElement;
			// test code
			if (container.getChildren().size()>ConstantesEAStarActivity.STRUCUTRAL_ICON_ID) {
				Shape children = container.getChildren().get(ConstantesEAStarActivity.STRUCUTRAL_ICON_ID);
				if (children.getGraphicsAlgorithm() instanceof Image) {
					String idImage = ((Image)children.getGraphicsAlgorithm()).getId();
					if (EaImageProvider.IMG_PLUS_SIGN.equals(idImage) && haveMseService) {
						((Image)children.getGraphicsAlgorithm()).setId(EaImageProvider.IMG_MSE_SERVICE_PLUS);
					} else if (EaImageProvider.IMG_MSE_SERVICE_PLUS.equals(idImage) && !haveMseService) {
						((Image)children.getGraphicsAlgorithm()).setId(EaImageProvider.IMG_PLUS_SIGN);
					} 
				}
			}
		}
		
		return false;
	}
	
}
