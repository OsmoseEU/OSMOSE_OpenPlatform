/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.util.ITRelatedPartAdapterFactory;

/**
 * 
 * 
 */
public class ITRelatedPartEEFAdapterFactory extends ITRelatedPartAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.util.ITRelatedPartAdapterFactory#createTimEnterpriseApplicationResourceAdapter()
	 * 
	 */
	public Adapter createTimEnterpriseApplicationResourceAdapter() {
		return new TimEnterpriseApplicationResourcePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.util.ITRelatedPartAdapterFactory#createTimInformationSetAdapter()
	 * 
	 */
	public Adapter createTimInformationSetAdapter() {
		return new TimInformationSetPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.util.ITRelatedPartAdapterFactory#createTimInformationEntityAdapter()
	 * 
	 */
	public Adapter createTimInformationEntityAdapter() {
		return new TimInformationEntityPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.util.ITRelatedPartAdapterFactory#createTimInformationRelationshipAdapter()
	 * 
	 */
	public Adapter createTimInformationRelationshipAdapter() {
		return new TimInformationRelationshipPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.util.ITRelatedPartAdapterFactory#createTimInformationAttributeAdapter()
	 * 
	 */
	public Adapter createTimInformationAttributeAdapter() {
		return new TimInformationAttributePropertiesEditionProvider();
	}

}
