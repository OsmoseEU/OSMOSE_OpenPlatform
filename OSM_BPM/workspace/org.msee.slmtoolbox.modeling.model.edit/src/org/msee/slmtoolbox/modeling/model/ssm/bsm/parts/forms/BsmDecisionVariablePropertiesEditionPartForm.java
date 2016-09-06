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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionVariable;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs.BsmAddPIToVariableDialog;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionVariablePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmDecisionVariablePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, BsmDecisionVariablePropertiesEditionPart {

	protected Text name;
	protected Text description;
	protected EObjectFlatComboViewer decision;
	protected ReferencesTable performanceIndicators;
	protected List<ViewerFilter> performanceIndicatorsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> performanceIndicatorsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public BsmDecisionVariablePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmDecisionVariablePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence bsmDecisionVariableStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = bsmDecisionVariableStep.addStep(BsmViewsRepository.BsmDecisionVariable.Properties.class);
		propertiesStep.addStep(BsmViewsRepository.BsmDecisionVariable.Properties.name);
		propertiesStep.addStep(BsmViewsRepository.BsmDecisionVariable.Properties.description);
		propertiesStep.addStep(BsmViewsRepository.BsmDecisionVariable.Properties.decision);
		propertiesStep.addStep(BsmViewsRepository.BsmDecisionVariable.Properties.performanceIndicators);
		
		
		composer = new PartComposer(bsmDecisionVariableStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == BsmViewsRepository.BsmDecisionVariable.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmDecisionVariable.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmDecisionVariable.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmDecisionVariable.Properties.decision) {
					return createDecisionFlatComboViewer(parent, widgetFactory);
				}
				if (key == BsmViewsRepository.BsmDecisionVariable.Properties.performanceIndicators) {
					return createPerformanceIndicatorsReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(BsmMessages.BsmDecisionVariablePropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, BsmViewsRepository.BsmDecisionVariable.Properties.name, BsmMessages.BsmDecisionVariablePropertiesEditionPart_NameLabel);
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
							BsmDecisionVariablePropertiesEditionPartForm.this,
							BsmViewsRepository.BsmDecisionVariable.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmDecisionVariablePropertiesEditionPartForm.this,
									BsmViewsRepository.BsmDecisionVariable.Properties.name,
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
									BsmDecisionVariablePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionVariablePropertiesEditionPartForm.this, BsmViewsRepository.BsmDecisionVariable.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, BsmViewsRepository.BsmDecisionVariable.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecisionVariable.Properties.name, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecisionVariable.Properties.description, BsmMessages.BsmDecisionVariablePropertiesEditionPart_DescriptionLabel);
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
							BsmDecisionVariablePropertiesEditionPartForm.this,
							BsmViewsRepository.BsmDecisionVariable.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmDecisionVariablePropertiesEditionPartForm.this,
									BsmViewsRepository.BsmDecisionVariable.Properties.description,
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
									BsmDecisionVariablePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionVariablePropertiesEditionPartForm.this, BsmViewsRepository.BsmDecisionVariable.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, BsmViewsRepository.BsmDecisionVariable.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecisionVariable.Properties.description, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createDecisionFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, BsmViewsRepository.BsmDecisionVariable.Properties.decision, BsmMessages.BsmDecisionVariablePropertiesEditionPart_DecisionLabel);
		decision = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmDecisionVariable.Properties.decision, BsmViewsRepository.FORM_KIND));
		widgetFactory.adapt(decision);
		decision.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData decisionData = new GridData(GridData.FILL_HORIZONTAL);
		decision.setLayoutData(decisionData);
		decision.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionVariablePropertiesEditionPartForm.this, BsmViewsRepository.BsmDecisionVariable.Properties.decision, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDecision()));
			}

		});
		decision.setID(BsmViewsRepository.BsmDecisionVariable.Properties.decision);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecisionVariable.Properties.decision, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createPerformanceIndicatorsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.performanceIndicators = new ReferencesTable(getDescription(BsmViewsRepository.BsmDecisionVariable.Properties.performanceIndicators, BsmMessages.BsmDecisionVariablePropertiesEditionPart_PerformanceIndicatorsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addPerformanceIndicators(); }
			public void handleEdit(EObject element) { editPerformanceIndicators(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { movePerformanceIndicators(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromPerformanceIndicators(element); }
			public void navigateTo(EObject element) { }
		});
		this.performanceIndicators.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecisionVariable.Properties.performanceIndicators, BsmViewsRepository.FORM_KIND));
		this.performanceIndicators.createControls(parent, widgetFactory);
		this.performanceIndicators.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionVariablePropertiesEditionPartForm.this, BsmViewsRepository.BsmDecisionVariable.Properties.performanceIndicators, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData performanceIndicatorsData = new GridData(GridData.FILL_HORIZONTAL);
		performanceIndicatorsData.horizontalSpan = 3;
		this.performanceIndicators.setLayoutData(performanceIndicatorsData);
		this.performanceIndicators.disableMove();
		performanceIndicators.setID(BsmViewsRepository.BsmDecisionVariable.Properties.performanceIndicators);
		performanceIndicators.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addPerformanceIndicators() {
		// Start of user code
		BsmAddPIToVariableDialog dialog = new BsmAddPIToVariableDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), performanceIndicators.getLabelProvider(), (BsmDecisionVariable) ((ReferencesTableSettings)this.performanceIndicators.getInput()).getSource());		
		dialog.open();
		performanceIndicators.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void movePerformanceIndicators(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionVariablePropertiesEditionPartForm.this, BsmViewsRepository.BsmDecisionVariable.Properties.performanceIndicators, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		performanceIndicators.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromPerformanceIndicators(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionVariablePropertiesEditionPartForm.this, BsmViewsRepository.BsmDecisionVariable.Properties.performanceIndicators, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		performanceIndicators.refresh();
	}

	/**
	 * 
	 */
	protected void editPerformanceIndicators(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				performanceIndicators.refresh();
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionVariablePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionVariablePropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionVariablePropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionVariablePropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionVariablePropertiesEditionPart#getDecision()
	 * 
	 */
	public EObject getDecision() {
		if (decision.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) decision.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionVariablePropertiesEditionPart#initDecision(EObjectFlatComboSettings)
	 */
	public void initDecision(EObjectFlatComboSettings settings) {
		decision.setInput(settings);
		if (current != null) {
			decision.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionVariablePropertiesEditionPart#setDecision(EObject newValue)
	 * 
	 */
	public void setDecision(EObject newValue) {
		if (newValue != null) {
			decision.setSelection(new StructuredSelection(newValue));
		} else {
			decision.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionVariablePropertiesEditionPart#setDecisionButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDecisionButtonMode(ButtonsModeEnum newValue) {
		decision.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionVariablePropertiesEditionPart#addFilterDecision(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecision(ViewerFilter filter) {
		decision.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionVariablePropertiesEditionPart#addBusinessFilterDecision(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecision(ViewerFilter filter) {
		decision.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionVariablePropertiesEditionPart#initPerformanceIndicators(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initPerformanceIndicators(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		performanceIndicators.setContentProvider(contentProvider);
		performanceIndicators.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionVariablePropertiesEditionPart#updatePerformanceIndicators()
	 * 
	 */
	public void updatePerformanceIndicators() {
	performanceIndicators.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionVariablePropertiesEditionPart#addFilterPerformanceIndicators(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPerformanceIndicators(ViewerFilter filter) {
		performanceIndicatorsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionVariablePropertiesEditionPart#addBusinessFilterPerformanceIndicators(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPerformanceIndicators(ViewerFilter filter) {
		performanceIndicatorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionVariablePropertiesEditionPart#isContainedInPerformanceIndicatorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInPerformanceIndicatorsTable(EObject element) {
		return ((ReferencesTableSettings)performanceIndicators.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return BsmMessages.BsmDecisionVariable_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
