/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.root.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.parts.RootViewsRepository;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.parts.forms.EaModelPropertiesEditionPartForm;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.parts.impl.EaModelPropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class RootPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == RootViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == RootViewsRepository.EaModel.class) {
			if (kind == RootViewsRepository.SWT_KIND)
				return new EaModelPropertiesEditionPartImpl(component);
			if (kind == RootViewsRepository.FORM_KIND)
				return new EaModelPropertiesEditionPartForm(component);
		}
		return null;
	}

}
