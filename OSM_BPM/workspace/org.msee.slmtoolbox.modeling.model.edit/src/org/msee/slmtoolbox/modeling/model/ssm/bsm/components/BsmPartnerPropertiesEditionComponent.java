/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPartnerPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BsmPartnerPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public BsmPartnerPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bsmPartner, String editing_mode) {
		super(editingContext, bsmPartner, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BsmViewsRepository.class;
		partKey = BsmViewsRepository.BsmPartner.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#initPart(java.lang.Object, int, org.eclipse.emf.ecore.EObject, 
	 *      org.eclipse.emf.ecore.resource.ResourceSet)
	 * 
	 */
	public void initPart(Object key, int kind, EObject elt, ResourceSet allResource) {
		setInitializing(true);
		if (editingPart != null && key == partKey) {
			editingPart.setContext(elt, allResource);
			final BsmPartner bsmPartner = (BsmPartner)elt;
			final BsmPartnerPropertiesEditionPart basePart = (BsmPartnerPropertiesEditionPart)editingPart;
			// init values
			if (bsmPartner.getName() != null && isAccessible(BsmViewsRepository.BsmPartner.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmPartner.getName()));
			
			if (bsmPartner.getCategory() != null && isAccessible(BsmViewsRepository.BsmPartner.Properties.category))
				basePart.setCategory(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmPartner.getCategory()));
			
			if (bsmPartner.getCompetence() != null && isAccessible(BsmViewsRepository.BsmPartner.Properties.competence))
				basePart.setCompetence(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmPartner.getCompetence()));
			
			if (bsmPartner.getConcern() != null && isAccessible(BsmViewsRepository.BsmPartner.Properties.concern))
				basePart.setConcern(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmPartner.getConcern()));
			
			if (bsmPartner.getConstraint() != null && isAccessible(BsmViewsRepository.BsmPartner.Properties.constraint))
				basePart.setConstraint(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmPartner.getConstraint()));
			
			if (bsmPartner.getContribution() != null && isAccessible(BsmViewsRepository.BsmPartner.Properties.contribution))
				basePart.setContribution(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmPartner.getContribution()));
			
			// init filters
			
			
			
			
			
			
			// init values for referenced views
			
			// init filters for referenced views
			
		}
		setInitializing(false);
	}









	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#associatedFeature(java.lang.Object)
	 */
	public EStructuralFeature associatedFeature(Object editorKey) {
		if (editorKey == BsmViewsRepository.BsmPartner.Properties.name) {
			return BsmPackage.eINSTANCE.getBsmPartner_Name();
		}
		if (editorKey == BsmViewsRepository.BsmPartner.Properties.category) {
			return BsmPackage.eINSTANCE.getBsmPartner_Category();
		}
		if (editorKey == BsmViewsRepository.BsmPartner.Properties.competence) {
			return BsmPackage.eINSTANCE.getBsmPartner_Competence();
		}
		if (editorKey == BsmViewsRepository.BsmPartner.Properties.concern) {
			return BsmPackage.eINSTANCE.getBsmPartner_Concern();
		}
		if (editorKey == BsmViewsRepository.BsmPartner.Properties.constraint) {
			return BsmPackage.eINSTANCE.getBsmPartner_Constraint();
		}
		if (editorKey == BsmViewsRepository.BsmPartner.Properties.contribution) {
			return BsmPackage.eINSTANCE.getBsmPartner_Contribution();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BsmPartner bsmPartner = (BsmPartner)semanticObject;
		if (BsmViewsRepository.BsmPartner.Properties.name == event.getAffectedEditor()) {
			bsmPartner.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmPartner.Properties.category == event.getAffectedEditor()) {
			bsmPartner.setCategory((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmPartner.Properties.competence == event.getAffectedEditor()) {
			bsmPartner.setCompetence((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmPartner.Properties.concern == event.getAffectedEditor()) {
			bsmPartner.setConcern((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmPartner.Properties.constraint == event.getAffectedEditor()) {
			bsmPartner.setConstraint((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmPartner.Properties.contribution == event.getAffectedEditor()) {
			bsmPartner.setContribution((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			BsmPartnerPropertiesEditionPart basePart = (BsmPartnerPropertiesEditionPart)editingPart;
			if (BsmPackage.eINSTANCE.getBsmPartner_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPartner.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmPartner_Category().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPartner.Properties.category)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCategory("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmPartner_Competence().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPartner.Properties.competence)) {
				if (msg.getNewValue() != null) {
					basePart.setCompetence(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCompetence("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmPartner_Concern().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPartner.Properties.concern)) {
				if (msg.getNewValue() != null) {
					basePart.setConcern(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setConcern("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmPartner_Constraint().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPartner.Properties.constraint)) {
				if (msg.getNewValue() != null) {
					basePart.setConstraint(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setConstraint("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmPartner_Contribution().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPartner.Properties.contribution)) {
				if (msg.getNewValue() != null) {
					basePart.setContribution(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setContribution("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (BsmViewsRepository.BsmPartner.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmPartner_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmPartner_Name().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmPartner.Properties.category == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmPartner_Category().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmPartner_Category().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmPartner.Properties.competence == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmPartner_Competence().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmPartner_Competence().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmPartner.Properties.concern == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmPartner_Concern().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmPartner_Concern().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmPartner.Properties.constraint == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmPartner_Constraint().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmPartner_Constraint().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmPartner.Properties.contribution == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmPartner_Contribution().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmPartner_Contribution().getEAttributeType(), newValue);
				}
			} catch (IllegalArgumentException iae) {
				ret = BasicDiagnostic.toDiagnostic(iae);
			} catch (WrappedException we) {
				ret = BasicDiagnostic.toDiagnostic(we);
			}
		}
		return ret;
	}

}
