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
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartFactory;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationRelationship;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.ITRelatedPartViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class TimInformationRelationshipPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for sourceEntity EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings sourceEntitySettings;
	
	/**
	 * Settings for targetEntity EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings targetEntitySettings;
	
	/**
	 * Settings for information EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings informationSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TimInformationRelationshipPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject timInformationRelationship, String editing_mode) {
		super(editingContext, timInformationRelationship, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ITRelatedPartViewsRepository.class;
		partKey = ITRelatedPartViewsRepository.TimInformationRelationship.class;
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
			final TimInformationRelationship timInformationRelationship = (TimInformationRelationship)elt;
			final TimInformationRelationshipPropertiesEditionPart basePart = (TimInformationRelationshipPropertiesEditionPart)editingPart;
			// init values
			if (timInformationRelationship.getName() != null && isAccessible(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timInformationRelationship.getName()));
			
			if (timInformationRelationship.getType() != null && isAccessible(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.type))
				basePart.setType(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timInformationRelationship.getType()));
			
			if (isAccessible(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.sourceEntity)) {
				// init part
				sourceEntitySettings = new EObjectFlatComboSettings(timInformationRelationship, ITRelatedPartPackage.eINSTANCE.getTimInformationRelationship_SourceEntity());
				basePart.initSourceEntity(sourceEntitySettings);
				// set the button mode
				basePart.setSourceEntityButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.targetEntity)) {
				// init part
				targetEntitySettings = new EObjectFlatComboSettings(timInformationRelationship, ITRelatedPartPackage.eINSTANCE.getTimInformationRelationship_TargetEntity());
				basePart.initTargetEntity(targetEntitySettings);
				// set the button mode
				basePart.setTargetEntityButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.information)) {
				// init part
				informationSettings = new EObjectFlatComboSettings(timInformationRelationship, ITRelatedPartPackage.eINSTANCE.getTimInformationRelationship_Information());
				basePart.initInformation(informationSettings);
				// set the button mode
				basePart.setInformationButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			if (isAccessible(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.sourceEntity)) {
				basePart.addFilterToSourceEntity(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						List<TimInformationEntity> out = new ArrayList<TimInformationEntity>();
						if (null != timInformationRelationship.getInformation() 
								&& null != timInformationRelationship.getInformation().getModel()) {
							TimModel model = timInformationRelationship.getInformation().getModel();
							for(TimInformationSet informationSet : model.getInformations()) {
								out.addAll(informationSet.getEntities());
							}
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
						return (element instanceof TimInformationEntity);
					}
					
				});
				// Start of user code for additional businessfilters for sourceEntity
				// End of user code
			}
			if (isAccessible(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.targetEntity)) {
				basePart.addFilterToTargetEntity(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						List<TimInformationEntity> out = new ArrayList<TimInformationEntity>();
						if (null != timInformationRelationship.getInformation() 
								&& null != timInformationRelationship.getInformation().getModel()) {
							TimModel model = timInformationRelationship.getInformation().getModel();
							for(TimInformationSet informationSet : model.getInformations()) {
								out.addAll(informationSet.getEntities());
							}
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
						return (element instanceof TimInformationEntity);
					}
					
				});
				// Start of user code for additional businessfilters for targetEntity
				// End of user code
			}
			if (isAccessible(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.information)) {
				basePart.addFilterToInformation(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						List<TimInformationSet> out = new ArrayList<TimInformationSet>();
						if (null != timInformationRelationship.getInformation() 
								&& null != timInformationRelationship.getInformation().getModel()) {
								out.addAll(timInformationRelationship.getInformation().getModel().getInformations());
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
		if (editorKey == ITRelatedPartViewsRepository.TimInformationRelationship.Properties.name) {
			return ITRelatedPartPackage.eINSTANCE.getTimInformationRelationship_Name();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimInformationRelationship.Properties.type) {
			return ITRelatedPartPackage.eINSTANCE.getTimInformationRelationship_Type();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimInformationRelationship.Properties.sourceEntity) {
			return ITRelatedPartPackage.eINSTANCE.getTimInformationRelationship_SourceEntity();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimInformationRelationship.Properties.targetEntity) {
			return ITRelatedPartPackage.eINSTANCE.getTimInformationRelationship_TargetEntity();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimInformationRelationship.Properties.information) {
			return ITRelatedPartPackage.eINSTANCE.getTimInformationRelationship_Information();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TimInformationRelationship timInformationRelationship = (TimInformationRelationship)semanticObject;
		if (ITRelatedPartViewsRepository.TimInformationRelationship.Properties.name == event.getAffectedEditor()) {
			timInformationRelationship.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ITRelatedPartViewsRepository.TimInformationRelationship.Properties.type == event.getAffectedEditor()) {
			timInformationRelationship.setType((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ITRelatedPartViewsRepository.TimInformationRelationship.Properties.sourceEntity == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				sourceEntitySettings.setToReference((TimInformationEntity)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				TimInformationEntity eObject = ITRelatedPartFactory.eINSTANCE.createTimInformationEntity();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				sourceEntitySettings.setToReference(eObject);
			}
		}
		if (ITRelatedPartViewsRepository.TimInformationRelationship.Properties.targetEntity == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				targetEntitySettings.setToReference((TimInformationEntity)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				TimInformationEntity eObject = ITRelatedPartFactory.eINSTANCE.createTimInformationEntity();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				targetEntitySettings.setToReference(eObject);
			}
		}
		if (ITRelatedPartViewsRepository.TimInformationRelationship.Properties.information == event.getAffectedEditor()) {
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
			TimInformationRelationshipPropertiesEditionPart basePart = (TimInformationRelationshipPropertiesEditionPart)editingPart;
			if (ITRelatedPartPackage.eINSTANCE.getTimInformationRelationship_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ITRelatedPartPackage.eINSTANCE.getTimInformationRelationship_Type().equals(msg.getFeature()) && basePart != null && isAccessible(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.type)) {
				if (msg.getNewValue() != null) {
					basePart.setType(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setType("");
				}
			}
			if (ITRelatedPartPackage.eINSTANCE.getTimInformationRelationship_SourceEntity().equals(msg.getFeature()) && basePart != null && isAccessible(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.sourceEntity))
				basePart.setSourceEntity((EObject)msg.getNewValue());
			if (ITRelatedPartPackage.eINSTANCE.getTimInformationRelationship_TargetEntity().equals(msg.getFeature()) && basePart != null && isAccessible(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.targetEntity))
				basePart.setTargetEntity((EObject)msg.getNewValue());
			if (ITRelatedPartPackage.eINSTANCE.getTimInformationRelationship_Information().equals(msg.getFeature()) && basePart != null && isAccessible(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.information))
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
		return key == ITRelatedPartViewsRepository.TimInformationRelationship.Properties.sourceEntity || key == ITRelatedPartViewsRepository.TimInformationRelationship.Properties.targetEntity || key == ITRelatedPartViewsRepository.TimInformationRelationship.Properties.information;
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
				if (ITRelatedPartViewsRepository.TimInformationRelationship.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ITRelatedPartPackage.eINSTANCE.getTimInformationRelationship_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ITRelatedPartPackage.eINSTANCE.getTimInformationRelationship_Name().getEAttributeType(), newValue);
				}
				if (ITRelatedPartViewsRepository.TimInformationRelationship.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ITRelatedPartPackage.eINSTANCE.getTimInformationRelationship_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ITRelatedPartPackage.eINSTANCE.getTimInformationRelationship_Type().getEAttributeType(), newValue);
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
