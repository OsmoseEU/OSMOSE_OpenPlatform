/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.util.CommonConceptsAdapterFactory;

/**
 * 
 * 
 */
public class CommonConceptsEEFAdapterFactory extends CommonConceptsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.util.CommonConceptsAdapterFactory#createTimServiceAdapter()
	 * 
	 */
	public Adapter createTimServiceAdapter() {
		return new TimServicePropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.util.CommonConceptsAdapterFactory#createTimProcessAdapter()
	 * 
	 */
	public Adapter createTimProcessAdapter() {
		return new TimProcessPropertiesEditionProvider();
	}

}
