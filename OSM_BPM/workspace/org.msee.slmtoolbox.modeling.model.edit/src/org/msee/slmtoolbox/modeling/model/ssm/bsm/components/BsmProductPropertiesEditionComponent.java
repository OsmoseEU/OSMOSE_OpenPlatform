/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.components;

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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProductPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BsmProductPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for functionalities ReferencesTable
	 */
	private ReferencesTableSettings functionalitiesSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BsmProductPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bsmProduct, String editing_mode) {
		super(editingContext, bsmProduct, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BsmViewsRepository.class;
		partKey = BsmViewsRepository.BsmProduct.class;
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
			final BsmProduct bsmProduct = (BsmProduct)elt;
			final BsmProductPropertiesEditionPart basePart = (BsmProductPropertiesEditionPart)editingPart;
			// init values
			if (bsmProduct.getName() != null && isAccessible(BsmViewsRepository.BsmProduct.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmProduct.getName()));
			
			if (bsmProduct.getType() != null && isAccessible(BsmViewsRepository.BsmProduct.Properties.type))
				basePart.setType(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmProduct.getType()));
			
			if (bsmProduct.getFunction() != null && isAccessible(BsmViewsRepository.BsmProduct.Properties.function))
				basePart.setFunction(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmProduct.getFunction()));
			
			if (bsmProduct.getTechCharacteristics() != null && isAccessible(BsmViewsRepository.BsmProduct.Properties.techCharacteristics))
				basePart.setTechCharacteristics(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmProduct.getTechCharacteristics()));
			
			if (isAccessible(BsmViewsRepository.BsmProduct.Properties.functionalities)) {
				functionalitiesSettings = new ReferencesTableSettings(bsmProduct, BsmPackage.eINSTANCE.getBsmProduct_Functionalities());
				basePart.initFunctionalities(functionalitiesSettings);
			}
			// init filters
			
			
			
			
			if (isAccessible(BsmViewsRepository.BsmProduct.Properties.functionalities)) {
				basePart.addFilterToFunctionalities(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInFunctionalitiesTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToFunctionalities(new EObjectFilter(BsmPackage.Literals.BSM_FUNCTIONALITY));
				// Start of user code for additional businessfilters for functionalities
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
		if (editorKey == BsmViewsRepository.BsmProduct.Properties.name) {
			return BsmPackage.eINSTANCE.getBsmProduct_Name();
		}
		if (editorKey == BsmViewsRepository.BsmProduct.Properties.type) {
			return BsmPackage.eINSTANCE.getBsmProduct_Type();
		}
		if (editorKey == BsmViewsRepository.BsmProduct.Properties.function) {
			return BsmPackage.eINSTANCE.getBsmProduct_Function();
		}
		if (editorKey == BsmViewsRepository.BsmProduct.Properties.techCharacteristics) {
			return BsmPackage.eINSTANCE.getBsmProduct_TechCharacteristics();
		}
		if (editorKey == BsmViewsRepository.BsmProduct.Properties.functionalities) {
			return BsmPackage.eINSTANCE.getBsmProduct_Functionalities();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BsmProduct bsmProduct = (BsmProduct)semanticObject;
		if (BsmViewsRepository.BsmProduct.Properties.name == event.getAffectedEditor()) {
			bsmProduct.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmProduct.Properties.type == event.getAffectedEditor()) {
			bsmProduct.setType((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmProduct.Properties.function == event.getAffectedEditor()) {
			bsmProduct.setFunction((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmProduct.Properties.techCharacteristics == event.getAffectedEditor()) {
			bsmProduct.setTechCharacteristics((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmProduct.Properties.functionalities == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmFunctionality) {
					functionalitiesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				functionalitiesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				functionalitiesSettings.move(event.getNewIndex(), (BsmFunctionality) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			BsmProductPropertiesEditionPart basePart = (BsmProductPropertiesEditionPart)editingPart;
			if (BsmPackage.eINSTANCE.getBsmProduct_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmProduct.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmProduct_Type().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmProduct.Properties.type)) {
				if (msg.getNewValue() != null) {
					basePart.setType(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setType("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmProduct_Function().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmProduct.Properties.function)) {
				if (msg.getNewValue() != null) {
					basePart.setFunction(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setFunction("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmProduct_TechCharacteristics().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmProduct.Properties.techCharacteristics)) {
				if (msg.getNewValue() != null) {
					basePart.setTechCharacteristics(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setTechCharacteristics("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmProduct_Functionalities().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmProduct.Properties.functionalities))
				basePart.updateFunctionalities();
			
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
				if (BsmViewsRepository.BsmProduct.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmProduct_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmProduct_Name().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmProduct.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmProduct_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmProduct_Type().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmProduct.Properties.function == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmProduct_Function().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmProduct_Function().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmProduct.Properties.techCharacteristics == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmProduct_TechCharacteristics().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmProduct_TechCharacteristics().getEAttributeType(), newValue);
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
