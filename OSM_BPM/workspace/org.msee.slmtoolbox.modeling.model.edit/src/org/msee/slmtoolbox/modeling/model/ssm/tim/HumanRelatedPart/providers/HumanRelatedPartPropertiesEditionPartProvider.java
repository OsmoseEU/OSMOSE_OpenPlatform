/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.HumanRelatedPartViewsRepository;

import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.forms.TimHumanResourcePropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.forms.TimOrganizationPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.forms.TimOrganizationUnitPropertiesEditionPartForm;

import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.impl.TimHumanResourcePropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.impl.TimOrganizationPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.impl.TimOrganizationUnitPropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class HumanRelatedPartPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == HumanRelatedPartViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == HumanRelatedPartViewsRepository.TimHumanResource.class) {
			if (kind == HumanRelatedPartViewsRepository.SWT_KIND)
				return new TimHumanResourcePropertiesEditionPartImpl(component);
			if (kind == HumanRelatedPartViewsRepository.FORM_KIND)
				return new TimHumanResourcePropertiesEditionPartForm(component);
		}
		if (key == HumanRelatedPartViewsRepository.TimOrganization.class) {
			if (kind == HumanRelatedPartViewsRepository.SWT_KIND)
				return new TimOrganizationPropertiesEditionPartImpl(component);
			if (kind == HumanRelatedPartViewsRepository.FORM_KIND)
				return new TimOrganizationPropertiesEditionPartForm(component);
		}
		if (key == HumanRelatedPartViewsRepository.TimOrganizationUnit.class) {
			if (kind == HumanRelatedPartViewsRepository.SWT_KIND)
				return new TimOrganizationUnitPropertiesEditionPartImpl(component);
			if (kind == HumanRelatedPartViewsRepository.FORM_KIND)
				return new TimOrganizationUnitPropertiesEditionPartForm(component);
		}
		return null;
	}

}
