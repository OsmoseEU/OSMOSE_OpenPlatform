/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.forms;

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

import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.ITRelatedPartViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart;

import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.providers.ITRelatedPartMessages;

// End of user code

/**
 * 
 * 
 */
public class TimInformationRelationshipPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TimInformationRelationshipPropertiesEditionPart {

	protected Text name;
	protected Text type;
	protected EObjectFlatComboViewer sourceEntity;
	protected EObjectFlatComboViewer targetEntity;
	protected EObjectFlatComboViewer information;



	/**
	 * For {@link ISection} use only.
	 */
	public TimInformationRelationshipPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TimInformationRelationshipPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence timInformationRelationshipStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = timInformationRelationshipStep.addStep(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.class);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.name);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.type);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.sourceEntity);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.targetEntity);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.information);
		
		
		composer = new PartComposer(timInformationRelationshipStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ITRelatedPartViewsRepository.TimInformationRelationship.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ITRelatedPartViewsRepository.TimInformationRelationship.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == ITRelatedPartViewsRepository.TimInformationRelationship.Properties.type) {
					return createTypeText(widgetFactory, parent);
				}
				if (key == ITRelatedPartViewsRepository.TimInformationRelationship.Properties.sourceEntity) {
					return createSourceEntityFlatComboViewer(parent, widgetFactory);
				}
				if (key == ITRelatedPartViewsRepository.TimInformationRelationship.Properties.targetEntity) {
					return createTargetEntityFlatComboViewer(parent, widgetFactory);
				}
				if (key == ITRelatedPartViewsRepository.TimInformationRelationship.Properties.information) {
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
		propertiesSection.setText(ITRelatedPartMessages.TimInformationRelationshipPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, ITRelatedPartViewsRepository.TimInformationRelationship.Properties.name, ITRelatedPartMessages.TimInformationRelationshipPropertiesEditionPart_NameLabel);
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
							TimInformationRelationshipPropertiesEditionPartForm.this,
							ITRelatedPartViewsRepository.TimInformationRelationship.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimInformationRelationshipPropertiesEditionPartForm.this,
									ITRelatedPartViewsRepository.TimInformationRelationship.Properties.name,
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
									TimInformationRelationshipPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationRelationshipPropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationRelationship.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ITRelatedPartViewsRepository.TimInformationRelationship.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.name, ITRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ITRelatedPartViewsRepository.TimInformationRelationship.Properties.type, ITRelatedPartMessages.TimInformationRelationshipPropertiesEditionPart_TypeLabel);
		type = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		type.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.setLayoutData(typeData);
		type.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TimInformationRelationshipPropertiesEditionPartForm.this,
							ITRelatedPartViewsRepository.TimInformationRelationship.Properties.type,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimInformationRelationshipPropertiesEditionPartForm.this,
									ITRelatedPartViewsRepository.TimInformationRelationship.Properties.type,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, type.getText()));
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
									TimInformationRelationshipPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		type.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationRelationshipPropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationRelationship.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
				}
			}
		});
		EditingUtils.setID(type, ITRelatedPartViewsRepository.TimInformationRelationship.Properties.type);
		EditingUtils.setEEFtype(type, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.type, ITRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createSourceEntityFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, ITRelatedPartViewsRepository.TimInformationRelationship.Properties.sourceEntity, ITRelatedPartMessages.TimInformationRelationshipPropertiesEditionPart_SourceEntityLabel);
		sourceEntity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.sourceEntity, ITRelatedPartViewsRepository.FORM_KIND));
		widgetFactory.adapt(sourceEntity);
		sourceEntity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData sourceEntityData = new GridData(GridData.FILL_HORIZONTAL);
		sourceEntity.setLayoutData(sourceEntityData);
		sourceEntity.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationRelationshipPropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationRelationship.Properties.sourceEntity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSourceEntity()));
			}

		});
		sourceEntity.setID(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.sourceEntity);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.sourceEntity, ITRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createTargetEntityFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, ITRelatedPartViewsRepository.TimInformationRelationship.Properties.targetEntity, ITRelatedPartMessages.TimInformationRelationshipPropertiesEditionPart_TargetEntityLabel);
		targetEntity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.targetEntity, ITRelatedPartViewsRepository.FORM_KIND));
		widgetFactory.adapt(targetEntity);
		targetEntity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData targetEntityData = new GridData(GridData.FILL_HORIZONTAL);
		targetEntity.setLayoutData(targetEntityData);
		targetEntity.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationRelationshipPropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationRelationship.Properties.targetEntity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getTargetEntity()));
			}

		});
		targetEntity.setID(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.targetEntity);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.targetEntity, ITRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createInformationFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, ITRelatedPartViewsRepository.TimInformationRelationship.Properties.information, ITRelatedPartMessages.TimInformationRelationshipPropertiesEditionPart_InformationLabel);
		information = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.information, ITRelatedPartViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationRelationshipPropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationRelationship.Properties.information, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getInformation()));
			}

		});
		information.setID(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.information);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimInformationRelationship.Properties.information, ITRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#getType()
	 * 
	 */
	public String getType() {
		return type.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#setType(String newValue)
	 * 
	 */
	public void setType(String newValue) {
		if (newValue != null) {
			type.setText(newValue);
		} else {
			type.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#getSourceEntity()
	 * 
	 */
	public EObject getSourceEntity() {
		if (sourceEntity.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) sourceEntity.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#initSourceEntity(EObjectFlatComboSettings)
	 */
	public void initSourceEntity(EObjectFlatComboSettings settings) {
		sourceEntity.setInput(settings);
		if (current != null) {
			sourceEntity.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#setSourceEntity(EObject newValue)
	 * 
	 */
	public void setSourceEntity(EObject newValue) {
		if (newValue != null) {
			sourceEntity.setSelection(new StructuredSelection(newValue));
		} else {
			sourceEntity.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#setSourceEntityButtonMode(ButtonsModeEnum newValue)
	 */
	public void setSourceEntityButtonMode(ButtonsModeEnum newValue) {
		sourceEntity.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#addFilterSourceEntity(ViewerFilter filter)
	 * 
	 */
	public void addFilterToSourceEntity(ViewerFilter filter) {
		sourceEntity.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#addBusinessFilterSourceEntity(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToSourceEntity(ViewerFilter filter) {
		sourceEntity.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#getTargetEntity()
	 * 
	 */
	public EObject getTargetEntity() {
		if (targetEntity.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) targetEntity.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#initTargetEntity(EObjectFlatComboSettings)
	 */
	public void initTargetEntity(EObjectFlatComboSettings settings) {
		targetEntity.setInput(settings);
		if (current != null) {
			targetEntity.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#setTargetEntity(EObject newValue)
	 * 
	 */
	public void setTargetEntity(EObject newValue) {
		if (newValue != null) {
			targetEntity.setSelection(new StructuredSelection(newValue));
		} else {
			targetEntity.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#setTargetEntityButtonMode(ButtonsModeEnum newValue)
	 */
	public void setTargetEntityButtonMode(ButtonsModeEnum newValue) {
		targetEntity.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#addFilterTargetEntity(ViewerFilter filter)
	 * 
	 */
	public void addFilterToTargetEntity(ViewerFilter filter) {
		targetEntity.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#addBusinessFilterTargetEntity(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToTargetEntity(ViewerFilter filter) {
		targetEntity.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#getInformation()
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#initInformation(EObjectFlatComboSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#setInformation(EObject newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#setInformationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setInformationButtonMode(ButtonsModeEnum newValue) {
		information.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#addFilterInformation(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInformation(ViewerFilter filter) {
		information.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationRelationshipPropertiesEditionPart#addBusinessFilterInformation(ViewerFilter filter)
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
		return ITRelatedPartMessages.TimInformationRelationship_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
