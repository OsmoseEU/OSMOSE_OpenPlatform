package org.msee.slmtoolbox.modeling.editor.eaStar.features.activity;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.MultiText;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.BoxRelativeAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.ConstantesEAStarActivity;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaActivityAnchors;

/**
 *  Default management class of the resize activity action 
 * @author fto
 */
public class DefaultEaResizeShapeActivityFeaure extends
		DefaultResizeShapeFeature {
	
	private static final int MIN_HEIGHT = 70;

	private static final int MIN_WIDTH = 100;

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public DefaultEaResizeShapeActivityFeaure(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Resize shape.
	 * 
	 * @param context
	 *            the context
	 */
	public void resizeShape(IResizeShapeContext context) {
		
		Shape shape = context.getShape();
		int x = context.getX();
		int y = context.getY();
		int width = context.getWidth();
		// defining a minimum Width size
		if (context.getWidth()< MIN_WIDTH) {
			width = MIN_WIDTH;
		}
		int height = context.getHeight();
		// defining a minimum height size
		if (context.getHeight()< MIN_HEIGHT) {
			height = MIN_HEIGHT;
		}
		if (shape.getGraphicsAlgorithm() != null) {
			Graphiti.getGaService().setLocationAndSize(shape.getGraphicsAlgorithm(), x, y, width, height);
		}
		
		
		// resize text
		GraphicsAlgorithm graphic = context.getPictogramElement().getGraphicsAlgorithm();
		
		if (graphic instanceof RoundedRectangle
				&&  graphic.getGraphicsAlgorithmChildren().size() > 0) {
			MultiText text = (MultiText) graphic.getGraphicsAlgorithmChildren().get(0);
			text.setHeight(height);
			text.setWidth(width);
		}
		
		
		
		// move icon, code and anchor
		if (context.getPictogramElement() instanceof ContainerShape) {
			ContainerShape container = (ContainerShape) context.getPictogramElement();		
			// move start icon
			if (container.getChildren().size()>ConstantesEAStarActivity.START_ICON_ID) {
				Shape children = container.getChildren().get(ConstantesEAStarActivity.START_ICON_ID);
				GraphicsAlgorithm gaChildern = children.getGraphicsAlgorithm();
				if (null != gaChildern) {
					gaChildern.setY(height
							- ConstantesEAStarActivity.ICON_SIZE 
							- ConstantesEAStarActivity.EXTERN_ANCHOR_SIZE 
							- ConstantesEAStarActivity.TEXT_MARGE);
				}
			}
			// move end icon
			if (container.getChildren().size()>ConstantesEAStarActivity.END_ICON_ID) {
				Shape children = container.getChildren().get(ConstantesEAStarActivity.END_ICON_ID);
				GraphicsAlgorithm gaChildern = children.getGraphicsAlgorithm();
				if (null != gaChildern) {
					gaChildern.setY(height
							- ConstantesEAStarActivity.ICON_SIZE 
							- ConstantesEAStarActivity.EXTERN_ANCHOR_SIZE 
							- ConstantesEAStarActivity.TEXT_MARGE);
				}
			}

			//move decomposition code
			if (container.getChildren().size()>ConstantesEAStarActivity.DECOMPOSITION_CODE_ID) {
				Shape children = container.getChildren().get(ConstantesEAStarActivity.DECOMPOSITION_CODE_ID);
				GraphicsAlgorithm gaChildern = children.getGraphicsAlgorithm();
				if (null != gaChildern) {
					gaChildern.setWidth(width/2
							- ConstantesEAStarActivity.TEXT_MARGE );
					gaChildern.setY(ConstantesEAStarActivity.TEXT_MARGE);
				}
				
			}
			// move code
			if (container.getChildren().size()>ConstantesEAStarActivity.CODE_ID) {
				Shape children = container.getChildren().get(ConstantesEAStarActivity.CODE_ID);
				GraphicsAlgorithm gaChildern = children.getGraphicsAlgorithm();
				if (null != gaChildern) {
					gaChildern.setWidth(width/2
							- ConstantesEAStarActivity.TEXT_MARGE );
					gaChildern.setX(width/2);
					gaChildern.setY(ConstantesEAStarActivity.TEXT_MARGE);
				}
				
			}

	        int widthSmall = context.getPictogramElement().getGraphicsAlgorithm().getWidth()/4 -1;
	        int heightSmall = context.getPictogramElement().getGraphicsAlgorithm().getHeight()/4-1;
	        int widthMax = context.getPictogramElement().getGraphicsAlgorithm().getWidth() - 2;
	        int heightMax = context.getPictogramElement().getGraphicsAlgorithm().getHeight() - 2;
			// the four anchors of Extended Activities
			EList<Anchor> anchors = container.getAnchors();
			if (anchors.size()>EaActivityAnchors.Output.getIndex()) {
				BoxRelativeAnchor anchor = (BoxRelativeAnchor) anchors.get(EaActivityAnchors.Output.getIndex());
				anchor.getGraphicsAlgorithm().setWidth(widthSmall);
				anchor.getGraphicsAlgorithm().setHeight(heightMax);
			}
			if (anchors.size()>EaActivityAnchors.Input.getIndex()) {
				BoxRelativeAnchor anchor = (BoxRelativeAnchor) anchors.get(EaActivityAnchors.Input.getIndex());
				anchor.getGraphicsAlgorithm().setWidth(widthSmall);
				anchor.getGraphicsAlgorithm().setHeight(heightMax);
			}
			if (anchors.size()>EaActivityAnchors.Control.getIndex()) {
				BoxRelativeAnchor anchor = (BoxRelativeAnchor) anchors.get(EaActivityAnchors.Control.getIndex());
				anchor.getGraphicsAlgorithm().setWidth(widthMax);
				anchor.getGraphicsAlgorithm().setHeight(heightSmall);
			}
			if (anchors.size()>EaActivityAnchors.Support.getIndex()) {
				BoxRelativeAnchor anchor = (BoxRelativeAnchor) anchors.get(EaActivityAnchors.Support.getIndex());
				anchor.getGraphicsAlgorithm().setWidth(widthMax);
				anchor.getGraphicsAlgorithm().setHeight(heightSmall);
			}
		}
	}
}
