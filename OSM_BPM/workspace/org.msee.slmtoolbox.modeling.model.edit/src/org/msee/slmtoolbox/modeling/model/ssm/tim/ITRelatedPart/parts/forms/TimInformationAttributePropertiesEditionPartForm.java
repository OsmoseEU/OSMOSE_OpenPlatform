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
import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationAttributePropertiesEditionPart;

import org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.providers.ITRelatedPartMessages;

// End of user code

/**
 * 
 * 
 */
public class TimInformationAttributePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TimInformationAttributePropertiesEditionPart {

	protected Text name;
	protected Text type;
	protected EObjectFlatComboViewer informationEntity;



	/**
	 * For {@link ISection} use only.
	 */
	public TimInformationAttributePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TimInformationAttributePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence timInformationAttributeStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = timInformationAttributeStep.addStep(ITRelatedPartViewsRepository.TimInformationAttribute.Properties.class);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimInformationAttribute.Properties.name);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimInformationAttribute.Properties.type);
		propertiesStep.addStep(ITRelatedPartViewsRepository.TimInformationAttribute.Properties.informationEntity);
		
		
		composer = new PartComposer(timInformationAttributeStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ITRelatedPartViewsRepository.TimInformationAttribute.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ITRelatedPartViewsRepository.TimInformationAttribute.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == ITRelatedPartViewsRepository.TimInformationAttribute.Properties.type) {
					return createTypeText(widgetFactory, parent);
				}
				if (key == ITRelatedPartViewsRepository.TimInformationAttribute.Properties.informationEntity) {
					return createInformationEntityFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(ITRelatedPartMessages.TimInformationAttributePropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, ITRelatedPartViewsRepository.TimInformationAttribute.Properties.name, ITRelatedPartMessages.TimInformationAttributePropertiesEditionPart_NameLabel);
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
							TimInformationAttributePropertiesEditionPartForm.this,
							ITRelatedPartViewsRepository.TimInformationAttribute.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimInformationAttributePropertiesEditionPartForm.this,
									ITRelatedPartViewsRepository.TimInformationAttribute.Properties.name,
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
									TimInformationAttributePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationAttributePropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationAttribute.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ITRelatedPartViewsRepository.TimInformationAttribute.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimInformationAttribute.Properties.name, ITRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ITRelatedPartViewsRepository.TimInformationAttribute.Properties.type, ITRelatedPartMessages.TimInformationAttributePropertiesEditionPart_TypeLabel);
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
							TimInformationAttributePropertiesEditionPartForm.this,
							ITRelatedPartViewsRepository.TimInformationAttribute.Properties.type,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TimInformationAttributePropertiesEditionPartForm.this,
									ITRelatedPartViewsRepository.TimInformationAttribute.Properties.type,
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
									TimInformationAttributePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationAttributePropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationAttribute.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, type.getText()));
				}
			}
		});
		EditingUtils.setID(type, ITRelatedPartViewsRepository.TimInformationAttribute.Properties.type);
		EditingUtils.setEEFtype(type, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimInformationAttribute.Properties.type, ITRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createInformationEntityFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, ITRelatedPartViewsRepository.TimInformationAttribute.Properties.informationEntity, ITRelatedPartMessages.TimInformationAttributePropertiesEditionPart_InformationEntityLabel);
		informationEntity = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(ITRelatedPartViewsRepository.TimInformationAttribute.Properties.informationEntity, ITRelatedPartViewsRepository.FORM_KIND));
		widgetFactory.adapt(informationEntity);
		informationEntity.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData informationEntityData = new GridData(GridData.FILL_HORIZONTAL);
		informationEntity.setLayoutData(informationEntityData);
		informationEntity.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TimInformationAttributePropertiesEditionPartForm.this, ITRelatedPartViewsRepository.TimInformationAttribute.Properties.informationEntity, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getInformationEntity()));
			}

		});
		informationEntity.setID(ITRelatedPartViewsRepository.TimInformationAttribute.Properties.informationEntity);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ITRelatedPartViewsRepository.TimInformationAttribute.Properties.informationEntity, ITRelatedPartViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationAttributePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationAttributePropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationAttributePropertiesEditionPart#getType()
	 * 
	 */
	public String getType() {
		return type.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationAttributePropertiesEditionPart#setType(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationAttributePropertiesEditionPart#getInformationEntity()
	 * 
	 */
	public EObject getInformationEntity() {
		if (informationEntity.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) informationEntity.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationAttributePropertiesEditionPart#initInformationEntity(EObjectFlatComboSettings)
	 */
	public void initInformationEntity(EObjectFlatComboSettings settings) {
		informationEntity.setInput(settings);
		if (current != null) {
			informationEntity.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationAttributePropertiesEditionPart#setInformationEntity(EObject newValue)
	 * 
	 */
	public void setInformationEntity(EObject newValue) {
		if (newValue != null) {
			informationEntity.setSelection(new StructuredSelection(newValue));
		} else {
			informationEntity.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationAttributePropertiesEditionPart#setInformationEntityButtonMode(ButtonsModeEnum newValue)
	 */
	public void setInformationEntityButtonMode(ButtonsModeEnum newValue) {
		informationEntity.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationAttributePropertiesEditionPart#addFilterInformationEntity(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInformationEntity(ViewerFilter filter) {
		informationEntity.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts.TimInformationAttributePropertiesEditionPart#addBusinessFilterInformationEntity(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInformationEntity(ViewerFilter filter) {
		informationEntity.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ITRelatedPartMessages.TimInformationAttribute_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
