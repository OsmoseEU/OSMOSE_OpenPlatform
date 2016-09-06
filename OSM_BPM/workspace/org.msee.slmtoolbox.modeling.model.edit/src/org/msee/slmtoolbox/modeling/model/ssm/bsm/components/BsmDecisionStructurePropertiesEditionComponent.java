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
import org.eclipse.emf.eef.runtime.impl.components.SinglePartPropertiesEditingComponent;
import org.eclipse.emf.eef.runtime.impl.filters.EObjectFilter;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.utils.EEFConverterUtil;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionStructurePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BsmDecisionStructurePropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for organizations ReferencesTable
	 */
	private ReferencesTableSettings organizationsSettings;
	
	/**
	 * Settings for ggGraiGrids ReferencesTable
	 */
	private ReferencesTableSettings ggGraiGridsSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BsmDecisionStructurePropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bsmDecisionStructure, String editing_mode) {
		super(editingContext, bsmDecisionStructure, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BsmViewsRepository.class;
		partKey = BsmViewsRepository.BsmDecisionStructure.class;
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
			final BsmDecisionStructure bsmDecisionStructure = (BsmDecisionStructure)elt;
			final BsmDecisionStructurePropertiesEditionPart basePart = (BsmDecisionStructurePropertiesEditionPart)editingPart;
			// init values
			if (bsmDecisionStructure.getName() != null && isAccessible(BsmViewsRepository.BsmDecisionStructure.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmDecisionStructure.getName()));
			
			if (isAccessible(BsmViewsRepository.BsmDecisionStructure.Properties.organizations)) {
				organizationsSettings = new ReferencesTableSettings(bsmDecisionStructure, BsmPackage.eINSTANCE.getBsmDecisionStructure_Organizations());
				basePart.initOrganizations(organizationsSettings);
			}
			
			if (isAccessible(BsmViewsRepository.BsmDecisionStructure.Properties.ggGraiGrids)) {
				ggGraiGridsSettings = new ReferencesTableSettings(bsmDecisionStructure, BsmPackage.eINSTANCE.getBsmDecisionStructure_GgGraiGrids());
				basePart.initGgGraiGrids(ggGraiGridsSettings);
			}
			// init filters
			
			if (isAccessible(BsmViewsRepository.BsmDecisionStructure.Properties.organizations)) {
				basePart.addFilterToOrganizations(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						Object[] out = new Object[bsmDecisionStructure.getBsmModel().getOrganizations().size()];
						out= bsmDecisionStructure.getBsmModel().getOrganizations().toArray();						
					
						return out;
						
					}
					// End of user code
					
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInOrganizationsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToOrganizations(new EObjectFilter(BsmPackage.Literals.BSM_ORGANIZATION));
				// Start of user code for additional businessfilters for organizations
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmDecisionStructure.Properties.ggGraiGrids)) {
				basePart.addFilterToGgGraiGrids(new ViewerFilter() {
					//Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
						List<GgGraiGrid> listSource = new ArrayList<GgGraiGrid>();
						List<EObject> listAvailableResource = new ArrayList<EObject>();
						if(null != bsmDecisionStructure) {
							listAvailableResource.addAll(bsmDecisionStructure.getBsmModel().getDecisionStructures());
							for (int i = 0; i < listAvailableResource.size();i++){{
								if(null != ((BsmDecisionStructure)listAvailableResource.get(i)).getGgGraiGrids())
							listSource.addAll(((BsmDecisionStructure)listAvailableResource.get(i)).getGgGraiGrids());
								}
							}
						}
						Object[] out = new Object[listSource.size()];
						out= listSource.toArray();												
						return out;					
					}
					// End of user code
				
					/**
					 * {@inheritDoc}
					 * 
					 * @see org.eclipse.jface.viewers.ViewerFilter#select(org.eclipse.jface.viewers.Viewer, java.lang.Object, java.lang.Object)
					 */
					public boolean select(Viewer viewer, Object parentElement, Object element) {
						if (element instanceof EObject)
							return (!basePart.isContainedInGgGraiGridsTable((EObject)element));
						return element instanceof Resource;
					}
				
				});
				basePart.addFilterToGgGraiGrids(new EObjectFilter(GeneralElementsPackage.Literals.GG_GRAI_GRID));
				// Start of user code for additional businessfilters for ggGraiGrids
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
		if (editorKey == BsmViewsRepository.BsmDecisionStructure.Properties.name) {
			return BsmPackage.eINSTANCE.getBsmDecisionStructure_Name();
		}
		if (editorKey == BsmViewsRepository.BsmDecisionStructure.Properties.organizations) {
			return BsmPackage.eINSTANCE.getBsmDecisionStructure_Organizations();
		}
		if (editorKey == BsmViewsRepository.BsmDecisionStructure.Properties.ggGraiGrids) {
			return BsmPackage.eINSTANCE.getBsmDecisionStructure_GgGraiGrids();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BsmDecisionStructure bsmDecisionStructure = (BsmDecisionStructure)semanticObject;
		if (BsmViewsRepository.BsmDecisionStructure.Properties.name == event.getAffectedEditor()) {
			// Start of user code for additional updateSemanticModel
			String name = (java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue());
			bsmDecisionStructure.setName(name);
			List<GgGraiGrid> graiGrids = bsmDecisionStructure.getGgGraiGrids();
			for (GgGraiGrid graiGrid : graiGrids){
				graiGrid.setName(name);
			}
			// End of user code
		}
		if (BsmViewsRepository.BsmDecisionStructure.Properties.organizations == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof BsmOrganization) {
					organizationsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				organizationsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				organizationsSettings.move(event.getNewIndex(), (BsmOrganization) event.getNewValue());
			}
		}
		if (BsmViewsRepository.BsmDecisionStructure.Properties.ggGraiGrids == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.ADD) {
				if (event.getNewValue() instanceof GgGraiGrid) {
					ggGraiGridsSettings.addToReference((EObject) event.getNewValue());
				}
			} else if (event.getKind() == PropertiesEditionEvent.REMOVE) {
				ggGraiGridsSettings.removeFromReference((EObject) event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.MOVE) {
				ggGraiGridsSettings.move(event.getNewIndex(), (GgGraiGrid) event.getNewValue());
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			BsmDecisionStructurePropertiesEditionPart basePart = (BsmDecisionStructurePropertiesEditionPart)editingPart;
			if (BsmPackage.eINSTANCE.getBsmDecisionStructure_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmDecisionStructure.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmDecisionStructure_Organizations().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmDecisionStructure.Properties.organizations))
				basePart.updateOrganizations();
			if (BsmPackage.eINSTANCE.getBsmDecisionStructure_GgGraiGrids().equals(msg.getFeature())  && isAccessible(BsmViewsRepository.BsmDecisionStructure.Properties.ggGraiGrids))
				basePart.updateGgGraiGrids();
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == BsmViewsRepository.BsmDecisionStructure.Properties.organizations;
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
				if (BsmViewsRepository.BsmDecisionStructure.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmDecisionStructure_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmDecisionStructure_Name().getEAttributeType(), newValue);
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
