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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmGender;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BsmCustomerPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public BsmCustomerPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bsmCustomer, String editing_mode) {
		super(editingContext, bsmCustomer, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BsmViewsRepository.class;
		partKey = BsmViewsRepository.BsmCustomer.class;
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
			final BsmCustomer bsmCustomer = (BsmCustomer)elt;
			final BsmCustomerPropertiesEditionPart basePart = (BsmCustomerPropertiesEditionPart)editingPart;
			// init values
			if (bsmCustomer.getName() != null && isAccessible(BsmViewsRepository.BsmCustomer.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmCustomer.getName()));
			
			if (bsmCustomer.getCategories() != null && isAccessible(BsmViewsRepository.BsmCustomer.Properties.categories))
				basePart.setCategories(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmCustomer.getCategories()));
			
			if (bsmCustomer.getLevelOfEducation() != null && isAccessible(BsmViewsRepository.BsmCustomer.Properties.levelOfEducation))
				basePart.setLevelOfEducation(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmCustomer.getLevelOfEducation()));
			
			if (isAccessible(BsmViewsRepository.BsmCustomer.Properties.gender)) {
				// Start of user code  for horizon
				basePart.initGender(
						new BsmGender [] {
								BsmGender.FEMALE,
								BsmGender.MALE,
						}
						, bsmCustomer.getGender());
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmCustomer.Properties.age)) {
				basePart.setAge(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, bsmCustomer.getAge()));
			}
			
			if (isAccessible(BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange)) {
				basePart.setAnnualRevenueRange(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, bsmCustomer.getAnnualRevenueRange()));
			}
			
			if (bsmCustomer.getRequirement() != null && isAccessible(BsmViewsRepository.BsmCustomer.Properties.requirement))
				basePart.setRequirement(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmCustomer.getRequirement()));
			
			if (bsmCustomer.getConstraint() != null && isAccessible(BsmViewsRepository.BsmCustomer.Properties.constraint))
				basePart.setConstraint(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmCustomer.getConstraint()));
			
			if (isAccessible(BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq)) {
				basePart.setTargetedUsageFreq(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, bsmCustomer.getTargetedUsageFreq()));
			}
			
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
		if (editorKey == BsmViewsRepository.BsmCustomer.Properties.name) {
			return BsmPackage.eINSTANCE.getBsmCustomer_Name();
		}
		if (editorKey == BsmViewsRepository.BsmCustomer.Properties.categories) {
			return BsmPackage.eINSTANCE.getBsmCustomer_Categories();
		}
		if (editorKey == BsmViewsRepository.BsmCustomer.Properties.levelOfEducation) {
			return BsmPackage.eINSTANCE.getBsmCustomer_LevelOfEducation();
		}
		if (editorKey == BsmViewsRepository.BsmCustomer.Properties.gender) {
			return BsmPackage.eINSTANCE.getBsmCustomer_Gender();
		}
		if (editorKey == BsmViewsRepository.BsmCustomer.Properties.age) {
			return BsmPackage.eINSTANCE.getBsmCustomer_Age();
		}
		if (editorKey == BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange) {
			return BsmPackage.eINSTANCE.getBsmCustomer_AnnualRevenueRange();
		}
		if (editorKey == BsmViewsRepository.BsmCustomer.Properties.requirement) {
			return BsmPackage.eINSTANCE.getBsmCustomer_Requirement();
		}
		if (editorKey == BsmViewsRepository.BsmCustomer.Properties.constraint) {
			return BsmPackage.eINSTANCE.getBsmCustomer_Constraint();
		}
		if (editorKey == BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq) {
			return BsmPackage.eINSTANCE.getBsmCustomer_TargetedUsageFreq();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BsmCustomer bsmCustomer = (BsmCustomer)semanticObject;
		if (BsmViewsRepository.BsmCustomer.Properties.name == event.getAffectedEditor()) {
			bsmCustomer.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmCustomer.Properties.categories == event.getAffectedEditor()) {
			bsmCustomer.setCategories((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmCustomer.Properties.levelOfEducation == event.getAffectedEditor()) {
			bsmCustomer.setLevelOfEducation((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmCustomer.Properties.gender == event.getAffectedEditor()) {
			bsmCustomer.setGender((BsmGender)event.getNewValue());
		}
		if (BsmViewsRepository.BsmCustomer.Properties.age == event.getAffectedEditor()) {
			bsmCustomer.setAge((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange == event.getAffectedEditor()) {
			bsmCustomer.setAnnualRevenueRange((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (BsmViewsRepository.BsmCustomer.Properties.requirement == event.getAffectedEditor()) {
			bsmCustomer.setRequirement((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmCustomer.Properties.constraint == event.getAffectedEditor()) {
			bsmCustomer.setConstraint((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq == event.getAffectedEditor()) {
			bsmCustomer.setTargetedUsageFreq((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			BsmCustomerPropertiesEditionPart basePart = (BsmCustomerPropertiesEditionPart)editingPart;
			if (BsmPackage.eINSTANCE.getBsmCustomer_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmCustomer.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmCustomer_Categories().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmCustomer.Properties.categories)) {
				if (msg.getNewValue() != null) {
					basePart.setCategories(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCategories("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmCustomer_LevelOfEducation().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmCustomer.Properties.levelOfEducation)) {
				if (msg.getNewValue() != null) {
					basePart.setLevelOfEducation(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setLevelOfEducation("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmCustomer_Gender().equals(msg.getFeature()) && isAccessible(BsmViewsRepository.BsmCustomer.Properties.gender))
				basePart.setGender((BsmGender)msg.getNewValue());
			
			if (BsmPackage.eINSTANCE.getBsmCustomer_Age().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmCustomer.Properties.age)) {
				if (msg.getNewValue() != null) {
					basePart.setAge(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setAge("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmCustomer_AnnualRevenueRange().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange)) {
				if (msg.getNewValue() != null) {
					basePart.setAnnualRevenueRange(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setAnnualRevenueRange("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmCustomer_Requirement().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmCustomer.Properties.requirement)) {
				if (msg.getNewValue() != null) {
					basePart.setRequirement(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setRequirement("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmCustomer_Constraint().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmCustomer.Properties.constraint)) {
				if (msg.getNewValue() != null) {
					basePart.setConstraint(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setConstraint("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmCustomer_TargetedUsageFreq().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq)) {
				if (msg.getNewValue() != null) {
					basePart.setTargetedUsageFreq(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setTargetedUsageFreq("");
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
				if (BsmViewsRepository.BsmCustomer.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmCustomer_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmCustomer_Name().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmCustomer.Properties.categories == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmCustomer_Categories().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmCustomer_Categories().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmCustomer.Properties.levelOfEducation == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmCustomer_LevelOfEducation().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmCustomer_LevelOfEducation().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmCustomer.Properties.gender == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmCustomer_Gender().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmCustomer_Gender().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmCustomer.Properties.age == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmCustomer_Age().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmCustomer_Age().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmCustomer_AnnualRevenueRange().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmCustomer_AnnualRevenueRange().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmCustomer.Properties.requirement == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmCustomer_Requirement().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmCustomer_Requirement().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmCustomer.Properties.constraint == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmCustomer_Constraint().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmCustomer_Constraint().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmCustomer_TargetedUsageFreq().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmCustomer_TargetedUsageFreq().getEAttributeType(), newValue);
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
