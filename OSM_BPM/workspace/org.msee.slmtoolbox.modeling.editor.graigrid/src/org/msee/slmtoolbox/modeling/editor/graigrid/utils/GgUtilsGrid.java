package org.msee.slmtoolbox.modeling.editor.graigrid.utils;

import org.eclipse.emf.common.util.EList;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;


/**
 * utility class to use element grid
 * @author fto
 *
 */
public class GgUtilsGrid {

	/** grid shape id in diagram shape  */
	private static int ID_SHAPE_GRID = 0;
	
	/** shape id of decision level shape in grid shape*/
	private static int ID_SHAPE_GRID_ORGANIZATION = 0;
	
	/** shape id of decision level shape in grid shape*/
	private static int ID_SHAPE_GRID_DECISION_LEVEL = 1;

	/** shape id of name shape in organization shape*/
	private static int ID_SHAPE_ORGANIZATION_NAME = 0;
	
	/** shape id of function shape in organization shape*/
	private static int ID_SHAPE_ORGANIZATION_FUNCTION = 1;
	
	/**
	 * find the grid ContainerShape in diagram
	 * @param diagram searched
	 * @return grid ContainerShape
	 */
	public static ContainerShape getGridContainerShape(Diagram diagram) {
		ContainerShape containerShape = null;
		// diagram must be have Grid ContainerShape on child
		if (null !=  diagram.getChildren() &&  diagram.getChildren().size() > ID_SHAPE_GRID)
			containerShape = (ContainerShape) diagram.getChildren().get(ID_SHAPE_GRID);
		return containerShape;
	}

	/**
	 * find the containerShape of decision level ContainerShape in diagram
	 * @param diagram searched
	 * @return containerShape of decision level ContainerShape ContainerShape
	 */
	public static ContainerShape getLevelsContainerShape(Diagram diagram) {
		ContainerShape containerShape = null;
		// diagram must be have decision level ContainerShape on child
		if (null != getGridContainerShape(diagram)
				& (getGridContainerShape(diagram).getChildren().size() > ID_SHAPE_GRID_DECISION_LEVEL)){
			containerShape = 
					(ContainerShape) getGridContainerShape(diagram).getChildren().get(ID_SHAPE_GRID_DECISION_LEVEL);
		}
		return containerShape;
	}

	/**
	 * find the containerShape of organization ContainerShape in diagram
	 * @param diagram searched
	 * @return containerShape of organization ContainerShape ContainerShape
	 */
	public static ContainerShape getOrganizationsContainerShape(Diagram diagram) {
		ContainerShape containerShape = null;
		// diagram must be have organization ContainerShape on child
		if (null != getGridContainerShape(diagram)
				& (getGridContainerShape(diagram).getChildren().size() > ID_SHAPE_GRID_ORGANIZATION)){
			containerShape = 
					(ContainerShape) getGridContainerShape(diagram).getChildren().get(ID_SHAPE_GRID_ORGANIZATION);
		}
		return containerShape;
	}

	/**
	 * find the containerShape of function ContainerShape in diagram
	 * @param diagram searched
	 * @return containerShape of function ContainerShape ContainerShape
	 */
	public static ContainerShape getFunctionsContainerShape(ContainerShape shapeOrganization) {
		ContainerShape containerShape = null;
		// diagram must be have Grai Function ContainerShape on child
		if (null != shapeOrganization
				&& (shapeOrganization.getChildren().size() > ID_SHAPE_ORGANIZATION_FUNCTION )){
			containerShape = 
					(ContainerShape)shapeOrganization.getChildren().get(ID_SHAPE_ORGANIZATION_FUNCTION);
		}
		return containerShape;
	}
	
	/**
	 * Resize Organization Shape and Function Shape
	 * @param containerShape	Organization Container Shape
	 * @param deltaWidth		positive or negative delta Width
	 * @param deltaHeight		positive or negative delta height
	 */
	public static void resizeOrganizationShape(ContainerShape containerShape, int deltaWidth, int deltaHeight) {
		GraphicsAlgorithm graphicsElement = containerShape.getGraphicsAlgorithm();
		
		// Resize Width
		if (deltaWidth != 0) {
			// resize element
			graphicsElement.setWidth(graphicsElement.getWidth()
					+ deltaWidth);
			// resize name
			if (containerShape.getChildren().size() > ID_SHAPE_ORGANIZATION_NAME) {
				GraphicsAlgorithm geName = containerShape.getChildren()
						.get(ID_SHAPE_ORGANIZATION_NAME).getGraphicsAlgorithm();
				geName.setWidth(graphicsElement.getWidth());
			}
		}

		// Resize Height
		if (deltaHeight != 0) {
			graphicsElement.setHeight(graphicsElement.getHeight()
					+ deltaHeight);
			ContainerShape functionsShape = getFunctionsContainerShape(containerShape);
			// resize all function in organization
			for (Shape shape : functionsShape.getChildren()) {
				if (shape instanceof ContainerShape) {
					resizeFunctionShape((ContainerShape) shape, deltaHeight);
				}
			}
		}
	}

	/**
	 * Resize Function Shape and move his footer accordingly
	 * @param containerShape Abstract Information Source Container Shape
	 * @param deltaHeight positive or negative delta height
	 */
	public static void resizeFunctionShape(ContainerShape containerShape, int deltaHeight) {
		GraphicsAlgorithm graphicsElement = containerShape.getGraphicsAlgorithm();
		
		// Resize of deltaHeight
		graphicsElement.setHeight(graphicsElement.getHeight()
				+ deltaHeight);
		// Move function code footer
		EList<Shape> children = containerShape.getChildren();
		if(children.size() >= 3) {
			Shape footer = children.get(2);
			graphicsElement = footer.getGraphicsAlgorithm();

			graphicsElement.setY(graphicsElement.getY()
					+ deltaHeight);
		}
	}
	

	/**
	 * Find business object on axe X. It's a FunctionGrai or AbstractInformationSource
	 * @param iFeatureProvider	of diagram
	 * @param x			in container of function container 
	 * @return null if not found
	 */
	public static Object findObjectOnAxeX(IFeatureProvider iFeatureProvider, int x) {
		Object objectReturn = null;
		Shape shape = findShapeOnAxeX(iFeatureProvider, x);
		if (null != shape) {
			objectReturn = iFeatureProvider.getBusinessObjectForPictogramElement(shape);
		}
		return objectReturn;
	}

	/**
	 * Find business object on axe Y. It's a DecisionLevel
	 * @param iFeatureProvider	of diagram
	 * @param Y					in container of decision level container
	 * @return null if not found
	 */
	public static Object findObjectOnAxeY(IFeatureProvider iFeatureProvider, int y) {
		Object objectReturn = null;
		Shape shape = findShapeOnAxeY(iFeatureProvider, y);
		if (null != shape) {
			objectReturn = iFeatureProvider.getBusinessObjectForPictogramElement(shape);
		}
		return objectReturn;
	}

	/**
	 * Find shape object on axe X. It's a FunctionGrai or AbstractInformationSource shape
	 * @param iFeatureProvider			of diagram
	 * @param xInOrganisationsShapes	in container of organizations container 
	 * @return null if not found
	 */
	public static Shape findShapeOnAxeX(IFeatureProvider iFeatureProvider, int xInOrganisationsShapes) {
		ContainerShape csOrganizations = getOrganizationsContainerShape(iFeatureProvider.getDiagramTypeProvider().getDiagram());
		// find organization
		for (Shape shapeElement : csOrganizations.getChildren()) {
			Object bo = iFeatureProvider.getBusinessObjectForPictogramElement(shapeElement);
			GraphicsAlgorithm gaElement =shapeElement.getGraphicsAlgorithm();
			// if it's the element targeted
			if (xInOrganisationsShapes > gaElement.getX()
					&& xInOrganisationsShapes <= (gaElement.getX() + gaElement.getWidth())) {
				// for an element GgOrganization
				if (bo instanceof GgOrganization) {
					// find function
					int xInOrganization = xInOrganisationsShapes - gaElement.getX();
					ContainerShape csFunctions = getFunctionsContainerShape((ContainerShape) shapeElement);
					for (Shape shapeFunction : csFunctions.getChildren()) {
						GraphicsAlgorithm ga =shapeFunction.getGraphicsAlgorithm();
						if (xInOrganization > ga.getX()
								&& xInOrganization <= (ga.getX() + ga.getWidth())) {
							return shapeFunction;
						}
					}
					return null;
				} else if (bo instanceof GgInformationSource) {
					return shapeElement;
				}
			}
		}
		return null;
	}

	/**
	 * Find shape on axe Y. It's a DecisionLevel shape
	 * @param iFeatureProvider	of diagram
	 * @param Y					in container of decision level container
	 * @return null if not found
	 */
	public static Shape findShapeOnAxeY(IFeatureProvider iFeatureProvider, int y) {
		ContainerShape containerShape = getLevelsContainerShape(iFeatureProvider.getDiagramTypeProvider().getDiagram());
		for (Shape shape : containerShape.getChildren()) {
			GraphicsAlgorithm ga =shape.getGraphicsAlgorithm();
			if (y > ga.getY()
					&& y <= (ga.getY() + ga.getHeight())) {
				return shape;
			}
		}
		return null;
	}

	/**
	 * Add an angle to connection
	 * @param connection		connection target
	 * @param sourceAnchor		connection source anchor
	 * @param targetAnchor		connection target anchor
	 */
	public static void addAngleToConnection(FreeFormConnection connection,
			Anchor sourceAnchor, Anchor targetAnchor) {
		// Source coordinated
		int xSource = 0;
		if (null != sourceAnchor.getGraphicsAlgorithm()) {
			xSource = sourceAnchor.getGraphicsAlgorithm().getX()
					+ sourceAnchor.getGraphicsAlgorithm().getWidth()/2 ;
		} else {
			ContainerShape containerShapeImpl = (ContainerShape) sourceAnchor.eContainer();
			xSource = containerShapeImpl.getGraphicsAlgorithm().getX()
					+ containerShapeImpl.getGraphicsAlgorithm().getWidth()/2;
		}
		int ySource = 0;
		if (null != sourceAnchor.getGraphicsAlgorithm()) {
			ySource = sourceAnchor.getGraphicsAlgorithm().getY()
					+ sourceAnchor.getGraphicsAlgorithm().getHeight()/2 ;
		} else {
			ContainerShape containerShapeImpl = (ContainerShape) sourceAnchor.eContainer();
			ySource = containerShapeImpl.getGraphicsAlgorithm().getY()
					+ containerShapeImpl.getGraphicsAlgorithm().getHeight()/2 ;
		}
		// Target coordinated
		int xTarget =  0;
		if (null != targetAnchor.getGraphicsAlgorithm()) {
			xTarget = targetAnchor.getGraphicsAlgorithm().getX()
					+ targetAnchor.getGraphicsAlgorithm().getWidth()/2 ;
		} else {
			ContainerShape containerShapeImpl = (ContainerShape) targetAnchor.eContainer();
			xTarget = containerShapeImpl.getGraphicsAlgorithm().getX()
					+ containerShapeImpl.getGraphicsAlgorithm().getWidth()/2;
		}
		int yTarget = 0;
		if (null != targetAnchor.getGraphicsAlgorithm()) {
			yTarget = targetAnchor.getGraphicsAlgorithm().getY()
					+ targetAnchor.getGraphicsAlgorithm().getHeight()/2 ;
		} else {
			ContainerShape containerShapeImpl = (ContainerShape) targetAnchor.eContainer();
			yTarget = containerShapeImpl.getGraphicsAlgorithm().getY()
					+ containerShapeImpl.getGraphicsAlgorithm().getHeight()/2 ;
		}
		
		connection.getBendpoints().clear();
		// if source and target are not aligned horizontally or vertically
		if (xSource != xTarget && ySource != yTarget) {
	        IGaService gaService = Graphiti.getGaService();
			int xDelta = xTarget - xSource;
			int yDelta = yTarget - ySource;
			// add a angle
			if (Math.abs(yDelta) > Math.abs(xDelta)) {
				connection.getBendpoints().add(gaService.createPoint(xSource, yTarget));
			} else {
				connection.getBendpoints().add(gaService.createPoint(xTarget, ySource));
			}
			
		}
	}

	/**
	 * Find Level for a contexte
	 * @param featureProvider 
	 * @param targetContainer
	 * @return Level or null if not found
	 */
	public static GgLevel findLevel(IFeatureProvider featureProvider, Shape targetContainer) {
		GgLevel levelFound = null;
		if (! (targetContainer instanceof Diagram)) {
			Object object = featureProvider.getBusinessObjectForPictogramElement(targetContainer);
			// Business object is a DecisionLevel, user click after head
			if (object instanceof GgLevel) {
				levelFound = (GgLevel) object;
			} else if (object instanceof GgNode) {
				levelFound = ((GgNode) object).getLevel();
			}
		}
		return levelFound;
	}

	/**
	 * Find function for a contexte
	 * @param featureProvider	featureProvider
	 * @param targetContainer	target context
	 * @param x					x context
	 * @return function or null if not found
	 */
	public static GgFunction findFunction(
			IFeatureProvider featureProvider, Shape targetContainer,
			int x) {
		// find a element graigrid on X
		GgBaseElement element = findGraiGridElementOnX(featureProvider,targetContainer,x);
		if (element instanceof GgFunction) {
			return (GgFunction) element;
		} else {
			return null;
		}
	}

	/**
	 * Find InformationSource for a contexte
	 * @param featureProvider	featureProvider
	 * @param targetContainer	target context
	 * @param x					x context
	 * @return InformationSource or null if not found
	 */
	public static GgInformationSource findInformationSource(
			IFeatureProvider featureProvider, Shape targetContainer,
			int x) {
		// find a element graigrid on X
		GgBaseElement element = findGraiGridElementOnX(featureProvider,targetContainer,x);
		if (element instanceof GgInformationSource) {
			return (GgInformationSource) element;
		} else {
			return null;
		}
	}

	/**
	 * Find a GraiGrid element On axe X
	 * @param featureProvider	featureProvider
	 * @param targetContainer	target context
	 * @param x					x context
	 * @return GgBaseElement or null if not found
	 */
	public static GgBaseElement findGraiGridElementOnX(
			IFeatureProvider featureProvider, Shape targetContainer,
			int x) {
		GgBaseElement elementFound = null;
		if (! (targetContainer instanceof Diagram)) {
			Object object = featureProvider.getBusinessObjectForPictogramElement(targetContainer);
			// Business object is a DecisionLevel, user click after head
			if (object instanceof GgLevel) {
				if (x > GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH) {
					// find business object on Axe X
					Object obejctFindInX = GgUtilsGrid.findObjectOnAxeX(featureProvider, 
							x - GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH);
					if (obejctFindInX instanceof GgBaseElement) {
						elementFound = (GgBaseElement) obejctFindInX;
					}
				}
			} else if (object instanceof GgDecisionCenter) {
				elementFound = ((GgDecisionCenter) object).getFunction();
			} else if (object instanceof GgInformationCenter) {
				elementFound = ((GgInformationCenter) object).getInformationSource();
			}
		}
		return elementFound;
	}

	/**
	 * Find a Decision center in a function and level
	 * @param function	
	 * @param level
	 * @return null if not exist
	 */
	public static GgDecisionCenter findDecisionCenter(
			GgFunction function, GgLevel level) {
		if (null != function && null != level) {
			// for all center
			for (GgDecisionCenter center : function.getDecisionCenters()) {
				// if center have the level 
				if (level.getNodes().contains(center)) {
					// the center is at the intersection of function and level 
					return center;
				}
			}
		}
		return null;
	}

	/**
	 * Find a Information Center in a informationSource and level
	 * @param informationSource	
	 * @param level
	 * @return null if not exist
	 */
	public static GgInformationCenter findInformationCenter(
			GgInformationSource informationSource, GgLevel level) {
		if (null != informationSource && null != level) {
			// for all center
			for (GgInformationCenter center : informationSource.getInformationCenters()) {
				// if center have the level 
				if (level.getNodes().contains(center)) {
					// the center is at the informationSource and level. 
					return center;
				}
			}
		}
		return null;
	}

	/**
	 * Find a Organization diagram
	 * @param featureProvider	featureProvider
	 * @param targetContainer	target context
	 * @return null if not exist
	 */
	public static GgOrganization findOrganization(
			IFeatureProvider featureProvider, Diagram diagram, ICreateContext context) {
		GgOrganization organization = null;
		Object obTarget = featureProvider.getBusinessObjectForPictogramElement(context.getTargetContainer());
		// find organization target
		if (obTarget instanceof GgDecisionCenter) {
			// for a objet target is a DecisionCenter
			GgDecisionCenter center = (GgDecisionCenter) obTarget;
			organization = center.getFunction().getOrganization();
		} else if (obTarget instanceof GgFunction) {
			// for a objet target is a Function
			GgFunction function = (GgFunction) obTarget;
			organization = function.getOrganization();
		} else if (obTarget instanceof GgOrganization) {
			// for a objet target is an Organization
			organization = (GgOrganization) obTarget;
		} else if (obTarget instanceof GgLevel) {
			// calculating orgnization x
			int xOrgnization = context.getX() - GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH;
			// for all organization
			ContainerShape containerOrgnizations = getOrganizationsContainerShape(diagram);
			for (Shape shape : containerOrgnizations.getChildren()) {
				// search organization target by xOrgnization
				GraphicsAlgorithm gaElement = shape.getGraphicsAlgorithm();
				if (gaElement.getX() >= xOrgnization
						&& (gaElement.getX() + gaElement.getWidth()) <xOrgnization) {
					Object obElement = featureProvider.getBusinessObjectForPictogramElement(context.getTargetContainer());
					if (obElement instanceof GgOrganization) {
						organization = (GgOrganization) obElement;
					}
					break;
				}
			}
			
		} else {
			// else get default an organization
			GgGraiGrid graiGrid = findGraiGrid(featureProvider);
			if (null != graiGrid
					&& null != graiGrid.getOrganizations()
					&& graiGrid.getOrganizations().size()>0) {
				organization = graiGrid.getOrganizations().get(0);
			}
		}
		return organization;
	}
	
	/**
	 * find the grid grai business object
	 * @param featureProvider	featureProvider
	 * @return null if not found a graigrid
	 */
	public static GgGraiGrid findGraiGrid(IFeatureProvider featureProvider) {
		GgGraiGrid graiGrid = null;
		// find the ContainerShape of grai grid
		ContainerShape containerGG = GgUtilsGrid.getGridContainerShape(featureProvider.getDiagramTypeProvider().getDiagram());
		// find the businesseObject 
		Object businesseObject = featureProvider.getBusinessObjectForPictogramElement(containerGG);
		// if not a GraiGrid, it's error, return null
		if (businesseObject instanceof GgGraiGrid) {
			graiGrid = (GgGraiGrid) businesseObject;
		}
		
		return graiGrid;
	}

	/**
	 * find a X on diagram for a PictogramElement
	 * @param PictogramElement	to find X
	 * @return -1 if error
	 */
	public static int findXOnDiagram(PictogramElement element) {
		if (element instanceof Shape) {
			return findXOnShape((Shape) element);
		} else {
			return -1;
		}
	}
	
	/**
	 * find a X on diagram in the context
	 * @param context	on add action
	 * @return -1 if error
	 */
	public static int findXOnDiagram(IAddContext context) {
		return context.getX() + findXOnShape((ContainerShape) context.getTargetContainer());
	}
	
	/**
	 * find shape absolute X
	 * @param shape
	 * @return absolute X
	 */
	public static int findXOnShape(Shape shape) {
		int x = 0;
		if (!(shape instanceof Diagram)) {
			if (null != shape.getGraphicsAlgorithm())
				x += shape.getGraphicsAlgorithm().getX();
			x += findXOnShape(shape.getContainer());
		}
		return x;
	}

	/**
	 * find a Y on diagram for a PictogramElement
	 * @param PictogramElement	to find Y
	 * @return -1 if error
	 */
	public static int findYOnDiagram(PictogramElement element) {
		if (element instanceof Shape) {
			return findYOnShape((Shape) element);
		} else {
			return -1;
		}
	}
	
	/**
	 * find a Y on diagram in the context
	 * @param context	on add action
	 * @return -1 if error
	 */
	public static int findYOnDiagram(IAddContext context) {
		return context.getY() + findYOnShape((ContainerShape) context.getTargetContainer());
	}
	
	/**
	 * find shape absolute Y
	 * @param shape
	 * @return absolute Y
	 */
	public static int findYOnShape(Shape shape) {
		int y = 0;
		if (!(shape instanceof Diagram)) {
			if (null != shape.getGraphicsAlgorithm())
				y += shape.getGraphicsAlgorithm().getY();
			y += findYOnShape(shape.getContainer());
		}
		return y;
	}
}
