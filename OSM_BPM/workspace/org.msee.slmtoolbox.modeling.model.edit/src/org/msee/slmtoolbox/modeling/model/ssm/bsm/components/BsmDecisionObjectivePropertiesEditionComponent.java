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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFactory;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionObjectivePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BsmDecisionObjectivePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for decision EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings decisionSettings;
	
	/**
	 * Settings for performanceIndicators ReferencesTable
	 */
	private ReferencesTableSettings performanceIndicatorsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BsmDecisionObjectivePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bsmDecisionObjective, String editing_mode) {
		super(editingContext, bsmDecisionObjective, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BsmViewsRepository.class;
		partKey = BsmViewsRepository.BsmDecisionObjective.class;
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
			final BsmDecisionObjective bsmDecisionObjective = (BsmDecisionObjective)elt;
			final BsmDecisionObjectivePropertiesEditionPart basePart = (BsmDecisionObjectivePropertiesEditionPart)editingPart;
			// init values
			if (bsmDecisionObjective.getName() != null && isAccessible(BsmViewsRepository.BsmDecisionObjective.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmDecisionObjective.getName()));
			
			if (bsmDecisionObjective.getDescription() != null && isAccessible(BsmViewsRepository.BsmDecisionObjective.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmDecisionObjective.getDescription()));
			
			if (isAccessible(BsmViewsRepository.BsmDecisionObjective.Properties.decision)) {
				// init part
				decisionSettings = new EObjectFlatComboSettings(bsmDecisionObjective, BsmPackage.eINSTANCE.getBsmDecisionObjective_Decision());
				basePart.initDecision(decisionSettings);
				// set the button mode
				basePart.setDecisionButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(BsmViewsRepository.BsmDecisionObjective.Properties.performanceIndicators)) {
				performanceIndicatorsSettings = new ReferencesTableSettings(bsmDecisionObjective, BsmPackage.eINSTANCE.getBsmDecisionObjective_PerformanceIndicators());
				basePart.initPerformanceIndicators(performanceIndicatorsSettings);
			}
			// init filters
			
			
			if (isAccessible(BsmViewsRepository.BsmDecisionObjective.Properties.decision)) {
				basePart.addFilterToDecision(new ViewerFilter() {
				// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						Object[] out = new Object[bsmDecisionObjective.getDecision().getBsmModel().getDecisions().size()];
						out= bsmDecisionObjective.getDecision().getBsmModel().getDecisions().toArray();						
					
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
			if (isAccessible(BsmViewsRepository.BsmDecisionObjective.Properties.performanceIndicators)) {
				basePart.addFilterToPerformanceIndicators(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInPerformanceIndicatorsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToPerformanceIndicators(new EObjectFilter(BsmPackage.Literals.BSM_PERFORMANCE_INDICATOR));
				// Start of user code for additional businessfilters for performanceIndicators
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
		if (editorKey == BsmViewsRepository.BsmDecisionObjective.Properties.name) {
			return BsmPackage.eINSTANCE.getBsmDecisionObjective_Name();
		}
		if (editorKey == BsmViewsRepository.BsmDecisionObjective.Properties.description) {
			return BsmPackage.eINSTANCE.getBsmDecisionObjective_Description();
		}
		if (editorKey == BsmViewsRepository.BsmDecisionObjective.Properties.decision) {
			return BsmPackage.eINSTANCE.getBsmDecisionObjective_Decision();
		}
		if (editorKey == BsmViewsRepository.BsmDecisionObjective.Properties.performanceIndicators) {
			return BsmPackage.eINSTANCE.getBsmDecisionObjective_PerformanceIndicators();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BsmDecisionObjective bsmDecisionObjective = (BsmDecisionObjective)semanticObject;
		if (BsmViewsRepository.BsmDecisionObjective.Properties.name == event.getAffectedEditor()) {
			bsmDecisionObjective.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmDecisionObjective.Properties.description == event.getAffectedEditor()) {
			bsmDecisionObjective.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmDecisionObjective.Properties.decision == event.getAffectedEditor()) {
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
		if (BsmViewsRepository.BsmDecisionObjective.Properties.performanceIndicators == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmPerformanceIndicator) {
					performanceIndicatorsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				performanceIndicatorsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				performanceIndicatorsSettings.move(event.getNewIndex(), (BsmPerformanceIndicator) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			BsmDecisionObjectivePropertiesEditionPart basePart = (BsmDecisionObjectivePropertiesEditionPart)editingPart;
			if (BsmPackage.eINSTANCE.getBsmDecisionObjective_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmDecisionObjective.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmDecisionObjective_Description().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmDecisionObjective.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmDecisionObjective_Decision().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmDecisionObjective.Properties.decision))
				basePart.setDecision((EObject)msg.getNewValue());
			if (BsmPackage.eINSTANCE.getBsmDecisionObjective_PerformanceIndicators().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmDecisionObjective.Properties.performanceIndicators))
				basePart.updatePerformanceIndicators();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == BsmViewsRepository.BsmDecisionObjective.Properties.decision;
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
				if (BsmViewsRepository.BsmDecisionObjective.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmDecisionObjective_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmDecisionObjective_Name().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmDecisionObjective.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmDecisionObjective_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmDecisionObjective_Description().getEAttributeType(), newValue);
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
