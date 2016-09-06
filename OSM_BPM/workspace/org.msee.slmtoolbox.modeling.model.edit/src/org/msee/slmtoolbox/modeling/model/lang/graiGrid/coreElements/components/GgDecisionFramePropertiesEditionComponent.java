/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.components;

// Start of user code for imports
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgDecisionFramePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage;


// End of user code

/**
 * 
 * 
 */
public class GgDecisionFramePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public GgDecisionFramePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject ggDecisionFrame, String editing_mode) {
		super(editingContext, ggDecisionFrame, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CoreElementsViewsRepository.class;
		partKey = CoreElementsViewsRepository.GgDecisionFrame.class;
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
			final GgDecisionFrame ggDecisionFrame = (GgDecisionFrame)elt;
			final GgDecisionFramePropertiesEditionPart basePart = (GgDecisionFramePropertiesEditionPart)editingPart;
			// init values
			if (ggDecisionFrame.getName() != null && isAccessible(CoreElementsViewsRepository.GgDecisionFrame.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggDecisionFrame.getName()));
			
			if (ggDecisionFrame.getCode() != null && isAccessible(CoreElementsViewsRepository.GgDecisionFrame.Properties.code))
				basePart.setCode(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggDecisionFrame.getCode()));
			
			if (ggDecisionFrame.getDescription() != null && isAccessible(CoreElementsViewsRepository.GgDecisionFrame.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggDecisionFrame.getDescription()));
			
			if (ggDecisionFrame.getDecisionVariable() != null && isAccessible(CoreElementsViewsRepository.GgDecisionFrame.Properties.decisionVariable))
				basePart.setDecisionVariable(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggDecisionFrame.getDecisionVariable()));
			
			if (ggDecisionFrame.getObjective() != null && isAccessible(CoreElementsViewsRepository.GgDecisionFrame.Properties.objective))
				basePart.setObjective(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggDecisionFrame.getObjective()));
			
			if (ggDecisionFrame.getConstraint() != null && isAccessible(CoreElementsViewsRepository.GgDecisionFrame.Properties.constraint))
				basePart.setConstraint(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggDecisionFrame.getConstraint()));
			
			if (ggDecisionFrame.getCriteria() != null && isAccessible(CoreElementsViewsRepository.GgDecisionFrame.Properties.criteria))
				basePart.setCriteria(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggDecisionFrame.getCriteria()));
			
			// init filters
			
			
			
			
			
			
			
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
		if (editorKey == CoreElementsViewsRepository.GgDecisionFrame.Properties.name) {
			return GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name();
		}
		if (editorKey == CoreElementsViewsRepository.GgDecisionFrame.Properties.code) {
			return GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code();
		}
		if (editorKey == CoreElementsViewsRepository.GgDecisionFrame.Properties.description) {
			return GeneralElementsPackage.eINSTANCE.getGgBaseElement_Description();
		}
		if (editorKey == CoreElementsViewsRepository.GgDecisionFrame.Properties.decisionVariable) {
			return CoreElementsPackage.eINSTANCE.getGgDecisionFrame_DecisionVariable();
		}
		if (editorKey == CoreElementsViewsRepository.GgDecisionFrame.Properties.objective) {
			return CoreElementsPackage.eINSTANCE.getGgDecisionFrame_Objective();
		}
		if (editorKey == CoreElementsViewsRepository.GgDecisionFrame.Properties.constraint) {
			return CoreElementsPackage.eINSTANCE.getGgDecisionFrame_Constraint();
		}
		if (editorKey == CoreElementsViewsRepository.GgDecisionFrame.Properties.criteria) {
			return CoreElementsPackage.eINSTANCE.getGgDecisionFrame_Criteria();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		GgDecisionFrame ggDecisionFrame = (GgDecisionFrame)semanticObject;
		if (CoreElementsViewsRepository.GgDecisionFrame.Properties.name == event.getAffectedEditor()) {
			ggDecisionFrame.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.GgDecisionFrame.Properties.code == event.getAffectedEditor()) {
			ggDecisionFrame.setCode((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.GgDecisionFrame.Properties.description == event.getAffectedEditor()) {
			ggDecisionFrame.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.GgDecisionFrame.Properties.decisionVariable == event.getAffectedEditor()) {
			ggDecisionFrame.setDecisionVariable((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.GgDecisionFrame.Properties.objective == event.getAffectedEditor()) {
			ggDecisionFrame.setObjective((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.GgDecisionFrame.Properties.constraint == event.getAffectedEditor()) {
			ggDecisionFrame.setConstraint((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.GgDecisionFrame.Properties.criteria == event.getAffectedEditor()) {
			ggDecisionFrame.setCriteria((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			GgDecisionFramePropertiesEditionPart basePart = (GgDecisionFramePropertiesEditionPart)editingPart;
			if (GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.GgDecisionFrame.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.GgDecisionFrame.Properties.code)) {
				if (msg.getNewValue() != null) {
					basePart.setCode(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCode("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getGgBaseElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.GgDecisionFrame.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (CoreElementsPackage.eINSTANCE.getGgDecisionFrame_DecisionVariable().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.GgDecisionFrame.Properties.decisionVariable)) {
				if (msg.getNewValue() != null) {
					basePart.setDecisionVariable(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDecisionVariable("");
				}
			}
			if (CoreElementsPackage.eINSTANCE.getGgDecisionFrame_Objective().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.GgDecisionFrame.Properties.objective)) {
				if (msg.getNewValue() != null) {
					basePart.setObjective(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setObjective("");
				}
			}
			if (CoreElementsPackage.eINSTANCE.getGgDecisionFrame_Constraint().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.GgDecisionFrame.Properties.constraint)) {
				if (msg.getNewValue() != null) {
					basePart.setConstraint(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setConstraint("");
				}
			}
			if (CoreElementsPackage.eINSTANCE.getGgDecisionFrame_Criteria().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.GgDecisionFrame.Properties.criteria)) {
				if (msg.getNewValue() != null) {
					basePart.setCriteria(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCriteria("");
				}
			}
			
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == CoreElementsViewsRepository.GgDecisionFrame.Properties.name || key == CoreElementsViewsRepository.GgDecisionFrame.Properties.code || key == CoreElementsViewsRepository.GgDecisionFrame.Properties.description || key == CoreElementsViewsRepository.GgDecisionFrame.Properties.decisionVariable || key == CoreElementsViewsRepository.GgDecisionFrame.Properties.objective || key == CoreElementsViewsRepository.GgDecisionFrame.Properties.constraint || key == CoreElementsViewsRepository.GgDecisionFrame.Properties.criteria || key == CoreElementsViewsRepository.GgDecisionFrame.Properties.class;
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
				if (CoreElementsViewsRepository.GgDecisionFrame.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.GgDecisionFrame.Properties.code == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.GgDecisionFrame.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Description().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.GgDecisionFrame.Properties.decisionVariable == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getGgDecisionFrame_DecisionVariable().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getGgDecisionFrame_DecisionVariable().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.GgDecisionFrame.Properties.objective == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getGgDecisionFrame_Objective().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getGgDecisionFrame_Objective().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.GgDecisionFrame.Properties.constraint == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getGgDecisionFrame_Constraint().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getGgDecisionFrame_Constraint().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.GgDecisionFrame.Properties.criteria == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getGgDecisionFrame_Criteria().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getGgDecisionFrame_Criteria().getEAttributeType(), newValue);
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
