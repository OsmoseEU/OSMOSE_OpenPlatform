/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.impl;

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

import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.PhysicalMeanRelatedPartViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.parts.TimPhysicalMeanResourcePropertiesEditionPart;

import org.msee.slmtoolbox.modeling.model.ssm.tim.PhysicalMeanRelatedPart.providers.PhysicalMeanRelatedPartMessages;

// End of user code

/**
 * 
 * 
 */
public class TimPhysicalMeanResourcePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TimPhysicalMeanResourcePropertiesEditionPart {

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
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TimPhysicalMeanResourcePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name) {
					return createNameText(parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function) {
					return createFunctionText(parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type) {
					return createTypeText(parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes) {
					return createProcessesAdvancedReferencesTable(parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.model) {
					return createModelText(parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit) {
					return createOrganizationUnitFlatComboViewer(parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services) {
					return createServicesAdvancedReferencesTable(parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability) {
					return createCapabilityText(parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint) {
					return createConstraintText(parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode) {
					return createOperationModeText(parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics) {
					return createTechnicalCharacteristicsText(parent);
				}
				if (key == PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance) {
					return createExpectedPerformanceText(parent);
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
		propertiesGroup.setText(PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.name, PhysicalMeanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createFunctionText(Composite parent) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_FunctionLabel);
		function = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData functionData = new GridData(GridData.FILL_HORIZONTAL);
		function.setLayoutData(functionData);
		function.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, function.getText()));
			}

		});
		function.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, function.getText()));
				}
			}

		});
		EditingUtils.setID(function, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function);
		EditingUtils.setEEFtype(function, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.function, PhysicalMeanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeText(Composite parent) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_TypeLabel);
		type = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.setLayoutData(typeData);
		type.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
			}

		});
		type.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
				}
			}

		});
		EditingUtils.setID(type, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type);
		EditingUtils.setEEFtype(type, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.type, PhysicalMeanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createProcessesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_ProcessesLabel);		 
		this.processes = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addProcesses(); }
			public void handleEdit(EObject element) { editProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.processes.setHelpText(propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes, PhysicalMeanRelatedPartViewsRepository.SWT_KIND));
		this.processes.createControls(parent);
		this.processes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(processes.getInput(), processesFilters, processesBusinessFilters,
		"processes", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				processes.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveProcesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processes.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	
	protected Composite createModelText(Composite parent) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.model, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_ModelLabel);
		model = SWTUtils.createScrollableText(parent, SWT.BORDER);
		model.setEnabled(false);
		model.setToolTipText(PhysicalMeanRelatedPartMessages.TimPhysicalMeanResource_ReadOnly);
		GridData modelData = new GridData(GridData.FILL_HORIZONTAL);
		model.setLayoutData(modelData);
		model.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.model, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, model.getText()));
			}

		});
		model.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.model, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, model.getText()));
				}
			}

		});
		EditingUtils.setID(model, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.model);
		EditingUtils.setEEFtype(model, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.model, PhysicalMeanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createOrganizationUnitFlatComboViewer(Composite parent) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_OrganizationUnitLabel);
		organizationUnit = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit, PhysicalMeanRelatedPartViewsRepository.SWT_KIND));
		organizationUnit.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		organizationUnit.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOrganizationUnit()));
			}

		});
		GridData organizationUnitData = new GridData(GridData.FILL_HORIZONTAL);
		organizationUnit.setLayoutData(organizationUnitData);
		organizationUnit.setID(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.organizationUnit, PhysicalMeanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_ServicesLabel);		 
		this.services = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addServices(); }
			public void handleEdit(EObject element) { editServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.services.setHelpText(propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services, PhysicalMeanRelatedPartViewsRepository.SWT_KIND));
		this.services.createControls(parent);
		this.services.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(services.getInput(), servicesFilters, servicesBusinessFilters,
		"services", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		services.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	
	protected Composite createCapabilityText(Composite parent) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_CapabilityLabel);
		capability = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData capabilityData = new GridData(GridData.FILL_HORIZONTAL);
		capability.setLayoutData(capabilityData);
		capability.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capability.getText()));
			}

		});
		capability.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capability.getText()));
				}
			}

		});
		EditingUtils.setID(capability, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability);
		EditingUtils.setEEFtype(capability, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.capability, PhysicalMeanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConstraintText(Composite parent) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_ConstraintLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
				}
			}

		});
		EditingUtils.setID(constraint, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint);
		EditingUtils.setEEFtype(constraint, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.constraint, PhysicalMeanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOperationModeText(Composite parent) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_OperationModeLabel);
		operationMode = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData operationModeData = new GridData(GridData.FILL_HORIZONTAL);
		operationMode.setLayoutData(operationModeData);
		operationMode.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, operationMode.getText()));
			}

		});
		operationMode.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, operationMode.getText()));
				}
			}

		});
		EditingUtils.setID(operationMode, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode);
		EditingUtils.setEEFtype(operationMode, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.operationMode, PhysicalMeanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTechnicalCharacteristicsText(Composite parent) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_TechnicalCharacteristicsLabel);
		technicalCharacteristics = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData technicalCharacteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		technicalCharacteristics.setLayoutData(technicalCharacteristicsData);
		technicalCharacteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, technicalCharacteristics.getText()));
			}

		});
		technicalCharacteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, technicalCharacteristics.getText()));
				}
			}

		});
		EditingUtils.setID(technicalCharacteristics, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics);
		EditingUtils.setEEFtype(technicalCharacteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.technicalCharacteristics, PhysicalMeanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createExpectedPerformanceText(Composite parent) {
		createDescription(parent, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance, PhysicalMeanRelatedPartMessages.TimPhysicalMeanResourcePropertiesEditionPart_ExpectedPerformanceLabel);
		expectedPerformance = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData expectedPerformanceData = new GridData(GridData.FILL_HORIZONTAL);
		expectedPerformance.setLayoutData(expectedPerformanceData);
		expectedPerformance.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, expectedPerformance.getText()));
			}

		});
		expectedPerformance.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimPhysicalMeanResourcePropertiesEditionPartImpl.this, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, expectedPerformance.getText()));
				}
			}

		});
		EditingUtils.setID(expectedPerformance, PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance);
		EditingUtils.setEEFtype(expectedPerformance, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(PhysicalMeanRelatedPartViewsRepository.TimPhysicalMeanResource.Properties.expectedPerformance, PhysicalMeanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
