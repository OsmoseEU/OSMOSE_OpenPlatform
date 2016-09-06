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
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgFunctionPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage;


// End of user code

/**
 * 
 * 
 */
public class GgFunctionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public GgFunctionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject ggFunction, String editing_mode) {
		super(editingContext, ggFunction, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CoreElementsViewsRepository.class;
		partKey = CoreElementsViewsRepository.GgFunction.class;
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
			final GgFunction ggFunction = (GgFunction)elt;
			final GgFunctionPropertiesEditionPart basePart = (GgFunctionPropertiesEditionPart)editingPart;
			// init values
			if (ggFunction.getName() != null && isAccessible(CoreElementsViewsRepository.GgFunction.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggFunction.getName()));
			
			if (ggFunction.getCode() != null && isAccessible(CoreElementsViewsRepository.GgFunction.Properties.code))
				basePart.setCode(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggFunction.getCode()));
			
			if (ggFunction.getDescription() != null && isAccessible(CoreElementsViewsRepository.GgFunction.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggFunction.getDescription()));
			
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
		if (editorKey == CoreElementsViewsRepository.GgFunction.Properties.name) {
			return GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name();
		}
		if (editorKey == CoreElementsViewsRepository.GgFunction.Properties.code) {
			return GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code();
		}
		if (editorKey == CoreElementsViewsRepository.GgFunction.Properties.description) {
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
		GgFunction ggFunction = (GgFunction)semanticObject;
		if (CoreElementsViewsRepository.GgFunction.Properties.name == event.getAffectedEditor()) {
			ggFunction.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.GgFunction.Properties.code == event.getAffectedEditor()) {
			ggFunction.setCode((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.GgFunction.Properties.description == event.getAffectedEditor()) {
			ggFunction.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			GgFunctionPropertiesEditionPart basePart = (GgFunctionPropertiesEditionPart)editingPart;
			if (GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.GgFunction.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.GgFunction.Properties.code)) {
				if (msg.getNewValue() != null) {
					basePart.setCode(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCode("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getGgBaseElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.GgFunction.Properties.description)) {
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
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent#validateValue(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public Diagnostic validateValue(IPropertiesEditionEvent event) {
		Diagnostic ret = Diagnostic.OK_INSTANCE;
		if (event.getNewValue() != null) {
			try {
				if (CoreElementsViewsRepository.GgFunction.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.GgFunction.Properties.code == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.GgFunction.Properties.description == event.getAffectedEditor()) {
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
