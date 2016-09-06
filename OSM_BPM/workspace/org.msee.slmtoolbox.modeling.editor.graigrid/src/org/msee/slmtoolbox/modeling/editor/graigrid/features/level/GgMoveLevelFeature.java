package org.msee.slmtoolbox.modeling.editor.graigrid.features.level;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.AbstracGgMoveShapeFeature;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;


/**
 *  Management class of the move Level action 
 * @author nco
 */
public class GgMoveLevelFeature extends AbstracGgMoveShapeFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
    public GgMoveLevelFeature(IFeatureProvider fp) {
        super(fp);
    }

	/**
	 * Can move a level
	 * @param context for move
	 */
    public boolean canMoveShape(IMoveShapeContext context) {
        boolean canMove = context.getSourceContainer() != null && !context.getSourceContainer().equals(context.getTargetContainer());
        // perform further check only if move allowed by default feature
        if (canMove) {
            // allow move if it's a Level
            Shape target = context.getTargetContainer();
            
            Object bo = getBusinessObjectForPictogramElement(target);
            canMove = bo instanceof GgLevel;
        }
        return canMove;
    }

    /**
     * Move the shape
	 * @param context for move
     */
	public void moveShape(IMoveShapeContext context) {
		Shape shapeToMove = context.getShape();
		Shape shapeTarget = context.getTargetContainer();
		int ySource = shapeToMove.getGraphicsAlgorithm().getY();
		
		int yTarget = shapeTarget.getGraphicsAlgorithm().getY();
		
		shapeToMove.getGraphicsAlgorithm().setY(yTarget);
		moveAllAttachment(shapeToMove, 0,  yTarget - ySource);
		shapeTarget.getGraphicsAlgorithm().setY(ySource);
		moveAllAttachment(shapeTarget, 0, ySource - yTarget);
	}
}
