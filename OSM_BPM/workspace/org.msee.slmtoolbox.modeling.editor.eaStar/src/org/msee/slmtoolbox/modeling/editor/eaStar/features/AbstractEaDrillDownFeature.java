package org.msee.slmtoolbox.modeling.editor.eaStar.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeDrillDownFeature;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

/**
 * abstract class to drill down a EAStar feature
 * @author fto
 */
public abstract class AbstractEaDrillDownFeature extends AbstractMseeDrillDownFeature<EAStarAppService> {
	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public AbstractEaDrillDownFeature(IFeatureProvider fp) {
		super(fp);
	}

}
