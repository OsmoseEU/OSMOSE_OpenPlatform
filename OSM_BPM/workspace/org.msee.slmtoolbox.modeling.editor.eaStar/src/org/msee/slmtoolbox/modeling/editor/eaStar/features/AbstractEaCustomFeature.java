package org.msee.slmtoolbox.modeling.editor.eaStar.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeCustomFeature;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

public abstract class AbstractEaCustomFeature extends AbstractMseeCustomFeature<EAStarAppService> {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public AbstractEaCustomFeature(IFeatureProvider fp) {
		super(fp);
	}
}
