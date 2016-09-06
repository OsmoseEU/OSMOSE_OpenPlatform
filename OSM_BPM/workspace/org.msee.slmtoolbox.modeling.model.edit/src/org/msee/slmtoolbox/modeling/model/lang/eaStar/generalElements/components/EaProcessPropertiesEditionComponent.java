/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.components;

// Start of user code for imports
import java.util.ArrayList;

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
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.EaProcessPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts.GeneralElementsViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class EaProcessPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public EaProcessPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject eaProcess, String editing_mode) {
		super(editingContext, eaProcess, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = GeneralElementsViewsRepository.class;
		partKey = GeneralElementsViewsRepository.EaProcess.class;
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
			final EaProcess eaProcess = (EaProcess)elt;
			final EaProcessPropertiesEditionPart basePart = (EaProcessPropertiesEditionPart)editingPart;
			// init values
			if (eaProcess.getName() != null && isAccessible(GeneralElementsViewsRepository.EaProcess.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaProcess.getName()));
			
			if (eaProcess.getCode() != null && isAccessible(GeneralElementsViewsRepository.EaProcess.Properties.code))
				basePart.setCode(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaProcess.getCode()));
			
			if (eaProcess.getDecompositionCode() != null && isAccessible(GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode))
				basePart.setDecompositionCode(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaProcess.getDecompositionCode()));
			
			if (eaProcess.getDescription() != null && isAccessible(GeneralElementsViewsRepository.EaProcess.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaProcess.getDescription()));
			
			/*if (isAccessible(GeneralElementsViewsRepository.EaProcess.Properties.osmioticProcess)) {
				// Start of user code for osmioticProcess editor initialization
				java.util.Collection<Object> inputOsmioticProcess = new ArrayList<Object>(8);
				inputOsmioticProcess.add("UNDEFINED");
				inputOsmioticProcess.add("GENERIC");
				inputOsmioticProcess.add("ERROR");
				inputOsmioticProcess.add("CANCEL");
				inputOsmioticProcess.add("TERMINATE");
				inputOsmioticProcess.add("TIMER");
				inputOsmioticProcess.add("MESSAGE");
				inputOsmioticProcess.add("CATCH");
				
		
				basePart.initOsmioticProcess(inputOsmioticProcess, eaProcess.getOsmioticProcess());
			}*/
			
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
		if (editorKey == GeneralElementsViewsRepository.EaProcess.Properties.name) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name();
		}
		if (editorKey == GeneralElementsViewsRepository.EaProcess.Properties.code) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code();
		}
		if (editorKey == GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode) {
			return GeneralElementsPackage.eINSTANCE.getEaProcess_DecompositionCode();
		}
		if (editorKey == GeneralElementsViewsRepository.EaProcess.Properties.description) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description();
		}
		if (editorKey == GeneralElementsViewsRepository.EaProcess.Properties.osmioticProcess) {
			return GeneralElementsPackage.eINSTANCE.getEaProcess_OsmioticProcess();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EaProcess eaProcess = (EaProcess)semanticObject;
		if (GeneralElementsViewsRepository.EaProcess.Properties.name == event.getAffectedEditor()) {
			eaProcess.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (GeneralElementsViewsRepository.EaProcess.Properties.code == event.getAffectedEditor()) {
			eaProcess.setCode((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode == event.getAffectedEditor()) {
			eaProcess.setDecompositionCode((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (GeneralElementsViewsRepository.EaProcess.Properties.description == event.getAffectedEditor()) {
			eaProcess.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (GeneralElementsViewsRepository.EaProcess.Properties.osmioticProcess == event.getAffectedEditor()) {
			eaProcess.setOsmioticProcess((java.lang.String)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			EaProcessPropertiesEditionPart basePart = (EaProcessPropertiesEditionPart)editingPart;
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(GeneralElementsViewsRepository.EaProcess.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().equals(msg.getFeature()) && basePart != null && isAccessible(GeneralElementsViewsRepository.EaProcess.Properties.code)) {
				if (msg.getNewValue() != null) {
					basePart.setCode(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCode("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getEaProcess_DecompositionCode().equals(msg.getFeature()) && basePart != null && isAccessible(GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode)) {
				if (msg.getNewValue() != null) {
					basePart.setDecompositionCode(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDecompositionCode("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(GeneralElementsViewsRepository.EaProcess.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getEaProcess_OsmioticProcess().equals(msg.getFeature()) && basePart != null && isAccessible(GeneralElementsViewsRepository.EaProcess.Properties.osmioticProcess))
				basePart.setOsmioticProcess((Object)msg.getNewValue());
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
				if (GeneralElementsViewsRepository.EaProcess.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().getEAttributeType(), newValue);
				}
				if (GeneralElementsViewsRepository.EaProcess.Properties.code == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().getEAttributeType(), newValue);
				}
				if (GeneralElementsViewsRepository.EaProcess.Properties.decompositionCode == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaProcess_DecompositionCode().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaProcess_DecompositionCode().getEAttributeType(), newValue);
				}
				if (GeneralElementsViewsRepository.EaProcess.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().getEAttributeType(), newValue);
				}
				if (GeneralElementsViewsRepository.EaProcess.Properties.osmioticProcess == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaProcess_OsmioticProcess().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaProcess_OsmioticProcess().getEAttributeType(), newValue);
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
