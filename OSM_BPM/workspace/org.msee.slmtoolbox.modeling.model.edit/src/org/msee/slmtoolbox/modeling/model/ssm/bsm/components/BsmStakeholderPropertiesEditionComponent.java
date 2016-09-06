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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmStakeholderPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BsmStakeholderPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public BsmStakeholderPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bsmStakeholder, String editing_mode) {
		super(editingContext, bsmStakeholder, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BsmViewsRepository.class;
		partKey = BsmViewsRepository.BsmStakeholder.class;
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
			final BsmStakeholder bsmStakeholder = (BsmStakeholder)elt;
			final BsmStakeholderPropertiesEditionPart basePart = (BsmStakeholderPropertiesEditionPart)editingPart;
			// init values
			if (bsmStakeholder.getName() != null && isAccessible(BsmViewsRepository.BsmStakeholder.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmStakeholder.getName()));
			
			if (bsmStakeholder.getType() != null && isAccessible(BsmViewsRepository.BsmStakeholder.Properties.type))
				basePart.setType(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmStakeholder.getType()));
			
			if (bsmStakeholder.getConcern() != null && isAccessible(BsmViewsRepository.BsmStakeholder.Properties.concern))
				basePart.setConcern(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmStakeholder.getConcern()));
			
			if (bsmStakeholder.getConstraint() != null && isAccessible(BsmViewsRepository.BsmStakeholder.Properties.constraint))
				basePart.setConstraint(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmStakeholder.getConstraint()));
			
			if (bsmStakeholder.getRole() != null && isAccessible(BsmViewsRepository.BsmStakeholder.Properties.role))
				basePart.setRole(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmStakeholder.getRole()));
			
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
		if (editorKey == BsmViewsRepository.BsmStakeholder.Properties.name) {
			return BsmPackage.eINSTANCE.getBsmStakeholder_Name();
		}
		if (editorKey == BsmViewsRepository.BsmStakeholder.Properties.type) {
			return BsmPackage.eINSTANCE.getBsmStakeholder_Type();
		}
		if (editorKey == BsmViewsRepository.BsmStakeholder.Properties.concern) {
			return BsmPackage.eINSTANCE.getBsmStakeholder_Concern();
		}
		if (editorKey == BsmViewsRepository.BsmStakeholder.Properties.constraint) {
			return BsmPackage.eINSTANCE.getBsmStakeholder_Constraint();
		}
		if (editorKey == BsmViewsRepository.BsmStakeholder.Properties.role) {
			return BsmPackage.eINSTANCE.getBsmStakeholder_Role();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BsmStakeholder bsmStakeholder = (BsmStakeholder)semanticObject;
		if (BsmViewsRepository.BsmStakeholder.Properties.name == event.getAffectedEditor()) {
			bsmStakeholder.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmStakeholder.Properties.type == event.getAffectedEditor()) {
			bsmStakeholder.setType((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmStakeholder.Properties.concern == event.getAffectedEditor()) {
			bsmStakeholder.setConcern((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmStakeholder.Properties.constraint == event.getAffectedEditor()) {
			bsmStakeholder.setConstraint((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmStakeholder.Properties.role == event.getAffectedEditor()) {
			bsmStakeholder.setRole((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			BsmStakeholderPropertiesEditionPart basePart = (BsmStakeholderPropertiesEditionPart)editingPart;
			if (BsmPackage.eINSTANCE.getBsmStakeholder_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmStakeholder.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmStakeholder_Type().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmStakeholder.Properties.type)) {
				if (msg.getNewValue() != null) {
					basePart.setType(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setType("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmStakeholder_Concern().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmStakeholder.Properties.concern)) {
				if (msg.getNewValue() != null) {
					basePart.setConcern(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setConcern("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmStakeholder_Constraint().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmStakeholder.Properties.constraint)) {
				if (msg.getNewValue() != null) {
					basePart.setConstraint(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setConstraint("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmStakeholder_Role().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmStakeholder.Properties.role)) {
				if (msg.getNewValue() != null) {
					basePart.setRole(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setRole("");
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
				if (BsmViewsRepository.BsmStakeholder.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmStakeholder_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmStakeholder_Name().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmStakeholder.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmStakeholder_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmStakeholder_Type().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmStakeholder.Properties.concern == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmStakeholder_Concern().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmStakeholder_Concern().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmStakeholder.Properties.constraint == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmStakeholder_Constraint().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmStakeholder_Constraint().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmStakeholder.Properties.role == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmStakeholder_Role().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmStakeholder_Role().getEAttributeType(), newValue);
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
