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
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartFactory;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit;


// End of user code

/**
 * 
 * 
 */
public class TimProcessPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for subprocesses ReferencesTable
	 */
	private ReferencesTableSettings subprocessesSettings;
	
	/**
	 * Settings for mainProcess EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings mainProcessSettings;
	
	/**
	 * Settings for services ReferencesTable
	 */
	private ReferencesTableSettings servicesSettings;
	
	/**
	 * Settings for resources ReferencesTable
	 */
	private ReferencesTableSettings resourcesSettings;
	
	/**
	 * Settings for responsibleOrganizationUnit EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings responsibleOrganizationUnitSettings;
	
	/**
	 * Settings for organizations ReferencesTable
	 */
	private ReferencesTableSettings organizationsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TimProcessPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject timProcess, String editing_mode) {
		super(editingContext, timProcess, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CommonConceptsViewsRepository.class;
		partKey = CommonConceptsViewsRepository.TimProcess.class;
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
			final TimProcess timProcess = (TimProcess)elt;
			final TimProcessPropertiesEditionPart basePart = (TimProcessPropertiesEditionPart)editingPart;
			// init values
			if (timProcess.getName() != null && isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timProcess.getName()));
			
			if (timProcess.getObjective() != null && isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.objective))
				basePart.setObjective(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timProcess.getObjective()));
			
			if (timProcess.getTrigger() != null && isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.trigger))
				basePart.setTrigger(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timProcess.getTrigger()));
			
			if (timProcess.getResult() != null && isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.result))
				basePart.setResult(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timProcess.getResult()));
			
			if (timProcess.getConstraint() != null && isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.constraint))
				basePart.setConstraint(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timProcess.getConstraint()));
			
			if (timProcess.getWorkFlow() != null && isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.workFlow))
				basePart.setWorkFlow(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timProcess.getWorkFlow()));
			
			if (isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.subprocesses)) {
				subprocessesSettings = new ReferencesTableSettings(timProcess, CommonConceptsPackage.eINSTANCE.getTimProcess_Subprocesses());
				basePart.initSubprocesses(subprocessesSettings);
			}
			if (isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.mainProcess)) {
				// init part
				mainProcessSettings = new EObjectFlatComboSettings(timProcess, CommonConceptsPackage.eINSTANCE.getTimProcess_MainProcess());
				basePart.initMainProcess(mainProcessSettings);
				// set the button mode
				basePart.setMainProcessButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.services)) {
				servicesSettings = new ReferencesTableSettings(timProcess, CommonConceptsPackage.eINSTANCE.getTimProcess_Services());
				basePart.initServices(servicesSettings);
			}
			if (isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.resources)) {
				resourcesSettings = new ReferencesTableSettings(timProcess, CommonConceptsPackage.eINSTANCE.getTimProcess_Resources());
				basePart.initResources(resourcesSettings);
			}
			if (isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.responsibleOrganizationUnit)) {
				// init part
				responsibleOrganizationUnitSettings = new EObjectFlatComboSettings(timProcess, CommonConceptsPackage.eINSTANCE.getTimProcess_ResponsibleOrganizationUnit());
				basePart.initResponsibleOrganizationUnit(responsibleOrganizationUnitSettings);
				// set the button mode
				basePart.setResponsibleOrganizationUnitButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.organizations)) {
				organizationsSettings = new ReferencesTableSettings(timProcess, CommonConceptsPackage.eINSTANCE.getTimProcess_Organizations());
				basePart.initOrganizations(organizationsSettings);
			}
			// init filters
			
			
			
			
			
			
			if (isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.subprocesses)) {
				basePart.addFilterToSubprocesses(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInSubprocessesTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToSubprocesses(new EObjectFilter(CommonConceptsPackage.Literals.TIM_PROCESS));
				// Start of user code for additional businessfilters for subprocesses
				// End of user code
			}
			if (isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.mainProcess)) {
				basePart.addFilterToMainProcess(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						List<TimProcess> out = new ArrayList<>();
						if (null != timProcess.getModel() 
								&& null != timProcess.getModel().getProcesses()) {
							out.addAll(timProcess.getModel().getProcesses());
							out.remove(timProcess);
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
						return (element instanceof String && element.equals("")) || (element instanceof TimProcess); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for mainProcess
				// End of user code
			}
			if (isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.services)) {
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
			if (isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.resources)) {
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
			if (isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.responsibleOrganizationUnit)) {
				basePart.addFilterToResponsibleOrganizationUnit(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						List<TimOrganizationUnit> out = new ArrayList<>();
						if (null != timProcess.getModel() 
								&& null != timProcess.getModel().getOrganizations()) {
							for (TimOrganization organization : timProcess.getModel().getOrganizations()) {
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
						return (element instanceof String && element.equals("")) || (element instanceof TimOrganizationUnit); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for responsibleOrganizationUnit
				// End of user code
			}
			if (isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.organizations)) {
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
				basePart.addFilterToOrganizations(new EObjectFilter(HumanRelatedPartPackage.Literals.TIM_ORGANIZATION));
				// Start of user code for additional businessfilters for organizations
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
		if (editorKey == CommonConceptsViewsRepository.TimProcess.Properties.name) {
			return CommonConceptsPackage.eINSTANCE.getTimProcess_Name();
		}
		if (editorKey == CommonConceptsViewsRepository.TimProcess.Properties.objective) {
			return CommonConceptsPackage.eINSTANCE.getTimProcess_Objective();
		}
		if (editorKey == CommonConceptsViewsRepository.TimProcess.Properties.trigger) {
			return CommonConceptsPackage.eINSTANCE.getTimProcess_Trigger();
		}
		if (editorKey == CommonConceptsViewsRepository.TimProcess.Properties.result) {
			return CommonConceptsPackage.eINSTANCE.getTimProcess_Result();
		}
		if (editorKey == CommonConceptsViewsRepository.TimProcess.Properties.constraint) {
			return CommonConceptsPackage.eINSTANCE.getTimProcess_Constraint();
		}
		if (editorKey == CommonConceptsViewsRepository.TimProcess.Properties.workFlow) {
			return CommonConceptsPackage.eINSTANCE.getTimProcess_WorkFlow();
		}
		if (editorKey == CommonConceptsViewsRepository.TimProcess.Properties.subprocesses) {
			return CommonConceptsPackage.eINSTANCE.getTimProcess_Subprocesses();
		}
		if (editorKey == CommonConceptsViewsRepository.TimProcess.Properties.mainProcess) {
			return CommonConceptsPackage.eINSTANCE.getTimProcess_MainProcess();
		}
		if (editorKey == CommonConceptsViewsRepository.TimProcess.Properties.services) {
			return CommonConceptsPackage.eINSTANCE.getTimProcess_Services();
		}
		if (editorKey == CommonConceptsViewsRepository.TimProcess.Properties.resources) {
			return CommonConceptsPackage.eINSTANCE.getTimProcess_Resources();
		}
		if (editorKey == CommonConceptsViewsRepository.TimProcess.Properties.responsibleOrganizationUnit) {
			return CommonConceptsPackage.eINSTANCE.getTimProcess_ResponsibleOrganizationUnit();
		}
		if (editorKey == CommonConceptsViewsRepository.TimProcess.Properties.organizations) {
			return CommonConceptsPackage.eINSTANCE.getTimProcess_Organizations();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TimProcess timProcess = (TimProcess)semanticObject;
		if (CommonConceptsViewsRepository.TimProcess.Properties.name == event.getAffectedEditor()) {
			timProcess.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CommonConceptsViewsRepository.TimProcess.Properties.objective == event.getAffectedEditor()) {
			timProcess.setObjective((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CommonConceptsViewsRepository.TimProcess.Properties.trigger == event.getAffectedEditor()) {
			timProcess.setTrigger((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CommonConceptsViewsRepository.TimProcess.Properties.result == event.getAffectedEditor()) {
			timProcess.setResult((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CommonConceptsViewsRepository.TimProcess.Properties.constraint == event.getAffectedEditor()) {
			timProcess.setConstraint((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CommonConceptsViewsRepository.TimProcess.Properties.workFlow == event.getAffectedEditor()) {
			timProcess.setWorkFlow((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CommonConceptsViewsRepository.TimProcess.Properties.subprocesses == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof TimProcess) {
					subprocessesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				subprocessesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				subprocessesSettings.move(event.getNewIndex(), (TimProcess) event.getNewValue());
			}
		}
		if (CommonConceptsViewsRepository.TimProcess.Properties.mainProcess == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				mainProcessSettings.setToReference((TimProcess)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				TimProcess eObject = CommonConceptsFactory.eINSTANCE.createTimProcess();
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
		if (CommonConceptsViewsRepository.TimProcess.Properties.services == event.getAffectedEditor()) {
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
		if (CommonConceptsViewsRepository.TimProcess.Properties.resources == event.getAffectedEditor()) {
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
		if (CommonConceptsViewsRepository.TimProcess.Properties.responsibleOrganizationUnit == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				responsibleOrganizationUnitSettings.setToReference((TimOrganizationUnit)event.getNewValue());
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
				responsibleOrganizationUnitSettings.setToReference(eObject);
			}
		}
		if (CommonConceptsViewsRepository.TimProcess.Properties.organizations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof TimOrganization) {
					organizationsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				organizationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				organizationsSettings.move(event.getNewIndex(), (TimOrganization) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			TimProcessPropertiesEditionPart basePart = (TimProcessPropertiesEditionPart)editingPart;
			if (CommonConceptsPackage.eINSTANCE.getTimProcess_Name().equals(msg.getFeature()) && basePart != null && isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimProcess_Objective().equals(msg.getFeature()) && basePart != null && isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.objective)) {
				if (msg.getNewValue() != null) {
					basePart.setObjective(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setObjective("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimProcess_Trigger().equals(msg.getFeature()) && basePart != null && isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.trigger)) {
				if (msg.getNewValue() != null) {
					basePart.setTrigger(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setTrigger("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimProcess_Result().equals(msg.getFeature()) && basePart != null && isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.result)) {
				if (msg.getNewValue() != null) {
					basePart.setResult(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setResult("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimProcess_Constraint().equals(msg.getFeature()) && basePart != null && isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.constraint)) {
				if (msg.getNewValue() != null) {
					basePart.setConstraint(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setConstraint("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimProcess_WorkFlow().equals(msg.getFeature()) && basePart != null && isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.workFlow)) {
				if (msg.getNewValue() != null) {
					basePart.setWorkFlow(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setWorkFlow("");
				}
			}
			if (CommonConceptsPackage.eINSTANCE.getTimProcess_Subprocesses().equals(msg.getFeature())  && isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.subprocesses))
				basePart.updateSubprocesses();
			if (CommonConceptsPackage.eINSTANCE.getTimProcess_MainProcess().equals(msg.getFeature()) && basePart != null && isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.mainProcess))
				basePart.setMainProcess((EObject)msg.getNewValue());
			if (CommonConceptsPackage.eINSTANCE.getTimProcess_Services().equals(msg.getFeature())  && isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.services))
				basePart.updateServices();
			if (CommonConceptsPackage.eINSTANCE.getTimProcess_Resources().equals(msg.getFeature())  && isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.resources))
				basePart.updateResources();
			if (CommonConceptsPackage.eINSTANCE.getTimProcess_ResponsibleOrganizationUnit().equals(msg.getFeature()) && basePart != null && isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.responsibleOrganizationUnit))
				basePart.setResponsibleOrganizationUnit((EObject)msg.getNewValue());
			if (CommonConceptsPackage.eINSTANCE.getTimProcess_Organizations().equals(msg.getFeature())  && isAccessible(CommonConceptsViewsRepository.TimProcess.Properties.organizations))
				basePart.updateOrganizations();
			
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
				if (CommonConceptsViewsRepository.TimProcess.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimProcess_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimProcess_Name().getEAttributeType(), newValue);
				}
				if (CommonConceptsViewsRepository.TimProcess.Properties.objective == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimProcess_Objective().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimProcess_Objective().getEAttributeType(), newValue);
				}
				if (CommonConceptsViewsRepository.TimProcess.Properties.trigger == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimProcess_Trigger().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimProcess_Trigger().getEAttributeType(), newValue);
				}
				if (CommonConceptsViewsRepository.TimProcess.Properties.result == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimProcess_Result().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimProcess_Result().getEAttributeType(), newValue);
				}
				if (CommonConceptsViewsRepository.TimProcess.Properties.constraint == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimProcess_Constraint().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimProcess_Constraint().getEAttributeType(), newValue);
				}
				if (CommonConceptsViewsRepository.TimProcess.Properties.workFlow == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CommonConceptsPackage.eINSTANCE.getTimProcess_WorkFlow().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CommonConceptsPackage.eINSTANCE.getTimProcess_WorkFlow().getEAttributeType(), newValue);
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
