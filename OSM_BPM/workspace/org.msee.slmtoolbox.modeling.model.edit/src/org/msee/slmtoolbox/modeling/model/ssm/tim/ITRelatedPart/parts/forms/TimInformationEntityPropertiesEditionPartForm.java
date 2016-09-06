/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.forms;

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
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationEntity;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.ITRelatedPartViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.providers.ITRelatedPartMessages;
import org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs.TimAddRelationShipInToEntityDialog;
import org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs.TimAddRelationShipOutToEntityDialog;

// End of user code

/**
 * 
 * 
 */
public class TimInformationEntityPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TimInformationEntityPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable outRelations;
	protected List<ViewerFilter> outRelationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outRelationsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable inRelations;
	protected List<ViewerFilter> inRelationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> inRelationsFilters = new ArrayList<ViewerFilter>();
	protected EObjectFlatComboViewer information;



	/**
	 * For {@link ISection} use only.
	 */
	public TimInformationEntityPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TimInformationEntityPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence timInformationEntityStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = timInformationEntityStep.addStep(ITRelatedPartViewsRepository.TimInformationEntity.Properties.class);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimInformationEntity.Properties.name);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimInformationEntity.Properties.outRelations);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimInformationEntity.Properties.inRelations);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimInformationEntity.Properties.information);
		
		
		composer = new PartComposer(timInformationEntityStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ITRelatedPartViewsRepository.TimInformationEntity.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ITRelatedPartViewsRepository.TimInformationEntity.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == ITRelatedPartViewsRepository.TimInformationEntity.Properties.outRelations) {
					return createOutRelationsReferencesTable(widgetFactory, parent);
				}
				if (key == ITRelatedPartViewsRepository.TimInformationEntity.Properties.inRelations) {
					return createInRelationsReferencesTable(widgetFactory, parent);
				}
				if (key == ITRelatedPartViewsRepository.TimInformationEntity.Properties.information) {
					return createInformationFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(ITRelatedPartMessages.TimInformationEntityPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, ITRelatedPartViewsRepository.TimInformationEntity.Properties.name, ITRelatedPartMessages.TimInformationEntityPropertiesEditionPart_NameLabel);
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
							TimInformationEntityPropertiesEditionPartForm.this,
							ITRelatedPartViewsRepository.TimInformationEntity.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimInformationEntityPropertiesEditionPartForm.this,
									ITRelatedPartViewsRepository.TimInformationEntity.Properties.name,
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
									TimInformationEntityPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationEntityPropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationEntity.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ITRelatedPartViewsRepository.TimInformationEntity.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimInformationEntity.Properties.name, ITRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createOutRelationsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.outRelations = new ReferencesTable(getDescription(ITRelatedPartViewsRepository.TimInformationEntity.Properties.outRelations, ITRelatedPartMessages.TimInformationEntityPropertiesEditionPart_OutRelationsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addOutRelations(); }
			public void handleEdit(EObject element) { editOutRelations(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutRelations(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutRelations(element); }
			public void navigateTo(EObject element) { }
		});
		this.outRelations.setHelpText(propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimInformationEntity.Properties.outRelations, ITRelatedPartViewsRepository.FORM_KIND));
		this.outRelations.createControls(parent, widgetFactory);
		this.outRelations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationEntityPropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationEntity.Properties.outRelations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData outRelationsData = new GridData(GridData.FILL_HORIZONTAL);
		outRelationsData.horizontalSpan = 3;
		this.outRelations.setLayoutData(outRelationsData);
		this.outRelations.disableMove();
		outRelations.setID(ITRelatedPartViewsRepository.TimInformationEntity.Properties.outRelations);
		outRelations.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutRelations() {
		// Start of user code
		TimAddRelationShipOutToEntityDialog dialog = new TimAddRelationShipOutToEntityDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), outRelations.getLabelProvider(), (TimInformationEntity) ((ReferencesTableSettings)this.outRelations.getInput()).getSource());		
		dialog.open();
		outRelations.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveOutRelations(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationEntityPropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationEntity.Properties.outRelations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outRelations.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutRelations(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationEntityPropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationEntity.Properties.outRelations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outRelations.refresh();
	}

	/**
	 * 
	 */
	protected void editOutRelations(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outRelations.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createInRelationsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.inRelations = new ReferencesTable(getDescription(ITRelatedPartViewsRepository.TimInformationEntity.Properties.inRelations, ITRelatedPartMessages.TimInformationEntityPropertiesEditionPart_InRelationsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addInRelations(); }
			public void handleEdit(EObject element) { editInRelations(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveInRelations(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromInRelations(element); }
			public void navigateTo(EObject element) { }
		});
		this.inRelations.setHelpText(propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimInformationEntity.Properties.inRelations, ITRelatedPartViewsRepository.FORM_KIND));
		this.inRelations.createControls(parent, widgetFactory);
		this.inRelations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationEntityPropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationEntity.Properties.inRelations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData inRelationsData = new GridData(GridData.FILL_HORIZONTAL);
		inRelationsData.horizontalSpan = 3;
		this.inRelations.setLayoutData(inRelationsData);
		this.inRelations.disableMove();
		inRelations.setID(ITRelatedPartViewsRepository.TimInformationEntity.Properties.inRelations);
		inRelations.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addInRelations() {
		// Start of user code
		TimAddRelationShipInToEntityDialog dialog = new TimAddRelationShipInToEntityDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), inRelations.getLabelProvider(), (TimInformationEntity) ((ReferencesTableSettings)this.inRelations.getInput()).getSource());		
		dialog.open();
		inRelations.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveInRelations(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationEntityPropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationEntity.Properties.inRelations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		inRelations.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInRelations(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationEntityPropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationEntity.Properties.inRelations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		inRelations.refresh();
	}

	/**
	 * 
	 */
	protected void editInRelations(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				inRelations.refresh();
			}
		}
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createInformationFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, ITRelatedPartViewsRepository.TimInformationEntity.Properties.information, ITRelatedPartMessages.TimInformationEntityPropertiesEditionPart_InformationLabel);
		information = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ITRelatedPartViewsRepository.TimInformationEntity.Properties.information, ITRelatedPartViewsRepository.FORM_KIND));
		widgetFactory.adapt(information);
		information.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData informationData = new GridData(GridData.FILL_HORIZONTAL);
		information.setLayoutData(informationData);
		information.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationEntityPropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationEntity.Properties.information, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getInformation()));
			}

		});
		information.setID(ITRelatedPartViewsRepository.TimInformationEntity.Properties.information);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimInformationEntity.Properties.information, ITRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart#initOutRelations(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutRelations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outRelations.setContentProvider(contentProvider);
		outRelations.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart#updateOutRelations()
	 * 
	 */
	public void updateOutRelations() {
	outRelations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart#addFilterOutRelations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutRelations(ViewerFilter filter) {
		outRelationsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart#addBusinessFilterOutRelations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutRelations(ViewerFilter filter) {
		outRelationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart#isContainedInOutRelationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutRelationsTable(EObject element) {
		return ((ReferencesTableSettings)outRelations.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart#initInRelations(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInRelations(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inRelations.setContentProvider(contentProvider);
		inRelations.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart#updateInRelations()
	 * 
	 */
	public void updateInRelations() {
	inRelations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart#addFilterInRelations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInRelations(ViewerFilter filter) {
		inRelationsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart#addBusinessFilterInRelations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInRelations(ViewerFilter filter) {
		inRelationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart#isContainedInInRelationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInInRelationsTable(EObject element) {
		return ((ReferencesTableSettings)inRelations.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart#getInformation()
	 * 
	 */
	public EObject getInformation() {
		if (information.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) information.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart#initInformation(EObjectFlatComboSettings)
	 */
	public void initInformation(EObjectFlatComboSettings settings) {
		information.setInput(settings);
		if (current != null) {
			information.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart#setInformation(EObject newValue)
	 * 
	 */
	public void setInformation(EObject newValue) {
		if (newValue != null) {
			information.setSelection(new StructuredSelection(newValue));
		} else {
			information.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart#setInformationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setInformationButtonMode(ButtonsModeEnum newValue) {
		information.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart#addFilterInformation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInformation(ViewerFilter filter) {
		information.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationEntityPropertiesEditionPart#addBusinessFilterInformation(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInformation(ViewerFilter filter) {
		information.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ITRelatedPartMessages.TimInformationEntity_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
