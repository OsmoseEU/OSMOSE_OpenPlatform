/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.components;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

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
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartFactory;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.ITRelatedPartViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class TimInformationEntityPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for outRelations ReferencesTable
	 */
	private ReferencesTableSettings outRelationsSettings;
	
	/**
	 * Settings for inRelations ReferencesTable
	 */
	private ReferencesTableSettings inRelationsSettings;
	
	/**
	 * Settings for information EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings informationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TimInformationEntityPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject timInformationEntity, String editing_mode) {
		super(editingContext, timInformationEntity, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ITRelatedPartViewsRepository.class;
		partKey = ITRelatedPartViewsRepository.TimInformationEntity.class;
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
			final TimInformationEntity timInformationEntity = (TimInformationEntity)elt;
			final TimInformationEntityPropertiesEditionPart basePart = (TimInformationEntityPropertiesEditionPart)editingPart;
			// init values
			if (timInformationEntity.getName() != null && isAccessible(ITRelatedPartViewsRepository.TimInformationEntity.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timInformationEntity.getName()));
			
			if (isAccessible(ITRelatedPartViewsRepository.TimInformationEntity.Properties.outRelations)) {
				outRelationsSettings = new ReferencesTableSettings(timInformationEntity, ITRelatedPartPackage.eINSTANCE.getTimInformationEntity_OutRelations());
				basePart.initOutRelations(outRelationsSettings);
			}
			if (isAccessible(ITRelatedPartViewsRepository.TimInformationEntity.Properties.inRelations)) {
				inRelationsSettings = new ReferencesTableSettings(timInformationEntity, ITRelatedPartPackage.eINSTANCE.getTimInformationEntity_InRelations());
				basePart.initInRelations(inRelationsSettings);
			}
			if (isAccessible(ITRelatedPartViewsRepository.TimInformationEntity.Properties.information)) {
				// init part
				informationSettings = new EObjectFlatComboSettings(timInformationEntity, ITRelatedPartPackage.eINSTANCE.getTimInformationEntity_Information());
				basePart.initInformation(informationSettings);
				// set the button mode
				basePart.setInformationButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			if (isAccessible(ITRelatedPartViewsRepository.TimInformationEntity.Properties.outRelations)) {
				basePart.addFilterToOutRelations(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInOutRelationsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToOutRelations(new EObjectFilter(ITRelatedPartPackage.Literals.TIM_INFORMATION_RELATIONSHIP));
				// Start of user code for additional businessfilters for outRelations
				// End of user code
			}
			if (isAccessible(ITRelatedPartViewsRepository.TimInformationEntity.Properties.inRelations)) {
				basePart.addFilterToInRelations(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInInRelationsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToInRelations(new EObjectFilter(ITRelatedPartPackage.Literals.TIM_INFORMATION_RELATIONSHIP));
				// Start of user code for additional businessfilters for inRelations
				// End of user code
			}
			if (isAccessible(ITRelatedPartViewsRepository.TimInformationEntity.Properties.information)) {
				basePart.addFilterToInformation(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						List<TimInformationSet> out = new ArrayList<TimInformationSet>();
						if (null != timInformationEntity.getInformation() 
								&& null != timInformationEntity.getInformation().getModel()) {
								out.addAll(timInformationEntity.getInformation().getModel().getInformations());
						}
						return out.toArray();
					}
					// End of user code
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof TimInformationSet);
					}
					
				});
				// Start of user code for additional businessfilters for information
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
		if (editorKey == ITRelatedPartViewsRepository.TimInformationEntity.Properties.name) {
			return ITRelatedPartPackage.eINSTANCE.getTimInformationEntity_Name();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimInformationEntity.Properties.outRelations) {
			return ITRelatedPartPackage.eINSTANCE.getTimInformationEntity_OutRelations();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimInformationEntity.Properties.inRelations) {
			return ITRelatedPartPackage.eINSTANCE.getTimInformationEntity_InRelations();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimInformationEntity.Properties.information) {
			return ITRelatedPartPackage.eINSTANCE.getTimInformationEntity_Information();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TimInformationEntity timInformationEntity = (TimInformationEntity)semanticObject;
		if (ITRelatedPartViewsRepository.TimInformationEntity.Properties.name == event.getAffectedEditor()) {
			timInformationEntity.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ITRelatedPartViewsRepository.TimInformationEntity.Properties.outRelations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof TimInformationRelationship) {
					outRelationsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				outRelationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				outRelationsSettings.move(event.getNewIndex(), (TimInformationRelationship) event.getNewValue());
			}
		}
		if (ITRelatedPartViewsRepository.TimInformationEntity.Properties.inRelations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof TimInformationRelationship) {
					inRelationsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				inRelationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				inRelationsSettings.move(event.getNewIndex(), (TimInformationRelationship) event.getNewValue());
			}
		}
		if (ITRelatedPartViewsRepository.TimInformationEntity.Properties.information == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				informationSettings.setToReference((TimInformationSet)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				TimInformationSet eObject = ITRelatedPartFactory.eINSTANCE.createTimInformationSet();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				informationSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			TimInformationEntityPropertiesEditionPart basePart = (TimInformationEntityPropertiesEditionPart)editingPart;
			if (ITRelatedPartPackage.eINSTANCE.getTimInformationEntity_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ITRelatedPartViewsRepository.TimInformationEntity.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ITRelatedPartPackage.eINSTANCE.getTimInformationEntity_OutRelations().equals(msg.getFeature())  && isAccessible(ITRelatedPartViewsRepository.TimInformationEntity.Properties.outRelations))
				basePart.updateOutRelations();
			if (ITRelatedPartPackage.eINSTANCE.getTimInformationEntity_InRelations().equals(msg.getFeature())  && isAccessible(ITRelatedPartViewsRepository.TimInformationEntity.Properties.inRelations))
				basePart.updateInRelations();
			if (ITRelatedPartPackage.eINSTANCE.getTimInformationEntity_Information().equals(msg.getFeature()) && basePart != null && isAccessible(ITRelatedPartViewsRepository.TimInformationEntity.Properties.information))
				basePart.setInformation((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ITRelatedPartViewsRepository.TimInformationEntity.Properties.information;
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
				if (ITRelatedPartViewsRepository.TimInformationEntity.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ITRelatedPartPackage.eINSTANCE.getTimInformationEntity_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ITRelatedPartPackage.eINSTANCE.getTimInformationEntity_Name().getEAttributeType(), newValue);
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
