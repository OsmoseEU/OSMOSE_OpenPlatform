/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.util.RootAdapterFactory;

/**
 * 
 * 
 */
public class RootEEFAdapterFactory extends RootAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.util.RootAdapterFactory#createGgModelAdapter()
	 * 
	 */
	public Adapter createGgModelAdapter() {
		return new GgModelPropertiesEditionProvider();
	}

}
