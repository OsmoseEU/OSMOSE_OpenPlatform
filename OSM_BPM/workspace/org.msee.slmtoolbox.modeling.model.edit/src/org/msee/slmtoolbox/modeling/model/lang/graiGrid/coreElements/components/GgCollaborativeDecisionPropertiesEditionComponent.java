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
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgCollaborativeDecision;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgCollaborativeDecisionPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage;


// End of user code

/**
 * 
 * 
 */
public class GgCollaborativeDecisionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public GgCollaborativeDecisionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject ggCollaborativeDecision, String editing_mode) {
		super(editingContext, ggCollaborativeDecision, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CoreElementsViewsRepository.class;
		partKey = CoreElementsViewsRepository.GgCollaborativeDecision.class;
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
			final GgCollaborativeDecision ggCollaborativeDecision = (GgCollaborativeDecision)elt;
			final GgCollaborativeDecisionPropertiesEditionPart basePart = (GgCollaborativeDecisionPropertiesEditionPart)editingPart;
			// init values
			if (ggCollaborativeDecision.getName() != null && isAccessible(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggCollaborativeDecision.getName()));
			
			if (ggCollaborativeDecision.getCode() != null && isAccessible(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code))
				basePart.setCode(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggCollaborativeDecision.getCode()));
			
			if (ggCollaborativeDecision.getDescription() != null && isAccessible(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggCollaborativeDecision.getDescription()));
			
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
		if (editorKey == CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name) {
			return GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name();
		}
		if (editorKey == CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code) {
			return GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code();
		}
		if (editorKey == CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description) {
			return GeneralElementsPackage.eINSTANCE.getGgBaseElement_Description();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		GgCollaborativeDecision ggCollaborativeDecision = (GgCollaborativeDecision)semanticObject;
		if (CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name == event.getAffectedEditor()) {
			ggCollaborativeDecision.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code == event.getAffectedEditor()) {
			ggCollaborativeDecision.setCode((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description == event.getAffectedEditor()) {
			ggCollaborativeDecision.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			GgCollaborativeDecisionPropertiesEditionPart basePart = (GgCollaborativeDecisionPropertiesEditionPart)editingPart;
			if (GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code)) {
				if (msg.getNewValue() != null) {
					basePart.setCode(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCode("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getGgBaseElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name || key == CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code || key == CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description || key == CoreElementsViewsRepository.GgCollaborativeDecision.Properties.class;
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
				if (CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Description().getEAttributeType(), newValue);
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
