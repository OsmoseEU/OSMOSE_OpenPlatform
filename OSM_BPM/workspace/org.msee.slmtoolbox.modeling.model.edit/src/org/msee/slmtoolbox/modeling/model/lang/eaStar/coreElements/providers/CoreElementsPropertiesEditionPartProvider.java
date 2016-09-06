/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.CoreElementsViewsRepository;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms.EaAndPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms.EaAtomicExtendedActivityPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms.EaControlFlowPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms.EaConvergingAndPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms.EaConvergingOrPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms.EaDivergingAndPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms.EaDivergingOrPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms.EaExternalConnectorPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms.EaHumanResourcePropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms.EaITResourcePropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms.EaInternalConnectorPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms.EaMaterialResourcePropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms.EaOrPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms.EaOrganizationPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms.EaOutputInputFlowPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms.EaProcessConnectorPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms.EaStructuralExtendedActivityPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms.EaSupportFlowPropertiesEditionPartForm;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl.EaAndPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl.EaAtomicExtendedActivityPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl.EaControlFlowPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl.EaConvergingAndPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl.EaConvergingOrPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl.EaDivergingAndPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl.EaDivergingOrPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl.EaExternalConnectorPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl.EaHumanResourcePropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl.EaITResourcePropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl.EaInternalConnectorPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl.EaMaterialResourcePropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl.EaOrPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl.EaOrganizationPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl.EaOutputInputFlowPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl.EaProcessConnectorPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl.EaStructuralExtendedActivityPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl.EaSupportFlowPropertiesEditionPartImpl;

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
		if (key == CoreElementsViewsRepository.EaITResource.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new EaITResourcePropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new EaITResourcePropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.EaHumanResource.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new EaHumanResourcePropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new EaHumanResourcePropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.EaMaterialResource.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new EaMaterialResourcePropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new EaMaterialResourcePropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.EaOr.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new EaOrPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new EaOrPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.EaAnd.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new EaAndPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new EaAndPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.EaDivergingAnd.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new EaDivergingAndPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new EaDivergingAndPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.EaDivergingOr.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new EaDivergingOrPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new EaDivergingOrPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.EaConvergingAnd.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new EaConvergingAndPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new EaConvergingAndPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.EaConvergingOr.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new EaConvergingOrPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new EaConvergingOrPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.EaInternalConnector.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new EaInternalConnectorPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new EaInternalConnectorPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.EaExternalConnector.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new EaExternalConnectorPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new EaExternalConnectorPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.EaProcessConnector.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new EaProcessConnectorPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new EaProcessConnectorPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.EaOutputInputFlow.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new EaOutputInputFlowPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new EaOutputInputFlowPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.EaSupportFlow.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new EaSupportFlowPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new EaSupportFlowPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.EaControlFlow.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new EaControlFlowPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new EaControlFlowPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.EaOrganization.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new EaOrganizationPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new EaOrganizationPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new EaAtomicExtendedActivityPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new EaAtomicExtendedActivityPropertiesEditionPartForm(component);
		}
		if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.class) {
			if (kind == CoreElementsViewsRepository.SWT_KIND)
				return new EaStructuralExtendedActivityPropertiesEditionPartImpl(component);
			if (kind == CoreElementsViewsRepository.FORM_KIND)
				return new EaStructuralExtendedActivityPropertiesEditionPartForm(component);
		}
		return null;
	}

}
