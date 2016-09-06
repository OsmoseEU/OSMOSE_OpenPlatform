/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.forms;

// Start of user code for imports
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
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaOutputInputFlowPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.providers.CoreElementsMessages;

// End of user code

/**
 * 
 * 
 */
public class EaOutputInputFlowPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, EaOutputInputFlowPropertiesEditionPart {

	protected Text name;
	protected Text code;
	protected Text description;
	protected Button isTrigger;
	protected Text triggerInfo;
	protected Text source;
	protected Text target;



	/**
	 * For {@link ISection} use only.
	 */
	public EaOutputInputFlowPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EaOutputInputFlowPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence eaOutputInputFlowStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = eaOutputInputFlowStep.addStep(CoreElementsViewsRepository.EaOutputInputFlow.Properties.class);
		propertiesStep.addStep(CoreElementsViewsRepository.EaOutputInputFlow.Properties.name);
		propertiesStep.addStep(CoreElementsViewsRepository.EaOutputInputFlow.Properties.code);
		propertiesStep.addStep(CoreElementsViewsRepository.EaOutputInputFlow.Properties.description);
		propertiesStep.addStep(CoreElementsViewsRepository.EaOutputInputFlow.Properties.isTrigger);
		propertiesStep.addStep(CoreElementsViewsRepository.EaOutputInputFlow.Properties.triggerInfo);
		propertiesStep.addStep(CoreElementsViewsRepository.EaOutputInputFlow.Properties.source);
		propertiesStep.addStep(CoreElementsViewsRepository.EaOutputInputFlow.Properties.target);
		
		
		composer = new PartComposer(eaOutputInputFlowStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CoreElementsViewsRepository.EaOutputInputFlow.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaOutputInputFlow.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaOutputInputFlow.Properties.code) {
					return createCodeText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaOutputInputFlow.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaOutputInputFlow.Properties.isTrigger) {
					return createIsTriggerCheckbox(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaOutputInputFlow.Properties.triggerInfo) {
					return createTriggerInfoText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaOutputInputFlow.Properties.source) {
					return createSourceText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.EaOutputInputFlow.Properties.target) {
					return createTargetText(widgetFactory, parent);
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
		propertiesSection.setText(CoreElementsMessages.EaOutputInputFlowPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, CoreElementsViewsRepository.EaOutputInputFlow.Properties.name, CoreElementsMessages.EaOutputInputFlowPropertiesEditionPart_NameLabel);
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
							EaOutputInputFlowPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaOutputInputFlow.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaOutputInputFlowPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaOutputInputFlow.Properties.name,
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
									EaOutputInputFlowPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaOutputInputFlowPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaOutputInputFlow.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, CoreElementsViewsRepository.EaOutputInputFlow.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaOutputInputFlow.Properties.name, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCodeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaOutputInputFlow.Properties.code, CoreElementsMessages.EaOutputInputFlowPropertiesEditionPart_CodeLabel);
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
							EaOutputInputFlowPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaOutputInputFlow.Properties.code,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaOutputInputFlowPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaOutputInputFlow.Properties.code,
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
									EaOutputInputFlowPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaOutputInputFlowPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaOutputInputFlow.Properties.code, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
				}
			}
		});
		EditingUtils.setID(code, CoreElementsViewsRepository.EaOutputInputFlow.Properties.code);
		EditingUtils.setEEFtype(code, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaOutputInputFlow.Properties.code, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaOutputInputFlow.Properties.description, CoreElementsMessages.EaOutputInputFlowPropertiesEditionPart_DescriptionLabel);
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
							EaOutputInputFlowPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaOutputInputFlow.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaOutputInputFlowPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaOutputInputFlow.Properties.description,
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
									EaOutputInputFlowPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaOutputInputFlowPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaOutputInputFlow.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, CoreElementsViewsRepository.EaOutputInputFlow.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaOutputInputFlow.Properties.description, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsTriggerCheckbox(FormToolkit widgetFactory, Composite parent) {
		isTrigger = widgetFactory.createButton(parent, getDescription(CoreElementsViewsRepository.EaOutputInputFlow.Properties.isTrigger, CoreElementsMessages.EaOutputInputFlowPropertiesEditionPart_IsTriggerLabel), SWT.CHECK);
		isTrigger.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaOutputInputFlowPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaOutputInputFlow.Properties.isTrigger, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isTrigger.getSelection())));
			}

		});
		GridData isTriggerData = new GridData(GridData.FILL_HORIZONTAL);
		isTriggerData.horizontalSpan = 2;
		isTrigger.setLayoutData(isTriggerData);
		EditingUtils.setID(isTrigger, CoreElementsViewsRepository.EaOutputInputFlow.Properties.isTrigger);
		EditingUtils.setEEFtype(isTrigger, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaOutputInputFlow.Properties.isTrigger, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTriggerInfoText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaOutputInputFlow.Properties.triggerInfo, CoreElementsMessages.EaOutputInputFlowPropertiesEditionPart_TriggerInfoLabel);
		triggerInfo = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		triggerInfo.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData triggerInfoData = new GridData(GridData.FILL_HORIZONTAL);
		triggerInfo.setLayoutData(triggerInfoData);
		triggerInfo.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaOutputInputFlowPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaOutputInputFlow.Properties.triggerInfo,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, triggerInfo.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaOutputInputFlowPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaOutputInputFlow.Properties.triggerInfo,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, triggerInfo.getText()));
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
									EaOutputInputFlowPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		triggerInfo.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaOutputInputFlowPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaOutputInputFlow.Properties.triggerInfo, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, triggerInfo.getText()));
				}
			}
		});
		EditingUtils.setID(triggerInfo, CoreElementsViewsRepository.EaOutputInputFlow.Properties.triggerInfo);
		EditingUtils.setEEFtype(triggerInfo, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaOutputInputFlow.Properties.triggerInfo, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSourceText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaOutputInputFlow.Properties.source, CoreElementsMessages.EaOutputInputFlowPropertiesEditionPart_SourceLabel);
		source = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		source.setEnabled(false);
		source.setToolTipText(CoreElementsMessages.EaOutputInputFlow_ReadOnly);
		source.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData sourceData = new GridData(GridData.FILL_HORIZONTAL);
		source.setLayoutData(sourceData);
		source.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaOutputInputFlowPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaOutputInputFlow.Properties.source,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaOutputInputFlowPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaOutputInputFlow.Properties.source,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, source.getText()));
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
									EaOutputInputFlowPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		source.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaOutputInputFlowPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaOutputInputFlow.Properties.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
				}
			}
		});
		EditingUtils.setID(source, CoreElementsViewsRepository.EaOutputInputFlow.Properties.source);
		EditingUtils.setEEFtype(source, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaOutputInputFlow.Properties.source, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTargetText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaOutputInputFlow.Properties.target, CoreElementsMessages.EaOutputInputFlowPropertiesEditionPart_TargetLabel);
		target = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		target.setEnabled(false);
		target.setToolTipText(CoreElementsMessages.EaOutputInputFlow_ReadOnly);
		target.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData targetData = new GridData(GridData.FILL_HORIZONTAL);
		target.setLayoutData(targetData);
		target.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							EaOutputInputFlowPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.EaOutputInputFlow.Properties.target,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, target.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									EaOutputInputFlowPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.EaOutputInputFlow.Properties.target,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, target.getText()));
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
									EaOutputInputFlowPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		target.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaOutputInputFlowPropertiesEditionPartForm.this, CoreElementsViewsRepository.EaOutputInputFlow.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, target.getText()));
				}
			}
		});
		EditingUtils.setID(target, CoreElementsViewsRepository.EaOutputInputFlow.Properties.target);
		EditingUtils.setEEFtype(target, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaOutputInputFlow.Properties.target, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaOutputInputFlowPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaOutputInputFlowPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaOutputInputFlowPropertiesEditionPart#getCode()
	 * 
	 */
	public String getCode() {
		return code.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaOutputInputFlowPropertiesEditionPart#setCode(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaOutputInputFlowPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaOutputInputFlowPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaOutputInputFlowPropertiesEditionPart#getIsTrigger()
	 * 
	 */
	public Boolean getIsTrigger() {
		return Boolean.valueOf(isTrigger.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaOutputInputFlowPropertiesEditionPart#setIsTrigger(Boolean newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaOutputInputFlowPropertiesEditionPart#getTriggerInfo()
	 * 
	 */
	public String getTriggerInfo() {
		return triggerInfo.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaOutputInputFlowPropertiesEditionPart#setTriggerInfo(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaOutputInputFlowPropertiesEditionPart#getSource()
	 * 
	 */
	public String getSource() {
		return source.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaOutputInputFlowPropertiesEditionPart#setSource(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaOutputInputFlowPropertiesEditionPart#getTarget()
	 * 
	 */
	public String getTarget() {
		return target.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaOutputInputFlowPropertiesEditionPart#setTarget(String newValue)
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
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CoreElementsMessages.EaOutputInputFlow_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
