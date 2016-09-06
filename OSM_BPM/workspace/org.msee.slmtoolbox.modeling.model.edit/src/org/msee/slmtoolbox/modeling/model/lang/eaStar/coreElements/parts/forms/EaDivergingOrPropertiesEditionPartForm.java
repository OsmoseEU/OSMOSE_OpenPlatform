/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms;

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
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.providers.CoreElementsMessages;

// End of user code

/**
 * 
 * 
 */
public class EaDivergingOrPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, EaDivergingOrPropertiesEditionPart {

	protected Text name;
	protected Text code;
	protected Text description;
	protected Text organization;
	protected ReferencesTable inFlows;
	protected List<ViewerFilter> inFlowsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> inFlowsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable outFlows;
	protected List<ViewerFilter> outFlowsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outFlowsFilters = new ArrayList<ViewerFilter>();



	/**
	 * For {@link ISection} use only.
	 */
	public EaDivergingOrPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EaDivergingOrPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence eaDivergingOrStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = eaDivergingOrStep.addStep(CoreElementsViewsRepository.EaDivergingOr.Properties.class);
		propertiesStep.addStep(CoreElementsViewsRepository.EaDivergingOr.Properties.name);
		propertiesStep.addStep(CoreElementsViewsRepository.EaDivergingOr.Properties.code);
		propertiesStep.addStep(CoreElementsViewsRepository.EaDivergingOr.Properties.description);
		propertiesStep.addStep(CoreElementsViewsRepository.EaDivergingOr.Properties.organization);
		propertiesStep.addStep(CoreElementsViewsRepository.EaDivergingOr.Properties.inFlows);
		propertiesStep.addStep(CoreElementsViewsRepository.EaDivergingOr.Properties.outFlows);
		
		
		composer = new PartComposer(eaDivergingOrStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CoreElementsViewsRepository.EaDivergingOr.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaDivergingOr.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaDivergingOr.Properties.code) {
					return createCodeText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaDivergingOr.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaDivergingOr.Properties.organization) {
					return createOrganizationText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaDivergingOr.Properties.inFlows) {
					return createInFlowsReferencesTable(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaDivergingOr.Properties.outFlows) {
					return createOutFlowsReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(CoreElementsMessages.EaDivergingOrPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, CoreElementsViewsRepository.EaDivergingOr.Properties.name, CoreElementsMessages.EaDivergingOrPropertiesEditionPart_NameLabel);
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
							EaDivergingOrPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaDivergingOr.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaDivergingOrPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaDivergingOr.Properties.name,
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
									EaDivergingOrPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaDivergingOrPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaDivergingOr.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, CoreElementsViewsRepository.EaDivergingOr.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaDivergingOr.Properties.name, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCodeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaDivergingOr.Properties.code, CoreElementsMessages.EaDivergingOrPropertiesEditionPart_CodeLabel);
		code = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		code.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData codeData = new GridData(GridData.FILL_HORIZONTAL);
		code.setLayoutData(codeData);
		code.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaDivergingOrPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaDivergingOr.Properties.code,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaDivergingOrPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaDivergingOr.Properties.code,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, code.getText()));
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
									EaDivergingOrPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		code.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaDivergingOrPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaDivergingOr.Properties.code, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
				}
			}
		});
		EditingUtils.setID(code, CoreElementsViewsRepository.EaDivergingOr.Properties.code);
		EditingUtils.setEEFtype(code, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaDivergingOr.Properties.code, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaDivergingOr.Properties.description, CoreElementsMessages.EaDivergingOrPropertiesEditionPart_DescriptionLabel);
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
							EaDivergingOrPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaDivergingOr.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaDivergingOrPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaDivergingOr.Properties.description,
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
									EaDivergingOrPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaDivergingOrPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaDivergingOr.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, CoreElementsViewsRepository.EaDivergingOr.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaDivergingOr.Properties.description, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOrganizationText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaDivergingOr.Properties.organization, CoreElementsMessages.EaDivergingOrPropertiesEditionPart_OrganizationLabel);
		organization = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		organization.setEnabled(false);
		organization.setToolTipText(CoreElementsMessages.EaDivergingOr_ReadOnly);
		organization.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData organizationData = new GridData(GridData.FILL_HORIZONTAL);
		organization.setLayoutData(organizationData);
		organization.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaDivergingOrPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaDivergingOr.Properties.organization,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, organization.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaDivergingOrPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaDivergingOr.Properties.organization,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, organization.getText()));
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
									EaDivergingOrPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		organization.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaDivergingOrPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaDivergingOr.Properties.organization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, organization.getText()));
				}
			}
		});
		EditingUtils.setID(organization, CoreElementsViewsRepository.EaDivergingOr.Properties.organization);
		EditingUtils.setEEFtype(organization, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaDivergingOr.Properties.organization, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createInFlowsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.inFlows = new ReferencesTable(getDescription(CoreElementsViewsRepository.EaDivergingOr.Properties.inFlows, CoreElementsMessages.EaDivergingOrPropertiesEditionPart_InFlowsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addInFlows(); }
			public void handleEdit(EObject element) { editInFlows(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveInFlows(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromInFlows(element); }
			public void navigateTo(EObject element) { }
		});
		this.inFlows.setHelpText(propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaDivergingOr.Properties.inFlows, CoreElementsViewsRepository.FORM_KIND));
		this.inFlows.createControls(parent, widgetFactory);
		this.inFlows.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaDivergingOrPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaDivergingOr.Properties.inFlows, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		inFlows.setEnabled(false);
		inFlows.setToolTipText(CoreElementsMessages.EaDivergingOr_ReadOnly);
		GridData inFlowsData = new GridData(GridData.FILL_HORIZONTAL);
		inFlowsData.horizontalSpan = 3;
		this.inFlows.setLayoutData(inFlowsData);
		this.inFlows.disableMove();
		inFlows.setID(CoreElementsViewsRepository.EaDivergingOr.Properties.inFlows);
		inFlows.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addInFlows() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(inFlows.getInput(), inFlowsFilters, inFlowsBusinessFilters,
		"inFlows", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaDivergingOrPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaDivergingOr.Properties.inFlows,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				inFlows.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveInFlows(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaDivergingOrPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaDivergingOr.Properties.inFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		inFlows.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInFlows(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaDivergingOrPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaDivergingOr.Properties.inFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		inFlows.refresh();
	}

	/**
	 * 
	 */
	protected void editInFlows(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				inFlows.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOutFlowsReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.outFlows = new ReferencesTable(getDescription(CoreElementsViewsRepository.EaDivergingOr.Properties.outFlows, CoreElementsMessages.EaDivergingOrPropertiesEditionPart_OutFlowsLabel), new ReferencesTableListener	() {
			public void handleAdd() { addOutFlows(); }
			public void handleEdit(EObject element) { editOutFlows(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutFlows(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutFlows(element); }
			public void navigateTo(EObject element) { }
		});
		this.outFlows.setHelpText(propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaDivergingOr.Properties.outFlows, CoreElementsViewsRepository.FORM_KIND));
		this.outFlows.createControls(parent, widgetFactory);
		this.outFlows.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaDivergingOrPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaDivergingOr.Properties.outFlows, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		outFlows.setEnabled(false);
		outFlows.setToolTipText(CoreElementsMessages.EaDivergingOr_ReadOnly);
		GridData outFlowsData = new GridData(GridData.FILL_HORIZONTAL);
		outFlowsData.horizontalSpan = 3;
		this.outFlows.setLayoutData(outFlowsData);
		this.outFlows.disableMove();
		outFlows.setID(CoreElementsViewsRepository.EaDivergingOr.Properties.outFlows);
		outFlows.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutFlows() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outFlows.getInput(), outFlowsFilters, outFlowsBusinessFilters,
		"outFlows", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaDivergingOrPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaDivergingOr.Properties.outFlows,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outFlows.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutFlows(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaDivergingOrPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaDivergingOr.Properties.outFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outFlows.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutFlows(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaDivergingOrPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaDivergingOr.Properties.outFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outFlows.refresh();
	}

	/**
	 * 
	 */
	protected void editOutFlows(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outFlows.refresh();
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart#getCode()
	 * 
	 */
	public String getCode() {
		return code.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart#setCode(String newValue)
	 * 
	 */
	public void setCode(String newValue) {
		if (newValue != null) {
			code.setText(newValue);
		} else {
			code.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart#getOrganization()
	 * 
	 */
	public String getOrganization() {
		return organization.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart#setOrganization(String newValue)
	 * 
	 */
	public void setOrganization(String newValue) {
		if (newValue != null) {
			organization.setText(newValue);
		} else {
			organization.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart#initInFlows(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInFlows(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inFlows.setContentProvider(contentProvider);
		inFlows.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart#updateInFlows()
	 * 
	 */
	public void updateInFlows() {
	inFlows.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart#addFilterInFlows(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInFlows(ViewerFilter filter) {
		inFlowsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart#addBusinessFilterInFlows(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInFlows(ViewerFilter filter) {
		inFlowsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart#isContainedInInFlowsTable(EObject element)
	 * 
	 */
	public boolean isContainedInInFlowsTable(EObject element) {
		return ((ReferencesTableSettings)inFlows.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart#initOutFlows(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutFlows(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outFlows.setContentProvider(contentProvider);
		outFlows.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart#updateOutFlows()
	 * 
	 */
	public void updateOutFlows() {
	outFlows.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart#addFilterOutFlows(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutFlows(ViewerFilter filter) {
		outFlowsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart#addBusinessFilterOutFlows(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutFlows(ViewerFilter filter) {
		outFlowsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaDivergingOrPropertiesEditionPart#isContainedInOutFlowsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutFlowsTable(EObject element) {
		return ((ReferencesTableSettings)outFlows.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CoreElementsMessages.EaDivergingOr_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
