package org.msee.slmtoolbox.modeling.editor.graigrid.features.level;

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
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGrid;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGridSize;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;

/**
 * Management class of the add Level action
 * 
 * @author nco
 */
public class GgAddLevelFeature extends AbstractGgAddFeature {

	/**
	 * Construct with param
	 * 
	 * @param fp
	 *            grai grid feature provider
	 */
	public GgAddLevelFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Can add a level
	 * 
	 * @param context
	 *            for add
	 */
	public boolean canAdd(IAddContext context) {
		// check if user wants to add a FunctionGrai
		if (context.getNewObject() instanceof GgLevel) {
			return true;
		}
		return false;
	}

	
	/**
	 * Add graphic element for a level
	 * The PictogramElement is fixed on the Y axis
	 * @param context for add
	 * @return graphic element
	 */
	public PictogramElement add(IAddContext context) {
		// find a business element
		GgLevel addedLevel = (GgLevel) context.getNewObject();
		
		if (null == addedLevel.eResource()) {
			// add to resource
			((GgGraphitiDiagramEditor) getDiagramEditor()).getResource().getContents().add(addedLevel);
		}

		// find a level container shape
		ContainerShape targetLevel = getLevelsContainerShape();

		ContainerShape containerShape = null;
		if (null != targetLevel) {			
			// CONTAINER SHAPE WITH ROUNDED RECTANGLE
			IPeCreateService peCreateService = Graphiti.getPeCreateService();
			containerShape = peCreateService.createContainerShape(
					targetLevel, true);
			// find Y coordinate (must be called before findLevelWidth witch extend function grai height)
			int coordinatedY = findYCoordinate(context, GgUtilsGridSize.SIZE_LEVEL_BASE_HEIGHT);
			// get width from function grai and extend function height
			int width = findLevelWidth();
	
			IGaService gaService = Graphiti.getGaService();
			{
				// create and set graphics algorithm
				Rectangle rectangle = gaService.createRectangle(containerShape);
				rectangle.setStyle(GgStyleUtil.getStyleLevel(getDiagram()));
				gaService.setLocationAndSize(rectangle,
						0,
						coordinatedY, width,
						GgUtilsGridSize.SIZE_LEVEL_BASE_HEIGHT);

				gaService.getTransparency(rectangle, true);
				// create link and wire it
				link(containerShape, addedLevel);
			}
			// SHAPE WITH TEXT FOR NAME
			{
				ContainerShape shape = peCreateService.createContainerShape(
						containerShape, false);
				// create and set text graphics algorithm for Horizon
				Text textName = gaService.createDefaultText(
						getDiagram(),
						shape, addedLevel.getName());
				textName.setStyle(GgStyleUtil
						.getStyleLevelText(getDiagram()));
				textName.setHorizontalAlignment(textName.getStyle().getHorizontalAlignment());
				textName.setVerticalAlignment(textName.getStyle().getVerticalAlignment());
				textName.setFont(textName.getStyle().getFont());
				
				gaService.setLocationAndSize(textName, 5, 0,
						GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH - 5,
						20);
			}
			// SHAPE WITH TEXT for Horizon
			{
				// create shape for text
				ContainerShape shape = peCreateService.createContainerShape(
						containerShape, false);
				// create and set text graphics algorithm for Horizon
				Text textHorizon = gaService.createDefaultText(
						getDiagram(),
						shape,
						GgUtilsLevel.getTextHorizon(addedLevel));
				textHorizon.setStyle(GgStyleUtil
						.getStyleLevelText(getDiagram()));
				textHorizon.setHorizontalAlignment(textHorizon.getStyle().getHorizontalAlignment());
				textHorizon.setVerticalAlignment(textHorizon.getStyle().getVerticalAlignment());
				textHorizon.setFont(textHorizon.getStyle().getFont());
				
				gaService.setSize(textHorizon, GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH - 10, 15);
				GgUtilsLevel.getLocationHorizon(gaService,addedLevel,textHorizon);
				// create link and wire it
				//link(shape, addedLevel);
			}
			// SHAPE WITH TEXT for Period
			{
				// create shape for text
				ContainerShape shape = peCreateService.createContainerShape(
						containerShape, false);
				// create and set text graphics algorithm for Period
				Text textPeriod = gaService.createDefaultText(
						getDiagram(),
						shape,
						GgUtilsLevel.getTextPeriod(addedLevel));
				textPeriod.setStyle(GgStyleUtil
						.getStyleLevelText(getDiagram()));
				textPeriod.setHorizontalAlignment(textPeriod.getStyle().getHorizontalAlignment());
				textPeriod.setVerticalAlignment(textPeriod.getStyle().getVerticalAlignment());
				textPeriod.setFont(textPeriod.getStyle().getFont());
				
				gaService.setSize(textPeriod, GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH - 10, 15);
				GgUtilsLevel.getLocationPeriod(gaService,addedLevel,textPeriod);
				// create link and wire it
				//link(shape, addedLevel);
			}
			// SHAPE WITH TEXT for Processiong Unit
			{
				// create shape for text
				ContainerShape shape = peCreateService.createContainerShape(
						containerShape, false);
				// create and set text graphics algorithm for Period
				Text textProcessingUnit = gaService.createDefaultText(
						getDiagram(),
						shape,
						GgUtilsLevel.getTextProcessingUnit(addedLevel));
				textProcessingUnit.setStyle(GgStyleUtil
						.getStyleLevelText(getDiagram()));
				textProcessingUnit.setHorizontalAlignment(textProcessingUnit.getStyle().getHorizontalAlignment());
				textProcessingUnit.setVerticalAlignment(textProcessingUnit.getStyle().getVerticalAlignment());
				textProcessingUnit.setFont(textProcessingUnit.getStyle().getFont());
				gaService.setLocationAndSize(textProcessingUnit, 5, 50,
						GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH - 10, 15);
				
				gaService.setSize(textProcessingUnit, GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH - 10, 15);
				GgUtilsLevel.getLocationProcessingUnit(gaService,addedLevel,textProcessingUnit);
				// create link and wire it
				//link(shape, addedLevel);
			}
			// SHAPE WITH TEXT for Code
			{
				// create shape for text
				ContainerShape shape = peCreateService.createContainerShape(
						containerShape, false);
				// create and set text graphics algorithm for Period
				Text textPeriod = gaService.createDefaultText(
						getDiagram(),
						shape,
						addedLevel.getCode());
				textPeriod.setStyle(GgStyleUtil
						.getStyleLevelTextCode(getDiagram()));
				textPeriod.setHorizontalAlignment(textPeriod.getStyle().getHorizontalAlignment());
				textPeriod.setVerticalAlignment(textPeriod.getStyle().getVerticalAlignment());
				textPeriod.setFont(textPeriod.getStyle().getFont());
				gaService.setLocationAndSize(textPeriod, 5, GgUtilsGridSize.SIZE_LEVEL_BASE_HEIGHT-20,
						GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH - 10, 20);
				// create link and wire it
				//link(shape, addedLevel);
			}
		}
		return containerShape;
	}

	/**
	 * Find Y coordinate for this level (in container shape of level shape) and move others elements
	 * 
	 * @param context				on add action
	 * @param currentElementHeight	current element height
	 * @return Y Coordinate
	 */
	private int findYCoordinate(IAddContext context, int currentElementHeight) {
		// find y value of container shape of level shape
		int coordinateY = GgUtilsGrid.findYOnDiagram(context) - GgUtilsGrid.findYOnShape(getLevelsContainerShape());
		// find y max value of container shape of level shape
		int maxCoordinateY = findLevelMaxY();
		
		if (maxCoordinateY != -1 && maxCoordinateY < coordinateY) {
			// The user select an area below existing Levels
			// Put the new one under
			coordinateY = maxCoordinateY;
		} else {
			// coordinatedY can not be below 0
			if (coordinateY < 0) {
				coordinateY = 0;
			}
	
			// find list element graphics
			ContainerShape containerLevel = getLevelsContainerShape();
			if (null !=  containerLevel) {
				for (Shape element : containerLevel.getChildren()) {
					Object object = getBusinessObjectForPictogramElement(element);
					if (null != object) {
						GraphicsAlgorithm graphicsElement = element
								.getGraphicsAlgorithm();
						if (object instanceof GgLevel) {
							// new element before element
							if (graphicsElement.getY() >= coordinateY) {
								// move this element
								graphicsElement.setY(graphicsElement.getY()
										+ currentElementHeight);
								// and all attachment
								moveAllAttachment(element, 0, currentElementHeight);
								// new element on element
							} else if (graphicsElement.getY() < coordinateY
									&& graphicsElement.getY()
											+ graphicsElement.getHeight() > coordinateY) {
								// place the new element
								coordinateY = graphicsElement.getY();
								// move this element
								graphicsElement.setY(graphicsElement.getY()
										+ currentElementHeight);
								// and all attachment
								moveAllAttachment(element, 0, currentElementHeight);
							}
							// new element after element ; no action
						}
					}
				}
			}
		}
		return coordinateY;
	}
}