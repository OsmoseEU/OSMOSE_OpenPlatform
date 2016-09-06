package org.msee.slmtoolbox.modeling.editor.graigrid.features.grid;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;

/**
 *  Management class of the move Grai grid action 
 * @author fto
 */
public class GgMoveGridFeature extends DefaultMoveShapeFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
    public GgMoveGridFeature(IFeatureProvider fp) {
        super(fp);
    }

	/**
	 * Can't move a grai grid
	 * @param context for move
	 */
    @Override
    public boolean canMoveShape(IMoveShapeContext context) {
        return false;
    }
}
