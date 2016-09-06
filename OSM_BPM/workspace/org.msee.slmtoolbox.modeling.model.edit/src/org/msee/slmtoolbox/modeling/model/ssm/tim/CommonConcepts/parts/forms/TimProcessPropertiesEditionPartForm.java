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
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.TimProcess;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.CommonConceptsViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.providers.CommonConceptsMessages;
import org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs.TimAddOrganizationToProcessDialog;
import org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs.TimAddProcessToProcessDialog;
import org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs.TimAddResourceToProcessDialog;
import org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs.TimAddServiceToProcessDialog;

// End of user code

/**
 * 
 * 
 */
public class TimProcessPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TimProcessPropertiesEditionPart {

	protected Text name;
	protected Text objective;
	protected Text trigger;
	protected Text result;
	protected Text constraint;
	protected Text workFlow;
	protected ReferencesTable subprocesses;
	protected List<ViewerFilter> subprocessesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> subprocessesFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer mainProcess;
	protected ReferencesTable services;
	protected List<ViewerFilter> servicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> servicesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable resources;
	protected List<ViewerFilter> resourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resourcesFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer responsibleOrganizationUnit;
	protected ReferencesTable organizations;
	protected List<ViewerFilter> organizationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> organizationsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public TimProcessPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TimProcessPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence timProcessStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = timProcessStep.addStep(CommonConceptsViewsRepository.TimProcess.Properties.class);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimProcess.Properties.name);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimProcess.Properties.objective);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimProcess.Properties.trigger);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimProcess.Properties.result);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimProcess.Properties.constraint);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimProcess.Properties.workFlow);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimProcess.Properties.subprocesses);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimProcess.Properties.mainProcess);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimProcess.Properties.services);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimProcess.Properties.resources);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimProcess.Properties.responsibleOrganizationUnit);
		propertiesStep.addStep(CommonConceptsViewsRepository.TimProcess.Properties.organizations);
		
		
		composer = new PartComposer(timProcessStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.objective) {
					return createObjectiveText(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.trigger) {
					return createTriggerText(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.result) {
					return createResultText(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.constraint) {
					return createConstraintText(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.workFlow) {
					return createWorkFlowText(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.subprocesses) {
					return createSubprocessesReferencesTable(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.mainProcess) {
					return createMainProcessFlatComboViewer(parent, widgetFactory);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.services) {
					return createServicesReferencesTable(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.resources) {
					return createResourcesReferencesTable(widgetFactory, parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.responsibleOrganizationUnit) {
					return createResponsibleOrganizationUnitFlatComboViewer(parent, widgetFactory);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.organizations) {
					return createOrganizationsReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(CommonConceptsMessages.TimProcessPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, CommonConceptsViewsRepository.TimProcess.Properties.name, CommonConceptsMessages.TimProcessPropertiesEditionPart_NameLabel);
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
							TimProcessPropertiesEditionPartForm.this,
							CommonConceptsViewsRepository.TimProcess.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimProcessPropertiesEditionPartForm.this,
									CommonConceptsViewsRepository.TimProcess.Properties.name,
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
									TimProcessPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, CommonConceptsViewsRepository.TimProcess.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.name, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createObjectiveText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimProcess.Properties.objective, CommonConceptsMessages.TimProcessPropertiesEditionPart_ObjectiveLabel);
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
							TimProcessPropertiesEditionPartForm.this,
							CommonConceptsViewsRepository.TimProcess.Properties.objective,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, objective.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimProcessPropertiesEditionPartForm.this,
									CommonConceptsViewsRepository.TimProcess.Properties.objective,
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
									TimProcessPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.objective, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, objective.getText()));
				}
			}
		});
		EditingUtils.setID(objective, CommonConceptsViewsRepository.TimProcess.Properties.objective);
		EditingUtils.setEEFtype(objective, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.objective, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTriggerText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimProcess.Properties.trigger, CommonConceptsMessages.TimProcessPropertiesEditionPart_TriggerLabel);
		trigger = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		trigger.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData triggerData = new GridData(GridData.FILL_HORIZONTAL);
		trigger.setLayoutData(triggerData);
		trigger.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimProcessPropertiesEditionPartForm.this,
							CommonConceptsViewsRepository.TimProcess.Properties.trigger,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, trigger.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimProcessPropertiesEditionPartForm.this,
									CommonConceptsViewsRepository.TimProcess.Properties.trigger,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, trigger.getText()));
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
									TimProcessPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		trigger.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.trigger, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, trigger.getText()));
				}
			}
		});
		EditingUtils.setID(trigger, CommonConceptsViewsRepository.TimProcess.Properties.trigger);
		EditingUtils.setEEFtype(trigger, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.trigger, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createResultText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimProcess.Properties.result, CommonConceptsMessages.TimProcessPropertiesEditionPart_ResultLabel);
		result = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		result.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData resultData = new GridData(GridData.FILL_HORIZONTAL);
		result.setLayoutData(resultData);
		result.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimProcessPropertiesEditionPartForm.this,
							CommonConceptsViewsRepository.TimProcess.Properties.result,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, result.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimProcessPropertiesEditionPartForm.this,
									CommonConceptsViewsRepository.TimProcess.Properties.result,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, result.getText()));
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
									TimProcessPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		result.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.result, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, result.getText()));
				}
			}
		});
		EditingUtils.setID(result, CommonConceptsViewsRepository.TimProcess.Properties.result);
		EditingUtils.setEEFtype(result, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.result, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConstraintText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimProcess.Properties.constraint, CommonConceptsMessages.TimProcessPropertiesEditionPart_ConstraintLabel);
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
							TimProcessPropertiesEditionPartForm.this,
							CommonConceptsViewsRepository.TimProcess.Properties.constraint,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimProcessPropertiesEditionPartForm.this,
									CommonConceptsViewsRepository.TimProcess.Properties.constraint,
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
									TimProcessPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
				}
			}
		});
		EditingUtils.setID(constraint, CommonConceptsViewsRepository.TimProcess.Properties.constraint);
		EditingUtils.setEEFtype(constraint, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.constraint, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createWorkFlowText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimProcess.Properties.workFlow, CommonConceptsMessages.TimProcessPropertiesEditionPart_WorkFlowLabel);
		workFlow = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		workFlow.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData workFlowData = new GridData(GridData.FILL_HORIZONTAL);
		workFlow.setLayoutData(workFlowData);
		workFlow.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimProcessPropertiesEditionPartForm.this,
							CommonConceptsViewsRepository.TimProcess.Properties.workFlow,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, workFlow.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimProcessPropertiesEditionPartForm.this,
									CommonConceptsViewsRepository.TimProcess.Properties.workFlow,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, workFlow.getText()));
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
									TimProcessPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		workFlow.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.workFlow, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, workFlow.getText()));
				}
			}
		});
		EditingUtils.setID(workFlow, CommonConceptsViewsRepository.TimProcess.Properties.workFlow);
		EditingUtils.setEEFtype(workFlow, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.workFlow, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSubprocessesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.subprocesses = new ReferencesTable(getDescription(CommonConceptsViewsRepository.TimProcess.Properties.subprocesses, CommonConceptsMessages.TimProcessPropertiesEditionPart_SubprocessesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addSubprocesses(); }
			public void handleEdit(EObject element) { editSubprocesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSubprocesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSubprocesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.subprocesses.setHelpText(propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.subprocesses, CommonConceptsViewsRepository.FORM_KIND));
		this.subprocesses.createControls(parent, widgetFactory);
		this.subprocesses.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.subprocesses, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData subprocessesData = new GridData(GridData.FILL_HORIZONTAL);
		subprocessesData.horizontalSpan = 3;
		this.subprocesses.setLayoutData(subprocessesData);
		this.subprocesses.disableMove();
		subprocesses.setID(CommonConceptsViewsRepository.TimProcess.Properties.subprocesses);
		subprocesses.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSubprocesses() {
		// Start of user code
		TimAddProcessToProcessDialog dialog = new TimAddProcessToProcessDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), subprocesses.getLabelProvider(), (TimProcess) ((ReferencesTableSettings)this.subprocesses.getInput()).getSource());		
		dialog.open();
		subprocesses.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveSubprocesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.subprocesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		subprocesses.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSubprocesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.subprocesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		subprocesses.refresh();
	}

	/**
	 * 
	 */
	protected void editSubprocesses(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				subprocesses.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createMainProcessFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, CommonConceptsViewsRepository.TimProcess.Properties.mainProcess, CommonConceptsMessages.TimProcessPropertiesEditionPart_MainProcessLabel);
		mainProcess = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CommonConceptsViewsRepository.TimProcess.Properties.mainProcess, CommonConceptsViewsRepository.FORM_KIND));
		widgetFactory.adapt(mainProcess);
		mainProcess.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData mainProcessData = new GridData(GridData.FILL_HORIZONTAL);
		mainProcess.setLayoutData(mainProcessData);
		mainProcess.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.mainProcess, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getMainProcess()));
			}

		});
		mainProcess.setID(CommonConceptsViewsRepository.TimProcess.Properties.mainProcess);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.mainProcess, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createServicesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.services = new ReferencesTable(getDescription(CommonConceptsViewsRepository.TimProcess.Properties.services, CommonConceptsMessages.TimProcessPropertiesEditionPart_ServicesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addServices(); }
			public void handleEdit(EObject element) { editServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.services.setHelpText(propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.services, CommonConceptsViewsRepository.FORM_KIND));
		this.services.createControls(parent, widgetFactory);
		this.services.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.services, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData servicesData = new GridData(GridData.FILL_HORIZONTAL);
		servicesData.horizontalSpan = 3;
		this.services.setLayoutData(servicesData);
		this.services.disableMove();
		services.setID(CommonConceptsViewsRepository.TimProcess.Properties.services);
		services.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addServices() {
		// Start of user code
		TimAddServiceToProcessDialog dialog = new TimAddServiceToProcessDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), services.getLabelProvider(), (TimProcess) ((ReferencesTableSettings)this.services.getInput()).getSource());		
		dialog.open();
		services.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		services.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		services.refresh();
	}

	/**
	 * 
	 */
	protected void editServices(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				services.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createResourcesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.resources = new ReferencesTable(getDescription(CommonConceptsViewsRepository.TimProcess.Properties.resources, CommonConceptsMessages.TimProcessPropertiesEditionPart_ResourcesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addResources(); }
			public void handleEdit(EObject element) { editResources(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveResources(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromResources(element); }
			public void navigateTo(EObject element) { }
		});
		this.resources.setHelpText(propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.resources, CommonConceptsViewsRepository.FORM_KIND));
		this.resources.createControls(parent, widgetFactory);
		this.resources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.resources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resourcesData = new GridData(GridData.FILL_HORIZONTAL);
		resourcesData.horizontalSpan = 3;
		this.resources.setLayoutData(resourcesData);
		this.resources.disableMove();
		resources.setID(CommonConceptsViewsRepository.TimProcess.Properties.resources);
		resources.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addResources() {
		// Start of user code
		TimAddResourceToProcessDialog dialog = new TimAddResourceToProcessDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), resources.getLabelProvider(), (TimProcess) ((ReferencesTableSettings)this.resources.getInput()).getSource());		
		dialog.open();
		resources.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveResources(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		resources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createResponsibleOrganizationUnitFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, CommonConceptsViewsRepository.TimProcess.Properties.responsibleOrganizationUnit, CommonConceptsMessages.TimProcessPropertiesEditionPart_ResponsibleOrganizationUnitLabel);
		responsibleOrganizationUnit = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CommonConceptsViewsRepository.TimProcess.Properties.responsibleOrganizationUnit, CommonConceptsViewsRepository.FORM_KIND));
		widgetFactory.adapt(responsibleOrganizationUnit);
		responsibleOrganizationUnit.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData responsibleOrganizationUnitData = new GridData(GridData.FILL_HORIZONTAL);
		responsibleOrganizationUnit.setLayoutData(responsibleOrganizationUnitData);
		responsibleOrganizationUnit.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.responsibleOrganizationUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getResponsibleOrganizationUnit()));
			}

		});
		responsibleOrganizationUnit.setID(CommonConceptsViewsRepository.TimProcess.Properties.responsibleOrganizationUnit);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.responsibleOrganizationUnit, CommonConceptsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createOrganizationsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.organizations = new ReferencesTable(getDescription(CommonConceptsViewsRepository.TimProcess.Properties.organizations, CommonConceptsMessages.TimProcessPropertiesEditionPart_OrganizationsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addOrganizations(); }
			public void handleEdit(EObject element) { editOrganizations(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOrganizations(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOrganizations(element); }
			public void navigateTo(EObject element) { }
		});
		this.organizations.setHelpText(propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.organizations, CommonConceptsViewsRepository.FORM_KIND));
		this.organizations.createControls(parent, widgetFactory);
		this.organizations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.organizations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData organizationsData = new GridData(GridData.FILL_HORIZONTAL);
		organizationsData.horizontalSpan = 3;
		this.organizations.setLayoutData(organizationsData);
		this.organizations.disableMove();
		organizations.setID(CommonConceptsViewsRepository.TimProcess.Properties.organizations);
		organizations.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOrganizations() {
		// Start of user code
		TimAddOrganizationToProcessDialog dialog = new TimAddOrganizationToProcessDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), organizations.getLabelProvider(), (TimProcess) ((ReferencesTableSettings)this.organizations.getInput()).getSource());		
		dialog.open();
		organizations.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveOrganizations(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.organizations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		organizations.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOrganizations(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartForm.this, CommonConceptsViewsRepository.TimProcess.Properties.organizations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		organizations.refresh();
	}

	/**
	 * 
	 */
	protected void editOrganizations(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				organizations.refresh();
			}
		}
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#getObjective()
	 * 
	 */
	public String getObjective() {
		return objective.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#setObjective(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#getTrigger()
	 * 
	 */
	public String getTrigger() {
		return trigger.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#setTrigger(String newValue)
	 * 
	 */
	public void setTrigger(String newValue) {
		if (newValue != null) {
			trigger.setText(newValue);
		} else {
			trigger.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#getResult()
	 * 
	 */
	public String getResult() {
		return result.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#setResult(String newValue)
	 * 
	 */
	public void setResult(String newValue) {
		if (newValue != null) {
			result.setText(newValue);
		} else {
			result.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#getConstraint()
	 * 
	 */
	public String getConstraint() {
		return constraint.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#setConstraint(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#getWorkFlow()
	 * 
	 */
	public String getWorkFlow() {
		return workFlow.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#setWorkFlow(String newValue)
	 * 
	 */
	public void setWorkFlow(String newValue) {
		if (newValue != null) {
			workFlow.setText(newValue);
		} else {
			workFlow.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#initSubprocesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSubprocesses(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		subprocesses.setContentProvider(contentProvider);
		subprocesses.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#updateSubprocesses()
	 * 
	 */
	public void updateSubprocesses() {
	subprocesses.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#addFilterSubprocesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSubprocesses(ViewerFilter filter) {
		subprocessesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#addBusinessFilterSubprocesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSubprocesses(ViewerFilter filter) {
		subprocessesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#isContainedInSubprocessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInSubprocessesTable(EObject element) {
		return ((ReferencesTableSettings)subprocesses.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#getMainProcess()
	 * 
	 */
	public EObject getMainProcess() {
		if (mainProcess.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) mainProcess.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#initMainProcess(EObjectFlatComboSettings)
	 */
	public void initMainProcess(EObjectFlatComboSettings settings) {
		mainProcess.setInput(settings);
		if (current != null) {
			mainProcess.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#setMainProcess(EObject newValue)
	 * 
	 */
	public void setMainProcess(EObject newValue) {
		if (newValue != null) {
			mainProcess.setSelection(new StructuredSelection(newValue));
		} else {
			mainProcess.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#setMainProcessButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMainProcessButtonMode(ButtonsModeEnum newValue) {
		mainProcess.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#addFilterMainProcess(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMainProcess(ViewerFilter filter) {
		mainProcess.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#addBusinessFilterMainProcess(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMainProcess(ViewerFilter filter) {
		mainProcess.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#initServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initServices(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		services.setContentProvider(contentProvider);
		services.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#updateServices()
	 * 
	 */
	public void updateServices() {
	services.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#addFilterServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToServices(ViewerFilter filter) {
		servicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#addBusinessFilterServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToServices(ViewerFilter filter) {
		servicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#isContainedInServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInServicesTable(EObject element) {
		return ((ReferencesTableSettings)services.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#initResources(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#updateResources()
	 * 
	 */
	public void updateResources() {
	resources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#addFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResources(ViewerFilter filter) {
		resourcesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#addBusinessFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResources(ViewerFilter filter) {
		resourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#isContainedInResourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInResourcesTable(EObject element) {
		return ((ReferencesTableSettings)resources.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#getResponsibleOrganizationUnit()
	 * 
	 */
	public EObject getResponsibleOrganizationUnit() {
		if (responsibleOrganizationUnit.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) responsibleOrganizationUnit.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#initResponsibleOrganizationUnit(EObjectFlatComboSettings)
	 */
	public void initResponsibleOrganizationUnit(EObjectFlatComboSettings settings) {
		responsibleOrganizationUnit.setInput(settings);
		if (current != null) {
			responsibleOrganizationUnit.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#setResponsibleOrganizationUnit(EObject newValue)
	 * 
	 */
	public void setResponsibleOrganizationUnit(EObject newValue) {
		if (newValue != null) {
			responsibleOrganizationUnit.setSelection(new StructuredSelection(newValue));
		} else {
			responsibleOrganizationUnit.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#setResponsibleOrganizationUnitButtonMode(ButtonsModeEnum newValue)
	 */
	public void setResponsibleOrganizationUnitButtonMode(ButtonsModeEnum newValue) {
		responsibleOrganizationUnit.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#addFilterResponsibleOrganizationUnit(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResponsibleOrganizationUnit(ViewerFilter filter) {
		responsibleOrganizationUnit.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#addBusinessFilterResponsibleOrganizationUnit(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResponsibleOrganizationUnit(ViewerFilter filter) {
		responsibleOrganizationUnit.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#initOrganizations(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOrganizations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		organizations.setContentProvider(contentProvider);
		organizations.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#updateOrganizations()
	 * 
	 */
	public void updateOrganizations() {
	organizations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#addFilterOrganizations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOrganizations(ViewerFilter filter) {
		organizationsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#addBusinessFilterOrganizations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOrganizations(ViewerFilter filter) {
		organizationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart#isContainedInOrganizationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOrganizationsTable(EObject element) {
		return ((ReferencesTableSettings)organizations.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CommonConceptsMessages.TimProcess_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
