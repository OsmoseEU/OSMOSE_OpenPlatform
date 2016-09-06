package org.msee.slmtoolbox.modeling.editor.graigrid.features.grid;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.msee.slmtoolbox.modeling.editor.graigrid.diagram.GgGraphitiDiagramEditor;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.AbstractGgAddFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.style.GgStyleUtil;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGridSize;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;

/**
 *  Management class of the add grai grid action 
 * @author fto
 */
public class GgAddGridFeature extends AbstractGgAddFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public GgAddGridFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Can add grai grid
	 * @param context for add
	 */
	public boolean canAdd(IAddContext context) {
		// check if user wants to add a FunctionGrai
		if (context.getNewObject() instanceof GgGraiGrid) {
			return true;
		}
		return false;
	}
	
	/**
	 * Add graphic element for a grai grid
	 * @param context for add
	 */
	@Override
	public PictogramElement add(IAddContext context) {
		// find a business element
		GgGraiGrid addedGrid = (GgGraiGrid) context.getNewObject();
		
		if (null == addedGrid.eResource()) {
			// add to resource 
			((GgGraphitiDiagramEditor) getDiagramEditor()).getResource().getContents().add(addedGrid);
		}
		
		// find a grai grid shape
		Diagram targetDiagram = (Diagram) context.getTargetContainer();

		// CONTAINER SHAPE WITH RECTANGLE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(
				targetDiagram, true);

		IGaService gaService = Graphiti.getGaService();
		Rectangle rectangleGg;
		{
			// create and set graphics algorithm
			rectangleGg = gaService
					.createRectangle(containerShape);
			// rectangle.setStyle(StyleUtil.getStyleGrid(getDiagram()));
			gaService.setLocationAndSize(rectangleGg, 0, 0, -1, -1);
			rectangleGg.setStyle(GgStyleUtil.getStyleGrid(getDiagram()));
			rectangleGg.setLineWidth(rectangleGg.getStyle().getLineWidth());

			// create link and wire it
			link(containerShape, addedGrid);
		}
		// ADD name grid
		{
			AbstractText text = gaService.createMultiText(rectangleGg, addedGrid.getName());
			// add style
			text.setStyle(GgStyleUtil.getStyleGridText(getDiagram()));
			text.setHorizontalAlignment(text.getStyle().getHorizontalAlignment());
			text.setFont(text.getStyle().getFont());
			// set location
			gaService.setLocationAndSize(text, 3, 3,
					GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH -6,
					GgUtilsGridSize.SIZE_FUNCTION_HEIGHT_HEAD + GgUtilsGridSize.SIZE_ORGANIZATION_HEIGHT_HEAD -6);
			
			
		}
		// Add a container shape for all organization and information source shapes
		{
			ContainerShape shape = peCreateService.createContainerShape(
					containerShape, true);
			Rectangle rectangleOrga = gaService
					.createInvisibleRectangle(shape);
			// 
			gaService.setLocationAndSize(rectangleOrga, GgUtilsGridSize.COORDINATED_BASE_ORGANIZATION_X, 
					GgUtilsGridSize.COORDINATED_BASE_ORGANIZATION_Y, -1, -1);
			link(shape, addedGrid);
		}
		// Add a container shape for all levels shapes
		{

			ContainerShape shape = peCreateService.createContainerShape(
					containerShape, true);
			Rectangle rectangleLevel = gaService
					.createInvisibleRectangle(shape);
			gaService.setLocationAndSize(rectangleLevel, GgUtilsGridSize.COORDINATED_BASE_LEVELDECISION_X, 
					GgUtilsGridSize.COORDINATED_BASE_LEVELDECISION_Y, -1, -1);
			link(shape, addedGrid);
		}
		
		return containerShape;
	}
}
