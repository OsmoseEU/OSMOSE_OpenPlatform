package org.msee.slmtoolbox.modeling.editor.graigrid.features.level;


import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.AbstractGgRemoveFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;

/**
 *  Management class of the remove Level action 
 * @author nco
 */
public class GgRemoveLevelFeature extends AbstractGgRemoveFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */	
	public GgRemoveLevelFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Shift all others element except linked decision center   
	 * @param context for remove
	 */
	public void preRemove(IRemoveContext context) {
		PictogramElement removeElement = context.getPictogramElement();
		if (removeElement.eContainer() instanceof ContainerShape) {
			GraphicsAlgorithm removeGraphics = removeElement.getGraphicsAlgorithm();
			// for all level of the Diagram
			ContainerShape containerLevel = getLevelContainerShape();
						
			// List element graphics
			for (Shape element : containerLevel.getChildren()) {
				Object object = getBusinessObjectForPictogramElement(element);
				if (null != object && object instanceof GgLevel) {
					GraphicsAlgorithm elementGraphics = element.getGraphicsAlgorithm();
					if (removeGraphics.getY() < elementGraphics.getY()){
						// move element
						elementGraphics.setY(elementGraphics.getY() - removeGraphics.getHeight());
						moveAllAttachment(element, 0, -removeGraphics.getHeight());
					}
				}
			}

			// for all function or Information source of the Diagram
			ContainerShape containerOrganization = getOrganizationContainerShape();
			// List element graphics
			for (Shape element : containerOrganization.getChildren()) {
				Object object = getBusinessObjectForPictogramElement(element);
				
				// for elements organization and AbstractInformationSource
				if (null != object && object instanceof GgInformationSource) {
					// resize element
					GgUtilsGrid.resizeFunctionShape((ContainerShape) element, -removeGraphics.getHeight());					
				} else  if (null != object && object instanceof GgOrganization) {
					// resize element
					GgUtilsGrid.resizeOrganizationShape((ContainerShape) element, 0, -removeGraphics.getHeight());
				}
			}
		}
	}

}
