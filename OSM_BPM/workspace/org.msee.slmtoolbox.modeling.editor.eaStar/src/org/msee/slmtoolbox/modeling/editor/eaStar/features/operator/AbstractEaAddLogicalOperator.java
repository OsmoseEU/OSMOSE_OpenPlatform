package org.msee.slmtoolbox.modeling.editor.eaStar.features.operator;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaAddFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;

/**
 * Abstract Class for logical operator add feature
 * @author fto
 *
 */
abstract public class AbstractEaAddLogicalOperator extends AbstractEaAddFeature {

	// the additional size of the invisible rectangle at the right border
	// (this also equals the half width of the anchor to paint there)
	/** WIDTH : Image width + marge*/
	protected static final int WIDTH = 50 ;
	/** HEIGHT : Image height */
	protected static final int HEIGHT = 50;
	
	/*private static final IColorConstant ANCHOR_FOREGROUND = new ColorConstant(
			255, 102, 0);
	private static final IColorConstant ANCHOR_BACKGROUND = new ColorConstant(
			255, 255, 255);*/

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public AbstractEaAddLogicalOperator(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Executes the add.
	 * 
	 * @param context
	 *            the context needed to execute the add
	 * 
	 * @return the added pictogram element
	 */
	public PictogramElement add(IAddContext context) {
		EaFlowNode addedNode = (EaFlowNode) context.getNewObject();
		EaUtils.calculateRealeLoaction(context);

		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		IGaService gaService = Graphiti.getGaService();
		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		ContainerShape containerShape = peCreateService.createContainerShape(
				getDiagram(), true);
		{
			// create invisible outer rectangle expanded by
			// the width needed for the anchor
			Rectangle invisibleRectangle = gaService
					.createInvisibleRectangle(containerShape);
			gaService.setLocationAndSize(invisibleRectangle, context.getX(),
					context.getY(), WIDTH, HEIGHT);
			Image img = gaService.createImage(invisibleRectangle, getIdImageOperator());
			// create and set image inside invisible rectangle
			gaService.setLocationAndSize(img, 0, 0, WIDTH, HEIGHT);
	
			// if added Class has no resource we add it to the resource of the
			// diagram
			// in a real scenario the business model would have its own resource
			if (addedNode.eResource() == null) {
				getDataResource().getContents().add(addedNode);
			}
	
			// create link and wire it
			link(containerShape, addedNode);
		}
		{
			// create an anchor which covers the image size
			peCreateService.createChopboxAnchor(containerShape);
		}
		// call the layout feature
		layoutPictogramElement(containerShape);

		return containerShape;
	}

	/**
	 * @return id operator image
	 */
	protected abstract String getIdImageOperator();

}
