package org.msee.slmtoolbox.modeling.editor.graigrid.features.function;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.AbstracGgMoveShapeFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;

/**
 *  Management class of the move Organization action 
 * @author fto
 */
public class GgMoveOrganizationFeature extends AbstracGgMoveShapeFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
    public GgMoveOrganizationFeature(IFeatureProvider fp) {
        super(fp);
    }
    
	/**
	 * Can move an function
	 * @param context for move
	 */
    public boolean canMoveShape(IMoveShapeContext context) {
        boolean canMove = context.getSourceContainer() != null && !context.getSourceContainer().equals(context.getTargetContainer());
        // perform further check only if move allowed by default feature
        if (canMove) {
            // allow move if it's an Organization
            Shape target = context.getTargetContainer();
            
            Object bo = getBusinessObjectForPictogramElement(target);
            canMove = bo instanceof GgOrganization;
        }
        return canMove;
    }
    
    /**
     * Move the shape
	 * @param context for move
     */
	public void moveShape(IMoveShapeContext context) {
		// defin data for source element
		Shape shapeToMove = context.getShape();
		GraphicsAlgorithm gaToMove = shapeToMove.getGraphicsAlgorithm();
		int xSource = gaToMove.getX();
		// defin data for target element
		Shape shapeTarget = context.getTargetContainer();
		GraphicsAlgorithm gaTarget = shapeTarget.getGraphicsAlgorithm();
		int xTarget = gaTarget.getX();
		
		// calculating delta X
		int deltaXForWidth = 0;
		int deltaXForSource = xTarget - xSource ;
		int deltaXForTarget = xSource - xTarget ;
		if (xSource > xTarget) {
			deltaXForWidth =  gaToMove.getWidth() - gaTarget.getWidth();
			xSource += deltaXForWidth;
			deltaXForTarget += deltaXForWidth;
		} else {
			deltaXForWidth =   gaTarget.getWidth() - gaToMove.getWidth();
			xTarget += deltaXForWidth;
			deltaXForSource += deltaXForWidth;
		}
		
		// appli move to shape between source and target
		ContainerShape containerOrgnizations = GgUtilsGrid.getOrganizationsContainerShape(getDiagram());
		for(Shape shape: containerOrgnizations.getChildren()) {
			GraphicsAlgorithm gaElement = shape.getGraphicsAlgorithm();
			if ((gaElement.getX() > gaTarget.getX() && gaElement.getX() < gaToMove.getX())
					|| (gaElement.getX() < gaTarget.getX() && gaElement.getX() > gaToMove.getX())){
				gaElement.setX(gaElement.getX() + deltaXForWidth);
				moveAllAttachment(shape, deltaXForWidth, 0);
			}
		}
		
		// appli move to shape source
		shapeToMove.getGraphicsAlgorithm().setX(xTarget);
		moveAllAttachment(shapeToMove, deltaXForSource, 0);
		
		// appli move to shape target
		shapeTarget.getGraphicsAlgorithm().setX(xSource);
		moveAllAttachment(shapeTarget, deltaXForTarget, 0);
		
		getDiagramEditor().refresh();
	
	}

}
