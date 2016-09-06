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
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmFunctionality;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs.BsmAddFunctionalityToFunctionalityDialog;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmFunctionalityPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, BsmFunctionalityPropertiesEditionPart {

	protected Text name;
	protected Text type;
	protected Text description;
	protected EObjectFlatComboViewer product;
	protected ReferencesTable subFunctions;
	protected List<ViewerFilter> subFunctionsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> subFunctionsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer mainFunction;



	/**
	 * For {@link ISection} use only.
	 */
	public BsmFunctionalityPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmFunctionalityPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence bsmFunctionalityStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = bsmFunctionalityStep.addStep(BsmViewsRepository.BsmFunctionality.Properties.class);
		propertiesStep.addStep(BsmViewsRepository.BsmFunctionality.Properties.name);
		propertiesStep.addStep(BsmViewsRepository.BsmFunctionality.Properties.type);
		propertiesStep.addStep(BsmViewsRepository.BsmFunctionality.Properties.description);
		propertiesStep.addStep(BsmViewsRepository.BsmFunctionality.Properties.product);
		propertiesStep.addStep(BsmViewsRepository.BsmFunctionality.Properties.subFunctions);
		propertiesStep.addStep(BsmViewsRepository.BsmFunctionality.Properties.mainFunction);
		
		
		composer = new PartComposer(bsmFunctionalityStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == BsmViewsRepository.BsmFunctionality.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmFunctionality.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmFunctionality.Properties.type) {
					return createTypeText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmFunctionality.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmFunctionality.Properties.product) {
					return createProductFlatComboViewer(parent, widgetFactory);
				}
				if (key == BsmViewsRepository.BsmFunctionality.Properties.subFunctions) {
					return createSubFunctionsReferencesTable(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmFunctionality.Properties.mainFunction) {
					return createMainFunctionFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(BsmMessages.BsmFunctionalityPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, BsmViewsRepository.BsmFunctionality.Properties.name, BsmMessages.BsmFunctionalityPropertiesEditionPart_NameLabel);
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
							BsmFunctionalityPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmFunctionality.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmFunctionalityPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmFunctionality.Properties.name,
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
									BsmFunctionalityPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmFunctionalityPropertiesEditionPartForm.this, BsmViewsRepository.BsmFunctionality.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, BsmViewsRepository.BsmFunctionality.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmFunctionality.Properties.name, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmFunctionality.Properties.type, BsmMessages.BsmFunctionalityPropertiesEditionPart_TypeLabel);
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
							BsmFunctionalityPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmFunctionality.Properties.type,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmFunctionalityPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmFunctionality.Properties.type,
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
									BsmFunctionalityPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmFunctionalityPropertiesEditionPartForm.this, BsmViewsRepository.BsmFunctionality.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
				}
			}
		});
		EditingUtils.setID(type, BsmViewsRepository.BsmFunctionality.Properties.type);
		EditingUtils.setEEFtype(type, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmFunctionality.Properties.type, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmFunctionality.Properties.description, BsmMessages.BsmFunctionalityPropertiesEditionPart_DescriptionLabel);
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
							BsmFunctionalityPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmFunctionality.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmFunctionalityPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmFunctionality.Properties.description,
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
									BsmFunctionalityPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmFunctionalityPropertiesEditionPartForm.this, BsmViewsRepository.BsmFunctionality.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, BsmViewsRepository.BsmFunctionality.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmFunctionality.Properties.description, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createProductFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, BsmViewsRepository.BsmFunctionality.Properties.product, BsmMessages.BsmFunctionalityPropertiesEditionPart_ProductLabel);
		product = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmFunctionality.Properties.product, BsmViewsRepository.FORM_KIND));
		widgetFactory.adapt(product);
		product.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData productData = new GridData(GridData.FILL_HORIZONTAL);
		product.setLayoutData(productData);
		product.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmFunctionalityPropertiesEditionPartForm.this, BsmViewsRepository.BsmFunctionality.Properties.product, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getProduct()));
			}

		});
		product.setID(BsmViewsRepository.BsmFunctionality.Properties.product);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmFunctionality.Properties.product, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createSubFunctionsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.subFunctions = new ReferencesTable(getDescription(BsmViewsRepository.BsmFunctionality.Properties.subFunctions, BsmMessages.BsmFunctionalityPropertiesEditionPart_SubFunctionsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addSubFunctions(); }
			public void handleEdit(EObject element) { editSubFunctions(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveSubFunctions(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromSubFunctions(element); }
			public void navigateTo(EObject element) { }
		});
		this.subFunctions.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmFunctionality.Properties.subFunctions, BsmViewsRepository.FORM_KIND));
		this.subFunctions.createControls(parent, widgetFactory);
		this.subFunctions.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmFunctionalityPropertiesEditionPartForm.this, BsmViewsRepository.BsmFunctionality.Properties.subFunctions, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData subFunctionsData = new GridData(GridData.FILL_HORIZONTAL);
		subFunctionsData.horizontalSpan = 3;
		this.subFunctions.setLayoutData(subFunctionsData);
		this.subFunctions.disableMove();
		subFunctions.setID(BsmViewsRepository.BsmFunctionality.Properties.subFunctions);
		subFunctions.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addSubFunctions() {
		// Start of user code
		BsmAddFunctionalityToFunctionalityDialog dialog = new BsmAddFunctionalityToFunctionalityDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), subFunctions.getLabelProvider(), (BsmFunctionality) ((ReferencesTableSettings)this.subFunctions.getInput()).getSource());		
		dialog.open();
		subFunctions.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveSubFunctions(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmFunctionalityPropertiesEditionPartForm.this, BsmViewsRepository.BsmFunctionality.Properties.subFunctions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		subFunctions.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromSubFunctions(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmFunctionalityPropertiesEditionPartForm.this, BsmViewsRepository.BsmFunctionality.Properties.subFunctions, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		subFunctions.refresh();
	}

	/**
	 * 
	 */
	protected void editSubFunctions(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				subFunctions.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createMainFunctionFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, BsmViewsRepository.BsmFunctionality.Properties.mainFunction, BsmMessages.BsmFunctionalityPropertiesEditionPart_MainFunctionLabel);
		mainFunction = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmFunctionality.Properties.mainFunction, BsmViewsRepository.FORM_KIND));
		widgetFactory.adapt(mainFunction);
		mainFunction.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData mainFunctionData = new GridData(GridData.FILL_HORIZONTAL);
		mainFunction.setLayoutData(mainFunctionData);
		mainFunction.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmFunctionalityPropertiesEditionPartForm.this, BsmViewsRepository.BsmFunctionality.Properties.mainFunction, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getMainFunction()));
			}

		});
		mainFunction.setID(BsmViewsRepository.BsmFunctionality.Properties.mainFunction);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmFunctionality.Properties.mainFunction, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#getType()
	 * 
	 */
	public String getType() {
		return type.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#setType(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#getProduct()
	 * 
	 */
	public EObject getProduct() {
		if (product.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) product.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#initProduct(EObjectFlatComboSettings)
	 */
	public void initProduct(EObjectFlatComboSettings settings) {
		product.setInput(settings);
		if (current != null) {
			product.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#setProduct(EObject newValue)
	 * 
	 */
	public void setProduct(EObject newValue) {
		if (newValue != null) {
			product.setSelection(new StructuredSelection(newValue));
		} else {
			product.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#setProductButtonMode(ButtonsModeEnum newValue)
	 */
	public void setProductButtonMode(ButtonsModeEnum newValue) {
		product.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#addFilterProduct(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProduct(ViewerFilter filter) {
		product.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#addBusinessFilterProduct(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProduct(ViewerFilter filter) {
		product.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#initSubFunctions(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initSubFunctions(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		subFunctions.setContentProvider(contentProvider);
		subFunctions.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#updateSubFunctions()
	 * 
	 */
	public void updateSubFunctions() {
	subFunctions.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#addFilterSubFunctions(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSubFunctions(ViewerFilter filter) {
		subFunctionsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#addBusinessFilterSubFunctions(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSubFunctions(ViewerFilter filter) {
		subFunctionsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#isContainedInSubFunctionsTable(EObject element)
	 * 
	 */
	public boolean isContainedInSubFunctionsTable(EObject element) {
		return ((ReferencesTableSettings)subFunctions.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#getMainFunction()
	 * 
	 */
	public EObject getMainFunction() {
		if (mainFunction.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) mainFunction.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#initMainFunction(EObjectFlatComboSettings)
	 */
	public void initMainFunction(EObjectFlatComboSettings settings) {
		mainFunction.setInput(settings);
		if (current != null) {
			mainFunction.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#setMainFunction(EObject newValue)
	 * 
	 */
	public void setMainFunction(EObject newValue) {
		if (newValue != null) {
			mainFunction.setSelection(new StructuredSelection(newValue));
		} else {
			mainFunction.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#setMainFunctionButtonMode(ButtonsModeEnum newValue)
	 */
	public void setMainFunctionButtonMode(ButtonsModeEnum newValue) {
		mainFunction.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#addFilterMainFunction(ViewerFilter filter)
	 * 
	 */
	public void addFilterToMainFunction(ViewerFilter filter) {
		mainFunction.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmFunctionalityPropertiesEditionPart#addBusinessFilterMainFunction(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToMainFunction(ViewerFilter filter) {
		mainFunction.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return BsmMessages.BsmFunctionality_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
