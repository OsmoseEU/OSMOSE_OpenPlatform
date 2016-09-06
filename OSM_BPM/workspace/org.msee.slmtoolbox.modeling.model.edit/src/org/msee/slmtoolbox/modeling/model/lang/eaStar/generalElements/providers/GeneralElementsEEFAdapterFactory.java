/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.providers;

import org.eclipse.emf.common.notify.Adapter;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.util.GeneralElementsAdapterFactory;

/**
 * 
 * 
 */
public class GeneralElementsEEFAdapterFactory extends GeneralElementsAdapterFactory {

	/**
	 * {@inheritDoc}
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.util.GeneralElementsAdapterFactory#createEaProcessAdapter()
	 * 
	 */
	public Adapter createEaProcessAdapter() {
		return new EaProcessPropertiesEditionProvider();
	}

}
