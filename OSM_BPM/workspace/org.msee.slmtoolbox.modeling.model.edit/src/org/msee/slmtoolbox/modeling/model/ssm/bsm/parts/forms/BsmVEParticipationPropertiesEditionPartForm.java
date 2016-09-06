/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmVEParticipationPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmVEParticipationPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, BsmVEParticipationPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer enterprise;
	protected EObjectFlatComboViewer virtualEnterprise;



	/**
	 * For {@link ISection} use only.
	 */
	public BsmVEParticipationPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmVEParticipationPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence bsmVEParticipationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = bsmVEParticipationStep.addStep(BsmViewsRepository.BsmVEParticipation.Properties.class);
		propertiesStep.addStep(BsmViewsRepository.BsmVEParticipation.Properties.name);
		propertiesStep.addStep(BsmViewsRepository.BsmVEParticipation.Properties.enterprise);
		propertiesStep.addStep(BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise);
		
		
		composer = new PartComposer(bsmVEParticipationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == BsmViewsRepository.BsmVEParticipation.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmVEParticipation.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmVEParticipation.Properties.enterprise) {
					return createEnterpriseFlatComboViewer(parent, widgetFactory);
				}
				if (key == BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise) {
					return createVirtualEnterpriseFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(BsmMessages.BsmVEParticipationPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, BsmViewsRepository.BsmVEParticipation.Properties.name, BsmMessages.BsmVEParticipationPropertiesEditionPart_NameLabel);
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
							BsmVEParticipationPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmVEParticipation.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmVEParticipationPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmVEParticipation.Properties.name,
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
									BsmVEParticipationPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmVEParticipationPropertiesEditionPartForm.this, BsmViewsRepository.BsmVEParticipation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, BsmViewsRepository.BsmVEParticipation.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmVEParticipation.Properties.name, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createEnterpriseFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, BsmViewsRepository.BsmVEParticipation.Properties.enterprise, BsmMessages.BsmVEParticipationPropertiesEditionPart_EnterpriseLabel);
		enterprise = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmVEParticipation.Properties.enterprise, BsmViewsRepository.FORM_KIND));
		widgetFactory.adapt(enterprise);
		enterprise.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData enterpriseData = new GridData(GridData.FILL_HORIZONTAL);
		enterprise.setLayoutData(enterpriseData);
		enterprise.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmVEParticipationPropertiesEditionPartForm.this, BsmViewsRepository.BsmVEParticipation.Properties.enterprise, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getEnterprise()));
			}

		});
		enterprise.setID(BsmViewsRepository.BsmVEParticipation.Properties.enterprise);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmVEParticipation.Properties.enterprise, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createVirtualEnterpriseFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise, BsmMessages.BsmVEParticipationPropertiesEditionPart_VirtualEnterpriseLabel);
		virtualEnterprise = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise, BsmViewsRepository.FORM_KIND));
		widgetFactory.adapt(virtualEnterprise);
		virtualEnterprise.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData virtualEnterpriseData = new GridData(GridData.FILL_HORIZONTAL);
		virtualEnterprise.setLayoutData(virtualEnterpriseData);
		virtualEnterprise.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmVEParticipationPropertiesEditionPartForm.this, BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVirtualEnterprise()));
			}

		});
		virtualEnterprise.setID(BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmVEParticipationPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmVEParticipationPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmVEParticipationPropertiesEditionPart#getEnterprise()
	 * 
	 */
	public EObject getEnterprise() {
		if (enterprise.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) enterprise.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmVEParticipationPropertiesEditionPart#initEnterprise(EObjectFlatComboSettings)
	 */
	public void initEnterprise(EObjectFlatComboSettings settings) {
		enterprise.setInput(settings);
		if (current != null) {
			enterprise.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmVEParticipationPropertiesEditionPart#setEnterprise(EObject newValue)
	 * 
	 */
	public void setEnterprise(EObject newValue) {
		if (newValue != null) {
			enterprise.setSelection(new StructuredSelection(newValue));
		} else {
			enterprise.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmVEParticipationPropertiesEditionPart#setEnterpriseButtonMode(ButtonsModeEnum newValue)
	 */
	public void setEnterpriseButtonMode(ButtonsModeEnum newValue) {
		enterprise.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmVEParticipationPropertiesEditionPart#addFilterEnterprise(ViewerFilter filter)
	 * 
	 */
	public void addFilterToEnterprise(ViewerFilter filter) {
		enterprise.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmVEParticipationPropertiesEditionPart#addBusinessFilterEnterprise(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToEnterprise(ViewerFilter filter) {
		enterprise.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmVEParticipationPropertiesEditionPart#getVirtualEnterprise()
	 * 
	 */
	public EObject getVirtualEnterprise() {
		if (virtualEnterprise.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) virtualEnterprise.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmVEParticipationPropertiesEditionPart#initVirtualEnterprise(EObjectFlatComboSettings)
	 */
	public void initVirtualEnterprise(EObjectFlatComboSettings settings) {
		virtualEnterprise.setInput(settings);
		if (current != null) {
			virtualEnterprise.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmVEParticipationPropertiesEditionPart#setVirtualEnterprise(EObject newValue)
	 * 
	 */
	public void setVirtualEnterprise(EObject newValue) {
		if (newValue != null) {
			virtualEnterprise.setSelection(new StructuredSelection(newValue));
		} else {
			virtualEnterprise.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmVEParticipationPropertiesEditionPart#setVirtualEnterpriseButtonMode(ButtonsModeEnum newValue)
	 */
	public void setVirtualEnterpriseButtonMode(ButtonsModeEnum newValue) {
		virtualEnterprise.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmVEParticipationPropertiesEditionPart#addFilterVirtualEnterprise(ViewerFilter filter)
	 * 
	 */
	public void addFilterToVirtualEnterprise(ViewerFilter filter) {
		virtualEnterprise.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmVEParticipationPropertiesEditionPart#addBusinessFilterVirtualEnterprise(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToVirtualEnterprise(ViewerFilter filter) {
		virtualEnterprise.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return BsmMessages.BsmVEParticipation_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
