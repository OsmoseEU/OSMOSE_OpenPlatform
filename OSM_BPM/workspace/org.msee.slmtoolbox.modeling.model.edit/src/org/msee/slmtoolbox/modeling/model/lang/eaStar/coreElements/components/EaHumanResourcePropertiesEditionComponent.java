/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.components;

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
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaHumanResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaHumanResourcePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;


// End of user code

/**
 * 
 * 
 */
public class EaHumanResourcePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	public EaHumanResourcePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject eaHumanResource, String editing_mode) {
		super(editingContext, eaHumanResource, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CoreElementsViewsRepository.class;
		partKey = CoreElementsViewsRepository.EaHumanResource.class;
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
			final EaHumanResource eaHumanResource = (EaHumanResource)elt;
			final EaHumanResourcePropertiesEditionPart basePart = (EaHumanResourcePropertiesEditionPart)editingPart;
			// init values
			if (eaHumanResource.getName() != null && isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaHumanResource.getName()));
			
			if (eaHumanResource.getCode() != null && isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.code))
				basePart.setCode(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaHumanResource.getCode()));
			
			if (eaHumanResource.getDescription() != null && isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaHumanResource.getDescription()));
			// Start of user code for additional initPart
			if (eaHumanResource.getOrganization() != null && isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.organization)) {
				basePart.setOrganization(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaHumanResource.getOrganization().getName()));
			}
			// End of user code
			if (isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.inFlows)) {
				inFlowsSettings = new ReferencesTableSettings(eaHumanResource, CoreElementsPackage.eINSTANCE.getEaFlowNode_InFlows());
				basePart.initInFlows(inFlowsSettings);
			}
			if (isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.outFlows)) {
				outFlowsSettings = new ReferencesTableSettings(eaHumanResource, CoreElementsPackage.eINSTANCE.getEaFlowNode_OutFlows());
				basePart.initOutFlows(outFlowsSettings);
			}
			if (isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.unitaryCost)) {
				basePart.setUnitaryCost(EEFConverterUtil.convertToString(EcorePackage.Literals.EDOUBLE, eaHumanResource.getUnitaryCost()));
			}
			
			if (eaHumanResource.getLocation() != null && isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.location))
				basePart.setLocation(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaHumanResource.getLocation()));
			
			if (eaHumanResource.getCapabilities() != null && isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.capabilities))
				basePart.setCapabilities(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaHumanResource.getCapabilities()));
			
			// init filters
			
			
			
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : organization, EaHumanResource, EaHumanResource.
			if (isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.inFlows)) {
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
			if (isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.outFlows)) {
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
		if (editorKey == CoreElementsViewsRepository.EaHumanResource.Properties.name) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name();
		}
		if (editorKey == CoreElementsViewsRepository.EaHumanResource.Properties.code) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code();
		}
		if (editorKey == CoreElementsViewsRepository.EaHumanResource.Properties.description) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description();
		}
		if (editorKey == CoreElementsViewsRepository.EaHumanResource.Properties.organization) {
			return CoreElementsPackage.eINSTANCE.getEaFlowNode_Organization();
		}
		if (editorKey == CoreElementsViewsRepository.EaHumanResource.Properties.inFlows) {
			return CoreElementsPackage.eINSTANCE.getEaFlowNode_InFlows();
		}
		if (editorKey == CoreElementsViewsRepository.EaHumanResource.Properties.outFlows) {
			return CoreElementsPackage.eINSTANCE.getEaFlowNode_OutFlows();
		}
		if (editorKey == CoreElementsViewsRepository.EaHumanResource.Properties.unitaryCost) {
			return CoreElementsPackage.eINSTANCE.getEaResource_UnitaryCost();
		}
		if (editorKey == CoreElementsViewsRepository.EaHumanResource.Properties.location) {
			return CoreElementsPackage.eINSTANCE.getEaResource_Location();
		}
		if (editorKey == CoreElementsViewsRepository.EaHumanResource.Properties.capabilities) {
			return CoreElementsPackage.eINSTANCE.getEaResource_Capabilities();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EaHumanResource eaHumanResource = (EaHumanResource)semanticObject;
		if (CoreElementsViewsRepository.EaHumanResource.Properties.name == event.getAffectedEditor()) {
			eaHumanResource.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaHumanResource.Properties.code == event.getAffectedEditor()) {
			eaHumanResource.setCode((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaHumanResource.Properties.description == event.getAffectedEditor()) {
			eaHumanResource.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaHumanResource.Properties.unitaryCost == event.getAffectedEditor()) {
			eaHumanResource.setUnitaryCost((EEFConverterUtil.createDoubleFromString(EcorePackage.Literals.EDOUBLE, (String)event.getNewValue())));
		}
		if (CoreElementsViewsRepository.EaHumanResource.Properties.location == event.getAffectedEditor()) {
			eaHumanResource.setLocation((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaHumanResource.Properties.capabilities == event.getAffectedEditor()) {
			eaHumanResource.setCapabilities((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			EaHumanResourcePropertiesEditionPart basePart = (EaHumanResourcePropertiesEditionPart)editingPart;
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.code)) {
				if (msg.getNewValue() != null) {
					basePart.setCode(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCode("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : organization, EaHumanResource, EaHumanResource.
			if (CoreElementsPackage.eINSTANCE.getEaFlowNode_InFlows().equals(msg.getFeature())  && isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.inFlows))
				basePart.updateInFlows();
			if (CoreElementsPackage.eINSTANCE.getEaFlowNode_OutFlows().equals(msg.getFeature())  && isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.outFlows))
				basePart.updateOutFlows();
			if (CoreElementsPackage.eINSTANCE.getEaResource_UnitaryCost().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.unitaryCost)) {
				if (msg.getNewValue() != null) {
					basePart.setUnitaryCost(EcoreUtil.convertToString(EcorePackage.Literals.EDOUBLE, msg.getNewValue()));
				} else {
					basePart.setUnitaryCost("");
				}
			}
			if (CoreElementsPackage.eINSTANCE.getEaResource_Location().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.location)) {
				if (msg.getNewValue() != null) {
					basePart.setLocation(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setLocation("");
				}
			}
			if (CoreElementsPackage.eINSTANCE.getEaResource_Capabilities().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaHumanResource.Properties.capabilities)) {
				if (msg.getNewValue() != null) {
					basePart.setCapabilities(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCapabilities("");
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
				if (CoreElementsViewsRepository.EaHumanResource.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaHumanResource.Properties.code == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaHumanResource.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaHumanResource.Properties.unitaryCost == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaResource_UnitaryCost().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaResource_UnitaryCost().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaHumanResource.Properties.location == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaResource_Location().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaResource_Location().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaHumanResource.Properties.capabilities == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(CoreElementsPackage.eINSTANCE.getEaResource_Capabilities().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(CoreElementsPackage.eINSTANCE.getEaResource_Capabilities().getEAttributeType(), newValue);
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
