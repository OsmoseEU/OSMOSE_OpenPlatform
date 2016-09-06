/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmResourcePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, BsmResourcePropertiesEditionPart {

	protected Text name;
	protected EMFComboViewer type;
	protected Text role;
	protected Text capability;
	protected Text constraint;
	protected EObjectFlatComboViewer service;
	protected ReferencesTable processes;
	protected List<ViewerFilter> processesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> processesFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer organization;
	protected ReferencesTable eaResources;
	protected List<ViewerFilter> eaResourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> eaResourcesFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmResourcePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence bsmResourceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = bsmResourceStep.addStep(BsmViewsRepository.BsmResource.Properties.class);
		propertiesStep.addStep(BsmViewsRepository.BsmResource.Properties.name);
		propertiesStep.addStep(BsmViewsRepository.BsmResource.Properties.type);
		propertiesStep.addStep(BsmViewsRepository.BsmResource.Properties.role);
		propertiesStep.addStep(BsmViewsRepository.BsmResource.Properties.capability);
		propertiesStep.addStep(BsmViewsRepository.BsmResource.Properties.constraint);
		propertiesStep.addStep(BsmViewsRepository.BsmResource.Properties.service);
		propertiesStep.addStep(BsmViewsRepository.BsmResource.Properties.processes);
		propertiesStep.addStep(BsmViewsRepository.BsmResource.Properties.organization);
		propertiesStep.addStep(BsmViewsRepository.BsmResource.Properties.eaResources);
		
		
		composer = new PartComposer(bsmResourceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == BsmViewsRepository.BsmResource.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == BsmViewsRepository.BsmResource.Properties.name) {
					return createNameText(parent);
				}
				if (key == BsmViewsRepository.BsmResource.Properties.type) {
					return createTypeEMFComboViewer(parent);
				}
				if (key == BsmViewsRepository.BsmResource.Properties.role) {
					return createRoleText(parent);
				}
				if (key == BsmViewsRepository.BsmResource.Properties.capability) {
					return createCapabilityText(parent);
				}
				if (key == BsmViewsRepository.BsmResource.Properties.constraint) {
					return createConstraintText(parent);
				}
				if (key == BsmViewsRepository.BsmResource.Properties.service) {
					return createServiceFlatComboViewer(parent);
				}
				if (key == BsmViewsRepository.BsmResource.Properties.processes) {
					return createProcessesAdvancedReferencesTable(parent);
				}
				if (key == BsmViewsRepository.BsmResource.Properties.organization) {
					return createOrganizationFlatComboViewer(parent);
				}
				if (key == BsmViewsRepository.BsmResource.Properties.eaResources) {
					return createEaResourcesAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(BsmMessages.BsmResourcePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmResource.Properties.name, BsmMessages.BsmResourcePropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, BsmViewsRepository.BsmResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmResource.Properties.name, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeEMFComboViewer(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmResource.Properties.type, BsmMessages.BsmResourcePropertiesEditionPart_TypeLabel);
		type = new EMFComboViewer(parent);
		type.setContentProvider(new ArrayContentProvider());
		type.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.getCombo().setLayoutData(typeData);
		type.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		type.setID(BsmViewsRepository.BsmResource.Properties.type);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmResource.Properties.type, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRoleText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmResource.Properties.role, BsmMessages.BsmResourcePropertiesEditionPart_RoleLabel);
		role = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData roleData = new GridData(GridData.FILL_HORIZONTAL);
		role.setLayoutData(roleData);
		role.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.role, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, role.getText()));
			}

		});
		role.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.role, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, role.getText()));
				}
			}

		});
		EditingUtils.setID(role, BsmViewsRepository.BsmResource.Properties.role);
		EditingUtils.setEEFtype(role, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmResource.Properties.role, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCapabilityText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmResource.Properties.capability, BsmMessages.BsmResourcePropertiesEditionPart_CapabilityLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.capability, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capability.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.capability, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capability.getText()));
				}
			}

		});
		EditingUtils.setID(capability, BsmViewsRepository.BsmResource.Properties.capability);
		EditingUtils.setEEFtype(capability, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmResource.Properties.capability, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConstraintText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmResource.Properties.constraint, BsmMessages.BsmResourcePropertiesEditionPart_ConstraintLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
				}
			}

		});
		EditingUtils.setID(constraint, BsmViewsRepository.BsmResource.Properties.constraint);
		EditingUtils.setEEFtype(constraint, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmResource.Properties.constraint, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createServiceFlatComboViewer(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmResource.Properties.service, BsmMessages.BsmResourcePropertiesEditionPart_ServiceLabel);
		service = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmResource.Properties.service, BsmViewsRepository.SWT_KIND));
		service.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		service.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.service, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getService()));
			}

		});
		GridData serviceData = new GridData(GridData.FILL_HORIZONTAL);
		service.setLayoutData(serviceData);
		service.setID(BsmViewsRepository.BsmResource.Properties.service);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmResource.Properties.service, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createProcessesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(BsmViewsRepository.BsmResource.Properties.processes, BsmMessages.BsmResourcePropertiesEditionPart_ProcessesLabel);		 
		this.processes = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addProcesses(); }
			public void handleEdit(EObject element) { editProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.processes.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmResource.Properties.processes, BsmViewsRepository.SWT_KIND));
		this.processes.createControls(parent);
		this.processes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.processes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData processesData = new GridData(GridData.FILL_HORIZONTAL);
		processesData.horizontalSpan = 3;
		this.processes.setLayoutData(processesData);
		this.processes.disableMove();
		processes.setID(BsmViewsRepository.BsmResource.Properties.processes);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.processes,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processes.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createOrganizationFlatComboViewer(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmResource.Properties.organization, BsmMessages.BsmResourcePropertiesEditionPart_OrganizationLabel);
		organization = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmResource.Properties.organization, BsmViewsRepository.SWT_KIND));
		organization.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		organization.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.organization, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOrganization()));
			}

		});
		GridData organizationData = new GridData(GridData.FILL_HORIZONTAL);
		organization.setLayoutData(organizationData);
		organization.setID(BsmViewsRepository.BsmResource.Properties.organization);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmResource.Properties.organization, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createEaResourcesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(BsmViewsRepository.BsmResource.Properties.eaResources, BsmMessages.BsmResourcePropertiesEditionPart_EaResourcesLabel);		 
		this.eaResources = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addEaResources(); }
			public void handleEdit(EObject element) { editEaResources(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveEaResources(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromEaResources(element); }
			public void navigateTo(EObject element) { }
		});
		this.eaResources.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmResource.Properties.eaResources, BsmViewsRepository.SWT_KIND));
		this.eaResources.createControls(parent);
		this.eaResources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.eaResources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData eaResourcesData = new GridData(GridData.FILL_HORIZONTAL);
		eaResourcesData.horizontalSpan = 3;
		this.eaResources.setLayoutData(eaResourcesData);
		this.eaResources.disableMove();
		eaResources.setID(BsmViewsRepository.BsmResource.Properties.eaResources);
		eaResources.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addEaResources() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(eaResources.getInput(), eaResourcesFilters, eaResourcesBusinessFilters,
		"eaResources", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.eaResources,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				eaResources.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveEaResources(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.eaResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		eaResources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromEaResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartImpl.this, BsmViewsRepository.BsmResource.Properties.eaResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		eaResources.refresh();
	}

	/**
	 * 
	 */
	protected void editEaResources(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				eaResources.refresh();
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#getType()
	 * 
	 */
	public Enumerator getType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) type.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#initType(Object input, Enumerator current)
	 */
	public void initType(Object input, Enumerator current) {
		type.setInput(input);
		type.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#setType(Enumerator newValue)
	 * 
	 */
	public void setType(Enumerator newValue) {
		type.modelUpdating(new StructuredSelection(newValue));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#getRole()
	 * 
	 */
	public String getRole() {
		return role.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#setRole(String newValue)
	 * 
	 */
	public void setRole(String newValue) {
		if (newValue != null) {
			role.setText(newValue);
		} else {
			role.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#getCapability()
	 * 
	 */
	public String getCapability() {
		return capability.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#setCapability(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#getConstraint()
	 * 
	 */
	public String getConstraint() {
		return constraint.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#setConstraint(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#getService()
	 * 
	 */
	public EObject getService() {
		if (service.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) service.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#initService(EObjectFlatComboSettings)
	 */
	public void initService(EObjectFlatComboSettings settings) {
		service.setInput(settings);
		if (current != null) {
			service.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#setService(EObject newValue)
	 * 
	 */
	public void setService(EObject newValue) {
		if (newValue != null) {
			service.setSelection(new StructuredSelection(newValue));
		} else {
			service.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#setServiceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setServiceButtonMode(ButtonsModeEnum newValue) {
		service.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#addFilterService(ViewerFilter filter)
	 * 
	 */
	public void addFilterToService(ViewerFilter filter) {
		service.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#addBusinessFilterService(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToService(ViewerFilter filter) {
		service.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#initProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#updateProcesses()
	 * 
	 */
	public void updateProcesses() {
	processes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#addFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcesses(ViewerFilter filter) {
		processesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#addBusinessFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcesses(ViewerFilter filter) {
		processesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#isContainedInProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInProcessesTable(EObject element) {
		return ((ReferencesTableSettings)processes.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#getOrganization()
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#initOrganization(EObjectFlatComboSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#setOrganization(EObject newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#setOrganizationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOrganizationButtonMode(ButtonsModeEnum newValue) {
		organization.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#addFilterOrganization(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOrganization(ViewerFilter filter) {
		organization.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#addBusinessFilterOrganization(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOrganization(ViewerFilter filter) {
		organization.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#initEaResources(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initEaResources(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		eaResources.setContentProvider(contentProvider);
		eaResources.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#updateEaResources()
	 * 
	 */
	public void updateEaResources() {
	eaResources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#addFilterEaResources(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEaResources(ViewerFilter filter) {
		eaResourcesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#addBusinessFilterEaResources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEaResources(ViewerFilter filter) {
		eaResourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart#isContainedInEaResourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInEaResourcesTable(EObject element) {
		return ((ReferencesTableSettings)eaResources.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return BsmMessages.BsmResource_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
