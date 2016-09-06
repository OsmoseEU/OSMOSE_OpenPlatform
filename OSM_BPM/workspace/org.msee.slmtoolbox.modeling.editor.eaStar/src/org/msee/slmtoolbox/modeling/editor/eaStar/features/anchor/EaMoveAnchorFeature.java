package org.msee.slmtoolbox.modeling.editor.eaStar.features.anchor;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveAnchorContext;
import org.eclipse.graphiti.features.impl.DefaultMoveAnchorFeature;

public class EaMoveAnchorFeature extends DefaultMoveAnchorFeature  {

	public EaMoveAnchorFeature(IFeatureProvider fp) {
		super(fp);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.graphiti.features.impl.DefaultMoveAnchorFeature#canMoveAnchor(org.eclipse.graphiti.features.context.IMoveAnchorContext)
	 */
	@Override
	public boolean canMoveAnchor(IMoveAnchorContext context) {
		//Anchors cannot be moved and they are fixed in their positions
		return false;
	}
	
}
