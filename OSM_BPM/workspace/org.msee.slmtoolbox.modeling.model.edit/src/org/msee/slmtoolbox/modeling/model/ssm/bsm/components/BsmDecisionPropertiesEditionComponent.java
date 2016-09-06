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
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.context.impl.EReferencePropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.policies.impl.CreateEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionType;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFactory;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BsmDecisionPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for decisionStructure EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings decisionStructureSettings;
	
	/**
	 * Settings for organization EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings organizationSettings;
	
	/**
	 * Settings for ggDecisionCenters ReferencesTable
	 */
	private ReferencesTableSettings ggDecisionCentersSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BsmDecisionPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bsmDecision, String editing_mode) {
		super(editingContext, bsmDecision, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BsmViewsRepository.class;
		partKey = BsmViewsRepository.BsmDecision.class;
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
			final BsmDecision bsmDecision = (BsmDecision)elt;
			final BsmDecisionPropertiesEditionPart basePart = (BsmDecisionPropertiesEditionPart)editingPart;
			// init values
			if (bsmDecision.getName() != null && isAccessible(BsmViewsRepository.BsmDecision.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmDecision.getName()));
			
			if (isAccessible(BsmViewsRepository.BsmDecision.Properties.type)) {
				// Start of user code  for type decision
				basePart.initType(
						new BsmDecisionType [] {
							BsmDecisionType.EVENT_BASED,
							BsmDecisionType.PERIODIC,
						}
						, bsmDecision.getType());
				// End of user code
			}
			if (bsmDecision.getHorizon() != null && isAccessible(BsmViewsRepository.BsmDecision.Properties.horizon))
				basePart.setHorizon(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmDecision.getHorizon()));
			
			if (bsmDecision.getPeriod() != null && isAccessible(BsmViewsRepository.BsmDecision.Properties.period))
				basePart.setPeriod(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmDecision.getPeriod()));
			
			if (bsmDecision.getConstraint() != null && isAccessible(BsmViewsRepository.BsmDecision.Properties.constraint))
				basePart.setConstraint(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmDecision.getConstraint()));
			
			if (bsmDecision.getObjective() != null && isAccessible(BsmViewsRepository.BsmDecision.Properties.objective))
				basePart.setObjective(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmDecision.getObjective()));
			
			if (bsmDecision.getVariable() != null && isAccessible(BsmViewsRepository.BsmDecision.Properties.variable))
				basePart.setVariable(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmDecision.getVariable()));
			
			if (bsmDecision.getEvent() != null && isAccessible(BsmViewsRepository.BsmDecision.Properties.event))
				basePart.setEvent(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmDecision.getEvent()));
			
			if (isAccessible(BsmViewsRepository.BsmDecision.Properties.decisionStructure)) {
				// init part
				decisionStructureSettings = new EObjectFlatComboSettings(bsmDecision, BsmPackage.eINSTANCE.getBsmDecision_DecisionStructure());
				basePart.initDecisionStructure(decisionStructureSettings);
				// set the button mode
				basePart.setDecisionStructureButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(BsmViewsRepository.BsmDecision.Properties.organization)) {
				// init part
				organizationSettings = new EObjectFlatComboSettings(bsmDecision, BsmPackage.eINSTANCE.getBsmDecision_Organization());
				basePart.initOrganization(organizationSettings);
				// set the button mode
				basePart.setOrganizationButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters)) {
				ggDecisionCentersSettings = new ReferencesTableSettings(bsmDecision, BsmPackage.eINSTANCE.getBsmDecision_GgDecisionCenters());
				basePart.initGgDecisionCenters(ggDecisionCentersSettings);
			}
			// init filters
			
			if (isAccessible(BsmViewsRepository.BsmDecision.Properties.decisionStructure)) {
				basePart.addFilterToDecisionStructure(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						Object[] out = new Object[bsmDecision.getBsmModel().getDecisionStructures().size()];
						out= bsmDecision.getBsmModel().getDecisionStructures().toArray();						
					
						return out;
						
					}
					// End of user code
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof BsmDecisionStructure);
					}
					
				});
				// Start of user code for additional businessfilters for decisionStructure
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmDecision.Properties.organization)) {
				basePart.addFilterToOrganization(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						Object[] out = new Object[bsmDecision.getBsmModel().getOrganizations().size()];
						out= bsmDecision.getBsmModel().getOrganizations().toArray();						
					
						return out;
						
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
			if (isAccessible(BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters)) {
				basePart.addFilterToGgDecisionCenters(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInGgDecisionCentersTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToGgDecisionCenters(new EObjectFilter(CoreElementsPackage.Literals.GG_DECISION_CENTER));
				// Start of user code for additional businessfilters for ggDecisionCenters
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
		if (editorKey == BsmViewsRepository.BsmDecision.Properties.name) {
			return BsmPackage.eINSTANCE.getBsmDecision_Name();
		}
		if (editorKey == BsmViewsRepository.BsmDecision.Properties.type) {
			return BsmPackage.eINSTANCE.getBsmDecision_Type();
		}
		if (editorKey == BsmViewsRepository.BsmDecision.Properties.horizon) {
			return BsmPackage.eINSTANCE.getBsmDecision_Horizon();
		}
		if (editorKey == BsmViewsRepository.BsmDecision.Properties.period) {
			return BsmPackage.eINSTANCE.getBsmDecision_Period();
		}
		if (editorKey == BsmViewsRepository.BsmDecision.Properties.constraint) {
			return BsmPackage.eINSTANCE.getBsmDecision_Constraint();
		}
		if (editorKey == BsmViewsRepository.BsmDecision.Properties.objective) {
			return BsmPackage.eINSTANCE.getBsmDecision_Objective();
		}
		if (editorKey == BsmViewsRepository.BsmDecision.Properties.variable) {
			return BsmPackage.eINSTANCE.getBsmDecision_Variable();
		}
		if (editorKey == BsmViewsRepository.BsmDecision.Properties.event) {
			return BsmPackage.eINSTANCE.getBsmDecision_Event();
		}
		if (editorKey == BsmViewsRepository.BsmDecision.Properties.decisionStructure) {
			return BsmPackage.eINSTANCE.getBsmDecision_DecisionStructure();
		}
		if (editorKey == BsmViewsRepository.BsmDecision.Properties.organization) {
			return BsmPackage.eINSTANCE.getBsmDecision_Organization();
		}
		if (editorKey == BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters) {
			return BsmPackage.eINSTANCE.getBsmDecision_GgDecisionCenters();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BsmDecision bsmDecision = (BsmDecision)semanticObject;
		if (BsmViewsRepository.BsmDecision.Properties.name == event.getAffectedEditor()) {
			bsmDecision.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmDecision.Properties.type == event.getAffectedEditor()) {
			bsmDecision.setType((BsmDecisionType)event.getNewValue());
		}
		if (BsmViewsRepository.BsmDecision.Properties.horizon == event.getAffectedEditor()) {
			bsmDecision.setHorizon((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmDecision.Properties.period == event.getAffectedEditor()) {
			bsmDecision.setPeriod((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmDecision.Properties.constraint == event.getAffectedEditor()) {
			bsmDecision.setConstraint((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmDecision.Properties.objective == event.getAffectedEditor()) {
			bsmDecision.setObjective((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmDecision.Properties.variable == event.getAffectedEditor()) {
			bsmDecision.setVariable((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmDecision.Properties.event == event.getAffectedEditor()) {
			bsmDecision.setEvent((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmDecision.Properties.decisionStructure == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				decisionStructureSettings.setToReference((BsmDecisionStructure)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				BsmDecisionStructure eObject = BsmFactory.eINSTANCE.createBsmDecisionStructure();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				decisionStructureSettings.setToReference(eObject);
			}
		}
		if (BsmViewsRepository.BsmDecision.Properties.organization == event.getAffectedEditor()) {
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
		if (BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof GgDecisionCenter) {
					ggDecisionCentersSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				ggDecisionCentersSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ggDecisionCentersSettings.move(event.getNewIndex(), (GgDecisionCenter) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			BsmDecisionPropertiesEditionPart basePart = (BsmDecisionPropertiesEditionPart)editingPart;
			if (BsmPackage.eINSTANCE.getBsmDecision_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmDecision.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmDecision_Type().equals(msg.getFeature()) && isAccessible(BsmViewsRepository.BsmDecision.Properties.type))
				basePart.setType((BsmDecisionType)msg.getNewValue());
			
			if (BsmPackage.eINSTANCE.getBsmDecision_Horizon().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmDecision.Properties.horizon)) {
				if (msg.getNewValue() != null) {
					basePart.setHorizon(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setHorizon("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmDecision_Period().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmDecision.Properties.period)) {
				if (msg.getNewValue() != null) {
					basePart.setPeriod(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setPeriod("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmDecision_Constraint().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmDecision.Properties.constraint)) {
				if (msg.getNewValue() != null) {
					basePart.setConstraint(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setConstraint("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmDecision_Objective().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmDecision.Properties.objective)) {
				if (msg.getNewValue() != null) {
					basePart.setObjective(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setObjective("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmDecision_Variable().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmDecision.Properties.variable)) {
				if (msg.getNewValue() != null) {
					basePart.setVariable(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setVariable("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmDecision_Event().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmDecision.Properties.event)) {
				if (msg.getNewValue() != null) {
					basePart.setEvent(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setEvent("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmDecision_DecisionStructure().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmDecision.Properties.decisionStructure))
				basePart.setDecisionStructure((EObject)msg.getNewValue());
			if (BsmPackage.eINSTANCE.getBsmDecision_Organization().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmDecision.Properties.organization))
				basePart.setOrganization((EObject)msg.getNewValue());
			if (BsmPackage.eINSTANCE.getBsmDecision_GgDecisionCenters().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters))
				basePart.updateGgDecisionCenters();
			
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == BsmViewsRepository.BsmDecision.Properties.name || key == BsmViewsRepository.BsmDecision.Properties.type || key == BsmViewsRepository.BsmDecision.Properties.horizon || key == BsmViewsRepository.BsmDecision.Properties.period || key == BsmViewsRepository.BsmDecision.Properties.constraint || key == BsmViewsRepository.BsmDecision.Properties.objective || key == BsmViewsRepository.BsmDecision.Properties.variable || key == BsmViewsRepository.BsmDecision.Properties.event || key == BsmViewsRepository.BsmDecision.Properties.decisionStructure || key == BsmViewsRepository.BsmDecision.Properties.organization || key == BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters || key == BsmViewsRepository.BsmDecision.Properties.class;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == BsmViewsRepository.BsmDecision.Properties.decisionStructure || key == BsmViewsRepository.BsmDecision.Properties.organization;
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
				if (BsmViewsRepository.BsmDecision.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmDecision_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmDecision_Name().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmDecision.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmDecision_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmDecision_Type().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmDecision.Properties.horizon == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmDecision_Horizon().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmDecision_Horizon().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmDecision.Properties.period == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmDecision_Period().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmDecision_Period().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmDecision.Properties.constraint == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmDecision_Constraint().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmDecision_Constraint().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmDecision.Properties.objective == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmDecision_Objective().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmDecision_Objective().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmDecision.Properties.variable == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmDecision_Variable().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmDecision_Variable().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmDecision.Properties.event == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmDecision_Event().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmDecision_Event().getEAttributeType(), newValue);
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
