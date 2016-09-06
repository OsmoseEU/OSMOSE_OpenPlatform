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

import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionObjective;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFactory;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BsmPerformanceIndicatorPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for decision EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings decisionSettings;
	
	/**
	 * Settings for variables ReferencesTable
	 */
	private ReferencesTableSettings variablesSettings;
	
	/**
	 * Settings for objectives ReferencesTable
	 */
	private ReferencesTableSettings objectivesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BsmPerformanceIndicatorPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bsmPerformanceIndicator, String editing_mode) {
		super(editingContext, bsmPerformanceIndicator, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BsmViewsRepository.class;
		partKey = BsmViewsRepository.BsmPerformanceIndicator.class;
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
			final BsmPerformanceIndicator bsmPerformanceIndicator = (BsmPerformanceIndicator)elt;
			final BsmPerformanceIndicatorPropertiesEditionPart basePart = (BsmPerformanceIndicatorPropertiesEditionPart)editingPart;
			// init values
			if (bsmPerformanceIndicator.getName() != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmPerformanceIndicator.getName()));
			
			if (bsmPerformanceIndicator.getDescription() != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmPerformanceIndicator.getDescription()));
			
			if (bsmPerformanceIndicator.getUnit() != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.unit))
				basePart.setUnit(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmPerformanceIndicator.getUnit()));
			
			if (bsmPerformanceIndicator.getFormula() != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.formula))
				basePart.setFormula(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmPerformanceIndicator.getFormula()));
			
			if (bsmPerformanceIndicator.getRequiredInfo() != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredInfo))
				basePart.setRequiredInfo(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmPerformanceIndicator.getRequiredInfo()));
			
			if (bsmPerformanceIndicator.getRequiredProcessing() != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredProcessing))
				basePart.setRequiredProcessing(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmPerformanceIndicator.getRequiredProcessing()));
			
			if (isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.decision)) {
				// init part
				decisionSettings = new EObjectFlatComboSettings(bsmPerformanceIndicator, BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Decision());
				basePart.initDecision(decisionSettings);
				// set the button mode
				basePart.setDecisionButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.variables)) {
				variablesSettings = new ReferencesTableSettings(bsmPerformanceIndicator, BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Variables());
				basePart.initVariables(variablesSettings);
			}
			if (isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.objectives)) {
				objectivesSettings = new ReferencesTableSettings(bsmPerformanceIndicator, BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Objectives());
				basePart.initObjectives(objectivesSettings);
			}
			if (bsmPerformanceIndicator.getCategory1() != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.category1))
				basePart.setCategory1(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmPerformanceIndicator.getCategory1()));
			
			if (bsmPerformanceIndicator.getCategory2() != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.category2))
				basePart.setCategory2(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmPerformanceIndicator.getCategory2()));
			
			if (bsmPerformanceIndicator.getCategory3() != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.category3))
				basePart.setCategory3(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmPerformanceIndicator.getCategory3()));
			
			if (bsmPerformanceIndicator.getDimension() != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.dimension))
				basePart.setDimension(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmPerformanceIndicator.getDimension()));
			
			// init filters
			
			
			
			
			
			
			if (isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.decision)) {
				basePart.addFilterToDecision(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						Object[] out = new Object[bsmPerformanceIndicator.getDecision().getBsmModel().getDecisions().size()];
						out= bsmPerformanceIndicator.getDecision().getBsmModel().getDecisions().toArray();						
					
						return out;
						
					}
					// End of user code
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof BsmDecision);
					}
					
				});
				// Start of user code for additional businessfilters for decision
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.variables)) {
				basePart.addFilterToVariables(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInVariablesTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToVariables(new EObjectFilter(BsmPackage.Literals.BSM_DECISION_VARIABLE));
				// Start of user code for additional businessfilters for variables
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.objectives)) {
				basePart.addFilterToObjectives(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInObjectivesTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToObjectives(new EObjectFilter(BsmPackage.Literals.BSM_DECISION_OBJECTIVE));
				// Start of user code for additional businessfilters for objectives
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
		if (editorKey == BsmViewsRepository.BsmPerformanceIndicator.Properties.name) {
			return BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Name();
		}
		if (editorKey == BsmViewsRepository.BsmPerformanceIndicator.Properties.description) {
			return BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Description();
		}
		if (editorKey == BsmViewsRepository.BsmPerformanceIndicator.Properties.unit) {
			return BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Unit();
		}
		if (editorKey == BsmViewsRepository.BsmPerformanceIndicator.Properties.formula) {
			return BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Formula();
		}
		if (editorKey == BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredInfo) {
			return BsmPackage.eINSTANCE.getBsmPerformanceIndicator_RequiredInfo();
		}
		if (editorKey == BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredProcessing) {
			return BsmPackage.eINSTANCE.getBsmPerformanceIndicator_RequiredProcessing();
		}
		if (editorKey == BsmViewsRepository.BsmPerformanceIndicator.Properties.decision) {
			return BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Decision();
		}
		if (editorKey == BsmViewsRepository.BsmPerformanceIndicator.Properties.variables) {
			return BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Variables();
		}
		if (editorKey == BsmViewsRepository.BsmPerformanceIndicator.Properties.objectives) {
			return BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Objectives();
		}
		if (editorKey == BsmViewsRepository.BsmPerformanceIndicator.Properties.category1) {
			return BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Category1();
		}
		if (editorKey == BsmViewsRepository.BsmPerformanceIndicator.Properties.category2) {
			return BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Category2();
		}
		if (editorKey == BsmViewsRepository.BsmPerformanceIndicator.Properties.category3) {
			return BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Category3();
		}
		if (editorKey == BsmViewsRepository.BsmPerformanceIndicator.Properties.dimension) {
			return BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Dimension();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BsmPerformanceIndicator bsmPerformanceIndicator = (BsmPerformanceIndicator)semanticObject;
		if (BsmViewsRepository.BsmPerformanceIndicator.Properties.name == event.getAffectedEditor()) {
			bsmPerformanceIndicator.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmPerformanceIndicator.Properties.description == event.getAffectedEditor()) {
			bsmPerformanceIndicator.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmPerformanceIndicator.Properties.unit == event.getAffectedEditor()) {
			bsmPerformanceIndicator.setUnit((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmPerformanceIndicator.Properties.formula == event.getAffectedEditor()) {
			bsmPerformanceIndicator.setFormula((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredInfo == event.getAffectedEditor()) {
			bsmPerformanceIndicator.setRequiredInfo((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredProcessing == event.getAffectedEditor()) {
			bsmPerformanceIndicator.setRequiredProcessing((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmPerformanceIndicator.Properties.decision == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				decisionSettings.setToReference((BsmDecision)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				BsmDecision eObject = BsmFactory.eINSTANCE.createBsmDecision();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				decisionSettings.setToReference(eObject);
			}
		}
		if (BsmViewsRepository.BsmPerformanceIndicator.Properties.variables == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmDecisionVariable) {
					variablesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				variablesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				variablesSettings.move(event.getNewIndex(), (BsmDecisionVariable) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmPerformanceIndicator.Properties.objectives == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmDecisionObjective) {
					objectivesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				objectivesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				objectivesSettings.move(event.getNewIndex(), (BsmDecisionObjective) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmPerformanceIndicator.Properties.category1 == event.getAffectedEditor()) {
			bsmPerformanceIndicator.setCategory1((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmPerformanceIndicator.Properties.category2 == event.getAffectedEditor()) {
			bsmPerformanceIndicator.setCategory2((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmPerformanceIndicator.Properties.category3 == event.getAffectedEditor()) {
			bsmPerformanceIndicator.setCategory3((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmPerformanceIndicator.Properties.dimension == event.getAffectedEditor()) {
			bsmPerformanceIndicator.setDimension((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			BsmPerformanceIndicatorPropertiesEditionPart basePart = (BsmPerformanceIndicatorPropertiesEditionPart)editingPart;
			if (BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Description().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Unit().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.unit)) {
				if (msg.getNewValue() != null) {
					basePart.setUnit(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setUnit("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Formula().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.formula)) {
				if (msg.getNewValue() != null) {
					basePart.setFormula(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setFormula("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmPerformanceIndicator_RequiredInfo().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredInfo)) {
				if (msg.getNewValue() != null) {
					basePart.setRequiredInfo(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setRequiredInfo("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmPerformanceIndicator_RequiredProcessing().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredProcessing)) {
				if (msg.getNewValue() != null) {
					basePart.setRequiredProcessing(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setRequiredProcessing("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Decision().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.decision))
				basePart.setDecision((EObject)msg.getNewValue());
			if (BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Variables().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.variables))
				basePart.updateVariables();
			if (BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Objectives().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.objectives))
				basePart.updateObjectives();
			if (BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Category1().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.category1)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory1(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCategory1("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Category2().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.category2)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory2(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCategory2("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Category3().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.category3)) {
				if (msg.getNewValue() != null) {
					basePart.setCategory3(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCategory3("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Dimension().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPerformanceIndicator.Properties.dimension)) {
				if (msg.getNewValue() != null) {
					basePart.setDimension(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDimension("");
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
		return key == BsmViewsRepository.BsmPerformanceIndicator.Properties.decision;
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
				if (BsmViewsRepository.BsmPerformanceIndicator.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Name().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmPerformanceIndicator.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Description().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmPerformanceIndicator.Properties.unit == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Unit().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Unit().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmPerformanceIndicator.Properties.formula == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Formula().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Formula().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredInfo == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_RequiredInfo().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_RequiredInfo().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredProcessing == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_RequiredProcessing().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_RequiredProcessing().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmPerformanceIndicator.Properties.category1 == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Category1().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Category1().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmPerformanceIndicator.Properties.category2 == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Category2().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Category2().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmPerformanceIndicator.Properties.category3 == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Category3().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Category3().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmPerformanceIndicator.Properties.dimension == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Dimension().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmPerformanceIndicator_Dimension().getEAttributeType(), newValue);
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
