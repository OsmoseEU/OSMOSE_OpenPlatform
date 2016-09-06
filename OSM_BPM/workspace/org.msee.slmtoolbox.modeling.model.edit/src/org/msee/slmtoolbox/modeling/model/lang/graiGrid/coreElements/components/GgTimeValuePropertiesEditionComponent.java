/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.components;

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
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeUnits;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgTimeValuePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class GgTimeValuePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public GgTimeValuePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject ggTimeValue, String editing_mode) {
		super(editingContext, ggTimeValue, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CoreElementsViewsRepository.class;
		partKey = CoreElementsViewsRepository.GgTimeValue.class;
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
			final GgTimeValue ggTimeValue = (GgTimeValue)elt;
			final GgTimeValuePropertiesEditionPart basePart = (GgTimeValuePropertiesEditionPart)editingPart;
			// init values
			if (isAccessible(CoreElementsViewsRepository.GgTimeValue.Properties.unit)) {
				basePart.initUnit(EEFUtils.choiceOfValues(ggTimeValue, CoreElementsPackage.eINSTANCE.getGgTimeValue_Unit()), ggTimeValue.getUnit());
			}
			if (isAccessible(CoreElementsViewsRepository.GgTimeValue.Properties.value)) {
				basePart.setValue(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, ggTimeValue.getValue()));
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
		if (editorKey == CoreElementsViewsRepository.GgTimeValue.Properties.unit) {
			return CoreElementsPackage.eINSTANCE.getGgTimeValue_Unit();
		}
		if (editorKey == CoreElementsViewsRepository.GgTimeValue.Properties.value) {
			return CoreElementsPackage.eINSTANCE.getGgTimeValue_Value();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		GgTimeValue ggTimeValue = (GgTimeValue)semanticObject;
		if (CoreElementsViewsRepository.GgTimeValue.Properties.unit == event.getAffectedEditor()) {
			ggTimeValue.setUnit((GgTimeUnits)event.getNewValue());
		}
		if (CoreElementsViewsRepository.GgTimeValue.Properties.value == event.getAffectedEditor()) {
			ggTimeValue.setValue((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			GgTimeValuePropertiesEditionPart basePart = (GgTimeValuePropertiesEditionPart)editingPart;
			if (CoreElementsPackage.eINSTANCE.getGgTimeValue_Unit().equals(msg.getFeature()) && isAccessible(CoreElementsViewsRepository.GgTimeValue.Properties.unit))
				basePart.setUnit((GgTimeUnits)msg.getNewValue());
			
			if (CoreElementsPackage.eINSTANCE.getGgTimeValue_Value().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.GgTimeValue.Properties.value)) {
				if (msg.getNewValue() != null) {
					basePart.setValue(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setValue("");
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
				if (CoreElementsViewsRepository.GgTimeValue.Properties.unit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getGgTimeValue_Unit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getGgTimeValue_Unit().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.GgTimeValue.Properties.value == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getGgTimeValue_Value().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getGgTimeValue_Value().getEAttributeType(), newValue);
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
