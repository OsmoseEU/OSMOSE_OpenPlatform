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

import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFactory;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPiField;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPiFieldPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BsmPiFieldPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for performanceIndicators EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings performanceIndicatorsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BsmPiFieldPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bsmPiField, String editing_mode) {
		super(editingContext, bsmPiField, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BsmViewsRepository.class;
		partKey = BsmViewsRepository.BsmPiField.class;
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
			final BsmPiField bsmPiField = (BsmPiField)elt;
			final BsmPiFieldPropertiesEditionPart basePart = (BsmPiFieldPropertiesEditionPart)editingPart;
			// init values
			if (bsmPiField.getName() != null && isAccessible(BsmViewsRepository.BsmPiField.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmPiField.getName()));
			
			if (isAccessible(BsmViewsRepository.BsmPiField.Properties.performanceIndicators)) {
				// init part
				performanceIndicatorsSettings = new EObjectFlatComboSettings(bsmPiField, BsmPackage.eINSTANCE.getBsmPiField_PerformanceIndicators());
				basePart.initPerformanceIndicators(performanceIndicatorsSettings);
				// set the button mode
				basePart.setPerformanceIndicatorsButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			if (isAccessible(BsmViewsRepository.BsmPiField.Properties.performanceIndicators)) {
				basePart.addFilterToPerformanceIndicators(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						return (element instanceof BsmPerformanceIndicator);
					}
					
				});
				// Start of user code for additional businessfilters for performanceIndicators
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
		if (editorKey == BsmViewsRepository.BsmPiField.Properties.name) {
			return BsmPackage.eINSTANCE.getBsmPiField_Name();
		}
		if (editorKey == BsmViewsRepository.BsmPiField.Properties.performanceIndicators) {
			return BsmPackage.eINSTANCE.getBsmPiField_PerformanceIndicators();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BsmPiField bsmPiField = (BsmPiField)semanticObject;
		if (BsmViewsRepository.BsmPiField.Properties.name == event.getAffectedEditor()) {
			bsmPiField.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmPiField.Properties.performanceIndicators == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				performanceIndicatorsSettings.setToReference((BsmPerformanceIndicator)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				BsmPerformanceIndicator eObject = BsmFactory.eINSTANCE.createBsmPerformanceIndicator();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				performanceIndicatorsSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			BsmPiFieldPropertiesEditionPart basePart = (BsmPiFieldPropertiesEditionPart)editingPart;
			if (BsmPackage.eINSTANCE.getBsmPiField_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPiField.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmPiField_PerformanceIndicators().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmPiField.Properties.performanceIndicators))
				basePart.setPerformanceIndicators((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == BsmViewsRepository.BsmPiField.Properties.performanceIndicators;
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
				if (BsmViewsRepository.BsmPiField.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmPiField_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmPiField_Name().getEAttributeType(), newValue);
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
