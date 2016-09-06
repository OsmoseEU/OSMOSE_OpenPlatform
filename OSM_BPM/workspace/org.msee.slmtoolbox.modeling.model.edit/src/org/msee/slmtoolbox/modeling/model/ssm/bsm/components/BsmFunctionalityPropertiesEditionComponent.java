/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.components;

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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFactory;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BsmFunctionalityPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for product EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings productSettings;
	
	/**
	 * Settings for subFunctions ReferencesTable
	 */
	private ReferencesTableSettings subFunctionsSettings;
	
	/**
	 * Settings for mainFunction EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings mainFunctionSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BsmFunctionalityPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bsmFunctionality, String editing_mode) {
		super(editingContext, bsmFunctionality, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BsmViewsRepository.class;
		partKey = BsmViewsRepository.BsmFunctionality.class;
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
			final BsmFunctionality bsmFunctionality = (BsmFunctionality)elt;
			final BsmFunctionalityPropertiesEditionPart basePart = (BsmFunctionalityPropertiesEditionPart)editingPart;
			// init values
			if (bsmFunctionality.getName() != null && isAccessible(BsmViewsRepository.BsmFunctionality.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmFunctionality.getName()));
			
			if (bsmFunctionality.getType() != null && isAccessible(BsmViewsRepository.BsmFunctionality.Properties.type))
				basePart.setType(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmFunctionality.getType()));
			
			if (bsmFunctionality.getDescription() != null && isAccessible(BsmViewsRepository.BsmFunctionality.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmFunctionality.getDescription()));
			
			if (isAccessible(BsmViewsRepository.BsmFunctionality.Properties.product)) {
				// init part
				productSettings = new EObjectFlatComboSettings(bsmFunctionality, BsmPackage.eINSTANCE.getBsmFunctionality_Product());
				basePart.initProduct(productSettings);
				// set the button mode
				basePart.setProductButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(BsmViewsRepository.BsmFunctionality.Properties.subFunctions)) {
				subFunctionsSettings = new ReferencesTableSettings(bsmFunctionality, BsmPackage.eINSTANCE.getBsmFunctionality_SubFunctions());
				basePart.initSubFunctions(subFunctionsSettings);
			}
			if (isAccessible(BsmViewsRepository.BsmFunctionality.Properties.mainFunction)) {
				// init part
				mainFunctionSettings = new EObjectFlatComboSettings(bsmFunctionality, BsmPackage.eINSTANCE.getBsmFunctionality_MainFunction());
				basePart.initMainFunction(mainFunctionSettings);
				// set the button mode
				basePart.setMainFunctionButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			
			
			if (isAccessible(BsmViewsRepository.BsmFunctionality.Properties.product)) {
				basePart.addFilterToProduct(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
						
						List<BsmProduct> out = new ArrayList<BsmProduct>();
						if(null != bsmFunctionality.getBsmModel()
								&& null != bsmFunctionality.getBsmModel().getProducts()) {
							out.addAll(bsmFunctionality.getBsmModel().getProducts());
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
						return (element instanceof String && element.equals("")) || (element instanceof BsmProduct); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for product
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmFunctionality.Properties.subFunctions)) {
				basePart.addFilterToSubFunctions(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInSubFunctionsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToSubFunctions(new EObjectFilter(BsmPackage.Literals.BSM_FUNCTIONALITY));
				// Start of user code for additional businessfilters for subFunctions
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmFunctionality.Properties.mainFunction)) {
				basePart.addFilterToMainFunction(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						List<BsmFunctionality> out = new ArrayList<BsmFunctionality>();
						if (null != bsmFunctionality.getBsmModel() 
								&& null != bsmFunctionality.getBsmModel().getFunctionalities()) {
							out.addAll(bsmFunctionality.getBsmModel().getFunctionalities());
							out.remove(bsmFunctionality);
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
						return (element instanceof String && element.equals("")) || (element instanceof BsmFunctionality); //$NON-NLS-1$ 
					}
					
				});
				// Start of user code for additional businessfilters for mainFunction
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
		if (editorKey == BsmViewsRepository.BsmFunctionality.Properties.name) {
			return BsmPackage.eINSTANCE.getBsmFunctionality_Name();
		}
		if (editorKey == BsmViewsRepository.BsmFunctionality.Properties.type) {
			return BsmPackage.eINSTANCE.getBsmFunctionality_Type();
		}
		if (editorKey == BsmViewsRepository.BsmFunctionality.Properties.description) {
			return BsmPackage.eINSTANCE.getBsmFunctionality_Description();
		}
		if (editorKey == BsmViewsRepository.BsmFunctionality.Properties.product) {
			return BsmPackage.eINSTANCE.getBsmFunctionality_Product();
		}
		if (editorKey == BsmViewsRepository.BsmFunctionality.Properties.subFunctions) {
			return BsmPackage.eINSTANCE.getBsmFunctionality_SubFunctions();
		}
		if (editorKey == BsmViewsRepository.BsmFunctionality.Properties.mainFunction) {
			return BsmPackage.eINSTANCE.getBsmFunctionality_MainFunction();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BsmFunctionality bsmFunctionality = (BsmFunctionality)semanticObject;
		if (BsmViewsRepository.BsmFunctionality.Properties.name == event.getAffectedEditor()) {
			bsmFunctionality.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmFunctionality.Properties.type == event.getAffectedEditor()) {
			bsmFunctionality.setType((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmFunctionality.Properties.description == event.getAffectedEditor()) {
			bsmFunctionality.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmFunctionality.Properties.product == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				productSettings.setToReference((BsmProduct)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				BsmProduct eObject = BsmFactory.eINSTANCE.createBsmProduct();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				productSettings.setToReference(eObject);
			}
		}
		if (BsmViewsRepository.BsmFunctionality.Properties.subFunctions == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmFunctionality) {
					subFunctionsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				subFunctionsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				subFunctionsSettings.move(event.getNewIndex(), (BsmFunctionality) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmFunctionality.Properties.mainFunction == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				mainFunctionSettings.setToReference((BsmFunctionality)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				BsmFunctionality eObject = BsmFactory.eINSTANCE.createBsmFunctionality();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				mainFunctionSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			BsmFunctionalityPropertiesEditionPart basePart = (BsmFunctionalityPropertiesEditionPart)editingPart;
			if (BsmPackage.eINSTANCE.getBsmFunctionality_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmFunctionality.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmFunctionality_Type().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmFunctionality.Properties.type)) {
				if (msg.getNewValue() != null) {
					basePart.setType(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setType("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmFunctionality_Description().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmFunctionality.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmFunctionality_Product().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmFunctionality.Properties.product))
				basePart.setProduct((EObject)msg.getNewValue());
			if (BsmPackage.eINSTANCE.getBsmFunctionality_SubFunctions().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmFunctionality.Properties.subFunctions))
				basePart.updateSubFunctions();
			if (BsmPackage.eINSTANCE.getBsmFunctionality_MainFunction().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmFunctionality.Properties.mainFunction))
				basePart.setMainFunction((EObject)msg.getNewValue());
			
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
				if (BsmViewsRepository.BsmFunctionality.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmFunctionality_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmFunctionality_Name().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmFunctionality.Properties.type == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmFunctionality_Type().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmFunctionality_Type().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmFunctionality.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmFunctionality_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmFunctionality_Description().getEAttributeType(), newValue);
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
