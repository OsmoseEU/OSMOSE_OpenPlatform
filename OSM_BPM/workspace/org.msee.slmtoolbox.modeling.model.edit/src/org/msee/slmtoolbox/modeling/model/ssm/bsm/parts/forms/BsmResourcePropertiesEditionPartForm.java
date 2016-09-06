/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms;

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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs.BsmAddProcessToResourceDialog;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmResourcePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmResourcePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, BsmResourcePropertiesEditionPart {

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
	 * For {@link ISection} use only.
	 */
	public BsmResourcePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmResourcePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmResource.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmResource.Properties.type) {
					return createTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmResource.Properties.role) {
					return createRoleText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmResource.Properties.capability) {
					return createCapabilityText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmResource.Properties.constraint) {
					return createConstraintText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmResource.Properties.service) {
					return createServiceFlatComboViewer(parent, widgetFactory);
				}
				if (key == BsmViewsRepository.BsmResource.Properties.processes) {
					return createProcessesReferencesTable(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmResource.Properties.organization) {
					return createOrganizationFlatComboViewer(parent, widgetFactory);
				}
				if (key == BsmViewsRepository.BsmResource.Properties.eaResources) {
					return createEaResourcesReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(BsmMessages.BsmResourcePropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, BsmViewsRepository.BsmResource.Properties.name, BsmMessages.BsmResourcePropertiesEditionPart_NameLabel);
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
							BsmResourcePropertiesEditionPartForm.this,
							BsmViewsRepository.BsmResource.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmResourcePropertiesEditionPartForm.this,
									BsmViewsRepository.BsmResource.Properties.name,
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
									BsmResourcePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartForm.this, BsmViewsRepository.BsmResource.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, BsmViewsRepository.BsmResource.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmResource.Properties.name, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartForm.this, BsmViewsRepository.BsmResource.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		type.setID(BsmViewsRepository.BsmResource.Properties.type);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmResource.Properties.type, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRoleText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmResource.Properties.role, BsmMessages.BsmResourcePropertiesEditionPart_RoleLabel);
		role = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		role.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData roleData = new GridData(GridData.FILL_HORIZONTAL);
		role.setLayoutData(roleData);
		role.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmResourcePropertiesEditionPartForm.this,
							BsmViewsRepository.BsmResource.Properties.role,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, role.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmResourcePropertiesEditionPartForm.this,
									BsmViewsRepository.BsmResource.Properties.role,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, role.getText()));
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
									BsmResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		role.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartForm.this, BsmViewsRepository.BsmResource.Properties.role, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, role.getText()));
				}
			}
		});
		EditingUtils.setID(role, BsmViewsRepository.BsmResource.Properties.role);
		EditingUtils.setEEFtype(role, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmResource.Properties.role, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCapabilityText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmResource.Properties.capability, BsmMessages.BsmResourcePropertiesEditionPart_CapabilityLabel);
		capability = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		capability.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData capabilityData = new GridData(GridData.FILL_HORIZONTAL);
		capability.setLayoutData(capabilityData);
		capability.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmResourcePropertiesEditionPartForm.this,
							BsmViewsRepository.BsmResource.Properties.capability,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capability.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmResourcePropertiesEditionPartForm.this,
									BsmViewsRepository.BsmResource.Properties.capability,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, capability.getText()));
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
									BsmResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		capability.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartForm.this, BsmViewsRepository.BsmResource.Properties.capability, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, capability.getText()));
				}
			}
		});
		EditingUtils.setID(capability, BsmViewsRepository.BsmResource.Properties.capability);
		EditingUtils.setEEFtype(capability, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmResource.Properties.capability, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConstraintText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmResource.Properties.constraint, BsmMessages.BsmResourcePropertiesEditionPart_ConstraintLabel);
		constraint = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		constraint.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData constraintData = new GridData(GridData.FILL_HORIZONTAL);
		constraint.setLayoutData(constraintData);
		constraint.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmResourcePropertiesEditionPartForm.this,
							BsmViewsRepository.BsmResource.Properties.constraint,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmResourcePropertiesEditionPartForm.this,
									BsmViewsRepository.BsmResource.Properties.constraint,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, constraint.getText()));
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
									BsmResourcePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		constraint.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartForm.this, BsmViewsRepository.BsmResource.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
				}
			}
		});
		EditingUtils.setID(constraint, BsmViewsRepository.BsmResource.Properties.constraint);
		EditingUtils.setEEFtype(constraint, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmResource.Properties.constraint, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createServiceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, BsmViewsRepository.BsmResource.Properties.service, BsmMessages.BsmResourcePropertiesEditionPart_ServiceLabel);
		service = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmResource.Properties.service, BsmViewsRepository.FORM_KIND));
		widgetFactory.adapt(service);
		service.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData serviceData = new GridData(GridData.FILL_HORIZONTAL);
		service.setLayoutData(serviceData);
		service.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartForm.this, BsmViewsRepository.BsmResource.Properties.service, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getService()));
			}

		});
		service.setID(BsmViewsRepository.BsmResource.Properties.service);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmResource.Properties.service, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createProcessesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.processes = new ReferencesTable(getDescription(BsmViewsRepository.BsmResource.Properties.processes, BsmMessages.BsmResourcePropertiesEditionPart_ProcessesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addProcesses(); }
			public void handleEdit(EObject element) { editProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.processes.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmResource.Properties.processes, BsmViewsRepository.FORM_KIND));
		this.processes.createControls(parent, widgetFactory);
		this.processes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartForm.this, BsmViewsRepository.BsmResource.Properties.processes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
	// Start of user code
		BsmAddProcessToResourceDialog dialog = new BsmAddProcessToResourceDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), processes.getLabelProvider(), (BsmResource) ((ReferencesTableSettings)this.processes.getInput()).getSource());		
		dialog.open();
		processes.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveProcesses(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartForm.this, BsmViewsRepository.BsmResource.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processes.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartForm.this, BsmViewsRepository.BsmResource.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createOrganizationFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, BsmViewsRepository.BsmResource.Properties.organization, BsmMessages.BsmResourcePropertiesEditionPart_OrganizationLabel);
		organization = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmResource.Properties.organization, BsmViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartForm.this, BsmViewsRepository.BsmResource.Properties.organization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOrganization()));
			}

		});
		organization.setID(BsmViewsRepository.BsmResource.Properties.organization);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmResource.Properties.organization, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}



	/**
	 * 
	 */
	protected Composite createEaResourcesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.eaResources = new ReferencesTable(getDescription(BsmViewsRepository.BsmResource.Properties.eaResources, BsmMessages.BsmResourcePropertiesEditionPart_EaResourcesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addEaResources(); }
			public void handleEdit(EObject element) { editEaResources(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveEaResources(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromEaResources(element); }
			public void navigateTo(EObject element) { }
		});
		this.eaResources.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmResource.Properties.eaResources, BsmViewsRepository.FORM_KIND));
		this.eaResources.createControls(parent, widgetFactory);
		this.eaResources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartForm.this, BsmViewsRepository.BsmResource.Properties.eaResources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartForm.this, BsmViewsRepository.BsmResource.Properties.eaResources,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartForm.this, BsmViewsRepository.BsmResource.Properties.eaResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		eaResources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromEaResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmResourcePropertiesEditionPartForm.this, BsmViewsRepository.BsmResource.Properties.eaResources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
