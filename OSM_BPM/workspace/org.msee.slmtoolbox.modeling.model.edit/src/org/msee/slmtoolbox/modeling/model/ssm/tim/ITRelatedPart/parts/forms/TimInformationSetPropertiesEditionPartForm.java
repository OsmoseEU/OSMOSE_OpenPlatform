/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
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
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
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
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.TimInformationSet;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.ITRelatedPartViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationSetPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.providers.ITRelatedPartMessages;
import org.msee.slmtoolbox.modeling.model.ssm.tim.dialogs.TimAddEnterpriseApplicationToInformationDialog;

// End of user code

/**
 * 
 * 
 */
public class TimInformationSetPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TimInformationSetPropertiesEditionPart {

	protected Text name;
	protected ReferencesTable entrepriseApplications;
	protected List<ViewerFilter> entrepriseApplicationsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> entrepriseApplicationsFilters = new ArrayList<ViewerFilter>();
	protected Text model;



	/**
	 * For {@link ISection} use only.
	 */
	public TimInformationSetPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TimInformationSetPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence timInformationSetStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = timInformationSetStep.addStep(ITRelatedPartViewsRepository.TimInformationSet.Properties.class);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimInformationSet.Properties.name);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimInformationSet.Properties.entrepriseApplications);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimInformationSet.Properties.model);
		
		
		composer = new PartComposer(timInformationSetStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ITRelatedPartViewsRepository.TimInformationSet.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ITRelatedPartViewsRepository.TimInformationSet.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == ITRelatedPartViewsRepository.TimInformationSet.Properties.entrepriseApplications) {
					return createEntrepriseApplicationsReferencesTable(widgetFactory, parent);
				}
				if (key == ITRelatedPartViewsRepository.TimInformationSet.Properties.model) {
					return createModelText(widgetFactory, parent);
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
		propertiesSection.setText(ITRelatedPartMessages.TimInformationSetPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, ITRelatedPartViewsRepository.TimInformationSet.Properties.name, ITRelatedPartMessages.TimInformationSetPropertiesEditionPart_NameLabel);
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
							TimInformationSetPropertiesEditionPartForm.this,
							ITRelatedPartViewsRepository.TimInformationSet.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimInformationSetPropertiesEditionPartForm.this,
									ITRelatedPartViewsRepository.TimInformationSet.Properties.name,
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
									TimInformationSetPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationSetPropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationSet.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ITRelatedPartViewsRepository.TimInformationSet.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimInformationSet.Properties.name, ITRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createEntrepriseApplicationsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.entrepriseApplications = new ReferencesTable(getDescription(ITRelatedPartViewsRepository.TimInformationSet.Properties.entrepriseApplications, ITRelatedPartMessages.TimInformationSetPropertiesEditionPart_EntrepriseApplicationsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addEntrepriseApplications(); }
			public void handleEdit(EObject element) { editEntrepriseApplications(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveEntrepriseApplications(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromEntrepriseApplications(element); }
			public void navigateTo(EObject element) { }
		});
		this.entrepriseApplications.setHelpText(propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimInformationSet.Properties.entrepriseApplications, ITRelatedPartViewsRepository.FORM_KIND));
		this.entrepriseApplications.createControls(parent, widgetFactory);
		this.entrepriseApplications.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationSetPropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationSet.Properties.entrepriseApplications, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData entrepriseApplicationsData = new GridData(GridData.FILL_HORIZONTAL);
		entrepriseApplicationsData.horizontalSpan = 3;
		this.entrepriseApplications.setLayoutData(entrepriseApplicationsData);
		this.entrepriseApplications.disableMove();
		entrepriseApplications.setID(ITRelatedPartViewsRepository.TimInformationSet.Properties.entrepriseApplications);
		entrepriseApplications.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addEntrepriseApplications() {
		// Start of user code
		TimAddEnterpriseApplicationToInformationDialog dialog = new TimAddEnterpriseApplicationToInformationDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), entrepriseApplications.getLabelProvider(), (TimInformationSet) ((ReferencesTableSettings)this.entrepriseApplications.getInput()).getSource());		
		dialog.open();
		entrepriseApplications.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveEntrepriseApplications(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationSetPropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationSet.Properties.entrepriseApplications, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		entrepriseApplications.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromEntrepriseApplications(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationSetPropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationSet.Properties.entrepriseApplications, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		entrepriseApplications.refresh();
	}

	/**
	 * 
	 */
	protected void editEntrepriseApplications(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				entrepriseApplications.refresh();
			}
		}
	}

	
	protected Composite createModelText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ITRelatedPartViewsRepository.TimInformationSet.Properties.model, ITRelatedPartMessages.TimInformationSetPropertiesEditionPart_ModelLabel);
		model = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		model.setEnabled(false);
		model.setToolTipText(ITRelatedPartMessages.TimInformationSet_ReadOnly);
		model.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData modelData = new GridData(GridData.FILL_HORIZONTAL);
		model.setLayoutData(modelData);
		model.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimInformationSetPropertiesEditionPartForm.this,
							ITRelatedPartViewsRepository.TimInformationSet.Properties.model,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, model.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimInformationSetPropertiesEditionPartForm.this,
									ITRelatedPartViewsRepository.TimInformationSet.Properties.model,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, model.getText()));
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
									TimInformationSetPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		model.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationSetPropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationSet.Properties.model, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, model.getText()));
				}
			}
		});
		EditingUtils.setID(model, ITRelatedPartViewsRepository.TimInformationSet.Properties.model);
		EditingUtils.setEEFtype(model, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimInformationSet.Properties.model, ITRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationSetPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationSetPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationSetPropertiesEditionPart#initEntrepriseApplications(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initEntrepriseApplications(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		entrepriseApplications.setContentProvider(contentProvider);
		entrepriseApplications.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationSetPropertiesEditionPart#updateEntrepriseApplications()
	 * 
	 */
	public void updateEntrepriseApplications() {
	entrepriseApplications.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationSetPropertiesEditionPart#addFilterEntrepriseApplications(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEntrepriseApplications(ViewerFilter filter) {
		entrepriseApplicationsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationSetPropertiesEditionPart#addBusinessFilterEntrepriseApplications(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEntrepriseApplications(ViewerFilter filter) {
		entrepriseApplicationsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationSetPropertiesEditionPart#isContainedInEntrepriseApplicationsTable(EObject element)
	 * 
	 */
	public boolean isContainedInEntrepriseApplicationsTable(EObject element) {
		return ((ReferencesTableSettings)entrepriseApplications.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationSetPropertiesEditionPart#getModel()
	 * 
	 */
	public String getModel() {
		return model.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationSetPropertiesEditionPart#setModel(String newValue)
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
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ITRelatedPartMessages.TimInformationSet_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
