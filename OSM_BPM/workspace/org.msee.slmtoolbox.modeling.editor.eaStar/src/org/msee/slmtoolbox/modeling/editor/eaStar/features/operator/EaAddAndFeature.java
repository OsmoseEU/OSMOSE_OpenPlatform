package org.msee.slmtoolbox.modeling.editor.eaStar.features.operator;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;

/**
 * Class for logical And operator add feature
 * @author fto
 *
 */
public class EaAddAndFeature extends AbstractEaAddLogicalOperator {
	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaAddAndFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * @return id operator image
	 */
	@Override
	protected String getIdImageOperator() {
		return EaImageProvider.IMG_AND_DIAG;
	}

}
