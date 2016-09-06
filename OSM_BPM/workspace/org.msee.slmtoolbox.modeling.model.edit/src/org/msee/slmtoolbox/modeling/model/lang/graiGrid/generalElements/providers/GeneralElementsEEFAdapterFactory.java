/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.util.GeneralElementsAdapterFactory;

/**
 * 
 * 
 */
public class GeneralElementsEEFAdapterFactory extends GeneralElementsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.util.GeneralElementsAdapterFactory#createGgGraiGridAdapter()
	 * 
	 */
	public Adapter createGgGraiGridAdapter() {
		return new GgGraiGridPropertiesEditionProvider();
	}
	/**
	 * {@inheritDoc}
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.util.GeneralElementsAdapterFactory#createGgOrganizationAdapter()
	 * 
	 */
	public Adapter createGgOrganizationAdapter() {
		return new GgOrganizationPropertiesEditionProvider();
	}

}
