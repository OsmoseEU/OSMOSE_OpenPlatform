/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.components;

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
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartFactory;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.ITRelatedPartViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class TimEnterpriseApplicationResourcePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for processes ReferencesTable
	 */
	private ReferencesTableSettings processesSettings;
	
	/**
	 * Settings for organizationUnit EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings organizationUnitSettings;
	
	/**
	 * Settings for services ReferencesTable
	 */
	private ReferencesTableSettings servicesSettings;
	
	/**
	 * Settings for informations ReferencesTable
	 */
	private ReferencesTableSettings informationsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TimEnterpriseApplicationResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject timEnterpriseApplicationResource, String editing_mode) {
		super(editingContext, timEnterpriseApplicationResource, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ITRelatedPartViewsRepository.class;
		partKey = ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.class;
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
			final TimEnterpriseApplicationResource timEnterpriseApplicationResource = (TimEnterpriseApplicationResource)elt;
			final TimEnterpriseApplicationResourcePropertiesEditionPart basePart = (TimEnterpriseApplicationResourcePropertiesEditionPart)editingPart;
			// init values
			if (timEnterpriseApplicationResource.getName() != null && isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timEnterpriseApplicationResource.getName()));
			
			if (timEnterpriseApplicationResource.getFunction() != null && isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.function))
				basePart.setFunction(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timEnterpriseApplicationResource.getFunction()));
			
			if (timEnterpriseApplicationResource.getType() != null && isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.type))
				basePart.setType(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timEnterpriseApplicationResource.getType()));
			
			if (isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.processes)) {
				processesSettings = new ReferencesTableSettings(timEnterpriseApplicationResource, CommonConceptsPackage.eINSTANCE.getTimResource_Processes());
				basePart.initProcesses(processesSettings);
			}
			// Start of user code for additional initPart
			if (timEnterpriseApplicationResource.getModel() != null && isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.model)) {
				basePart.setModel(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timEnterpriseApplicationResource.getModel().getName()));
			}
			// End of user code
			if (isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.organizationUnit)) {
				// init part
				organizationUnitSettings = new EObjectFlatComboSettings(timEnterpriseApplicationResource, CommonConceptsPackage.eINSTANCE.getTimResource_OrganizationUnit());
				basePart.initOrganizationUnit(organizationUnitSettings);
				// set the button mode
				basePart.setOrganizationUnitButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.services)) {
				servicesSettings = new ReferencesTableSettings(timEnterpriseApplicationResource, CommonConceptsPackage.eINSTANCE.getTimResource_Services());
				basePart.initServices(servicesSettings);
			}
			if (timEnterpriseApplicationResource.getDescription() != null && isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timEnterpriseApplicationResource.getDescription()));
			
			if (timEnterpriseApplicationResource.getFunctionality() != null && isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.functionality))
				basePart.setFunctionality(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timEnterpriseApplicationResource.getFunctionality()));
			
			if (timEnterpriseApplicationResource.getCharacteristics() != null && isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.characteristics))
				basePart.setCharacteristics(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timEnterpriseApplicationResource.getCharacteristics()));
			
			if (isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.informations)) {
				informationsSettings = new ReferencesTableSettings(timEnterpriseApplicationResource, ITRelatedPartPackage.eINSTANCE.getTimEnterpriseApplicationResource_Informations());
				basePart.initInformations(informationsSettings);
			}
			// init filters
			
			
			
			if (isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.processes)) {
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
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : model, TimEnterpriseApplicationResource, TimEnterpriseApplicationResource.
			if (isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.organizationUnit)) {
				basePart.addFilterToOrganizationUnit(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						List<TimOrganizationUnit> out = new ArrayList<>();
						if (null != timEnterpriseApplicationResource.getModel() 
								&& null != timEnterpriseApplicationResource.getModel().getOrganizations()) {
							for (TimOrganization organization : timEnterpriseApplicationResource.getModel().getOrganizations()) {
								out.addAll(organization.getOrganizationUnits());
							}
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
						return (element instanceof TimOrganizationUnit);
					}
					
				});
				// Start of user code for additional businessfilters for organizationUnit
				// End of user code
			}
			if (isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.services)) {
				basePart.addFilterToServices(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInServicesTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToServices(new EObjectFilter(CommonConceptsPackage.Literals.TIM_SERVICE));
				// Start of user code for additional businessfilters for services
				// End of user code
			}
			
			
			
			if (isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.informations)) {
				basePart.addFilterToInformations(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInInformationsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToInformations(new EObjectFilter(ITRelatedPartPackage.Literals.TIM_INFORMATION_SET));
				// Start of user code for additional businessfilters for informations
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
		if (editorKey == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.name) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_Name();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.function) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_Function();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.type) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_Type();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.processes) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_Processes();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.model) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_Model();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.organizationUnit) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_OrganizationUnit();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.services) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_Services();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.description) {
			return ITRelatedPartPackage.eINSTANCE.getTimEnterpriseApplicationResource_Description();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.functionality) {
			return ITRelatedPartPackage.eINSTANCE.getTimEnterpriseApplicationResource_Functionality();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.characteristics) {
			return ITRelatedPartPackage.eINSTANCE.getTimEnterpriseApplicationResource_Characteristics();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.informations) {
			return ITRelatedPartPackage.eINSTANCE.getTimEnterpriseApplicationResource_Informations();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TimEnterpriseApplicationResource timEnterpriseApplicationResource = (TimEnterpriseApplicationResource)semanticObject;
		if (ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.name == event.getAffectedEditor()) {
			timEnterpriseApplicationResource.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.function == event.getAffectedEditor()) {
			timEnterpriseApplicationResource.setFunction((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.type == event.getAffectedEditor()) {
			timEnterpriseApplicationResource.setType((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.processes == event.getAffectedEditor()) {
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
		if (ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.organizationUnit == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				organizationUnitSettings.setToReference((TimOrganizationUnit)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				TimOrganizationUnit eObject = HumanRelatedPartFactory.eINSTANCE.createTimOrganizationUnit();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				organizationUnitSettings.setToReference(eObject);
			}
		}
		if (ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.services == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof TimService) {
					servicesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				servicesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				servicesSettings.move(event.getNewIndex(), (TimService) event.getNewValue());
			}
		}
		if (ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.description == event.getAffectedEditor()) {
			timEnterpriseApplicationResource.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.functionality == event.getAffectedEditor()) {
			timEnterpriseApplicationResource.setFunctionality((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.characteristics == event.getAffectedEditor()) {
			timEnterpriseApplicationResource.setCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.informations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof TimInformationSet) {
					informationsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				informationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				informationsSettings.move(event.getNewIndex(), (TimInformationSet) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			TimEnterpriseApplicationResourcePropertiesEditionPart basePart = (TimEnterpriseApplicationResourcePropertiesEditionPart)editingPart;
			if (CommonConceptsPackage.eINSTANCE.getTimResource_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimResource_Function().equals(msg.getFeature()) && basePart != null && isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.function)) {
				if (msg.getNewValue() != null) {
					basePart.setFunction(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setFunction("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimResource_Type().equals(msg.getFeature()) && basePart != null && isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.type)) {
				if (msg.getNewValue() != null) {
					basePart.setType(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setType("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimResource_Processes().equals(msg.getFeature())  && isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.processes))
				basePart.updateProcesses();
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : model, TimEnterpriseApplicationResource, TimEnterpriseApplicationResource.
			if (CommonConceptsPackage.eINSTANCE.getTimResource_OrganizationUnit().equals(msg.getFeature()) && basePart != null && isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.organizationUnit))
				basePart.setOrganizationUnit((EObject)msg.getNewValue());
			if (CommonConceptsPackage.eINSTANCE.getTimResource_Services().equals(msg.getFeature())  && isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.services))
				basePart.updateServices();
			if (ITRelatedPartPackage.eINSTANCE.getTimEnterpriseApplicationResource_Description().equals(msg.getFeature()) && basePart != null && isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (ITRelatedPartPackage.eINSTANCE.getTimEnterpriseApplicationResource_Functionality().equals(msg.getFeature()) && basePart != null && isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.functionality)) {
				if (msg.getNewValue() != null) {
					basePart.setFunctionality(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setFunctionality("");
				}
			}
			if (ITRelatedPartPackage.eINSTANCE.getTimEnterpriseApplicationResource_Characteristics().equals(msg.getFeature()) && basePart != null && isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.characteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setCharacteristics(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCharacteristics("");
				}
			}
			if (ITRelatedPartPackage.eINSTANCE.getTimEnterpriseApplicationResource_Informations().equals(msg.getFeature())  && isAccessible(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.informations))
				basePart.updateInformations();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.model || key == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.organizationUnit;
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
				if (ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimResource_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimResource_Name().getEAttributeType(), newValue);
				}
				if (ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.function == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimResource_Function().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimResource_Function().getEAttributeType(), newValue);
				}
				if (ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimResource_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimResource_Type().getEAttributeType(), newValue);
				}
				if (ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ITRelatedPartPackage.eINSTANCE.getTimEnterpriseApplicationResource_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ITRelatedPartPackage.eINSTANCE.getTimEnterpriseApplicationResource_Description().getEAttributeType(), newValue);
				}
				if (ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.functionality == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ITRelatedPartPackage.eINSTANCE.getTimEnterpriseApplicationResource_Functionality().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ITRelatedPartPackage.eINSTANCE.getTimEnterpriseApplicationResource_Functionality().getEAttributeType(), newValue);
				}
				if (ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.characteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ITRelatedPartPackage.eINSTANCE.getTimEnterpriseApplicationResource_Characteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ITRelatedPartPackage.eINSTANCE.getTimEnterpriseApplicationResource_Characteristics().getEAttributeType(), newValue);
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
