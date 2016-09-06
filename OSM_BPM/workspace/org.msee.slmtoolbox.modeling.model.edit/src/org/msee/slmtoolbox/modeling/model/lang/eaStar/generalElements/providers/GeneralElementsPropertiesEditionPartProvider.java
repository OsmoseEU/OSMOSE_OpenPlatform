/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.GeneralElementsViewsRepository;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.forms.EaProcessPropertiesEditionPartForm;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.impl.EaProcessPropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class GeneralElementsPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == GeneralElementsViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == GeneralElementsViewsRepository.EaProcess.class) {
			if (kind == GeneralElementsViewsRepository.SWT_KIND)
				return new EaProcessPropertiesEditionPartImpl(component);
			if (kind == GeneralElementsViewsRepository.FORM_KIND)
				return new EaProcessPropertiesEditionPartForm(component);
		}
		return null;
	}

}
