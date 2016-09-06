package org.msee.slmtoolbox.modeling.editor.eaStar.features.flow;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.services.IGaService;
import org.msee.slmtoolbox.modeling.editor.eaStar.style.EaStyleUtil;

/**
 * class to add a EAStar support flow
 * @author fto
 */
public class EaAddSupportFlowFeature extends DefaultEaAddConnectionFeature {
	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaAddSupportFlowFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * create line
	 * @param gaService 
	 * @param connection
	 * @return arrow
	 */
	protected Polyline createLine(IGaService gaService, FreeFormConnection connection) {
		Polyline polyline = gaService.createPolyline(connection);
		polyline.setStyle(EaStyleUtil.getStyleSupportFlowResponsableFor(getDiagram()));
		polyline.setLineWidth(polyline.getStyle().getLineWidth());
		polyline.setForeground(polyline.getStyle().getForeground());
		return polyline;
	}
}
