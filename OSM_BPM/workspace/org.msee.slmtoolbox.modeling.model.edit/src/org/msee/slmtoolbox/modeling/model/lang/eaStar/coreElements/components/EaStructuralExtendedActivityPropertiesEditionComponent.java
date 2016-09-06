/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.components;

// Start of user code for imports
import java.util.ArrayList;

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
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;


// End of user code

/**
 * 
 * 
 */
public class EaStructuralExtendedActivityPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for inFlows ReferencesTable
	 */
	private ReferencesTableSettings inFlowsSettings;
	
	/**
	 * Settings for outFlows ReferencesTable
	 */
	private ReferencesTableSettings outFlowsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public EaStructuralExtendedActivityPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject eaStructuralExtendedActivity, String editing_mode) {
		super(editingContext, eaStructuralExtendedActivity, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CoreElementsViewsRepository.class;
		partKey = CoreElementsViewsRepository.EaStructuralExtendedActivity.class;
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
			final EaStructuralExtendedActivity eaStructuralExtendedActivity = (EaStructuralExtendedActivity)elt;
			final EaStructuralExtendedActivityPropertiesEditionPart basePart = (EaStructuralExtendedActivityPropertiesEditionPart)editingPart;
			// init values
			if (eaStructuralExtendedActivity.getName() != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaStructuralExtendedActivity.getName()));
			
			if (eaStructuralExtendedActivity.getCode() != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.code))
				basePart.setCode(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaStructuralExtendedActivity.getCode()));
			
			if (eaStructuralExtendedActivity.getDescription() != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaStructuralExtendedActivity.getDescription()));
			// Start of user code for additional initPart
			if (eaStructuralExtendedActivity.getOrganization() != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.organization)) {
				basePart.setOrganization(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaStructuralExtendedActivity.getOrganization().getName()));
			}
			// End of user code
			if (isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.inFlows)) {
				inFlowsSettings = new ReferencesTableSettings(eaStructuralExtendedActivity, CoreElementsPackage.eINSTANCE.getEaFlowNode_InFlows());
				basePart.initInFlows(inFlowsSettings);
			}
			if (isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.outFlows)) {
				outFlowsSettings = new ReferencesTableSettings(eaStructuralExtendedActivity, CoreElementsPackage.eINSTANCE.getEaFlowNode_OutFlows());
				basePart.initOutFlows(outFlowsSettings);
			}
			if (eaStructuralExtendedActivity.getMission() != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.mission))
				basePart.setMission(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaStructuralExtendedActivity.getMission()));
			
			if (eaStructuralExtendedActivity.getFunctionalRules() != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.functionalRules))
				basePart.setFunctionalRules(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaStructuralExtendedActivity.getFunctionalRules()));
			
			if (isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minCost)) {
				basePart.setMinCost(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, eaStructuralExtendedActivity.getMinCost()));
			}
			
			if (isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxCost)) {
				basePart.setMaxCost(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, eaStructuralExtendedActivity.getMaxCost()));
			}
			
			if (isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageCost)) {
				basePart.setAverageCost(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, eaStructuralExtendedActivity.getAverageCost()));
			}
			
			if (isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minTimeDelay)) {
				basePart.setMinTimeDelay(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, eaStructuralExtendedActivity.getMinTimeDelay()));
			}
			
			if (isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxTimeDelay)) {
				basePart.setMaxTimeDelay(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, eaStructuralExtendedActivity.getMaxTimeDelay()));
			}
			
			if (isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageTimeDelay)) {
				basePart.setAverageTimeDelay(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, eaStructuralExtendedActivity.getAverageTimeDelay()));
			}
			
			if (isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isStarting)) {
				basePart.setIsStarting(eaStructuralExtendedActivity.isIsStarting());
			}
			if (isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isEnding)) {
				basePart.setIsEnding(eaStructuralExtendedActivity.isIsEnding());
			}
			if (eaStructuralExtendedActivity.getDecompositionCode() != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.decompositionCode))
				basePart.setDecompositionCode(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaStructuralExtendedActivity.getDecompositionCode()));
			// Start of user code for additional initPart
			if (eaStructuralExtendedActivity.getIsA() != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isA)) {
				basePart.setIsA(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaStructuralExtendedActivity.getIsA().getName()));
			}
			if (isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.osmoseWorld)) {
				// Start of user code for osmoseWorld editor initialization
				java.util.Collection<Object> inputOsmoseWorld = new ArrayList<Object>(4);
				inputOsmoseWorld.add("UNDEFINED");
				inputOsmoseWorld.add("REAL");
				inputOsmoseWorld.add("VIRTUAL");
				inputOsmoseWorld.add("DIGITAL");
				// End of user code
				basePart.initOsmoseWorld(inputOsmoseWorld, eaStructuralExtendedActivity.getOsmoseWorld());
			}
			// End of user code
			// init filters
			
			
			
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : organization, EaStructuralExtendedActivity, EaStructuralExtendedActivity.
			if (isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.inFlows)) {
				basePart.addFilterToInFlows(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInInFlowsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToInFlows(new EObjectFilter(CoreElementsPackage.Literals.EA_FLOW));
				// Start of user code for additional businessfilters for inFlows
				// End of user code
			}
			if (isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.outFlows)) {
				basePart.addFilterToOutFlows(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInOutFlowsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToOutFlows(new EObjectFilter(CoreElementsPackage.Literals.EA_FLOW));
				// Start of user code for additional businessfilters for outFlows
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
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.name) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name();
		}
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.code) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code();
		}
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.description) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description();
		}
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.organization) {
			return CoreElementsPackage.eINSTANCE.getEaFlowNode_Organization();
		}
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.inFlows) {
			return CoreElementsPackage.eINSTANCE.getEaFlowNode_InFlows();
		}
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.outFlows) {
			return CoreElementsPackage.eINSTANCE.getEaFlowNode_OutFlows();
		}
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.mission) {
			return CoreElementsPackage.eINSTANCE.getEaExtendedActivity_Mission();
		}
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.functionalRules) {
			return CoreElementsPackage.eINSTANCE.getEaExtendedActivity_FunctionalRules();
		}
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minCost) {
			return CoreElementsPackage.eINSTANCE.getEaExtendedActivity_MinCost();
		}
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxCost) {
			return CoreElementsPackage.eINSTANCE.getEaExtendedActivity_MaxCost();
		}
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageCost) {
			return CoreElementsPackage.eINSTANCE.getEaExtendedActivity_AverageCost();
		}
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minTimeDelay) {
			return CoreElementsPackage.eINSTANCE.getEaExtendedActivity_MinTimeDelay();
		}
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxTimeDelay) {
			return CoreElementsPackage.eINSTANCE.getEaExtendedActivity_MaxTimeDelay();
		}
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageTimeDelay) {
			return CoreElementsPackage.eINSTANCE.getEaExtendedActivity_AverageTimeDelay();
		}
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isStarting) {
			return CoreElementsPackage.eINSTANCE.getEaExtendedActivity_IsStarting();
		}
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isEnding) {
			return CoreElementsPackage.eINSTANCE.getEaExtendedActivity_IsEnding();
		}
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.decompositionCode) {
			return CoreElementsPackage.eINSTANCE.getEaExtendedActivity_DecompositionCode();
		}
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.osmoseWorld) {
			return CoreElementsPackage.eINSTANCE.getEaExtendedActivity_OsmoseWorld();
		}
		if (editorKey == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isA) {
			return CoreElementsPackage.eINSTANCE.getEaStructuralExtendedActivity_IsA();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EaStructuralExtendedActivity eaStructuralExtendedActivity = (EaStructuralExtendedActivity)semanticObject;
		if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.name == event.getAffectedEditor()) {
			eaStructuralExtendedActivity.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.code == event.getAffectedEditor()) {
			eaStructuralExtendedActivity.setCode((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.description == event.getAffectedEditor()) {
			eaStructuralExtendedActivity.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.mission == event.getAffectedEditor()) {
			eaStructuralExtendedActivity.setMission((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.functionalRules == event.getAffectedEditor()) {
			eaStructuralExtendedActivity.setFunctionalRules((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minCost == event.getAffectedEditor()) {
			eaStructuralExtendedActivity.setMinCost((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxCost == event.getAffectedEditor()) {
			eaStructuralExtendedActivity.setMaxCost((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageCost == event.getAffectedEditor()) {
			eaStructuralExtendedActivity.setAverageCost((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minTimeDelay == event.getAffectedEditor()) {
			eaStructuralExtendedActivity.setMinTimeDelay((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxTimeDelay == event.getAffectedEditor()) {
			eaStructuralExtendedActivity.setMaxTimeDelay((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageTimeDelay == event.getAffectedEditor()) {
			eaStructuralExtendedActivity.setAverageTimeDelay((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isStarting == event.getAffectedEditor()) {
			eaStructuralExtendedActivity.setIsStarting((Boolean)event.getNewValue());
		}
		if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isEnding == event.getAffectedEditor()) {
			eaStructuralExtendedActivity.setIsEnding((Boolean)event.getNewValue());
		}
		if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.decompositionCode == event.getAffectedEditor()) {
			eaStructuralExtendedActivity.setDecompositionCode((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.osmoseWorld == event.getAffectedEditor()) {
			eaStructuralExtendedActivity.setOsmoseWorld((java.lang.String)event.getNewValue());
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			EaStructuralExtendedActivityPropertiesEditionPart basePart = (EaStructuralExtendedActivityPropertiesEditionPart)editingPart;
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.code)) {
				if (msg.getNewValue() != null) {
					basePart.setCode(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCode("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (CoreElementsPackage.eINSTANCE.getEaFlowNode_InFlows().equals(msg.getFeature())  && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.inFlows))
				basePart.updateInFlows();
			if (CoreElementsPackage.eINSTANCE.getEaFlowNode_OutFlows().equals(msg.getFeature())  && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.outFlows))
				basePart.updateOutFlows();
			if (CoreElementsPackage.eINSTANCE.getEaExtendedActivity_Mission().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.mission)) {
				if (msg.getNewValue() != null) {
					basePart.setMission(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setMission("");
				}
			}
			if (CoreElementsPackage.eINSTANCE.getEaExtendedActivity_FunctionalRules().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.functionalRules)) {
				if (msg.getNewValue() != null) {
					basePart.setFunctionalRules(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setFunctionalRules("");
				}
			}
			if (CoreElementsPackage.eINSTANCE.getEaExtendedActivity_MinCost().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minCost)) {
				if (msg.getNewValue() != null) {
					basePart.setMinCost(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					basePart.setMinCost("");
				}
			}
			if (CoreElementsPackage.eINSTANCE.getEaExtendedActivity_MaxCost().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxCost)) {
				if (msg.getNewValue() != null) {
					basePart.setMaxCost(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					basePart.setMaxCost("");
				}
			}
			if (CoreElementsPackage.eINSTANCE.getEaExtendedActivity_AverageCost().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageCost)) {
				if (msg.getNewValue() != null) {
					basePart.setAverageCost(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					basePart.setAverageCost("");
				}
			}
			if (CoreElementsPackage.eINSTANCE.getEaExtendedActivity_MinTimeDelay().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minTimeDelay)) {
				if (msg.getNewValue() != null) {
					basePart.setMinTimeDelay(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					basePart.setMinTimeDelay("");
				}
			}
			if (CoreElementsPackage.eINSTANCE.getEaExtendedActivity_MaxTimeDelay().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxTimeDelay)) {
				if (msg.getNewValue() != null) {
					basePart.setMaxTimeDelay(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					basePart.setMaxTimeDelay("");
				}
			}
			if (CoreElementsPackage.eINSTANCE.getEaExtendedActivity_AverageTimeDelay().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageTimeDelay)) {
				if (msg.getNewValue() != null) {
					basePart.setAverageTimeDelay(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					basePart.setAverageTimeDelay("");
				}
			}
			if (CoreElementsPackage.eINSTANCE.getEaExtendedActivity_IsStarting().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isStarting))
				basePart.setIsStarting((Boolean)msg.getNewValue());
			
			if (CoreElementsPackage.eINSTANCE.getEaExtendedActivity_IsEnding().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isEnding))
				basePart.setIsEnding((Boolean)msg.getNewValue());
			if (CoreElementsPackage.eINSTANCE.getEaExtendedActivity_OsmoseWorld().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.osmoseWorld))
				basePart.setOsmoseWorld((String)msg.getNewValue());
			if (CoreElementsPackage.eINSTANCE.getEaExtendedActivity_DecompositionCode().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.decompositionCode)) {
				if (msg.getNewValue() != null) {
					basePart.setDecompositionCode(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDecompositionCode("");
				}
			}
			
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
				if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.code == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.mission == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_Mission().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_Mission().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.functionalRules == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_FunctionalRules().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_FunctionalRules().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minCost == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_MinCost().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_MinCost().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxCost == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_MaxCost().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_MaxCost().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageCost == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_AverageCost().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_AverageCost().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minTimeDelay == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_MinTimeDelay().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_MinTimeDelay().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxTimeDelay == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_MaxTimeDelay().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_MaxTimeDelay().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageTimeDelay == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_AverageTimeDelay().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_AverageTimeDelay().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isStarting == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_IsStarting().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_IsStarting().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isEnding == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_IsEnding().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_IsEnding().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.decompositionCode == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_DecompositionCode().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_DecompositionCode().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.osmoseWorld == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_OsmoseWorld().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaExtendedActivity_OsmoseWorld().getEAttributeType(), newValue);
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
