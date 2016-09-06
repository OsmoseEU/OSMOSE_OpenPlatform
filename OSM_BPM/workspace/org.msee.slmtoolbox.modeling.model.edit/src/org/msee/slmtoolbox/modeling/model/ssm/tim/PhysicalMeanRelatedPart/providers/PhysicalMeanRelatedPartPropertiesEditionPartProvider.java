/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.PhysicalMeanRelatedPartViewsRepository;

import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.forms.TimPhysicalMeanResourcePropertiesEditionPartForm;

import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.impl.TimPhysicalMeanResourcePropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class PhysicalMeanRelatedPartPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == PhysicalMeanRelatedPartViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.class) {
			if (kind == PhysicalMeanRelatedPartViewsRepository.SWT_KIND)
				return new TimPhysicalMeanResourcePropertiesEditionPartImpl(component);
			if (kind == PhysicalMeanRelatedPartViewsRepository.FORM_KIND)
				return new TimPhysicalMeanResourcePropertiesEditionPartForm(component);
		}
		return null;
	}

}
