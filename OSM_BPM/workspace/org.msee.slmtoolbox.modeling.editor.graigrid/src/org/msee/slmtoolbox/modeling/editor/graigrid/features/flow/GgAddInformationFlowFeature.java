package org.msee.slmtoolbox.modeling.editor.graigrid.features.flow;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.services.Graphiti;
import org.msee.slmtoolbox.modeling.editor.graigrid.style.GgStyleUtil;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationFlow;

/**
 *  Management class of the add Information Flow action 
 * @author nco
 */
public class GgAddInformationFlowFeature extends AbstractGgAddFlowFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
    public GgAddInformationFlowFeature (IFeatureProvider fp) {
        super(fp, GgStyleUtil.getStyleInformationFlow(fp.getDiagramTypeProvider().getDiagram()));
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
        		&& context.getNewObject() instanceof GgInformationFlow) {
            return true;
        }
        return false;
    }

	/**
	 * Create an Arrow for the connection
	 * @param gaContainer connection decorator
	 * @return a arrow
	 */
	protected Polyline createEndArrow(GraphicsAlgorithmContainer gaContainer) {
		Polyline polyline = Graphiti.getGaCreateService().createPolyline(gaContainer, new int[] { -10, 5, 2, 0, -10, -5});
		polyline.setStyle(GgStyleUtil.getStyleInformationFlow(getDiagram()));
		polyline.setLineWidth(2);
		return polyline;
	}

}