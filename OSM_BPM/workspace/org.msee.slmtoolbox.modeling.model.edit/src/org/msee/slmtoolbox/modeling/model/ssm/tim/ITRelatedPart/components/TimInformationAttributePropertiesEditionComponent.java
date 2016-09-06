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
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationAttribute;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.ITRelatedPartViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationAttributePropertiesEditionPart;


// End of user code

/**
 * 
 * 
 */
public class TimInformationAttributePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for informationEntity EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings informationEntitySettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public TimInformationAttributePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject timInformationAttribute, String editing_mode) {
		super(editingContext, timInformationAttribute, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = ITRelatedPartViewsRepository.class;
		partKey = ITRelatedPartViewsRepository.TimInformationAttribute.class;
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
			final TimInformationAttribute timInformationAttribute = (TimInformationAttribute)elt;
			final TimInformationAttributePropertiesEditionPart basePart = (TimInformationAttributePropertiesEditionPart)editingPart;
			// init values
			if (timInformationAttribute.getName() != null && isAccessible(ITRelatedPartViewsRepository.TimInformationAttribute.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timInformationAttribute.getName()));
			
			if (timInformationAttribute.getType() != null && isAccessible(ITRelatedPartViewsRepository.TimInformationAttribute.Properties.type))
				basePart.setType(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, timInformationAttribute.getType()));
			
			if (isAccessible(ITRelatedPartViewsRepository.TimInformationAttribute.Properties.informationEntity)) {
				// init part
				informationEntitySettings = new EObjectFlatComboSettings(timInformationAttribute, ITRelatedPartPackage.eINSTANCE.getTimInformationAttribute_InformationEntity());
				basePart.initInformationEntity(informationEntitySettings);
				// set the button mode
				basePart.setInformationEntityButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			if (isAccessible(ITRelatedPartViewsRepository.TimInformationAttribute.Properties.informationEntity)) {
				basePart.addFilterToInformationEntity(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						List<TimInformationEntity> out = new ArrayList<TimInformationEntity>();
						if (null != timInformationAttribute.getInformationEntity() 
								&& null != timInformationAttribute.getInformationEntity().getInformation()) {
							TimModel model = timInformationAttribute.getInformationEntity().getInformation().getModel();
							for (TimInformationSet information : model.getInformations()) {
								out.addAll(information.getEntities());
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
				// Start of user code for additional businessfilters for informationEntity
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
		if (editorKey == ITRelatedPartViewsRepository.TimInformationAttribute.Properties.name) {
			return ITRelatedPartPackage.eINSTANCE.getTimInformationAttribute_Name();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimInformationAttribute.Properties.type) {
			return ITRelatedPartPackage.eINSTANCE.getTimInformationAttribute_Type();
		}
		if (editorKey == ITRelatedPartViewsRepository.TimInformationAttribute.Properties.informationEntity) {
			return ITRelatedPartPackage.eINSTANCE.getTimInformationAttribute_InformationEntity();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		TimInformationAttribute timInformationAttribute = (TimInformationAttribute)semanticObject;
		if (ITRelatedPartViewsRepository.TimInformationAttribute.Properties.name == event.getAffectedEditor()) {
			timInformationAttribute.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ITRelatedPartViewsRepository.TimInformationAttribute.Properties.type == event.getAffectedEditor()) {
			timInformationAttribute.setType((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (ITRelatedPartViewsRepository.TimInformationAttribute.Properties.informationEntity == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				informationEntitySettings.setToReference((TimInformationEntity)event.getNewValue());
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
				informationEntitySettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			TimInformationAttributePropertiesEditionPart basePart = (TimInformationAttributePropertiesEditionPart)editingPart;
			if (ITRelatedPartPackage.eINSTANCE.getTimInformationAttribute_Name().equals(msg.getFeature()) && basePart != null && isAccessible(ITRelatedPartViewsRepository.TimInformationAttribute.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (ITRelatedPartPackage.eINSTANCE.getTimInformationAttribute_Type().equals(msg.getFeature()) && basePart != null && isAccessible(ITRelatedPartViewsRepository.TimInformationAttribute.Properties.type)) {
				if (msg.getNewValue() != null) {
					basePart.setType(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setType("");
				}
			}
			if (ITRelatedPartPackage.eINSTANCE.getTimInformationAttribute_InformationEntity().equals(msg.getFeature()) && basePart != null && isAccessible(ITRelatedPartViewsRepository.TimInformationAttribute.Properties.informationEntity))
				basePart.setInformationEntity((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == ITRelatedPartViewsRepository.TimInformationAttribute.Properties.informationEntity;
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
				if (ITRelatedPartViewsRepository.TimInformationAttribute.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ITRelatedPartPackage.eINSTANCE.getTimInformationAttribute_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ITRelatedPartPackage.eINSTANCE.getTimInformationAttribute_Name().getEAttributeType(), newValue);
				}
				if (ITRelatedPartViewsRepository.TimInformationAttribute.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(ITRelatedPartPackage.eINSTANCE.getTimInformationAttribute_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(ITRelatedPartPackage.eINSTANCE.getTimInformationAttribute_Type().getEAttributeType(), newValue);
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
