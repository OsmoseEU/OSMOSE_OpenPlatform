package org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.structural;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.DefaultEaResizeShapeActivityFeaure;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.ConstantesEAStarActivity;
/**
 * Class to Structural activity resize shape feature
 * @author fto
 */
public class EaResizeShapeStructuralActivityFeature extends
		DefaultEaResizeShapeActivityFeaure {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public EaResizeShapeStructuralActivityFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Resize shape.
	 * 
	 * @param context
	 *            the context
	 */
	public void resizeShape(IResizeShapeContext context) {
		super.resizeShape(context);
		
		if (context.getShape() instanceof ContainerShape) {
			ContainerShape container = (ContainerShape) context.getShape();
			GraphicsAlgorithm graphics = container.getGraphicsAlgorithm();
			// move structural icon
			if (container.getChildren().size()> ConstantesEAStarActivity.STRUCUTRAL_ICON_ID) {
				Shape children = container.getChildren().get(ConstantesEAStarActivity.STRUCUTRAL_ICON_ID);
				GraphicsAlgorithm gaChildern = children.getGraphicsAlgorithm();
				gaChildern.setX(graphics.getWidth() - ConstantesEAStarActivity.STRUCUTRAL_ICON_SIZE - ConstantesEAStarActivity.EXTERN_ANCHOR_SIZE - ConstantesEAStarActivity.TEXT_MARGE);
				gaChildern.setY(graphics.getHeight() - ConstantesEAStarActivity.STRUCUTRAL_ICON_SIZE - ConstantesEAStarActivity.EXTERN_ANCHOR_SIZE - ConstantesEAStarActivity.TEXT_MARGE);
			}
		}
		
	}

}
