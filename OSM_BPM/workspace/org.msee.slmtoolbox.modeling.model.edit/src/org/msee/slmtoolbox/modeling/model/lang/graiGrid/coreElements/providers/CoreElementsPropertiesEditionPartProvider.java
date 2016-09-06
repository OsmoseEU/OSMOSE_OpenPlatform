/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.CoreElementsViewsRepository;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.forms.GgCollaborativeDecisionPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.forms.GgDecisionCenterPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.forms.GgDecisionFramePropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.forms.GgExternalInformationSourcePropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.forms.GgFunctionPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.forms.GgInformationCenterPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.forms.GgInformationFlowPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.forms.GgInternalInformationSourcePropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.forms.GgLevelPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.forms.GgTimeValuePropertiesEditionPartForm;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.impl.GgCollaborativeDecisionPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.impl.GgDecisionCenterPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.impl.GgDecisionFramePropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.impl.GgExternalInformationSourcePropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.impl.GgFunctionPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.impl.GgInformationCenterPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.impl.GgInformationFlowPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.impl.GgInternalInformationSourcePropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.impl.GgLevelPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.impl.GgTimeValuePropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class CoreElementsPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == CoreElementsViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == CoreElementsViewsRepository.GgFunction.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new GgFunctionPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new GgFunctionPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.GgLevel.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new GgLevelPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new GgLevelPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.GgDecisionFrame.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new GgDecisionFramePropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new GgDecisionFramePropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.GgInformationFlow.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new GgInformationFlowPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new GgInformationFlowPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.GgCollaborativeDecision.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new GgCollaborativeDecisionPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new GgCollaborativeDecisionPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.GgDecisionCenter.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new GgDecisionCenterPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new GgDecisionCenterPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.GgTimeValue.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new GgTimeValuePropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new GgTimeValuePropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.GgExternalInformationSource.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new GgExternalInformationSourcePropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new GgExternalInformationSourcePropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.GgInternalInformationSource.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new GgInternalInformationSourcePropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new GgInternalInformationSourcePropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.GgInformationCenter.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new GgInformationCenterPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new GgInformationCenterPropertiesEditionPartForm(component);
		}
		return null;
	}

}
