/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.impl;

// Start of user code for imports
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
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
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
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgCollaborativeDecisionPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.providers.CoreElementsMessages;

// End of user code

/**
 * 
 * 
 */
public class GgCollaborativeDecisionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, GgCollaborativeDecisionPropertiesEditionPart {

	protected Text name;
	protected Text code;
	protected Text description;
	protected Text source;
	protected Text target;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public GgCollaborativeDecisionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(parent);
				}
				if (key == CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name) {
					return createNameText(parent);
				}
				if (key == CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code) {
					return createCodeText(parent);
				}
				if (key == CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == CoreElementsViewsRepository.GgCollaborativeDecision.Properties.source) {
					return createSourceText(parent);
				}
				if (key == CoreElementsViewsRepository.GgCollaborativeDecision.Properties.target) {
					return createTargetText(parent);
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
		propertiesGroup.setText(CoreElementsMessages.GgCollaborativeDecisionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name, CoreElementsMessages.GgCollaborativeDecisionPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgCollaborativeDecisionPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgCollaborativeDecisionPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.name, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCodeText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code, CoreElementsMessages.GgCollaborativeDecisionPropertiesEditionPart_CodeLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgCollaborativeDecisionPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgCollaborativeDecisionPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
				}
			}

		});
		EditingUtils.setID(code, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code);
		EditingUtils.setEEFtype(code, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.code, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description, CoreElementsMessages.GgCollaborativeDecisionPropertiesEditionPart_DescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgCollaborativeDecisionPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgCollaborativeDecisionPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.description, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createSourceText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.source, CoreElementsMessages.GgCollaborativeDecisionPropertiesEditionPart_SourceLabel);
		source = SWTUtils.createScrollableText(parent, SWT.BORDER);
		source.setEnabled(false);
		source.setToolTipText(CoreElementsMessages.GgCollaborativeDecision_ReadOnly);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgCollaborativeDecisionPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgCollaborativeDecisionPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.source, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, source.getText()));
				}
			}

		});
		EditingUtils.setID(source, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.source);
		EditingUtils.setEEFtype(source, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.source, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTargetText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.target, CoreElementsMessages.GgCollaborativeDecisionPropertiesEditionPart_TargetLabel);
		target = SWTUtils.createScrollableText(parent, SWT.BORDER);
		target.setEnabled(false);
		target.setToolTipText(CoreElementsMessages.GgCollaborativeDecision_ReadOnly);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgCollaborativeDecisionPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, target.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgCollaborativeDecisionPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.target, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, target.getText()));
				}
			}

		});
		EditingUtils.setID(target, CoreElementsViewsRepository.GgCollaborativeDecision.Properties.target);
		EditingUtils.setEEFtype(target, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgCollaborativeDecision.Properties.target, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
