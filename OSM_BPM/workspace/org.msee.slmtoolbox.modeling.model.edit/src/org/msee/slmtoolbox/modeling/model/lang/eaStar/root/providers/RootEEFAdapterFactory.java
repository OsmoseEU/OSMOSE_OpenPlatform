/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.root.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.util.RootAdapterFactory;

/**
 * 
 * 
 */
public class RootEEFAdapterFactory extends RootAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.root.util.RootAdapterFactory#createEaModelAdapter()
	 * 
	 */
	public Adapter createEaModelAdapter() {
		return new EaModelPropertiesEditionProvider();
	}

}
