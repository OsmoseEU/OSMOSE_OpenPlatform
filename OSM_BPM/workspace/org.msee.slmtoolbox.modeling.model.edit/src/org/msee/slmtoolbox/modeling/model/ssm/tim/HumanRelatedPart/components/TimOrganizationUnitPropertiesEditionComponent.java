/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.components;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

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
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartFactory;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.HumanRelatedPartViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class TimOrganizationUnitPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for organization EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings organizationSettings;
	
	/**
	 * Settings for processes ReferencesTable
	 */
	private ReferencesTableSettings processesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TimOrganizationUnitPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject timOrganizationUnit, String editing_mode) {
		super(editingContext, timOrganizationUnit, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = HumanRelatedPartViewsRepository.class;
		partKey = HumanRelatedPartViewsRepository.TimOrganizationUnit.class;
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
			final TimOrganizationUnit timOrganizationUnit = (TimOrganizationUnit)elt;
			final TimOrganizationUnitPropertiesEditionPart basePart = (TimOrganizationUnitPropertiesEditionPart)editingPart;
			// init values
			if (timOrganizationUnit.getName() != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timOrganizationUnit.getName()));
			
			if (timOrganizationUnit.getFunction() != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.function))
				basePart.setFunction(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timOrganizationUnit.getFunction()));
			
			if (timOrganizationUnit.getResponsibility() != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.responsibility))
				basePart.setResponsibility(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timOrganizationUnit.getResponsibility()));
			
			if (timOrganizationUnit.getAuthorization() != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.authorization))
				basePart.setAuthorization(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timOrganizationUnit.getAuthorization()));
			
			if (isAccessible(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.organization)) {
				// init part
				organizationSettings = new EObjectFlatComboSettings(timOrganizationUnit, HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Organization());
				basePart.initOrganization(organizationSettings);
				// set the button mode
				basePart.setOrganizationButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.processes)) {
				processesSettings = new ReferencesTableSettings(timOrganizationUnit, HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Processes());
				basePart.initProcesses(processesSettings);
			}
			// init filters
			
			
			
			
			if (isAccessible(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.organization)) {
				basePart.addFilterToOrganization(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						List<TimOrganization> out = new ArrayList<>();
						if (null != timOrganizationUnit.getOrganization() 
								&& null != timOrganizationUnit.getOrganization().getModel()) {
								out.addAll(timOrganizationUnit.getOrganization().getModel().getOrganizations());
						}
						return out.toArray();
					}
					// End of user code
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof TimOrganization);
					}
					
				});
				// Start of user code for additional businessfilters for organization
				// End of user code
			}
			if (isAccessible(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.processes)) {
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
		if (editorKey == HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.name) {
			return HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Name();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.function) {
			return HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Function();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.responsibility) {
			return HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Responsibility();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.authorization) {
			return HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Authorization();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.organization) {
			return HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Organization();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.processes) {
			return HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Processes();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TimOrganizationUnit timOrganizationUnit = (TimOrganizationUnit)semanticObject;
		if (HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.name == event.getAffectedEditor()) {
			timOrganizationUnit.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.function == event.getAffectedEditor()) {
			timOrganizationUnit.setFunction((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.responsibility == event.getAffectedEditor()) {
			timOrganizationUnit.setResponsibility((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.authorization == event.getAffectedEditor()) {
			timOrganizationUnit.setAuthorization((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.organization == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				organizationSettings.setToReference((TimOrganization)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				TimOrganization eObject = HumanRelatedPartFactory.eINSTANCE.createTimOrganization();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				organizationSettings.setToReference(eObject);
			}
		}
		if (HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.processes == event.getAffectedEditor()) {
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
			TimOrganizationUnitPropertiesEditionPart basePart = (TimOrganizationUnitPropertiesEditionPart)editingPart;
			if (HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Name().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Function().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.function)) {
				if (msg.getNewValue() != null) {
					basePart.setFunction(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setFunction("");
				}
			}
			if (HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Responsibility().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.responsibility)) {
				if (msg.getNewValue() != null) {
					basePart.setResponsibility(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setResponsibility("");
				}
			}
			if (HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Authorization().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.authorization)) {
				if (msg.getNewValue() != null) {
					basePart.setAuthorization(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setAuthorization("");
				}
			}
			if (HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Organization().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.organization))
				basePart.setOrganization((EObject)msg.getNewValue());
			if (HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Processes().equals(msg.getFeature())  && isAccessible(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.processes))
				basePart.updateProcesses();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.organization;
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
				if (HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Name().getEAttributeType(), newValue);
				}
				if (HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.function == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Function().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Function().getEAttributeType(), newValue);
				}
				if (HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.responsibility == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Responsibility().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Responsibility().getEAttributeType(), newValue);
				}
				if (HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.authorization == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Authorization().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HumanRelatedPartPackage.eINSTANCE.getTimOrganizationUnit_Authorization().getEAttributeType(), newValue);
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
