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
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeUnits;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgTimeValue;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage;


// End of user code

/**
 * 
 * 
 */
public class GgLevelPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public GgLevelPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject ggLevel, String editing_mode) {
		super(editingContext, ggLevel, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CoreElementsViewsRepository.class;
		partKey = CoreElementsViewsRepository.GgLevel.class;
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
			final GgLevel ggLevel = (GgLevel)elt;
			final GgLevelPropertiesEditionPart basePart = (GgLevelPropertiesEditionPart)editingPart;
			// init values
			if (ggLevel.getName() != null && isAccessible(CoreElementsViewsRepository.GgLevel.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggLevel.getName()));
			
			if (ggLevel.getCode() != null && isAccessible(CoreElementsViewsRepository.GgLevel.Properties.code))
				basePart.setCode(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggLevel.getCode()));
			
			if (ggLevel.getDescription() != null && isAccessible(CoreElementsViewsRepository.GgLevel.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggLevel.getDescription()));
			
			//Horizon
			if (Integer.toString(ggLevel.getHorizon().getValue()) != null && isAccessible(CoreElementsViewsRepository.GgLevel.Properties.Horizon.hValue))
				basePart.setHValue(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, Integer.toString(ggLevel.getHorizon().getValue())));

			if (isAccessible(CoreElementsViewsRepository.GgLevel.Properties.Horizon.hUnit)){
				basePart.initHUnit(new GgTimeUnits[] {
						GgTimeUnits.YEAR,
						GgTimeUnits.MONTH,
						GgTimeUnits.WEEK,
						GgTimeUnits.DAY,
					}, ggLevel.getHorizon().getUnit());
			}
			//Period
			if (Integer.toString(ggLevel.getPeriod().getValue()) != null && isAccessible(CoreElementsViewsRepository.GgLevel.Properties.Period.pValue))
				basePart.setPValue(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, Integer.toString(ggLevel.getPeriod().getValue())));
			
			if (isAccessible(CoreElementsViewsRepository.GgLevel.Properties.Period.pUnit)){
				basePart.initPUnit(new GgTimeUnits[] {
						GgTimeUnits.YEAR,
						GgTimeUnits.MONTH,
						GgTimeUnits.WEEK,
						GgTimeUnits.DAY,
					}, ggLevel.getPeriod().getUnit());
			}
			//Processing Unit
			if (Integer.toString(ggLevel.getProcessingUnit().getValue()) != null && isAccessible(CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puValue))
				basePart.setPuValue(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, Integer.toString(ggLevel.getProcessingUnit().getValue())));
			
			if (isAccessible(CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puUnit)){
				basePart.initPuUnit(new GgTimeUnits[] {
						GgTimeUnits.YEAR,
						GgTimeUnits.MONTH,
						GgTimeUnits.WEEK,
						GgTimeUnits.DAY,
					}, ggLevel.getProcessingUnit().getUnit());
			}
			// End of user code
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
		if (editorKey == CoreElementsViewsRepository.GgLevel.Properties.name) {
			return GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name();
		}
		if (editorKey == CoreElementsViewsRepository.GgLevel.Properties.code) {
			return GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code();
		}
		if (editorKey == CoreElementsViewsRepository.GgLevel.Properties.description) {
			return GeneralElementsPackage.eINSTANCE.getGgBaseElement_Description();
		}
		if (editorKey == CoreElementsViewsRepository.GgLevel.Properties.Horizon.hUnit) {
			return CoreElementsPackage.eINSTANCE.getGgLevel_Horizon();
		}
		if (editorKey == CoreElementsViewsRepository.GgLevel.Properties.Period.pUnit) {
			return CoreElementsPackage.eINSTANCE.getGgLevel_Period();
		}
		if (editorKey == CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puUnit) {
			return CoreElementsPackage.eINSTANCE.getGgLevel_ProcessingUnit();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		GgLevel ggLevel = (GgLevel)semanticObject;
		if (CoreElementsViewsRepository.GgLevel.Properties.name == event.getAffectedEditor()) {
			ggLevel.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.GgLevel.Properties.code == event.getAffectedEditor()) {
			ggLevel.setCode((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.GgLevel.Properties.description == event.getAffectedEditor()) {
			ggLevel.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		// Start of user code updateSemanticModel
		//Horizon
		if (CoreElementsViewsRepository.GgLevel.Properties.Horizon.hUnit == event.getAffectedEditor()) {
			GgTimeValue horizon = EcoreUtil.copy(ggLevel.getHorizon());
			horizon.setUnit((GgTimeUnits)event.getNewValue());
			ggLevel.setHorizon(horizon);
		}
		if (CoreElementsViewsRepository.GgLevel.Properties.Horizon.hValue == event.getAffectedEditor()) {
			GgTimeValue horizon = EcoreUtil.copy(ggLevel.getHorizon());
			if("" != (String)event.getNewValue())
				horizon.setValue(Integer.parseInt((String)event.getNewValue()));
			else
				horizon.setValue(0);
			ggLevel.setHorizon(horizon);
		}
		//Period
		if (CoreElementsViewsRepository.GgLevel.Properties.Period.pUnit == event.getAffectedEditor()) {
			GgTimeValue period = EcoreUtil.copy(ggLevel.getPeriod());
			period.setUnit((GgTimeUnits)event.getNewValue());
			ggLevel.setPeriod(period);
		}
		if (CoreElementsViewsRepository.GgLevel.Properties.Period.pValue == event.getAffectedEditor()) {
			GgTimeValue period = EcoreUtil.copy(ggLevel.getPeriod());
			if("" != (String)event.getNewValue())
				period.setValue(Integer.parseInt((String)event.getNewValue()));
			else
				period.setValue(0);
			ggLevel.setPeriod(period);
		}
		//Processing Unit
		if (CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puUnit == event.getAffectedEditor()) {
			GgTimeValue processingUnit = EcoreUtil.copy(ggLevel.getProcessingUnit());
			processingUnit.setUnit((GgTimeUnits)event.getNewValue());
			ggLevel.setProcessingUnit(processingUnit);
		}
		if (CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puValue == event.getAffectedEditor()) {
			GgTimeValue processingUnit = EcoreUtil.copy(ggLevel.getProcessingUnit());
			if("" != (String)event.getNewValue())
				processingUnit.setValue(Integer.parseInt((String)event.getNewValue()));
			else
				processingUnit.setValue(0);
			ggLevel.setProcessingUnit(processingUnit);
		}
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			GgLevelPropertiesEditionPart basePart = (GgLevelPropertiesEditionPart)editingPart;
			if (GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.GgLevel.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.GgLevel.Properties.code)) {
				if (msg.getNewValue() != null) {
					basePart.setCode(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCode("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getGgBaseElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.GgLevel.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
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
		return key == CoreElementsViewsRepository.GgLevel.Properties.Horizon.hUnit || key == CoreElementsViewsRepository.GgLevel.Properties.Period.pUnit || key == CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puUnit;
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
				if (CoreElementsViewsRepository.GgLevel.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.GgLevel.Properties.code == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.GgLevel.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Description().getEAttributeType(), newValue);
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
