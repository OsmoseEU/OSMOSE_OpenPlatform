/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.msee.slmtoolbox.modeling.model.ssm.tim.util.TimAdapterFactory;

/**
 * 
 * 
 */
public class TimEEFAdapterFactory extends TimAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.util.TimAdapterFactory#createTimModelAdapter()
	 * 
	 */
	public Adapter createTimModelAdapter() {
		return new TimModelPropertiesEditionProvider();
	}

}
