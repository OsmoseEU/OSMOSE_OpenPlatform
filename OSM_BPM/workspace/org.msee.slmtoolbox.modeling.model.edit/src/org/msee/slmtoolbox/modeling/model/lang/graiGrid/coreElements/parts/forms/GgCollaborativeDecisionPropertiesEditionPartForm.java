/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.forms;

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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgCollaborativeDecisionPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.providers.CoreElementsMessages;

// End of user code

/**
 * 
 * 
 */
public class GgCollaborativeDecisionPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, GgCollaborativeDecisionPropertiesEditionPart {

	protected Text name;
	protected Text code;
	protected Text description;
	protected Text source;
	protected Text target;



	/**
	 * For {@link ISection} use only.
	 */
	public GgCollaborativeDecisionPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public GgCollaborativeDecisionPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence ggCollaborativeDecisionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = ggCollaborativeDecisionStep.addStep(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.class);
		propertiesStep.addStep(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name);
		propertiesStep.addStep(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code);
		propertiesStep.addStep(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description);
		propertiesStep.addStep(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.source);
		propertiesStep.addStep(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.target);
		
		
		composer = new PartComposer(ggCollaborativeDecisionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CoreElementsViewsRepository.GgCollaborativeDecision.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code) {
					return createCodeText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.GgCollaborativeDecision.Properties.source) {
					return createSourceText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.GgCollaborativeDecision.Properties.target) {
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
		propertiesSection.setText(CoreElementsMessages.GgCollaborativeDecisionPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name, CoreElementsMessages.GgCollaborativeDecisionPropertiesEditionPart_NameLabel);
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
							GgCollaborativeDecisionPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GgCollaborativeDecisionPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name,
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
									GgCollaborativeDecisionPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgCollaborativeDecisionPropertiesEditionPartForm.this, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCodeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code, CoreElementsMessages.GgCollaborativeDecisionPropertiesEditionPart_CodeLabel);
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
							GgCollaborativeDecisionPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GgCollaborativeDecisionPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code,
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
									GgCollaborativeDecisionPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgCollaborativeDecisionPropertiesEditionPartForm.this, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
				}
			}
		});
		EditingUtils.setID(code, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code);
		EditingUtils.setEEFtype(code, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description, CoreElementsMessages.GgCollaborativeDecisionPropertiesEditionPart_DescriptionLabel);
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
							GgCollaborativeDecisionPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GgCollaborativeDecisionPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description,
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
									GgCollaborativeDecisionPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgCollaborativeDecisionPropertiesEditionPartForm.this, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSourceText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.source, CoreElementsMessages.GgCollaborativeDecisionPropertiesEditionPart_SourceLabel);
		source = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		source.setEnabled(false);
		source.setToolTipText(CoreElementsMessages.GgCollaborativeDecision_ReadOnly);
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
							GgCollaborativeDecisionPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.GgCollaborativeDecision.Properties.source,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GgCollaborativeDecisionPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.GgCollaborativeDecision.Properties.source,
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
									GgCollaborativeDecisionPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgCollaborativeDecisionPropertiesEditionPartForm.this, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
				}
			}
		});
		EditingUtils.setID(source, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.source);
		EditingUtils.setEEFtype(source, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.source, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTargetText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.target, CoreElementsMessages.GgCollaborativeDecisionPropertiesEditionPart_TargetLabel);
		target = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		target.setEnabled(false);
		target.setToolTipText(CoreElementsMessages.GgCollaborativeDecision_ReadOnly);
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
							GgCollaborativeDecisionPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.GgCollaborativeDecision.Properties.target,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, target.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GgCollaborativeDecisionPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.GgCollaborativeDecision.Properties.target,
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
									GgCollaborativeDecisionPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgCollaborativeDecisionPropertiesEditionPartForm.this, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, target.getText()));
				}
			}
		});
		EditingUtils.setID(target, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.target);
		EditingUtils.setEEFtype(target, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.target, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgCollaborativeDecisionPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgCollaborativeDecisionPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgCollaborativeDecisionPropertiesEditionPart#getCode()
	 * 
	 */
	public String getCode() {
		return code.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgCollaborativeDecisionPropertiesEditionPart#setCode(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgCollaborativeDecisionPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgCollaborativeDecisionPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgCollaborativeDecisionPropertiesEditionPart#getSource()
	 * 
	 */
	public String getSource() {
		return source.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgCollaborativeDecisionPropertiesEditionPart#setSource(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgCollaborativeDecisionPropertiesEditionPart#getTarget()
	 * 
	 */
	public String getTarget() {
		return target.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgCollaborativeDecisionPropertiesEditionPart#setTarget(String newValue)
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
		return CoreElementsMessages.GgCollaborativeDecision_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
