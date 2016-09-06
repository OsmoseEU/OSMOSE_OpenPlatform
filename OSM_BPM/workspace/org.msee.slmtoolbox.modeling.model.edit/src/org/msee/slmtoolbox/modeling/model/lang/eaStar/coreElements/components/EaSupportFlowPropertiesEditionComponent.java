/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.components;

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
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResourceRole;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;


// End of user code

/**
 * 
 * 
 */
public class EaSupportFlowPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public EaSupportFlowPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject eaSupportFlow, String editing_mode) {
		super(editingContext, eaSupportFlow, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CoreElementsViewsRepository.class;
		partKey = CoreElementsViewsRepository.EaSupportFlow.class;
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
			final EaSupportFlow eaSupportFlow = (EaSupportFlow)elt;
			final EaSupportFlowPropertiesEditionPart basePart = (EaSupportFlowPropertiesEditionPart)editingPart;
			// init values
			if (eaSupportFlow.getName() != null && isAccessible(CoreElementsViewsRepository.EaSupportFlow.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaSupportFlow.getName()));
			
			if (eaSupportFlow.getCode() != null && isAccessible(CoreElementsViewsRepository.EaSupportFlow.Properties.code))
				basePart.setCode(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaSupportFlow.getCode()));
			
			if (eaSupportFlow.getDescription() != null && isAccessible(CoreElementsViewsRepository.EaSupportFlow.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaSupportFlow.getDescription()));
			
			if (isAccessible(CoreElementsViewsRepository.EaSupportFlow.Properties.isTrigger)) {
				basePart.setIsTrigger(eaSupportFlow.isIsTrigger());
			}
			if (eaSupportFlow.getTriggerInfo() != null && isAccessible(CoreElementsViewsRepository.EaSupportFlow.Properties.triggerInfo))
				basePart.setTriggerInfo(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaSupportFlow.getTriggerInfo()));
			// Start of user code for additional initPart
			if (eaSupportFlow.getSource() != null && isAccessible(CoreElementsViewsRepository.EaSupportFlow.Properties.source)) {
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaSupportFlow.getSource().getName()));
			}
			// End of user code
			// Start of user code for additional initPart
			if (eaSupportFlow.getTarget() != null && isAccessible(CoreElementsViewsRepository.EaSupportFlow.Properties.target)) {
				basePart.setTarget(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaSupportFlow.getTarget().getName()));
			}
			// End of user code			
			if (isAccessible(CoreElementsViewsRepository.EaSupportFlow.Properties.resourceRole)) {
				basePart.initResourceRole(
						new EaResourceRole [] {
								EaResourceRole.PARTICIPATES_IN,
								EaResourceRole.RESPONSIBLE_FOR
						}
						, 
						eaSupportFlow.getResourceRole());
			}
			if (eaSupportFlow.getResponsibility() != null && isAccessible(CoreElementsViewsRepository.EaSupportFlow.Properties.responsibility))
				basePart.setResponsibility(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaSupportFlow.getResponsibility()));
			
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
		if (editorKey == CoreElementsViewsRepository.EaSupportFlow.Properties.name) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name();
		}
		if (editorKey == CoreElementsViewsRepository.EaSupportFlow.Properties.code) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code();
		}
		if (editorKey == CoreElementsViewsRepository.EaSupportFlow.Properties.description) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description();
		}
		if (editorKey == CoreElementsViewsRepository.EaSupportFlow.Properties.isTrigger) {
			return CoreElementsPackage.eINSTANCE.getEaFlow_IsTrigger();
		}
		if (editorKey == CoreElementsViewsRepository.EaSupportFlow.Properties.triggerInfo) {
			return CoreElementsPackage.eINSTANCE.getEaFlow_TriggerInfo();
		}
		if (editorKey == CoreElementsViewsRepository.EaSupportFlow.Properties.source) {
			return CoreElementsPackage.eINSTANCE.getEaFlow_Source();
		}
		if (editorKey == CoreElementsViewsRepository.EaSupportFlow.Properties.target) {
			return CoreElementsPackage.eINSTANCE.getEaFlow_Target();
		}
		if (editorKey == CoreElementsViewsRepository.EaSupportFlow.Properties.resourceRole) {
			return CoreElementsPackage.eINSTANCE.getEaSupportFlow_ResourceRole();
		}
		if (editorKey == CoreElementsViewsRepository.EaSupportFlow.Properties.responsibility) {
			return CoreElementsPackage.eINSTANCE.getEaSupportFlow_Responsibility();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EaSupportFlow eaSupportFlow = (EaSupportFlow)semanticObject;
		if (CoreElementsViewsRepository.EaSupportFlow.Properties.name == event.getAffectedEditor()) {
			eaSupportFlow.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaSupportFlow.Properties.code == event.getAffectedEditor()) {
			eaSupportFlow.setCode((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaSupportFlow.Properties.description == event.getAffectedEditor()) {
			eaSupportFlow.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaSupportFlow.Properties.isTrigger == event.getAffectedEditor()) {
			eaSupportFlow.setIsTrigger((Boolean)event.getNewValue());
		}
		if (CoreElementsViewsRepository.EaSupportFlow.Properties.triggerInfo == event.getAffectedEditor()) {
			eaSupportFlow.setTriggerInfo((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaSupportFlow.Properties.resourceRole == event.getAffectedEditor()) {
			eaSupportFlow.setResourceRole((EaResourceRole)event.getNewValue());
		}
		if (CoreElementsViewsRepository.EaSupportFlow.Properties.responsibility == event.getAffectedEditor()) {
			eaSupportFlow.setResponsibility((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			EaSupportFlowPropertiesEditionPart basePart = (EaSupportFlowPropertiesEditionPart)editingPart;
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaSupportFlow.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaSupportFlow.Properties.code)) {
				if (msg.getNewValue() != null) {
					basePart.setCode(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCode("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaSupportFlow.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (CoreElementsPackage.eINSTANCE.getEaFlow_IsTrigger().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaSupportFlow.Properties.isTrigger))
				basePart.setIsTrigger((Boolean)msg.getNewValue());
			
			if (CoreElementsPackage.eINSTANCE.getEaFlow_TriggerInfo().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaSupportFlow.Properties.triggerInfo)) {
				if (msg.getNewValue() != null) {
					basePart.setTriggerInfo(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setTriggerInfo("");
				}
			}
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : source, EaSupportFlow, EaSupportFlow.
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : target, EaSupportFlow, EaSupportFlow.
			if (CoreElementsPackage.eINSTANCE.getEaSupportFlow_ResourceRole().equals(msg.getFeature()) && isAccessible(CoreElementsViewsRepository.EaSupportFlow.Properties.resourceRole))
				basePart.setResourceRole((EaResourceRole)msg.getNewValue());
			
			if (CoreElementsPackage.eINSTANCE.getEaSupportFlow_Responsibility().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaSupportFlow.Properties.responsibility)) {
				if (msg.getNewValue() != null) {
					basePart.setResponsibility(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setResponsibility("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == CoreElementsViewsRepository.EaSupportFlow.Properties.source || key == CoreElementsViewsRepository.EaSupportFlow.Properties.target;
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
				if (CoreElementsViewsRepository.EaSupportFlow.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaSupportFlow.Properties.code == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaSupportFlow.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaSupportFlow.Properties.isTrigger == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaFlow_IsTrigger().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaFlow_IsTrigger().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaSupportFlow.Properties.triggerInfo == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaFlow_TriggerInfo().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaFlow_TriggerInfo().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaSupportFlow.Properties.resourceRole == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaSupportFlow_ResourceRole().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaSupportFlow_ResourceRole().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaSupportFlow.Properties.responsibility == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaSupportFlow_Responsibility().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaSupportFlow_Responsibility().getEAttributeType(), newValue);
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
