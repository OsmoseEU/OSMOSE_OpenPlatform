/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.HumanRelatedPartViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class TimOrganizationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for processes ReferencesTable
	 */
	private ReferencesTableSettings processesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TimOrganizationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject timOrganization, String editing_mode) {
		super(editingContext, timOrganization, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = HumanRelatedPartViewsRepository.class;
		partKey = HumanRelatedPartViewsRepository.TimOrganization.class;
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
			final TimOrganization timOrganization = (TimOrganization)elt;
			final TimOrganizationPropertiesEditionPart basePart = (TimOrganizationPropertiesEditionPart)editingPart;
			// init values
			if (timOrganization.getName() != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganization.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timOrganization.getName()));
			
			if (timOrganization.getType() != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganization.Properties.type))
				basePart.setType(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timOrganization.getType()));
			
			if (timOrganization.getDescription() != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganization.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timOrganization.getDescription()));
			
			if (timOrganization.getResponsibility() != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganization.Properties.responsibility))
				basePart.setResponsibility(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timOrganization.getResponsibility()));
			
			if (timOrganization.getAuthorization() != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganization.Properties.authorization))
				basePart.setAuthorization(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timOrganization.getAuthorization()));
			
			if (isAccessible(HumanRelatedPartViewsRepository.TimOrganization.Properties.processes)) {
				processesSettings = new ReferencesTableSettings(timOrganization, HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Processes());
				basePart.initProcesses(processesSettings);
			}
			// init filters
			
			if (isAccessible(HumanRelatedPartViewsRepository.TimOrganization.Properties.processes)) {
				basePart.addFilterToProcesses(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInProcessesTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToProcesses(new EObjectFilter(CommonConceptsPackage.Literals.TIM_PROCESS));
				// Start of user code for additional businessfilters for processes
				// End of user code
			}
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
		if (editorKey == HumanRelatedPartViewsRepository.TimOrganization.Properties.name) {
			return HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Name();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimOrganization.Properties.type) {
			return HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Type();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimOrganization.Properties.description) {
			return HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Description();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimOrganization.Properties.responsibility) {
			return HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Responsibility();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimOrganization.Properties.authorization) {
			return HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Authorization();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimOrganization.Properties.processes) {
			return HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Processes();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TimOrganization timOrganization = (TimOrganization)semanticObject;
		if (HumanRelatedPartViewsRepository.TimOrganization.Properties.name == event.getAffectedEditor()) {
			timOrganization.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HumanRelatedPartViewsRepository.TimOrganization.Properties.type == event.getAffectedEditor()) {
			timOrganization.setType((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HumanRelatedPartViewsRepository.TimOrganization.Properties.description == event.getAffectedEditor()) {
			timOrganization.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HumanRelatedPartViewsRepository.TimOrganization.Properties.responsibility == event.getAffectedEditor()) {
			timOrganization.setResponsibility((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HumanRelatedPartViewsRepository.TimOrganization.Properties.authorization == event.getAffectedEditor()) {
			timOrganization.setAuthorization((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HumanRelatedPartViewsRepository.TimOrganization.Properties.processes == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof TimProcess) {
					processesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				processesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				processesSettings.move(event.getNewIndex(), (TimProcess) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			TimOrganizationPropertiesEditionPart basePart = (TimOrganizationPropertiesEditionPart)editingPart;
			if (HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Name().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganization.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Type().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganization.Properties.type)) {
				if (msg.getNewValue() != null) {
					basePart.setType(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setType("");
				}
			}
			if (HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Description().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganization.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Responsibility().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganization.Properties.responsibility)) {
				if (msg.getNewValue() != null) {
					basePart.setResponsibility(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setResponsibility("");
				}
			}
			if (HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Authorization().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganization.Properties.authorization)) {
				if (msg.getNewValue() != null) {
					basePart.setAuthorization(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setAuthorization("");
				}
			}
			if (HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Processes().equals(msg.getFeature())  && isAccessible(HumanRelatedPartViewsRepository.TimOrganization.Properties.processes))
				basePart.updateProcesses();
			
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
				if (HumanRelatedPartViewsRepository.TimOrganization.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Name().getEAttributeType(), newValue);
				}
				if (HumanRelatedPartViewsRepository.TimOrganization.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Type().getEAttributeType(), newValue);
				}
				if (HumanRelatedPartViewsRepository.TimOrganization.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Description().getEAttributeType(), newValue);
				}
				if (HumanRelatedPartViewsRepository.TimOrganization.Properties.responsibility == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Responsibility().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Responsibility().getEAttributeType(), newValue);
				}
				if (HumanRelatedPartViewsRepository.TimOrganization.Properties.authorization == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Authorization().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HumanRelatedPartPackage.eINSTANCE.getTimOrganization_Authorization().getEAttributeType(), newValue);
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
