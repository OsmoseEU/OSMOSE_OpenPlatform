/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
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
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.CommonConceptsViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts.TimProcessPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.providers.CommonConceptsMessages;

// End of user code

/**
 * 
 * 
 */
public class TimProcessPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TimProcessPropertiesEditionPart {

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
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TimProcessPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
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
					return createPropertiesGroup(parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.name) {
					return createNameText(parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.objective) {
					return createObjectiveText(parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.trigger) {
					return createTriggerText(parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.result) {
					return createResultText(parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.constraint) {
					return createConstraintText(parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.workFlow) {
					return createWorkFlowText(parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.subprocesses) {
					return createSubprocessesAdvancedReferencesTable(parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.mainProcess) {
					return createMainProcessFlatComboViewer(parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.services) {
					return createServicesAdvancedReferencesTable(parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.resources) {
					return createResourcesAdvancedReferencesTable(parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.responsibleOrganizationUnit) {
					return createResponsibleOrganizationUnitFlatComboViewer(parent);
				}
				if (key == CommonConceptsViewsRepository.TimProcess.Properties.organizations) {
					return createOrganizationsAdvancedReferencesTable(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(CommonConceptsMessages.TimProcessPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimProcess.Properties.name, CommonConceptsMessages.TimProcessPropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, CommonConceptsViewsRepository.TimProcess.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.name, CommonConceptsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createObjectiveText(Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimProcess.Properties.objective, CommonConceptsMessages.TimProcessPropertiesEditionPart_ObjectiveLabel);
		objective = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData objectiveData = new GridData(GridData.FILL_HORIZONTAL);
		objective.setLayoutData(objectiveData);
		objective.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.objective, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, objective.getText()));
			}

		});
		objective.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.objective, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, objective.getText()));
				}
			}

		});
		EditingUtils.setID(objective, CommonConceptsViewsRepository.TimProcess.Properties.objective);
		EditingUtils.setEEFtype(objective, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.objective, CommonConceptsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTriggerText(Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimProcess.Properties.trigger, CommonConceptsMessages.TimProcessPropertiesEditionPart_TriggerLabel);
		trigger = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData triggerData = new GridData(GridData.FILL_HORIZONTAL);
		trigger.setLayoutData(triggerData);
		trigger.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.trigger, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, trigger.getText()));
			}

		});
		trigger.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.trigger, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, trigger.getText()));
				}
			}

		});
		EditingUtils.setID(trigger, CommonConceptsViewsRepository.TimProcess.Properties.trigger);
		EditingUtils.setEEFtype(trigger, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.trigger, CommonConceptsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createResultText(Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimProcess.Properties.result, CommonConceptsMessages.TimProcessPropertiesEditionPart_ResultLabel);
		result = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData resultData = new GridData(GridData.FILL_HORIZONTAL);
		result.setLayoutData(resultData);
		result.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.result, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, result.getText()));
			}

		});
		result.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.result, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, result.getText()));
				}
			}

		});
		EditingUtils.setID(result, CommonConceptsViewsRepository.TimProcess.Properties.result);
		EditingUtils.setEEFtype(result, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.result, CommonConceptsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConstraintText(Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimProcess.Properties.constraint, CommonConceptsMessages.TimProcessPropertiesEditionPart_ConstraintLabel);
		constraint = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData constraintData = new GridData(GridData.FILL_HORIZONTAL);
		constraint.setLayoutData(constraintData);
		constraint.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
			}

		});
		constraint.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
				}
			}

		});
		EditingUtils.setID(constraint, CommonConceptsViewsRepository.TimProcess.Properties.constraint);
		EditingUtils.setEEFtype(constraint, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.constraint, CommonConceptsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createWorkFlowText(Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimProcess.Properties.workFlow, CommonConceptsMessages.TimProcessPropertiesEditionPart_WorkFlowLabel);
		workFlow = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData workFlowData = new GridData(GridData.FILL_HORIZONTAL);
		workFlow.setLayoutData(workFlowData);
		workFlow.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.workFlow, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, workFlow.getText()));
			}

		});
		workFlow.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.workFlow, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, workFlow.getText()));
				}
			}

		});
		EditingUtils.setID(workFlow, CommonConceptsViewsRepository.TimProcess.Properties.workFlow);
		EditingUtils.setEEFtype(workFlow, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.workFlow, CommonConceptsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSubprocessesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(CommonConceptsViewsRepository.TimProcess.Properties.subprocesses, CommonConceptsMessages.TimProcessPropertiesEditionPart_SubprocessesLabel);		 
		this.subprocesses = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addSubprocesses(); }
			public void handleEdit(EObject element) { editSubprocesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSubprocesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSubprocesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.subprocesses.setHelpText(propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.subprocesses, CommonConceptsViewsRepository.SWT_KIND));
		this.subprocesses.createControls(parent);
		this.subprocesses.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.subprocesses, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(subprocesses.getInput(), subprocessesFilters, subprocessesBusinessFilters,
		"subprocesses", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.subprocesses,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				subprocesses.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSubprocesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.subprocesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		subprocesses.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSubprocesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.subprocesses, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * 
	 */
	protected Composite createMainProcessFlatComboViewer(Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimProcess.Properties.mainProcess, CommonConceptsMessages.TimProcessPropertiesEditionPart_MainProcessLabel);
		mainProcess = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CommonConceptsViewsRepository.TimProcess.Properties.mainProcess, CommonConceptsViewsRepository.SWT_KIND));
		mainProcess.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		mainProcess.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.mainProcess, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getMainProcess()));
			}

		});
		GridData mainProcessData = new GridData(GridData.FILL_HORIZONTAL);
		mainProcess.setLayoutData(mainProcessData);
		mainProcess.setID(CommonConceptsViewsRepository.TimProcess.Properties.mainProcess);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.mainProcess, CommonConceptsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(CommonConceptsViewsRepository.TimProcess.Properties.services, CommonConceptsMessages.TimProcessPropertiesEditionPart_ServicesLabel);		 
		this.services = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addServices(); }
			public void handleEdit(EObject element) { editServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.services.setHelpText(propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.services, CommonConceptsViewsRepository.SWT_KIND));
		this.services.createControls(parent);
		this.services.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.services, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(services.getInput(), servicesFilters, servicesBusinessFilters,
		"services", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.services,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				services.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveServices(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		services.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createResourcesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(CommonConceptsViewsRepository.TimProcess.Properties.resources, CommonConceptsMessages.TimProcessPropertiesEditionPart_ResourcesLabel);		 
		this.resources = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addResources(); }
			public void handleEdit(EObject element) { editResources(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveResources(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromResources(element); }
			public void navigateTo(EObject element) { }
		});
		this.resources.setHelpText(propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.resources, CommonConceptsViewsRepository.SWT_KIND));
		this.resources.createControls(parent);
		this.resources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.resources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(resources.getInput(), resourcesFilters, resourcesBusinessFilters,
		"resources", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.resources,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				resources.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveResources(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		resources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * 
	 */
	protected Composite createResponsibleOrganizationUnitFlatComboViewer(Composite parent) {
		createDescription(parent, CommonConceptsViewsRepository.TimProcess.Properties.responsibleOrganizationUnit, CommonConceptsMessages.TimProcessPropertiesEditionPart_ResponsibleOrganizationUnitLabel);
		responsibleOrganizationUnit = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(CommonConceptsViewsRepository.TimProcess.Properties.responsibleOrganizationUnit, CommonConceptsViewsRepository.SWT_KIND));
		responsibleOrganizationUnit.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		responsibleOrganizationUnit.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.responsibleOrganizationUnit, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getResponsibleOrganizationUnit()));
			}

		});
		GridData responsibleOrganizationUnitData = new GridData(GridData.FILL_HORIZONTAL);
		responsibleOrganizationUnit.setLayoutData(responsibleOrganizationUnitData);
		responsibleOrganizationUnit.setID(CommonConceptsViewsRepository.TimProcess.Properties.responsibleOrganizationUnit);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.responsibleOrganizationUnit, CommonConceptsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createOrganizationsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(CommonConceptsViewsRepository.TimProcess.Properties.organizations, CommonConceptsMessages.TimProcessPropertiesEditionPart_OrganizationsLabel);		 
		this.organizations = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addOrganizations(); }
			public void handleEdit(EObject element) { editOrganizations(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOrganizations(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOrganizations(element); }
			public void navigateTo(EObject element) { }
		});
		this.organizations.setHelpText(propertiesEditionComponent.getHelpContent(CommonConceptsViewsRepository.TimProcess.Properties.organizations, CommonConceptsViewsRepository.SWT_KIND));
		this.organizations.createControls(parent);
		this.organizations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.organizations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(organizations.getInput(), organizationsFilters, organizationsBusinessFilters,
		"organizations", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.organizations,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				organizations.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOrganizations(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.organizations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		organizations.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOrganizations(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimProcessPropertiesEditionPartImpl.this, CommonConceptsViewsRepository.TimProcess.Properties.organizations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
