package org.msee.slmtoolbox.modeling.editor.graigrid.features.function;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;

/**
 *  Management class of the move Information Source action 
 * @author nco
 */
public class GgMoveInformationSourceFeature extends DefaultMoveShapeFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
    public GgMoveInformationSourceFeature(IFeatureProvider fp) {
        super(fp);
    }

	/**
	 * Can move an information source
	 * @param context for move
	 */
    public boolean canMoveShape(IMoveShapeContext context) {
        return false;
    }
}
