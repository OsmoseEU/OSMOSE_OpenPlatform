/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl;

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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmProcessPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmProcessPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, BsmProcessPropertiesEditionPart {

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
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmProcessPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.name) {
					return createNameText(parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.objective) {
					return createObjectiveText(parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.trigger) {
					return createTriggerText(parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.result) {
					return createResultText(parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.constraint) {
					return createConstraintText(parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.subProcess) {
					return createSubProcessAdvancedReferencesTable(parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.mainProcess) {
					return createMainProcessFlatComboViewer(parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.resources) {
					return createResourcesAdvancedReferencesTable(parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.organizations) {
					return createOrganizationsAdvancedReferencesTable(parent);
				}
				if (key == BsmViewsRepository.BsmProcess.Properties.eaProcess) {
					return createEaProcessFlatComboViewer(parent);
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
		propertiesGroup.setText(BsmMessages.BsmProcessPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmProcess.Properties.name, BsmMessages.BsmProcessPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, BsmViewsRepository.BsmProcess.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.name, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createObjectiveText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmProcess.Properties.objective, BsmMessages.BsmProcessPropertiesEditionPart_ObjectiveLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.objective, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, objective.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.objective, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, objective.getText()));
				}
			}

		});
		EditingUtils.setID(objective, BsmViewsRepository.BsmProcess.Properties.objective);
		EditingUtils.setEEFtype(objective, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.objective, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTriggerText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmProcess.Properties.trigger, BsmMessages.BsmProcessPropertiesEditionPart_TriggerLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.trigger, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, trigger.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.trigger, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, trigger.getText()));
				}
			}

		});
		EditingUtils.setID(trigger, BsmViewsRepository.BsmProcess.Properties.trigger);
		EditingUtils.setEEFtype(trigger, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.trigger, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createResultText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmProcess.Properties.result, BsmMessages.BsmProcessPropertiesEditionPart_ResultLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.result, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, result.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.result, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, result.getText()));
				}
			}

		});
		EditingUtils.setID(result, BsmViewsRepository.BsmProcess.Properties.result);
		EditingUtils.setEEFtype(result, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.result, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConstraintText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmProcess.Properties.constraint, BsmMessages.BsmProcessPropertiesEditionPart_ConstraintLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
				}
			}

		});
		EditingUtils.setID(constraint, BsmViewsRepository.BsmProcess.Properties.constraint);
		EditingUtils.setEEFtype(constraint, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.constraint, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSubProcessAdvancedReferencesTable(Composite parent) {
		String label = getDescription(BsmViewsRepository.BsmProcess.Properties.subProcess, BsmMessages.BsmProcessPropertiesEditionPart_SubProcessLabel);		 
		this.subProcess = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addSubProcess(); }
			public void handleEdit(EObject element) { editSubProcess(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSubProcess(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSubProcess(element); }
			public void navigateTo(EObject element) { }
		});
		this.subProcess.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.subProcess, BsmViewsRepository.SWT_KIND));
		this.subProcess.createControls(parent);
		this.subProcess.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.subProcess, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(subProcess.getInput(), subProcessFilters, subProcessBusinessFilters,
		"subProcess", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.subProcess,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				subProcess.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveSubProcess(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.subProcess, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		subProcess.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSubProcess(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.subProcess, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * 
	 */
	protected Composite createMainProcessFlatComboViewer(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmProcess.Properties.mainProcess, BsmMessages.BsmProcessPropertiesEditionPart_MainProcessLabel);
		mainProcess = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmProcess.Properties.mainProcess, BsmViewsRepository.SWT_KIND));
		mainProcess.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		mainProcess.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.mainProcess, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getMainProcess()));
			}

		});
		GridData mainProcessData = new GridData(GridData.FILL_HORIZONTAL);
		mainProcess.setLayoutData(mainProcessData);
		mainProcess.setID(BsmViewsRepository.BsmProcess.Properties.mainProcess);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.mainProcess, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createResourcesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(BsmViewsRepository.BsmProcess.Properties.resources, BsmMessages.BsmProcessPropertiesEditionPart_ResourcesLabel);		 
		this.resources = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addResources(); }
			public void handleEdit(EObject element) { editResources(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveResources(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromResources(element); }
			public void navigateTo(EObject element) { }
		});
		this.resources.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.resources, BsmViewsRepository.SWT_KIND));
		this.resources.createControls(parent);
		this.resources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.resources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(resources.getInput(), resourcesFilters, resourcesBusinessFilters,
		"resources", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.resources,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		resources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createOrganizationsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(BsmViewsRepository.BsmProcess.Properties.organizations, BsmMessages.BsmProcessPropertiesEditionPart_OrganizationsLabel);		 
		this.organizations = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addOrganizations(); }
			public void handleEdit(EObject element) { editOrganizations(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOrganizations(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOrganizations(element); }
			public void navigateTo(EObject element) { }
		});
		this.organizations.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.organizations, BsmViewsRepository.SWT_KIND));
		this.organizations.createControls(parent);
		this.organizations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.organizations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(organizations.getInput(), organizationsFilters, organizationsBusinessFilters,
		"organizations", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.organizations,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.organizations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		organizations.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOrganizations(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.organizations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * 
	 */
	protected Composite createEaProcessFlatComboViewer(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmProcess.Properties.eaProcess, BsmMessages.BsmProcessPropertiesEditionPart_EaProcessLabel);
		eaProcess = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmProcess.Properties.eaProcess, BsmViewsRepository.SWT_KIND));
		eaProcess.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		eaProcess.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmProcessPropertiesEditionPartImpl.this, BsmViewsRepository.BsmProcess.Properties.eaProcess, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getEaProcess()));
			}

		});
		GridData eaProcessData = new GridData(GridData.FILL_HORIZONTAL);
		eaProcess.setLayoutData(eaProcessData);
		eaProcess.setID(BsmViewsRepository.BsmProcess.Properties.eaProcess);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmProcess.Properties.eaProcess, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
