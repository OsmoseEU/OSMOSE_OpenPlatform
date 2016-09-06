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
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsFactory;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFactory;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;

// End of user code

/**
 * 
 * 
 */
public class BsmProcessPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for subProcess ReferencesTable
	 */
	private ReferencesTableSettings subProcessSettings;
	
	/**
	 * Settings for mainProcess EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings mainProcessSettings;
	
	/**
	 * Settings for resources ReferencesTable
	 */
	private ReferencesTableSettings resourcesSettings;
	
	/**
	 * Settings for organizations ReferencesTable
	 */
	private ReferencesTableSettings organizationsSettings;
	
	/**
	 * Settings for eaProcess EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings eaProcessSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BsmProcessPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bsmProcess, String editing_mode) {
		super(editingContext, bsmProcess, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BsmViewsRepository.class;
		partKey = BsmViewsRepository.BsmProcess.class;
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
			final BsmProcess bsmProcess = (BsmProcess)elt;
			final BsmProcessPropertiesEditionPart basePart = (BsmProcessPropertiesEditionPart)editingPart;
			// init values
			if (bsmProcess.getName() != null && isAccessible(BsmViewsRepository.BsmProcess.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmProcess.getName()));
			
			if (bsmProcess.getObjective() != null && isAccessible(BsmViewsRepository.BsmProcess.Properties.objective))
				basePart.setObjective(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmProcess.getObjective()));
			
			if (bsmProcess.getTrigger() != null && isAccessible(BsmViewsRepository.BsmProcess.Properties.trigger))
				basePart.setTrigger(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmProcess.getTrigger()));
			
			if (bsmProcess.getResult() != null && isAccessible(BsmViewsRepository.BsmProcess.Properties.result))
				basePart.setResult(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmProcess.getResult()));
			
			if (bsmProcess.getConstraint() != null && isAccessible(BsmViewsRepository.BsmProcess.Properties.constraint))
				basePart.setConstraint(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmProcess.getConstraint()));
			
			if (isAccessible(BsmViewsRepository.BsmProcess.Properties.subProcess)) {
				subProcessSettings = new ReferencesTableSettings(bsmProcess, BsmPackage.eINSTANCE.getBsmProcess_SubProcess());
				basePart.initSubProcess(subProcessSettings);
			}
			if (isAccessible(BsmViewsRepository.BsmProcess.Properties.mainProcess)) {
				// init part
				mainProcessSettings = new EObjectFlatComboSettings(bsmProcess, BsmPackage.eINSTANCE.getBsmProcess_MainProcess());
				basePart.initMainProcess(mainProcessSettings);
				// set the button mode
				basePart.setMainProcessButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(BsmViewsRepository.BsmProcess.Properties.resources)) {
				resourcesSettings = new ReferencesTableSettings(bsmProcess, BsmPackage.eINSTANCE.getBsmProcess_Resources());
				basePart.initResources(resourcesSettings);
			}
			if (isAccessible(BsmViewsRepository.BsmProcess.Properties.organizations)) {
				organizationsSettings = new ReferencesTableSettings(bsmProcess, BsmPackage.eINSTANCE.getBsmProcess_Organizations());
				basePart.initOrganizations(organizationsSettings);
			}
			if (isAccessible(BsmViewsRepository.BsmProcess.Properties.eaProcess)) {
				// init part
				eaProcessSettings = new EObjectFlatComboSettings(bsmProcess, BsmPackage.eINSTANCE.getBsmProcess_EaProcess());
				basePart.initEaProcess(eaProcessSettings);
				// set the button mode
				basePart.setEaProcessButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			
			
			
			if (isAccessible(BsmViewsRepository.BsmProcess.Properties.subProcess)) {
				basePart.addFilterToSubProcess(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInSubProcessTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToSubProcess(new EObjectFilter(BsmPackage.Literals.BSM_PROCESS));
				// Start of user code for additional businessfilters for subProcess
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmProcess.Properties.mainProcess)) {
				basePart.addFilterToMainProcess(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						List<BsmProcess> out = new ArrayList<>();
						if (null != bsmProcess.getBsmModel() 
								&& null != bsmProcess.getBsmModel().getProcesses()) {
							out.addAll(bsmProcess.getBsmModel().getProcesses());
							out.remove(bsmProcess);
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
						return (element instanceof String && element.equals("")) || (element instanceof BsmProcess); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for mainProcess
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmProcess.Properties.resources)) {
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
				basePart.addFilterToResources(new EObjectFilter(BsmPackage.Literals.BSM_RESOURCE));
				// Start of user code for additional businessfilters for resources
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmProcess.Properties.organizations)) {
				basePart.addFilterToOrganizations(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInOrganizationsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToOrganizations(new EObjectFilter(BsmPackage.Literals.BSM_ORGANIZATION));
				// Start of user code for additional businessfilters for organizations
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmProcess.Properties.eaProcess)) {
				basePart.addFilterToEaProcess(new ViewerFilter() {
					//Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
						List<EaProcess> listSource = new ArrayList<EaProcess>();
						List<EObject> listAvailableResource = new ArrayList<EObject>();
						if(null != bsmProcess) {
							listAvailableResource.addAll(bsmProcess.getBsmModel().getProcesses());
							for (int i = 0; i < listAvailableResource.size();i++){{
								if(null != ((BsmProcess)listAvailableResource.get(i)).getEaProcess())
							listSource.add(((BsmProcess)listAvailableResource.get(i)).getEaProcess());
								}
							}
						}
						Object[] out = new Object[listSource.size()];
						out= listSource.toArray();												
						return out;					
					}
					// End of user code
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof String && element.equals("")) || (element instanceof EaProcess); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for eaProcess
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
		if (editorKey == BsmViewsRepository.BsmProcess.Properties.name) {
			return BsmPackage.eINSTANCE.getBsmProcess_Name();
		}
		if (editorKey == BsmViewsRepository.BsmProcess.Properties.objective) {
			return BsmPackage.eINSTANCE.getBsmProcess_Objective();
		}
		if (editorKey == BsmViewsRepository.BsmProcess.Properties.trigger) {
			return BsmPackage.eINSTANCE.getBsmProcess_Trigger();
		}
		if (editorKey == BsmViewsRepository.BsmProcess.Properties.result) {
			return BsmPackage.eINSTANCE.getBsmProcess_Result();
		}
		if (editorKey == BsmViewsRepository.BsmProcess.Properties.constraint) {
			return BsmPackage.eINSTANCE.getBsmProcess_Constraint();
		}
		if (editorKey == BsmViewsRepository.BsmProcess.Properties.subProcess) {
			return BsmPackage.eINSTANCE.getBsmProcess_SubProcess();
		}
		if (editorKey == BsmViewsRepository.BsmProcess.Properties.mainProcess) {
			return BsmPackage.eINSTANCE.getBsmProcess_MainProcess();
		}
		if (editorKey == BsmViewsRepository.BsmProcess.Properties.resources) {
			return BsmPackage.eINSTANCE.getBsmProcess_Resources();
		}
		if (editorKey == BsmViewsRepository.BsmProcess.Properties.organizations) {
			return BsmPackage.eINSTANCE.getBsmProcess_Organizations();
		}
		if (editorKey == BsmViewsRepository.BsmProcess.Properties.eaProcess) {
			return BsmPackage.eINSTANCE.getBsmProcess_EaProcess();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BsmProcess bsmProcess = (BsmProcess)semanticObject;
		if (BsmViewsRepository.BsmProcess.Properties.name == event.getAffectedEditor()) {
			//Start of user code  for process update EA*
			String name = (java.lang.String) EEFConverterUtil
					.createFromString(EcorePackage.Literals.ESTRING,
							(String) event.getNewValue());
			bsmProcess.setName(name);
			EaProcess attachedProcess = bsmProcess.getEaProcess();
			if(null !=  attachedProcess) {
				attachedProcess.setName(name);
				if (null != attachedProcess.getCanBe())
					attachedProcess.getCanBe().setName(name);
			}
			// End of user code
		}
		if (BsmViewsRepository.BsmProcess.Properties.objective == event.getAffectedEditor()) {
			bsmProcess.setObjective((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmProcess.Properties.trigger == event.getAffectedEditor()) {
			bsmProcess.setTrigger((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmProcess.Properties.result == event.getAffectedEditor()) {
			bsmProcess.setResult((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmProcess.Properties.constraint == event.getAffectedEditor()) {
			bsmProcess.setConstraint((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmProcess.Properties.subProcess == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmProcess) {
					subProcessSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				subProcessSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				subProcessSettings.move(event.getNewIndex(), (BsmProcess) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmProcess.Properties.mainProcess == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				mainProcessSettings.setToReference((BsmProcess)event.getNewValue());
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
				mainProcessSettings.setToReference(eObject);
			}
		}
		if (BsmViewsRepository.BsmProcess.Properties.resources == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmResource) {
					resourcesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				resourcesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				resourcesSettings.move(event.getNewIndex(), (BsmResource) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmProcess.Properties.organizations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmOrganization) {
					organizationsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				organizationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				organizationsSettings.move(event.getNewIndex(), (BsmOrganization) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmProcess.Properties.eaProcess == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				eaProcessSettings.setToReference((EaProcess)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				EaProcess eObject = GeneralElementsFactory.eINSTANCE.createEaProcess();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				eaProcessSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			BsmProcessPropertiesEditionPart basePart = (BsmProcessPropertiesEditionPart)editingPart;
			if (BsmPackage.eINSTANCE.getBsmProcess_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmProcess.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmProcess_Objective().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmProcess.Properties.objective)) {
				if (msg.getNewValue() != null) {
					basePart.setObjective(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setObjective("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmProcess_Trigger().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmProcess.Properties.trigger)) {
				if (msg.getNewValue() != null) {
					basePart.setTrigger(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setTrigger("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmProcess_Result().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmProcess.Properties.result)) {
				if (msg.getNewValue() != null) {
					basePart.setResult(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setResult("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmProcess_Constraint().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmProcess.Properties.constraint)) {
				if (msg.getNewValue() != null) {
					basePart.setConstraint(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setConstraint("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmProcess_SubProcess().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmProcess.Properties.subProcess))
				basePart.updateSubProcess();
			if (BsmPackage.eINSTANCE.getBsmProcess_MainProcess().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmProcess.Properties.mainProcess))
				basePart.setMainProcess((EObject)msg.getNewValue());
			if (BsmPackage.eINSTANCE.getBsmProcess_Resources().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmProcess.Properties.resources))
				basePart.updateResources();
			if (BsmPackage.eINSTANCE.getBsmProcess_Organizations().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmProcess.Properties.organizations))
				basePart.updateOrganizations();
			if (BsmPackage.eINSTANCE.getBsmProcess_EaProcess().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmProcess.Properties.eaProcess))
				basePart.setEaProcess((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == BsmViewsRepository.BsmProcess.Properties.organizations;
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
				if (BsmViewsRepository.BsmProcess.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmProcess_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmProcess_Name().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmProcess.Properties.objective == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmProcess_Objective().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmProcess_Objective().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmProcess.Properties.trigger == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmProcess_Trigger().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmProcess_Trigger().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmProcess.Properties.result == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmProcess_Result().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmProcess_Result().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmProcess.Properties.constraint == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmProcess_Constraint().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmProcess_Constraint().getEAttributeType(), newValue);
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
