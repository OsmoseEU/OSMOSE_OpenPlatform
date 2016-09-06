/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.providers;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.api.providers.IPropertiesEditionPartProvider;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmComponentPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmCustomerPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmDecisionObjectivePropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmDecisionPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmDecisionStructurePropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmDecisionVariablePropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmEnterprisePropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmFunctionalityPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmModelPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmMseServicePropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmPartnerPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmPerformanceIndicatorPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmPiFieldPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmProcessPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmProductPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmResourcePropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmServicePropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmStakeholderPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmVEParticipationPropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmValuePropertiesEditionPartForm;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms.BsmVirtualEnterprisePropertiesEditionPartForm;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmComponentPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmCustomerPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmDecisionObjectivePropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmDecisionPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmDecisionStructurePropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmDecisionVariablePropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmEnterprisePropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmFunctionalityPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmModelPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmMseServicePropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmPartnerPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmPerformanceIndicatorPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmPiFieldPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmProcessPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmProductPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmResourcePropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmServicePropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmStakeholderPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmVEParticipationPropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmValuePropertiesEditionPartImpl;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl.BsmVirtualEnterprisePropertiesEditionPartImpl;

/**
 * 
 * 
 */
public class BsmPropertiesEditionPartProvider implements IPropertiesEditionPartProvider {

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#provides(java.lang.Object)
	 * 
	 */
	public boolean provides(Object key) {
		return key == BsmViewsRepository.class;
	}

	/** 
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPartProvider#getPropertiesEditionPart(java.lang.Object, int, org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent)
	 * 
	 */
	public IPropertiesEditionPart getPropertiesEditionPart(Object key, int kind, IPropertiesEditionComponent component) {
		if (key == BsmViewsRepository.BsmModel.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmModelPropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmModelPropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmService.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmServicePropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmServicePropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmCustomer.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmCustomerPropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmCustomerPropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmStakeholder.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmStakeholderPropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmStakeholderPropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmPartner.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmPartnerPropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmPartnerPropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmProduct.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmProductPropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmProductPropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmComponent.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmComponentPropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmComponentPropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmFunctionality.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmFunctionalityPropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmFunctionalityPropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmResource.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmResourcePropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmResourcePropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmProcess.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmProcessPropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmProcessPropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmDecision.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmDecisionPropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmDecisionPropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmDecisionStructure.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmDecisionStructurePropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmDecisionStructurePropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmEnterprise.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmEnterprisePropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmEnterprisePropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmVirtualEnterprise.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmVirtualEnterprisePropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmVirtualEnterprisePropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmVEParticipation.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmVEParticipationPropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmVEParticipationPropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmValue.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmValuePropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmValuePropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmPerformanceIndicator.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmPerformanceIndicatorPropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmPerformanceIndicatorPropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmPiField.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmPiFieldPropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmPiFieldPropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmDecisionVariable.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmDecisionVariablePropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmDecisionVariablePropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmDecisionObjective.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmDecisionObjectivePropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmDecisionObjectivePropertiesEditionPartForm(component);
		}
		if (key == BsmViewsRepository.BsmMseService.class) {
			if (kind == BsmViewsRepository.SWT_KIND)
				return new BsmMseServicePropertiesEditionPartImpl(component);
			if (kind == BsmViewsRepository.FORM_KIND)
				return new BsmMseServicePropertiesEditionPartForm(component);
		}
		return null;
	}

}
