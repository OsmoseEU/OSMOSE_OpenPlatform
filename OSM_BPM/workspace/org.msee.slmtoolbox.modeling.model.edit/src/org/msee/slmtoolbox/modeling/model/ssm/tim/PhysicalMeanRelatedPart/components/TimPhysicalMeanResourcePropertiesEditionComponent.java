/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.components;

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
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.PhysicalMeanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.PhysicalMeanRelatedPartViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class TimPhysicalMeanResourcePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	 * Default constructor
	 * 
	 */
	public TimPhysicalMeanResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject timPhysicalMeanResource, String editing_mode) {
		super(editingContext, timPhysicalMeanResource, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = PhysicalMeanRelatedPartViewsRepository.class;
		partKey = PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.class;
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
			final TimPhysicalMeanResource timPhysicalMeanResource = (TimPhysicalMeanResource)elt;
			final TimPhysicalMeanResourcePropertiesEditionPart basePart = (TimPhysicalMeanResourcePropertiesEditionPart)editingPart;
			// init values
			if (timPhysicalMeanResource.getName() != null && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timPhysicalMeanResource.getName()));
			
			if (timPhysicalMeanResource.getFunction() != null && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function))
				basePart.setFunction(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timPhysicalMeanResource.getFunction()));
			
			if (timPhysicalMeanResource.getType() != null && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type))
				basePart.setType(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timPhysicalMeanResource.getType()));
			
			if (isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes)) {
				processesSettings = new ReferencesTableSettings(timPhysicalMeanResource, CommonConceptsPackage.eINSTANCE.getTimResource_Processes());
				basePart.initProcesses(processesSettings);
			}
			// Start of user code for additional initPart
			if (timPhysicalMeanResource.getModel() != null && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.model)) {
				basePart.setModel(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timPhysicalMeanResource.getModel().getName()));
			}
			// End of user code
			if (isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit)) {
				// init part
				organizationUnitSettings = new EObjectFlatComboSettings(timPhysicalMeanResource, CommonConceptsPackage.eINSTANCE.getTimResource_OrganizationUnit());
				basePart.initOrganizationUnit(organizationUnitSettings);
				// set the button mode
				basePart.setOrganizationUnitButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services)) {
				servicesSettings = new ReferencesTableSettings(timPhysicalMeanResource, CommonConceptsPackage.eINSTANCE.getTimResource_Services());
				basePart.initServices(servicesSettings);
			}
			if (timPhysicalMeanResource.getCapability() != null && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability))
				basePart.setCapability(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timPhysicalMeanResource.getCapability()));
			
			if (timPhysicalMeanResource.getConstraint() != null && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint))
				basePart.setConstraint(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timPhysicalMeanResource.getConstraint()));
			
			if (timPhysicalMeanResource.getOperationMode() != null && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode))
				basePart.setOperationMode(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timPhysicalMeanResource.getOperationMode()));
			
			if (timPhysicalMeanResource.getTechnicalCharacteristics() != null && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics))
				basePart.setTechnicalCharacteristics(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timPhysicalMeanResource.getTechnicalCharacteristics()));
			
			if (timPhysicalMeanResource.getExpectedPerformance() != null && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance))
				basePart.setExpectedPerformance(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timPhysicalMeanResource.getExpectedPerformance()));
			
			// init filters
			
			
			
			if (isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes)) {
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
			if (isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit)) {
				basePart.addFilterToOrganizationUnit(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						List<TimOrganizationUnit> out = new ArrayList<>();
						if (null != timPhysicalMeanResource.getModel() 
								&& null != timPhysicalMeanResource.getModel().getOrganizations()) {
							for (TimOrganization organization : timPhysicalMeanResource.getModel().getOrganizations()) {
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
			if (isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services)) {
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
		if (editorKey == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_Name();
		}
		if (editorKey == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_Function();
		}
		if (editorKey == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_Type();
		}
		if (editorKey == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_Processes();
		}
		if (editorKey == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.model) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_Model();
		}
		if (editorKey == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_OrganizationUnit();
		}
		if (editorKey == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_Services();
		}
		if (editorKey == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability) {
			return PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_Capability();
		}
		if (editorKey == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint) {
			return PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_Constraint();
		}
		if (editorKey == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode) {
			return PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_OperationMode();
		}
		if (editorKey == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics) {
			return PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_TechnicalCharacteristics();
		}
		if (editorKey == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance) {
			return PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_ExpectedPerformance();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TimPhysicalMeanResource timPhysicalMeanResource = (TimPhysicalMeanResource)semanticObject;
		if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name == event.getAffectedEditor()) {
			timPhysicalMeanResource.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function == event.getAffectedEditor()) {
			timPhysicalMeanResource.setFunction((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type == event.getAffectedEditor()) {
			timPhysicalMeanResource.setType((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes == event.getAffectedEditor()) {
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
		if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit == event.getAffectedEditor()) {
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
		if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services == event.getAffectedEditor()) {
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
		if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability == event.getAffectedEditor()) {
			timPhysicalMeanResource.setCapability((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint == event.getAffectedEditor()) {
			timPhysicalMeanResource.setConstraint((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode == event.getAffectedEditor()) {
			timPhysicalMeanResource.setOperationMode((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics == event.getAffectedEditor()) {
			timPhysicalMeanResource.setTechnicalCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance == event.getAffectedEditor()) {
			timPhysicalMeanResource.setExpectedPerformance((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			TimPhysicalMeanResourcePropertiesEditionPart basePart = (TimPhysicalMeanResourcePropertiesEditionPart)editingPart;
			if (CommonConceptsPackage.eINSTANCE.getTimResource_Name().equals(msg.getFeature()) && basePart != null && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimResource_Function().equals(msg.getFeature()) && basePart != null && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function)) {
				if (msg.getNewValue() != null) {
					basePart.setFunction(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setFunction("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimResource_Type().equals(msg.getFeature()) && basePart != null && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type)) {
				if (msg.getNewValue() != null) {
					basePart.setType(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setType("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimResource_Processes().equals(msg.getFeature())  && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes))
				basePart.updateProcesses();
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : model, TimPhysicalMeanResource, TimPhysicalMeanResource.
			if (CommonConceptsPackage.eINSTANCE.getTimResource_OrganizationUnit().equals(msg.getFeature()) && basePart != null && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit))
				basePart.setOrganizationUnit((EObject)msg.getNewValue());
			if (CommonConceptsPackage.eINSTANCE.getTimResource_Services().equals(msg.getFeature())  && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services))
				basePart.updateServices();
			if (PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_Capability().equals(msg.getFeature()) && basePart != null && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability)) {
				if (msg.getNewValue() != null) {
					basePart.setCapability(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCapability("");
				}
			}
			if (PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_Constraint().equals(msg.getFeature()) && basePart != null && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint)) {
				if (msg.getNewValue() != null) {
					basePart.setConstraint(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setConstraint("");
				}
			}
			if (PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_OperationMode().equals(msg.getFeature()) && basePart != null && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode)) {
				if (msg.getNewValue() != null) {
					basePart.setOperationMode(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setOperationMode("");
				}
			}
			if (PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_TechnicalCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setTechnicalCharacteristics(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setTechnicalCharacteristics("");
				}
			}
			if (PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_ExpectedPerformance().equals(msg.getFeature()) && basePart != null && isAccessible(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance)) {
				if (msg.getNewValue() != null) {
					basePart.setExpectedPerformance(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setExpectedPerformance("");
				}
			}
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.model || key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit;
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
				if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimResource_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimResource_Name().getEAttributeType(), newValue);
				}
				if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimResource_Function().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimResource_Function().getEAttributeType(), newValue);
				}
				if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimResource_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimResource_Type().getEAttributeType(), newValue);
				}
				if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_Capability().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_Capability().getEAttributeType(), newValue);
				}
				if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_Constraint().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_Constraint().getEAttributeType(), newValue);
				}
				if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_OperationMode().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_OperationMode().getEAttributeType(), newValue);
				}
				if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_TechnicalCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_TechnicalCharacteristics().getEAttributeType(), newValue);
				}
				if (PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_ExpectedPerformance().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(PhysicalMeanRelatedPartPackage.eINSTANCE.getTimPhysicalMeanResource_ExpectedPerformance().getEAttributeType(), newValue);
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
