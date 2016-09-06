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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFactory;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVirtualEnterprise;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmVEParticipationPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;


// End of user code

/**
 * 
 * 
 */
public class BsmVEParticipationPropertiesEditionComponent extends SinglePartPropertiesEditingComponent {

	
	public static String BASE_PART = "Base"; //$NON-NLS-1$

	
	/**
	 * Settings for enterprise EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings enterpriseSettings;
	
	/**
	 * Settings for virtualEnterprise EObjectFlatComboViewer
	 */
	private EObjectFlatComboSettings virtualEnterpriseSettings;
	
	
	/**
	 * Default constructor
	 * 
	 */
	public BsmVEParticipationPropertiesEditionComponent(PropertiesEditingContext editingContext, EObject bsmVEParticipation, String editing_mode) {
		super(editingContext, bsmVEParticipation, editing_mode);
		parts = new String[] { BASE_PART };
		repositoryKey = BsmViewsRepository.class;
		partKey = BsmViewsRepository.BsmVEParticipation.class;
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
			final BsmVEParticipation bsmVEParticipation = (BsmVEParticipation)elt;
			final BsmVEParticipationPropertiesEditionPart basePart = (BsmVEParticipationPropertiesEditionPart)editingPart;
			// init values
			if (bsmVEParticipation.getName() != null && isAccessible(BsmViewsRepository.BsmVEParticipation.Properties.name))
				basePart.setName(EEFConverterUtil.convertToString(EcorePackage.Literals.ESTRING, bsmVEParticipation.getName()));
			
			if (isAccessible(BsmViewsRepository.BsmVEParticipation.Properties.enterprise)) {
				// init part
				enterpriseSettings = new EObjectFlatComboSettings(bsmVEParticipation, BsmPackage.eINSTANCE.getBsmVEParticipation_Enterprise());
				basePart.initEnterprise(enterpriseSettings);
				// set the button mode
				basePart.setEnterpriseButtonMode(ButtonsModeEnum.BROWSE);
			}
			if (isAccessible(BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise)) {
				// init part
				virtualEnterpriseSettings = new EObjectFlatComboSettings(bsmVEParticipation, BsmPackage.eINSTANCE.getBsmVEParticipation_VirtualEnterprise());
				basePart.initVirtualEnterprise(virtualEnterpriseSettings);
				// set the button mode
				basePart.setVirtualEnterpriseButtonMode(ButtonsModeEnum.BROWSE);
			}
			// init filters
			
			if (isAccessible(BsmViewsRepository.BsmVEParticipation.Properties.enterprise)) {
				basePart.addFilterToEnterprise(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						List<BsmOrganization> out = new ArrayList<>();
						BsmModel model = bsmVEParticipation.getVirtualEnterprise().getBsmModel();
						if (null !=  model
								&& null != model.getOrganizations()) {
							for (BsmOrganization organization : model.getOrganizations()) {
								if (organization instanceof BsmEnterprise) {
									out.add(organization);
								}
							}
							out.remove(bsmVEParticipation.getVirtualEnterprise());
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
						return (element instanceof BsmEnterprise);
					}
					
				});
				// Start of user code for additional businessfilters for enterprise
				// End of user code
			}
			if (isAccessible(BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise)) {
				basePart.addFilterToVirtualEnterprise(new ViewerFilter() {
					// Start of user code
					@Override
					public Object[] filter(Viewer viewer, Object parent,
							Object[] elements) {
					
						List<BsmOrganization> out = new ArrayList<>();
						BsmModel model = bsmVEParticipation.getVirtualEnterprise().getBsmModel();
						if (null !=  model
								&& null != model.getOrganizations()) {
							for (BsmOrganization organization : model.getOrganizations()) {
								if (organization instanceof BsmVirtualEnterprise) {
									out.add(organization);
								}
							}
							out.remove(bsmVEParticipation.getVirtualEnterprise());
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
						return (element instanceof BsmVirtualEnterprise);
					}
					
				});
				// Start of user code for additional businessfilters for virtualEnterprise
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
		if (editorKey == BsmViewsRepository.BsmVEParticipation.Properties.name) {
			return BsmPackage.eINSTANCE.getBsmVEParticipation_Name();
		}
		if (editorKey == BsmViewsRepository.BsmVEParticipation.Properties.enterprise) {
			return BsmPackage.eINSTANCE.getBsmVEParticipation_Enterprise();
		}
		if (editorKey == BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise) {
			return BsmPackage.eINSTANCE.getBsmVEParticipation_VirtualEnterprise();
		}
		return super.associatedFeature(editorKey);
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updateSemanticModel(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void updateSemanticModel(final IPropertiesEditionEvent event) {
		BsmVEParticipation bsmVEParticipation = (BsmVEParticipation)semanticObject;
		if (BsmViewsRepository.BsmVEParticipation.Properties.name == event.getAffectedEditor()) {
			bsmVEParticipation.setName((java.lang.String)EEFConverterUtil.createFromString(EcorePackage.Literals.ESTRING, (String)event.getNewValue()));
		}
		if (BsmViewsRepository.BsmVEParticipation.Properties.enterprise == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				enterpriseSettings.setToReference((BsmEnterprise)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				BsmEnterprise eObject = BsmFactory.eINSTANCE.createBsmEnterprise();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				enterpriseSettings.setToReference(eObject);
			}
		}
		if (BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise == event.getAffectedEditor()) {
			if (event.getKind() == PropertiesEditionEvent.SET) {
				virtualEnterpriseSettings.setToReference((BsmVirtualEnterprise)event.getNewValue());
			} else if (event.getKind() == PropertiesEditionEvent.ADD) {
				BsmVirtualEnterprise eObject = BsmFactory.eINSTANCE.createBsmVirtualEnterprise();
				EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(editingContext, this, eObject, editingContext.getAdapterFactory());
				PropertiesEditingProvider provider = (PropertiesEditingProvider)editingContext.getAdapterFactory().adapt(eObject, PropertiesEditingProvider.class);
				if (provider != null) {
					PropertiesEditingPolicy policy = provider.getPolicy(context);
					if (policy != null) {
						policy.execute();
					}
				}
				virtualEnterpriseSettings.setToReference(eObject);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#updatePart(org.eclipse.emf.common.notify.Notification)
	 */
	public void updatePart(Notification msg) {
		if (editingPart.isVisible()) {
			BsmVEParticipationPropertiesEditionPart basePart = (BsmVEParticipationPropertiesEditionPart)editingPart;
			if (BsmPackage.eINSTANCE.getBsmVEParticipation_Name().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmVEParticipation.Properties.name)) {
				if (msg.getNewValue() != null) {
					basePart.setName(EcoreUtil.convertToString(EcorePackage.Literals.ESTRING, msg.getNewValue()));
				} else {
					basePart.setName("");
				}
			}
			if (BsmPackage.eINSTANCE.getBsmVEParticipation_Enterprise().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmVEParticipation.Properties.enterprise))
				basePart.setEnterprise((EObject)msg.getNewValue());
			if (BsmPackage.eINSTANCE.getBsmVEParticipation_VirtualEnterprise().equals(msg.getFeature()) && basePart != null && isAccessible(BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise))
				basePart.setVirtualEnterprise((EObject)msg.getNewValue());
			
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.impl.components.StandardPropertiesEditionComponent#isRequired(java.lang.Object, int)
	 * 
	 */
	public boolean isRequired(Object key, int kind) {
		return key == BsmViewsRepository.BsmVEParticipation.Properties.enterprise || key == BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise;
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
				if (BsmViewsRepository.BsmVEParticipation.Properties.name == event.getAffectedEditor()) {
					Object newValue = event.getNewValue();
					if (newValue instanceof String) {
						newValue = EEFConverterUtil.createFromString(BsmPackage.eINSTANCE.getBsmVEParticipation_Name().getEAttributeType(), (String)newValue);
					}
					ret = Diagnostician.INSTANCE.validate(BsmPackage.eINSTANCE.getBsmVEParticipation_Name().getEAttributeType(), newValue);
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
