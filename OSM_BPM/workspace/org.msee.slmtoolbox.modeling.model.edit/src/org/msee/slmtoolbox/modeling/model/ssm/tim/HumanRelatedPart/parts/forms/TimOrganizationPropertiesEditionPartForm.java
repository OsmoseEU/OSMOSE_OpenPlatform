/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
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
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.TimOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.HumanRelatedPartViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.providers.HumanRelatedPartMessages;
import org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs.TimAddProcessToOrganizationDialog;

// End of user code

/**
 * 
 * 
 */
public class TimOrganizationPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TimOrganizationPropertiesEditionPart {

	protected Text name;
	protected Text type;
	protected Text description;
	protected Text responsibility;
	protected Text authorization;
	protected ReferencesTable processes;
	protected List<ViewerFilter> processesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> processesFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public TimOrganizationPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TimOrganizationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence timOrganizationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = timOrganizationStep.addStep(HumanRelatedPartViewsRepository.TimOrganization.Properties.class);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimOrganization.Properties.name);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimOrganization.Properties.type);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimOrganization.Properties.description);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimOrganization.Properties.responsibility);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimOrganization.Properties.authorization);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimOrganization.Properties.processes);
		
		
		composer = new PartComposer(timOrganizationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == HumanRelatedPartViewsRepository.TimOrganization.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimOrganization.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimOrganization.Properties.type) {
					return createTypeText(widgetFactory, parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimOrganization.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimOrganization.Properties.responsibility) {
					return createResponsibilityText(widgetFactory, parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimOrganization.Properties.authorization) {
					return createAuthorizationText(widgetFactory, parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimOrganization.Properties.processes) {
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
		propertiesSection.setText(HumanRelatedPartMessages.TimOrganizationPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, HumanRelatedPartViewsRepository.TimOrganization.Properties.name, HumanRelatedPartMessages.TimOrganizationPropertiesEditionPart_NameLabel);
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
							TimOrganizationPropertiesEditionPartForm.this,
							HumanRelatedPartViewsRepository.TimOrganization.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimOrganizationPropertiesEditionPartForm.this,
									HumanRelatedPartViewsRepository.TimOrganization.Properties.name,
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
									TimOrganizationPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimOrganizationPropertiesEditionPartForm.this, HumanRelatedPartViewsRepository.TimOrganization.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, HumanRelatedPartViewsRepository.TimOrganization.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimOrganization.Properties.name, HumanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HumanRelatedPartViewsRepository.TimOrganization.Properties.type, HumanRelatedPartMessages.TimOrganizationPropertiesEditionPart_TypeLabel);
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
							TimOrganizationPropertiesEditionPartForm.this,
							HumanRelatedPartViewsRepository.TimOrganization.Properties.type,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimOrganizationPropertiesEditionPartForm.this,
									HumanRelatedPartViewsRepository.TimOrganization.Properties.type,
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
									TimOrganizationPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimOrganizationPropertiesEditionPartForm.this, HumanRelatedPartViewsRepository.TimOrganization.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
				}
			}
		});
		EditingUtils.setID(type, HumanRelatedPartViewsRepository.TimOrganization.Properties.type);
		EditingUtils.setEEFtype(type, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimOrganization.Properties.type, HumanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HumanRelatedPartViewsRepository.TimOrganization.Properties.description, HumanRelatedPartMessages.TimOrganizationPropertiesEditionPart_DescriptionLabel);
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
							TimOrganizationPropertiesEditionPartForm.this,
							HumanRelatedPartViewsRepository.TimOrganization.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimOrganizationPropertiesEditionPartForm.this,
									HumanRelatedPartViewsRepository.TimOrganization.Properties.description,
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
									TimOrganizationPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimOrganizationPropertiesEditionPartForm.this, HumanRelatedPartViewsRepository.TimOrganization.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, HumanRelatedPartViewsRepository.TimOrganization.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimOrganization.Properties.description, HumanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createResponsibilityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HumanRelatedPartViewsRepository.TimOrganization.Properties.responsibility, HumanRelatedPartMessages.TimOrganizationPropertiesEditionPart_ResponsibilityLabel);
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
							TimOrganizationPropertiesEditionPartForm.this,
							HumanRelatedPartViewsRepository.TimOrganization.Properties.responsibility,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, responsibility.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimOrganizationPropertiesEditionPartForm.this,
									HumanRelatedPartViewsRepository.TimOrganization.Properties.responsibility,
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
									TimOrganizationPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimOrganizationPropertiesEditionPartForm.this, HumanRelatedPartViewsRepository.TimOrganization.Properties.responsibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, responsibility.getText()));
				}
			}
		});
		EditingUtils.setID(responsibility, HumanRelatedPartViewsRepository.TimOrganization.Properties.responsibility);
		EditingUtils.setEEFtype(responsibility, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimOrganization.Properties.responsibility, HumanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAuthorizationText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, HumanRelatedPartViewsRepository.TimOrganization.Properties.authorization, HumanRelatedPartMessages.TimOrganizationPropertiesEditionPart_AuthorizationLabel);
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
							TimOrganizationPropertiesEditionPartForm.this,
							HumanRelatedPartViewsRepository.TimOrganization.Properties.authorization,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, authorization.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimOrganizationPropertiesEditionPartForm.this,
									HumanRelatedPartViewsRepository.TimOrganization.Properties.authorization,
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
									TimOrganizationPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimOrganizationPropertiesEditionPartForm.this, HumanRelatedPartViewsRepository.TimOrganization.Properties.authorization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, authorization.getText()));
				}
			}
		});
		EditingUtils.setID(authorization, HumanRelatedPartViewsRepository.TimOrganization.Properties.authorization);
		EditingUtils.setEEFtype(authorization, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimOrganization.Properties.authorization, HumanRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createProcessesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.processes = new ReferencesTable(getDescription(HumanRelatedPartViewsRepository.TimOrganization.Properties.processes, HumanRelatedPartMessages.TimOrganizationPropertiesEditionPart_ProcessesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addProcesses(); }
			public void handleEdit(EObject element) { editProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.processes.setHelpText(propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimOrganization.Properties.processes, HumanRelatedPartViewsRepository.FORM_KIND));
		this.processes.createControls(parent, widgetFactory);
		this.processes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimOrganizationPropertiesEditionPartForm.this, HumanRelatedPartViewsRepository.TimOrganization.Properties.processes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData processesData = new GridData(GridData.FILL_HORIZONTAL);
		processesData.horizontalSpan = 3;
		this.processes.setLayoutData(processesData);
		this.processes.disableMove();
		processes.setID(HumanRelatedPartViewsRepository.TimOrganization.Properties.processes);
		processes.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addProcesses() {
		// Start of user code
		TimAddProcessToOrganizationDialog dialog = new TimAddProcessToOrganizationDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), processes.getLabelProvider(), (TimOrganization) ((ReferencesTableSettings)this.processes.getInput()).getSource());		
		dialog.open();
		processes.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveProcesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimOrganizationPropertiesEditionPartForm.this, HumanRelatedPartViewsRepository.TimOrganization.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processes.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimOrganizationPropertiesEditionPartForm.this, HumanRelatedPartViewsRepository.TimOrganization.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationPropertiesEditionPart#getType()
	 * 
	 */
	public String getType() {
		return type.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationPropertiesEditionPart#setType(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationPropertiesEditionPart#getResponsibility()
	 * 
	 */
	public String getResponsibility() {
		return responsibility.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationPropertiesEditionPart#setResponsibility(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationPropertiesEditionPart#getAuthorization()
	 * 
	 */
	public String getAuthorization() {
		return authorization.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationPropertiesEditionPart#setAuthorization(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationPropertiesEditionPart#initProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationPropertiesEditionPart#updateProcesses()
	 * 
	 */
	public void updateProcesses() {
	processes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationPropertiesEditionPart#addFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcesses(ViewerFilter filter) {
		processesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationPropertiesEditionPart#addBusinessFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcesses(ViewerFilter filter) {
		processesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimOrganizationPropertiesEditionPart#isContainedInProcessesTable(EObject element)
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
		return HumanRelatedPartMessages.TimOrganization_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
