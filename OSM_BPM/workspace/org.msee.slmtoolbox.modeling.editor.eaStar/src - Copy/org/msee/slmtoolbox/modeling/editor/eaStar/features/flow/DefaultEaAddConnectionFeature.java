package org.msee.slmtoolbox.modeling.editor.eaStar.features.flow;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaAddFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.style.EaStyleUtil;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow;

/**
 * default class to add a EAStar connection
 * @author fto
 */
public class DefaultEaAddConnectionFeature extends AbstractEaAddFeature {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public DefaultEaAddConnectionFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Checks, if the add can be executed.
	 * 
	 * @param context
	 *            the context needed to execute the add
	 * 
	 * @return true, if the add can be executed
	 */
	public boolean canAdd(IAddContext context) {
		// return true if given business object is an EReference
		// note, that the context must be an instance of IAddConnectionContext
		return (context instanceof IAddConnectionContext
				&& context.getNewObject() instanceof EaFlow);
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
		IAddConnectionContext addConContext = (IAddConnectionContext) context;
		EaFlow addedFlow = (EaFlow) context.getNewObject();
		IPeCreateService peCreateService = Graphiti.getPeCreateService();

		// CONNECTION WITH POLYLINE
		FreeFormConnection connection = peCreateService.createFreeFormConnection(getDiagram());
		connection.setStart(addConContext.getSourceAnchor());
		connection.setEnd(addConContext.getTargetAnchor());

		IGaService gaService = Graphiti.getGaService();

		// create line
		{
			createLine(gaService, connection);
		}
		// add dynamic text decorator for the association name
		{
			ConnectionDecorator textDecorator = peCreateService
					.createConnectionDecorator(connection, true, 0.5, true);

			//AbstractText text = gaService.createMultiText(textDecorator);
			AbstractText text = gaService.createDefaultText(getDiagram(), textDecorator);
			text.setStyle(EaStyleUtil.getStyleTextFlow(getDiagram()));
			gaService.setLocation(text, 10, 0);
			// set Flow name in the text decorator
			text.setValue(addedFlow.getName());
			link(textDecorator, addedFlow);
		}
		// add static graphical decorator (composition and navigable)
		{
			ConnectionDecorator cd = peCreateService.createConnectionDecorator(
					connection, false, 1.0, true);
			createArrow(gaService, cd);
	
			// create link and wire it
			link(connection, addedFlow);
		}
		return connection;
	}

	/**
	 * create line
	 * @param gaService 
	 * @param connection
	 * @return arrow
	 */
	protected Polyline createLine(IGaService gaService, FreeFormConnection connection) {
		Polyline polyline = gaService.createPolyline(connection);
		polyline.setLineWidth(1);
		polyline.setForeground(manageColor(IColorConstant.BLACK));
		return polyline;
	}
	
	/**
	 * create arrow
	 * @param gaService 
	 * @param gaContainer
	 * @return arrow
	 */
	protected Polygon createArrow(IGaService gaService, GraphicsAlgorithmContainer gaContainer) {
		Polygon polygon = gaService.createPolygon(gaContainer, new int[] { -10,
				5, 0, 0, -10, -5 });
		polygon.setForeground(manageColor(IColorConstant.BLACK));
		polygon.setBackground(manageColor(IColorConstant.BLACK));
		polygon.setLineWidth(2);
		return polygon;
	}

}
