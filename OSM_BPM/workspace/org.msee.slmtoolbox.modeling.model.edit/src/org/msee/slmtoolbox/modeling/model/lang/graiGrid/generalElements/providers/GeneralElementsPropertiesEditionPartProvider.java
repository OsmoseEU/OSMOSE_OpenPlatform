/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.parts.GeneralElementsViewsRepository;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.parts.forms.GgGraiGridPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.parts.forms.GgOrganizationPropertiesEditionPartForm;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.parts.impl.GgGraiGridPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.parts.impl.GgOrganizationPropertiesEditionPartImpl;

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
		if (key == GeneralElementsViewsRepository.GgGraiGrid.class) {
			if (kind == GeneralElementsViewsRepository.SWT_KIND)
				return new GgGraiGridPropertiesEditionPartImpl(component);
			if (kind == GeneralElementsViewsRepository.FORM_KIND)
				return new GgGraiGridPropertiesEditionPartForm(component);
		}
		if (key == GeneralElementsViewsRepository.GgOrganization.class) {
			if (kind == GeneralElementsViewsRepository.SWT_KIND)
				return new GgOrganizationPropertiesEditionPartImpl(component);
			if (kind == GeneralElementsViewsRepository.FORM_KIND)
				return new GgOrganizationPropertiesEditionPartForm(component);
		}
		return null;
	}

}
