/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.forms;

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
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.TimPhysicalMeanResource;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.PhysicalMeanRelatedPartViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.providers.PhysicalMeanRelatedPartMessages;
import org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs.TimAddProcessToResourceDialog;
import org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs.TimAddServiceToResourceDialog;

// End of user code

/**
 * 
 * 
 */
public class TimPhysicalMeanResourcePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TimPhysicalMeanResourcePropertiesEditionPart {

	protected Text name;
	protected Text function;
	protected Text type;
	protected ReferencesTable processes;
	protected List<ViewerFilter> processesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> processesFilters = new ArrayList<ViewerFilter>();
	protected Text model;
	protected EObjectFlatComboViewer organizationUnit;
	protected ReferencesTable services;
	protected List<ViewerFilter> servicesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> servicesFilters = new ArrayList<ViewerFilter>();
	protected Text capability;
	protected Text constraint;
	protected Text operationMode;
	protected Text technicalCharacteristics;
	protected Text expectedPerformance;



	/**
	 * For {@link ISection} use only.
	 */
	public TimPhysicalMeanResourcePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TimPhysicalMeanResourcePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence timPhysicalMeanResourceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = timPhysicalMeanResourceStep.addStep(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.class);
		propertiesStep.addStep(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name);
		propertiesStep.addStep(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function);
		propertiesStep.addStep(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type);
		propertiesStep.addStep(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes);
		propertiesStep.addStep(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.model);
		propertiesStep.addStep(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit);
		propertiesStep.addStep(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services);
		propertiesStep.addStep(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability);
		propertiesStep.addStep(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint);
		propertiesStep.addStep(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode);
		propertiesStep.addStep(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics);
		propertiesStep.addStep(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance);
		
		
		composer = new PartComposer(timPhysicalMeanResourceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function) {
					return createFunctionText(widgetFactory, parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type) {
					return createTypeText(widgetFactory, parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes) {
					return createProcessesReferencesTable(widgetFactory, parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.model) {
					return createModelText(widgetFactory, parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit) {
					return createOrganizationUnitFlatComboViewer(parent, widgetFactory);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services) {
					return createServicesReferencesTable(widgetFactory, parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability) {
					return createCapabilityText(widgetFactory, parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint) {
					return createConstraintText(widgetFactory, parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode) {
					return createOperationModeText(widgetFactory, parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics) {
					return createTechnicalCharacteristicsText(widgetFactory, parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance) {
					return createExpectedPerformanceText(widgetFactory, parent);
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
		propertiesSection.setText(PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_NameLabel);
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
							TimPhysicalMeanResourcePropertiesEditionPartForm.this,
							PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimPhysicalMeanResourcePropertiesEditionPartForm.this,
									PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name,
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
									TimPhysicalMeanResourcePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartForm.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name, PhysicalMeanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createFunctionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_FunctionLabel);
		function = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		function.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData functionData = new GridData(GridData.FILL_HORIZONTAL);
		function.setLayoutData(functionData);
		function.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimPhysicalMeanResourcePropertiesEditionPartForm.this,
							PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, function.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimPhysicalMeanResourcePropertiesEditionPartForm.this,
									PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, function.getText()));
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
									TimPhysicalMeanResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		function.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartForm.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, function.getText()));
				}
			}
		});
		EditingUtils.setID(function, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function);
		EditingUtils.setEEFtype(function, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function, PhysicalMeanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_TypeLabel);
		type = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		type.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.setLayoutData(typeData);
		type.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimPhysicalMeanResourcePropertiesEditionPartForm.this,
							PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimPhysicalMeanResourcePropertiesEditionPartForm.this,
									PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, type.getText()));
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
									TimPhysicalMeanResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		type.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartForm.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
				}
			}
		});
		EditingUtils.setID(type, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type);
		EditingUtils.setEEFtype(type, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type, PhysicalMeanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createProcessesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.processes = new ReferencesTable(getDescription(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_ProcessesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addProcesses(); }
			public void handleEdit(EObject element) { editProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.processes.setHelpText(propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes, PhysicalMeanRelatedPartViewsRepository.FORM_KIND));
		this.processes.createControls(parent, widgetFactory);
		this.processes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartForm.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData processesData = new GridData(GridData.FILL_HORIZONTAL);
		processesData.horizontalSpan = 3;
		this.processes.setLayoutData(processesData);
		this.processes.disableMove();
		processes.setID(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes);
		processes.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addProcesses() {
		// Start of user code
		TimAddProcessToResourceDialog dialog = new TimAddProcessToResourceDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), processes.getLabelProvider(), (TimPhysicalMeanResource) ((ReferencesTableSettings)this.processes.getInput()).getSource());		
		dialog.open();
		processes.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveProcesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartForm.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processes.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartForm.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	
	protected Composite createModelText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.model, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_ModelLabel);
		model = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		model.setEnabled(false);
		model.setToolTipText(PhysicalMeanRelatedPartMessages.TimPhysicalMeanResource_ReadOnly);
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
							TimPhysicalMeanResourcePropertiesEditionPartForm.this,
							PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.model,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, model.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimPhysicalMeanResourcePropertiesEditionPartForm.this,
									PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.model,
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
									TimPhysicalMeanResourcePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartForm.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.model, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, model.getText()));
				}
			}
		});
		EditingUtils.setID(model, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.model);
		EditingUtils.setEEFtype(model, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.model, PhysicalMeanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createOrganizationUnitFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_OrganizationUnitLabel);
		organizationUnit = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit, PhysicalMeanRelatedPartViewsRepository.FORM_KIND));
		widgetFactory.adapt(organizationUnit);
		organizationUnit.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData organizationUnitData = new GridData(GridData.FILL_HORIZONTAL);
		organizationUnit.setLayoutData(organizationUnitData);
		organizationUnit.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartForm.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOrganizationUnit()));
			}

		});
		organizationUnit.setID(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit, PhysicalMeanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createServicesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.services = new ReferencesTable(getDescription(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_ServicesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addServices(); }
			public void handleEdit(EObject element) { editServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.services.setHelpText(propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services, PhysicalMeanRelatedPartViewsRepository.FORM_KIND));
		this.services.createControls(parent, widgetFactory);
		this.services.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartForm.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData servicesData = new GridData(GridData.FILL_HORIZONTAL);
		servicesData.horizontalSpan = 3;
		this.services.setLayoutData(servicesData);
		this.services.disableMove();
		services.setID(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services);
		services.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addServices() {
		// Start of user code
		TimAddServiceToResourceDialog dialog = new TimAddServiceToResourceDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), services.getLabelProvider(), (TimPhysicalMeanResource) ((ReferencesTableSettings)this.services.getInput()).getSource());		
		dialog.open();
		services.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartForm.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		services.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartForm.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	
	protected Composite createCapabilityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_CapabilityLabel);
		capability = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		capability.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData capabilityData = new GridData(GridData.FILL_HORIZONTAL);
		capability.setLayoutData(capabilityData);
		capability.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimPhysicalMeanResourcePropertiesEditionPartForm.this,
							PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capability.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimPhysicalMeanResourcePropertiesEditionPartForm.this,
									PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, capability.getText()));
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
									TimPhysicalMeanResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		capability.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartForm.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capability.getText()));
				}
			}
		});
		EditingUtils.setID(capability, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability);
		EditingUtils.setEEFtype(capability, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability, PhysicalMeanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConstraintText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_ConstraintLabel);
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
							TimPhysicalMeanResourcePropertiesEditionPartForm.this,
							PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimPhysicalMeanResourcePropertiesEditionPartForm.this,
									PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint,
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
									TimPhysicalMeanResourcePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartForm.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
				}
			}
		});
		EditingUtils.setID(constraint, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint);
		EditingUtils.setEEFtype(constraint, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint, PhysicalMeanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOperationModeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_OperationModeLabel);
		operationMode = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		operationMode.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData operationModeData = new GridData(GridData.FILL_HORIZONTAL);
		operationMode.setLayoutData(operationModeData);
		operationMode.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimPhysicalMeanResourcePropertiesEditionPartForm.this,
							PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, operationMode.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimPhysicalMeanResourcePropertiesEditionPartForm.this,
									PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, operationMode.getText()));
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
									TimPhysicalMeanResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		operationMode.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartForm.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, operationMode.getText()));
				}
			}
		});
		EditingUtils.setID(operationMode, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode);
		EditingUtils.setEEFtype(operationMode, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode, PhysicalMeanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTechnicalCharacteristicsText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_TechnicalCharacteristicsLabel);
		technicalCharacteristics = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		technicalCharacteristics.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData technicalCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		technicalCharacteristics.setLayoutData(technicalCharacteristicsData);
		technicalCharacteristics.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimPhysicalMeanResourcePropertiesEditionPartForm.this,
							PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, technicalCharacteristics.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimPhysicalMeanResourcePropertiesEditionPartForm.this,
									PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, technicalCharacteristics.getText()));
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
									TimPhysicalMeanResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		technicalCharacteristics.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartForm.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, technicalCharacteristics.getText()));
				}
			}
		});
		EditingUtils.setID(technicalCharacteristics, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics);
		EditingUtils.setEEFtype(technicalCharacteristics, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics, PhysicalMeanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createExpectedPerformanceText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_ExpectedPerformanceLabel);
		expectedPerformance = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		expectedPerformance.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData expectedPerformanceData = new GridData(GridData.FILL_HORIZONTAL);
		expectedPerformance.setLayoutData(expectedPerformanceData);
		expectedPerformance.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimPhysicalMeanResourcePropertiesEditionPartForm.this,
							PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, expectedPerformance.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimPhysicalMeanResourcePropertiesEditionPartForm.this,
									PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, expectedPerformance.getText()));
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
									TimPhysicalMeanResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		expectedPerformance.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartForm.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, expectedPerformance.getText()));
				}
			}
		});
		EditingUtils.setID(expectedPerformance, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance);
		EditingUtils.setEEFtype(expectedPerformance, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance, PhysicalMeanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#getFunction()
	 * 
	 */
	public String getFunction() {
		return function.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#setFunction(String newValue)
	 * 
	 */
	public void setFunction(String newValue) {
		if (newValue != null) {
			function.setText(newValue);
		} else {
			function.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#getType()
	 * 
	 */
	public String getType() {
		return type.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#setType(String newValue)
	 * 
	 */
	public void setType(String newValue) {
		if (newValue != null) {
			type.setText(newValue);
		} else {
			type.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#initProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#updateProcesses()
	 * 
	 */
	public void updateProcesses() {
	processes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#addFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcesses(ViewerFilter filter) {
		processesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#addBusinessFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcesses(ViewerFilter filter) {
		processesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#isContainedInProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInProcessesTable(EObject element) {
		return ((ReferencesTableSettings)processes.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#getModel()
	 * 
	 */
	public String getModel() {
		return model.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#setModel(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#getOrganizationUnit()
	 * 
	 */
	public EObject getOrganizationUnit() {
		if (organizationUnit.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) organizationUnit.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#initOrganizationUnit(EObjectFlatComboSettings)
	 */
	public void initOrganizationUnit(EObjectFlatComboSettings settings) {
		organizationUnit.setInput(settings);
		if (current != null) {
			organizationUnit.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#setOrganizationUnit(EObject newValue)
	 * 
	 */
	public void setOrganizationUnit(EObject newValue) {
		if (newValue != null) {
			organizationUnit.setSelection(new StructuredSelection(newValue));
		} else {
			organizationUnit.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#setOrganizationUnitButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOrganizationUnitButtonMode(ButtonsModeEnum newValue) {
		organizationUnit.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#addFilterOrganizationUnit(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOrganizationUnit(ViewerFilter filter) {
		organizationUnit.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#addBusinessFilterOrganizationUnit(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOrganizationUnit(ViewerFilter filter) {
		organizationUnit.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#initServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#updateServices()
	 * 
	 */
	public void updateServices() {
	services.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#addFilterServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToServices(ViewerFilter filter) {
		servicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#addBusinessFilterServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToServices(ViewerFilter filter) {
		servicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#isContainedInServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInServicesTable(EObject element) {
		return ((ReferencesTableSettings)services.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#getCapability()
	 * 
	 */
	public String getCapability() {
		return capability.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#setCapability(String newValue)
	 * 
	 */
	public void setCapability(String newValue) {
		if (newValue != null) {
			capability.setText(newValue);
		} else {
			capability.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#getConstraint()
	 * 
	 */
	public String getConstraint() {
		return constraint.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#setConstraint(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#getOperationMode()
	 * 
	 */
	public String getOperationMode() {
		return operationMode.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#setOperationMode(String newValue)
	 * 
	 */
	public void setOperationMode(String newValue) {
		if (newValue != null) {
			operationMode.setText(newValue);
		} else {
			operationMode.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#getTechnicalCharacteristics()
	 * 
	 */
	public String getTechnicalCharacteristics() {
		return technicalCharacteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#setTechnicalCharacteristics(String newValue)
	 * 
	 */
	public void setTechnicalCharacteristics(String newValue) {
		if (newValue != null) {
			technicalCharacteristics.setText(newValue);
		} else {
			technicalCharacteristics.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#getExpectedPerformance()
	 * 
	 */
	public String getExpectedPerformance() {
		return expectedPerformance.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart#setExpectedPerformance(String newValue)
	 * 
	 */
	public void setExpectedPerformance(String newValue) {
		if (newValue != null) {
			expectedPerformance.setText(newValue);
		} else {
			expectedPerformance.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return PhysicalMeanRelatedPartMessages.TimPhysicalMeanResource_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
