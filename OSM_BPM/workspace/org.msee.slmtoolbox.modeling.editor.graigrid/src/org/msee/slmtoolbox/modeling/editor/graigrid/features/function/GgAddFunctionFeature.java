package org.msee.slmtoolbox.modeling.editor.graigrid.features.function;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.msee.slmtoolbox.modeling.editor.graigrid.diagram.GgGraphitiDiagramEditor;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.AbstractGgAddFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.style.GgStyleUtil;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGrid;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGridSize;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInternalInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;

/**
 *  Management class of the add Function action 
 * @author fto
 */
public class GgAddFunctionFeature  extends AbstractGgAddFeature {
	
	/** Syle element */
	protected Style style;

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public GgAddFunctionFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Can add function
	 * @param context for add
	 */
	public boolean canAdd(IAddContext context) {
		// check if user wants to add a FunctionGrai
		if (context.getNewObject() instanceof GgFunction) {
			return true;
		}
		return false;
	}
	
	/**
	 * Add graphic element for a function
	 * The PictogramElement is fixed on the X axis
	 * @param context for add
	 * @return graphic element
	 */
	public PictogramElement add(IAddContext context) {
		// define style
		style =  GgStyleUtil.getStyleFunction(getDiagram());
		
		// find a business element
		GgFunction addedObject = (GgFunction) context.getNewObject();
		// find organization target
		GgOrganization organizationTarget = addedObject.getOrganization();
		ContainerShape csOrganizationTarget = (ContainerShape) getFeatureProvider()
				.getPictogramElementForBusinessObject(organizationTarget);
		ContainerShape csFunctions = getFunctionsContainerShape(csOrganizationTarget);
		
		if (null == addedObject.eResource()) {
			// add to resource
			((GgGraphitiDiagramEditor) getDiagramEditor()).getResource().getContents().add(addedObject);
		}
		
		// define a default size for the shape
		int height = 0;
		if (organizationTarget.getFunctions().size() == 1) {
			int deltaWidth = GgUtilsGridSize.SIZE_FUNCTION_WIDTH_BASE - csFunctions.getGraphicsAlgorithm().getWidth();
			height = findFunctionHeight(deltaWidth);
		} else {
			height = findFunctionHeight(GgUtilsGridSize.SIZE_FUNCTION_WIDTH_BASE);
		}
		int coordinatedX = findXCoordinate(context, csOrganizationTarget, GgUtilsGridSize.SIZE_FUNCTION_WIDTH_BASE);
		
		return createGraphicElement(context, addedObject, csFunctions, coordinatedX, GgUtilsGridSize.SIZE_ORGANIZATION_HEIGHT_HEAD, height);
	}
	
	/**
	 * Create graphic element for a function
	 * @param style		Element Style
	 * @param context   Context
	 * @return graphic element
	 */
	protected PictogramElement createGraphicElement(IAddContext context, GgBaseElement addedObject, 
			ContainerShape targetFunction, int coordinatedX, int coordinatedY, int height) {
		
		// graphic element of function containerShape
		ContainerShape containerShape = null;
		if (null != targetFunction) {
			// CONTAINER SHAPE WITH ROUNDED RECTANGLE
			IPeCreateService peCreateService = Graphiti.getPeCreateService();
			containerShape = peCreateService.createContainerShape(targetFunction, true);
	
			IGaService gaService = Graphiti.getGaService();
			{
				// create and set graphics algorithm
				Rectangle rectangle = gaService.createRectangle(containerShape);
				rectangle.setStyle(this.style);
				gaService.setLocationAndSize(rectangle, coordinatedX,
						coordinatedY,
						GgUtilsGridSize.SIZE_FUNCTION_WIDTH_BASE, height);

				// create link and wire it
				link(containerShape, addedObject);
			}
			// SHAPE WITH TEXT NAME
			{
				// create shape for text
				Shape shape = peCreateService.createShape(containerShape, false);
				// create and set text graphics algorithm
				Text text = gaService.createDefaultText(getDiagram(), shape,
						addedObject.getName());
				text.setStyle(GgStyleUtil.getStyleFunctionText(getDiagram()));
				text.setHorizontalAlignment(text.getStyle().getHorizontalAlignment());
				text.setVerticalAlignment(text.getStyle().getVerticalAlignment());
				text.setFont(text.getStyle().getFont());
				// function name is in the first party of head, between 0 and the
				// size of its area
				gaService.setLocationAndSize(text, 0, 0,
						GgUtilsGridSize.SIZE_FUNCTION_WIDTH_BASE,
						GgUtilsGridSize.SIZE_FUNCTION_NAME_HEIGHT);
				// create link and wire it
				link(shape, addedObject);
			}
			// SHAPE WITH TEXT HEAD CODE
			{
				// create shape for text
				Shape shape = peCreateService.createShape(containerShape, false);
				// create and set text graphics algorithm
				Text text = gaService.createDefaultText(getDiagram(), shape,
						addedObject.getCode());
				text.setStyle(GgStyleUtil.getStyleFunctionAcronym(getDiagram()));
				text.setHorizontalAlignment(text.getStyle().getHorizontalAlignment());
				text.setVerticalAlignment(text.getStyle().getVerticalAlignment());
				text.setFont(text.getStyle().getFont());
				// function name is in the last party of head, between size of
				// name's area and the size of its area
				gaService.setLocationAndSize(text, 0,
						GgUtilsGridSize.SIZE_FUNCTION_NAME_HEIGHT,
						GgUtilsGridSize.SIZE_FUNCTION_WIDTH_BASE,
						GgUtilsGridSize.SIZE_FUNCTION_CODE_HEIGHT);
				// create link and wire it
				link(shape, addedObject);
			}
			// SHAPE WITH TEXT FOOTER CODE
			{
				// create shape for text
				Shape shape = peCreateService.createShape(containerShape, false);
				// create and set text graphics algorithm
				Text text = gaService.createDefaultText(getDiagram(), shape,
						addedObject.getCode());
				text.setStyle(GgStyleUtil.getStyleFunctionAcronym(getDiagram()));
				text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
				text.setVerticalAlignment(Orientation.ALIGNMENT_TOP);
				// function name is in the last party of head, between size of
				// name's area and the size of its area
				gaService.setLocationAndSize(text, 0,
						height - GgUtilsGridSize.SIZE_FUNCTION_CODE_HEIGHT,
						GgUtilsGridSize.SIZE_FUNCTION_WIDTH_BASE,
						GgUtilsGridSize.SIZE_FUNCTION_CODE_HEIGHT);
				// create link and wire it
				link(shape, addedObject);
			}
		}
		return containerShape;	
	}
	
	/**
	 * Find X coordinate for this function (in container shape of function shape), move others elements
	 * and resize organization
	 * 
	 * @param context				on add action
	 * @param currentElementWidth	current element width
	 */
	protected int findXCoordinate(IAddContext context, ContainerShape csOrganizationTarget, int currentElementWidth) {
		int sizeOrganization = currentElementWidth;
		ContainerShape csFunctions = getFunctionsContainerShape(csOrganizationTarget);
		// find x value of container shape of function shape
		int coordinateX = GgUtilsGrid.findXOnDiagram(context) - GgUtilsGrid.findXOnShape(csFunctions);
		// coordinatedX can not be below 0
		if (coordinateX < 0) {
			coordinateX = 0;
		}
		// coordinatedX can not be more size organization
		if (coordinateX > sizeOrganization) {
			coordinateX = sizeOrganization;
		}
		// for first element
		if (csFunctions.getChildren().size() == 0) {
			coordinateX = 0;
		}
		
		// find list element graphics
		if (null !=  csOrganizationTarget) {
			for (Shape element : csFunctions.getChildren()) {
				Object object = getBusinessObjectForPictogramElement(element);
				if (null != object) {
					GraphicsAlgorithm graphicsElement = element
							.getGraphicsAlgorithm();
					if (object instanceof GgFunction) {
						sizeOrganization += graphicsElement.getWidth();
						// new element before element
						if (graphicsElement.getX() >= coordinateX) {
							// move this element
							graphicsElement.setX(graphicsElement.getX()
									+ currentElementWidth);
							// and all attachment
							moveAllAttachment(element, currentElementWidth, 0);
							// new element on element
						} else if (graphicsElement.getX() < coordinateX
								&& graphicsElement.getX()
										+ graphicsElement.getWidth() > coordinateX) {
							// place the new element
							coordinateX = graphicsElement.getX();
							// move this element
							graphicsElement.setX(graphicsElement.getX()
									+ currentElementWidth);
							// and all attachment
							moveAllAttachment(element, currentElementWidth, 0);
						}
						// new element after element ; no action
	
						// External is always first element
					}
				}
			}
		}
		
		// resize organization
		GraphicsAlgorithm gaOrganoization = csOrganizationTarget.getGraphicsAlgorithm();
		int deltaSize = sizeOrganization - gaOrganoization.getWidth();
		if (deltaSize > 0) {
			GgUtilsGrid.resizeOrganizationShape(csOrganizationTarget, deltaSize, 0);
			gaOrganoization.setWidth(sizeOrganization);
			moveAllOrgnaization(gaOrganoization, deltaSize);
		}
		return coordinateX;
	}

	/**
	 * Move
	 * @param gaOrganoization
	 * @param deltaSize
	 */
	protected void moveAllOrgnaization(GraphicsAlgorithm gaOrganoization,
			int deltaSize) {
		for (Shape element : getOrganizationsContainerShape().getChildren()) {
			Object object = getBusinessObjectForPictogramElement(element);
			if (null != object) {
				GraphicsAlgorithm graphicsElement = element
						.getGraphicsAlgorithm();
				if (object instanceof GgOrganization) {
					// new element before element
					if (graphicsElement.getX() > gaOrganoization.getX()) {
						// move this element
						graphicsElement.setX(graphicsElement.getX()
								+ deltaSize);
						// and all attachment
						moveAllAttachmentForOrgnization(element, deltaSize, 0);
						// new element on element
					}
					// External is always first element
				} else if (object instanceof GgInformationSource) {
					GgInformationSource infoSource = (GgInformationSource) object;
					if (infoSource instanceof GgInternalInformationSource) {
						// move this element
						graphicsElement.setX(graphicsElement.getX()
								+ deltaSize);
						// and all attachment
						moveAllAttachment(element, deltaSize, 0);
					}
				}
			}
		}
	}
}
