/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.components;

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
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsFactory;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.CommonConceptsViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class TimServicePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for subServices ReferencesTable
	 */
	private ReferencesTableSettings subServicesSettings;
	
	/**
	 * Settings for mainService EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings mainServiceSettings;
	
	/**
	 * Settings for processes ReferencesTable
	 */
	private ReferencesTableSettings processesSettings;
	
	/**
	 * Settings for resources ReferencesTable
	 */
	private ReferencesTableSettings resourcesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TimServicePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject timService, String editing_mode) {
		super(editingContext, timService, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CommonConceptsViewsRepository.class;
		partKey = CommonConceptsViewsRepository.TimService.class;
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
			final TimService timService = (TimService)elt;
			final TimServicePropertiesEditionPart basePart = (TimServicePropertiesEditionPart)editingPart;
			// init values
			if (timService.getName() != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timService.getName()));
			
			if (timService.getDescription() != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timService.getDescription()));
			
			if (timService.getObjective() != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.objective))
				basePart.setObjective(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timService.getObjective()));
			
			if (timService.getConstraint() != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.constraint))
				basePart.setConstraint(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timService.getConstraint()));
			
			if (timService.getAccess() != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.access))
				basePart.setAccess(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timService.getAccess()));
			
			if (timService.getConsumption() != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.consumption))
				basePart.setConsumption(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timService.getConsumption()));
			
			if (timService.getAutomationLevel() != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.automationLevel))
				basePart.setAutomationLevel(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timService.getAutomationLevel()));
			
			if (timService.getDomain() != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.domain))
				basePart.setDomain(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timService.getDomain()));
			
			if (timService.getNature() != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.nature))
				basePart.setNature(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timService.getNature()));
			
			if (isAccessible(CommonConceptsViewsRepository.TimService.Properties.subServices)) {
				subServicesSettings = new ReferencesTableSettings(timService, CommonConceptsPackage.eINSTANCE.getTimService_SubServices());
				basePart.initSubServices(subServicesSettings);
			}
			if (isAccessible(CommonConceptsViewsRepository.TimService.Properties.mainService)) {
				// init part
				mainServiceSettings = new EObjectFlatComboSettings(timService, CommonConceptsPackage.eINSTANCE.getTimService_MainService());
				basePart.initMainService(mainServiceSettings);
				// set the button mode
				basePart.setMainServiceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(CommonConceptsViewsRepository.TimService.Properties.processes)) {
				processesSettings = new ReferencesTableSettings(timService, CommonConceptsPackage.eINSTANCE.getTimService_Processes());
				basePart.initProcesses(processesSettings);
			}
			if (isAccessible(CommonConceptsViewsRepository.TimService.Properties.resources)) {
				resourcesSettings = new ReferencesTableSettings(timService, CommonConceptsPackage.eINSTANCE.getTimService_Resources());
				basePart.initResources(resourcesSettings);
			}
			// Start of user code for additional initPart
			if (timService.getModel() != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.model)) {
				basePart.setModel(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timService.getModel().getName()));
			}
			// End of user code
			// init filters
			
			
			
			
			
			
			
			
			
			if (isAccessible(CommonConceptsViewsRepository.TimService.Properties.subServices)) {
				basePart.addFilterToSubServices(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInSubServicesTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToSubServices(new EObjectFilter(CommonConceptsPackage.Literals.TIM_SERVICE));
				// Start of user code for additional businessfilters for subServices
				// End of user code
			}
			if (isAccessible(CommonConceptsViewsRepository.TimService.Properties.mainService)) {
				basePart.addFilterToMainService(new ViewerFilter() {
					
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						List<TimService> out = new ArrayList<>();
						if (null != timService.getModel() 
								&& null != timService.getModel().getServices()) {
							out.addAll(timService.getModel().getServices());
							out.remove(timService);
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
						return (element instanceof String && element.equals("")) || (element instanceof TimService); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for mainService
				// End of user code
			}
			if (isAccessible(CommonConceptsViewsRepository.TimService.Properties.processes)) {
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
			if (isAccessible(CommonConceptsViewsRepository.TimService.Properties.resources)) {
				basePart.addFilterToResources(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInResourcesTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToResources(new EObjectFilter(CommonConceptsPackage.Literals.TIM_RESOURCE));
				// Start of user code for additional businessfilters for resources
				// End of user code
			}
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : model, TimService, TimService.
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
		if (editorKey == CommonConceptsViewsRepository.TimService.Properties.name) {
			return CommonConceptsPackage.eINSTANCE.getTimService_Name();
		}
		if (editorKey == CommonConceptsViewsRepository.TimService.Properties.description) {
			return CommonConceptsPackage.eINSTANCE.getTimService_Description();
		}
		if (editorKey == CommonConceptsViewsRepository.TimService.Properties.objective) {
			return CommonConceptsPackage.eINSTANCE.getTimService_Objective();
		}
		if (editorKey == CommonConceptsViewsRepository.TimService.Properties.constraint) {
			return CommonConceptsPackage.eINSTANCE.getTimService_Constraint();
		}
		if (editorKey == CommonConceptsViewsRepository.TimService.Properties.access) {
			return CommonConceptsPackage.eINSTANCE.getTimService_Access();
		}
		if (editorKey == CommonConceptsViewsRepository.TimService.Properties.consumption) {
			return CommonConceptsPackage.eINSTANCE.getTimService_Consumption();
		}
		if (editorKey == CommonConceptsViewsRepository.TimService.Properties.automationLevel) {
			return CommonConceptsPackage.eINSTANCE.getTimService_AutomationLevel();
		}
		if (editorKey == CommonConceptsViewsRepository.TimService.Properties.domain) {
			return CommonConceptsPackage.eINSTANCE.getTimService_Domain();
		}
		if (editorKey == CommonConceptsViewsRepository.TimService.Properties.nature) {
			return CommonConceptsPackage.eINSTANCE.getTimService_Nature();
		}
		if (editorKey == CommonConceptsViewsRepository.TimService.Properties.subServices) {
			return CommonConceptsPackage.eINSTANCE.getTimService_SubServices();
		}
		if (editorKey == CommonConceptsViewsRepository.TimService.Properties.mainService) {
			return CommonConceptsPackage.eINSTANCE.getTimService_MainService();
		}
		if (editorKey == CommonConceptsViewsRepository.TimService.Properties.processes) {
			return CommonConceptsPackage.eINSTANCE.getTimService_Processes();
		}
		if (editorKey == CommonConceptsViewsRepository.TimService.Properties.resources) {
			return CommonConceptsPackage.eINSTANCE.getTimService_Resources();
		}
		if (editorKey == CommonConceptsViewsRepository.TimService.Properties.model) {
			return CommonConceptsPackage.eINSTANCE.getTimService_Model();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TimService timService = (TimService)semanticObject;
		if (CommonConceptsViewsRepository.TimService.Properties.name == event.getAffectedEditor()) {
			timService.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CommonConceptsViewsRepository.TimService.Properties.description == event.getAffectedEditor()) {
			timService.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CommonConceptsViewsRepository.TimService.Properties.objective == event.getAffectedEditor()) {
			timService.setObjective((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CommonConceptsViewsRepository.TimService.Properties.constraint == event.getAffectedEditor()) {
			timService.setConstraint((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CommonConceptsViewsRepository.TimService.Properties.access == event.getAffectedEditor()) {
			timService.setAccess((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CommonConceptsViewsRepository.TimService.Properties.consumption == event.getAffectedEditor()) {
			timService.setConsumption((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CommonConceptsViewsRepository.TimService.Properties.automationLevel == event.getAffectedEditor()) {
			timService.setAutomationLevel((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CommonConceptsViewsRepository.TimService.Properties.domain == event.getAffectedEditor()) {
			timService.setDomain((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CommonConceptsViewsRepository.TimService.Properties.nature == event.getAffectedEditor()) {
			timService.setNature((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CommonConceptsViewsRepository.TimService.Properties.subServices == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof TimService) {
					subServicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				subServicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				subServicesSettings.move(event.getNewIndex(), (TimService) event.getNewValue());
			}
		}
		if (CommonConceptsViewsRepository.TimService.Properties.mainService == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				mainServiceSettings.setToReference((TimService)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				TimService eObject = CommonConceptsFactory.eINSTANCE.createTimService();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				mainServiceSettings.setToReference(eObject);
			}
		}
		if (CommonConceptsViewsRepository.TimService.Properties.processes == event.getAffectedEditor()) {
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
		if (CommonConceptsViewsRepository.TimService.Properties.resources == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof TimResource) {
					resourcesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				resourcesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				resourcesSettings.move(event.getNewIndex(), (TimResource) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			TimServicePropertiesEditionPart basePart = (TimServicePropertiesEditionPart)editingPart;
			if (CommonConceptsPackage.eINSTANCE.getTimService_Name().equals(msg.getFeature()) && basePart != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimService_Description().equals(msg.getFeature()) && basePart != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimService_Objective().equals(msg.getFeature()) && basePart != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.objective)) {
				if (msg.getNewValue() != null) {
					basePart.setObjective(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setObjective("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimService_Constraint().equals(msg.getFeature()) && basePart != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.constraint)) {
				if (msg.getNewValue() != null) {
					basePart.setConstraint(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setConstraint("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimService_Access().equals(msg.getFeature()) && basePart != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.access)) {
				if (msg.getNewValue() != null) {
					basePart.setAccess(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setAccess("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimService_Consumption().equals(msg.getFeature()) && basePart != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.consumption)) {
				if (msg.getNewValue() != null) {
					basePart.setConsumption(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setConsumption("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimService_AutomationLevel().equals(msg.getFeature()) && basePart != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.automationLevel)) {
				if (msg.getNewValue() != null) {
					basePart.setAutomationLevel(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setAutomationLevel("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimService_Domain().equals(msg.getFeature()) && basePart != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.domain)) {
				if (msg.getNewValue() != null) {
					basePart.setDomain(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDomain("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimService_Nature().equals(msg.getFeature()) && basePart != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.nature)) {
				if (msg.getNewValue() != null) {
					basePart.setNature(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setNature("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimService_SubServices().equals(msg.getFeature())  && isAccessible(CommonConceptsViewsRepository.TimService.Properties.subServices))
				basePart.updateSubServices();
			if (CommonConceptsPackage.eINSTANCE.getTimService_MainService().equals(msg.getFeature()) && basePart != null && isAccessible(CommonConceptsViewsRepository.TimService.Properties.mainService))
				basePart.setMainService((EObject)msg.getNewValue());
			if (CommonConceptsPackage.eINSTANCE.getTimService_Processes().equals(msg.getFeature())  && isAccessible(CommonConceptsViewsRepository.TimService.Properties.processes))
				basePart.updateProcesses();
			if (CommonConceptsPackage.eINSTANCE.getTimService_Resources().equals(msg.getFeature())  && isAccessible(CommonConceptsViewsRepository.TimService.Properties.resources))
				basePart.updateResources();
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : model, TimService, TimService.
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == CommonConceptsViewsRepository.TimService.Properties.model;
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
				if (CommonConceptsViewsRepository.TimService.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimService_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimService_Name().getEAttributeType(), newValue);
				}
				if (CommonConceptsViewsRepository.TimService.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimService_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimService_Description().getEAttributeType(), newValue);
				}
				if (CommonConceptsViewsRepository.TimService.Properties.objective == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimService_Objective().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimService_Objective().getEAttributeType(), newValue);
				}
				if (CommonConceptsViewsRepository.TimService.Properties.constraint == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimService_Constraint().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimService_Constraint().getEAttributeType(), newValue);
				}
				if (CommonConceptsViewsRepository.TimService.Properties.access == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimService_Access().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimService_Access().getEAttributeType(), newValue);
				}
				if (CommonConceptsViewsRepository.TimService.Properties.consumption == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimService_Consumption().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimService_Consumption().getEAttributeType(), newValue);
				}
				if (CommonConceptsViewsRepository.TimService.Properties.automationLevel == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimService_AutomationLevel().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimService_AutomationLevel().getEAttributeType(), newValue);
				}
				if (CommonConceptsViewsRepository.TimService.Properties.domain == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimService_Domain().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimService_Domain().getEAttributeType(), newValue);
				}
				if (CommonConceptsViewsRepository.TimService.Properties.nature == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimService_Nature().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimService_Nature().getEAttributeType(), newValue);
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
