/**
 * 
 */
package org.msee.slmtoolbox.modeling.editor.eaStar.features.flow;


import org.eclipse.graphiti.features.IFeatureProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaInputOutputFlowUtil;


/**
 * @author HBA6
 *
 */
public class EaReconnectInputOutputFlowFeature extends AbstractEaReconnectFeature<EaInputOutputFlowUtil> {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public EaReconnectInputOutputFlowFeature(IFeatureProvider fp) {
		super(fp, new EaInputOutputFlowUtil(fp));
	}
}
