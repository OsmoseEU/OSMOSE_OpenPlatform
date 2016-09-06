package org.msee.slmtoolbox.modeling.editor.graigrid.features.function;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.AbstractGgRemoveFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;

/**
 *  Management class of the remove Function action 
 * @author fto
 */
public class GgRemoveFunctionFeature extends AbstractGgRemoveFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public GgRemoveFunctionFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Shift all others element except linked decision center   
	 * @param context for remove
	 */
	public void preRemove(IRemoveContext context) {
		PictogramElement prRemoveElement = context.getPictogramElement();
		Object boRemoveElement = getBusinessObjectForPictogramElement(prRemoveElement);
		if (prRemoveElement.eContainer() instanceof ContainerShape
				&& boRemoveElement instanceof GgFunction) {
			GgFunction removeFunction = (GgFunction) boRemoveElement;
			GraphicsAlgorithm removeGraphics = prRemoveElement.getGraphicsAlgorithm();
			GgOrganization organizationTarget = removeFunction.getOrganization();
			
			
			// for organization move other function
			for (GgFunction function : organizationTarget.getFunctions()) {
				PictogramElement peFunction = getFeatureProvider().getPictogramElementForBusinessObject(function);
				GraphicsAlgorithm elementGraphics = peFunction.getGraphicsAlgorithm();
				if (removeGraphics.getX() < elementGraphics.getX()){
					elementGraphics.setX(elementGraphics.getX()-removeGraphics.getWidth());
					moveAllAttachment(peFunction, -removeGraphics.getWidth(), 0);
				}
				
			}
			// resize organization
			PictogramElement peOrganizationTarget = getFeatureProvider().getPictogramElementForBusinessObject(organizationTarget);
			GgUtilsGrid.resizeOrganizationShape((ContainerShape) peOrganizationTarget, 
					-removeGraphics.getWidth(), 0);
			GraphicsAlgorithm gaOrganizationTarget = peOrganizationTarget.getGraphicsAlgorithm();
			
			// for all organization or Information source of the Diagram
			ContainerShape containerOrganization = getOrganizationContainerShape();
			// List element graphics
			for (Shape element : containerOrganization.getChildren()) {
				Object object = getBusinessObjectForPictogramElement(element);
				
				// for elements GgOrganization and AbstractInformationSource
				if (null != object && object instanceof GgInformationSource) {
					GraphicsAlgorithm elementGraphics = element.getGraphicsAlgorithm();
					if (gaOrganizationTarget.getX() < elementGraphics.getX()){
						// move element
						elementGraphics.setX(elementGraphics.getX()-removeGraphics.getWidth());
						moveAllAttachment(element, -removeGraphics.getWidth(), 0);
					}
				} else if (null != object && object instanceof GgOrganization) {
					GraphicsAlgorithm elementGraphics = element.getGraphicsAlgorithm();
					if (gaOrganizationTarget.getX() < elementGraphics.getX()){
						// move element
						elementGraphics.setX(elementGraphics.getX()-removeGraphics.getWidth());
						moveAllAttachment(element, -removeGraphics.getWidth(), 0);
					}
				}
			}

			// for all function or Information source of the Diagram
			ContainerShape containerDecisionLevel = getLevelContainerShape();
			// List element graphics
			for (Shape element : containerDecisionLevel.getChildren()) {
				Object object = getBusinessObjectForPictogramElement(element);
				
				// for elements DecisionLevel
				if (null != object && object instanceof GgLevel) {
					// resize element
					GraphicsAlgorithm elementGraphics = element.getGraphicsAlgorithm();
					elementGraphics.setWidth(elementGraphics.getWidth()-removeGraphics.getWidth());
				}
			}
		}
	}
}
