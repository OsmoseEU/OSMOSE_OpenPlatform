package org.msee.slmtoolbox.modeling.editor.graigrid.features.center;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.AbstracGgMoveShapeFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGrid;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGridSize;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;

/**
 *  Management class of the move Decision Center action 
 * @author fto
 */
public class GgMoveDecisionCenterFeature extends AbstracGgMoveShapeFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public GgMoveDecisionCenterFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Can move an decision center
	 * @param context for move
	 */
	public boolean canMoveShape(IMoveShapeContext context) {
		boolean canMove = context.getSourceContainer() != null
				&& !context.getShape().equals(
						context.getTargetContainer());
		// perform further check only if move allowed by default feature
		Shape source = context.getShape();
		Object boSource = getBusinessObjectForPictogramElement(source);
		Shape target = context.getTargetContainer();
		Object boTarget = getBusinessObjectForPictogramElement(target);
		
		if (canMove) {
			canMove = false;
			
			if ((boTarget instanceof GgDecisionCenter && boSource instanceof GgDecisionCenter)) {
				canMove = true;
			} else {
				canMove = (null != GgUtilsGrid.findFunction(getFeatureProvider(), context.getTargetContainer(), context.getX()));
			}
		}
		return canMove;
	}
    
    /**
     * Move the shape
	 * @param context for move
     */
	@Override
	public void moveShape(IMoveShapeContext context) {
		Shape shapeToMove = context.getShape();

		// Information source
		GgDecisionCenter boSource = (GgDecisionCenter) getBusinessObjectForPictogramElement(shapeToMove);
		GgFunction fgSource = boSource.getFunction();
		GgLevel dlSource = boSource.getLevel();
		// Information target
		GgFunction fgTarget = GgUtilsGrid.findFunction(getFeatureProvider(), context.getTargetContainer(), context.getX());
		GgLevel dlTarget = GgUtilsGrid.findLevel(getFeatureProvider(),context.getTargetContainer());
		GgDecisionCenter boTarget = GgUtilsGrid.findDecisionCenter(fgTarget, dlTarget);
		
		
		/* If move on an other decision center */
		if (null != boTarget) {
			PictogramElement shapeTarget = getFeatureProvider().getPictogramElementForBusinessObject(boTarget);
			
			int ySource = shapeToMove.getGraphicsAlgorithm().getY();
			int xSource = shapeToMove.getGraphicsAlgorithm().getX();
			
			int yTarget = shapeTarget.getGraphicsAlgorithm().getY();
			int xTarget = shapeTarget.getGraphicsAlgorithm().getX();

			shapeToMove.getGraphicsAlgorithm().setY(yTarget);
			shapeToMove.getGraphicsAlgorithm().setX(xTarget);
			// remove element of old function, add in new function
			fgSource.getDecisionCenters().remove(boSource);
			fgTarget.getDecisionCenters().add((GgDecisionCenter) boSource);
			boSource.setFunction(fgTarget);
			// remove element of old level, add in new level
			dlSource.getNodes().remove(boSource);
			dlTarget.getNodes().add(boSource);
			boSource.setLevel(dlTarget);
			
			shapeTarget.getGraphicsAlgorithm().setY(ySource);
			shapeTarget.getGraphicsAlgorithm().setX(xSource);
			// remove element of old function, add in new function
			fgTarget.getDecisionCenters().remove(boTarget);
			fgSource.getDecisionCenters().add((GgDecisionCenter) boTarget);
			((GgDecisionCenter) boTarget).setFunction(fgSource);
			// remove element of old level, add in new level
			dlTarget.getNodes().remove(boTarget);
			dlSource.getNodes().add((GgNode) boTarget);
			((GgDecisionCenter) boTarget).setLevel(dlSource);
			
		} else {
			/* Find function and DecisionLevel */
			if (null != fgTarget) {
				PictogramElement peTarget = getFeatureProvider().getPictogramElementForBusinessObject(fgTarget);
				int xTarget = GgUtilsGrid.findXOnDiagram(peTarget);
				// remove element of old function, add in new function
				fgSource.getDecisionCenters().remove(boSource);
				fgTarget.getDecisionCenters().add(boSource);
				boSource.setFunction(fgTarget);
				
				// Define position along the x axis and Width
				shapeToMove.getGraphicsAlgorithm().setX(
						xTarget
						+ GgUtilsGridSize.SIZE_CENTER_MARGIN);
				shapeToMove.getGraphicsAlgorithm().setWidth(peTarget.getGraphicsAlgorithm().getWidth()-GgUtilsGridSize.SIZE_CENTER_MARGIN*2);
			}
			
			if (null != dlTarget) {
				PictogramElement peTarget = getFeatureProvider().getPictogramElementForBusinessObject(dlTarget);
				int yTarget = GgUtilsGrid.findYOnDiagram(peTarget);
				// remove element of old level, add in new level
				dlSource.getNodes().remove(boSource);
				dlTarget.getNodes().add(boSource);
				boSource.setLevel(dlTarget);
				
				// Define position along the y axis and Height
				shapeToMove.getGraphicsAlgorithm().setY(yTarget
						+ GgUtilsGridSize.SIZE_CENTER_MARGIN);
				shapeToMove.getGraphicsAlgorithm().setHeight(peTarget.getGraphicsAlgorithm()
						.getHeight()-GgUtilsGridSize.SIZE_CENTER_MARGIN*2);
			}
		}
	}
}
