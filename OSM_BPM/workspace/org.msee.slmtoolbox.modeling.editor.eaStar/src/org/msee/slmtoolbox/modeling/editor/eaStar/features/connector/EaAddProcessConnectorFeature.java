package org.msee.slmtoolbox.modeling.editor.eaStar.features.connector;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.services.IGaService;
import org.msee.slmtoolbox.modeling.editor.eaStar.style.EaStyleUtil;

public class EaAddProcessConnectorFeature extends AbstractAddConnectorFeature {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaAddProcessConnectorFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	protected GraphicsAlgorithm createGraphicElement(IGaService gaService,
			ContainerShape containerShape) {
		int xy[] = new int[] { 25, 0, 75, 0, 100, 25, 75, 50, 25, 50, 0, 25 };
		Polygon polygon;

		polygon = gaService.createPolygon(containerShape, xy);
		polygon.setStyle(EaStyleUtil.getStyleConnector(getDiagram()));
		polygon.setLineWidth(1);
		
		return polygon;
	}
}
