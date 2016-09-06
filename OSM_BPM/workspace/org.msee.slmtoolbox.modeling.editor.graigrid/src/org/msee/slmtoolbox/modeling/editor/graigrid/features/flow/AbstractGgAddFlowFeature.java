package org.msee.slmtoolbox.modeling.editor.graigrid.features.flow;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.msee.slmtoolbox.modeling.editor.graigrid.diagram.GgGraphitiDiagramEditor;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow;

/**
 *  Abstract nanagement class of the add flow action 
 * @author fto
 */
public abstract class AbstractGgAddFlowFeature extends AbstractAddFeature {

	/** style for line */
	private Style styleLine;

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
    public AbstractGgAddFlowFeature (IFeatureProvider fp, Style styleLine) {
        super(fp);
        this.styleLine = styleLine;
    }

	/**
	 * Add graphic element for a Information Flow
	 * @param context for add
	 * @return graphic element
	 */
	@Override
    public PictogramElement add(IAddContext context) {
    	IAddConnectionContext addConContext = (IAddConnectionContext) context;
		// find a business element
    	GgFlow addedInformationFlow = (GgFlow) context.getNewObject();
		
		if (null == addedInformationFlow.eResource()) {
			// add to resource 
			((GgGraphitiDiagramEditor) getDiagramEditor()).getResource().getContents().add(addedInformationFlow);
		}

        IPeCreateService peCreateService = Graphiti.getPeCreateService();
        IGaService gaService = Graphiti.getGaService();
        Connection connection = null;
        // CONNECTION WITH POLYLINE
        {
        	//connection = peCreateService.createFreeFormConnection(getDiagram());
        	connection = peCreateService.createFreeFormConnection(getDiagram());
	        connection.setStart(addConContext.getSourceAnchor());
	        connection.setEnd(addConContext.getTargetAnchor());
	        Polyline polyline = gaService.createPolyline(connection);
			polyline.setStyle(this.styleLine);
			polyline.setLineWidth(polyline.getStyle().getLineWidth());
			polyline.setLineStyle(polyline.getStyle().getLineStyle());
	 
	        // create link and wire it
	        link(connection, addedInformationFlow);
		}
 
		// add static graphical decorators (composition and navigable)
		ConnectionDecorator cdEnd = peCreateService.createConnectionDecorator(connection, false, 1.0, true);
		createEndArrow(cdEnd);
		ConnectionDecorator cdStart = peCreateService.createConnectionDecorator(connection, false, 0.0, true);
		createStartArrow(cdStart);
        return connection;
    }
    
	/**
	 * Create an Arrow for the connection
	 * @param gaContainer connection decorator
	 * @return a arrow
	 */
	protected Polyline createStartArrow(GraphicsAlgorithmContainer gaContainer) {
		return null;
	}
    
	/**
	 * Create an Arrow for the connection
	 * @param gaContainer connection decorator
	 * @return a arrow
	 */
	abstract protected Polyline createEndArrow(GraphicsAlgorithmContainer gaContainer);


	/**
	 * @return the styleLine
	 */
	public Style getStyleLine() {
		return styleLine;
	}


	/**
	 * @param styleLine the styleLine to set
	 */
	public void setStyleLine(Style styleLine) {
		this.styleLine = styleLine;
	}
	
}
