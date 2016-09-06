/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms;

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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs.BsmAddOrganizationToProcessDialog;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs.BsmAddProcessToProcessDialog;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs.BsmAddResourceToProcessDialog;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmProcessPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, BsmProcessPropertiesEditionPart {

	protected Text name;
	protected Text objective;
	protected Text trigger;
	protected Text result;
	protected Text constraint;
	protected ReferencesTable subProcess;
	protected List<ViewerFilter> subProcessBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> subProcessFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer mainProcess;
	protected ReferencesTable resources;
	protected List<ViewerFilter> resourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resourcesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable organizations;
	protected List<ViewerFilter> organizationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> organizationsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer eaProcess;



	/**
	 * For {@link ISection} use only.
	 */
	public BsmProcessPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmProcessPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence bsmProcessStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = bsmProcessStep.addStep(BsmViewsRepository.BsmProcess.Properties.class);
		propertiesStep.addStep(BsmViewsRepository.BsmProcess.Properties.name);
		propertiesStep.addStep(BsmViewsRepository.BsmProcess.Properties.objective);
		propertiesStep.addStep(BsmViewsRepository.BsmProcess.Properties.trigger);
		propertiesStep.addStep(BsmViewsRepository.BsmProcess.Properties.result);
		propertiesStep.addStep(BsmViewsRepository.BsmProcess.Properties.constraint);
		propertiesStep.addStep(BsmViewsRepository.BsmProcess.Properties.subProcess);
		propertiesStep.addStep(BsmViewsRepository.BsmProcess.Properties.mainProcess);
		propertiesStep.addStep(BsmViewsRepository.BsmProcess.Properties.resources);
		propertiesStep.addStep(BsmViewsRepository.BsmProcess.Properties.organizations);
		propertiesStep.addStep(BsmViewsRepository.BsmProcess.Properties.eaProcess);
		
		
		composer = new PartComposer(bsmProcessStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == BsmViewsRepository.BsmProcess.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.objective) {
					return createObjectiveText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.trigger) {
					return createTriggerText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.result) {
					return createResultText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.constraint) {
					return createConstraintText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.subProcess) {
					return createSubProcessReferencesTable(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.mainProcess) {
					return createMainProcessFlatComboViewer(parent, widgetFactory);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.resources) {
					return createResourcesReferencesTable(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.organizations) {
					return createOrganizationsReferencesTable(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.eaProcess) {
					return createEaProcessFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(BsmMessages.BsmProcessPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, BsmViewsRepository.BsmProcess.Properties.name, BsmMessages.BsmProcessPropertiesEditionPart_NameLabel);
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
							BsmProcessPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmProcess.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmProcessPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmProcess.Properties.name,
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
									BsmProcessPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartForm.this, BsmViewsRepository.BsmProcess.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, BsmViewsRepository.BsmProcess.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.name, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createObjectiveText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmProcess.Properties.objective, BsmMessages.BsmProcessPropertiesEditionPart_ObjectiveLabel);
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
							BsmProcessPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmProcess.Properties.objective,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, objective.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmProcessPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmProcess.Properties.objective,
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
									BsmProcessPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartForm.this, BsmViewsRepository.BsmProcess.Properties.objective, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, objective.getText()));
				}
			}
		});
		EditingUtils.setID(objective, BsmViewsRepository.BsmProcess.Properties.objective);
		EditingUtils.setEEFtype(objective, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.objective, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTriggerText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmProcess.Properties.trigger, BsmMessages.BsmProcessPropertiesEditionPart_TriggerLabel);
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
							BsmProcessPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmProcess.Properties.trigger,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, trigger.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmProcessPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmProcess.Properties.trigger,
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
									BsmProcessPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartForm.this, BsmViewsRepository.BsmProcess.Properties.trigger, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, trigger.getText()));
				}
			}
		});
		EditingUtils.setID(trigger, BsmViewsRepository.BsmProcess.Properties.trigger);
		EditingUtils.setEEFtype(trigger, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.trigger, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createResultText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmProcess.Properties.result, BsmMessages.BsmProcessPropertiesEditionPart_ResultLabel);
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
							BsmProcessPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmProcess.Properties.result,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, result.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmProcessPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmProcess.Properties.result,
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
									BsmProcessPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartForm.this, BsmViewsRepository.BsmProcess.Properties.result, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, result.getText()));
				}
			}
		});
		EditingUtils.setID(result, BsmViewsRepository.BsmProcess.Properties.result);
		EditingUtils.setEEFtype(result, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.result, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConstraintText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmProcess.Properties.constraint, BsmMessages.BsmProcessPropertiesEditionPart_ConstraintLabel);
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
							BsmProcessPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmProcess.Properties.constraint,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmProcessPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmProcess.Properties.constraint,
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
									BsmProcessPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartForm.this, BsmViewsRepository.BsmProcess.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
				}
			}
		});
		EditingUtils.setID(constraint, BsmViewsRepository.BsmProcess.Properties.constraint);
		EditingUtils.setEEFtype(constraint, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.constraint, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSubProcessReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.subProcess = new ReferencesTable(getDescription(BsmViewsRepository.BsmProcess.Properties.subProcess, BsmMessages.BsmProcessPropertiesEditionPart_SubProcessLabel), new ReferencesTableListener	() {
			public void handleAdd() { addSubProcess(); }
			public void handleEdit(EObject element) { editSubProcess(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSubProcess(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSubProcess(element); }
			public void navigateTo(EObject element) { }
		});
		this.subProcess.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.subProcess, BsmViewsRepository.FORM_KIND));
		this.subProcess.createControls(parent, widgetFactory);
		this.subProcess.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartForm.this, BsmViewsRepository.BsmProcess.Properties.subProcess, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData subProcessData = new GridData(GridData.FILL_HORIZONTAL);
		subProcessData.horizontalSpan = 3;
		this.subProcess.setLayoutData(subProcessData);
		this.subProcess.disableMove();
		subProcess.setID(BsmViewsRepository.BsmProcess.Properties.subProcess);
		subProcess.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSubProcess() {
		// Start of user code
		BsmAddProcessToProcessDialog dialog = new BsmAddProcessToProcessDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), subProcess.getLabelProvider(), (org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess) ((ReferencesTableSettings)this.subProcess.getInput()).getSource());		
		dialog.open();
		subProcess.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveSubProcess(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartForm.this, BsmViewsRepository.BsmProcess.Properties.subProcess, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		subProcess.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSubProcess(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartForm.this, BsmViewsRepository.BsmProcess.Properties.subProcess, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		subProcess.refresh();
	}

	/**
	 * 
	 */
	protected void editSubProcess(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				subProcess.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createMainProcessFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, BsmViewsRepository.BsmProcess.Properties.mainProcess, BsmMessages.BsmProcessPropertiesEditionPart_MainProcessLabel);
		mainProcess = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmProcess.Properties.mainProcess, BsmViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartForm.this, BsmViewsRepository.BsmProcess.Properties.mainProcess, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getMainProcess()));
			}

		});
		mainProcess.setID(BsmViewsRepository.BsmProcess.Properties.mainProcess);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.mainProcess, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createResourcesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.resources = new ReferencesTable(getDescription(BsmViewsRepository.BsmProcess.Properties.resources, BsmMessages.BsmProcessPropertiesEditionPart_ResourcesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addResources(); }
			public void handleEdit(EObject element) { editResources(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveResources(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromResources(element); }
			public void navigateTo(EObject element) { }
		});
		this.resources.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.resources, BsmViewsRepository.FORM_KIND));
		this.resources.createControls(parent, widgetFactory);
		this.resources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartForm.this, BsmViewsRepository.BsmProcess.Properties.resources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resourcesData = new GridData(GridData.FILL_HORIZONTAL);
		resourcesData.horizontalSpan = 3;
		this.resources.setLayoutData(resourcesData);
		this.resources.disableMove();
		resources.setID(BsmViewsRepository.BsmProcess.Properties.resources);
		resources.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addResources() {
		// Start of user code
		BsmAddResourceToProcessDialog dialog = new BsmAddResourceToProcessDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), resources.getLabelProvider(), (org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess) ((ReferencesTableSettings)this.resources.getInput()).getSource());		
		dialog.open();
		resources.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveResources(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartForm.this, BsmViewsRepository.BsmProcess.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		resources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartForm.this, BsmViewsRepository.BsmProcess.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * 
	 */
	protected Composite createOrganizationsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.organizations = new ReferencesTable(getDescription(BsmViewsRepository.BsmProcess.Properties.organizations, BsmMessages.BsmProcessPropertiesEditionPart_OrganizationsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addOrganizations(); }
			public void handleEdit(EObject element) { editOrganizations(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOrganizations(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOrganizations(element); }
			public void navigateTo(EObject element) { }
		});
		this.organizations.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.organizations, BsmViewsRepository.FORM_KIND));
		this.organizations.createControls(parent, widgetFactory);
		this.organizations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartForm.this, BsmViewsRepository.BsmProcess.Properties.organizations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData organizationsData = new GridData(GridData.FILL_HORIZONTAL);
		organizationsData.horizontalSpan = 3;
		this.organizations.setLayoutData(organizationsData);
		this.organizations.disableMove();
		organizations.setID(BsmViewsRepository.BsmProcess.Properties.organizations);
		organizations.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOrganizations() {
		// Start of user code
		BsmAddOrganizationToProcessDialog dialog = new BsmAddOrganizationToProcessDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), organizations.getLabelProvider(), (BsmProcess) ((ReferencesTableSettings)this.organizations.getInput()).getSource());		
		dialog.open();
		organizations.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveOrganizations(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartForm.this, BsmViewsRepository.BsmProcess.Properties.organizations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		organizations.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOrganizations(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartForm.this, BsmViewsRepository.BsmProcess.Properties.organizations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createEaProcessFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, BsmViewsRepository.BsmProcess.Properties.eaProcess, BsmMessages.BsmProcessPropertiesEditionPart_EaProcessLabel);
		eaProcess = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmProcess.Properties.eaProcess, BsmViewsRepository.FORM_KIND));
		widgetFactory.adapt(eaProcess);
		eaProcess.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData eaProcessData = new GridData(GridData.FILL_HORIZONTAL);
		eaProcess.setLayoutData(eaProcessData);
		eaProcess.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartForm.this, BsmViewsRepository.BsmProcess.Properties.eaProcess, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEaProcess()));
			}

		});
		eaProcess.setID(BsmViewsRepository.BsmProcess.Properties.eaProcess);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.eaProcess, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#getObjective()
	 * 
	 */
	public String getObjective() {
		return objective.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#setObjective(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#getTrigger()
	 * 
	 */
	public String getTrigger() {
		return trigger.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#setTrigger(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#getResult()
	 * 
	 */
	public String getResult() {
		return result.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#setResult(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#getConstraint()
	 * 
	 */
	public String getConstraint() {
		return constraint.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#setConstraint(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#initSubProcess(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSubProcess(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		subProcess.setContentProvider(contentProvider);
		subProcess.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#updateSubProcess()
	 * 
	 */
	public void updateSubProcess() {
	subProcess.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#addFilterSubProcess(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSubProcess(ViewerFilter filter) {
		subProcessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#addBusinessFilterSubProcess(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSubProcess(ViewerFilter filter) {
		subProcessBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#isContainedInSubProcessTable(EObject element)
	 * 
	 */
	public boolean isContainedInSubProcessTable(EObject element) {
		return ((ReferencesTableSettings)subProcess.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#getMainProcess()
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#initMainProcess(EObjectFlatComboSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#setMainProcess(EObject newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#setMainProcessButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMainProcessButtonMode(ButtonsModeEnum newValue) {
		mainProcess.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#addFilterMainProcess(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMainProcess(ViewerFilter filter) {
		mainProcess.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#addBusinessFilterMainProcess(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMainProcess(ViewerFilter filter) {
		mainProcess.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#initResources(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#updateResources()
	 * 
	 */
	public void updateResources() {
	resources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#addFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResources(ViewerFilter filter) {
		resourcesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#addBusinessFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResources(ViewerFilter filter) {
		resourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#isContainedInResourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInResourcesTable(EObject element) {
		return ((ReferencesTableSettings)resources.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#initOrganizations(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#updateOrganizations()
	 * 
	 */
	public void updateOrganizations() {
	organizations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#addFilterOrganizations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOrganizations(ViewerFilter filter) {
		organizationsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#addBusinessFilterOrganizations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOrganizations(ViewerFilter filter) {
		organizationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#isContainedInOrganizationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOrganizationsTable(EObject element) {
		return ((ReferencesTableSettings)organizations.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#getEaProcess()
	 * 
	 */
	public EObject getEaProcess() {
		if (eaProcess.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) eaProcess.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#initEaProcess(EObjectFlatComboSettings)
	 */
	public void initEaProcess(EObjectFlatComboSettings settings) {
		eaProcess.setInput(settings);
		if (current != null) {
			eaProcess.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#setEaProcess(EObject newValue)
	 * 
	 */
	public void setEaProcess(EObject newValue) {
		if (newValue != null) {
			eaProcess.setSelection(new StructuredSelection(newValue));
		} else {
			eaProcess.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#setEaProcessButtonMode(ButtonsModeEnum newValue)
	 */
	public void setEaProcessButtonMode(ButtonsModeEnum newValue) {
		eaProcess.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#addFilterEaProcess(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEaProcess(ViewerFilter filter) {
		eaProcess.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart#addBusinessFilterEaProcess(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEaProcess(ViewerFilter filter) {
		eaProcess.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return BsmMessages.BsmProcess_Part_Title;
	}

	// Start of user code additional methods

	// End of user code


}
