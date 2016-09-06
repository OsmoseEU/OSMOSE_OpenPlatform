package org.msee.slmtoolbox.modeling.editor.eaStar.features.operator;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;

/**
 * Class for logical Or operator add feature
 * @author fto
 *
 */
public class EaAddOrFeature extends AbstractEaAddLogicalOperator {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaAddOrFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * @return id operator image
	 */
	@Override
	protected String getIdImageOperator() {
		return EaImageProvider.IMG_OR_DIAG;
	}

}
