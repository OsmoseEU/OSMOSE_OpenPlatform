package org.msee.slmtoolbox.modeling.editor.graigrid.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeMoveShapeFeature;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;


public abstract class AbstracGgMoveShapeFeature extends AbstractMseeMoveShapeFeature<GgAppService> {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public AbstracGgMoveShapeFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Move all shapeToMove attachment
	 * @param shapeToMove	shape to move
	 * @param deltaX		delta on X coordinate
	 * @param deltaY		delta on Y coordinate
	 */
	protected void moveAllAttachment(PictogramElement peToMove, int deltaX, int deltaY) {
		Object objectShapeToMove = getBusinessObjectForPictogramElement(peToMove);
		// move for level
		if (objectShapeToMove instanceof GgLevel) {
			moveAllAttachementForLevel((GgLevel) objectShapeToMove, deltaX, deltaY);
		// move for function
		} else if (objectShapeToMove instanceof GgFunction) {
			moveAllAttachementForFunction((GgFunction) objectShapeToMove, deltaX, deltaY);
		// move for information source
		} else if (objectShapeToMove instanceof GgInformationSource) {
			moveAllAttachementForInformationSource((GgInformationSource) objectShapeToMove, deltaX, deltaY);
		// move for organization
		} else if (objectShapeToMove instanceof GgOrganization) {
			GgOrganization organization = (GgOrganization) objectShapeToMove;
			for(GgFunction function : organization.getFunctions()) {
				moveAllAttachementForFunction(function, deltaX, deltaY);
			}
		}
	}
	
	/**
	 * Move all shapeToMove attachment for a bo GgLevel
	 * @param level			bo GgLevel
	 * @param deltaX		delta on X coordinate
	 * @param deltaY		delta on Y coordinate
	 */
	private void moveAllAttachementForLevel(GgLevel level, int deltaX, int deltaY) {
		for(GgNode node : level.getNodes()) {
			PictogramElement element = getFeatureProvider().getPictogramElementForBusinessObject(node);
			GraphicsAlgorithm graph = element.getGraphicsAlgorithm();
			graph.setX(graph.getX() + deltaX );
			graph.setY(graph.getY() + deltaY );
		}
	}
	
	/**
	 * Move all shapeToMove attachment for a bo GgFunction
	 * @param function		bo GgFunction
	 * @param deltaX		delta on X coordinate
	 * @param deltaY		delta on Y coordinate
	 */
	private void moveAllAttachementForFunction(GgFunction function, int deltaX, int deltaY) {
		for(GgDecisionCenter center : function.getDecisionCenters()) {
			PictogramElement element = getFeatureProvider().getPictogramElementForBusinessObject(center);
			GraphicsAlgorithm graph = element.getGraphicsAlgorithm();
			graph.setX(graph.getX() + deltaX );
			graph.setY(graph.getY() + deltaY );
		}
	}
	
	/**
	 * Move all shapeToMove attachment for a bo GgInformationSource
	 * @param source		bo GgInformationSource
	 * @param deltaX		delta on X coordinate
	 * @param deltaY		delta on Y coordinate
	 */
	private void moveAllAttachementForInformationSource(GgInformationSource source, int deltaX, int deltaY) {
		for(GgInformationCenter center : source.getInformationCenters()) {
			PictogramElement element = getFeatureProvider().getPictogramElementForBusinessObject(center);
			GraphicsAlgorithm graph = element.getGraphicsAlgorithm();
			graph.setX(graph.getX() + deltaX );
			graph.setY(graph.getY() + deltaY );
		}
	}
}
