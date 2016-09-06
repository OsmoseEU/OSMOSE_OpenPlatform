/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
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
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimService;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.CommonConceptsViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.providers.CommonConceptsMessages;
import org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs.TimAddProcessToServiceDialog;
import org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs.TimAddResourceToServiceDialog;
import org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs.TimAddServiceToServiceDialog;

// End of user code

/**
 * 
 * 
 */
public class TimServicePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TimServicePropertiesEditionPart {

	protected Text name;
	protected Text description;
	protected Text objective;
	protected Text constraint;
	protected Text access;
	protected Text consumption;
	protected Text automationLevel;
	protected Text domain;
	protected Text nature;
	protected ReferencesTable subServices;
	protected List<ViewerFilter> subServicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> subServicesFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer mainService;
	protected ReferencesTable processes;
	protected List<ViewerFilter> processesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> processesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable resources;
	protected List<ViewerFilter> resourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resourcesFilters = new ArrayList<ViewerFilter>();
	protected Text model;



	/**
	 * For {@link ISection} use only.
	 */
	public TimServicePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TimServicePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence timServiceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = timServiceStep.addStep(CommonConceptsViewsRepository.TimService.Properties.class);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimService.Properties.name);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimService.Properties.description);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimService.Properties.objective);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimService.Properties.constraint);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimService.Properties.access);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimService.Properties.consumption);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimService.Properties.automationLevel);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimService.Properties.domain);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimService.Properties.nature);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimService.Properties.subServices);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimService.Properties.mainService);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimService.Properties.processes);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimService.Properties.resources);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimService.Properties.model);
		
		
		composer = new PartComposer(timServiceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CommonConceptsViewsRepository.TimService.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimService.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimService.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimService.Properties.objective) {
					return createObjectiveText(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimService.Properties.constraint) {
					return createConstraintText(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimService.Properties.access) {
					return createAccessText(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimService.Properties.consumption) {
					return createConsumptionText(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimService.Properties.automationLevel) {
					return createAutomationLevelText(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimService.Properties.domain) {
					return createDomainText(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimService.Properties.nature) {
					return createNatureText(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimService.Properties.subServices) {
					return createSubServicesReferencesTable(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimService.Properties.mainService) {
					return createMainServiceFlatComboViewer(parent, widgetFactory);
				}
				if (key == CommonConceptsViewsRepository.TimService.Properties.processes) {
					return createProcessesReferencesTable(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimService.Properties.resources) {
					return createResourcesReferencesTable(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimService.Properties.model) {
					return createModelText(widgetFactory, parent);
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
		propertiesSection.setText(CommonConceptsMessages.TimServicePropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, CommonConceptsViewsRepository.TimService.Properties.name, CommonConceptsMessages.TimServicePropertiesEditionPart_NameLabel);
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
							TimServicePropertiesEditionPartForm.this,
							CommonConceptsViewsRepository.TimService.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimServicePropertiesEditionPartForm.this,
									CommonConceptsViewsRepository.TimService.Properties.name,
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
									TimServicePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, CommonConceptsViewsRepository.TimService.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimService.Properties.name, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimService.Properties.description, CommonConceptsMessages.TimServicePropertiesEditionPart_DescriptionLabel);
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
							TimServicePropertiesEditionPartForm.this,
							CommonConceptsViewsRepository.TimService.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimServicePropertiesEditionPartForm.this,
									CommonConceptsViewsRepository.TimService.Properties.description,
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
									TimServicePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, CommonConceptsViewsRepository.TimService.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimService.Properties.description, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createObjectiveText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimService.Properties.objective, CommonConceptsMessages.TimServicePropertiesEditionPart_ObjectiveLabel);
		objective = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		objective.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData objectiveData = new GridData(GridData.FILL_HORIZONTAL);
		objective.setLayoutData(objectiveData);
		objective.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimServicePropertiesEditionPartForm.this,
							CommonConceptsViewsRepository.TimService.Properties.objective,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, objective.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimServicePropertiesEditionPartForm.this,
									CommonConceptsViewsRepository.TimService.Properties.objective,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, objective.getText()));
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
									TimServicePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		objective.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.objective, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, objective.getText()));
				}
			}
		});
		EditingUtils.setID(objective, CommonConceptsViewsRepository.TimService.Properties.objective);
		EditingUtils.setEEFtype(objective, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimService.Properties.objective, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConstraintText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimService.Properties.constraint, CommonConceptsMessages.TimServicePropertiesEditionPart_ConstraintLabel);
		constraint = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		constraint.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData constraintData = new GridData(GridData.FILL_HORIZONTAL);
		constraint.setLayoutData(constraintData);
		constraint.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimServicePropertiesEditionPartForm.this,
							CommonConceptsViewsRepository.TimService.Properties.constraint,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimServicePropertiesEditionPartForm.this,
									CommonConceptsViewsRepository.TimService.Properties.constraint,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, constraint.getText()));
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
									TimServicePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		constraint.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
				}
			}
		});
		EditingUtils.setID(constraint, CommonConceptsViewsRepository.TimService.Properties.constraint);
		EditingUtils.setEEFtype(constraint, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimService.Properties.constraint, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAccessText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimService.Properties.access, CommonConceptsMessages.TimServicePropertiesEditionPart_AccessLabel);
		access = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		access.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData accessData = new GridData(GridData.FILL_HORIZONTAL);
		access.setLayoutData(accessData);
		access.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimServicePropertiesEditionPartForm.this,
							CommonConceptsViewsRepository.TimService.Properties.access,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, access.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimServicePropertiesEditionPartForm.this,
									CommonConceptsViewsRepository.TimService.Properties.access,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, access.getText()));
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
									TimServicePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		access.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.access, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, access.getText()));
				}
			}
		});
		EditingUtils.setID(access, CommonConceptsViewsRepository.TimService.Properties.access);
		EditingUtils.setEEFtype(access, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimService.Properties.access, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConsumptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimService.Properties.consumption, CommonConceptsMessages.TimServicePropertiesEditionPart_ConsumptionLabel);
		consumption = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		consumption.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData consumptionData = new GridData(GridData.FILL_HORIZONTAL);
		consumption.setLayoutData(consumptionData);
		consumption.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimServicePropertiesEditionPartForm.this,
							CommonConceptsViewsRepository.TimService.Properties.consumption,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, consumption.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimServicePropertiesEditionPartForm.this,
									CommonConceptsViewsRepository.TimService.Properties.consumption,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, consumption.getText()));
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
									TimServicePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		consumption.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.consumption, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, consumption.getText()));
				}
			}
		});
		EditingUtils.setID(consumption, CommonConceptsViewsRepository.TimService.Properties.consumption);
		EditingUtils.setEEFtype(consumption, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimService.Properties.consumption, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAutomationLevelText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimService.Properties.automationLevel, CommonConceptsMessages.TimServicePropertiesEditionPart_AutomationLevelLabel);
		automationLevel = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		automationLevel.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData automationLevelData = new GridData(GridData.FILL_HORIZONTAL);
		automationLevel.setLayoutData(automationLevelData);
		automationLevel.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimServicePropertiesEditionPartForm.this,
							CommonConceptsViewsRepository.TimService.Properties.automationLevel,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, automationLevel.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimServicePropertiesEditionPartForm.this,
									CommonConceptsViewsRepository.TimService.Properties.automationLevel,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, automationLevel.getText()));
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
									TimServicePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		automationLevel.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.automationLevel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, automationLevel.getText()));
				}
			}
		});
		EditingUtils.setID(automationLevel, CommonConceptsViewsRepository.TimService.Properties.automationLevel);
		EditingUtils.setEEFtype(automationLevel, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimService.Properties.automationLevel, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDomainText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimService.Properties.domain, CommonConceptsMessages.TimServicePropertiesEditionPart_DomainLabel);
		domain = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		domain.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData domainData = new GridData(GridData.FILL_HORIZONTAL);
		domain.setLayoutData(domainData);
		domain.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimServicePropertiesEditionPartForm.this,
							CommonConceptsViewsRepository.TimService.Properties.domain,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, domain.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimServicePropertiesEditionPartForm.this,
									CommonConceptsViewsRepository.TimService.Properties.domain,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, domain.getText()));
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
									TimServicePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		domain.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.domain, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, domain.getText()));
				}
			}
		});
		EditingUtils.setID(domain, CommonConceptsViewsRepository.TimService.Properties.domain);
		EditingUtils.setEEFtype(domain, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimService.Properties.domain, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNatureText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimService.Properties.nature, CommonConceptsMessages.TimServicePropertiesEditionPart_NatureLabel);
		nature = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		nature.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData natureData = new GridData(GridData.FILL_HORIZONTAL);
		nature.setLayoutData(natureData);
		nature.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimServicePropertiesEditionPartForm.this,
							CommonConceptsViewsRepository.TimService.Properties.nature,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nature.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimServicePropertiesEditionPartForm.this,
									CommonConceptsViewsRepository.TimService.Properties.nature,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, nature.getText()));
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
									TimServicePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		nature.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.nature, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nature.getText()));
				}
			}
		});
		EditingUtils.setID(nature, CommonConceptsViewsRepository.TimService.Properties.nature);
		EditingUtils.setEEFtype(nature, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimService.Properties.nature, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSubServicesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.subServices = new ReferencesTable(getDescription(CommonConceptsViewsRepository.TimService.Properties.subServices, CommonConceptsMessages.TimServicePropertiesEditionPart_SubServicesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addSubServices(); }
			public void handleEdit(EObject element) { editSubServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSubServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSubServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.subServices.setHelpText(propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimService.Properties.subServices, CommonConceptsViewsRepository.FORM_KIND));
		this.subServices.createControls(parent, widgetFactory);
		this.subServices.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.subServices, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData subServicesData = new GridData(GridData.FILL_HORIZONTAL);
		subServicesData.horizontalSpan = 3;
		this.subServices.setLayoutData(subServicesData);
		this.subServices.disableMove();
		subServices.setID(CommonConceptsViewsRepository.TimService.Properties.subServices);
		subServices.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSubServices() {
		// Start of user code
		TimAddServiceToServiceDialog dialog = new TimAddServiceToServiceDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), subServices.getLabelProvider(), (TimService) ((ReferencesTableSettings)this.subServices.getInput()).getSource());		
		dialog.open();
		subServices.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveSubServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.subServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		subServices.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSubServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.subServices, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		subServices.refresh();
	}

	/**
	 * 
	 */
	protected void editSubServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				subServices.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createMainServiceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, CommonConceptsViewsRepository.TimService.Properties.mainService, CommonConceptsMessages.TimServicePropertiesEditionPart_MainServiceLabel);
		mainService = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CommonConceptsViewsRepository.TimService.Properties.mainService, CommonConceptsViewsRepository.FORM_KIND));
		widgetFactory.adapt(mainService);
		mainService.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData mainServiceData = new GridData(GridData.FILL_HORIZONTAL);
		mainService.setLayoutData(mainServiceData);
		mainService.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.mainService, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getMainService()));
			}

		});
		mainService.setID(CommonConceptsViewsRepository.TimService.Properties.mainService);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimService.Properties.mainService, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createProcessesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.processes = new ReferencesTable(getDescription(CommonConceptsViewsRepository.TimService.Properties.processes, CommonConceptsMessages.TimServicePropertiesEditionPart_ProcessesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addProcesses(); }
			public void handleEdit(EObject element) { editProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.processes.setHelpText(propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimService.Properties.processes, CommonConceptsViewsRepository.FORM_KIND));
		this.processes.createControls(parent, widgetFactory);
		this.processes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.processes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData processesData = new GridData(GridData.FILL_HORIZONTAL);
		processesData.horizontalSpan = 3;
		this.processes.setLayoutData(processesData);
		this.processes.disableMove();
		processes.setID(CommonConceptsViewsRepository.TimService.Properties.processes);
		processes.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addProcesses() {
		// Start of user code
		TimAddProcessToServiceDialog dialog = new TimAddProcessToServiceDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), processes.getLabelProvider(), (TimService) ((ReferencesTableSettings)this.processes.getInput()).getSource());		
		dialog.open();
		processes.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveProcesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processes.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		processes.refresh();
	}

	/**
	 * 
	 */
	protected void editProcesses(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				processes.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createResourcesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.resources = new ReferencesTable(getDescription(CommonConceptsViewsRepository.TimService.Properties.resources, CommonConceptsMessages.TimServicePropertiesEditionPart_ResourcesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addResources(); }
			public void handleEdit(EObject element) { editResources(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveResources(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromResources(element); }
			public void navigateTo(EObject element) { }
		});
		this.resources.setHelpText(propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimService.Properties.resources, CommonConceptsViewsRepository.FORM_KIND));
		this.resources.createControls(parent, widgetFactory);
		this.resources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.resources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resourcesData = new GridData(GridData.FILL_HORIZONTAL);
		resourcesData.horizontalSpan = 3;
		this.resources.setLayoutData(resourcesData);
		this.resources.disableMove();
		resources.setID(CommonConceptsViewsRepository.TimService.Properties.resources);
		resources.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}
	/**
	 * 
	 */
	protected void addResources() {
		// Start of user code
		TimAddResourceToServiceDialog dialog = new TimAddResourceToServiceDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), resources.getLabelProvider(), (TimService) ((ReferencesTableSettings)this.resources.getInput()).getSource());		
		dialog.open();
		resources.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveResources(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		resources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		resources.refresh();
	}

	/**
	 * 
	 */
	protected void editResources(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				resources.refresh();
			}
		}
	}

	
	protected Composite createModelText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimService.Properties.model, CommonConceptsMessages.TimServicePropertiesEditionPart_ModelLabel);
		model = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		model.setEnabled(false);
		model.setToolTipText(CommonConceptsMessages.TimService_ReadOnly);
		model.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData modelData = new GridData(GridData.FILL_HORIZONTAL);
		model.setLayoutData(modelData);
		model.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimServicePropertiesEditionPartForm.this,
							CommonConceptsViewsRepository.TimService.Properties.model,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, model.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimServicePropertiesEditionPartForm.this,
									CommonConceptsViewsRepository.TimService.Properties.model,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, model.getText()));
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
									TimServicePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		model.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimServicePropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimService.Properties.model, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, model.getText()));
				}
			}
		});
		EditingUtils.setID(model, CommonConceptsViewsRepository.TimService.Properties.model);
		EditingUtils.setEEFtype(model, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimService.Properties.model, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#getObjective()
	 * 
	 */
	public String getObjective() {
		return objective.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#setObjective(String newValue)
	 * 
	 */
	public void setObjective(String newValue) {
		if (newValue != null) {
			objective.setText(newValue);
		} else {
			objective.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#getConstraint()
	 * 
	 */
	public String getConstraint() {
		return constraint.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#setConstraint(String newValue)
	 * 
	 */
	public void setConstraint(String newValue) {
		if (newValue != null) {
			constraint.setText(newValue);
		} else {
			constraint.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#getAccess()
	 * 
	 */
	public String getAccess() {
		return access.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#setAccess(String newValue)
	 * 
	 */
	public void setAccess(String newValue) {
		if (newValue != null) {
			access.setText(newValue);
		} else {
			access.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#getConsumption()
	 * 
	 */
	public String getConsumption() {
		return consumption.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#setConsumption(String newValue)
	 * 
	 */
	public void setConsumption(String newValue) {
		if (newValue != null) {
			consumption.setText(newValue);
		} else {
			consumption.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#getAutomationLevel()
	 * 
	 */
	public String getAutomationLevel() {
		return automationLevel.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#setAutomationLevel(String newValue)
	 * 
	 */
	public void setAutomationLevel(String newValue) {
		if (newValue != null) {
			automationLevel.setText(newValue);
		} else {
			automationLevel.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#getDomain()
	 * 
	 */
	public String getDomain() {
		return domain.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#setDomain(String newValue)
	 * 
	 */
	public void setDomain(String newValue) {
		if (newValue != null) {
			domain.setText(newValue);
		} else {
			domain.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#getNature()
	 * 
	 */
	public String getNature() {
		return nature.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#setNature(String newValue)
	 * 
	 */
	public void setNature(String newValue) {
		if (newValue != null) {
			nature.setText(newValue);
		} else {
			nature.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#initSubServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSubServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		subServices.setContentProvider(contentProvider);
		subServices.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#updateSubServices()
	 * 
	 */
	public void updateSubServices() {
	subServices.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#addFilterSubServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSubServices(ViewerFilter filter) {
		subServicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#addBusinessFilterSubServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSubServices(ViewerFilter filter) {
		subServicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#isContainedInSubServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSubServicesTable(EObject element) {
		return ((ReferencesTableSettings)subServices.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#getMainService()
	 * 
	 */
	public EObject getMainService() {
		if (mainService.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) mainService.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#initMainService(EObjectFlatComboSettings)
	 */
	public void initMainService(EObjectFlatComboSettings settings) {
		mainService.setInput(settings);
		if (current != null) {
			mainService.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#setMainService(EObject newValue)
	 * 
	 */
	public void setMainService(EObject newValue) {
		if (newValue != null) {
			mainService.setSelection(new StructuredSelection(newValue));
		} else {
			mainService.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#setMainServiceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMainServiceButtonMode(ButtonsModeEnum newValue) {
		mainService.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#addFilterMainService(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMainService(ViewerFilter filter) {
		mainService.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#addBusinessFilterMainService(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMainService(ViewerFilter filter) {
		mainService.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#initProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initProcesses(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		processes.setContentProvider(contentProvider);
		processes.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#updateProcesses()
	 * 
	 */
	public void updateProcesses() {
	processes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#addFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcesses(ViewerFilter filter) {
		processesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#addBusinessFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcesses(ViewerFilter filter) {
		processesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#isContainedInProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInProcessesTable(EObject element) {
		return ((ReferencesTableSettings)processes.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#initResources(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		resources.setContentProvider(contentProvider);
		resources.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#updateResources()
	 * 
	 */
	public void updateResources() {
	resources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#addFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResources(ViewerFilter filter) {
		resourcesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#addBusinessFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResources(ViewerFilter filter) {
		resourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#isContainedInResourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInResourcesTable(EObject element) {
		return ((ReferencesTableSettings)resources.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#getModel()
	 * 
	 */
	public String getModel() {
		return model.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimServicePropertiesEditionPart#setModel(String newValue)
	 * 
	 */
	public void setModel(String newValue) {
		if (newValue != null) {
			model.setText(newValue);
		} else {
			model.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CommonConceptsMessages.TimService_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
