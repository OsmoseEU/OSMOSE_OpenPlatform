package org.msee.slmtoolbox.modeling.editor.graigrid.features.function;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.AbstracGgMoveShapeFeature;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;

/**
 *  Management class of the move Function action 
 * @author fto
 */
public class GgMoveFunctionFeature extends AbstracGgMoveShapeFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
    public GgMoveFunctionFeature(IFeatureProvider fp) {
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
            // allow move if it's an Function
            Shape target = context.getTargetContainer();
            
            Object bo = getBusinessObjectForPictogramElement(target);
            canMove = bo instanceof GgFunction;
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
		int xSource = shapeToMove.getGraphicsAlgorithm().getX();
		ContainerShape containerSource = shapeToMove.getContainer();
		GgFunction functionSource = (GgFunction) getBusinessObjectForPictogramElement(shapeToMove);
		GgOrganization organizationSource = functionSource.getOrganization();
		PictogramElement peOrganizationSource = getFeatureProvider().getPictogramElementForBusinessObject(organizationSource);
		int xSourceContainer = peOrganizationSource.getGraphicsAlgorithm().getX();
		// defin data for target element
		Shape shapeTarget = context.getTargetContainer();
		int xTarget = shapeTarget.getGraphicsAlgorithm().getX();
		ContainerShape containerTarget = shapeTarget.getContainer();
		GgFunction functionTarget = (GgFunction) getBusinessObjectForPictogramElement(shapeTarget);
		GgOrganization organizationTarget = functionTarget.getOrganization();
		PictogramElement peOrganizationTarget = getFeatureProvider().getPictogramElementForBusinessObject(organizationTarget);
		int xTargetContainer = peOrganizationTarget.getGraphicsAlgorithm().getX();
		
		// calculating delta X
		int deltaX = xTarget + xTargetContainer - xSource - xSourceContainer ;
		
		// appli move to shape source
		shapeToMove.getGraphicsAlgorithm().setX(xTarget);
		moveAllAttachment(shapeToMove, deltaX, 0);
		shapeToMove.setContainer(containerTarget);
		functionSource.setOrganization(organizationTarget);
		
		// appli move to shape target
		shapeTarget.getGraphicsAlgorithm().setX(xSource);
		moveAllAttachment(shapeTarget, -deltaX, 0);
		shapeTarget.setContainer(containerSource);
		functionTarget.setOrganization(organizationSource);
		
		getDiagramEditor().refresh();
	
	}

}
