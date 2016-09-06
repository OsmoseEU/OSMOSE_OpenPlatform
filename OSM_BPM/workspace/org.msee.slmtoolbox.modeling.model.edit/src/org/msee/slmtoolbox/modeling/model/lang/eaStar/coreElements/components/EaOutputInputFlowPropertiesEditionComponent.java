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
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOutputInputFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaOutputInputFlowPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;


// End of user code

/**
 * 
 * 
 */
public class EaOutputInputFlowPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public EaOutputInputFlowPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject eaOutputInputFlow, String editing_mode) {
		super(editingContext, eaOutputInputFlow, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CoreElementsViewsRepository.class;
		partKey = CoreElementsViewsRepository.EaOutputInputFlow.class;
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
			final EaOutputInputFlow eaOutputInputFlow = (EaOutputInputFlow)elt;
			final EaOutputInputFlowPropertiesEditionPart basePart = (EaOutputInputFlowPropertiesEditionPart)editingPart;
			// init values
			if (eaOutputInputFlow.getName() != null && isAccessible(CoreElementsViewsRepository.EaOutputInputFlow.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaOutputInputFlow.getName()));
			
			if (eaOutputInputFlow.getCode() != null && isAccessible(CoreElementsViewsRepository.EaOutputInputFlow.Properties.code))
				basePart.setCode(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaOutputInputFlow.getCode()));
			
			if (eaOutputInputFlow.getDescription() != null && isAccessible(CoreElementsViewsRepository.EaOutputInputFlow.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaOutputInputFlow.getDescription()));
			
			if (isAccessible(CoreElementsViewsRepository.EaOutputInputFlow.Properties.isTrigger)) {
				basePart.setIsTrigger(eaOutputInputFlow.isIsTrigger());
			}
			if (eaOutputInputFlow.getTriggerInfo() != null && isAccessible(CoreElementsViewsRepository.EaOutputInputFlow.Properties.triggerInfo))
				basePart.setTriggerInfo(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaOutputInputFlow.getTriggerInfo()));
			// Start of user code for additional initPart
			if (eaOutputInputFlow.getSource() != null && isAccessible(CoreElementsViewsRepository.EaOutputInputFlow.Properties.source)) {
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaOutputInputFlow.getSource().getName()));
			}
			// End of user code
			// Start of user code for additional initPart
			if (eaOutputInputFlow.getTarget() != null && isAccessible(CoreElementsViewsRepository.EaOutputInputFlow.Properties.target)) {
				basePart.setTarget(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaOutputInputFlow.getTarget().getName()));
			}
			// End of user code			
			// init filters
			
			
			
			
			
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : source, EaOutputInputFlow, EaOutputInputFlow.
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : target, EaOutputInputFlow, EaOutputInputFlow.
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
		if (editorKey == CoreElementsViewsRepository.EaOutputInputFlow.Properties.name) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name();
		}
		if (editorKey == CoreElementsViewsRepository.EaOutputInputFlow.Properties.code) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code();
		}
		if (editorKey == CoreElementsViewsRepository.EaOutputInputFlow.Properties.description) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description();
		}
		if (editorKey == CoreElementsViewsRepository.EaOutputInputFlow.Properties.isTrigger) {
			return CoreElementsPackage.eINSTANCE.getEaFlow_IsTrigger();
		}
		if (editorKey == CoreElementsViewsRepository.EaOutputInputFlow.Properties.triggerInfo) {
			return CoreElementsPackage.eINSTANCE.getEaFlow_TriggerInfo();
		}
		if (editorKey == CoreElementsViewsRepository.EaOutputInputFlow.Properties.source) {
			return CoreElementsPackage.eINSTANCE.getEaFlow_Source();
		}
		if (editorKey == CoreElementsViewsRepository.EaOutputInputFlow.Properties.target) {
			return CoreElementsPackage.eINSTANCE.getEaFlow_Target();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EaOutputInputFlow eaOutputInputFlow = (EaOutputInputFlow)semanticObject;
		if (CoreElementsViewsRepository.EaOutputInputFlow.Properties.name == event.getAffectedEditor()) {
			eaOutputInputFlow.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaOutputInputFlow.Properties.code == event.getAffectedEditor()) {
			eaOutputInputFlow.setCode((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaOutputInputFlow.Properties.description == event.getAffectedEditor()) {
			eaOutputInputFlow.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaOutputInputFlow.Properties.isTrigger == event.getAffectedEditor()) {
			eaOutputInputFlow.setIsTrigger((Boolean)event.getNewValue());
		}
		if (CoreElementsViewsRepository.EaOutputInputFlow.Properties.triggerInfo == event.getAffectedEditor()) {
			eaOutputInputFlow.setTriggerInfo((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			EaOutputInputFlowPropertiesEditionPart basePart = (EaOutputInputFlowPropertiesEditionPart)editingPart;
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaOutputInputFlow.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaOutputInputFlow.Properties.code)) {
				if (msg.getNewValue() != null) {
					basePart.setCode(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCode("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaOutputInputFlow.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (CoreElementsPackage.eINSTANCE.getEaFlow_IsTrigger().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaOutputInputFlow.Properties.isTrigger))
				basePart.setIsTrigger((Boolean)msg.getNewValue());
			
			if (CoreElementsPackage.eINSTANCE.getEaFlow_TriggerInfo().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaOutputInputFlow.Properties.triggerInfo)) {
				if (msg.getNewValue() != null) {
					basePart.setTriggerInfo(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setTriggerInfo("");
				}
			}
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : source, EaOutputInputFlow, EaOutputInputFlow.
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : target, EaOutputInputFlow, EaOutputInputFlow.
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == CoreElementsViewsRepository.EaOutputInputFlow.Properties.source || key == CoreElementsViewsRepository.EaOutputInputFlow.Properties.target;
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
				if (CoreElementsViewsRepository.EaOutputInputFlow.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaOutputInputFlow.Properties.code == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaOutputInputFlow.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaOutputInputFlow.Properties.isTrigger == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaFlow_IsTrigger().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaFlow_IsTrigger().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaOutputInputFlow.Properties.triggerInfo == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaFlow_TriggerInfo().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaFlow_TriggerInfo().getEAttributeType(), newValue);
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
