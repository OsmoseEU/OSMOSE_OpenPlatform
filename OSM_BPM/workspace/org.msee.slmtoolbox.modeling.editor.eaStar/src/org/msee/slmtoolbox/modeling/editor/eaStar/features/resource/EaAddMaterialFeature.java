package org.msee.slmtoolbox.modeling.editor.eaStar.features.resource;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;

public class EaAddMaterialFeature extends AbstractEAStarAddResourceFeature {
	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaAddMaterialFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	protected String getIdImageResource() {
		return EaImageProvider.IMG_MATERIAL_RESOURCE_DIAG;
	}

}
