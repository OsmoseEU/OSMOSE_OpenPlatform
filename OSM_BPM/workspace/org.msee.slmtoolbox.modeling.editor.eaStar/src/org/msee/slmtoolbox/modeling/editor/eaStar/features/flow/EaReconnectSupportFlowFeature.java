/**
 * 
 */
package org.msee.slmtoolbox.modeling.editor.eaStar.features.flow;


import org.eclipse.graphiti.features.IFeatureProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaSupportFLowUtil;


/**
 * @author HBA6
 *
 */
public class EaReconnectSupportFlowFeature extends AbstractEaReconnectFeature<EaSupportFLowUtil> {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public EaReconnectSupportFlowFeature(IFeatureProvider fp) {
		super(fp, new EaSupportFLowUtil(fp));
	}
}
