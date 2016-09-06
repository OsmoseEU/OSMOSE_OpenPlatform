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
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartFactory;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimHumanResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.HumanRelatedPartViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class TimHumanResourcePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	public TimHumanResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject timHumanResource, String editing_mode) {
		super(editingContext, timHumanResource, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = HumanRelatedPartViewsRepository.class;
		partKey = HumanRelatedPartViewsRepository.TimHumanResource.class;
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
			final TimHumanResource timHumanResource = (TimHumanResource)elt;
			final TimHumanResourcePropertiesEditionPart basePart = (TimHumanResourcePropertiesEditionPart)editingPart;
			// init values
			if (timHumanResource.getName() != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timHumanResource.getName()));
			
			if (timHumanResource.getFunction() != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.function))
				basePart.setFunction(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timHumanResource.getFunction()));
			
			if (timHumanResource.getType() != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.type))
				basePart.setType(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timHumanResource.getType()));
			
			if (isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.processes)) {
				processesSettings = new ReferencesTableSettings(timHumanResource, CommonConceptsPackage.eINSTANCE.getTimResource_Processes());
				basePart.initProcesses(processesSettings);
			}
			// Start of user code for additional initPart
			if (timHumanResource.getModel() != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.model)) {
				basePart.setModel(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timHumanResource.getModel().getName()));
			}
			// End of user code
			if (isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.organizationUnit)) {
				// init part
				organizationUnitSettings = new EObjectFlatComboSettings(timHumanResource, CommonConceptsPackage.eINSTANCE.getTimResource_OrganizationUnit());
				basePart.initOrganizationUnit(organizationUnitSettings);
				// set the button mode
				basePart.setOrganizationUnitButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.services)) {
				servicesSettings = new ReferencesTableSettings(timHumanResource, CommonConceptsPackage.eINSTANCE.getTimResource_Services());
				basePart.initServices(servicesSettings);
			}
			if (timHumanResource.getCapability() != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.capability))
				basePart.setCapability(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timHumanResource.getCapability()));
			
			if (timHumanResource.getConstraint() != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.constraint))
				basePart.setConstraint(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timHumanResource.getConstraint()));
			
			if (timHumanResource.getSkills() != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.skills))
				basePart.setSkills(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timHumanResource.getSkills()));
			
			if (timHumanResource.getEducationLevel() != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.educationLevel))
				basePart.setEducationLevel(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timHumanResource.getEducationLevel()));
			
			if (isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.quantity)) {
				basePart.setQuantity(EEFConverterUtil.convertToString(EcorePackage.Literals.EINT, timHumanResource.getQuantity()));
			}
			
			if (timHumanResource.getExpectedPerformance() != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.expectedPerformance))
				basePart.setExpectedPerformance(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timHumanResource.getExpectedPerformance()));
			
			// init filters
			
			
			
			if (isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.processes)) {
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
			if (isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.organizationUnit)) {
				basePart.addFilterToOrganizationUnit(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						List<TimOrganizationUnit> out = new ArrayList<>();
						if (null != timHumanResource.getModel() 
								&& null != timHumanResource.getModel().getOrganizations()) {
							for (TimOrganization organization : timHumanResource.getModel().getOrganizations()) {
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
			if (isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.services)) {
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
		if (editorKey == HumanRelatedPartViewsRepository.TimHumanResource.Properties.name) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_Name();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimHumanResource.Properties.function) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_Function();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimHumanResource.Properties.type) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_Type();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimHumanResource.Properties.processes) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_Processes();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimHumanResource.Properties.model) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_Model();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimHumanResource.Properties.organizationUnit) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_OrganizationUnit();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimHumanResource.Properties.services) {
			return CommonConceptsPackage.eINSTANCE.getTimResource_Services();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimHumanResource.Properties.capability) {
			return HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_Capability();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimHumanResource.Properties.constraint) {
			return HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_Constraint();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimHumanResource.Properties.skills) {
			return HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_Skills();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimHumanResource.Properties.educationLevel) {
			return HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_EducationLevel();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimHumanResource.Properties.quantity) {
			return HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_Quantity();
		}
		if (editorKey == HumanRelatedPartViewsRepository.TimHumanResource.Properties.expectedPerformance) {
			return HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_ExpectedPerformance();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TimHumanResource timHumanResource = (TimHumanResource)semanticObject;
		if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.name == event.getAffectedEditor()) {
			timHumanResource.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.function == event.getAffectedEditor()) {
			timHumanResource.setFunction((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.type == event.getAffectedEditor()) {
			timHumanResource.setType((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.processes == event.getAffectedEditor()) {
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
		if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.organizationUnit == event.getAffectedEditor()) {
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
		if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.services == event.getAffectedEditor()) {
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
		if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.capability == event.getAffectedEditor()) {
			timHumanResource.setCapability((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.constraint == event.getAffectedEditor()) {
			timHumanResource.setConstraint((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.skills == event.getAffectedEditor()) {
			timHumanResource.setSkills((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.educationLevel == event.getAffectedEditor()) {
			timHumanResource.setEducationLevel((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.quantity == event.getAffectedEditor()) {
			timHumanResource.setQuantity((EEFConverterUtil.createIntFromString(EcorePackage.Literals.EINT, (String)event.getNewValue())));
		}
		if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.expectedPerformance == event.getAffectedEditor()) {
			timHumanResource.setExpectedPerformance((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			TimHumanResourcePropertiesEditionPart basePart = (TimHumanResourcePropertiesEditionPart)editingPart;
			if (CommonConceptsPackage.eINSTANCE.getTimResource_Name().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimResource_Function().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.function)) {
				if (msg.getNewValue() != null) {
					basePart.setFunction(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setFunction("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimResource_Type().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.type)) {
				if (msg.getNewValue() != null) {
					basePart.setType(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setType("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimResource_Processes().equals(msg.getFeature())  && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.processes))
				basePart.updateProcesses();
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : model, TimHumanResource, TimHumanResource.
			if (CommonConceptsPackage.eINSTANCE.getTimResource_OrganizationUnit().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.organizationUnit))
				basePart.setOrganizationUnit((EObject)msg.getNewValue());
			if (CommonConceptsPackage.eINSTANCE.getTimResource_Services().equals(msg.getFeature())  && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.services))
				basePart.updateServices();
			if (HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_Capability().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.capability)) {
				if (msg.getNewValue() != null) {
					basePart.setCapability(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCapability("");
				}
			}
			if (HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_Constraint().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.constraint)) {
				if (msg.getNewValue() != null) {
					basePart.setConstraint(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setConstraint("");
				}
			}
			if (HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_Skills().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.skills)) {
				if (msg.getNewValue() != null) {
					basePart.setSkills(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setSkills("");
				}
			}
			if (HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_EducationLevel().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.educationLevel)) {
				if (msg.getNewValue() != null) {
					basePart.setEducationLevel(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setEducationLevel("");
				}
			}
			if (HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_Quantity().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.quantity)) {
				if (msg.getNewValue() != null) {
					basePart.setQuantity(EcoreUtil.convertToString(EcorePackage.Literals.EINT, msg.getNewValue()));
				} else {
					basePart.setQuantity("");
				}
			}
			if (HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_ExpectedPerformance().equals(msg.getFeature()) && basePart != null && isAccessible(HumanRelatedPartViewsRepository.TimHumanResource.Properties.expectedPerformance)) {
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
		return key == HumanRelatedPartViewsRepository.TimHumanResource.Properties.model || key == HumanRelatedPartViewsRepository.TimHumanResource.Properties.organizationUnit;
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
				if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimResource_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimResource_Name().getEAttributeType(), newValue);
				}
				if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.function == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimResource_Function().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimResource_Function().getEAttributeType(), newValue);
				}
				if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimResource_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimResource_Type().getEAttributeType(), newValue);
				}
				if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.capability == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_Capability().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_Capability().getEAttributeType(), newValue);
				}
				if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.constraint == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_Constraint().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_Constraint().getEAttributeType(), newValue);
				}
				if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.skills == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_Skills().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_Skills().getEAttributeType(), newValue);
				}
				if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.educationLevel == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_EducationLevel().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_EducationLevel().getEAttributeType(), newValue);
				}
				if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.quantity == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_Quantity().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_Quantity().getEAttributeType(), newValue);
				}
				if (HumanRelatedPartViewsRepository.TimHumanResource.Properties.expectedPerformance == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_ExpectedPerformance().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(HumanRelatedPartPackage.eINSTANCE.getTimHumanResource_ExpectedPerformance().getEAttributeType(), newValue);
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
