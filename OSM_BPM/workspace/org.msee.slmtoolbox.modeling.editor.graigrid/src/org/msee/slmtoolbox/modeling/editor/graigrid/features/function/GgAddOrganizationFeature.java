package org.msee.slmtoolbox.modeling.editor.graigrid.features.function;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.msee.slmtoolbox.modeling.editor.graigrid.diagram.GgGraphitiDiagramEditor;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.AbstractGgAddFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.style.GgStyleUtil;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtils;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGrid;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGridSize;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgExternalInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInternalInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;

/**
 *  Management class of the add Organization action 
 * @author fto
 */
public class GgAddOrganizationFeature extends AbstractGgAddFeature {

	/** default size for an organization width */
	private int DEFAULT_WIDTH_ORGNAIZATION = GgUtilsGridSize.SIZE_FUNCTION_WIDTH_BASE;

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public GgAddOrganizationFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Can add function
	 * @param context for add
	 */
	public boolean canAdd(IAddContext context) {
		// check if user wants to add a FunctionGrai
		if (context.getNewObject() instanceof GgOrganization) {
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
		// find a business element
		GgOrganization addedObject = (GgOrganization) context.getNewObject();
		
		if (null == addedObject.eResource()) {
			// add to resource
			((GgGraphitiDiagramEditor) getDiagramEditor()).getResource().getContents().add(addedObject);
		}

		// find functions container shape
		ContainerShape targetOrganization = getOrganizationsContainerShape();
		// graphic element of function containerShape
		ContainerShape containerShape = null;
		if (null != targetOrganization) {
			// CONTAINER SHAPE WITH ROUNDED RECTANGLE
			IPeCreateService peCreateService = Graphiti.getPeCreateService();
			containerShape = peCreateService.createContainerShape(
					targetOrganization, true);
			// define a default size for the shape
			int height = GgUtilsGridSize.SIZE_ORGANIZATION_HEIGHT_HEAD + findFunctionHeight(GgUtilsGridSize.SIZE_FUNCTION_WIDTH_BASE);
			int coordinatedX = findXCoordinate(context,targetOrganization);
	
			IGaService gaService = Graphiti.getGaService();
			{
				// create and set graphics algorithm
				Rectangle rectangle = gaService.createRectangle(containerShape);
				rectangle.setStyle(GgStyleUtil.getStyleOrganization(getDiagram()));
				gaService.setLocationAndSize(rectangle, coordinatedX,
						0,
						DEFAULT_WIDTH_ORGNAIZATION, height);

				// create link and wire it
				link(containerShape, addedObject);
			}
			// SHAPE WITH TEXT NAME
			{
				// create shape for text
				Shape shape = peCreateService.createShape(containerShape, false);
				// create and set text graphics algorithm
				Text text = gaService.createDefaultText(getDiagram(), shape,
						GgUtils.getNameWithCode(addedObject));
				text.setStyle(GgStyleUtil.getStyleTextCenter(getDiagram()));
				text.setHorizontalAlignment(text.getStyle().getHorizontalAlignment());
				text.setVerticalAlignment(text.getStyle().getVerticalAlignment());
				text.setFont(text.getStyle().getFont());
				gaService.setLocationAndSize(text, 0, 0,
						DEFAULT_WIDTH_ORGNAIZATION,
						GgUtilsGridSize.SIZE_ORGANIZATION_HEIGHT_HEAD);
				// create link and wire it
				link(shape, addedObject);
			}
			// CONTENAIRE SHAPE FOR FUNCTION
			{
				ContainerShape shape = peCreateService.createContainerShape(containerShape, false);
				Rectangle rectangle = gaService
						.createInvisibleRectangle(shape);
				gaService.setLocationAndSize(rectangle, 0, GgUtilsGridSize.SIZE_ORGANIZATION_HEIGHT_HEAD, 
						DEFAULT_WIDTH_ORGNAIZATION, height);
			}
		}
		return containerShape;	
	}
	
	/**
	 * Find X coordinate for this oragnization (in container shape of organization shape) and move others elements
	 * 
	 * @param context				on add action
	 * @param currentElementWidth	current element width
	 */
	protected int findXCoordinate(IAddContext context, ContainerShape containerOranization) {
		// find x value of container shape of function shape
		int coordinateX = GgUtilsGrid.findXOnDiagram(context)
				- GgUtilsGrid.findXOnShape(getOrganizationsContainerShape());
		// coordinatedX can not be below 0
		if (coordinateX < 0) {
			coordinateX = 0;
		}
		
		// find list element graphics
		if (null !=  containerOranization) {
			for (Shape element : containerOranization.getChildren()) {
				Object object = getBusinessObjectForPictogramElement(element);
				if (null != object) {
					GraphicsAlgorithm graphicsElement = element
							.getGraphicsAlgorithm();
					if (object instanceof GgOrganization) {
						// new element before element
						if (graphicsElement.getX() >= coordinateX) {
							// move this element
							graphicsElement.setX(graphicsElement.getX()
									+ DEFAULT_WIDTH_ORGNAIZATION);
							// and all attachment
							moveAllAttachmentForOrgnization(element, DEFAULT_WIDTH_ORGNAIZATION, 0);
							// new element on element
						} else if (graphicsElement.getX() < coordinateX
								&& graphicsElement.getX()
										+ graphicsElement.getWidth() > coordinateX) {
							// place the new element
							coordinateX = graphicsElement.getX();
							// move this element
							graphicsElement.setX(graphicsElement.getX()
									+ DEFAULT_WIDTH_ORGNAIZATION);
							// and all attachment
							moveAllAttachmentForOrgnization(element, DEFAULT_WIDTH_ORGNAIZATION, 0);
						}
						// new element after element ; no action
	
						// External is always first element
					} else if (object instanceof GgInformationSource) {
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
									+ DEFAULT_WIDTH_ORGNAIZATION);
							// and all attachment
							moveAllAttachment(element, DEFAULT_WIDTH_ORGNAIZATION, 0);
						}
					}
				}
			}
		}
		return coordinateX;
	}

}
