/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.components;

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

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.parts.GgModelPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.parts.RootViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class GgModelPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	
	/**
	 * Default constructor
	 * 
	 */
	public GgModelPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject ggModel, String editing_mode) {
		super(editingContext, ggModel, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = RootViewsRepository.class;
		partKey = RootViewsRepository.GgModel.class;
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
			final GgModel ggModel = (GgModel)elt;
			final GgModelPropertiesEditionPart basePart = (GgModelPropertiesEditionPart)editingPart;
			// init values
			if (ggModel.getName() != null && isAccessible(RootViewsRepository.GgModel.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggModel.getName()));
			
			if (ggModel.getCode() != null && isAccessible(RootViewsRepository.GgModel.Properties.code))
				basePart.setCode(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggModel.getCode()));
			
			if (ggModel.getDescription() != null && isAccessible(RootViewsRepository.GgModel.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, ggModel.getDescription()));
			
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
		if (editorKey == RootViewsRepository.GgModel.Properties.name) {
			return GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name();
		}
		if (editorKey == RootViewsRepository.GgModel.Properties.code) {
			return GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code();
		}
		if (editorKey == RootViewsRepository.GgModel.Properties.description) {
			return GeneralElementsPackage.eINSTANCE.getGgBaseElement_Description();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		GgModel ggModel = (GgModel)semanticObject;
		if (RootViewsRepository.GgModel.Properties.name == event.getAffectedEditor()) {
			ggModel.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RootViewsRepository.GgModel.Properties.code == event.getAffectedEditor()) {
			ggModel.setCode((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (RootViewsRepository.GgModel.Properties.description == event.getAffectedEditor()) {
			ggModel.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			GgModelPropertiesEditionPart basePart = (GgModelPropertiesEditionPart)editingPart;
			if (GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name().equals(msg.getFeature()) && basePart != null && isAccessible(RootViewsRepository.GgModel.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code().equals(msg.getFeature()) && basePart != null && isAccessible(RootViewsRepository.GgModel.Properties.code)) {
				if (msg.getNewValue() != null) {
					basePart.setCode(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setCode("");
				}
			}
			if (GeneralElementsPackage.eINSTANCE.getGgBaseElement_Description().equals(msg.getFeature()) && basePart != null && isAccessible(RootViewsRepository.GgModel.Properties.description)) {
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
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#mustBeComposed(java.lang.Object, int)
	 */
	public boolean mustBeComposed(Object key, int kind) {
		return key == RootViewsRepository.GgModel.Properties.name || key == RootViewsRepository.GgModel.Properties.code || key == RootViewsRepository.GgModel.Properties.description || key == RootViewsRepository.GgModel.Properties.class;
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
				if (RootViewsRepository.GgModel.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Name().getEAttributeType(), newValue);
				}
				if (RootViewsRepository.GgModel.Properties.code == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(GeneralElementsPackage.eINSTANCE.getGgBaseElement_Code().getEAttributeType(), newValue);
				}
				if (RootViewsRepository.GgModel.Properties.description == event.getAffectedEditor()) {
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
