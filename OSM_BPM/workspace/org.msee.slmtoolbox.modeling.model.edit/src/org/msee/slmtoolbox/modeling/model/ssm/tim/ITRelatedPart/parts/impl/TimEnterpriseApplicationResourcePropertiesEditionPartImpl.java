/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.impl;

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

import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.ITRelatedPartViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart;

import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.providers.ITRelatedPartMessages;

// End of user code

/**
 * 
 * 
 */
public class TimEnterpriseApplicationResourcePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, TimEnterpriseApplicationResourcePropertiesEditionPart {

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
	protected Text description;
	protected Text functionality;
	protected Text characteristics;
	protected ReferencesTable informations;
	protected List<ViewerFilter> informationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> informationsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TimEnterpriseApplicationResourcePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence timEnterpriseApplicationResourceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = timEnterpriseApplicationResourceStep.addStep(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.class);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.name);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.function);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.type);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.processes);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.model);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.organizationUnit);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.services);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.description);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.functionality);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.characteristics);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.informations);
		
		
		composer = new PartComposer(timEnterpriseApplicationResourceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.name) {
					return createNameText(parent);
				}
				if (key == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.function) {
					return createFunctionText(parent);
				}
				if (key == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.type) {
					return createTypeText(parent);
				}
				if (key == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.processes) {
					return createProcessesAdvancedReferencesTable(parent);
				}
				if (key == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.model) {
					return createModelText(parent);
				}
				if (key == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.organizationUnit) {
					return createOrganizationUnitFlatComboViewer(parent);
				}
				if (key == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.services) {
					return createServicesAdvancedReferencesTable(parent);
				}
				if (key == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.functionality) {
					return createFunctionalityText(parent);
				}
				if (key == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.characteristics) {
					return createCharacteristicsText(parent);
				}
				if (key == ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.informations) {
					return createInformationsAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(ITRelatedPartMessages.TimEnterpriseApplicationResourcePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.name, ITRelatedPartMessages.TimEnterpriseApplicationResourcePropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.name, ITRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createFunctionText(Composite parent) {
		createDescription(parent, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.function, ITRelatedPartMessages.TimEnterpriseApplicationResourcePropertiesEditionPart_FunctionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.function, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, function.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.function, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, function.getText()));
				}
			}

		});
		EditingUtils.setID(function, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.function);
		EditingUtils.setEEFtype(function, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.function, ITRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeText(Composite parent) {
		createDescription(parent, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.type, ITRelatedPartMessages.TimEnterpriseApplicationResourcePropertiesEditionPart_TypeLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
				}
			}

		});
		EditingUtils.setID(type, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.type);
		EditingUtils.setEEFtype(type, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.type, ITRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createProcessesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.processes, ITRelatedPartMessages.TimEnterpriseApplicationResourcePropertiesEditionPart_ProcessesLabel);		 
		this.processes = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addProcesses(); }
			public void handleEdit(EObject element) { editProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.processes.setHelpText(propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.processes, ITRelatedPartViewsRepository.SWT_KIND));
		this.processes.createControls(parent);
		this.processes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.processes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData processesData = new GridData(GridData.FILL_HORIZONTAL);
		processesData.horizontalSpan = 3;
		this.processes.setLayoutData(processesData);
		this.processes.disableMove();
		processes.setID(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.processes);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.processes,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processes.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		createDescription(parent, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.model, ITRelatedPartMessages.TimEnterpriseApplicationResourcePropertiesEditionPart_ModelLabel);
		model = SWTUtils.createScrollableText(parent, SWT.BORDER);
		model.setEnabled(false);
		model.setToolTipText(ITRelatedPartMessages.TimEnterpriseApplicationResource_ReadOnly);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.model, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, model.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.model, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, model.getText()));
				}
			}

		});
		EditingUtils.setID(model, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.model);
		EditingUtils.setEEFtype(model, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.model, ITRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createOrganizationUnitFlatComboViewer(Composite parent) {
		createDescription(parent, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.organizationUnit, ITRelatedPartMessages.TimEnterpriseApplicationResourcePropertiesEditionPart_OrganizationUnitLabel);
		organizationUnit = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.organizationUnit, ITRelatedPartViewsRepository.SWT_KIND));
		organizationUnit.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		organizationUnit.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.organizationUnit, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOrganizationUnit()));
			}

		});
		GridData organizationUnitData = new GridData(GridData.FILL_HORIZONTAL);
		organizationUnit.setLayoutData(organizationUnitData);
		organizationUnit.setID(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.organizationUnit);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.organizationUnit, ITRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createServicesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.services, ITRelatedPartMessages.TimEnterpriseApplicationResourcePropertiesEditionPart_ServicesLabel);		 
		this.services = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addServices(); }
			public void handleEdit(EObject element) { editServices(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveServices(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromServices(element); }
			public void navigateTo(EObject element) { }
		});
		this.services.setHelpText(propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.services, ITRelatedPartViewsRepository.SWT_KIND));
		this.services.createControls(parent);
		this.services.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.services, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData servicesData = new GridData(GridData.FILL_HORIZONTAL);
		servicesData.horizontalSpan = 3;
		this.services.setLayoutData(servicesData);
		this.services.disableMove();
		services.setID(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.services);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.services,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		services.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromServices(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.services, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.description, ITRelatedPartMessages.TimEnterpriseApplicationResourcePropertiesEditionPart_DescriptionLabel);
		description = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData descriptionData = new GridData(GridData.FILL_HORIZONTAL);
		description.setLayoutData(descriptionData);
		description.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
			}

		});
		description.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.description, ITRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createFunctionalityText(Composite parent) {
		createDescription(parent, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.functionality, ITRelatedPartMessages.TimEnterpriseApplicationResourcePropertiesEditionPart_FunctionalityLabel);
		functionality = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData functionalityData = new GridData(GridData.FILL_HORIZONTAL);
		functionality.setLayoutData(functionalityData);
		functionality.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.functionality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, functionality.getText()));
			}

		});
		functionality.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.functionality, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, functionality.getText()));
				}
			}

		});
		EditingUtils.setID(functionality, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.functionality);
		EditingUtils.setEEFtype(functionality, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.functionality, ITRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCharacteristicsText(Composite parent) {
		createDescription(parent, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.characteristics, ITRelatedPartMessages.TimEnterpriseApplicationResourcePropertiesEditionPart_CharacteristicsLabel);
		characteristics = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData characteristicsData = new GridData(GridData.FILL_HORIZONTAL);
		characteristics.setLayoutData(characteristicsData);
		characteristics.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.characteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, characteristics.getText()));
			}

		});
		characteristics.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.characteristics, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, characteristics.getText()));
				}
			}

		});
		EditingUtils.setID(characteristics, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.characteristics);
		EditingUtils.setEEFtype(characteristics, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.characteristics, ITRelatedPartViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createInformationsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.informations, ITRelatedPartMessages.TimEnterpriseApplicationResourcePropertiesEditionPart_InformationsLabel);		 
		this.informations = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addInformations(); }
			public void handleEdit(EObject element) { editInformations(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveInformations(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromInformations(element); }
			public void navigateTo(EObject element) { }
		});
		this.informations.setHelpText(propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.informations, ITRelatedPartViewsRepository.SWT_KIND));
		this.informations.createControls(parent);
		this.informations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.informations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData informationsData = new GridData(GridData.FILL_HORIZONTAL);
		informationsData.horizontalSpan = 3;
		this.informations.setLayoutData(informationsData);
		this.informations.disableMove();
		informations.setID(ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.informations);
		informations.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addInformations() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(informations.getInput(), informationsFilters, informationsBusinessFilters,
		"informations", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.informations,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				informations.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveInformations(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.informations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		informations.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInformations(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimEnterpriseApplicationResourcePropertiesEditionPartImpl.this, ITRelatedPartViewsRepository.TimEnterpriseApplicationResource.Properties.informations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		informations.refresh();
	}

	/**
	 * 
	 */
	protected void editInformations(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				informations.refresh();
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#getFunction()
	 * 
	 */
	public String getFunction() {
		return function.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#setFunction(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#getType()
	 * 
	 */
	public String getType() {
		return type.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#setType(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#initProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#updateProcesses()
	 * 
	 */
	public void updateProcesses() {
	processes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#addFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcesses(ViewerFilter filter) {
		processesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#addBusinessFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcesses(ViewerFilter filter) {
		processesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#isContainedInProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInProcessesTable(EObject element) {
		return ((ReferencesTableSettings)processes.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#getModel()
	 * 
	 */
	public String getModel() {
		return model.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#setModel(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#getOrganizationUnit()
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#initOrganizationUnit(EObjectFlatComboSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#setOrganizationUnit(EObject newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#setOrganizationUnitButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOrganizationUnitButtonMode(ButtonsModeEnum newValue) {
		organizationUnit.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#addFilterOrganizationUnit(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOrganizationUnit(ViewerFilter filter) {
		organizationUnit.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#addBusinessFilterOrganizationUnit(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOrganizationUnit(ViewerFilter filter) {
		organizationUnit.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#initServices(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#updateServices()
	 * 
	 */
	public void updateServices() {
	services.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#addFilterServices(ViewerFilter filter)
	 * 
	 */
	public void addFilterToServices(ViewerFilter filter) {
		servicesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#addBusinessFilterServices(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToServices(ViewerFilter filter) {
		servicesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#isContainedInServicesTable(EObject element)
	 * 
	 */
	public boolean isContainedInServicesTable(EObject element) {
		return ((ReferencesTableSettings)services.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#getFunctionality()
	 * 
	 */
	public String getFunctionality() {
		return functionality.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#setFunctionality(String newValue)
	 * 
	 */
	public void setFunctionality(String newValue) {
		if (newValue != null) {
			functionality.setText(newValue);
		} else {
			functionality.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#getCharacteristics()
	 * 
	 */
	public String getCharacteristics() {
		return characteristics.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#setCharacteristics(String newValue)
	 * 
	 */
	public void setCharacteristics(String newValue) {
		if (newValue != null) {
			characteristics.setText(newValue);
		} else {
			characteristics.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#initInformations(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInformations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		informations.setContentProvider(contentProvider);
		informations.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#updateInformations()
	 * 
	 */
	public void updateInformations() {
	informations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#addFilterInformations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInformations(ViewerFilter filter) {
		informationsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#addBusinessFilterInformations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInformations(ViewerFilter filter) {
		informationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimEnterpriseApplicationResourcePropertiesEditionPart#isContainedInInformationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInInformationsTable(EObject element) {
		return ((ReferencesTableSettings)informations.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ITRelatedPartMessages.TimEnterpriseApplicationResource_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
