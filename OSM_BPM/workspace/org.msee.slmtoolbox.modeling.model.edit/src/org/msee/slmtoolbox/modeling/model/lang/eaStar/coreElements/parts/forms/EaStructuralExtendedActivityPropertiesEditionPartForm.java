/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.providers.EMFListContentProvider;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;


import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.providers.CoreElementsMessages;

// End of user code

/**
 * 
 * 
 */
public class EaStructuralExtendedActivityPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, EaStructuralExtendedActivityPropertiesEditionPart {

	protected Text name;
	protected Text code;
	protected Text description;
	protected Text organization;
	protected ReferencesTable inFlows;
	protected List<ViewerFilter> inFlowsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> inFlowsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable outFlows;
	protected List<ViewerFilter> outFlowsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outFlowsFilters = new ArrayList<ViewerFilter>();
	protected Text mission;
	protected Text functionalRules;
	protected Text minCost;
	protected Text maxCost;
	protected Text averageCost;
	protected Text minTimeDelay;
	protected Text maxTimeDelay;
	protected Text averageTimeDelay;
	protected Button isStarting;
	protected Button isEnding;
	protected Text decompositionCode;
	protected EMFComboViewer osmoseWorld;
	protected Text isA;



	/**
	 * For {@link ISection} use only.
	 */
	public EaStructuralExtendedActivityPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EaStructuralExtendedActivityPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence eaStructuralExtendedActivityStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = eaStructuralExtendedActivityStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.class);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.name);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.code);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.osmoseWorld);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.decompositionCode);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.description);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.organization);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.inFlows);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.outFlows);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.mission);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.functionalRules);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minCost);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxCost);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageCost);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minTimeDelay);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxTimeDelay);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageTimeDelay);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isStarting);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isEnding);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isA);
		
		
		composer = new PartComposer(eaStructuralExtendedActivityStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.code) {
					return createCodeText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.organization) {
					return createOrganizationText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.inFlows) {
					return createInFlowsReferencesTable(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.outFlows) {
					return createOutFlowsReferencesTable(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.mission) {
					return createMissionText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.functionalRules) {
					return createFunctionalRulesText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minCost) {
					return createMinCostText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxCost) {
					return createMaxCostText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageCost) {
					return createAverageCostText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minTimeDelay) {
					return createMinTimeDelayText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxTimeDelay) {
					return createMaxTimeDelayText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageTimeDelay) {
					return createAverageTimeDelayText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isStarting) {
					return createIsStartingCheckbox(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isEnding) {
					return createIsEndingCheckbox(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.decompositionCode) {
					return createDecompositionCodeText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.osmoseWorld) {
					return createOsmoseWorldEMFComboViewer(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isA) {
					return createIsAText(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.name, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaStructuralExtendedActivityPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.name, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCodeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.code, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_CodeLabel);
		code = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		code.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData codeData = new GridData(GridData.FILL_HORIZONTAL);
		code.setLayoutData(codeData);
		code.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaStructuralExtendedActivityPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.code,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.code,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, code.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		code.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.code, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
				}
			}
		});
		EditingUtils.setID(code, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.code);
		EditingUtils.setEEFtype(code, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.code, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.description, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_DescriptionLabel);
		description = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		description.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaStructuralExtendedActivityPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.description,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, description.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		description.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.description, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createOrganizationText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.organization, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_OrganizationLabel);
		organization = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		organization.setEnabled(false);
		organization.setToolTipText(CoreElementsMessages.EaStructuralExtendedActivity_ReadOnly);
		organization.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData organizationData = new GridData(GridData.FILL_HORIZONTAL);
		organization.setLayoutData(organizationData);
		organization.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaStructuralExtendedActivityPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.organization,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, organization.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.organization,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, organization.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		organization.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.organization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, organization.getText()));
				}
			}
		});
		EditingUtils.setID(organization, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.organization);
		EditingUtils.setEEFtype(organization, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.organization, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createInFlowsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.inFlows = new ReferencesTable(getDescription(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.inFlows, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_InFlowsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addInFlows(); }
			public void handleEdit(EObject element) { editInFlows(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveInFlows(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromInFlows(element); }
			public void navigateTo(EObject element) { }
		});
		this.inFlows.setHelpText(propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.inFlows, CoreElementsViewsRepository.FORM_KIND));
		this.inFlows.createControls(parent, widgetFactory);
		this.inFlows.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.inFlows, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		inFlows.setEnabled(false);
		inFlows.setToolTipText(CoreElementsMessages.EaStructuralExtendedActivity_ReadOnly);
		GridData inFlowsData = new GridData(GridData.FILL_HORIZONTAL);
		inFlowsData.horizontalSpan = 3;
		this.inFlows.setLayoutData(inFlowsData);
		this.inFlows.disableMove();
		inFlows.setID(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.inFlows);
		inFlows.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addInFlows() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(inFlows.getInput(), inFlowsFilters, inFlowsBusinessFilters,
		"inFlows", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.inFlows,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				inFlows.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveInFlows(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.inFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		inFlows.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInFlows(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.inFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		inFlows.refresh();
	}

	/**
	 * 
	 */
	protected void editInFlows(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				inFlows.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOutFlowsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.outFlows = new ReferencesTable(getDescription(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.outFlows, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_OutFlowsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addOutFlows(); }
			public void handleEdit(EObject element) { editOutFlows(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutFlows(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutFlows(element); }
			public void navigateTo(EObject element) { }
		});
		this.outFlows.setHelpText(propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.outFlows, CoreElementsViewsRepository.FORM_KIND));
		this.outFlows.createControls(parent, widgetFactory);
		this.outFlows.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.outFlows, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		outFlows.setEnabled(false);
		outFlows.setToolTipText(CoreElementsMessages.EaStructuralExtendedActivity_ReadOnly);
		GridData outFlowsData = new GridData(GridData.FILL_HORIZONTAL);
		outFlowsData.horizontalSpan = 3;
		this.outFlows.setLayoutData(outFlowsData);
		this.outFlows.disableMove();
		outFlows.setID(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.outFlows);
		outFlows.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutFlows() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outFlows.getInput(), outFlowsFilters, outFlowsBusinessFilters,
		"outFlows", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.outFlows,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outFlows.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutFlows(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.outFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outFlows.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutFlows(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.outFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outFlows.refresh();
	}

	/**
	 * 
	 */
	protected void editOutFlows(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outFlows.refresh();
			}
		}
	}

	
	protected Composite createMissionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.mission, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_MissionLabel);
		mission = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		mission.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData missionData = new GridData(GridData.FILL_HORIZONTAL);
		mission.setLayoutData(missionData);
		mission.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaStructuralExtendedActivityPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.mission,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mission.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.mission,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, mission.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		mission.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.mission, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mission.getText()));
				}
			}
		});
		EditingUtils.setID(mission, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.mission);
		EditingUtils.setEEFtype(mission, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.mission, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createFunctionalRulesText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.functionalRules, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_FunctionalRulesLabel);
		functionalRules = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		functionalRules.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData functionalRulesData = new GridData(GridData.FILL_HORIZONTAL);
		functionalRules.setLayoutData(functionalRulesData);
		functionalRules.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaStructuralExtendedActivityPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.functionalRules,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, functionalRules.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.functionalRules,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, functionalRules.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		functionalRules.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.functionalRules, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, functionalRules.getText()));
				}
			}
		});
		EditingUtils.setID(functionalRules, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.functionalRules);
		EditingUtils.setEEFtype(functionalRules, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.functionalRules, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMinCostText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minCost, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_MinCostLabel);
		minCost = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		minCost.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData minCostData = new GridData(GridData.FILL_HORIZONTAL);
		minCost.setLayoutData(minCostData);
		minCost.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaStructuralExtendedActivityPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minCost,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minCost.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minCost,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, minCost.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		minCost.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minCost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minCost.getText()));
				}
			}
		});
		EditingUtils.setID(minCost, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minCost);
		EditingUtils.setEEFtype(minCost, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minCost, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMaxCostText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxCost, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_MaxCostLabel);
		maxCost = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		maxCost.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData maxCostData = new GridData(GridData.FILL_HORIZONTAL);
		maxCost.setLayoutData(maxCostData);
		maxCost.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaStructuralExtendedActivityPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxCost,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxCost.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxCost,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, maxCost.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		maxCost.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxCost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxCost.getText()));
				}
			}
		});
		EditingUtils.setID(maxCost, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxCost);
		EditingUtils.setEEFtype(maxCost, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxCost, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAverageCostText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageCost, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_AverageCostLabel);
		averageCost = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		averageCost.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData averageCostData = new GridData(GridData.FILL_HORIZONTAL);
		averageCost.setLayoutData(averageCostData);
		averageCost.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaStructuralExtendedActivityPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageCost,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, averageCost.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageCost,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, averageCost.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		averageCost.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageCost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, averageCost.getText()));
				}
			}
		});
		EditingUtils.setID(averageCost, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageCost);
		EditingUtils.setEEFtype(averageCost, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageCost, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMinTimeDelayText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minTimeDelay, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_MinTimeDelayLabel);
		minTimeDelay = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		minTimeDelay.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData minTimeDelayData = new GridData(GridData.FILL_HORIZONTAL);
		minTimeDelay.setLayoutData(minTimeDelayData);
		minTimeDelay.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaStructuralExtendedActivityPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minTimeDelay,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minTimeDelay.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minTimeDelay,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, minTimeDelay.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		minTimeDelay.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minTimeDelay, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minTimeDelay.getText()));
				}
			}
		});
		EditingUtils.setID(minTimeDelay, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minTimeDelay);
		EditingUtils.setEEFtype(minTimeDelay, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.minTimeDelay, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMaxTimeDelayText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxTimeDelay, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_MaxTimeDelayLabel);
		maxTimeDelay = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		maxTimeDelay.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData maxTimeDelayData = new GridData(GridData.FILL_HORIZONTAL);
		maxTimeDelay.setLayoutData(maxTimeDelayData);
		maxTimeDelay.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaStructuralExtendedActivityPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxTimeDelay,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxTimeDelay.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxTimeDelay,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, maxTimeDelay.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		maxTimeDelay.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxTimeDelay, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxTimeDelay.getText()));
				}
			}
		});
		EditingUtils.setID(maxTimeDelay, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxTimeDelay);
		EditingUtils.setEEFtype(maxTimeDelay, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.maxTimeDelay, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAverageTimeDelayText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageTimeDelay, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_AverageTimeDelayLabel);
		averageTimeDelay = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		averageTimeDelay.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData averageTimeDelayData = new GridData(GridData.FILL_HORIZONTAL);
		averageTimeDelay.setLayoutData(averageTimeDelayData);
		averageTimeDelay.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaStructuralExtendedActivityPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageTimeDelay,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, averageTimeDelay.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageTimeDelay,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, averageTimeDelay.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		averageTimeDelay.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageTimeDelay, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, averageTimeDelay.getText()));
				}
			}
		});
		EditingUtils.setID(averageTimeDelay, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageTimeDelay);
		EditingUtils.setEEFtype(averageTimeDelay, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.averageTimeDelay, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsStartingCheckbox(FormToolkit widgetFactory, Composite parent) {
		isStarting = widgetFactory.createButton(parent, getDescription(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isStarting, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_IsStartingLabel), SWT.CHECK);
		isStarting.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isStarting, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isStarting.getSelection())));
			}

		});
		GridData isStartingData = new GridData(GridData.FILL_HORIZONTAL);
		isStartingData.horizontalSpan = 2;
		isStarting.setLayoutData(isStartingData);
		EditingUtils.setID(isStarting, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isStarting);
		EditingUtils.setEEFtype(isStarting, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isStarting, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsEndingCheckbox(FormToolkit widgetFactory, Composite parent) {
		isEnding = widgetFactory.createButton(parent, getDescription(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isEnding, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_IsEndingLabel), SWT.CHECK);
		isEnding.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isEnding, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isEnding.getSelection())));
			}

		});
		GridData isEndingData = new GridData(GridData.FILL_HORIZONTAL);
		isEndingData.horizontalSpan = 2;
		isEnding.setLayoutData(isEndingData);
		EditingUtils.setID(isEnding, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isEnding);
		EditingUtils.setEEFtype(isEnding, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isEnding, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createDecompositionCodeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.decompositionCode, CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_DecompositionCodeLabel);
		decompositionCode = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		decompositionCode.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData decompositionCodeData = new GridData(GridData.FILL_HORIZONTAL);
		decompositionCode.setLayoutData(decompositionCodeData);
		decompositionCode.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaStructuralExtendedActivityPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.decompositionCode,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, decompositionCode.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.decompositionCode,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, decompositionCode.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		decompositionCode.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.decompositionCode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, decompositionCode.getText()));
				}
			}
		});
		EditingUtils.setID(decompositionCode, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.decompositionCode);
		EditingUtils.setEEFtype(decompositionCode, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.decompositionCode, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}
	
	protected Composite createOsmoseWorldEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.osmoseWorld, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_OsmoseWorldLabel);
		osmoseWorld = new EMFComboViewer(parent);
		GridData osmoseWorldData = new GridData(GridData.FILL_HORIZONTAL);
		osmoseWorld.getCombo().setLayoutData(osmoseWorldData);
		osmoseWorld.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		osmoseWorld.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.osmoseWorld, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOsmoseWorld()));
			}

		});
		osmoseWorld.setContentProvider(new EMFListContentProvider());
		EditingUtils.setID(osmoseWorld.getCombo(), CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.osmoseWorld);
		EditingUtils.setEEFtype(osmoseWorld.getCombo(), "eef::Combo");
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.osmoseWorld, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}
	
	protected Composite createIsAText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isA, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_IsALabel);
		isA = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		isA.setEnabled(false);
		isA.setToolTipText(CoreElementsMessages.EaStructuralExtendedActivity_ReadOnly);
		isA.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData isAData = new GridData(GridData.FILL_HORIZONTAL);
		isA.setLayoutData(isAData);
		isA.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaStructuralExtendedActivityPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isA,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, isA.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isA,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, isA.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaStructuralExtendedActivityPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		isA.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaStructuralExtendedActivityPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isA, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, isA.getText()));
				}
			}
		});
		EditingUtils.setID(isA, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isA);
		EditingUtils.setEEFtype(isA, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.isA, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#getCode()
	 * 
	 */
	public String getCode() {
		return code.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#setCode(String newValue)
	 * 
	 */
	public void setCode(String newValue) {
		if (newValue != null) {
			code.setText(newValue);
		} else {
			code.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#setDescription(String newValue)
	 * 
	 */
	public void setDescription(String newValue) {
		if (newValue != null) {
			description.setText(newValue);
		} else {
			description.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#getOrganization()
	 * 
	 */
	public String getOrganization() {
		return organization.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#setOrganization(EObject newValue)
	 * 
	 */
	public void setOrganization(String newValue) {
		if (newValue != null) {
			organization.setText(newValue);
		} else {
			organization.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#initInFlows(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInFlows(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inFlows.setContentProvider(contentProvider);
		inFlows.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#updateInFlows()
	 * 
	 */
	public void updateInFlows() {
	inFlows.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#addFilterInFlows(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInFlows(ViewerFilter filter) {
		inFlowsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#addBusinessFilterInFlows(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInFlows(ViewerFilter filter) {
		inFlowsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#isContainedInInFlowsTable(EObject element)
	 * 
	 */
	public boolean isContainedInInFlowsTable(EObject element) {
		return ((ReferencesTableSettings)inFlows.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#initOutFlows(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutFlows(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outFlows.setContentProvider(contentProvider);
		outFlows.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#updateOutFlows()
	 * 
	 */
	public void updateOutFlows() {
	outFlows.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#addFilterOutFlows(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutFlows(ViewerFilter filter) {
		outFlowsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#addBusinessFilterOutFlows(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutFlows(ViewerFilter filter) {
		outFlowsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#isContainedInOutFlowsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutFlowsTable(EObject element) {
		return ((ReferencesTableSettings)outFlows.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#getMission()
	 * 
	 */
	public String getMission() {
		return mission.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#setMission(String newValue)
	 * 
	 */
	public void setMission(String newValue) {
		if (newValue != null) {
			mission.setText(newValue);
		} else {
			mission.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#getFunctionalRules()
	 * 
	 */
	public String getFunctionalRules() {
		return functionalRules.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#setFunctionalRules(String newValue)
	 * 
	 */
	public void setFunctionalRules(String newValue) {
		if (newValue != null) {
			functionalRules.setText(newValue);
		} else {
			functionalRules.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#getMinCost()
	 * 
	 */
	public String getMinCost() {
		return minCost.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#setMinCost(String newValue)
	 * 
	 */
	public void setMinCost(String newValue) {
		if (newValue != null) {
			minCost.setText(newValue);
		} else {
			minCost.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#getMaxCost()
	 * 
	 */
	public String getMaxCost() {
		return maxCost.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#setMaxCost(String newValue)
	 * 
	 */
	public void setMaxCost(String newValue) {
		if (newValue != null) {
			maxCost.setText(newValue);
		} else {
			maxCost.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#getAverageCost()
	 * 
	 */
	public String getAverageCost() {
		return averageCost.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#setAverageCost(String newValue)
	 * 
	 */
	public void setAverageCost(String newValue) {
		if (newValue != null) {
			averageCost.setText(newValue);
		} else {
			averageCost.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#getMinTimeDelay()
	 * 
	 */
	public String getMinTimeDelay() {
		return minTimeDelay.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#setMinTimeDelay(String newValue)
	 * 
	 */
	public void setMinTimeDelay(String newValue) {
		if (newValue != null) {
			minTimeDelay.setText(newValue);
		} else {
			minTimeDelay.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#getMaxTimeDelay()
	 * 
	 */
	public String getMaxTimeDelay() {
		return maxTimeDelay.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#setMaxTimeDelay(String newValue)
	 * 
	 */
	public void setMaxTimeDelay(String newValue) {
		if (newValue != null) {
			maxTimeDelay.setText(newValue);
		} else {
			maxTimeDelay.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#getAverageTimeDelay()
	 * 
	 */
	public String getAverageTimeDelay() {
		return averageTimeDelay.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#setAverageTimeDelay(String newValue)
	 * 
	 */
	public void setAverageTimeDelay(String newValue) {
		if (newValue != null) {
			averageTimeDelay.setText(newValue);
		} else {
			averageTimeDelay.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#getIsStarting()
	 * 
	 */
	public Boolean getIsStarting() {
		return Boolean.valueOf(isStarting.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#setIsStarting(Boolean newValue)
	 * 
	 */
	public void setIsStarting(Boolean newValue) {
		if (newValue != null) {
			isStarting.setSelection(newValue.booleanValue());
		} else {
			isStarting.setSelection(false);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#getIsEnding()
	 * 
	 */
	public Boolean getIsEnding() {
		return Boolean.valueOf(isEnding.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#setIsEnding(Boolean newValue)
	 * 
	 */
	public void setIsEnding(Boolean newValue) {
		if (newValue != null) {
			isEnding.setSelection(newValue.booleanValue());
		} else {
			isEnding.setSelection(false);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#getDecompositionCode()
	 * 
	 */
	public String getDecompositionCode() {
		return decompositionCode.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#setDecompositionCode(String newValue)
	 * 
	 */
	public void setDecompositionCode(String newValue) {
		if (newValue != null) {
			decompositionCode.setText(newValue);
		} else {
			decompositionCode.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#getOsmoseWorld()
	 * 
	 */
	public Object getOsmoseWorld() {
		if (osmoseWorld.getSelection() instanceof StructuredSelection) {
			return ((StructuredSelection) osmoseWorld.getSelection()).getFirstElement();
		}
		return "";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#initOsmoseWorld(Object input, Object currentValue)
	 */
	public void initOsmoseWorld(Object input, Object currentValue) {
		osmoseWorld.setInput(input);
		if (currentValue != null) {
			osmoseWorld.setSelection(new StructuredSelection(currentValue));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#setOsmoseWorld(Object newValue)
	 * 
	 */
	public void setOsmoseWorld(Object newValue) {
		if (newValue != null) {
			osmoseWorld.modelUpdating(new StructuredSelection(newValue));
		} else {
			osmoseWorld.modelUpdating(new StructuredSelection("")); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#addFilterOsmoseWorld(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOsmoseWorld(ViewerFilter filter) {
		osmoseWorld.addFilter(filter);
	}
	
	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#getIsA()
	 * 
	 */
	public String getIsA() {
		return isA.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#setIsA(String newValue)
	 * 
	 */
	public void setIsA(String newValue) {
		if (newValue != null) {
			isA.setText(newValue);
		} else {
			isA.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CoreElementsMessages.EaStructuralExtendedActivity_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
