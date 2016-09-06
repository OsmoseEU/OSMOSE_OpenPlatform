/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.parts.RootViewsRepository;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.parts.forms.GgModelPropertiesEditionPartForm;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.parts.impl.GgModelPropertiesEditionPartImpl;

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
		if (key == RootViewsRepository.GgModel.class) {
			if (kind == RootViewsRepository.SWT_KIND)
				return new GgModelPropertiesEditionPartImpl(component);
			if (kind == RootViewsRepository.FORM_KIND)
				return new GgModelPropertiesEditionPartForm(component);
		}
		return null;
	}

}
