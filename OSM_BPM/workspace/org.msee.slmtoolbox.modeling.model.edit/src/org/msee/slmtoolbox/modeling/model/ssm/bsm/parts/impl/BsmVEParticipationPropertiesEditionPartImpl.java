/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmVEParticipationPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmVEParticipationPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, BsmVEParticipationPropertiesEditionPart {

	protected Text name;
	protected EObjectFlatComboViewer enterprise;
	protected EObjectFlatComboViewer virtualEnterprise;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmVEParticipationPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence bsmVEParticipationStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = bsmVEParticipationStep.addStep(BsmViewsRepository.BsmVEParticipation.Properties.class);
		propertiesStep.addStep(BsmViewsRepository.BsmVEParticipation.Properties.name);
		propertiesStep.addStep(BsmViewsRepository.BsmVEParticipation.Properties.enterprise);
		propertiesStep.addStep(BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise);
		
		
		composer = new PartComposer(bsmVEParticipationStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == BsmViewsRepository.BsmVEParticipation.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == BsmViewsRepository.BsmVEParticipation.Properties.name) {
					return createNameText(parent);
				}
				if (key == BsmViewsRepository.BsmVEParticipation.Properties.enterprise) {
					return createEnterpriseFlatComboViewer(parent);
				}
				if (key == BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise) {
					return createVirtualEnterpriseFlatComboViewer(parent);
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
		propertiesGroup.setText(BsmMessages.BsmVEParticipationPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmVEParticipation.Properties.name, BsmMessages.BsmVEParticipationPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmVEParticipationPropertiesEditionPartImpl.this, BsmViewsRepository.BsmVEParticipation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmVEParticipationPropertiesEditionPartImpl.this, BsmViewsRepository.BsmVEParticipation.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, BsmViewsRepository.BsmVEParticipation.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmVEParticipation.Properties.name, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createEnterpriseFlatComboViewer(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmVEParticipation.Properties.enterprise, BsmMessages.BsmVEParticipationPropertiesEditionPart_EnterpriseLabel);
		enterprise = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmVEParticipation.Properties.enterprise, BsmViewsRepository.SWT_KIND));
		enterprise.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		enterprise.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmVEParticipationPropertiesEditionPartImpl.this, BsmViewsRepository.BsmVEParticipation.Properties.enterprise, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getEnterprise()));
			}

		});
		GridData enterpriseData = new GridData(GridData.FILL_HORIZONTAL);
		enterprise.setLayoutData(enterpriseData);
		enterprise.setID(BsmViewsRepository.BsmVEParticipation.Properties.enterprise);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmVEParticipation.Properties.enterprise, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createVirtualEnterpriseFlatComboViewer(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise, BsmMessages.BsmVEParticipationPropertiesEditionPart_VirtualEnterpriseLabel);
		virtualEnterprise = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise, BsmViewsRepository.SWT_KIND));
		virtualEnterprise.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		virtualEnterprise.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmVEParticipationPropertiesEditionPartImpl.this, BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getVirtualEnterprise()));
			}

		});
		GridData virtualEnterpriseData = new GridData(GridData.FILL_HORIZONTAL);
		virtualEnterprise.setLayoutData(virtualEnterpriseData);
		virtualEnterprise.setID(BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmVEParticipation.Properties.virtualEnterprise, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
