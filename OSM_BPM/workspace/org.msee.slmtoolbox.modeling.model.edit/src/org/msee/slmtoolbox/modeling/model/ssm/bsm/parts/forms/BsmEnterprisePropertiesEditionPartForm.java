/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
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
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs.BsmAddDecisionStructureToOrganizationDialog;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs.BsmAddDecisionToOrganizationDialog;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs.BsmAddMseServiceToOrganizationDialog;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs.BsmAddProcessToOrganizationDialog;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs.BsmAddVeParticipationToEnterpriseDialog;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmEnterprisePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, BsmEnterprisePropertiesEditionPart {

	protected Text name;
	protected Text description;
	protected ReferencesTable processes;
	protected List<ViewerFilter> processesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> processesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable decisions;
	protected List<ViewerFilter> decisionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> decisionsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable decisionStructures;
	protected List<ViewerFilter> decisionStructuresBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> decisionStructuresFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ggOrganizations;
	protected List<ViewerFilter> ggOrganizationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ggOrganizationsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable eaOrganizations;
	protected List<ViewerFilter> eaOrganizationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> eaOrganizationsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable mseService;
	protected List<ViewerFilter> mseServiceBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> mseServiceFilters = new ArrayList<ViewerFilter>();
	protected Text type;
	protected ReferencesTable veParticipations;
	protected List<ViewerFilter> veParticipationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> veParticipationsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public BsmEnterprisePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmEnterprisePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence bsmEnterpriseStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = bsmEnterpriseStep.addStep(BsmViewsRepository.BsmEnterprise.Properties.class);
		propertiesStep.addStep(BsmViewsRepository.BsmEnterprise.Properties.name);
		propertiesStep.addStep(BsmViewsRepository.BsmEnterprise.Properties.description);
		propertiesStep.addStep(BsmViewsRepository.BsmEnterprise.Properties.processes);
		propertiesStep.addStep(BsmViewsRepository.BsmEnterprise.Properties.decisions);
		propertiesStep.addStep(BsmViewsRepository.BsmEnterprise.Properties.decisionStructures);
		propertiesStep.addStep(BsmViewsRepository.BsmEnterprise.Properties.ggOrganizations);
		propertiesStep.addStep(BsmViewsRepository.BsmEnterprise.Properties.eaOrganizations);
		propertiesStep.addStep(BsmViewsRepository.BsmEnterprise.Properties.mseService);
		propertiesStep.addStep(BsmViewsRepository.BsmEnterprise.Properties.type);
		propertiesStep.addStep(BsmViewsRepository.BsmEnterprise.Properties.veParticipations);
		
		
		composer = new PartComposer(bsmEnterpriseStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == BsmViewsRepository.BsmEnterprise.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmEnterprise.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmEnterprise.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmEnterprise.Properties.processes) {
					return createProcessesReferencesTable(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmEnterprise.Properties.decisions) {
					return createDecisionsReferencesTable(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmEnterprise.Properties.decisionStructures) {
					return createDecisionStructuresReferencesTable(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmEnterprise.Properties.ggOrganizations) {
					return createGgOrganizationsReferencesTable(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmEnterprise.Properties.eaOrganizations) {
					return createEaOrganizationsReferencesTable(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmEnterprise.Properties.mseService) {
					return createMseServiceReferencesTable(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmEnterprise.Properties.type) {
					return createTypeText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmEnterprise.Properties.veParticipations) {
					return createVeParticipationsReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(BsmMessages.BsmEnterprisePropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, BsmViewsRepository.BsmEnterprise.Properties.name, BsmMessages.BsmEnterprisePropertiesEditionPart_NameLabel);
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
							BsmEnterprisePropertiesEditionPartForm.this,
							BsmViewsRepository.BsmEnterprise.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmEnterprisePropertiesEditionPartForm.this,
									BsmViewsRepository.BsmEnterprise.Properties.name,
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
									BsmEnterprisePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, BsmViewsRepository.BsmEnterprise.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmEnterprise.Properties.name, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmEnterprise.Properties.description, BsmMessages.BsmEnterprisePropertiesEditionPart_DescriptionLabel);
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
							BsmEnterprisePropertiesEditionPartForm.this,
							BsmViewsRepository.BsmEnterprise.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmEnterprisePropertiesEditionPartForm.this,
									BsmViewsRepository.BsmEnterprise.Properties.description,
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
									BsmEnterprisePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, BsmViewsRepository.BsmEnterprise.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmEnterprise.Properties.description, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createProcessesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.processes = new ReferencesTable(getDescription(BsmViewsRepository.BsmEnterprise.Properties.processes, BsmMessages.BsmEnterprisePropertiesEditionPart_ProcessesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addProcesses(); }
			public void handleEdit(EObject element) { editProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.processes.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmEnterprise.Properties.processes, BsmViewsRepository.FORM_KIND));
		this.processes.createControls(parent, widgetFactory);
		this.processes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.processes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData processesData = new GridData(GridData.FILL_HORIZONTAL);
		processesData.horizontalSpan = 3;
		this.processes.setLayoutData(processesData);
		this.processes.disableMove();
		processes.setID(BsmViewsRepository.BsmEnterprise.Properties.processes);
		processes.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addProcesses() {
		// Start of user code
		BsmAddProcessToOrganizationDialog dialog = new BsmAddProcessToOrganizationDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), processes.getLabelProvider(), (BsmOrganization) ((ReferencesTableSettings)this.processes.getInput()).getSource());		
		dialog.open();
		processes.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveProcesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processes.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createDecisionsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.decisions = new ReferencesTable(getDescription(BsmViewsRepository.BsmEnterprise.Properties.decisions, BsmMessages.BsmEnterprisePropertiesEditionPart_DecisionsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addDecisions(); }
			public void handleEdit(EObject element) { editDecisions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDecisions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDecisions(element); }
			public void navigateTo(EObject element) { }
		});
		this.decisions.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmEnterprise.Properties.decisions, BsmViewsRepository.FORM_KIND));
		this.decisions.createControls(parent, widgetFactory);
		this.decisions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.decisions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData decisionsData = new GridData(GridData.FILL_HORIZONTAL);
		decisionsData.horizontalSpan = 3;
		this.decisions.setLayoutData(decisionsData);
		this.decisions.disableMove();
		decisions.setID(BsmViewsRepository.BsmEnterprise.Properties.decisions);
		decisions.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addDecisions() {
		// Start of user code
		BsmAddDecisionToOrganizationDialog dialog = new BsmAddDecisionToOrganizationDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), decisions.getLabelProvider(), (BsmOrganization) ((ReferencesTableSettings)this.decisions.getInput()).getSource());		
		dialog.open();
		decisions.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveDecisions(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.decisions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		decisions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDecisions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.decisions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		decisions.refresh();
	}

	/**
	 * 
	 */
	protected void editDecisions(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				decisions.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createDecisionStructuresReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.decisionStructures = new ReferencesTable(getDescription(BsmViewsRepository.BsmEnterprise.Properties.decisionStructures, BsmMessages.BsmEnterprisePropertiesEditionPart_DecisionStructuresLabel), new ReferencesTableListener	() {
			public void handleAdd() { addDecisionStructures(); }
			public void handleEdit(EObject element) { editDecisionStructures(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveDecisionStructures(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromDecisionStructures(element); }
			public void navigateTo(EObject element) { }
		});
		this.decisionStructures.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmEnterprise.Properties.decisionStructures, BsmViewsRepository.FORM_KIND));
		this.decisionStructures.createControls(parent, widgetFactory);
		this.decisionStructures.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.decisionStructures, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData decisionStructuresData = new GridData(GridData.FILL_HORIZONTAL);
		decisionStructuresData.horizontalSpan = 3;
		this.decisionStructures.setLayoutData(decisionStructuresData);
		this.decisionStructures.disableMove();
		decisionStructures.setID(BsmViewsRepository.BsmEnterprise.Properties.decisionStructures);
		decisionStructures.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addDecisionStructures() {
		// Start of user code
		BsmAddDecisionStructureToOrganizationDialog dialog = new BsmAddDecisionStructureToOrganizationDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), decisionStructures.getLabelProvider(), (BsmOrganization) ((ReferencesTableSettings)this.decisionStructures.getInput()).getSource());		
		dialog.open();
		decisionStructures.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveDecisionStructures(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.decisionStructures, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		decisionStructures.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromDecisionStructures(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.decisionStructures, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		decisionStructures.refresh();
	}

	/**
	 * 
	 */
	protected void editDecisionStructures(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				decisionStructures.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createGgOrganizationsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.ggOrganizations = new ReferencesTable(getDescription(BsmViewsRepository.BsmEnterprise.Properties.ggOrganizations, BsmMessages.BsmEnterprisePropertiesEditionPart_GgOrganizationsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addGgOrganizations(); }
			public void handleEdit(EObject element) { editGgOrganizations(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGgOrganizations(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGgOrganizations(element); }
			public void navigateTo(EObject element) { }
		});
		this.ggOrganizations.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmEnterprise.Properties.ggOrganizations, BsmViewsRepository.FORM_KIND));
		this.ggOrganizations.createControls(parent, widgetFactory);
		this.ggOrganizations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.ggOrganizations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ggOrganizationsData = new GridData(GridData.FILL_HORIZONTAL);
		ggOrganizationsData.horizontalSpan = 3;
		this.ggOrganizations.setLayoutData(ggOrganizationsData);
		this.ggOrganizations.disableMove();
		ggOrganizations.setID(BsmViewsRepository.BsmEnterprise.Properties.ggOrganizations);
		ggOrganizations.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addGgOrganizations() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(ggOrganizations.getInput(), ggOrganizationsFilters, ggOrganizationsBusinessFilters,
		"ggOrganizations", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.ggOrganizations,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				ggOrganizations.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveGgOrganizations(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.ggOrganizations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		ggOrganizations.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGgOrganizations(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.ggOrganizations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		ggOrganizations.refresh();
	}

	/**
	 * 
	 */
	protected void editGgOrganizations(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				ggOrganizations.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createEaOrganizationsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.eaOrganizations = new ReferencesTable(getDescription(BsmViewsRepository.BsmEnterprise.Properties.eaOrganizations, BsmMessages.BsmEnterprisePropertiesEditionPart_EaOrganizationsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addEaOrganizations(); }
			public void handleEdit(EObject element) { editEaOrganizations(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveEaOrganizations(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromEaOrganizations(element); }
			public void navigateTo(EObject element) { }
		});
		this.eaOrganizations.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmEnterprise.Properties.eaOrganizations, BsmViewsRepository.FORM_KIND));
		this.eaOrganizations.createControls(parent, widgetFactory);
		this.eaOrganizations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.eaOrganizations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData eaOrganizationsData = new GridData(GridData.FILL_HORIZONTAL);
		eaOrganizationsData.horizontalSpan = 3;
		this.eaOrganizations.setLayoutData(eaOrganizationsData);
		this.eaOrganizations.disableMove();
		eaOrganizations.setID(BsmViewsRepository.BsmEnterprise.Properties.eaOrganizations);
		eaOrganizations.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addEaOrganizations() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(eaOrganizations.getInput(), eaOrganizationsFilters, eaOrganizationsBusinessFilters,
		"eaOrganizations", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.eaOrganizations,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				eaOrganizations.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveEaOrganizations(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.eaOrganizations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		eaOrganizations.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromEaOrganizations(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.eaOrganizations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		eaOrganizations.refresh();
	}

	/**
	 * 
	 */
	protected void editEaOrganizations(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				eaOrganizations.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createMseServiceReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.mseService = new ReferencesTable(getDescription(BsmViewsRepository.BsmEnterprise.Properties.mseService, BsmMessages.BsmEnterprisePropertiesEditionPart_MseServiceLabel), new ReferencesTableListener	() {
			public void handleAdd() { addMseService(); }
			public void handleEdit(EObject element) { editMseService(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveMseService(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromMseService(element); }
			public void navigateTo(EObject element) { }
		});
		this.mseService.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmEnterprise.Properties.mseService, BsmViewsRepository.FORM_KIND));
		this.mseService.createControls(parent, widgetFactory);
		this.mseService.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.mseService, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData mseServiceData = new GridData(GridData.FILL_HORIZONTAL);
		mseServiceData.horizontalSpan = 3;
		this.mseService.setLayoutData(mseServiceData);
		this.mseService.disableMove();
		mseService.setID(BsmViewsRepository.BsmEnterprise.Properties.mseService);
		mseService.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addMseService() {
		// Start of user code
		BsmAddMseServiceToOrganizationDialog dialog = new BsmAddMseServiceToOrganizationDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), mseService.getLabelProvider(), (BsmOrganization) ((ReferencesTableSettings)this.mseService.getInput()).getSource());		
		dialog.open();
		mseService.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveMseService(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.mseService, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		mseService.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromMseService(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.mseService, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		mseService.refresh();
	}

	/**
	 * 
	 */
	protected void editMseService(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				mseService.refresh();
			}
		}
	}

	
	protected Composite createTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmEnterprise.Properties.type, BsmMessages.BsmEnterprisePropertiesEditionPart_TypeLabel);
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
							BsmEnterprisePropertiesEditionPartForm.this,
							BsmViewsRepository.BsmEnterprise.Properties.type,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmEnterprisePropertiesEditionPartForm.this,
									BsmViewsRepository.BsmEnterprise.Properties.type,
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
									BsmEnterprisePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
				}
			}
		});
		EditingUtils.setID(type, BsmViewsRepository.BsmEnterprise.Properties.type);
		EditingUtils.setEEFtype(type, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmEnterprise.Properties.type, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createVeParticipationsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.veParticipations = new ReferencesTable(getDescription(BsmViewsRepository.BsmEnterprise.Properties.veParticipations, BsmMessages.BsmEnterprisePropertiesEditionPart_VeParticipationsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addVeParticipations(); }
			public void handleEdit(EObject element) { editVeParticipations(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveVeParticipations(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromVeParticipations(element); }
			public void navigateTo(EObject element) { }
		});
		this.veParticipations.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmEnterprise.Properties.veParticipations, BsmViewsRepository.FORM_KIND));
		this.veParticipations.createControls(parent, widgetFactory);
		this.veParticipations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.veParticipations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData veParticipationsData = new GridData(GridData.FILL_HORIZONTAL);
		veParticipationsData.horizontalSpan = 3;
		this.veParticipations.setLayoutData(veParticipationsData);
		this.veParticipations.disableMove();
		veParticipations.setID(BsmViewsRepository.BsmEnterprise.Properties.veParticipations);
		veParticipations.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addVeParticipations() {
		// Start of user code
		BsmAddVeParticipationToEnterpriseDialog dialog = new BsmAddVeParticipationToEnterpriseDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), veParticipations.getLabelProvider(), (BsmEnterprise) ((ReferencesTableSettings)this.veParticipations.getInput()).getSource());		
		dialog.open();
		veParticipations.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveVeParticipations(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.veParticipations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		veParticipations.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromVeParticipations(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmEnterprisePropertiesEditionPartForm.this, BsmViewsRepository.BsmEnterprise.Properties.veParticipations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		veParticipations.refresh();
	}

	/**
	 * 
	 */
	protected void editVeParticipations(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				veParticipations.refresh();
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#initProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#updateProcesses()
	 * 
	 */
	public void updateProcesses() {
	processes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#addFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcesses(ViewerFilter filter) {
		processesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#addBusinessFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcesses(ViewerFilter filter) {
		processesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#isContainedInProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInProcessesTable(EObject element) {
		return ((ReferencesTableSettings)processes.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#initDecisions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initDecisions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		decisions.setContentProvider(contentProvider);
		decisions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#updateDecisions()
	 * 
	 */
	public void updateDecisions() {
	decisions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#addFilterDecisions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecisions(ViewerFilter filter) {
		decisionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#addBusinessFilterDecisions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecisions(ViewerFilter filter) {
		decisionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#isContainedInDecisionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInDecisionsTable(EObject element) {
		return ((ReferencesTableSettings)decisions.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#initDecisionStructures(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initDecisionStructures(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		decisionStructures.setContentProvider(contentProvider);
		decisionStructures.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#updateDecisionStructures()
	 * 
	 */
	public void updateDecisionStructures() {
	decisionStructures.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#addFilterDecisionStructures(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecisionStructures(ViewerFilter filter) {
		decisionStructuresFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#addBusinessFilterDecisionStructures(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecisionStructures(ViewerFilter filter) {
		decisionStructuresBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#isContainedInDecisionStructuresTable(EObject element)
	 * 
	 */
	public boolean isContainedInDecisionStructuresTable(EObject element) {
		return ((ReferencesTableSettings)decisionStructures.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#initGgOrganizations(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initGgOrganizations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ggOrganizations.setContentProvider(contentProvider);
		ggOrganizations.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#updateGgOrganizations()
	 * 
	 */
	public void updateGgOrganizations() {
	ggOrganizations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#addFilterGgOrganizations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGgOrganizations(ViewerFilter filter) {
		ggOrganizationsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#addBusinessFilterGgOrganizations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGgOrganizations(ViewerFilter filter) {
		ggOrganizationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#isContainedInGgOrganizationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInGgOrganizationsTable(EObject element) {
		return ((ReferencesTableSettings)ggOrganizations.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#initEaOrganizations(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initEaOrganizations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		eaOrganizations.setContentProvider(contentProvider);
		eaOrganizations.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#updateEaOrganizations()
	 * 
	 */
	public void updateEaOrganizations() {
	eaOrganizations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#addFilterEaOrganizations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEaOrganizations(ViewerFilter filter) {
		eaOrganizationsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#addBusinessFilterEaOrganizations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEaOrganizations(ViewerFilter filter) {
		eaOrganizationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#isContainedInEaOrganizationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInEaOrganizationsTable(EObject element) {
		return ((ReferencesTableSettings)eaOrganizations.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#initMseService(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initMseService(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		mseService.setContentProvider(contentProvider);
		mseService.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#updateMseService()
	 * 
	 */
	public void updateMseService() {
	mseService.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#addFilterMseService(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMseService(ViewerFilter filter) {
		mseServiceFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#addBusinessFilterMseService(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMseService(ViewerFilter filter) {
		mseServiceBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#isContainedInMseServiceTable(EObject element)
	 * 
	 */
	public boolean isContainedInMseServiceTable(EObject element) {
		return ((ReferencesTableSettings)mseService.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#getType()
	 * 
	 */
	public String getType() {
		return type.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#setType(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#initVeParticipations(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initVeParticipations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		veParticipations.setContentProvider(contentProvider);
		veParticipations.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#updateVeParticipations()
	 * 
	 */
	public void updateVeParticipations() {
	veParticipations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#addFilterVeParticipations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToVeParticipations(ViewerFilter filter) {
		veParticipationsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#addBusinessFilterVeParticipations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToVeParticipations(ViewerFilter filter) {
		veParticipationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmEnterprisePropertiesEditionPart#isContainedInVeParticipationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInVeParticipationsTable(EObject element) {
		return ((ReferencesTableSettings)veParticipations.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return BsmMessages.BsmEnterprise_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
