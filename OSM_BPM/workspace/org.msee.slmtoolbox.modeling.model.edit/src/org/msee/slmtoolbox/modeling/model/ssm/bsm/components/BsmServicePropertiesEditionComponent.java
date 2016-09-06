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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmCustomer;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPartner;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProduct;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmStakeholder;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmValue;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BsmServicePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for products ReferencesTable
	 */
	private ReferencesTableSettings productsSettings;
	
	/**
	 * Settings for functionalities ReferencesTable
	 */
	private ReferencesTableSettings functionalitiesSettings;
	
	/**
	 * Settings for resources ReferencesTable
	 */
	private ReferencesTableSettings resourcesSettings;
	
	/**
	 * Settings for processes ReferencesTable
	 */
	private ReferencesTableSettings processesSettings;
	
	/**
	 * Settings for customers ReferencesTable
	 */
	private ReferencesTableSettings customersSettings;
	
	/**
	 * Settings for values ReferencesTable
	 */
	private ReferencesTableSettings valuesSettings;
	
	/**
	 * Settings for stakeholders ReferencesTable
	 */
	private ReferencesTableSettings stakeholdersSettings;
	
	/**
	 * Settings for partners ReferencesTable
	 */
	private ReferencesTableSettings partnersSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BsmServicePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bsmService, String editing_mode) {
		super(editingContext, bsmService, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BsmViewsRepository.class;
		partKey = BsmViewsRepository.BsmService.class;
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
			final BsmService bsmService = (BsmService)elt;
			final BsmServicePropertiesEditionPart basePart = (BsmServicePropertiesEditionPart)editingPart;
			// init values
			if (bsmService.getName() != null && isAccessible(BsmViewsRepository.BsmService.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmService.getName()));
			
			if (bsmService.getDescription() != null && isAccessible(BsmViewsRepository.BsmService.Properties.description))
				basePart.setDescription(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmService.getDescription()));
			
			if (bsmService.getConstraint() != null && isAccessible(BsmViewsRepository.BsmService.Properties.constraint))
				basePart.setConstraint(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmService.getConstraint()));
			
			if (bsmService.getObjective() != null && isAccessible(BsmViewsRepository.BsmService.Properties.objective))
				basePart.setObjective(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmService.getObjective()));
			
			if (bsmService.getDomain() != null && isAccessible(BsmViewsRepository.BsmService.Properties.domain))
				basePart.setDomain(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmService.getDomain()));
			
			if (bsmService.getNature() != null && isAccessible(BsmViewsRepository.BsmService.Properties.nature))
				basePart.setNature(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmService.getNature()));
			
			if (isAccessible(BsmViewsRepository.BsmService.Properties.products)) {
				productsSettings = new ReferencesTableSettings(bsmService, BsmPackage.eINSTANCE.getBsmService_Products());
				basePart.initProducts(productsSettings);
			}
			if (isAccessible(BsmViewsRepository.BsmService.Properties.functionalities)) {
				functionalitiesSettings = new ReferencesTableSettings(bsmService, BsmPackage.eINSTANCE.getBsmService_Functionalities());
				basePart.initFunctionalities(functionalitiesSettings);
			}
			if (isAccessible(BsmViewsRepository.BsmService.Properties.resources)) {
				resourcesSettings = new ReferencesTableSettings(bsmService, BsmPackage.eINSTANCE.getBsmService_Resources());
				basePart.initResources(resourcesSettings);
			}
			if (isAccessible(BsmViewsRepository.BsmService.Properties.processes)) {
				processesSettings = new ReferencesTableSettings(bsmService, BsmPackage.eINSTANCE.getBsmService_Processes());
				basePart.initProcesses(processesSettings);
			}
			if (isAccessible(BsmViewsRepository.BsmService.Properties.customers)) {
				customersSettings = new ReferencesTableSettings(bsmService, BsmPackage.eINSTANCE.getBsmService_Customers());
				basePart.initCustomers(customersSettings);
			}
			if (isAccessible(BsmViewsRepository.BsmService.Properties.values)) {
				valuesSettings = new ReferencesTableSettings(bsmService, BsmPackage.eINSTANCE.getBsmService_Values());
				basePart.initValues(valuesSettings);
			}
			if (isAccessible(BsmViewsRepository.BsmService.Properties.stakeholders)) {
				stakeholdersSettings = new ReferencesTableSettings(bsmService, BsmPackage.eINSTANCE.getBsmService_Stakeholders());
				basePart.initStakeholders(stakeholdersSettings);
			}
			if (isAccessible(BsmViewsRepository.BsmService.Properties.partners)) {
				partnersSettings = new ReferencesTableSettings(bsmService, BsmPackage.eINSTANCE.getBsmService_Partners());
				basePart.initPartners(partnersSettings);
			}
			// init filters
			
			
			
			
			
			
			if (isAccessible(BsmViewsRepository.BsmService.Properties.products)) {
				basePart.addFilterToProducts(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInProductsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToProducts(new EObjectFilter(BsmPackage.Literals.BSM_PRODUCT));
				// Start of user code for additional businessfilters for products
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmService.Properties.functionalities)) {
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
			if (isAccessible(BsmViewsRepository.BsmService.Properties.resources)) {
				basePart.addFilterToResources(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInResourcesTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToResources(new EObjectFilter(BsmPackage.Literals.BSM_RESOURCE));
				// Start of user code for additional businessfilters for resources
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmService.Properties.processes)) {
				basePart.addFilterToProcesses(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInProcessesTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToProcesses(new EObjectFilter(BsmPackage.Literals.BSM_PROCESS));
				// Start of user code for additional businessfilters for processes
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmService.Properties.customers)) {
				basePart.addFilterToCustomers(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInCustomersTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToCustomers(new EObjectFilter(BsmPackage.Literals.BSM_CUSTOMER));
				// Start of user code for additional businessfilters for customers
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmService.Properties.values)) {
				basePart.addFilterToValues(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInValuesTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToValues(new EObjectFilter(BsmPackage.Literals.BSM_VALUE));
				// Start of user code for additional businessfilters for values
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmService.Properties.stakeholders)) {
				basePart.addFilterToStakeholders(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInStakeholdersTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToStakeholders(new EObjectFilter(BsmPackage.Literals.BSM_STAKEHOLDER));
				// Start of user code for additional businessfilters for stakeholders
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmService.Properties.partners)) {
				basePart.addFilterToPartners(new ViewerFilter() {
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInPartnersTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToPartners(new EObjectFilter(BsmPackage.Literals.BSM_PARTNER));
				// Start of user code for additional businessfilters for partners
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
		if (editorKey == BsmViewsRepository.BsmService.Properties.name) {
			return BsmPackage.eINSTANCE.getBsmService_Name();
		}
		if (editorKey == BsmViewsRepository.BsmService.Properties.description) {
			return BsmPackage.eINSTANCE.getBsmService_Description();
		}
		if (editorKey == BsmViewsRepository.BsmService.Properties.constraint) {
			return BsmPackage.eINSTANCE.getBsmService_Constraint();
		}
		if (editorKey == BsmViewsRepository.BsmService.Properties.objective) {
			return BsmPackage.eINSTANCE.getBsmService_Objective();
		}
		if (editorKey == BsmViewsRepository.BsmService.Properties.domain) {
			return BsmPackage.eINSTANCE.getBsmService_Domain();
		}
		if (editorKey == BsmViewsRepository.BsmService.Properties.nature) {
			return BsmPackage.eINSTANCE.getBsmService_Nature();
		}
		if (editorKey == BsmViewsRepository.BsmService.Properties.products) {
			return BsmPackage.eINSTANCE.getBsmService_Products();
		}
		if (editorKey == BsmViewsRepository.BsmService.Properties.functionalities) {
			return BsmPackage.eINSTANCE.getBsmService_Functionalities();
		}
		if (editorKey == BsmViewsRepository.BsmService.Properties.resources) {
			return BsmPackage.eINSTANCE.getBsmService_Resources();
		}
		if (editorKey == BsmViewsRepository.BsmService.Properties.processes) {
			return BsmPackage.eINSTANCE.getBsmService_Processes();
		}
		if (editorKey == BsmViewsRepository.BsmService.Properties.customers) {
			return BsmPackage.eINSTANCE.getBsmService_Customers();
		}
		if (editorKey == BsmViewsRepository.BsmService.Properties.values) {
			return BsmPackage.eINSTANCE.getBsmService_Values();
		}
		if (editorKey == BsmViewsRepository.BsmService.Properties.stakeholders) {
			return BsmPackage.eINSTANCE.getBsmService_Stakeholders();
		}
		if (editorKey == BsmViewsRepository.BsmService.Properties.partners) {
			return BsmPackage.eINSTANCE.getBsmService_Partners();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BsmService bsmService = (BsmService)semanticObject;
		if (BsmViewsRepository.BsmService.Properties.name == event.getAffectedEditor()) {
			bsmService.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmService.Properties.description == event.getAffectedEditor()) {
			bsmService.setDescription((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmService.Properties.constraint == event.getAffectedEditor()) {
			bsmService.setConstraint((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmService.Properties.objective == event.getAffectedEditor()) {
			bsmService.setObjective((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmService.Properties.domain == event.getAffectedEditor()) {
			bsmService.setDomain((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmService.Properties.nature == event.getAffectedEditor()) {
			bsmService.setNature((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmService.Properties.products == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmProduct) {
					productsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				productsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				productsSettings.move(event.getNewIndex(), (BsmProduct) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmService.Properties.functionalities == event.getAffectedEditor()) {
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
		if (BsmViewsRepository.BsmService.Properties.resources == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmResource) {
					resourcesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				resourcesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				resourcesSettings.move(event.getNewIndex(), (BsmResource) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmService.Properties.processes == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmProcess) {
					processesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				processesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				processesSettings.move(event.getNewIndex(), (BsmProcess) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmService.Properties.customers == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmCustomer) {
					customersSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				customersSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				customersSettings.move(event.getNewIndex(), (BsmCustomer) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmService.Properties.values == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmValue) {
					valuesSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				valuesSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				valuesSettings.move(event.getNewIndex(), (BsmValue) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmService.Properties.stakeholders == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmStakeholder) {
					stakeholdersSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				stakeholdersSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				stakeholdersSettings.move(event.getNewIndex(), (BsmStakeholder) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmService.Properties.partners == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmPartner) {
					partnersSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				partnersSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				partnersSettings.move(event.getNewIndex(), (BsmPartner) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			BsmServicePropertiesEditionPart basePart = (BsmServicePropertiesEditionPart)editingPart;
			if (BsmPackage.eINSTANCE.getBsmService_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmService.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmService_Description().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmService.Properties.description)) {
				if (msg.getNewValue() != null) {
					basePart.setDescription(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDescription("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmService_Constraint().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmService.Properties.constraint)) {
				if (msg.getNewValue() != null) {
					basePart.setConstraint(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setConstraint("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmService_Objective().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmService.Properties.objective)) {
				if (msg.getNewValue() != null) {
					basePart.setObjective(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setObjective("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmService_Domain().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmService.Properties.domain)) {
				if (msg.getNewValue() != null) {
					basePart.setDomain(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setDomain("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmService_Nature().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmService.Properties.nature)) {
				if (msg.getNewValue() != null) {
					basePart.setNature(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setNature("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmService_Products().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmService.Properties.products))
				basePart.updateProducts();
			if (BsmPackage.eINSTANCE.getBsmService_Functionalities().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmService.Properties.functionalities))
				basePart.updateFunctionalities();
			if (BsmPackage.eINSTANCE.getBsmService_Resources().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmService.Properties.resources))
				basePart.updateResources();
			if (BsmPackage.eINSTANCE.getBsmService_Processes().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmService.Properties.processes))
				basePart.updateProcesses();
			if (BsmPackage.eINSTANCE.getBsmService_Customers().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmService.Properties.customers))
				basePart.updateCustomers();
			if (BsmPackage.eINSTANCE.getBsmService_Values().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmService.Properties.values))
				basePart.updateValues();
			if (BsmPackage.eINSTANCE.getBsmService_Stakeholders().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmService.Properties.stakeholders))
				basePart.updateStakeholders();
			if (BsmPackage.eINSTANCE.getBsmService_Partners().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmService.Properties.partners))
				basePart.updatePartners();
			
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
				if (BsmViewsRepository.BsmService.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmService_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmService_Name().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmService.Properties.description == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmService_Description().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmService_Description().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmService.Properties.constraint == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmService_Constraint().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmService_Constraint().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmService.Properties.objective == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmService_Objective().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmService_Objective().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmService.Properties.domain == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmService_Domain().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmService_Domain().getEAttributeType(), newValue);
				}
				if (BsmViewsRepository.BsmService.Properties.nature == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmService_Nature().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmService_Nature().getEAttributeType(), newValue);
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
