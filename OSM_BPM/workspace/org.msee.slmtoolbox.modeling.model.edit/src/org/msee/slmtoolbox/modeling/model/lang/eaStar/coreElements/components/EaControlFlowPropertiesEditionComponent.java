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
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaControlFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaControlFlowPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;


// End of user code

/**
 * 
 * 
 */
public class EaControlFlowPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public EaControlFlowPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject eaControlFlow, String editing_mode) {
		super(editingContext, eaControlFlow, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CoreElementsViewsRepository.class;
		partKey = CoreElementsViewsRepository.EaControlFlow.class;
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
			final EaControlFlow eaControlFlow = (EaControlFlow)elt;
			final EaControlFlowPropertiesEditionPart basePart = (EaControlFlowPropertiesEditionPart)editingPart;
			// init values
			if (eaControlFlow.getName() != null && isAccessible(CoreElementsViewsRepository.EaControlFlow.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaControlFlow.getName()));
			
			if (eaControlFlow.getCode() != null && isAccessible(CoreElementsViewsRepository.EaControlFlow.Properties.code))
				basePart.setCode(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaControlFlow.getCode()));
			
			if (eaControlFlow.getDescription() != null && isAccessible(CoreElementsViewsRepository.EaControlFlow.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaControlFlow.getDescription()));
			
			if (isAccessible(CoreElementsViewsRepository.EaControlFlow.Properties.isTrigger)) {
				basePart.setIsTrigger(eaControlFlow.isIsTrigger());
			}
			if (eaControlFlow.getTriggerInfo() != null && isAccessible(CoreElementsViewsRepository.EaControlFlow.Properties.triggerInfo))
				basePart.setTriggerInfo(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaControlFlow.getTriggerInfo()));
			// Start of user code for additional initPart
			if (eaControlFlow.getSource() != null && isAccessible(CoreElementsViewsRepository.EaControlFlow.Properties.source)) {
				basePart.setSource(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaControlFlow.getSource().getName()));
			}
			// End of user code
			// Start of user code for additional initPart
			if (eaControlFlow.getTarget() != null && isAccessible(CoreElementsViewsRepository.EaControlFlow.Properties.target)) {
				basePart.setTarget(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaControlFlow.getTarget().getName()));
			}
			// End of user code
			// init filters
			
			
			
			
			
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : source, EaControlFlow, EaControlFlow.
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : target, EaControlFlow, EaControlFlow.
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
		if (editorKey == CoreElementsViewsRepository.EaControlFlow.Properties.name) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name();
		}
		if (editorKey == CoreElementsViewsRepository.EaControlFlow.Properties.code) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code();
		}
		if (editorKey == CoreElementsViewsRepository.EaControlFlow.Properties.description) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description();
		}
		if (editorKey == CoreElementsViewsRepository.EaControlFlow.Properties.isTrigger) {
			return CoreElementsPackage.eINSTANCE.getEaFlow_IsTrigger();
		}
		if (editorKey == CoreElementsViewsRepository.EaControlFlow.Properties.triggerInfo) {
			return CoreElementsPackage.eINSTANCE.getEaFlow_TriggerInfo();
		}
		if (editorKey == CoreElementsViewsRepository.EaControlFlow.Properties.source) {
			return CoreElementsPackage.eINSTANCE.getEaFlow_Source();
		}
		if (editorKey == CoreElementsViewsRepository.EaControlFlow.Properties.target) {
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
		EaControlFlow eaControlFlow = (EaControlFlow)semanticObject;
		if (CoreElementsViewsRepository.EaControlFlow.Properties.name == event.getAffectedEditor()) {
			eaControlFlow.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaControlFlow.Properties.code == event.getAffectedEditor()) {
			eaControlFlow.setCode((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaControlFlow.Properties.description == event.getAffectedEditor()) {
			eaControlFlow.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaControlFlow.Properties.isTrigger == event.getAffectedEditor()) {
			eaControlFlow.setIsTrigger((Boolean)event.getNewValue());
		}
		if (CoreElementsViewsRepository.EaControlFlow.Properties.triggerInfo == event.getAffectedEditor()) {
			eaControlFlow.setTriggerInfo((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			EaControlFlowPropertiesEditionPart basePart = (EaControlFlowPropertiesEditionPart)editingPart;
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaControlFlow.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaControlFlow.Properties.code)) {
				if (msg.getNewValue() != null) {
					basePart.setCode(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCode("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaControlFlow.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (CoreElementsPackage.eINSTANCE.getEaFlow_IsTrigger().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaControlFlow.Properties.isTrigger))
				basePart.setIsTrigger((Boolean)msg.getNewValue());
			
			if (CoreElementsPackage.eINSTANCE.getEaFlow_TriggerInfo().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaControlFlow.Properties.triggerInfo)) {
				if (msg.getNewValue() != null) {
					basePart.setTriggerInfo(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setTriggerInfo("");
				}
			}
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : source, EaControlFlow, EaControlFlow.
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : target, EaControlFlow, EaControlFlow.
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == CoreElementsViewsRepository.EaControlFlow.Properties.source || key == CoreElementsViewsRepository.EaControlFlow.Properties.target;
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
				if (CoreElementsViewsRepository.EaControlFlow.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaControlFlow.Properties.code == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaControlFlow.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaControlFlow.Properties.isTrigger == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaFlow_IsTrigger().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaFlow_IsTrigger().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaControlFlow.Properties.triggerInfo == event.getAffectedEditor()) {
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
