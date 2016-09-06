/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
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
import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFactory;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResourceType;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BsmResourcePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for service EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings serviceSettings;
	
	/**
	 * Settings for processes ReferencesTable
	 */
	private ReferencesTableSettings processesSettings;
	
	/**
	 * Settings for organization EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings organizationSettings;
	
	/**
	 * Settings for eaResources ReferencesTable
	 */
	private ReferencesTableSettings eaResourcesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BsmResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bsmResource, String editing_mode) {
		super(editingContext, bsmResource, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BsmViewsRepository.class;
		partKey = BsmViewsRepository.BsmResource.class;
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
			final BsmResource bsmResource = (BsmResource)elt;
			final BsmResourcePropertiesEditionPart basePart = (BsmResourcePropertiesEditionPart)editingPart;
			// init values
			if (bsmResource.getName() != null && isAccessible(BsmViewsRepository.BsmResource.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmResource.getName()));
			
			if (isAccessible(BsmViewsRepository.BsmResource.Properties.type)) {
				// Start of user code  for horizon
				basePart.initType(
						new BsmResourceType [] {
								BsmResourceType.HUMAN,
								BsmResourceType.IT,
								BsmResourceType.PHYSICAL_MEAN,
								BsmResourceType.UNDEFINED,
						}
						, bsmResource.getType());
				// End of user code			
				}
			if (bsmResource.getRole() != null && isAccessible(BsmViewsRepository.BsmResource.Properties.role))
				basePart.setRole(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmResource.getRole()));
			
			if (bsmResource.getCapability() != null && isAccessible(BsmViewsRepository.BsmResource.Properties.capability))
				basePart.setCapability(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmResource.getCapability()));
			
			if (bsmResource.getConstraint() != null && isAccessible(BsmViewsRepository.BsmResource.Properties.constraint))
				basePart.setConstraint(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmResource.getConstraint()));
			
			if (isAccessible(BsmViewsRepository.BsmResource.Properties.service)) {
				// init part
				serviceSettings = new EObjectFlatComboSettings(bsmResource, BsmPackage.eINSTANCE.getBsmResource_Service());
				basePart.initService(serviceSettings);
				// set the button mode
				basePart.setServiceButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(BsmViewsRepository.BsmResource.Properties.processes)) {
				processesSettings = new ReferencesTableSettings(bsmResource, BsmPackage.eINSTANCE.getBsmResource_Processes());
				basePart.initProcesses(processesSettings);
			}
			if (isAccessible(BsmViewsRepository.BsmResource.Properties.organization)) {
				// init part
				organizationSettings = new EObjectFlatComboSettings(bsmResource, BsmPackage.eINSTANCE.getBsmResource_Organization());
				basePart.initOrganization(organizationSettings);
				// set the button mode
				basePart.setOrganizationButtonMode(ButtonsModeEnum.BROWSE);
			}
			
			if (isAccessible(BsmViewsRepository.BsmResource.Properties.eaResources)) {
				eaResourcesSettings = new ReferencesTableSettings(bsmResource, BsmPackage.eINSTANCE.getBsmResource_EaResources());
				basePart.initEaResources(eaResourcesSettings);
			}
			// init filters
			
			
			
			
			
			if (isAccessible(BsmViewsRepository.BsmResource.Properties.service)) {
				basePart.addFilterToService(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof BsmService);
					}
					
				});
				// Start of user code for additional businessfilters for service
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmResource.Properties.processes)) {
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
				basePart.addFilterToProcesses(new EObjectFilter(BsmPackage.Literals.BSM_PROCESS));
				// Start of user code for additional businessfilters for processes
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmResource.Properties.organization)) {
				basePart.addFilterToOrganization(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						Object[] out = new Object[bsmResource.getBsmModel().getOrganizations().size()];
						out= bsmResource.getBsmModel().getOrganizations().toArray();						
					
						return out;
						
					}
					// End of user code
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof BsmEnterprise);
					}
					
				});
				// Start of user code for additional businessfilters for organization
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmResource.Properties.eaResources)) {
				basePart.addFilterToEaResources(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInEaResourcesTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToEaResources(new EObjectFilter(CoreElementsPackage.Literals.EA_RESOURCE));
				// Start of user code for additional businessfilters for eaResources
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
		if (editorKey == BsmViewsRepository.BsmResource.Properties.name) {
			return BsmPackage.eINSTANCE.getBsmResource_Name();
		}
		if (editorKey == BsmViewsRepository.BsmResource.Properties.type) {
			return BsmPackage.eINSTANCE.getBsmResource_Type();
		}
		if (editorKey == BsmViewsRepository.BsmResource.Properties.role) {
			return BsmPackage.eINSTANCE.getBsmResource_Role();
		}
		if (editorKey == BsmViewsRepository.BsmResource.Properties.capability) {
			return BsmPackage.eINSTANCE.getBsmResource_Capability();
		}
		if (editorKey == BsmViewsRepository.BsmResource.Properties.constraint) {
			return BsmPackage.eINSTANCE.getBsmResource_Constraint();
		}
		if (editorKey == BsmViewsRepository.BsmResource.Properties.service) {
			return BsmPackage.eINSTANCE.getBsmResource_Service();
		}
		if (editorKey == BsmViewsRepository.BsmResource.Properties.processes) {
			return BsmPackage.eINSTANCE.getBsmResource_Processes();
		}
		if (editorKey == BsmViewsRepository.BsmResource.Properties.organization) {
			return BsmPackage.eINSTANCE.getBsmResource_Organization();
		}
		if (editorKey == BsmViewsRepository.BsmResource.Properties.eaResources) {
			return BsmPackage.eINSTANCE.getBsmResource_EaResources();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BsmResource bsmResource = (BsmResource)semanticObject;
		if (BsmViewsRepository.BsmResource.Properties.name == event.getAffectedEditor()) {
		// Start of user code for updateSemanticModel
			String name = (java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue());
			bsmResource.setName(name);
			EList<EaResource> attachedResources = bsmResource.getEaResources();
			for (int i = 0; i <attachedResources.size(); i++){
				EaResource resource = attachedResources.get(i);
				resource.setName(name);
			}
			// End of user code		
			}
		if (BsmViewsRepository.BsmResource.Properties.type == event.getAffectedEditor()) {
			bsmResource.setType((BsmResourceType)event.getNewValue());
		}
		if (BsmViewsRepository.BsmResource.Properties.role == event.getAffectedEditor()) {
			bsmResource.setRole((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmResource.Properties.capability == event.getAffectedEditor()) {
			bsmResource.setCapability((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmResource.Properties.constraint == event.getAffectedEditor()) {
			bsmResource.setConstraint((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmResource.Properties.service == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				serviceSettings.setToReference((BsmService)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				BsmService eObject = BsmFactory.eINSTANCE.createBsmService();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				serviceSettings.setToReference(eObject);
			}
		}
		if (BsmViewsRepository.BsmResource.Properties.processes == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmProcess) {
					processesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				processesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				processesSettings.move(event.getNewIndex(), (BsmProcess) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmResource.Properties.organization == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				organizationSettings.setToReference((BsmEnterprise)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				BsmEnterprise eObject = BsmFactory.eINSTANCE.createBsmEnterprise();
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
		if (BsmViewsRepository.BsmResource.Properties.eaResources == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof EaResource) {
					eaResourcesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				eaResourcesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				eaResourcesSettings.move(event.getNewIndex(), (EaResource) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			BsmResourcePropertiesEditionPart basePart = (BsmResourcePropertiesEditionPart)editingPart;
			if (BsmPackage.eINSTANCE.getBsmResource_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmResource.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmResource_Type().equals(msg.getFeature()) && isAccessible(BsmViewsRepository.BsmResource.Properties.type))
				basePart.setType((BsmResourceType)msg.getNewValue());
			
			if (BsmPackage.eINSTANCE.getBsmResource_Role().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmResource.Properties.role)) {
				if (msg.getNewValue() != null) {
					basePart.setRole(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setRole("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmResource_Capability().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmResource.Properties.capability)) {
				if (msg.getNewValue() != null) {
					basePart.setCapability(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCapability("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmResource_Constraint().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmResource.Properties.constraint)) {
				if (msg.getNewValue() != null) {
					basePart.setConstraint(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setConstraint("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmResource_Service().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmResource.Properties.service))
				basePart.setService((EObject)msg.getNewValue());
			if (BsmPackage.eINSTANCE.getBsmResource_Processes().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmResource.Properties.processes))
				basePart.updateProcesses();
			if (BsmPackage.eINSTANCE.getBsmResource_Organization().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmResource.Properties.organization))
				basePart.setOrganization((EObject)msg.getNewValue());
			if (BsmPackage.eINSTANCE.getBsmResource_EaResources().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmResource.Properties.eaResources))
				basePart.updateEaResources();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == BsmViewsRepository.BsmResource.Properties.service || key == BsmViewsRepository.BsmResource.Properties.organization || key == BsmViewsRepository.BsmResource.Properties.bsmModel;
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
				if (BsmViewsRepository.BsmResource.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmResource_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmResource_Name().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmResource.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmResource_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmResource_Type().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmResource.Properties.role == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmResource_Role().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmResource_Role().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmResource.Properties.capability == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmResource_Capability().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmResource_Capability().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmResource.Properties.constraint == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmResource_Constraint().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmResource_Constraint().getEAttributeType(), newValue);
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
