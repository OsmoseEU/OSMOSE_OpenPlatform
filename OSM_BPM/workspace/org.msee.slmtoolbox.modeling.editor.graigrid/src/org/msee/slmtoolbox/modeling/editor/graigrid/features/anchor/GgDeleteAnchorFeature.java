package org.msee.slmtoolbox.modeling.editor.graigrid.features.anchor;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.DefaultMseeDeleteFeature;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;

/**
 *  Management class of the delete Grai Grid action 
 * @author fto
 */
public class GgDeleteAnchorFeature extends DefaultMseeDeleteFeature<GgAppService> {

	/**
	 *  Construct with param
	 * @param fp	anchor feature provider
	 */
	public GgDeleteAnchorFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Can't deleted an anchor
	 * @param context for deleted
	 */
	public boolean canDelete(IDeleteContext context) {
		return false;
	}
}
