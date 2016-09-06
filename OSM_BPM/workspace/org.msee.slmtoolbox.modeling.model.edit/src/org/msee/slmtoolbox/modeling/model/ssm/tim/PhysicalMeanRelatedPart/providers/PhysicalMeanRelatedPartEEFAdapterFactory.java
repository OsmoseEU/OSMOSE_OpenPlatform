/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.util.PhysicalMeanRelatedPartAdapterFactory;

/**
 * 
 * 
 */
public class PhysicalMeanRelatedPartEEFAdapterFactory extends PhysicalMeanRelatedPartAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.util.PhysicalMeanRelatedPartAdapterFactory#createTimPhysicalMeanResourceAdapter()
	 * 
	 */
	public Adapter createTimPhysicalMeanResourceAdapter() {
		return new TimPhysicalMeanResourcePropertiesEditionProvider();
	}

}
