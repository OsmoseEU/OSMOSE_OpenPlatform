/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.forms;

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
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganizationUnit;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.HumanRelatedPartViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.providers.HumanRelatedPartMessages;
import org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs.TimAddProcessToOrganizationUnitDialog;

// End of user code

/**
 * 
 * 
 */
public class TimOrganizationUnitPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TimOrganizationUnitPropertiesEditionPart {

	protected Text name;
	protected Text function;
	protected Text responsibility;
	protected Text authorization;
	protected EObjectFlatComboViewer organization;
	protected ReferencesTable processes;
	protected List<ViewerFilter> processesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> processesFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public TimOrganizationUnitPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TimOrganizationUnitPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence timOrganizationUnitStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = timOrganizationUnitStep.addStep(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.class);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.name);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.function);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.responsibility);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.authorization);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.organization);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.processes);
		
		
		composer = new PartComposer(timOrganizationUnitStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.function) {
					return createFunctionText(widgetFactory, parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.responsibility) {
					return createResponsibilityText(widgetFactory, parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.authorization) {
					return createAuthorizationText(widgetFactory, parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.organization) {
					return createOrganizationFlatComboViewer(parent, widgetFactory);
				}
				if (key == HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.processes) {
					return createProcessesReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(HumanRelatedPartMessages.TimOrganizationUnitPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.name, HumanRelatedPartMessages.TimOrganizationUnitPropertiesEditionPart_NameLabel);
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
							TimOrganizationUnitPropertiesEditionPartForm.this,
							HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimOrganizationUnitPropertiesEditionPartForm.this,
									HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.name,
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
									TimOrganizationUnitPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimOrganizationUnitPropertiesEditionPartForm.this, HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.name, HumanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createFunctionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.function, HumanRelatedPartMessages.TimOrganizationUnitPropertiesEditionPart_FunctionLabel);
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
							TimOrganizationUnitPropertiesEditionPartForm.this,
							HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.function,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, function.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimOrganizationUnitPropertiesEditionPartForm.this,
									HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.function,
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
									TimOrganizationUnitPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimOrganizationUnitPropertiesEditionPartForm.this, HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.function, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, function.getText()));
				}
			}
		});
		EditingUtils.setID(function, HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.function);
		EditingUtils.setEEFtype(function, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.function, HumanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createResponsibilityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.responsibility, HumanRelatedPartMessages.TimOrganizationUnitPropertiesEditionPart_ResponsibilityLabel);
		responsibility = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		responsibility.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData responsibilityData = new GridData(GridData.FILL_HORIZONTAL);
		responsibility.setLayoutData(responsibilityData);
		responsibility.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimOrganizationUnitPropertiesEditionPartForm.this,
							HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.responsibility,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, responsibility.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimOrganizationUnitPropertiesEditionPartForm.this,
									HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.responsibility,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, responsibility.getText()));
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
									TimOrganizationUnitPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		responsibility.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimOrganizationUnitPropertiesEditionPartForm.this, HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.responsibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, responsibility.getText()));
				}
			}
		});
		EditingUtils.setID(responsibility, HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.responsibility);
		EditingUtils.setEEFtype(responsibility, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.responsibility, HumanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAuthorizationText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.authorization, HumanRelatedPartMessages.TimOrganizationUnitPropertiesEditionPart_AuthorizationLabel);
		authorization = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		authorization.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData authorizationData = new GridData(GridData.FILL_HORIZONTAL);
		authorization.setLayoutData(authorizationData);
		authorization.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimOrganizationUnitPropertiesEditionPartForm.this,
							HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.authorization,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, authorization.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimOrganizationUnitPropertiesEditionPartForm.this,
									HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.authorization,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, authorization.getText()));
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
									TimOrganizationUnitPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		authorization.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimOrganizationUnitPropertiesEditionPartForm.this, HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.authorization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, authorization.getText()));
				}
			}
		});
		EditingUtils.setID(authorization, HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.authorization);
		EditingUtils.setEEFtype(authorization, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.authorization, HumanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createOrganizationFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.organization, HumanRelatedPartMessages.TimOrganizationUnitPropertiesEditionPart_OrganizationLabel);
		organization = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.organization, HumanRelatedPartViewsRepository.FORM_KIND));
		widgetFactory.adapt(organization);
		organization.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData organizationData = new GridData(GridData.FILL_HORIZONTAL);
		organization.setLayoutData(organizationData);
		organization.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimOrganizationUnitPropertiesEditionPartForm.this, HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.organization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOrganization()));
			}

		});
		organization.setID(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.organization);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.organization, HumanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createProcessesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.processes = new ReferencesTable(getDescription(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.processes, HumanRelatedPartMessages.TimOrganizationUnitPropertiesEditionPart_ProcessesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addProcesses(); }
			public void handleEdit(EObject element) { editProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.processes.setHelpText(propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.processes, HumanRelatedPartViewsRepository.FORM_KIND));
		this.processes.createControls(parent, widgetFactory);
		this.processes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimOrganizationUnitPropertiesEditionPartForm.this, HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.processes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData processesData = new GridData(GridData.FILL_HORIZONTAL);
		processesData.horizontalSpan = 3;
		this.processes.setLayoutData(processesData);
		this.processes.disableMove();
		processes.setID(HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.processes);
		processes.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addProcesses() {
		// Start of user code
		TimAddProcessToOrganizationUnitDialog dialog = new TimAddProcessToOrganizationUnitDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), processes.getLabelProvider(), (TimOrganizationUnit) ((ReferencesTableSettings)this.processes.getInput()).getSource());		
		dialog.open();
		processes.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveProcesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimOrganizationUnitPropertiesEditionPartForm.this, HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processes.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimOrganizationUnitPropertiesEditionPartForm.this, HumanRelatedPartViewsRepository.TimOrganizationUnit.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#getFunction()
	 * 
	 */
	public String getFunction() {
		return function.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#setFunction(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#getResponsibility()
	 * 
	 */
	public String getResponsibility() {
		return responsibility.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#setResponsibility(String newValue)
	 * 
	 */
	public void setResponsibility(String newValue) {
		if (newValue != null) {
			responsibility.setText(newValue);
		} else {
			responsibility.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#getAuthorization()
	 * 
	 */
	public String getAuthorization() {
		return authorization.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#setAuthorization(String newValue)
	 * 
	 */
	public void setAuthorization(String newValue) {
		if (newValue != null) {
			authorization.setText(newValue);
		} else {
			authorization.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#getOrganization()
	 * 
	 */
	public EObject getOrganization() {
		if (organization.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) organization.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#initOrganization(EObjectFlatComboSettings)
	 */
	public void initOrganization(EObjectFlatComboSettings settings) {
		organization.setInput(settings);
		if (current != null) {
			organization.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#setOrganization(EObject newValue)
	 * 
	 */
	public void setOrganization(EObject newValue) {
		if (newValue != null) {
			organization.setSelection(new StructuredSelection(newValue));
		} else {
			organization.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#setOrganizationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOrganizationButtonMode(ButtonsModeEnum newValue) {
		organization.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#addFilterOrganization(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOrganization(ViewerFilter filter) {
		organization.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#addBusinessFilterOrganization(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOrganization(ViewerFilter filter) {
		organization.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#initProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#updateProcesses()
	 * 
	 */
	public void updateProcesses() {
	processes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#addFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcesses(ViewerFilter filter) {
		processesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#addBusinessFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcesses(ViewerFilter filter) {
		processesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationUnitPropertiesEditionPart#isContainedInProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInProcessesTable(EObject element) {
		return ((ReferencesTableSettings)processes.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return HumanRelatedPartMessages.TimOrganizationUnit_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
