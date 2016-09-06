/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.impl;

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

import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.HumanRelatedPartViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart;

import org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.providers.HumanRelatedPartMessages;

// End of user code

/**
 * 
 * 
 */
public class TimHumanResourcePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TimHumanResourcePropertiesEditionPart {

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
	protected Text skills;
	protected Text educationLevel;
	protected Text quantity;
	protected Text expectedPerformance;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TimHumanResourcePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence timHumanResourceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = timHumanResourceStep.addStep(HumanRelatedPartViewsRepository.TimHumanResource.Properties.class);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimHumanResource.Properties.name);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimHumanResource.Properties.function);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimHumanResource.Properties.type);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimHumanResource.Properties.processes);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimHumanResource.Properties.model);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimHumanResource.Properties.organizationUnit);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimHumanResource.Properties.services);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimHumanResource.Properties.capability);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimHumanResource.Properties.constraint);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimHumanResource.Properties.skills);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimHumanResource.Properties.educationLevel);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimHumanResource.Properties.quantity);
		propertiesStep.addStep(HumanRelatedPartViewsRepository.TimHumanResource.Properties.expectedPerformance);
		
		
		composer = new PartComposer(timHumanResourceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == HumanRelatedPartViewsRepository.TimHumanResource.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimHumanResource.Properties.name) {
					return createNameText(parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimHumanResource.Properties.function) {
					return createFunctionText(parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimHumanResource.Properties.type) {
					return createTypeText(parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimHumanResource.Properties.processes) {
					return createProcessesAdvancedReferencesTable(parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimHumanResource.Properties.model) {
					return createModelText(parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimHumanResource.Properties.organizationUnit) {
					return createOrganizationUnitFlatComboViewer(parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimHumanResource.Properties.services) {
					return createServicesAdvancedReferencesTable(parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimHumanResource.Properties.capability) {
					return createCapabilityText(parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimHumanResource.Properties.constraint) {
					return createConstraintText(parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimHumanResource.Properties.skills) {
					return createSkillsText(parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimHumanResource.Properties.educationLevel) {
					return createEducationLevelText(parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimHumanResource.Properties.quantity) {
					return createQuantityText(parent);
				}
				if (key == HumanRelatedPartViewsRepository.TimHumanResource.Properties.expectedPerformance) {
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
		propertiesGroup.setText(HumanRelatedPartMessages.TimHumanResourcePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, HumanRelatedPartViewsRepository.TimHumanResource.Properties.name, HumanRelatedPartMessages.TimHumanResourcePropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, HumanRelatedPartViewsRepository.TimHumanResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimHumanResource.Properties.name, HumanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createFunctionText(Composite parent) {
		createDescription(parent, HumanRelatedPartViewsRepository.TimHumanResource.Properties.function, HumanRelatedPartMessages.TimHumanResourcePropertiesEditionPart_FunctionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.function, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, function.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.function, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, function.getText()));
				}
			}

		});
		EditingUtils.setID(function, HumanRelatedPartViewsRepository.TimHumanResource.Properties.function);
		EditingUtils.setEEFtype(function, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimHumanResource.Properties.function, HumanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeText(Composite parent) {
		createDescription(parent, HumanRelatedPartViewsRepository.TimHumanResource.Properties.type, HumanRelatedPartMessages.TimHumanResourcePropertiesEditionPart_TypeLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
				}
			}

		});
		EditingUtils.setID(type, HumanRelatedPartViewsRepository.TimHumanResource.Properties.type);
		EditingUtils.setEEFtype(type, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimHumanResource.Properties.type, HumanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createProcessesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(HumanRelatedPartViewsRepository.TimHumanResource.Properties.processes, HumanRelatedPartMessages.TimHumanResourcePropertiesEditionPart_ProcessesLabel);		 
		this.processes = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addProcesses(); }
			public void handleEdit(EObject element) { editProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.processes.setHelpText(propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimHumanResource.Properties.processes, HumanRelatedPartViewsRepository.SWT_KIND));
		this.processes.createControls(parent);
		this.processes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.processes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData processesData = new GridData(GridData.FILL_HORIZONTAL);
		processesData.horizontalSpan = 3;
		this.processes.setLayoutData(processesData);
		this.processes.disableMove();
		processes.setID(HumanRelatedPartViewsRepository.TimHumanResource.Properties.processes);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.processes,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processes.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		createDescription(parent, HumanRelatedPartViewsRepository.TimHumanResource.Properties.model, HumanRelatedPartMessages.TimHumanResourcePropertiesEditionPart_ModelLabel);
		model = SWTUtils.createScrollableText(parent, SWT.BORDER);
		model.setEnabled(false);
		model.setToolTipText(HumanRelatedPartMessages.TimHumanResource_ReadOnly);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.model, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, model.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.model, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, model.getText()));
				}
			}

		});
		EditingUtils.setID(model, HumanRelatedPartViewsRepository.TimHumanResource.Properties.model);
		EditingUtils.setEEFtype(model, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimHumanResource.Properties.model, HumanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createOrganizationUnitFlatComboViewer(Composite parent) {
		createDescription(parent, HumanRelatedPartViewsRepository.TimHumanResource.Properties.organizationUnit, HumanRelatedPartMessages.TimHumanResourcePropertiesEditionPart_OrganizationUnitLabel);
		organizationUnit = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(HumanRelatedPartViewsRepository.TimHumanResource.Properties.organizationUnit, HumanRelatedPartViewsRepository.SWT_KIND));
		organizationUnit.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		organizationUnit.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.organizationUnit, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOrganizationUnit()));
			}

		});
		GridData organizationUnitData = new GridData(GridData.FILL_HORIZONTAL);
		organizationUnit.setLayoutData(organizationUnitData);
		organizationUnit.setID(HumanRelatedPartViewsRepository.TimHumanResource.Properties.organizationUnit);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimHumanResource.Properties.organizationUnit, HumanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(HumanRelatedPartViewsRepository.TimHumanResource.Properties.services, HumanRelatedPartMessages.TimHumanResourcePropertiesEditionPart_ServicesLabel);		 
		this.services = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addServices(); }
			public void handleEdit(EObject element) { editServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.services.setHelpText(propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimHumanResource.Properties.services, HumanRelatedPartViewsRepository.SWT_KIND));
		this.services.createControls(parent);
		this.services.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.services, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData servicesData = new GridData(GridData.FILL_HORIZONTAL);
		servicesData.horizontalSpan = 3;
		this.services.setLayoutData(servicesData);
		this.services.disableMove();
		services.setID(HumanRelatedPartViewsRepository.TimHumanResource.Properties.services);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.services,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		services.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		createDescription(parent, HumanRelatedPartViewsRepository.TimHumanResource.Properties.capability, HumanRelatedPartMessages.TimHumanResourcePropertiesEditionPart_CapabilityLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.capability, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capability.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.capability, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capability.getText()));
				}
			}

		});
		EditingUtils.setID(capability, HumanRelatedPartViewsRepository.TimHumanResource.Properties.capability);
		EditingUtils.setEEFtype(capability, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimHumanResource.Properties.capability, HumanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConstraintText(Composite parent) {
		createDescription(parent, HumanRelatedPartViewsRepository.TimHumanResource.Properties.constraint, HumanRelatedPartMessages.TimHumanResourcePropertiesEditionPart_ConstraintLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
				}
			}

		});
		EditingUtils.setID(constraint, HumanRelatedPartViewsRepository.TimHumanResource.Properties.constraint);
		EditingUtils.setEEFtype(constraint, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimHumanResource.Properties.constraint, HumanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSkillsText(Composite parent) {
		createDescription(parent, HumanRelatedPartViewsRepository.TimHumanResource.Properties.skills, HumanRelatedPartMessages.TimHumanResourcePropertiesEditionPart_SkillsLabel);
		skills = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData skillsData = new GridData(GridData.FILL_HORIZONTAL);
		skills.setLayoutData(skillsData);
		skills.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.skills, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, skills.getText()));
			}

		});
		skills.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.skills, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, skills.getText()));
				}
			}

		});
		EditingUtils.setID(skills, HumanRelatedPartViewsRepository.TimHumanResource.Properties.skills);
		EditingUtils.setEEFtype(skills, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimHumanResource.Properties.skills, HumanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createEducationLevelText(Composite parent) {
		createDescription(parent, HumanRelatedPartViewsRepository.TimHumanResource.Properties.educationLevel, HumanRelatedPartMessages.TimHumanResourcePropertiesEditionPart_EducationLevelLabel);
		educationLevel = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData educationLevelData = new GridData(GridData.FILL_HORIZONTAL);
		educationLevel.setLayoutData(educationLevelData);
		educationLevel.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.educationLevel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, educationLevel.getText()));
			}

		});
		educationLevel.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.educationLevel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, educationLevel.getText()));
				}
			}

		});
		EditingUtils.setID(educationLevel, HumanRelatedPartViewsRepository.TimHumanResource.Properties.educationLevel);
		EditingUtils.setEEFtype(educationLevel, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimHumanResource.Properties.educationLevel, HumanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createQuantityText(Composite parent) {
		createDescription(parent, HumanRelatedPartViewsRepository.TimHumanResource.Properties.quantity, HumanRelatedPartMessages.TimHumanResourcePropertiesEditionPart_QuantityLabel);
		quantity = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData quantityData = new GridData(GridData.FILL_HORIZONTAL);
		quantity.setLayoutData(quantityData);
		quantity.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.quantity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, quantity.getText()));
			}

		});
		quantity.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.quantity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, quantity.getText()));
				}
			}

		});
		EditingUtils.setID(quantity, HumanRelatedPartViewsRepository.TimHumanResource.Properties.quantity);
		EditingUtils.setEEFtype(quantity, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimHumanResource.Properties.quantity, HumanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createExpectedPerformanceText(Composite parent) {
		createDescription(parent, HumanRelatedPartViewsRepository.TimHumanResource.Properties.expectedPerformance, HumanRelatedPartMessages.TimHumanResourcePropertiesEditionPart_ExpectedPerformanceLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.expectedPerformance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, expectedPerformance.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimHumanResourcePropertiesEditionPartImpl.this, HumanRelatedPartViewsRepository.TimHumanResource.Properties.expectedPerformance, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, expectedPerformance.getText()));
				}
			}

		});
		EditingUtils.setID(expectedPerformance, HumanRelatedPartViewsRepository.TimHumanResource.Properties.expectedPerformance);
		EditingUtils.setEEFtype(expectedPerformance, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(HumanRelatedPartViewsRepository.TimHumanResource.Properties.expectedPerformance, HumanRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#getFunction()
	 * 
	 */
	public String getFunction() {
		return function.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#setFunction(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#getType()
	 * 
	 */
	public String getType() {
		return type.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#setType(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#initProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#updateProcesses()
	 * 
	 */
	public void updateProcesses() {
	processes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#addFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcesses(ViewerFilter filter) {
		processesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#addBusinessFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcesses(ViewerFilter filter) {
		processesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#isContainedInProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInProcessesTable(EObject element) {
		return ((ReferencesTableSettings)processes.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#getModel()
	 * 
	 */
	public String getModel() {
		return model.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#setModel(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#getOrganizationUnit()
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#initOrganizationUnit(EObjectFlatComboSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#setOrganizationUnit(EObject newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#setOrganizationUnitButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOrganizationUnitButtonMode(ButtonsModeEnum newValue) {
		organizationUnit.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#addFilterOrganizationUnit(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOrganizationUnit(ViewerFilter filter) {
		organizationUnit.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#addBusinessFilterOrganizationUnit(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOrganizationUnit(ViewerFilter filter) {
		organizationUnit.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#initServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#updateServices()
	 * 
	 */
	public void updateServices() {
	services.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#addFilterServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToServices(ViewerFilter filter) {
		servicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#addBusinessFilterServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToServices(ViewerFilter filter) {
		servicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#isContainedInServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInServicesTable(EObject element) {
		return ((ReferencesTableSettings)services.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#getCapability()
	 * 
	 */
	public String getCapability() {
		return capability.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#setCapability(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#getConstraint()
	 * 
	 */
	public String getConstraint() {
		return constraint.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#setConstraint(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#getSkills()
	 * 
	 */
	public String getSkills() {
		return skills.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#setSkills(String newValue)
	 * 
	 */
	public void setSkills(String newValue) {
		if (newValue != null) {
			skills.setText(newValue);
		} else {
			skills.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#getEducationLevel()
	 * 
	 */
	public String getEducationLevel() {
		return educationLevel.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#setEducationLevel(String newValue)
	 * 
	 */
	public void setEducationLevel(String newValue) {
		if (newValue != null) {
			educationLevel.setText(newValue);
		} else {
			educationLevel.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#getQuantity()
	 * 
	 */
	public String getQuantity() {
		return quantity.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#setQuantity(String newValue)
	 * 
	 */
	public void setQuantity(String newValue) {
		if (newValue != null) {
			quantity.setText(newValue);
		} else {
			quantity.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#getExpectedPerformance()
	 * 
	 */
	public String getExpectedPerformance() {
		return expectedPerformance.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts.TimHumanResourcePropertiesEditionPart#setExpectedPerformance(String newValue)
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
		return HumanRelatedPartMessages.TimHumanResource_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
