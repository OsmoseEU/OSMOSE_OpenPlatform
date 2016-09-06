/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.components;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFactory;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BsmMseServicePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for process EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings processSettings;
	
	/**
	 * Settings for organization EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings organizationSettings;
	
	/**
	 * Settings for resource EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings resourceSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BsmMseServicePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bsmMseService, String editing_mode) {
		super(editingContext, bsmMseService, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BsmViewsRepository.class;
		partKey = BsmViewsRepository.BsmMseService.class;
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
			final BsmMseService bsmMseService = (BsmMseService)elt;
			final BsmMseServicePropertiesEditionPart basePart = (BsmMseServicePropertiesEditionPart)editingPart;
			// init values
			if (bsmMseService.getName() != null && isAccessible(BsmViewsRepository.BsmMseService.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmMseService.getName()));
			
			if (bsmMseService.getDescription() != null && isAccessible(BsmViewsRepository.BsmMseService.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmMseService.getDescription()));
			
			if (bsmMseService.getOwner() != null && isAccessible(BsmViewsRepository.BsmMseService.Properties.owner))
				basePart.setOwner(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmMseService.getOwner()));
			
			if (bsmMseService.getCreateDate() != null && isAccessible(BsmViewsRepository.BsmMseService.Properties.createDate))
				basePart.setCreateDate(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmMseService.getCreateDate()));
			
			if (bsmMseService.getPublishedDate() != null && isAccessible(BsmViewsRepository.BsmMseService.Properties.publishedDate))
				basePart.setPublishedDate(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmMseService.getPublishedDate()));
			
			if (bsmMseService.getPublished() != null && isAccessible(BsmViewsRepository.BsmMseService.Properties.published))
				basePart.setPublished(EEFConverterUtil.convertToString(EcorePackage.Literals.EINTEGER_OBJECT, bsmMseService.getPublished()));
				
			if (isAccessible(BsmViewsRepository.BsmMseService.Properties.process)) {
				// init part
				processSettings = new EObjectFlatComboSettings(bsmMseService, BsmPackage.eINSTANCE.getBsmMseService_Process());
				basePart.initProcess(processSettings);
				// set the button mode
				basePart.setProcessButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(BsmViewsRepository.BsmMseService.Properties.organization)) {
				// init part
				organizationSettings = new EObjectFlatComboSettings(bsmMseService, BsmPackage.eINSTANCE.getBsmMseService_Organization());
				basePart.initOrganization(organizationSettings);
				// set the button mode
				basePart.setOrganizationButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(BsmViewsRepository.BsmMseService.Properties.resource)) {
				// init part
				resourceSettings = new EObjectFlatComboSettings(bsmMseService, BsmPackage.eINSTANCE.getBsmMseService_Resource());
				basePart.initResource(resourceSettings);
				// set the button mode
				basePart.setResourceButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			
			
			
			
			
			if (isAccessible(BsmViewsRepository.BsmMseService.Properties.process)) {
				basePart.addFilterToProcess(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
						EList<BsmProcess> processes = bsmMseService.getProcess().getBsmModel().getProcesses();
						List<BsmProcess> returnlist = new ArrayList<BsmProcess>();
						for (BsmProcess process : processes) {
							if (null == process.getMseService()) {
								returnlist.add(process);
							}
						}
						return returnlist.toArray();
						
					}
					// End of user code
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof BsmProcess); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for process
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmMseService.Properties.organization)) {
				basePart.addFilterToOrganization(new ViewerFilter() {
							// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
						EList<BsmOrganization> organizations = bsmMseService.getProcess().getBsmModel().getOrganizations();
						List<BsmOrganization> returnlist = new ArrayList<BsmOrganization>();
						for (BsmOrganization organization : organizations) {
							if (!organization.getMseService().contains(bsmMseService)) {
								returnlist.add(organization);
							}
						}
						return returnlist.toArray();
						
					}
					// End of user code
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof BsmOrganization);
					}
					
				});
				// Start of user code for additional businessfilters for organization
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmMseService.Properties.resource)) {
				basePart.addFilterToResource(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof BsmResource); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for resource
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
		if (editorKey == BsmViewsRepository.BsmMseService.Properties.name) {
			return BsmPackage.eINSTANCE.getBsmMseService_Name();
		}
		if (editorKey == BsmViewsRepository.BsmMseService.Properties.description) {
			return BsmPackage.eINSTANCE.getBsmMseService_Description();
		}
		if (editorKey == BsmViewsRepository.BsmMseService.Properties.owner) {
			return BsmPackage.eINSTANCE.getBsmMseService_Owner();
		}
		if (editorKey == BsmViewsRepository.BsmMseService.Properties.createDate) {
			return BsmPackage.eINSTANCE.getBsmMseService_CreateDate();
		}
		if (editorKey == BsmViewsRepository.BsmMseService.Properties.publishedDate) {
			return BsmPackage.eINSTANCE.getBsmMseService_PublishedDate();
		}
		if (editorKey == BsmViewsRepository.BsmMseService.Properties.published) {
			return BsmPackage.eINSTANCE.getBsmMseService_Published();
		}
		if (editorKey == BsmViewsRepository.BsmMseService.Properties.process) {
			return BsmPackage.eINSTANCE.getBsmMseService_Process();
		}
		if (editorKey == BsmViewsRepository.BsmMseService.Properties.organization) {
			return BsmPackage.eINSTANCE.getBsmMseService_Organization();
		}
		if (editorKey == BsmViewsRepository.BsmMseService.Properties.resource) {
			return BsmPackage.eINSTANCE.getBsmMseService_Resource();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BsmMseService bsmMseService = (BsmMseService)semanticObject;
		if (BsmViewsRepository.BsmMseService.Properties.name == event.getAffectedEditor()) {
			bsmMseService.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmMseService.Properties.description == event.getAffectedEditor()) {
			bsmMseService.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmMseService.Properties.owner == event.getAffectedEditor()) {
			bsmMseService.setOwner((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmMseService.Properties.createDate == event.getAffectedEditor()) {
			bsmMseService.setCreateDate((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmMseService.Properties.publishedDate == event.getAffectedEditor()) {
			bsmMseService.setPublishedDate((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmMseService.Properties.published == event.getAffectedEditor()) {
			bsmMseService.setPublished((java.lang.Integer)EEFConverterUtil.createFromString(EcorePackage.Literals.EINTEGER_OBJECT, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmMseService.Properties.process == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				processSettings.setToReference((BsmProcess)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				BsmProcess eObject = BsmFactory.eINSTANCE.createBsmProcess();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				processSettings.setToReference(eObject);
			}
		}
		if (BsmViewsRepository.BsmMseService.Properties.organization == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				organizationSettings.setToReference((BsmOrganization)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EReferencePropertiesEditionContext context = new EReferencePropertiesEditionContext(editingContext, this, organizationSettings, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(semanticObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy instanceof CreateEditingPolicy) {
						policy.execute();
					}
				}
			}
		}
		if (BsmViewsRepository.BsmMseService.Properties.resource == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				resourceSettings.setToReference((BsmResource)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				BsmResource eObject = BsmFactory.eINSTANCE.createBsmResource();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				resourceSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			BsmMseServicePropertiesEditionPart basePart = (BsmMseServicePropertiesEditionPart)editingPart;
			if (BsmPackage.eINSTANCE.getBsmMseService_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmMseService.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmMseService_Description().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmMseService.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmMseService_Owner().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmMseService.Properties.owner)) {
				if (msg.getNewValue() != null) {
					basePart.setOwner(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setOwner("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmMseService_CreateDate().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmMseService.Properties.createDate)) {
				if (msg.getNewValue() != null) {
					basePart.setCreateDate(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCreateDate("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmMseService_PublishedDate().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmMseService.Properties.publishedDate)) {
				if (msg.getNewValue() != null) {
					basePart.setPublishedDate(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setPublishedDate("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmMseService_Published().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmMseService.Properties.published)) {
				if (msg.getNewValue() != null) {
					basePart.setPublished(EcoreUtil.convertToString(EcorePackage.Literals.EINTEGER_OBJECT, msg.getNewValue()));
				} else {
					basePart.setPublished("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmMseService_Process().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmMseService.Properties.process))
				basePart.setProcess((EObject)msg.getNewValue());
			if (BsmPackage.eINSTANCE.getBsmMseService_Organization().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmMseService.Properties.organization))
				basePart.setOrganization((EObject)msg.getNewValue());
			if (BsmPackage.eINSTANCE.getBsmMseService_Resource().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmMseService.Properties.resource))
				basePart.setResource((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == BsmViewsRepository.BsmMseService.Properties.organization;
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
				if (BsmViewsRepository.BsmMseService.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmMseService_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmMseService_Name().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmMseService.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmMseService_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmMseService_Description().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmMseService.Properties.owner == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmMseService_Owner().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmMseService_Owner().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmMseService.Properties.createDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmMseService_CreateDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmMseService_CreateDate().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmMseService.Properties.publishedDate == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmMseService_PublishedDate().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmMseService_PublishedDate().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmMseService.Properties.published == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmMseService_Published().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmMseService_Published().getEAttributeType(), newValue);
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
