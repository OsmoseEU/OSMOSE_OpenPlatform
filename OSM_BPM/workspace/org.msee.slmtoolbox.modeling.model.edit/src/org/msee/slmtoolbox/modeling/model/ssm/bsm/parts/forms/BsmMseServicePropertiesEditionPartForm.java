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

import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmMseServicePropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, BsmMseServicePropertiesEditionPart {

	protected Text name;
	protected Text description;
	protected Text owner;
	protected Text createDate;
	protected Text publishedDate;
	protected Text published;
	protected EObjectFlatComboViewer process;
	protected EObjectFlatComboViewer organization;
	protected EObjectFlatComboViewer resource;



	/**
	 * For {@link ISection} use only.
	 */
	public BsmMseServicePropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmMseServicePropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence bsmMseServiceStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = bsmMseServiceStep.addStep(BsmViewsRepository.BsmMseService.Properties.class);
		propertiesStep.addStep(BsmViewsRepository.BsmMseService.Properties.name);
		propertiesStep.addStep(BsmViewsRepository.BsmMseService.Properties.description);
		propertiesStep.addStep(BsmViewsRepository.BsmMseService.Properties.owner);
		propertiesStep.addStep(BsmViewsRepository.BsmMseService.Properties.createDate);
		propertiesStep.addStep(BsmViewsRepository.BsmMseService.Properties.publishedDate);
		propertiesStep.addStep(BsmViewsRepository.BsmMseService.Properties.published);
		propertiesStep.addStep(BsmViewsRepository.BsmMseService.Properties.process);
		propertiesStep.addStep(BsmViewsRepository.BsmMseService.Properties.organization);
		propertiesStep.addStep(BsmViewsRepository.BsmMseService.Properties.resource);
		
		
		composer = new PartComposer(bsmMseServiceStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == BsmViewsRepository.BsmMseService.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmMseService.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmMseService.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmMseService.Properties.owner) {
					return createOwnerText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmMseService.Properties.createDate) {
					return createCreateDateText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmMseService.Properties.publishedDate) {
					return createPublishedDateText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmMseService.Properties.published) {
					return createPublishedText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmMseService.Properties.process) {
					return createProcessFlatComboViewer(parent, widgetFactory);
				}
				if (key == BsmViewsRepository.BsmMseService.Properties.organization) {
					return createOrganizationFlatComboViewer(parent, widgetFactory);
				}
				if (key == BsmViewsRepository.BsmMseService.Properties.resource) {
					return createResourceFlatComboViewer(parent, widgetFactory);
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
		propertiesSection.setText(BsmMessages.BsmMseServicePropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, BsmViewsRepository.BsmMseService.Properties.name, BsmMessages.BsmMseServicePropertiesEditionPart_NameLabel);
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
							BsmMseServicePropertiesEditionPartForm.this,
							BsmViewsRepository.BsmMseService.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmMseServicePropertiesEditionPartForm.this,
									BsmViewsRepository.BsmMseService.Properties.name,
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
									BsmMseServicePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartForm.this, BsmViewsRepository.BsmMseService.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, BsmViewsRepository.BsmMseService.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmMseService.Properties.name, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmMseService.Properties.description, BsmMessages.BsmMseServicePropertiesEditionPart_DescriptionLabel);
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
							BsmMseServicePropertiesEditionPartForm.this,
							BsmViewsRepository.BsmMseService.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmMseServicePropertiesEditionPartForm.this,
									BsmViewsRepository.BsmMseService.Properties.description,
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
									BsmMseServicePropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartForm.this, BsmViewsRepository.BsmMseService.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, BsmViewsRepository.BsmMseService.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmMseService.Properties.description, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOwnerText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmMseService.Properties.owner, BsmMessages.BsmMseServicePropertiesEditionPart_OwnerLabel);
		owner = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		owner.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData ownerData = new GridData(GridData.FILL_HORIZONTAL);
		owner.setLayoutData(ownerData);
		owner.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmMseServicePropertiesEditionPartForm.this,
							BsmViewsRepository.BsmMseService.Properties.owner,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmMseServicePropertiesEditionPartForm.this,
									BsmViewsRepository.BsmMseService.Properties.owner,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, owner.getText()));
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
									BsmMseServicePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		owner.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartForm.this, BsmViewsRepository.BsmMseService.Properties.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
				}
			}
		});
		EditingUtils.setID(owner, BsmViewsRepository.BsmMseService.Properties.owner);
		EditingUtils.setEEFtype(owner, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmMseService.Properties.owner, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCreateDateText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmMseService.Properties.createDate, BsmMessages.BsmMseServicePropertiesEditionPart_CreateDateLabel);
		createDate = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		createDate.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData createDateData = new GridData(GridData.FILL_HORIZONTAL);
		createDate.setLayoutData(createDateData);
		createDate.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmMseServicePropertiesEditionPartForm.this,
							BsmViewsRepository.BsmMseService.Properties.createDate,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, createDate.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmMseServicePropertiesEditionPartForm.this,
									BsmViewsRepository.BsmMseService.Properties.createDate,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, createDate.getText()));
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
									BsmMseServicePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		createDate.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartForm.this, BsmViewsRepository.BsmMseService.Properties.createDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, createDate.getText()));
				}
			}
		});
		EditingUtils.setID(createDate, BsmViewsRepository.BsmMseService.Properties.createDate);
		EditingUtils.setEEFtype(createDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmMseService.Properties.createDate, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPublishedDateText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmMseService.Properties.publishedDate, BsmMessages.BsmMseServicePropertiesEditionPart_PublishedDateLabel);
		publishedDate = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		publishedDate.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData publishedDateData = new GridData(GridData.FILL_HORIZONTAL);
		publishedDate.setLayoutData(publishedDateData);
		publishedDate.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmMseServicePropertiesEditionPartForm.this,
							BsmViewsRepository.BsmMseService.Properties.publishedDate,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, publishedDate.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmMseServicePropertiesEditionPartForm.this,
									BsmViewsRepository.BsmMseService.Properties.publishedDate,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, publishedDate.getText()));
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
									BsmMseServicePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		publishedDate.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartForm.this, BsmViewsRepository.BsmMseService.Properties.publishedDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, publishedDate.getText()));
				}
			}
		});
		EditingUtils.setID(publishedDate, BsmViewsRepository.BsmMseService.Properties.publishedDate);
		EditingUtils.setEEFtype(publishedDate, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmMseService.Properties.publishedDate, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPublishedText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmMseService.Properties.published, BsmMessages.BsmMseServicePropertiesEditionPart_PublishedLabel);
		published = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		published.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData publishedData = new GridData(GridData.FILL_HORIZONTAL);
		published.setLayoutData(publishedData);
		published.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmMseServicePropertiesEditionPartForm.this,
							BsmViewsRepository.BsmMseService.Properties.published,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, published.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmMseServicePropertiesEditionPartForm.this,
									BsmViewsRepository.BsmMseService.Properties.published,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, published.getText()));
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
									BsmMseServicePropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		published.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartForm.this, BsmViewsRepository.BsmMseService.Properties.published, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, published.getText()));
				}
			}
		});
		EditingUtils.setID(published, BsmViewsRepository.BsmMseService.Properties.published);
		EditingUtils.setEEFtype(published, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmMseService.Properties.published, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createProcessFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, BsmViewsRepository.BsmMseService.Properties.process, BsmMessages.BsmMseServicePropertiesEditionPart_ProcessLabel);
		process = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmMseService.Properties.process, BsmViewsRepository.FORM_KIND));
		widgetFactory.adapt(process);
		process.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData processData = new GridData(GridData.FILL_HORIZONTAL);
		process.setLayoutData(processData);
		process.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartForm.this, BsmViewsRepository.BsmMseService.Properties.process, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getProcess()));
			}

		});
		process.setID(BsmViewsRepository.BsmMseService.Properties.process);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmMseService.Properties.process, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createOrganizationFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, BsmViewsRepository.BsmMseService.Properties.organization, BsmMessages.BsmMseServicePropertiesEditionPart_OrganizationLabel);
		organization = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmMseService.Properties.organization, BsmViewsRepository.FORM_KIND));
		widgetFactory.adapt(organization);
		organization.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData organizationData = new GridData(GridData.FILL_HORIZONTAL);
		organization.setLayoutData(organizationData);
		organization.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartForm.this, BsmViewsRepository.BsmMseService.Properties.organization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOrganization()));
			}

		});
		organization.setID(BsmViewsRepository.BsmMseService.Properties.organization);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmMseService.Properties.organization, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createResourceFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, BsmViewsRepository.BsmMseService.Properties.resource, BsmMessages.BsmMseServicePropertiesEditionPart_ResourceLabel);
		resource = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmMseService.Properties.resource, BsmViewsRepository.FORM_KIND));
		widgetFactory.adapt(resource);
		resource.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData resourceData = new GridData(GridData.FILL_HORIZONTAL);
		resource.setLayoutData(resourceData);
		resource.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartForm.this, BsmViewsRepository.BsmMseService.Properties.resource, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getResource()));
			}

		});
		resource.setID(BsmViewsRepository.BsmMseService.Properties.resource);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmMseService.Properties.resource, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#getOwner()
	 * 
	 */
	public String getOwner() {
		return owner.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#setOwner(String newValue)
	 * 
	 */
	public void setOwner(String newValue) {
		if (newValue != null) {
			owner.setText(newValue);
		} else {
			owner.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#getCreateDate()
	 * 
	 */
	public String getCreateDate() {
		return createDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#setCreateDate(String newValue)
	 * 
	 */
	public void setCreateDate(String newValue) {
		if (newValue != null) {
			createDate.setText(newValue);
		} else {
			createDate.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#getPublishedDate()
	 * 
	 */
	public String getPublishedDate() {
		return publishedDate.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#setPublishedDate(String newValue)
	 * 
	 */
	public void setPublishedDate(String newValue) {
		if (newValue != null) {
			publishedDate.setText(newValue);
		} else {
			publishedDate.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#getPublished()
	 * 
	 */
	public String getPublished() {
		return published.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#setPublished(String newValue)
	 * 
	 */
	public void setPublished(String newValue) {
		if (newValue != null) {
			published.setText(newValue);
		} else {
			published.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#getProcess()
	 * 
	 */
	public EObject getProcess() {
		if (process.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) process.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#initProcess(EObjectFlatComboSettings)
	 */
	public void initProcess(EObjectFlatComboSettings settings) {
		process.setInput(settings);
		if (current != null) {
			process.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#setProcess(EObject newValue)
	 * 
	 */
	public void setProcess(EObject newValue) {
		if (newValue != null) {
			process.setSelection(new StructuredSelection(newValue));
		} else {
			process.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#setProcessButtonMode(ButtonsModeEnum newValue)
	 */
	public void setProcessButtonMode(ButtonsModeEnum newValue) {
		process.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#addFilterProcess(ViewerFilter filter)
	 * 
	 */
	public void addFilterToProcess(ViewerFilter filter) {
		process.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#addBusinessFilterProcess(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToProcess(ViewerFilter filter) {
		process.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#getOrganization()
	 * 
	 */
	public EObject getOrganization() {
		if (organization.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) organization.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#initOrganization(EObjectFlatComboSettings)
	 */
	public void initOrganization(EObjectFlatComboSettings settings) {
		organization.setInput(settings);
		if (current != null) {
			organization.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#setOrganization(EObject newValue)
	 * 
	 */
	public void setOrganization(EObject newValue) {
		if (newValue != null) {
			organization.setSelection(new StructuredSelection(newValue));
		} else {
			organization.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#setOrganizationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOrganizationButtonMode(ButtonsModeEnum newValue) {
		organization.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#addFilterOrganization(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOrganization(ViewerFilter filter) {
		organization.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#addBusinessFilterOrganization(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOrganization(ViewerFilter filter) {
		organization.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#getResource()
	 * 
	 */
	public EObject getResource() {
		if (resource.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) resource.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#initResource(EObjectFlatComboSettings)
	 */
	public void initResource(EObjectFlatComboSettings settings) {
		resource.setInput(settings);
		if (current != null) {
			resource.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#setResource(EObject newValue)
	 * 
	 */
	public void setResource(EObject newValue) {
		if (newValue != null) {
			resource.setSelection(new StructuredSelection(newValue));
		} else {
			resource.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#setResourceButtonMode(ButtonsModeEnum newValue)
	 */
	public void setResourceButtonMode(ButtonsModeEnum newValue) {
		resource.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#addFilterResource(ViewerFilter filter)
	 * 
	 */
	public void addFilterToResource(ViewerFilter filter) {
		resource.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart#addBusinessFilterResource(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToResource(ViewerFilter filter) {
		resource.addBusinessRuleFilter(filter);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return BsmMessages.BsmMseService_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
