package org.msee.slmtoolbox.modeling.editor.graigrid.features.center;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.AbstracGgMoveShapeFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGrid;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGridSize;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;

/**
 *  Management class of the move Information Center action 
 * @author nco
 */
public class GgMoveInformationCenterFeature extends
	AbstracGgMoveShapeFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public GgMoveInformationCenterFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Can move an information center
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
			
			if ((boTarget instanceof GgInformationCenter && boSource instanceof GgInformationCenter)) {
				canMove = true;
			} else {
				canMove = (null != GgUtilsGrid.findInformationSource(getFeatureProvider(), context.getTargetContainer(), context.getX()));
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
		GgInformationCenter boSource = (GgInformationCenter) getBusinessObjectForPictogramElement(shapeToMove);
		GgInformationSource isSource = boSource.getInformationSource();
		GgLevel dlSource = boSource.getLevel();
		// Information target
		GgInformationSource isTarget = GgUtilsGrid.findInformationSource(getFeatureProvider(), context.getTargetContainer(), context.getX());
		GgLevel dlTarget = GgUtilsGrid.findLevel(getFeatureProvider(),context.getTargetContainer());
		GgInformationCenter boTarget = GgUtilsGrid.findInformationCenter(isTarget, dlTarget);

		/* If move on an other information center */
		if (null != boTarget) {
			PictogramElement shapeTarget = getFeatureProvider().getPictogramElementForBusinessObject(boTarget);
			
			int ySource = shapeToMove.getGraphicsAlgorithm().getY();
			int xSource = shapeToMove.getGraphicsAlgorithm().getX();
			int yTarget = shapeTarget.getGraphicsAlgorithm().getY();
			int xTarget = shapeTarget.getGraphicsAlgorithm().getX();

			shapeToMove.getGraphicsAlgorithm().setY(yTarget);
			shapeToMove.getGraphicsAlgorithm().setX(xTarget);
			// remove element of old function, add in new InformationSource
			isSource.getInformationCenters().remove(boSource);
			isTarget.getInformationCenters().add(boSource);
			boSource.setInformationSource(isTarget);
			// remove element of old level, add in new level
			dlSource.getNodes().remove(boSource);
			dlTarget.getNodes().add(boSource);
			boSource.setLevel(dlTarget);
			
			shapeTarget.getGraphicsAlgorithm().setY(ySource);
			shapeTarget.getGraphicsAlgorithm().setX(xSource);
			// remove element of old function, add in new InformationSource
			isTarget.getInformationCenters().remove(boTarget);
			isSource.getInformationCenters().add(boTarget);
			boTarget.setInformationSource(isSource);
			// remove element of old level, add in new level
			dlTarget.getNodes().remove(boTarget);
			dlSource.getNodes().add(boTarget);
			boTarget.setLevel(dlSource);
		} else {
			/* Find function and DecisionLevel */
			if (null != isTarget) {
				PictogramElement targetX = getFeatureProvider().getPictogramElementForBusinessObject(isTarget);
				// remove element of old function, add in new function
				isSource.getInformationCenters().remove(boSource);
				isTarget.getInformationCenters().add(boSource);
				boSource.setInformationSource(isTarget);
				// Define position along the x axis and Width
				shapeToMove.getGraphicsAlgorithm().setX(
						targetX.getGraphicsAlgorithm().getX()
						+ GgUtilsGridSize.COORDINATED_BASE_FUNCTION_X
						+ GgUtilsGridSize.SIZE_CENTER_MARGIN);
				shapeToMove.getGraphicsAlgorithm().setWidth(targetX.getGraphicsAlgorithm().getWidth()-GgUtilsGridSize.SIZE_CENTER_MARGIN*2);
			}
			
			if (null != dlTarget) {
				PictogramElement targetY = getFeatureProvider().getPictogramElementForBusinessObject(dlTarget);
				// remove element of old level, add in new level
				dlSource.getNodes().remove(boSource);
				dlTarget.getNodes().add(boSource);
				boSource.setLevel(dlTarget);
				// Define position along the y axis and Height
				shapeToMove.getGraphicsAlgorithm().setY(targetY.getGraphicsAlgorithm().getY()
						+ GgUtilsGridSize.COORDINATED_BASE_LEVELDECISION_Y
						+ GgUtilsGridSize.SIZE_CENTER_MARGIN);
				shapeToMove.getGraphicsAlgorithm().setHeight(targetY.getGraphicsAlgorithm()
						.getHeight()-GgUtilsGridSize.SIZE_CENTER_MARGIN*2);
			}
		}
	}
}
