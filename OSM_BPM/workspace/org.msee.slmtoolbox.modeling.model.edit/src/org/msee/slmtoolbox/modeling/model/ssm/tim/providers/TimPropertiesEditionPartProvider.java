/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import org.msee.slmtoolbox.modeling.model.ssm.tim.parts.TimViewsRepository;

import org.msee.slmtoolbox.modeling.model.ssm.tim.parts.forms.TimModelPropertiesEditionPartForm;

import org.msee.slmtoolbox.modeling.model.ssm.tim.parts.impl.TimModelPropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class TimPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == TimViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == TimViewsRepository.TimModel.class) {
			if (kind == TimViewsRepository.SWT_KIND)
				return new TimModelPropertiesEditionPartImpl(component);
			if (kind == TimViewsRepository.FORM_KIND)
				return new TimModelPropertiesEditionPartForm(component);
		}
		return null;
	}

}
