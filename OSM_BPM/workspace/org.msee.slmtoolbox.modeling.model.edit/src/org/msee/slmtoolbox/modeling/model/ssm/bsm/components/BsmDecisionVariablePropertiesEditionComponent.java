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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFactory;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionVariablePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BsmDecisionVariablePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	public BsmDecisionVariablePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bsmDecisionVariable, String editing_mode) {
		super(editingContext, bsmDecisionVariable, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BsmViewsRepository.class;
		partKey = BsmViewsRepository.BsmDecisionVariable.class;
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
			final BsmDecisionVariable bsmDecisionVariable = (BsmDecisionVariable)elt;
			final BsmDecisionVariablePropertiesEditionPart basePart = (BsmDecisionVariablePropertiesEditionPart)editingPart;
			// init values
			if (bsmDecisionVariable.getName() != null && isAccessible(BsmViewsRepository.BsmDecisionVariable.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmDecisionVariable.getName()));
			
			if (bsmDecisionVariable.getDescription() != null && isAccessible(BsmViewsRepository.BsmDecisionVariable.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmDecisionVariable.getDescription()));
			
			if (isAccessible(BsmViewsRepository.BsmDecisionVariable.Properties.decision)) {
				// init part
				decisionSettings = new EObjectFlatComboSettings(bsmDecisionVariable, BsmPackage.eINSTANCE.getBsmDecisionVariable_Decision());
				basePart.initDecision(decisionSettings);
				// set the button mode
				basePart.setDecisionButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(BsmViewsRepository.BsmDecisionVariable.Properties.performanceIndicators)) {
				performanceIndicatorsSettings = new ReferencesTableSettings(bsmDecisionVariable, BsmPackage.eINSTANCE.getBsmDecisionVariable_PerformanceIndicators());
				basePart.initPerformanceIndicators(performanceIndicatorsSettings);
			}
			// init filters
			
			
			if (isAccessible(BsmViewsRepository.BsmDecisionVariable.Properties.decision)) {
				basePart.addFilterToDecision(new ViewerFilter() {
			// Start of user code
				@Override
				public Object[] filter(Viewer viewer, Object parent,
					Object[] elements) {
					
					Object[] out = new Object[bsmDecisionVariable.getDecision().getBsmModel().getDecisions().size()];
					out= bsmDecisionVariable.getDecision().getBsmModel().getDecisions().toArray();						
					
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
			if (isAccessible(BsmViewsRepository.BsmDecisionVariable.Properties.performanceIndicators)) {
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
		if (editorKey == BsmViewsRepository.BsmDecisionVariable.Properties.name) {
			return BsmPackage.eINSTANCE.getBsmDecisionVariable_Name();
		}
		if (editorKey == BsmViewsRepository.BsmDecisionVariable.Properties.description) {
			return BsmPackage.eINSTANCE.getBsmDecisionVariable_Description();
		}
		if (editorKey == BsmViewsRepository.BsmDecisionVariable.Properties.decision) {
			return BsmPackage.eINSTANCE.getBsmDecisionVariable_Decision();
		}
		if (editorKey == BsmViewsRepository.BsmDecisionVariable.Properties.performanceIndicators) {
			return BsmPackage.eINSTANCE.getBsmDecisionVariable_PerformanceIndicators();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BsmDecisionVariable bsmDecisionVariable = (BsmDecisionVariable)semanticObject;
		if (BsmViewsRepository.BsmDecisionVariable.Properties.name == event.getAffectedEditor()) {
			bsmDecisionVariable.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmDecisionVariable.Properties.description == event.getAffectedEditor()) {
			bsmDecisionVariable.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmDecisionVariable.Properties.decision == event.getAffectedEditor()) {
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
		if (BsmViewsRepository.BsmDecisionVariable.Properties.performanceIndicators == event.getAffectedEditor()) {
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
			BsmDecisionVariablePropertiesEditionPart basePart = (BsmDecisionVariablePropertiesEditionPart)editingPart;
			if (BsmPackage.eINSTANCE.getBsmDecisionVariable_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmDecisionVariable.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmDecisionVariable_Description().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmDecisionVariable.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmDecisionVariable_Decision().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmDecisionVariable.Properties.decision))
				basePart.setDecision((EObject)msg.getNewValue());
			if (BsmPackage.eINSTANCE.getBsmDecisionVariable_PerformanceIndicators().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmDecisionVariable.Properties.performanceIndicators))
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
		return key == BsmViewsRepository.BsmDecisionVariable.Properties.decision;
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
				if (BsmViewsRepository.BsmDecisionVariable.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmDecisionVariable_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmDecisionVariable_Name().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmDecisionVariable.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmDecisionVariable_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmDecisionVariable_Description().getEAttributeType(), newValue);
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
