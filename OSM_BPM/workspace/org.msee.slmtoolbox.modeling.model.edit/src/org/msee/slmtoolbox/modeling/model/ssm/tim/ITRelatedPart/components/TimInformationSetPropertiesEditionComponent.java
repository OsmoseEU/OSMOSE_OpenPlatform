/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.components;

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
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimEnterpriseApplicationResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.ITRelatedPartViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationSetPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class TimInformationSetPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for entrepriseApplications ReferencesTable
	 */
	private ReferencesTableSettings entrepriseApplicationsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TimInformationSetPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject timInformationSet, String editing_mode) {
		super(editingContext, timInformationSet, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ITRelatedPartViewsRepository.class;
		partKey = ITRelatedPartViewsRepository.TimInformationSet.class;
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
			final TimInformationSet timInformationSet = (TimInformationSet)elt;
			final TimInformationSetPropertiesEditionPart basePart = (TimInformationSetPropertiesEditionPart)editingPart;
			// init values
			if (timInformationSet.getName() != null && isAccessible(ITRelatedPartViewsRepository.TimInformationSet.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timInformationSet.getName()));
			
			if (isAccessible(ITRelatedPartViewsRepository.TimInformationSet.Properties.entrepriseApplications)) {
				entrepriseApplicationsSettings = new ReferencesTableSettings(timInformationSet, ITRelatedPartPackage.eINSTANCE.getTimInformationSet_EntrepriseApplications());
				basePart.initEntrepriseApplications(entrepriseApplicationsSettings);
			}
			// FIXME NO VALID CASE INTO template public updater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : model, TimInformationSet, TimInformationSet.
			// init filters
			
			if (isAccessible(ITRelatedPartViewsRepository.TimInformationSet.Properties.entrepriseApplications)) {
				basePart.addFilterToEntrepriseApplications(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInEntrepriseApplicationsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToEntrepriseApplications(new EObjectFilter(ITRelatedPartPackage.Literals.TIM_ENTERPRISE_APPLICATION_RESOURCE));
				// Start of user code for additional businessfilters for entrepriseApplications
				// End of user code
			}
			// FIXME NO VALID CASE INTO template public filterUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : model, TimInformationSet, TimInformationSet.
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
		if (editorKey == ITRelatedPartViewsRepository.TimInformationSet.Properties.name) {
			return ITRelatedPartPackage.eINSTANCE.getTimInformationSet_Name();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimInformationSet.Properties.entrepriseApplications) {
			return ITRelatedPartPackage.eINSTANCE.getTimInformationSet_EntrepriseApplications();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimInformationSet.Properties.model) {
			return ITRelatedPartPackage.eINSTANCE.getTimInformationSet_Model();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TimInformationSet timInformationSet = (TimInformationSet)semanticObject;
		if (ITRelatedPartViewsRepository.TimInformationSet.Properties.name == event.getAffectedEditor()) {
			timInformationSet.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ITRelatedPartViewsRepository.TimInformationSet.Properties.entrepriseApplications == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof TimEnterpriseApplicationResource) {
					entrepriseApplicationsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				entrepriseApplicationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				entrepriseApplicationsSettings.move(event.getNewIndex(), (TimEnterpriseApplicationResource) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			TimInformationSetPropertiesEditionPart basePart = (TimInformationSetPropertiesEditionPart)editingPart;
			if (ITRelatedPartPackage.eINSTANCE.getTimInformationSet_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ITRelatedPartViewsRepository.TimInformationSet.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ITRelatedPartPackage.eINSTANCE.getTimInformationSet_EntrepriseApplications().equals(msg.getFeature())  && isAccessible(ITRelatedPartViewsRepository.TimInformationSet.Properties.entrepriseApplications))
				basePart.updateEntrepriseApplications();
			// FIXME INVALID CASE INTO template public liveUpdater(editionElement : PropertiesEditionElement, view : View, pec : PropertiesEditionComponent) in widgetControl.mtl module, with the values : model, TimInformationSet, TimInformationSet.
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ITRelatedPartViewsRepository.TimInformationSet.Properties.model;
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
				if (ITRelatedPartViewsRepository.TimInformationSet.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ITRelatedPartPackage.eINSTANCE.getTimInformationSet_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ITRelatedPartPackage.eINSTANCE.getTimInformationSet_Name().getEAttributeType(), newValue);
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
