package org.msee.slmtoolbox.modeling.editor.eaStar.features.connector;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;

/**
 *  Default management class of the resize connector action 
 * @author fto
 */
public class EaResizeShapeConnectorFeaure extends
		DefaultResizeShapeFeature {
	
	/** min size for height	 */
	private static final int MIN_HEIGHT = 50;

	/** min size for width	 */
	private static final int MIN_WIDTH = 80;

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public EaResizeShapeConnectorFeaure(IFeatureProvider fp) {
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
		// resize graphics
		if (shape.getGraphicsAlgorithm() != null) {
			// resize graphic element 
			if (shape.getGraphicsAlgorithm() instanceof Ellipse) {
				// for an ellipse graphic element 
				Graphiti.getGaService().setSize(shape.getGraphicsAlgorithm(), width, height);
			} else if (shape.getGraphicsAlgorithm() instanceof Polygon) {
				// for an polygon graphic element 
				Polygon polygnom = (Polygon) shape.getGraphicsAlgorithm();
				// redefine new points
				int xy[] = new int[] { width/4, 0, 3*width/4, 0, width,height/2, 3*width/4, height, width/4, height, 0, height/2 };
				polygnom.getPoints().clear();
				polygnom.getPoints().addAll(Graphiti.getGaCreateService().createPointList(xy));
			}

			// resize text 
			if (shape.getGraphicsAlgorithm().getGraphicsAlgorithmChildren().size() > 0) {
				AbstractText text = (AbstractText) shape.getGraphicsAlgorithm().getGraphicsAlgorithmChildren().get(0);
				Graphiti.getGaService().setLocationAndSize(text, 0, 0, width, height);
			}
			
		}
	}
}
