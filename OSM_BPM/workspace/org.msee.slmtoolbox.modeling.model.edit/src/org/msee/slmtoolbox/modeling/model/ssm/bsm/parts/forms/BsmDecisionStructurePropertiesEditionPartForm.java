/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionStructurePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmDecisionStructurePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, BsmDecisionStructurePropertiesEditionPart {

	protected Text name;
	protected ReferencesTable organizations;
	protected List<ViewerFilter> organizationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> organizationsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable ggGraiGrids;
	protected List<ViewerFilter> ggGraiGridsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ggGraiGridsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public BsmDecisionStructurePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmDecisionStructurePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence bsmDecisionStructureStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = bsmDecisionStructureStep.addStep(BsmViewsRepository.BsmDecisionStructure.Properties.class);
		propertiesStep.addStep(BsmViewsRepository.BsmDecisionStructure.Properties.name);
		propertiesStep.addStep(BsmViewsRepository.BsmDecisionStructure.Properties.organizations);
		propertiesStep.addStep(BsmViewsRepository.BsmDecisionStructure.Properties.ggGraiGrids);
		
		
		composer = new PartComposer(bsmDecisionStructureStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == BsmViewsRepository.BsmDecisionStructure.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmDecisionStructure.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmDecisionStructure.Properties.organizations) {
					return createOrganizationsReferencesTable(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmDecisionStructure.Properties.ggGraiGrids) {
					return createGgGraiGridsReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(BsmMessages.BsmDecisionStructurePropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, BsmViewsRepository.BsmDecisionStructure.Properties.name, BsmMessages.BsmDecisionStructurePropertiesEditionPart_NameLabel);
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
							BsmDecisionStructurePropertiesEditionPartForm.this,
							BsmViewsRepository.BsmDecisionStructure.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmDecisionStructurePropertiesEditionPartForm.this,
									BsmViewsRepository.BsmDecisionStructure.Properties.name,
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
									BsmDecisionStructurePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionStructurePropertiesEditionPartForm.this, BsmViewsRepository.BsmDecisionStructure.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, BsmViewsRepository.BsmDecisionStructure.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecisionStructure.Properties.name, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createOrganizationsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.organizations = new ReferencesTable(getDescription(BsmViewsRepository.BsmDecisionStructure.Properties.organizations, BsmMessages.BsmDecisionStructurePropertiesEditionPart_OrganizationsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addOrganizations(); }
			public void handleEdit(EObject element) { editOrganizations(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOrganizations(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOrganizations(element); }
			public void navigateTo(EObject element) { }
		});
		this.organizations.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecisionStructure.Properties.organizations, BsmViewsRepository.FORM_KIND));
		this.organizations.createControls(parent, widgetFactory);
		this.organizations.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionStructurePropertiesEditionPartForm.this, BsmViewsRepository.BsmDecisionStructure.Properties.organizations, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData organizationsData = new GridData(GridData.FILL_HORIZONTAL);
		organizationsData.horizontalSpan = 3;
		this.organizations.setLayoutData(organizationsData);
		this.organizations.disableMove();
		organizations.setID(BsmViewsRepository.BsmDecisionStructure.Properties.organizations);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionStructurePropertiesEditionPartForm.this, BsmViewsRepository.BsmDecisionStructure.Properties.organizations,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionStructurePropertiesEditionPartForm.this, BsmViewsRepository.BsmDecisionStructure.Properties.organizations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		organizations.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOrganizations(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionStructurePropertiesEditionPartForm.this, BsmViewsRepository.BsmDecisionStructure.Properties.organizations, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
	 * 
	 */
	protected Composite createGgGraiGridsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.ggGraiGrids = new ReferencesTable(getDescription(BsmViewsRepository.BsmDecisionStructure.Properties.ggGraiGrids, BsmMessages.BsmDecisionStructurePropertiesEditionPart_GgGraiGridsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addGgGraiGrids(); }
			public void handleEdit(EObject element) { editGgGraiGrids(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGgGraiGrids(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGgGraiGrids(element); }
			public void navigateTo(EObject element) { }
		});
		this.ggGraiGrids.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecisionStructure.Properties.ggGraiGrids, BsmViewsRepository.FORM_KIND));
		this.ggGraiGrids.createControls(parent, widgetFactory);
		this.ggGraiGrids.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionStructurePropertiesEditionPartForm.this, BsmViewsRepository.BsmDecisionStructure.Properties.ggGraiGrids, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ggGraiGridsData = new GridData(GridData.FILL_HORIZONTAL);
		ggGraiGridsData.horizontalSpan = 3;
		this.ggGraiGrids.setLayoutData(ggGraiGridsData);
		this.ggGraiGrids.disableMove();
		ggGraiGrids.setID(BsmViewsRepository.BsmDecisionStructure.Properties.ggGraiGrids);
		ggGraiGrids.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addGgGraiGrids() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(ggGraiGrids.getInput(), ggGraiGridsFilters, ggGraiGridsBusinessFilters,
		"ggGraiGrids", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionStructurePropertiesEditionPartForm.this, BsmViewsRepository.BsmDecisionStructure.Properties.ggGraiGrids,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				ggGraiGrids.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveGgGraiGrids(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionStructurePropertiesEditionPartForm.this, BsmViewsRepository.BsmDecisionStructure.Properties.ggGraiGrids, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		ggGraiGrids.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGgGraiGrids(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionStructurePropertiesEditionPartForm.this, BsmViewsRepository.BsmDecisionStructure.Properties.ggGraiGrids, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		ggGraiGrids.refresh();
	}

	/**
	 * 
	 */
	protected void editGgGraiGrids(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				ggGraiGrids.refresh();
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionStructurePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionStructurePropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionStructurePropertiesEditionPart#initOrganizations(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionStructurePropertiesEditionPart#updateOrganizations()
	 * 
	 */
	public void updateOrganizations() {
	organizations.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionStructurePropertiesEditionPart#addFilterOrganizations(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOrganizations(ViewerFilter filter) {
		organizationsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionStructurePropertiesEditionPart#addBusinessFilterOrganizations(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOrganizations(ViewerFilter filter) {
		organizationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionStructurePropertiesEditionPart#isContainedInOrganizationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOrganizationsTable(EObject element) {
		return ((ReferencesTableSettings)organizations.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionStructurePropertiesEditionPart#initGgGraiGrids(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initGgGraiGrids(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ggGraiGrids.setContentProvider(contentProvider);
		ggGraiGrids.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionStructurePropertiesEditionPart#updateGgGraiGrids()
	 * 
	 */
	public void updateGgGraiGrids() {
	ggGraiGrids.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionStructurePropertiesEditionPart#addFilterGgGraiGrids(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGgGraiGrids(ViewerFilter filter) {
		ggGraiGridsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionStructurePropertiesEditionPart#addBusinessFilterGgGraiGrids(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGgGraiGrids(ViewerFilter filter) {
		ggGraiGridsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionStructurePropertiesEditionPart#isContainedInGgGraiGridsTable(EObject element)
	 * 
	 */
	public boolean isContainedInGgGraiGridsTable(EObject element) {
		return ((ReferencesTableSettings)ggGraiGrids.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return BsmMessages.BsmDecisionStructure_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
