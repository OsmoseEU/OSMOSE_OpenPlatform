package org.msee.slmtoolbox.modeling.editor.eaStar.features;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.mm.algorithms.styles.Point;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeMoveShapeFeature;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

/**
 * Default management class of the EAStar moveShape action 
 * @author fto
 *
 */
public class DefaultEaMoveShapeFeature extends AbstractMseeMoveShapeFeature<EAStarAppService> {
	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public DefaultEaMoveShapeFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Can move shape.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return true, if successful
	 */
	@Override
	public boolean canMoveShape(IMoveShapeContext context) {
		boolean canMove = context.getSourceContainer() != null;
		if (canMove) {
			ContainerShape shape = context.getTargetContainer();
			Object bo = getBusinessObjectForPictogramElement(shape);
			canMove = bo instanceof EaProcess || bo instanceof EaOrganization;
		}
		
		return canMove;
	}
	
	@Override
	public void moveShape(IMoveShapeContext context) {
		moveAllBendpoints(context);
		internalMove(context);
		PictogramElement element = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(element);
		if (bo instanceof EaFlowNode) {
			EaUtils.refreshAndAddOrganizationToNode(getFeatureProvider(), getDiagram(), (EaFlowNode) bo, getAppService());
		}
	}

	/**
	 * Move all bendpoints. Move bendpoints within a container shape.
	 * 
	 * @param context
	 *            the context
	 */
	protected void moveAllBendpoints(IMoveShapeContext context) {
		Shape shapeToMove = context.getShape();

		int x = context.getX();
		int y = context.getY();

		int deltaX = x - shapeToMove.getGraphicsAlgorithm().getX();
		int deltaY = y - shapeToMove.getGraphicsAlgorithm().getY();

		if (deltaX != 0 || deltaY != 0) {
			List<FreeFormConnection> connectionList = new ArrayList<FreeFormConnection>();

			FreeFormConnection[] containerConnections = calculateContainerConnections(context);
			for (int i = 0; i < containerConnections.length; i++) {
				FreeFormConnection cc = containerConnections[i];
				if (!connectionList.contains(cc)) {
					connectionList.add(cc);
				}
			}

			FreeFormConnection[] connectedConnections = calculateConnectedConnections(context);
			for (int i = 0; i < connectedConnections.length; i++) {
				FreeFormConnection cc = connectedConnections[i];
				if (!connectionList.contains(cc)) {
					connectionList.add(cc);
				}
			}

			for (FreeFormConnection conn : connectionList) {
				moveAllBendpointsOnFFConnection((FreeFormConnection) conn, deltaX, deltaY);
			}
		}
	}


	protected void internalMove(IMoveShapeContext context) {
		if (!getUserDecision()) {
			return;
		}
		Shape shapeToMove = context.getShape();
		Object newBO = getBusinessObjectForPictogramElement(context.getTargetContainer());

		int x = context.getX();
		int y = context.getY();

		
		if (newBO instanceof EaOrganization) {
			x += context.getTargetContainer().getGraphicsAlgorithm().getX();
			y += context.getTargetContainer().getGraphicsAlgorithm().getY();
			if (shapeToMove.getGraphicsAlgorithm() != null) {
				Graphiti.getGaService().setLocation(shapeToMove.getGraphicsAlgorithm(), x, y, false);
			}
		} else { // move within the same container
			if (shapeToMove.getGraphicsAlgorithm() != null) {
				Graphiti.getGaService().setLocation(shapeToMove.getGraphicsAlgorithm(), x, y, false);
			}
		}
	}

	private FreeFormConnection[] calculateContainerConnections(IMoveShapeContext context) {
		FreeFormConnection[] ret = new FreeFormConnection[0];

		if (!(context.getShape() instanceof ContainerShape)) {
			return ret;
		}

		List<FreeFormConnection> retList = new ArrayList<FreeFormConnection>();

		Shape shapeToMove = context.getShape();

		int x = context.getX();
		int y = context.getY();

		int deltaX = x - shapeToMove.getGraphicsAlgorithm().getX();
		int deltaY = y - shapeToMove.getGraphicsAlgorithm().getY();

		if (deltaX != 0 || deltaY != 0) {

			List<Anchor> anchorsFrom = getAnchors(shapeToMove);
			List<Anchor> anchorsTo = new ArrayList<Anchor>(anchorsFrom);

			for (Anchor anchorFrom : anchorsFrom) {

				Collection<Connection> outgoingConnections = anchorFrom.getOutgoingConnections();

				for (Connection connection : outgoingConnections) {
					for (Anchor anchorTo : anchorsTo) {

						Collection<Connection> incomingConnections = anchorTo.getIncomingConnections();
						if (incomingConnections.contains(connection)) {
							if (connection instanceof FreeFormConnection) {
								retList.add((FreeFormConnection) connection);
							}
						}
					}
				}
			}
		}
		return retList.toArray(ret);
	}

	private FreeFormConnection[] calculateConnectedConnections(IMoveShapeContext context) {
		List<FreeFormConnection> retList = new ArrayList<FreeFormConnection>();
//		Shape shapeToMove = context.getShape();

//		int x = context.getX();
//		int y = context.getY();

//		int deltaX = x - shapeToMove.getGraphicsAlgorithm().getX();
//		int deltaY = y - shapeToMove.getGraphicsAlgorithm().getY();
		
		//TO DO 

//		if (deltaX != 0 || deltaY != 0) {
//			
//			List<Anchor> anchors = shapeToMove.getAnchors();
//			FreeFormConnection cnx = (FreeFormConnection) anchors.get(0).getOutgoingConnections().get(0);
//			retList.add(cnx);
//			System.out.println( anchors.get(0).getParent().getGraphicsAlgorithm().getX());
//			System.out.println( anchors.get(0).getParent().getGraphicsAlgorithm().getY());
//			
//		}
		
		return  retList.toArray(new FreeFormConnection[0]);
	}

	private void moveAllBendpointsOnFFConnection(FreeFormConnection connection, int deltaX, int deltaY) {
		List<Point> points = connection.getBendpoints();
		for (int i = 0; i < points.size(); i++) {
			Point point = points.get(i);
			int oldX = point.getX();
			int oldY = point.getY();
			points.set(i, Graphiti.getGaCreateService().createPoint(oldX + deltaX, oldY + deltaY));
		}
	}

	private List<Anchor> getAnchors(Shape theShape) {
		List<Anchor> ret = new ArrayList<Anchor>();
		ret.addAll(theShape.getAnchors());

		if (theShape instanceof ContainerShape) {
			ContainerShape containerShape = (ContainerShape) theShape;
			List<Shape> children = containerShape.getChildren();
			for (Shape shape : children) {
				if (shape instanceof ContainerShape) {
					ret.addAll(getAnchors((ContainerShape) shape));
				} else {
					ret.addAll(shape.getAnchors());
				}
			}
		}
		return ret;
	}

}
