/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmServicePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, BsmServicePropertiesEditionPart {

	protected Text name;
	protected Text description;
	protected Text constraint;
	protected Text objective;
	protected Text domain;
	protected Text nature;
	protected ReferencesTable products;
	protected List<ViewerFilter> productsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> productsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable functionalities;
	protected List<ViewerFilter> functionalitiesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> functionalitiesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable resources;
	protected List<ViewerFilter> resourcesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> resourcesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable processes;
	protected List<ViewerFilter> processesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> processesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable customers;
	protected List<ViewerFilter> customersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> customersFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable values;
	protected List<ViewerFilter> valuesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> valuesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable stakeholders;
	protected List<ViewerFilter> stakeholdersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> stakeholdersFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable partners;
	protected List<ViewerFilter> partnersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> partnersFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmServicePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence bsmServiceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = bsmServiceStep.addStep(BsmViewsRepository.BsmService.Properties.class);
		propertiesStep.addStep(BsmViewsRepository.BsmService.Properties.name);
		propertiesStep.addStep(BsmViewsRepository.BsmService.Properties.description);
		propertiesStep.addStep(BsmViewsRepository.BsmService.Properties.constraint);
		propertiesStep.addStep(BsmViewsRepository.BsmService.Properties.objective);
		propertiesStep.addStep(BsmViewsRepository.BsmService.Properties.domain);
		propertiesStep.addStep(BsmViewsRepository.BsmService.Properties.nature);
		propertiesStep.addStep(BsmViewsRepository.BsmService.Properties.products);
		propertiesStep.addStep(BsmViewsRepository.BsmService.Properties.functionalities);
		propertiesStep.addStep(BsmViewsRepository.BsmService.Properties.resources);
		propertiesStep.addStep(BsmViewsRepository.BsmService.Properties.processes);
		propertiesStep.addStep(BsmViewsRepository.BsmService.Properties.customers);
		propertiesStep.addStep(BsmViewsRepository.BsmService.Properties.values);
		propertiesStep.addStep(BsmViewsRepository.BsmService.Properties.stakeholders);
		propertiesStep.addStep(BsmViewsRepository.BsmService.Properties.partners);
		
		
		composer = new PartComposer(bsmServiceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == BsmViewsRepository.BsmService.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == BsmViewsRepository.BsmService.Properties.name) {
					return createNameText(parent);
				}
				if (key == BsmViewsRepository.BsmService.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == BsmViewsRepository.BsmService.Properties.constraint) {
					return createConstraintText(parent);
				}
				if (key == BsmViewsRepository.BsmService.Properties.objective) {
					return createObjectiveText(parent);
				}
				if (key == BsmViewsRepository.BsmService.Properties.domain) {
					return createDomainText(parent);
				}
				if (key == BsmViewsRepository.BsmService.Properties.nature) {
					return createNatureText(parent);
				}
				if (key == BsmViewsRepository.BsmService.Properties.products) {
					return createProductsAdvancedReferencesTable(parent);
				}
				if (key == BsmViewsRepository.BsmService.Properties.functionalities) {
					return createFunctionalitiesAdvancedReferencesTable(parent);
				}
				if (key == BsmViewsRepository.BsmService.Properties.resources) {
					return createResourcesAdvancedReferencesTable(parent);
				}
				if (key == BsmViewsRepository.BsmService.Properties.processes) {
					return createProcessesAdvancedReferencesTable(parent);
				}
				if (key == BsmViewsRepository.BsmService.Properties.customers) {
					return createCustomersAdvancedReferencesTable(parent);
				}
				if (key == BsmViewsRepository.BsmService.Properties.values) {
					return createValuesAdvancedReferencesTable(parent);
				}
				if (key == BsmViewsRepository.BsmService.Properties.stakeholders) {
					return createStakeholdersAdvancedReferencesTable(parent);
				}
				if (key == BsmViewsRepository.BsmService.Properties.partners) {
					return createPartnersAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(BsmMessages.BsmServicePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmService.Properties.name, BsmMessages.BsmServicePropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, BsmViewsRepository.BsmService.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmService.Properties.name, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmService.Properties.description, BsmMessages.BsmServicePropertiesEditionPart_DescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, BsmViewsRepository.BsmService.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmService.Properties.description, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConstraintText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmService.Properties.constraint, BsmMessages.BsmServicePropertiesEditionPart_ConstraintLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
				}
			}

		});
		EditingUtils.setID(constraint, BsmViewsRepository.BsmService.Properties.constraint);
		EditingUtils.setEEFtype(constraint, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmService.Properties.constraint, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createObjectiveText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmService.Properties.objective, BsmMessages.BsmServicePropertiesEditionPart_ObjectiveLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.objective, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, objective.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.objective, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, objective.getText()));
				}
			}

		});
		EditingUtils.setID(objective, BsmViewsRepository.BsmService.Properties.objective);
		EditingUtils.setEEFtype(objective, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmService.Properties.objective, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDomainText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmService.Properties.domain, BsmMessages.BsmServicePropertiesEditionPart_DomainLabel);
		domain = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData domainData = new GridData(GridData.FILL_HORIZONTAL);
		domain.setLayoutData(domainData);
		domain.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.domain, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, domain.getText()));
			}

		});
		domain.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.domain, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, domain.getText()));
				}
			}

		});
		EditingUtils.setID(domain, BsmViewsRepository.BsmService.Properties.domain);
		EditingUtils.setEEFtype(domain, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmService.Properties.domain, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createNatureText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmService.Properties.nature, BsmMessages.BsmServicePropertiesEditionPart_NatureLabel);
		nature = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData natureData = new GridData(GridData.FILL_HORIZONTAL);
		nature.setLayoutData(natureData);
		nature.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.nature, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nature.getText()));
			}

		});
		nature.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.nature, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, nature.getText()));
				}
			}

		});
		EditingUtils.setID(nature, BsmViewsRepository.BsmService.Properties.nature);
		EditingUtils.setEEFtype(nature, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmService.Properties.nature, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createProductsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(BsmViewsRepository.BsmService.Properties.products, BsmMessages.BsmServicePropertiesEditionPart_ProductsLabel);		 
		this.products = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addProducts(); }
			public void handleEdit(EObject element) { editProducts(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProducts(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProducts(element); }
			public void navigateTo(EObject element) { }
		});
		this.products.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmService.Properties.products, BsmViewsRepository.SWT_KIND));
		this.products.createControls(parent);
		this.products.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.products, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData productsData = new GridData(GridData.FILL_HORIZONTAL);
		productsData.horizontalSpan = 3;
		this.products.setLayoutData(productsData);
		this.products.disableMove();
		products.setID(BsmViewsRepository.BsmService.Properties.products);
		products.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addProducts() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(products.getInput(), productsFilters, productsBusinessFilters,
		"products", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.products,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				products.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveProducts(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.products, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		products.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProducts(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.products, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		products.refresh();
	}

	/**
	 * 
	 */
	protected void editProducts(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				products.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createFunctionalitiesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(BsmViewsRepository.BsmService.Properties.functionalities, BsmMessages.BsmServicePropertiesEditionPart_FunctionalitiesLabel);		 
		this.functionalities = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addFunctionalities(); }
			public void handleEdit(EObject element) { editFunctionalities(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveFunctionalities(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromFunctionalities(element); }
			public void navigateTo(EObject element) { }
		});
		this.functionalities.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmService.Properties.functionalities, BsmViewsRepository.SWT_KIND));
		this.functionalities.createControls(parent);
		this.functionalities.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.functionalities, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData functionalitiesData = new GridData(GridData.FILL_HORIZONTAL);
		functionalitiesData.horizontalSpan = 3;
		this.functionalities.setLayoutData(functionalitiesData);
		this.functionalities.disableMove();
		functionalities.setID(BsmViewsRepository.BsmService.Properties.functionalities);
		functionalities.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addFunctionalities() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(functionalities.getInput(), functionalitiesFilters, functionalitiesBusinessFilters,
		"functionalities", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.functionalities,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				functionalities.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveFunctionalities(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.functionalities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		functionalities.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromFunctionalities(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.functionalities, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		functionalities.refresh();
	}

	/**
	 * 
	 */
	protected void editFunctionalities(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				functionalities.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createResourcesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(BsmViewsRepository.BsmService.Properties.resources, BsmMessages.BsmServicePropertiesEditionPart_ResourcesLabel);		 
		this.resources = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addResources(); }
			public void handleEdit(EObject element) { editResources(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveResources(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromResources(element); }
			public void navigateTo(EObject element) { }
		});
		this.resources.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmService.Properties.resources, BsmViewsRepository.SWT_KIND));
		this.resources.createControls(parent);
		this.resources.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.resources, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData resourcesData = new GridData(GridData.FILL_HORIZONTAL);
		resourcesData.horizontalSpan = 3;
		this.resources.setLayoutData(resourcesData);
		this.resources.disableMove();
		resources.setID(BsmViewsRepository.BsmService.Properties.resources);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.resources,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		resources.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromResources(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.resources, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createProcessesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(BsmViewsRepository.BsmService.Properties.processes, BsmMessages.BsmServicePropertiesEditionPart_ProcessesLabel);		 
		this.processes = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addProcesses(); }
			public void handleEdit(EObject element) { editProcesses(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveProcesses(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromProcesses(element); }
			public void navigateTo(EObject element) { }
		});
		this.processes.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmService.Properties.processes, BsmViewsRepository.SWT_KIND));
		this.processes.createControls(parent);
		this.processes.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.processes, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData processesData = new GridData(GridData.FILL_HORIZONTAL);
		processesData.horizontalSpan = 3;
		this.processes.setLayoutData(processesData);
		this.processes.disableMove();
		processes.setID(BsmViewsRepository.BsmService.Properties.processes);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.processes,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		processes.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromProcesses(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.processes, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	protected Composite createCustomersAdvancedReferencesTable(Composite parent) {
		String label = getDescription(BsmViewsRepository.BsmService.Properties.customers, BsmMessages.BsmServicePropertiesEditionPart_CustomersLabel);		 
		this.customers = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addCustomers(); }
			public void handleEdit(EObject element) { editCustomers(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveCustomers(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromCustomers(element); }
			public void navigateTo(EObject element) { }
		});
		this.customers.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmService.Properties.customers, BsmViewsRepository.SWT_KIND));
		this.customers.createControls(parent);
		this.customers.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.customers, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData customersData = new GridData(GridData.FILL_HORIZONTAL);
		customersData.horizontalSpan = 3;
		this.customers.setLayoutData(customersData);
		this.customers.disableMove();
		customers.setID(BsmViewsRepository.BsmService.Properties.customers);
		customers.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addCustomers() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(customers.getInput(), customersFilters, customersBusinessFilters,
		"customers", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.customers,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				customers.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveCustomers(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.customers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		customers.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromCustomers(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.customers, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		customers.refresh();
	}

	/**
	 * 
	 */
	protected void editCustomers(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				customers.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createValuesAdvancedReferencesTable(Composite parent) {
		String label = getDescription(BsmViewsRepository.BsmService.Properties.values, BsmMessages.BsmServicePropertiesEditionPart_ValuesLabel);		 
		this.values = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addValues(); }
			public void handleEdit(EObject element) { editValues(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveValues(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromValues(element); }
			public void navigateTo(EObject element) { }
		});
		this.values.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmService.Properties.values, BsmViewsRepository.SWT_KIND));
		this.values.createControls(parent);
		this.values.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.values, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData valuesData = new GridData(GridData.FILL_HORIZONTAL);
		valuesData.horizontalSpan = 3;
		this.values.setLayoutData(valuesData);
		this.values.disableMove();
		values.setID(BsmViewsRepository.BsmService.Properties.values);
		values.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addValues() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(values.getInput(), valuesFilters, valuesBusinessFilters,
		"values", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.values,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				values.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveValues(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.values, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		values.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromValues(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.values, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		values.refresh();
	}

	/**
	 * 
	 */
	protected void editValues(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				values.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createStakeholdersAdvancedReferencesTable(Composite parent) {
		String label = getDescription(BsmViewsRepository.BsmService.Properties.stakeholders, BsmMessages.BsmServicePropertiesEditionPart_StakeholdersLabel);		 
		this.stakeholders = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addStakeholders(); }
			public void handleEdit(EObject element) { editStakeholders(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveStakeholders(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromStakeholders(element); }
			public void navigateTo(EObject element) { }
		});
		this.stakeholders.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmService.Properties.stakeholders, BsmViewsRepository.SWT_KIND));
		this.stakeholders.createControls(parent);
		this.stakeholders.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.stakeholders, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData stakeholdersData = new GridData(GridData.FILL_HORIZONTAL);
		stakeholdersData.horizontalSpan = 3;
		this.stakeholders.setLayoutData(stakeholdersData);
		this.stakeholders.disableMove();
		stakeholders.setID(BsmViewsRepository.BsmService.Properties.stakeholders);
		stakeholders.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addStakeholders() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(stakeholders.getInput(), stakeholdersFilters, stakeholdersBusinessFilters,
		"stakeholders", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.stakeholders,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				stakeholders.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveStakeholders(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.stakeholders, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		stakeholders.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromStakeholders(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.stakeholders, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		stakeholders.refresh();
	}

	/**
	 * 
	 */
	protected void editStakeholders(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				stakeholders.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createPartnersAdvancedReferencesTable(Composite parent) {
		String label = getDescription(BsmViewsRepository.BsmService.Properties.partners, BsmMessages.BsmServicePropertiesEditionPart_PartnersLabel);		 
		this.partners = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addPartners(); }
			public void handleEdit(EObject element) { editPartners(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { movePartners(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromPartners(element); }
			public void navigateTo(EObject element) { }
		});
		this.partners.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmService.Properties.partners, BsmViewsRepository.SWT_KIND));
		this.partners.createControls(parent);
		this.partners.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.partners, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData partnersData = new GridData(GridData.FILL_HORIZONTAL);
		partnersData.horizontalSpan = 3;
		this.partners.setLayoutData(partnersData);
		this.partners.disableMove();
		partners.setID(BsmViewsRepository.BsmService.Properties.partners);
		partners.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addPartners() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(partners.getInput(), partnersFilters, partnersBusinessFilters,
		"partners", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.partners,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				partners.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void movePartners(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.partners, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		partners.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromPartners(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmService.Properties.partners, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		partners.refresh();
	}

	/**
	 * 
	 */
	protected void editPartners(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				partners.refresh();
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#getConstraint()
	 * 
	 */
	public String getConstraint() {
		return constraint.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#setConstraint(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#getObjective()
	 * 
	 */
	public String getObjective() {
		return objective.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#setObjective(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#getDomain()
	 * 
	 */
	public String getDomain() {
		return domain.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#setDomain(String newValue)
	 * 
	 */
	public void setDomain(String newValue) {
		if (newValue != null) {
			domain.setText(newValue);
		} else {
			domain.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#getNature()
	 * 
	 */
	public String getNature() {
		return nature.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#setNature(String newValue)
	 * 
	 */
	public void setNature(String newValue) {
		if (newValue != null) {
			nature.setText(newValue);
		} else {
			nature.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#initProducts(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initProducts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		products.setContentProvider(contentProvider);
		products.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#updateProducts()
	 * 
	 */
	public void updateProducts() {
	products.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#addFilterProducts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProducts(ViewerFilter filter) {
		productsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#addBusinessFilterProducts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProducts(ViewerFilter filter) {
		productsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#isContainedInProductsTable(EObject element)
	 * 
	 */
	public boolean isContainedInProductsTable(EObject element) {
		return ((ReferencesTableSettings)products.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#initFunctionalities(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initFunctionalities(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		functionalities.setContentProvider(contentProvider);
		functionalities.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#updateFunctionalities()
	 * 
	 */
	public void updateFunctionalities() {
	functionalities.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#addFilterFunctionalities(ViewerFilter filter)
	 * 
	 */
	public void addFilterToFunctionalities(ViewerFilter filter) {
		functionalitiesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#addBusinessFilterFunctionalities(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToFunctionalities(ViewerFilter filter) {
		functionalitiesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#isContainedInFunctionalitiesTable(EObject element)
	 * 
	 */
	public boolean isContainedInFunctionalitiesTable(EObject element) {
		return ((ReferencesTableSettings)functionalities.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#initResources(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#updateResources()
	 * 
	 */
	public void updateResources() {
	resources.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#addFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResources(ViewerFilter filter) {
		resourcesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#addBusinessFilterResources(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResources(ViewerFilter filter) {
		resourcesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#isContainedInResourcesTable(EObject element)
	 * 
	 */
	public boolean isContainedInResourcesTable(EObject element) {
		return ((ReferencesTableSettings)resources.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#initProcesses(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#updateProcesses()
	 * 
	 */
	public void updateProcesses() {
	processes.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#addFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcesses(ViewerFilter filter) {
		processesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#addBusinessFilterProcesses(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcesses(ViewerFilter filter) {
		processesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#isContainedInProcessesTable(EObject element)
	 * 
	 */
	public boolean isContainedInProcessesTable(EObject element) {
		return ((ReferencesTableSettings)processes.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#initCustomers(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initCustomers(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		customers.setContentProvider(contentProvider);
		customers.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#updateCustomers()
	 * 
	 */
	public void updateCustomers() {
	customers.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#addFilterCustomers(ViewerFilter filter)
	 * 
	 */
	public void addFilterToCustomers(ViewerFilter filter) {
		customersFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#addBusinessFilterCustomers(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToCustomers(ViewerFilter filter) {
		customersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#isContainedInCustomersTable(EObject element)
	 * 
	 */
	public boolean isContainedInCustomersTable(EObject element) {
		return ((ReferencesTableSettings)customers.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#initValues(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initValues(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		values.setContentProvider(contentProvider);
		values.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#updateValues()
	 * 
	 */
	public void updateValues() {
	values.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#addFilterValues(ViewerFilter filter)
	 * 
	 */
	public void addFilterToValues(ViewerFilter filter) {
		valuesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#addBusinessFilterValues(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToValues(ViewerFilter filter) {
		valuesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#isContainedInValuesTable(EObject element)
	 * 
	 */
	public boolean isContainedInValuesTable(EObject element) {
		return ((ReferencesTableSettings)values.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#initStakeholders(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initStakeholders(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		stakeholders.setContentProvider(contentProvider);
		stakeholders.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#updateStakeholders()
	 * 
	 */
	public void updateStakeholders() {
	stakeholders.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#addFilterStakeholders(ViewerFilter filter)
	 * 
	 */
	public void addFilterToStakeholders(ViewerFilter filter) {
		stakeholdersFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#addBusinessFilterStakeholders(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToStakeholders(ViewerFilter filter) {
		stakeholdersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#isContainedInStakeholdersTable(EObject element)
	 * 
	 */
	public boolean isContainedInStakeholdersTable(EObject element) {
		return ((ReferencesTableSettings)stakeholders.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#initPartners(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initPartners(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		partners.setContentProvider(contentProvider);
		partners.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#updatePartners()
	 * 
	 */
	public void updatePartners() {
	partners.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#addFilterPartners(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPartners(ViewerFilter filter) {
		partnersFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#addBusinessFilterPartners(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPartners(ViewerFilter filter) {
		partnersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmServicePropertiesEditionPart#isContainedInPartnersTable(EObject element)
	 * 
	 */
	public boolean isContainedInPartnersTable(EObject element) {
		return ((ReferencesTableSettings)partners.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return BsmMessages.BsmService_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
