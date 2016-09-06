package org.msee.slmtoolbox.modeling.editor.graigrid.features.flow;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.services.Graphiti;
import org.msee.slmtoolbox.modeling.editor.graigrid.style.GgStyleUtil;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame;

/**
 *  Management class of the add Decision Frame action 
 * @author fto
 */
public class GgAddDecisionFrameFeature extends AbstractGgAddFlowFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
    public GgAddDecisionFrameFeature (IFeatureProvider fp) {
        super(fp, GgStyleUtil.getStyleDecisionFrame(fp.getDiagramTypeProvider().getDiagram()));
    }

	/**
	 * Can add information flow
	 * @param context for add
	 */
	@Override
    public boolean canAdd(IAddContext context) {
        // return true if given business object is an InformationFlow
        // the context must be an instance of IAddConnectionContext
        if (context instanceof IAddConnectionContext 
        		&& context.getNewObject() instanceof GgDecisionFrame) {
            return true;
        }
        return false;
    }
	
	/**
	 * Create a Arrow for the connection
	 * @param gaContainer connection decorator
	 * @return a arrow
	 */
	protected Polyline createEndArrow(GraphicsAlgorithmContainer gaContainer) {
		Polyline polyline = Graphiti.getGaCreateService().createPolyline(gaContainer, new int[] { -16, 8, 2, 0, -16, -8});
		polyline.setStyle(GgStyleUtil.getStyleDecisionFrame(getDiagram()));
		polyline.setLineWidth(2);
		return polyline;
	}

}