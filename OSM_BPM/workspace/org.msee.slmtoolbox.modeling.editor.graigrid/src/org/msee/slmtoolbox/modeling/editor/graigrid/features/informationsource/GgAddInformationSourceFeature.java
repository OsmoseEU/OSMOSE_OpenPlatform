package org.msee.slmtoolbox.modeling.editor.graigrid.features.informationsource;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.msee.slmtoolbox.modeling.editor.graigrid.diagram.GgGraphitiDiagramEditor;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.function.GgAddFunctionFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.style.GgStyleUtil;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGridSize;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgExternalInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInternalInformationSource;

/**
 *  Management class of the add Information Source action 
 * @author nco
 */
public class GgAddInformationSourceFeature extends GgAddFunctionFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public GgAddInformationSourceFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Can add information source
	 * @param context for add
	 */
	public boolean canAdd(IAddContext context) {
		// check if user wants to add a FunctionGrai
		if (context.getNewObject() instanceof GgInformationSource) {
			return true;
		}
		return false;
	}	
	
	/**
	 * Add graphic element for an information source
	 * The PictogramElement is fixed on the X axis
	 * @param context for add
	 * @return graphic element
	 */
	public PictogramElement add(IAddContext context) {
		// define style
		style =  GgStyleUtil.getStyleInformationSource(getDiagram());
		
		// find a business element
		GgInformationSource addedObject = (GgInformationSource) context.getNewObject();
		
		if (null == addedObject.eResource()) {
			// add to resource
			((GgGraphitiDiagramEditor) getDiagramEditor()).getResource().getContents().add(addedObject);
		}
		
		// define a default size for the shape
		int height = findFunctionHeight(GgUtilsGridSize.SIZE_FUNCTION_WIDTH_BASE);
		int coordinatedX = findXCoordinate();

		// find functions container shape
		ContainerShape targetFunction = getOrganizationsContainerShape();
		
		return createGraphicElement(context, addedObject, targetFunction, coordinatedX, 
				GgUtilsGridSize.SIZE_ORGANIZATION_HEIGHT_HEAD, height);
	}
	
	/**
	 * Find X coordinate for this function (in container shape of function shape) and move others elements
	 * 
	 * @param currentElementWidth	current element width
	 */
	protected int findXCoordinate() {
		// find x value of container shape of function shape
		int coordinateX = 0;
		
		// find list element graphics
		ContainerShape containerOrganization = getOrganizationsContainerShape();
		if (null !=  containerOrganization) {
			for (Shape element : containerOrganization.getChildren()) {
				Object object = getBusinessObjectForPictogramElement(element);
				if (null != object) {
					GraphicsAlgorithm graphicsElement = element
							.getGraphicsAlgorithm();
					if (object instanceof GgInformationSource) {
						GgInformationSource infoSource = (GgInformationSource) object;
						if (infoSource instanceof GgExternalInformationSource) {
							if (graphicsElement.getX() + graphicsElement.getWidth() > coordinateX) {
								// new element are after InformationSourceExternal
								coordinateX = graphicsElement.getX()
										+ graphicsElement.getWidth();
							}
							// Internal is always last element
						} else if (infoSource instanceof GgInternalInformationSource) {
							// new element are before InformationSourceExternal
							if (coordinateX >= graphicsElement.getX()) {
								coordinateX = graphicsElement.getX();
							}
							// move this element
							graphicsElement.setX(graphicsElement.getX()
									+ GgUtilsGridSize.SIZE_FUNCTION_WIDTH_BASE);
							// and all attachment
							moveAllAttachment(element, GgUtilsGridSize.SIZE_FUNCTION_WIDTH_BASE, 0);
						}
					}
				}
			}
		}
		return coordinateX;
	}
}
