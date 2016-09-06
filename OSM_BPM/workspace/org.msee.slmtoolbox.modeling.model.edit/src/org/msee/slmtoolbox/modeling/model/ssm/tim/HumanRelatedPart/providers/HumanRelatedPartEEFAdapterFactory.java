/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.util.HumanRelatedPartAdapterFactory;

/**
 * 
 * 
 */
public class HumanRelatedPartEEFAdapterFactory extends HumanRelatedPartAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.util.HumanRelatedPartAdapterFactory#createTimHumanResourceAdapter()
	 * 
	 */
	public Adapter createTimHumanResourceAdapter() {
		return new TimHumanResourcePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.util.HumanRelatedPartAdapterFactory#createTimOrganizationAdapter()
	 * 
	 */
	public Adapter createTimOrganizationAdapter() {
		return new TimOrganizationPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.util.HumanRelatedPartAdapterFactory#createTimOrganizationUnitAdapter()
	 * 
	 */
	public Adapter createTimOrganizationUnitAdapter() {
		return new TimOrganizationUnitPropertiesEditionProvider();
	}

}
