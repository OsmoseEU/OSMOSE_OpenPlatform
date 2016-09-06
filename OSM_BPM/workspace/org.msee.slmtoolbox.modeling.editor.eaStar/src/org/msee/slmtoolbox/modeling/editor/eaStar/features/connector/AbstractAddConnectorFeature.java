package org.msee.slmtoolbox.modeling.editor.eaStar.features.connector;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ChopboxAnchor;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaAddFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.style.EaStyleUtil;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;

/**
 * abstract class to add a EAStar connector
 * 
 * @author fto
 */
abstract public class AbstractAddConnectorFeature extends AbstractEaAddFeature {
	
	protected static final int WIDTH = 100;
	protected static final int HEIGHT = 50;

	/**
	 * Construct with param
	 * 
	 * @param fp	feature provider
	 */
	public AbstractAddConnectorFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Executes the add.
	 * 
	 * @param context
	 *            the context needed to execute the add
	 * 
	 * @return the added pictogram element
	 */
	public PictogramElement add(IAddContext context) {
		EaFlowNode addedNode = (EaFlowNode) context.getNewObject();
		// redefine context
		EaUtils.calculateRealeLoaction(context);


		IGaService gaService = Graphiti.getGaService();
		
		// CONTAINER SHAPE
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(
				getDiagram(), true);
		// Create graphic  element
		GraphicsAlgorithm graphicElement;
		{
			graphicElement = createGraphicElement(gaService, containerShape);
			gaService.setLocationAndSize(graphicElement, context.getX(), context.getY(),
					WIDTH, HEIGHT);

			// if added Class has no resource we add it to the resource of the
			// diagram
			// in a real scenario the business model would have its own resource
			if (addedNode.eResource() == null) {
				getDataResource().getContents().add(addedNode);
			}

			// create link and wire it
			link(containerShape, addedNode);
		}
		// create and set text graphics algorithm
		{
			Text text = gaService.createDefaultText(getDiagram(), graphicElement,
					addedNode.getName());
			text.setStyle(EaStyleUtil.getStyleText(getDiagram()));
			text.setHorizontalAlignment(text.getStyle().getHorizontalAlignment());
			text.setVerticalAlignment(text.getStyle().getVerticalAlignment());
			text.setFont(text.getStyle().getFont());
			gaService.setLocationAndSize(text, 0, 0, WIDTH, HEIGHT);
		}
		// create a chop box anchor
		{
			ChopboxAnchor boxAnchor = peCreateService
					.createChopboxAnchor(containerShape);
			boxAnchor.setReferencedGraphicsAlgorithm(graphicElement);
		}

		// call the layout feature
		layoutPictogramElement(containerShape);

		return containerShape;
	}

	/**
	 * create the graphic element for connector
	 */
	abstract protected GraphicsAlgorithm createGraphicElement(IGaService gaService, ContainerShape containerShape);
}
