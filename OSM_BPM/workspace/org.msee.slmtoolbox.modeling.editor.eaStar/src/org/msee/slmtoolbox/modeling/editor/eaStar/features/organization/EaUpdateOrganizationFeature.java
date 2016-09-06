package org.msee.slmtoolbox.modeling.editor.eaStar.features.organization;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeUpdateFeature;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

/**
 *  Management class of the update Organization action 
 * @author fto
 */
public class EaUpdateOrganizationFeature extends AbstractMseeUpdateFeature<EAStarAppService> {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public EaUpdateOrganizationFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Checks whether the values of the current pictogram element of the given
	 * context can be updated.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return true if update is possible
	 */
	public boolean canUpdate(IUpdateContext context) {
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		return (bo instanceof EaOrganization);
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
		// find text name
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		String businessName = EaUtils.getTextWithCode((EaOrganization) bo);
		
		// test with pictogram name
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				if (shape.getGraphicsAlgorithm() instanceof Text) {
					Text text = (Text) shape.getGraphicsAlgorithm();
					
			        // test if need bsm update
			        boolean needUpdateBsm = false;
			        if (bo instanceof EaOrganization) {
			        	needUpdateBsm = getAppService().needUpdate((EaOrganization) bo);
			        }
			        
					// update needed, if names are different
					boolean updateNameNeeded = ((text.getValue() == null && businessName != null) 
							|| (text.getValue() != null && !text.getValue().equals(businessName)));

			        if (needUpdateBsm && !updateNameNeeded) {
			            return Reason.createTrueReason("Name is not updated with the BSM model");
			        } else  if (updateNameNeeded) {
			            return Reason.createTrueReason("Name is out of date");
					} else {
						return Reason.createFalseReason();
					}
				} 
			}
		}
		return Reason.createTrueReason("");
	}
	
	/**
	 * Updates the pictogram element. It copies the latest values from the
	 * business model to the graphics algorithm of this pictogram elements.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return true, if update process was successfull
	 */
	public boolean update(IUpdateContext context) {
		// find text name
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		String businessName = EaUtils.getTextWithCode((EaOrganization) bo);
		
		// update text with pictogram name
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				if (shape.getGraphicsAlgorithm() instanceof Text) {
					Text text = (Text) shape.getGraphicsAlgorithm();
					 // update for EaOrganization
                    if (bo instanceof EaOrganization) {
                    	EaOrganization organization = (EaOrganization) bo;
                    	// if need update BSM
                    	if (getAppService().needUpdate(organization) 
                    			&& businessName.equals(text.getValue())) {
                    		getAppService().updateEa(organization);
                    		businessName = EaUtils.getTextWithCode(organization);
                    	} else {
                    		getAppService().update(organization);
                    	}
                    }
					text.setValue(businessName);
					return true;
				} 
			}
		} 
		return false;
	}
}
