package org.msee.slmtoolbox.modeling.editor.eaStar.features.activity;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaAddFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.style.EaStyleUtil;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.ConstantesEAStarActivity;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;

/**
 * Abstract Class for activity add feature
 * @author fto
 *
 */
public abstract class AbstractEaAddActivityFeature extends AbstractEaAddFeature {

	/**
	 * Default constructor
	 * @param fp
	 */
	public AbstractEaAddActivityFeature(IFeatureProvider fp) {
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
		EaExtendedActivity addedNode = (EaExtendedActivity) context.getNewObject();
		EaUtils.calculateRealeLoaction(context);

		// CONTAINER SHAPE WITH ROUNDED RECTANGLE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(
				getDiagram(), true);
		
		RoundedRectangle roundedRectangle; // need to access it later
        IGaService gaService = Graphiti.getGaService();
        {
            // create and set visible rectangle inside invisible rectangle
			roundedRectangle = gaService
					.createRoundedRectangle(containerShape, 5, 5);
			roundedRectangle.setStyle(EaStyleUtil.getStyleDefaultActivity(getDiagram()));
			gaService.setLocationAndSize(roundedRectangle, context.getX(), context.getY(), 
					ConstantesEAStarActivity.GRAPHIC_WIDTH, ConstantesEAStarActivity.GRAPHIC_HEIGHT);
	
			// if added Class has no resource we add it to the resource of the
			// diagram
			// in a real scenario the business model would have its own resource
			if (addedNode.eResource() == null) {
				getDataResource().getContents().add(addedNode);
			}
	
			// create link and wire it
			link(containerShape, addedNode);
        }
		// TEXT
		{	
			// create and set text graphics algorithm
			AbstractText text = gaService.createDefaultMultiText(getDiagram(), roundedRectangle,
					addedNode.getName());
			text.setStyle(EaStyleUtil.getStyleTextActivity(getDiagram()));
		    text.setHorizontalAlignment(text.getStyle().getHorizontalAlignment());
		    text.setVerticalAlignment(text.getStyle().getVerticalAlignment());
		    text.setFont(text.getStyle().getFont());
			gaService.setLocationAndSize(text, ConstantesEAStarActivity.TEXT_MARGE, 
					ConstantesEAStarActivity.TEXT_MARGE + ConstantesEAStarActivity.TEXT_CODE_SIZE, 
					ConstantesEAStarActivity.TEXT_WITH, ConstantesEAStarActivity.TEXT_HEIGHT);
		}
        //IMAGE START AND END
        {
			// create shape for start icon
			Shape shapeStart = peCreateService.createShape(containerShape, false);
			// create start icon
        	Image imgStart = gaService.createImage(shapeStart, EaImageProvider.IMG_ACTIVITY_START);
        	gaService.setLocationAndSize(imgStart, - 2*ConstantesEAStarActivity.START_ICON_X, 
        			ConstantesEAStarActivity.GRAPHIC_HEIGHT - ConstantesEAStarActivity.ICON_SIZE
					- ConstantesEAStarActivity.EXTERN_ANCHOR_SIZE 
					- ConstantesEAStarActivity.TEXT_MARGE, 
        			ConstantesEAStarActivity.ICON_SIZE, ConstantesEAStarActivity.ICON_SIZE);
			// create shape for end icon
			Shape shapeEnd = peCreateService.createShape(containerShape, false);
			// create end icon
        	Image imgEnd = gaService.createImage(shapeEnd, EaImageProvider.IMG_ACTIVITY_END);
        	gaService.setLocationAndSize(imgEnd, - 2* ConstantesEAStarActivity.END_ICON_X,
        			ConstantesEAStarActivity.GRAPHIC_HEIGHT - ConstantesEAStarActivity.ICON_SIZE 
					- ConstantesEAStarActivity.EXTERN_ANCHOR_SIZE 
					- ConstantesEAStarActivity.TEXT_MARGE
					, ConstantesEAStarActivity.ICON_SIZE, ConstantesEAStarActivity.ICON_SIZE);
			
        }
		// TEXT Decomposition Code
		{
			// create shape for text
			Shape shape= peCreateService.createShape(containerShape, false);
			// create and set text graphics algorithm
			AbstractText text = gaService.createDefaultText(getDiagram(), shape, addedNode.getDecompositionCode());
			text.setStyle(EaStyleUtil.getStyleTextDecompoCode(getDiagram()));
		    text.setHorizontalAlignment(text.getStyle().getHorizontalAlignment());
		    text.setVerticalAlignment(text.getStyle().getVerticalAlignment());
		    text.setFont(text.getStyle().getFont());
			gaService.setLocationAndSize(text, ConstantesEAStarActivity.TEXT_MARGE, ConstantesEAStarActivity.TEXT_MARGE, 
					ConstantesEAStarActivity.TEXT_WITH /2 , ConstantesEAStarActivity.TEXT_CODE_SIZE);
		}
		// TEXT Code
		{
			// create shape for text
			Shape shape= peCreateService.createShape(containerShape, false);
			// create and set text graphics algorithm
			AbstractText text = gaService.createDefaultText(getDiagram(), shape, addedNode.getCode());
			text.setStyle(EaStyleUtil.getStyleTextCode(getDiagram()));
		    text.setHorizontalAlignment(text.getStyle().getHorizontalAlignment());
		    text.setVerticalAlignment(text.getStyle().getVerticalAlignment());
		    text.setFont(text.getStyle().getFont());
			gaService.setLocationAndSize(text, ConstantesEAStarActivity.TEXT_MARGE + ConstantesEAStarActivity.TEXT_WITH /2, ConstantesEAStarActivity.TEXT_MARGE, 
					ConstantesEAStarActivity.TEXT_WITH /2 , ConstantesEAStarActivity.TEXT_CODE_SIZE);
		}
        //IMAGE
        {
        	createImageForActivity(peCreateService, gaService, containerShape, addedNode);
        }

        int widthSmall = roundedRectangle.getWidth()/4 -1;
        int heightSmall = roundedRectangle.getHeight()/4-1;
        int widthMax = roundedRectangle.getWidth() - 2;
        int heightMax = roundedRectangle.getHeight() - 2;
		// create box relative anchor at right
        {
			BoxRelativeAnchor boxAnchor = peCreateService
					.createBoxRelativeAnchor(containerShape);
		
			// set position on right border
			boxAnchor.setRelativeWidth(0.75);
			boxAnchor.setRelativeHeight(0);
			boxAnchor.setVisible(false);
			// anchor references visible rectangle instead of invisible rectangle
			boxAnchor.setReferencedGraphicsAlgorithm(roundedRectangle);
	
			// assign a graphics algorithm for the box relative anchor
			RoundedRectangle anchorRect = gaService.createRoundedRectangle(boxAnchor, 5,5);
			anchorRect.setFilled(true);
			// anchor is located on the right border of the visible rectangle
	
			anchorRect.setStyle(EaStyleUtil.getStyleAnchor(getDiagram()));
			gaService.setLocationAndSize(anchorRect, 0, 0, widthSmall, heightMax);
			// add output anchor to the shape
        }
		// create box relative anchor at left
        {
        	BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);

			// set position on left border
			boxAnchor.setRelativeWidth(0.0);
			boxAnchor.setRelativeHeight(0.0);
			boxAnchor.setVisible(false);
			// anchor references visible rectangle instead of invisible rectangle
			boxAnchor.setReferencedGraphicsAlgorithm(roundedRectangle);
	
			// assign a graphics algorithm for the box relative anchor
			RoundedRectangle anchorRect = gaService.createRoundedRectangle(boxAnchor, 5,5);
			anchorRect.setFilled(true);
			// anchor is located on the left border of the visible rectangle
			anchorRect.setStyle(EaStyleUtil.getStyleAnchor(getDiagram()));
			gaService.setLocationAndSize(anchorRect, 0, 0, widthSmall, heightMax);
        }
		// create box relative anchor at bottom
        {
		// create an additional box relative anchor at middle-right
        	BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);

			// set position on lower border
			boxAnchor.setRelativeWidth(0.0);
			boxAnchor.setRelativeHeight(0.75);
			boxAnchor.setVisible(false);
			// anchor references visible rectangle instead of invisible rectangle
			boxAnchor.setReferencedGraphicsAlgorithm(roundedRectangle);
	
			// assign a graphics algorithm for the box relative anchor
			RoundedRectangle anchorRect = gaService.createRoundedRectangle(boxAnchor, 5,5);
			anchorRect.setFilled(true);
			// anchor is located on the lower border of the visible rectangle
			anchorRect.setStyle(EaStyleUtil.getStyleAnchor(getDiagram()));
			gaService.setLocationAndSize(anchorRect, 0, 0, widthMax, heightSmall);
        }
		// create box relative anchor at top
        {
        	// add output anchor to the shape
        	BoxRelativeAnchor boxAnchor = peCreateService.createBoxRelativeAnchor(containerShape);

			// set position on upper border
			boxAnchor.setRelativeWidth(0.0);
			boxAnchor.setRelativeHeight(0.0);
			boxAnchor.setVisible(false);
			// anchor references visible rectangle instead of invisible rectangle
			boxAnchor.setReferencedGraphicsAlgorithm(roundedRectangle);
	
			// assign a graphics algorithm for the box relative anchor
			RoundedRectangle anchorRect = gaService.createRoundedRectangle(boxAnchor, 5,5);
			anchorRect.setFilled(true);
			// anchor is located on the upper border of the visible rectangle
			
	
			anchorRect.setStyle(EaStyleUtil.getStyleAnchor(getDiagram()));
			gaService.setLocationAndSize(anchorRect, 0, 0, widthMax, heightSmall);
        }
		

		// call the layout feature
		layoutPictogramElement(containerShape);

		return containerShape;
	}

	/**
	 * Create a Image for a activity
	 * @param gaService 
	 * @param containerShape
	 * @param addedNode 
	 * @param width
	 * @param height
	 */
	protected abstract void createImageForActivity(IPeCreateService peCreateService, IGaService gaService, ContainerShape containerShape, EaExtendedActivity addedNode);
}
