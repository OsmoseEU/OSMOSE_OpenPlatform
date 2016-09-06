/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.providers.CoreElementsMessages;

// End of user code

/**
 * 
 * 
 */
public class EaSupportFlowPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EaSupportFlowPropertiesEditionPart {

	protected Text name;
	protected Text code;
	protected Text description;
	protected Button isTrigger;
	protected Text triggerInfo;
	protected Text source;
	protected Text target;
	protected EMFComboViewer resourceRole;
	protected Text responsibility;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EaSupportFlowPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence eaSupportFlowStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = eaSupportFlowStep.addStep(CoreElementsViewsRepository.EaSupportFlow.Properties.class);
		propertiesStep.addStep(CoreElementsViewsRepository.EaSupportFlow.Properties.name);
		propertiesStep.addStep(CoreElementsViewsRepository.EaSupportFlow.Properties.code);
		propertiesStep.addStep(CoreElementsViewsRepository.EaSupportFlow.Properties.description);
		propertiesStep.addStep(CoreElementsViewsRepository.EaSupportFlow.Properties.isTrigger);
		propertiesStep.addStep(CoreElementsViewsRepository.EaSupportFlow.Properties.triggerInfo);
		propertiesStep.addStep(CoreElementsViewsRepository.EaSupportFlow.Properties.source);
		propertiesStep.addStep(CoreElementsViewsRepository.EaSupportFlow.Properties.target);
		propertiesStep.addStep(CoreElementsViewsRepository.EaSupportFlow.Properties.resourceRole);
		propertiesStep.addStep(CoreElementsViewsRepository.EaSupportFlow.Properties.responsibility);
		
		
		composer = new PartComposer(eaSupportFlowStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CoreElementsViewsRepository.EaSupportFlow.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CoreElementsViewsRepository.EaSupportFlow.Properties.name) {
					return createNameText(parent);
				}
				if (key == CoreElementsViewsRepository.EaSupportFlow.Properties.code) {
					return createCodeText(parent);
				}
				if (key == CoreElementsViewsRepository.EaSupportFlow.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == CoreElementsViewsRepository.EaSupportFlow.Properties.isTrigger) {
					return createIsTriggerCheckbox(parent);
				}
				if (key == CoreElementsViewsRepository.EaSupportFlow.Properties.triggerInfo) {
					return createTriggerInfoText(parent);
				}
				if (key == CoreElementsViewsRepository.EaSupportFlow.Properties.source) {
					return createSourceText(parent);
				}
				if (key == CoreElementsViewsRepository.EaSupportFlow.Properties.target) {
					return createTargetText(parent);
				}
				if (key == CoreElementsViewsRepository.EaSupportFlow.Properties.resourceRole) {
					return createResourceRoleEMFComboViewer(parent);
				}
				if (key == CoreElementsViewsRepository.EaSupportFlow.Properties.responsibility) {
					return createResponsibilityText(parent);
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
		propertiesGroup.setText(CoreElementsMessages.EaSupportFlowPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaSupportFlow.Properties.name, CoreElementsMessages.EaSupportFlowPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaSupportFlowPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaSupportFlow.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaSupportFlowPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaSupportFlow.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, CoreElementsViewsRepository.EaSupportFlow.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaSupportFlow.Properties.name, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCodeText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaSupportFlow.Properties.code, CoreElementsMessages.EaSupportFlowPropertiesEditionPart_CodeLabel);
		code = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData codeData = new GridData(GridData.FILL_HORIZONTAL);
		code.setLayoutData(codeData);
		code.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaSupportFlowPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaSupportFlow.Properties.code, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
			}

		});
		code.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaSupportFlowPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaSupportFlow.Properties.code, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
				}
			}

		});
		EditingUtils.setID(code, CoreElementsViewsRepository.EaSupportFlow.Properties.code);
		EditingUtils.setEEFtype(code, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaSupportFlow.Properties.code, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaSupportFlow.Properties.description, CoreElementsMessages.EaSupportFlowPropertiesEditionPart_DescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaSupportFlowPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaSupportFlow.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaSupportFlowPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaSupportFlow.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, CoreElementsViewsRepository.EaSupportFlow.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaSupportFlow.Properties.description, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsTriggerCheckbox(Composite parent) {
		isTrigger = new Button(parent, SWT.CHECK);
		isTrigger.setText(getDescription(CoreElementsViewsRepository.EaSupportFlow.Properties.isTrigger, CoreElementsMessages.EaSupportFlowPropertiesEditionPart_IsTriggerLabel));
		isTrigger.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaSupportFlowPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaSupportFlow.Properties.isTrigger, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isTrigger.getSelection())));
			}

		});
		GridData isTriggerData = new GridData(GridData.FILL_HORIZONTAL);
		isTriggerData.horizontalSpan = 2;
		isTrigger.setLayoutData(isTriggerData);
		EditingUtils.setID(isTrigger, CoreElementsViewsRepository.EaSupportFlow.Properties.isTrigger);
		EditingUtils.setEEFtype(isTrigger, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaSupportFlow.Properties.isTrigger, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTriggerInfoText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaSupportFlow.Properties.triggerInfo, CoreElementsMessages.EaSupportFlowPropertiesEditionPart_TriggerInfoLabel);
		triggerInfo = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData triggerInfoData = new GridData(GridData.FILL_HORIZONTAL);
		triggerInfo.setLayoutData(triggerInfoData);
		triggerInfo.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaSupportFlowPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaSupportFlow.Properties.triggerInfo, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, triggerInfo.getText()));
			}

		});
		triggerInfo.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaSupportFlowPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaSupportFlow.Properties.triggerInfo, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, triggerInfo.getText()));
				}
			}

		});
		EditingUtils.setID(triggerInfo, CoreElementsViewsRepository.EaSupportFlow.Properties.triggerInfo);
		EditingUtils.setEEFtype(triggerInfo, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaSupportFlow.Properties.triggerInfo, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSourceText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaSupportFlow.Properties.source, CoreElementsMessages.EaSupportFlowPropertiesEditionPart_SourceLabel);
		source = SWTUtils.createScrollableText(parent, SWT.BORDER);
		source.setEnabled(false);
		source.setToolTipText(CoreElementsMessages.EaSupportFlow_ReadOnly);
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		source.setLayoutData(sourceData);
		source.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaSupportFlowPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaSupportFlow.Properties.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
			}

		});
		source.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaSupportFlowPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaSupportFlow.Properties.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
				}
			}

		});
		EditingUtils.setID(source, CoreElementsViewsRepository.EaSupportFlow.Properties.source);
		EditingUtils.setEEFtype(source, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaSupportFlow.Properties.source, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTargetText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaSupportFlow.Properties.target, CoreElementsMessages.EaSupportFlowPropertiesEditionPart_TargetLabel);
		target = SWTUtils.createScrollableText(parent, SWT.BORDER);
		target.setEnabled(false);
		target.setToolTipText(CoreElementsMessages.EaSupportFlow_ReadOnly);
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		target.setLayoutData(targetData);
		target.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaSupportFlowPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaSupportFlow.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, target.getText()));
			}

		});
		target.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaSupportFlowPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaSupportFlow.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, target.getText()));
				}
			}

		});
		EditingUtils.setID(target, CoreElementsViewsRepository.EaSupportFlow.Properties.target);
		EditingUtils.setEEFtype(target, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaSupportFlow.Properties.target, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createResourceRoleEMFComboViewer(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaSupportFlow.Properties.resourceRole, CoreElementsMessages.EaSupportFlowPropertiesEditionPart_ResourceRoleLabel);
		resourceRole = new EMFComboViewer(parent);
		resourceRole.setContentProvider(new ArrayContentProvider());
		resourceRole.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData resourceRoleData = new GridData(GridData.FILL_HORIZONTAL);
		resourceRole.getCombo().setLayoutData(resourceRoleData);
		resourceRole.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaSupportFlowPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaSupportFlow.Properties.resourceRole, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getResourceRole()));
			}

		});
		resourceRole.setID(CoreElementsViewsRepository.EaSupportFlow.Properties.resourceRole);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaSupportFlow.Properties.resourceRole, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createResponsibilityText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaSupportFlow.Properties.responsibility, CoreElementsMessages.EaSupportFlowPropertiesEditionPart_ResponsibilityLabel);
		responsibility = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData responsibilityData = new GridData(GridData.FILL_HORIZONTAL);
		responsibility.setLayoutData(responsibilityData);
		responsibility.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaSupportFlowPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaSupportFlow.Properties.responsibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, responsibility.getText()));
			}

		});
		responsibility.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaSupportFlowPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaSupportFlow.Properties.responsibility, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, responsibility.getText()));
				}
			}

		});
		EditingUtils.setID(responsibility, CoreElementsViewsRepository.EaSupportFlow.Properties.responsibility);
		EditingUtils.setEEFtype(responsibility, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaSupportFlow.Properties.responsibility, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#getCode()
	 * 
	 */
	public String getCode() {
		return code.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#setCode(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#getIsTrigger()
	 * 
	 */
	public Boolean getIsTrigger() {
		return Boolean.valueOf(isTrigger.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#setIsTrigger(Boolean newValue)
	 * 
	 */
	public void setIsTrigger(Boolean newValue) {
		if (newValue != null) {
			isTrigger.setSelection(newValue.booleanValue());
		} else {
			isTrigger.setSelection(false);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#getTriggerInfo()
	 * 
	 */
	public String getTriggerInfo() {
		return triggerInfo.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#setTriggerInfo(String newValue)
	 * 
	 */
	public void setTriggerInfo(String newValue) {
		if (newValue != null) {
			triggerInfo.setText(newValue);
		} else {
			triggerInfo.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#getSource()
	 * 
	 */
	public String getSource() {
		return source.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#setSource(String newValue)
	 * 
	 */
	public void setSource(String newValue) {
		if (newValue != null) {
			source.setText(newValue);
		} else {
			source.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#getTarget()
	 * 
	 */
	public String getTarget() {
		return target.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#setTarget(String newValue)
	 * 
	 */
	public void setTarget(String newValue) {
		if (newValue != null) {
			target.setText(newValue);
		} else {
			target.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#getResourceRole()
	 * 
	 */
	public Enumerator getResourceRole() {
		Enumerator selection = (Enumerator) ((StructuredSelection) resourceRole.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#initResourceRole(Object input, Enumerator current)
	 */
	public void initResourceRole(Object input, Enumerator current) {
		resourceRole.setInput(input);
		resourceRole.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#setResourceRole(Enumerator newValue)
	 * 
	 */
	public void setResourceRole(Enumerator newValue) {
		resourceRole.modelUpdating(new StructuredSelection(newValue));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#getResponsibility()
	 * 
	 */
	public String getResponsibility() {
		return responsibility.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaSupportFlowPropertiesEditionPart#setResponsibility(String newValue)
	 * 
	 */
	public void setResponsibility(String newValue) {
		if (newValue != null) {
			responsibility.setText(newValue);
		} else {
			responsibility.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CoreElementsMessages.EaSupportFlow_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
