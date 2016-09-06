/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.CommonConceptsViewsRepository;

import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.forms.TimProcessPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.forms.TimServicePropertiesEditionPartForm;

import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.impl.TimProcessPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.impl.TimServicePropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class CommonConceptsPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == CommonConceptsViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == CommonConceptsViewsRepository.TimService.class) {
			if (kind == CommonConceptsViewsRepository.SWT_KIND)
				return new TimServicePropertiesEditionPartImpl(component);
			if (kind == CommonConceptsViewsRepository.FORM_KIND)
				return new TimServicePropertiesEditionPartForm(component);
		}
		if (key == CommonConceptsViewsRepository.TimProcess.class) {
			if (kind == CommonConceptsViewsRepository.SWT_KIND)
				return new TimProcessPropertiesEditionPartImpl(component);
			if (kind == CommonConceptsViewsRepository.FORM_KIND)
				return new TimProcessPropertiesEditionPartForm(component);
		}
		return null;
	}

}
