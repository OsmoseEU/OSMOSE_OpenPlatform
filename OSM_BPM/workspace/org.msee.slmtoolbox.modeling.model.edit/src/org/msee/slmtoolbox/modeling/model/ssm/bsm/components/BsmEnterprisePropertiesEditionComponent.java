/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.components;

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
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmMseService;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BsmEnterprisePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for processes ReferencesTable
	 */
	private ReferencesTableSettings processesSettings;
	
	/**
	 * Settings for decisions ReferencesTable
	 */
	private ReferencesTableSettings decisionsSettings;
	
	/**
	 * Settings for decisionStructures ReferencesTable
	 */
	private ReferencesTableSettings decisionStructuresSettings;
	
	/**
	 * Settings for ggOrganizations ReferencesTable
	 */
	private ReferencesTableSettings ggOrganizationsSettings;
	
	/**
	 * Settings for eaOrganizations ReferencesTable
	 */
	private ReferencesTableSettings eaOrganizationsSettings;
	
	/**
	 * Settings for mseService ReferencesTable
	 */
	private ReferencesTableSettings mseServiceSettings;
	
	/**
	 * Settings for veParticipations ReferencesTable
	 */
	private ReferencesTableSettings veParticipationsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BsmEnterprisePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bsmEnterprise, String editing_mode) {
		super(editingContext, bsmEnterprise, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BsmViewsRepository.class;
		partKey = BsmViewsRepository.BsmEnterprise.class;
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
			final BsmEnterprise bsmEnterprise = (BsmEnterprise)elt;
			final BsmEnterprisePropertiesEditionPart basePart = (BsmEnterprisePropertiesEditionPart)editingPart;
			// init values
			if (bsmEnterprise.getName() != null && isAccessible(BsmViewsRepository.BsmEnterprise.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmEnterprise.getName()));
			
			if (bsmEnterprise.getDescription() != null && isAccessible(BsmViewsRepository.BsmEnterprise.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmEnterprise.getDescription()));
			
			if (isAccessible(BsmViewsRepository.BsmEnterprise.Properties.processes)) {
				processesSettings = new ReferencesTableSettings(bsmEnterprise, BsmPackage.eINSTANCE.getBsmOrganization_Processes());
				basePart.initProcesses(processesSettings);
			}
			if (isAccessible(BsmViewsRepository.BsmEnterprise.Properties.decisions)) {
				decisionsSettings = new ReferencesTableSettings(bsmEnterprise, BsmPackage.eINSTANCE.getBsmOrganization_Decisions());
				basePart.initDecisions(decisionsSettings);
			}
			if (isAccessible(BsmViewsRepository.BsmEnterprise.Properties.decisionStructures)) {
				decisionStructuresSettings = new ReferencesTableSettings(bsmEnterprise, BsmPackage.eINSTANCE.getBsmOrganization_DecisionStructures());
				basePart.initDecisionStructures(decisionStructuresSettings);
			}
			if (isAccessible(BsmViewsRepository.BsmEnterprise.Properties.ggOrganizations)) {
				ggOrganizationsSettings = new ReferencesTableSettings(bsmEnterprise, BsmPackage.eINSTANCE.getBsmOrganization_GgOrganizations());
				basePart.initGgOrganizations(ggOrganizationsSettings);
			}
			if (isAccessible(BsmViewsRepository.BsmEnterprise.Properties.eaOrganizations)) {
				eaOrganizationsSettings = new ReferencesTableSettings(bsmEnterprise, BsmPackage.eINSTANCE.getBsmOrganization_EaOrganizations());
				basePart.initEaOrganizations(eaOrganizationsSettings);
			}
			if (isAccessible(BsmViewsRepository.BsmEnterprise.Properties.mseService)) {
				mseServiceSettings = new ReferencesTableSettings(bsmEnterprise, BsmPackage.eINSTANCE.getBsmOrganization_MseService());
				basePart.initMseService(mseServiceSettings);
			}
			if (bsmEnterprise.getType() != null && isAccessible(BsmViewsRepository.BsmEnterprise.Properties.type))
				basePart.setType(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmEnterprise.getType()));
			
			if (isAccessible(BsmViewsRepository.BsmEnterprise.Properties.veParticipations)) {
				veParticipationsSettings = new ReferencesTableSettings(bsmEnterprise, BsmPackage.eINSTANCE.getBsmEnterprise_VeParticipations());
				basePart.initVeParticipations(veParticipationsSettings);
			}
			// init filters
			
			
			if (isAccessible(BsmViewsRepository.BsmEnterprise.Properties.processes)) {
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
			if (isAccessible(BsmViewsRepository.BsmEnterprise.Properties.decisions)) {
				basePart.addFilterToDecisions(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInDecisionsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToDecisions(new EObjectFilter(BsmPackage.Literals.BSM_DECISION));
				// Start of user code for additional businessfilters for decisions
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmEnterprise.Properties.decisionStructures)) {
				basePart.addFilterToDecisionStructures(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInDecisionStructuresTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToDecisionStructures(new EObjectFilter(BsmPackage.Literals.BSM_DECISION_STRUCTURE));
				// Start of user code for additional businessfilters for decisionStructures
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmEnterprise.Properties.ggOrganizations)) {
				basePart.addFilterToGgOrganizations(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInGgOrganizationsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToGgOrganizations(new EObjectFilter(GeneralElementsPackage.Literals.GG_ORGANIZATION));
				// Start of user code for additional businessfilters for ggOrganizations
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmEnterprise.Properties.eaOrganizations)) {
				basePart.addFilterToEaOrganizations(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInEaOrganizationsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToEaOrganizations(new EObjectFilter(CoreElementsPackage.Literals.EA_ORGANIZATION));
				// Start of user code for additional businessfilters for eaOrganizations
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmEnterprise.Properties.mseService)) {
				basePart.addFilterToMseService(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInMseServiceTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToMseService(new EObjectFilter(BsmPackage.Literals.BSM_MSE_SERVICE));
				// Start of user code for additional businessfilters for mseService
				// End of user code
			}
			
			if (isAccessible(BsmViewsRepository.BsmEnterprise.Properties.veParticipations)) {
				basePart.addFilterToVeParticipations(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInVeParticipationsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToVeParticipations(new EObjectFilter(BsmPackage.Literals.BSM_VE_PARTICIPATION));
				// Start of user code for additional businessfilters for veParticipations
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
		if (editorKey == BsmViewsRepository.BsmEnterprise.Properties.name) {
			return BsmPackage.eINSTANCE.getBsmOrganization_Name();
		}
		if (editorKey == BsmViewsRepository.BsmEnterprise.Properties.description) {
			return BsmPackage.eINSTANCE.getBsmOrganization_Description();
		}
		if (editorKey == BsmViewsRepository.BsmEnterprise.Properties.processes) {
			return BsmPackage.eINSTANCE.getBsmOrganization_Processes();
		}
		if (editorKey == BsmViewsRepository.BsmEnterprise.Properties.decisions) {
			return BsmPackage.eINSTANCE.getBsmOrganization_Decisions();
		}
		if (editorKey == BsmViewsRepository.BsmEnterprise.Properties.decisionStructures) {
			return BsmPackage.eINSTANCE.getBsmOrganization_DecisionStructures();
		}
		if (editorKey == BsmViewsRepository.BsmEnterprise.Properties.ggOrganizations) {
			return BsmPackage.eINSTANCE.getBsmOrganization_GgOrganizations();
		}
		if (editorKey == BsmViewsRepository.BsmEnterprise.Properties.eaOrganizations) {
			return BsmPackage.eINSTANCE.getBsmOrganization_EaOrganizations();
		}
		if (editorKey == BsmViewsRepository.BsmEnterprise.Properties.mseService) {
			return BsmPackage.eINSTANCE.getBsmOrganization_MseService();
		}
		if (editorKey == BsmViewsRepository.BsmEnterprise.Properties.type) {
			return BsmPackage.eINSTANCE.getBsmEnterprise_Type();
		}
		if (editorKey == BsmViewsRepository.BsmEnterprise.Properties.veParticipations) {
			return BsmPackage.eINSTANCE.getBsmEnterprise_VeParticipations();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BsmEnterprise bsmEnterprise = (BsmEnterprise)semanticObject;
		if (BsmViewsRepository.BsmEnterprise.Properties.name == event.getAffectedEditor()) {
			bsmEnterprise.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmEnterprise.Properties.description == event.getAffectedEditor()) {
			bsmEnterprise.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmEnterprise.Properties.processes == event.getAffectedEditor()) {
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
		if (BsmViewsRepository.BsmEnterprise.Properties.decisions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmDecision) {
					decisionsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				decisionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				decisionsSettings.move(event.getNewIndex(), (BsmDecision) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmEnterprise.Properties.decisionStructures == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmDecisionStructure) {
					decisionStructuresSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				decisionStructuresSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				decisionStructuresSettings.move(event.getNewIndex(), (BsmDecisionStructure) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmEnterprise.Properties.ggOrganizations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof GgOrganization) {
					ggOrganizationsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				ggOrganizationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ggOrganizationsSettings.move(event.getNewIndex(), (GgOrganization) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmEnterprise.Properties.eaOrganizations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof EaOrganization) {
					eaOrganizationsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				eaOrganizationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				eaOrganizationsSettings.move(event.getNewIndex(), (EaOrganization) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmEnterprise.Properties.mseService == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmMseService) {
					mseServiceSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				mseServiceSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				mseServiceSettings.move(event.getNewIndex(), (BsmMseService) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmEnterprise.Properties.type == event.getAffectedEditor()) {
			bsmEnterprise.setType((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmEnterprise.Properties.veParticipations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmVEParticipation) {
					veParticipationsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				veParticipationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				veParticipationsSettings.move(event.getNewIndex(), (BsmVEParticipation) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			BsmEnterprisePropertiesEditionPart basePart = (BsmEnterprisePropertiesEditionPart)editingPart;
			if (BsmPackage.eINSTANCE.getBsmOrganization_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmEnterprise.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmOrganization_Description().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmEnterprise.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmOrganization_Processes().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmEnterprise.Properties.processes))
				basePart.updateProcesses();
			if (BsmPackage.eINSTANCE.getBsmOrganization_Decisions().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmEnterprise.Properties.decisions))
				basePart.updateDecisions();
			if (BsmPackage.eINSTANCE.getBsmOrganization_DecisionStructures().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmEnterprise.Properties.decisionStructures))
				basePart.updateDecisionStructures();
			if (BsmPackage.eINSTANCE.getBsmOrganization_GgOrganizations().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmEnterprise.Properties.ggOrganizations))
				basePart.updateGgOrganizations();
			if (BsmPackage.eINSTANCE.getBsmOrganization_EaOrganizations().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmEnterprise.Properties.eaOrganizations))
				basePart.updateEaOrganizations();
			if (BsmPackage.eINSTANCE.getBsmOrganization_MseService().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmEnterprise.Properties.mseService))
				basePart.updateMseService();
			if (BsmPackage.eINSTANCE.getBsmEnterprise_Type().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmEnterprise.Properties.type)) {
				if (msg.getNewValue() != null) {
					basePart.setType(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setType("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmEnterprise_VeParticipations().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmEnterprise.Properties.veParticipations))
				basePart.updateVeParticipations();
			
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
				if (BsmViewsRepository.BsmEnterprise.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmOrganization_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmOrganization_Name().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmEnterprise.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmOrganization_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmOrganization_Description().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmEnterprise.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmEnterprise_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmEnterprise_Type().getEAttributeType(), newValue);
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
