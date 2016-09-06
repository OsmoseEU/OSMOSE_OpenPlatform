package org.msee.slmtoolbox.modeling.editor.eaStar.features.resource;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;

public class EaAddHumanFeature extends AbstractEAStarAddResourceFeature {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaAddHumanFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	protected String getIdImageResource() {
		return EaImageProvider.IMG_HUMAN_RESOURCE_DIAG;
	}

}
