package org.msee.slmtoolbox.modeling.editor.eaStar.features.resource;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaAddFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.style.EaStyleUtil;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.ConstantesEAResource;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;

public abstract class AbstractEAStarAddResourceFeature extends AbstractEaAddFeature {
	
	/** WIDTH : Image width + marge*/
	protected static final int WIDTH = 90 ;
	/** HEIGHT : Image height */
	protected static final int HEIGHT = 60;
	/** TEXT_SIZE : heigth size for text */
	protected static final int TEXT_SIZE = 20;

	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public AbstractEAStarAddResourceFeature(IFeatureProvider fp) {
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

		// CONTAINER SHAPE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(
				getDiagram(), true);

		IGaService gaService = Graphiti.getGaService();
		
		int width = WIDTH;
		int textWidth = EaUtils.getTextWidth(addedNode.getName(), getDiagram());
		if (textWidth > WIDTH)
		width = textWidth;
		
		{
			// Create invisible rectangle
			Rectangle invisibleRectangle = gaService
					.createInvisibleRectangle(containerShape);
			gaService.setLocationAndSize(invisibleRectangle, context.getX(),
					context.getY(), width, HEIGHT + 20);
			// create image
			Image img = gaService.createImage(invisibleRectangle, getIdImageResource());
			img.setStyle(EaStyleUtil.getStyleImage(getDiagram()));
			// create and set visible rectangle inside invisible rectangle
			gaService.setLocationAndSize(img, 0, 0,  width, HEIGHT);
			img.setLineWidth(0);
	
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
			// create shape for text
			Shape shape= peCreateService.createShape(containerShape, false);
			// create and set text graphics algorithm
			Text text = gaService.createDefaultText(getDiagram(),
					shape, addedNode.getName());

		    text.setStyle(EaStyleUtil.getStyleText(getDiagram()));
		    text.setHorizontalAlignment(text.getStyle().getHorizontalAlignment());
		    text.setVerticalAlignment(text.getStyle().getVerticalAlignment());
		    text.setFont(text.getStyle().getFont());
			gaService.setLocationAndSize(text, 0, HEIGHT, width, TEXT_SIZE);
			// create link and wire it
			link(shape, addedNode);
		}
		{
			// add mse icon
			if (addedNode instanceof EaResource &&
					null != getAppService().getMseServiceToResource((EaResource)addedNode)){
				Shape shape = peCreateService.createShape(containerShape, false);
		        
		    	Image img = gaService.createImage(shape, EaImageProvider.IMG_MSE_ASSET_PLUS);
		    	gaService.setLocationAndSize(img, 
		    			width - ConstantesEAResource.MSE_ICON_SIZE - ConstantesEAResource.MARGE,
		    			ConstantesEAResource.MARGE,
		    			ConstantesEAResource.MSE_ICON_SIZE, 
		    			ConstantesEAResource.MSE_ICON_SIZE);
			}
		}
		{
			// create box relative anchor
			peCreateService.createChopboxAnchor(containerShape);
		}
		// call the layout feature
		layoutPictogramElement(containerShape);
		return containerShape;
	}
	
	protected abstract String getIdImageResource();
	
	
}
