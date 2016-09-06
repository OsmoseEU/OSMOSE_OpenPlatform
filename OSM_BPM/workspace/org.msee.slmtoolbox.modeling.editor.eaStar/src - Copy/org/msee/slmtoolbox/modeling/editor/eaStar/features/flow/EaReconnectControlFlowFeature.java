/**
 * 
 */
package org.msee.slmtoolbox.modeling.editor.eaStar.features.flow;


import org.eclipse.graphiti.features.IFeatureProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaControlFlowUtil;


/**
 * @author HBA6
 *
 */
public class EaReconnectControlFlowFeature extends AbstractEaReconnectFeature<EaControlFlowUtil> {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public EaReconnectControlFlowFeature(IFeatureProvider fp) {
		super(fp, new EaControlFlowUtil(fp));
	}
}
