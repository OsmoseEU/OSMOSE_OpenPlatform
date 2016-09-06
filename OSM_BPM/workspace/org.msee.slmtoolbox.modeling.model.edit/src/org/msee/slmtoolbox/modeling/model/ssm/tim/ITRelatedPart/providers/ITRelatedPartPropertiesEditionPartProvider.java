/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.ITRelatedPartViewsRepository;

import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.forms.TimEnterpriseApplicationResourcePropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.forms.TimInformationAttributePropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.forms.TimInformationEntityPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.forms.TimInformationRelationshipPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.forms.TimInformationSetPropertiesEditionPartForm;

import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.impl.TimEnterpriseApplicationResourcePropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.impl.TimInformationAttributePropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.impl.TimInformationEntityPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.impl.TimInformationRelationshipPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.impl.TimInformationSetPropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class ITRelatedPartPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == ITRelatedPartViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.class) {
			if (kind == ITRelatedPartViewsRepository.SWT_KIND)
				return new TimEnterpriseApplicationResourcePropertiesEditionPartImpl(component);
			if (kind == ITRelatedPartViewsRepository.FORM_KIND)
				return new TimEnterpriseApplicationResourcePropertiesEditionPartForm(component);
		}
		if (key == ITRelatedPartViewsRepository.TimInformationSet.class) {
			if (kind == ITRelatedPartViewsRepository.SWT_KIND)
				return new TimInformationSetPropertiesEditionPartImpl(component);
			if (kind == ITRelatedPartViewsRepository.FORM_KIND)
				return new TimInformationSetPropertiesEditionPartForm(component);
		}
		if (key == ITRelatedPartViewsRepository.TimInformationEntity.class) {
			if (kind == ITRelatedPartViewsRepository.SWT_KIND)
				return new TimInformationEntityPropertiesEditionPartImpl(component);
			if (kind == ITRelatedPartViewsRepository.FORM_KIND)
				return new TimInformationEntityPropertiesEditionPartForm(component);
		}
		if (key == ITRelatedPartViewsRepository.TimInformationRelationship.class) {
			if (kind == ITRelatedPartViewsRepository.SWT_KIND)
				return new TimInformationRelationshipPropertiesEditionPartImpl(component);
			if (kind == ITRelatedPartViewsRepository.FORM_KIND)
				return new TimInformationRelationshipPropertiesEditionPartForm(component);
		}
		if (key == ITRelatedPartViewsRepository.TimInformationAttribute.class) {
			if (kind == ITRelatedPartViewsRepository.SWT_KIND)
				return new TimInformationAttributePropertiesEditionPartImpl(component);
			if (kind == ITRelatedPartViewsRepository.FORM_KIND)
				return new TimInformationAttributePropertiesEditionPartForm(component);
		}
		return null;
	}

}
