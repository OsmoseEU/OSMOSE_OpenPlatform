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
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;


// End of user code

/**
 * 
 * 
 */
public class EaProcessConnectorPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	public EaProcessConnectorPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject eaProcessConnector, String editing_mode) {
		super(editingContext, eaProcessConnector, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CoreElementsViewsRepository.class;
		partKey = CoreElementsViewsRepository.EaProcessConnector.class;
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
			final EaProcessConnector eaProcessConnector = (EaProcessConnector)elt;
			final EaProcessConnectorPropertiesEditionPart basePart = (EaProcessConnectorPropertiesEditionPart)editingPart;
			// init values
			if (eaProcessConnector.getName() != null && isAccessible(CoreElementsViewsRepository.EaProcessConnector.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaProcessConnector.getName()));
			
			if (eaProcessConnector.getCode() != null && isAccessible(CoreElementsViewsRepository.EaProcessConnector.Properties.code))
				basePart.setCode(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaProcessConnector.getCode()));
			
			if (eaProcessConnector.getDescription() != null && isAccessible(CoreElementsViewsRepository.EaProcessConnector.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaProcessConnector.getDescription()));
			// Start of user code for additional initPart
			if (eaProcessConnector.getOrganization() != null && isAccessible(CoreElementsViewsRepository.EaProcessConnector.Properties.organization)) {
				basePart.setOrganization(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaProcessConnector.getOrganization().getName()));
			}
			// End of user code
			if (isAccessible(CoreElementsViewsRepository.EaProcessConnector.Properties.inFlows)) {
				inFlowsSettings = new ReferencesTableSettings(eaProcessConnector, CoreElementsPackage.eINSTANCE.getEaFlowNode_InFlows());
				basePart.initInFlows(inFlowsSettings);
			}
			if (isAccessible(CoreElementsViewsRepository.EaProcessConnector.Properties.outFlows)) {
				outFlowsSettings = new ReferencesTableSettings(eaProcessConnector, CoreElementsPackage.eINSTANCE.getEaFlowNode_OutFlows());
				basePart.initOutFlows(outFlowsSettings);
			}
			// Start of user code for additional initPart
			if (eaProcessConnector.getProcessRef() != null && isAccessible(CoreElementsViewsRepository.EaProcessConnector.Properties.processRef)) {
				basePart.setProcessRef(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaProcessConnector.getProcessRef().getName()));
			}
			// End of user code
			// init filters
			
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : organization, EaProcessConnector, EaProcessConnector.
			if (isAccessible(CoreElementsViewsRepository.EaProcessConnector.Properties.inFlows)) {
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
			if (isAccessible(CoreElementsViewsRepository.EaProcessConnector.Properties.outFlows)) {
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
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : processRef, EaProcessConnector, EaProcessConnector.
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
		if (editorKey == CoreElementsViewsRepository.EaProcessConnector.Properties.name) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name();
		}
		if (editorKey == CoreElementsViewsRepository.EaProcessConnector.Properties.code) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code();
		}
		if (editorKey == CoreElementsViewsRepository.EaProcessConnector.Properties.description) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description();
		}
		if (editorKey == CoreElementsViewsRepository.EaProcessConnector.Properties.organization) {
			return CoreElementsPackage.eINSTANCE.getEaFlowNode_Organization();
		}
		if (editorKey == CoreElementsViewsRepository.EaProcessConnector.Properties.inFlows) {
			return CoreElementsPackage.eINSTANCE.getEaFlowNode_InFlows();
		}
		if (editorKey == CoreElementsViewsRepository.EaProcessConnector.Properties.outFlows) {
			return CoreElementsPackage.eINSTANCE.getEaFlowNode_OutFlows();
		}
		if (editorKey == CoreElementsViewsRepository.EaProcessConnector.Properties.processRef) {
			return CoreElementsPackage.eINSTANCE.getEaProcessConnector_ProcessRef();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EaProcessConnector eaProcessConnector = (EaProcessConnector)semanticObject;
		if (CoreElementsViewsRepository.EaProcessConnector.Properties.name == event.getAffectedEditor()) {
			eaProcessConnector.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaProcessConnector.Properties.code == event.getAffectedEditor()) {
			eaProcessConnector.setCode((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaProcessConnector.Properties.description == event.getAffectedEditor()) {
			eaProcessConnector.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			EaProcessConnectorPropertiesEditionPart basePart = (EaProcessConnectorPropertiesEditionPart)editingPart;
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaProcessConnector.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaProcessConnector.Properties.code)) {
				if (msg.getNewValue() != null) {
					basePart.setCode(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCode("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaProcessConnector.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : organization, EaProcessConnector, EaProcessConnector.
			if (CoreElementsPackage.eINSTANCE.getEaFlowNode_InFlows().equals(msg.getFeature())  && isAccessible(CoreElementsViewsRepository.EaProcessConnector.Properties.inFlows))
				basePart.updateInFlows();
			if (CoreElementsPackage.eINSTANCE.getEaFlowNode_OutFlows().equals(msg.getFeature())  && isAccessible(CoreElementsViewsRepository.EaProcessConnector.Properties.outFlows))
				basePart.updateOutFlows();
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : processRef, EaProcessConnector, EaProcessConnector.
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == CoreElementsViewsRepository.EaProcessConnector.Properties.processRef;
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
				if (CoreElementsViewsRepository.EaProcessConnector.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaProcessConnector.Properties.code == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaProcessConnector.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().getEAttributeType(), newValue);
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
