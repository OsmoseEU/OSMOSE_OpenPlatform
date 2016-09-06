package org.msee.slmtoolbox.modeling.editor.graigrid.features.anchor;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveAnchorContext;
import org.eclipse.graphiti.features.impl.DefaultMoveAnchorFeature;


/**
 *  Default management class anchor move action 
 * @author nco
 */
public class GgMoveAnchorFeature extends DefaultMoveAnchorFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public GgMoveAnchorFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Prevent anchor move
	 */
	@Override
	public boolean canMoveAnchor(IMoveAnchorContext context) {
		return false;
	}
	
}
