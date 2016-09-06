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
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaDivergingAnd;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingAndPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsPackage;


// End of user code

/**
 * 
 * 
 */
public class EaDivergingAndPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
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
	public EaDivergingAndPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject eaDivergingAnd, String editing_mode) {
		super(editingContext, eaDivergingAnd, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = CoreElementsViewsRepository.class;
		partKey = CoreElementsViewsRepository.EaDivergingAnd.class;
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
			final EaDivergingAnd eaDivergingAnd = (EaDivergingAnd)elt;
			final EaDivergingAndPropertiesEditionPart basePart = (EaDivergingAndPropertiesEditionPart)editingPart;
			// init values
			if (eaDivergingAnd.getName() != null && isAccessible(CoreElementsViewsRepository.EaDivergingAnd.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaDivergingAnd.getName()));
			
			if (eaDivergingAnd.getCode() != null && isAccessible(CoreElementsViewsRepository.EaDivergingAnd.Properties.code))
				basePart.setCode(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaDivergingAnd.getCode()));
			
			if (eaDivergingAnd.getDescription() != null && isAccessible(CoreElementsViewsRepository.EaDivergingAnd.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaDivergingAnd.getDescription()));
			// Start of user code for additional initPart
			if (eaDivergingAnd.getOrganization() != null && isAccessible(CoreElementsViewsRepository.EaDivergingAnd.Properties.organization)) {
				basePart.setOrganization(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, eaDivergingAnd.getOrganization().getName()));
			}
			// End of user code
			if (isAccessible(CoreElementsViewsRepository.EaDivergingAnd.Properties.inFlows)) {
				inFlowsSettings = new ReferencesTableSettings(eaDivergingAnd, CoreElementsPackage.eINSTANCE.getEaFlowNode_InFlows());
				basePart.initInFlows(inFlowsSettings);
			}
			if (isAccessible(CoreElementsViewsRepository.EaDivergingAnd.Properties.outFlows)) {
				outFlowsSettings = new ReferencesTableSettings(eaDivergingAnd, CoreElementsPackage.eINSTANCE.getEaFlowNode_OutFlows());
				basePart.initOutFlows(outFlowsSettings);
			}
			// init filters
			
			
			
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : organization, EaDivergingAnd, EaDivergingAnd.
			if (isAccessible(CoreElementsViewsRepository.EaDivergingAnd.Properties.inFlows)) {
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
			if (isAccessible(CoreElementsViewsRepository.EaDivergingAnd.Properties.outFlows)) {
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
		if (editorKey == CoreElementsViewsRepository.EaDivergingAnd.Properties.name) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name();
		}
		if (editorKey == CoreElementsViewsRepository.EaDivergingAnd.Properties.code) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code();
		}
		if (editorKey == CoreElementsViewsRepository.EaDivergingAnd.Properties.description) {
			return GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description();
		}
		if (editorKey == CoreElementsViewsRepository.EaDivergingAnd.Properties.organization) {
			return CoreElementsPackage.eINSTANCE.getEaFlowNode_Organization();
		}
		if (editorKey == CoreElementsViewsRepository.EaDivergingAnd.Properties.inFlows) {
			return CoreElementsPackage.eINSTANCE.getEaFlowNode_InFlows();
		}
		if (editorKey == CoreElementsViewsRepository.EaDivergingAnd.Properties.outFlows) {
			return CoreElementsPackage.eINSTANCE.getEaFlowNode_OutFlows();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		EaDivergingAnd eaDivergingAnd = (EaDivergingAnd)semanticObject;
		if (CoreElementsViewsRepository.EaDivergingAnd.Properties.name == event.getAffectedEditor()) {
			eaDivergingAnd.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaDivergingAnd.Properties.code == event.getAffectedEditor()) {
			eaDivergingAnd.setCode((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (CoreElementsViewsRepository.EaDivergingAnd.Properties.description == event.getAffectedEditor()) {
			eaDivergingAnd.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			EaDivergingAndPropertiesEditionPart basePart = (EaDivergingAndPropertiesEditionPart)editingPart;
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaDivergingAnd.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaDivergingAnd.Properties.code)) {
				if (msg.getNewValue() != null) {
					basePart.setCode(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCode("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getEaBaseElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(CoreElementsViewsRepository.EaDivergingAnd.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : organization, EaDivergingAnd, EaDivergingAnd.
			if (CoreElementsPackage.eINSTANCE.getEaFlowNode_InFlows().equals(msg.getFeature())  && isAccessible(CoreElementsViewsRepository.EaDivergingAnd.Properties.inFlows))
				basePart.updateInFlows();
			if (CoreElementsPackage.eINSTANCE.getEaFlowNode_OutFlows().equals(msg.getFeature())  && isAccessible(CoreElementsViewsRepository.EaDivergingAnd.Properties.outFlows))
				basePart.updateOutFlows();
			
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
				if (CoreElementsViewsRepository.EaDivergingAnd.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Name().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaDivergingAnd.Properties.code == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getEaBaseElement_Code().getEAttributeType(), newValue);
				}
				if (CoreElementsViewsRepository.EaDivergingAnd.Properties.description == event.getAffectedEditor()) {
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
