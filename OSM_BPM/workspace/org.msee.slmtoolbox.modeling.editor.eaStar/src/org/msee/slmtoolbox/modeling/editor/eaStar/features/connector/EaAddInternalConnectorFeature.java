package org.msee.slmtoolbox.modeling.editor.eaStar.features.connector;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.services.IGaService;
import org.msee.slmtoolbox.modeling.editor.eaStar.style.EaStyleUtil;

/**
 * class to add a EAStar External connector
 * 
 * @author fto
 */
public class EaAddInternalConnectorFeature extends AbstractAddConnectorFeature {

	/**
	 * Construct with param
	 * 
	 * @param fp	feature provider
	 */
	public EaAddInternalConnectorFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	protected GraphicsAlgorithm createGraphicElement(IGaService gaService,
			ContainerShape containerShape) {
		Ellipse ellipse = gaService.createEllipse(containerShape);
		ellipse.setStyle(EaStyleUtil.getStyleConnector(getDiagram()));
		ellipse.setLineWidth(1);
		return ellipse;
	}
}
