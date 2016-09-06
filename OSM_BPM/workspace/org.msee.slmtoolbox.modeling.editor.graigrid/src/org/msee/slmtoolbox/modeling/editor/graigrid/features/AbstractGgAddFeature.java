package org.msee.slmtoolbox.modeling.editor.graigrid.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGrid;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGridSize;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeAddFeature;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;


/**
 * abstract class to add a GraiGrid feature
 * @author fto
 */
public abstract class AbstractGgAddFeature extends AbstractMseeAddFeature<GgAppService> {

	
	/**
	 * Construct with param
	 * @param fp			grai grid feature provider
	 */
	public AbstractGgAddFeature(IFeatureProvider fp) {
		super(fp);
	}
	/**
	 * get a containershape for decision level
	 * @return
	 */
	protected ContainerShape getLevelsContainerShape() {
		return GgUtilsGrid.getLevelsContainerShape(getDiagram());
	}

	/**
	 * get a containershape for organization
	 * @return
	 */
	protected ContainerShape getOrganizationsContainerShape() {
		return GgUtilsGrid.getOrganizationsContainerShape(getDiagram());
	}

	/**
	 * get a containershape for function
	 * @return
	 */
	protected ContainerShape getFunctionsContainerShape(ContainerShape shapeOrganization) {
		return GgUtilsGrid.getFunctionsContainerShape(shapeOrganization);
	}

	/**
	 * get a containershape for Grid
	 * @return
	 */
	protected ContainerShape getGridContainerShape() {
		return GgUtilsGrid.getGridContainerShape(getDiagram());
	}
	
	/** 
	 * Find decision level max Y
	 * Witch equals first enterprise function height
	 * minus his header and footer height
	 * @return max Y (-1 if error)
	 */
	protected int findLevelMaxY() {
		int y = -1;
		ContainerShape containerOrganization = getOrganizationsContainerShape();
		if(containerOrganization.getChildren().size() > 0) {
			Shape firstShape = containerOrganization.getChildren().get(0);
			GraphicsAlgorithm graphicsElement = firstShape.getGraphicsAlgorithm();
			// y equals body element height (without header and footer)
			y = graphicsElement.getHeight() 
					- GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD 
					- GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER;
		}
		return y;
	}
	
	/**
	 * find a function height
	 * @return height
	 */
	protected int findFunctionHeight(int width) {
		// default size, the size of head element
		int sizeHeight = GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD
				+ GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_FOOTER;

		// List element graphics
		ContainerShape containerDecisionLevel = getLevelsContainerShape();
		if (null !=  containerDecisionLevel && ! containerDecisionLevel.getChildren().isEmpty() ) {
			// for all element
			for (Shape element : containerDecisionLevel.getChildren()) {
				Object object = getBusinessObjectForPictogramElement(element);
				// if element is a DecisionLevel, the FunctionGrai's height increases of DecisionLevel's height
				if (null != object && object instanceof GgLevel) {
					GraphicsAlgorithm graphicsElement = element
							.getGraphicsAlgorithm();
					sizeHeight = sizeHeight + graphicsElement.getHeight();
					// the DecisionLevel's width increases of FunctionGrai's width
					graphicsElement.setWidth(graphicsElement.getWidth()
							+ width);
				}
			}
		}

		return sizeHeight;
	}
	
	/**
	 * find a decision level width
	 * it depends of functions count
	 * @return width
	 */
	protected int findLevelWidth() {
		// default size, the size of head element
		int width = GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH;

		ContainerShape containerOrganizations = getOrganizationsContainerShape();
		for(Shape shape : containerOrganizations.getChildren()) {
			Object object = getBusinessObjectForPictogramElement(shape);
			if(object instanceof GgInformationSource) {
				GraphicsAlgorithm graphicsElement = shape.getGraphicsAlgorithm();
				width += graphicsElement.getWidth();

				// the FunctionGrai's height increases of DecisionLevel's height
				GgUtilsGrid.resizeFunctionShape((ContainerShape) shape, GgUtilsGridSize.SIZE_LEVEL_BASE_HEIGHT);
			}
			if(object instanceof GgOrganization) {
				GraphicsAlgorithm graphicsElement = shape.getGraphicsAlgorithm();
				width += graphicsElement.getWidth();

				// the FunctionGrai's height increases of DecisionLevel's height
				GgUtilsGrid.resizeOrganizationShape((ContainerShape) shape, 0, GgUtilsGridSize.SIZE_LEVEL_BASE_HEIGHT);
			}
		}
				
		return width;
	}
	
	/**
	 * Move all shapeToMove attachment
	 * @param shapeOrganization	shape organization moved
	 * @param deltaX			delta on X coordinate
	 * @param deltaY			delta on Y coordinate
	 */
	protected void moveAllAttachmentForOrgnization (Shape shapeOrganization, int deltaX, int deltaY) {
		if (shapeOrganization instanceof ContainerShape) {
			// find function for a organization
			ContainerShape functionsShape = getFunctionsContainerShape((ContainerShape) shapeOrganization);
			for (Shape shapeMoved : functionsShape.getChildren()) {
				// move all element linked to function witch move with organization
				moveAllAttachment(shapeMoved, deltaX, deltaY);
			}
		}
		
	}
	
	/**
	 * Move all shapeToMove attachment
	 * @param shapeMoved	shape moved
	 * @param deltaX		delta on X coordinate
	 * @param deltaY		delta on Y coordinate
	 */
	protected void moveAllAttachment(Shape shapeMoved, int deltaX, int deltaY) {
		Object objectShapeToMove = getBusinessObjectForPictogramElement(shapeMoved);
		String idElement = "";
		if (objectShapeToMove instanceof GgBaseElement) {
			idElement = ((GgBaseElement)objectShapeToMove).getId();
		}
		
		
		// for all diagram children elements
		Diagram diagram = getDiagram();
		for (Shape shape: diagram.getChildren()) {
			GraphicsAlgorithm graph = shape.getGraphicsAlgorithm();
			Object businessObject = getBusinessObjectForPictogramElement(shape);
            // find element link to businessObject to move
			if (((businessObject instanceof GgDecisionCenter) && 
					(((GgDecisionCenter) businessObject).getLevel().getId().equals(idElement)
						|| ((GgDecisionCenter)businessObject).getFunction().getId().equals(idElement))) ||
				((businessObject instanceof GgInformationCenter) &&
					(((GgInformationCenter)businessObject).getLevel().getId().equals(idElement)
						|| ((GgInformationCenter)businessObject).getInformationSource().getId().equals(idElement)))) {
					graph.setX(graph.getX() + deltaX );
					graph.setY(graph.getY() + deltaY );
			}
		}
	}

	/*protected EList<Shape> getElemetsGraphicsGrid() {
		return UtilsGrid.getElemetsGraphicsGrid(getDiagram());
	}*/
	
	/*protected GraiGrid findGridResource() {
		return ResourceGrai.instance(null).findGraiGrid();
	}*/
}
