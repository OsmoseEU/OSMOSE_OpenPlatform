package org.msee.slmtoolbox.modeling.editor.eaStar.features.resource;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;

public class EaAddITFeature extends AbstractEAStarAddResourceFeature {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaAddITFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	protected String getIdImageResource() {
		return EaImageProvider.IMG_IT_RESOURCE_DIAG;
	}

}
