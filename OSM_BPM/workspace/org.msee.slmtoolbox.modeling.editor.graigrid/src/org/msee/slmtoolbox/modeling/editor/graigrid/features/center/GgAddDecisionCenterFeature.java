package org.msee.slmtoolbox.modeling.editor.graigrid.features.center;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.MultiText;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.FixPointAnchor;
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
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;

/**
 * Management class of the add Decision Center action
 * 
 * @author fto
 */
public class GgAddDecisionCenterFeature extends AbstractGgAddFeature {

	/**
	 * Construct with param
	 * 
	 * @param fp
	 *            grai grid feature provider
	 */
	public GgAddDecisionCenterFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Can add Decision Center
	 * 
	 * @param context
	 *            for add
	 */
	public boolean canAdd(IAddContext context) {
		// check if user wants to add a DecisionCenter
		if (context.getNewObject() instanceof GgDecisionCenter) {
			return true;
		}
		return false;
	}

	/**
	 * Add graphic element for a Decision Center
	 * 
	 * @param context
	 *            for add
	 */
	public PictogramElement add(IAddContext context) {
		return createGraphicElement(context, GgStyleUtil.getStyleDecisionCenter(getDiagram()));
	}
	
	/**
	 * 
	 */
	public PictogramElement createGraphicElement(IAddContext context, Style style) {
		// find a business element
		GgNode addedCenter = (GgNode) context.getNewObject();

		if (null == addedCenter.eResource()) {
			// add to resource
			((GgGraphitiDiagramEditor) getDiagramEditor()).getResource().getContents().add(addedCenter);
		}
		
		IAddContext realContext = findRealContext(context);
		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(
				getDiagram(), true);

		IGaService gaService = Graphiti.getGaService();
		RoundedRectangle rectangle = null;
		{
			// create and set graphics algorithm
			rectangle = gaService.createRoundedRectangle(
					containerShape, 25, 25);
			rectangle.setStyle(style);
			gaService.setLocationAndSize(rectangle,
					realContext.getX() + GgUtilsGridSize.SIZE_CENTER_MARGIN,
					realContext.getY() + GgUtilsGridSize.SIZE_CENTER_MARGIN, realContext.getWidth() - GgUtilsGridSize.SIZE_CENTER_MARGIN*2,
					realContext.getHeight() - GgUtilsGridSize.SIZE_CENTER_MARGIN*2);

			gaService.getTransparency(rectangle, true);
			// create link and wire it
			link(containerShape, addedCenter);
		}
		// SHAPE WITH TEXT
		{
			// create and set graphics algorithm
			MultiText text = gaService.createDefaultMultiText(getDiagram(), rectangle,
					addedCenter.getName());

			text.setStyle(GgStyleUtil.getStyleTextCenter(getDiagram()));
			text.setHorizontalAlignment(text.getStyle().getHorizontalAlignment());
			text.setVerticalAlignment(text.getStyle().getVerticalAlignment());
			text.setFont(text.getStyle().getFont());
			gaService.setLocationAndSize(text, 10, 10,
					rectangle.getWidth() - 20, rectangle.getHeight() - 20);
		}
		// BOX ANCHOR
		{
			// add an anchor on shape's top left
			FixPointAnchor fixPointAnchor = peCreateService
					.createFixPointAnchor(containerShape);
			// set position on top left border
			fixPointAnchor.setLocation(gaService.createPoint(15, 15));

		    // anchor references visible rectangle instead of invisible rectangle
			fixPointAnchor.setReferencedGraphicsAlgorithm(rectangle);

			Rectangle anchorRectangle = gaService.createInvisibleRectangle(fixPointAnchor);
			gaService.setLocationAndSize(anchorRectangle, 0, 0, realContext.getWidth()-40, realContext.getHeight()-40);
			link(fixPointAnchor, addedCenter);
		}

		// call the layout feature
		layoutPictogramElement(containerShape);

		return containerShape;
	}
	
	/**
	 * Find a real context for add center : the function and decision level for
	 * calculate X, Y Height and Width
	 * 
	 * @param context
	 *            current
	 * @return real context for add center
	 */
	private IAddContext findRealContext(IAddContext context) {
		// Create real context
		AddContext realContext = new AddContext(context, context.getNewObject());

		// find a business element
		GgNode addedCenter = (GgNode) context.getNewObject();
		
		findRealContextXAndWith(realContext,addedCenter);
		
		findRealContextYAndHeight(realContext,addedCenter);
		
		return realContext;
	}

	/**
	 * Find real context for Y and Height
	 * @param realContext	to update
	 * @param addedCenter	bo element to create
	 */
	private void findRealContextYAndHeight(AddContext realContext,
			GgNode addedCenter) {
		GgLevel level = addedCenter.getLevel();
		// find PictogramElement of level
		PictogramElement pictogramElement = getFeatureProvider().getPictogramElementForBusinessObject(level);

		// find Y and Height
		if (null != pictogramElement) {
			GraphicsAlgorithm graphicsAlgorithm = pictogramElement.getGraphicsAlgorithm();
			realContext.setY(GgUtilsGrid.findYOnShape((Shape) pictogramElement));
			realContext.setHeight(graphicsAlgorithm.getHeight());
		}
	}

	/**
	 * Find real context for X and Width
	 * @param realContext	to update
	 * @param addedCenter	bo element to create
	 */
	private void findRealContextXAndWith(AddContext realContext, GgNode addedCenter) {
		// find PictogramElement of function or Information source
		PictogramElement pictogramElement = null;
		if (addedCenter instanceof GgDecisionCenter) {
			// find the decisionCenter's function
			GgDecisionCenter decisionCenter = (GgDecisionCenter) addedCenter;
			GgFunction function = decisionCenter.getFunction();
			pictogramElement = getFeatureProvider().getPictogramElementForBusinessObject(function);
			
		} else if (addedCenter instanceof GgInformationCenter) {
			// find the informationCenter's informationSource
			GgInformationCenter informationCenter = (GgInformationCenter) addedCenter;
			GgInformationSource informationSource = informationCenter
					.getInformationSource();
			pictogramElement = getFeatureProvider().getPictogramElementForBusinessObject(informationSource);
		}

		// find x and Width
		if (null != pictogramElement) {
			GraphicsAlgorithm graphicsAlgorithm = pictogramElement.getGraphicsAlgorithm();
			realContext.setX(GgUtilsGrid.findXOnShape((Shape) pictogramElement));
			realContext.setWidth(graphicsAlgorithm.getWidth());
		}
	}
}