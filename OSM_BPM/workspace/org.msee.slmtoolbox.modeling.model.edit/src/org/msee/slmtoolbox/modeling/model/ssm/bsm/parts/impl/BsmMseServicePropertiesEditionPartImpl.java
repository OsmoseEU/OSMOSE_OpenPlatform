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

import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmMseServicePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmMseServicePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, BsmMseServicePropertiesEditionPart {

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
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmMseServicePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(parent);
				}
				if (key == BsmViewsRepository.BsmMseService.Properties.name) {
					return createNameText(parent);
				}
				if (key == BsmViewsRepository.BsmMseService.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == BsmViewsRepository.BsmMseService.Properties.owner) {
					return createOwnerText(parent);
				}
				if (key == BsmViewsRepository.BsmMseService.Properties.createDate) {
					return createCreateDateText(parent);
				}
				if (key == BsmViewsRepository.BsmMseService.Properties.publishedDate) {
					return createPublishedDateText(parent);
				}
				if (key == BsmViewsRepository.BsmMseService.Properties.published) {
					return createPublishedText(parent);
				}
				if (key == BsmViewsRepository.BsmMseService.Properties.process) {
					return createProcessFlatComboViewer(parent);
				}
				if (key == BsmViewsRepository.BsmMseService.Properties.organization) {
					return createOrganizationFlatComboViewer(parent);
				}
				if (key == BsmViewsRepository.BsmMseService.Properties.resource) {
					return createResourceFlatComboViewer(parent);
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
		propertiesGroup.setText(BsmMessages.BsmMseServicePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmMseService.Properties.name, BsmMessages.BsmMseServicePropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmMseService.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmMseService.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, BsmViewsRepository.BsmMseService.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmMseService.Properties.name, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmMseService.Properties.description, BsmMessages.BsmMseServicePropertiesEditionPart_DescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmMseService.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmMseService.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, BsmViewsRepository.BsmMseService.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmMseService.Properties.description, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOwnerText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmMseService.Properties.owner, BsmMessages.BsmMseServicePropertiesEditionPart_OwnerLabel);
		owner = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData ownerData = new GridData(GridData.FILL_HORIZONTAL);
		owner.setLayoutData(ownerData);
		owner.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmMseService.Properties.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
			}

		});
		owner.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmMseService.Properties.owner, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, owner.getText()));
				}
			}

		});
		EditingUtils.setID(owner, BsmViewsRepository.BsmMseService.Properties.owner);
		EditingUtils.setEEFtype(owner, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmMseService.Properties.owner, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCreateDateText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmMseService.Properties.createDate, BsmMessages.BsmMseServicePropertiesEditionPart_CreateDateLabel);
		createDate = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData createDateData = new GridData(GridData.FILL_HORIZONTAL);
		createDate.setLayoutData(createDateData);
		createDate.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmMseService.Properties.createDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, createDate.getText()));
			}

		});
		createDate.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmMseService.Properties.createDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, createDate.getText()));
				}
			}

		});
		EditingUtils.setID(createDate, BsmViewsRepository.BsmMseService.Properties.createDate);
		EditingUtils.setEEFtype(createDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmMseService.Properties.createDate, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPublishedDateText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmMseService.Properties.publishedDate, BsmMessages.BsmMseServicePropertiesEditionPart_PublishedDateLabel);
		publishedDate = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData publishedDateData = new GridData(GridData.FILL_HORIZONTAL);
		publishedDate.setLayoutData(publishedDateData);
		publishedDate.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmMseService.Properties.publishedDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, publishedDate.getText()));
			}

		});
		publishedDate.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmMseService.Properties.publishedDate, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, publishedDate.getText()));
				}
			}

		});
		EditingUtils.setID(publishedDate, BsmViewsRepository.BsmMseService.Properties.publishedDate);
		EditingUtils.setEEFtype(publishedDate, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmMseService.Properties.publishedDate, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPublishedText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmMseService.Properties.published, BsmMessages.BsmMseServicePropertiesEditionPart_PublishedLabel);
		published = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData publishedData = new GridData(GridData.FILL_HORIZONTAL);
		published.setLayoutData(publishedData);
		published.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmMseService.Properties.published, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, published.getText()));
			}

		});
		published.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmMseService.Properties.published, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, published.getText()));
				}
			}

		});
		EditingUtils.setID(published, BsmViewsRepository.BsmMseService.Properties.published);
		EditingUtils.setEEFtype(published, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmMseService.Properties.published, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createProcessFlatComboViewer(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmMseService.Properties.process, BsmMessages.BsmMseServicePropertiesEditionPart_ProcessLabel);
		process = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmMseService.Properties.process, BsmViewsRepository.SWT_KIND));
		process.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		process.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmMseService.Properties.process, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getProcess()));
			}

		});
		GridData processData = new GridData(GridData.FILL_HORIZONTAL);
		process.setLayoutData(processData);
		process.setID(BsmViewsRepository.BsmMseService.Properties.process);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmMseService.Properties.process, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createOrganizationFlatComboViewer(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmMseService.Properties.organization, BsmMessages.BsmMseServicePropertiesEditionPart_OrganizationLabel);
		organization = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmMseService.Properties.organization, BsmViewsRepository.SWT_KIND));
		organization.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		organization.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmMseService.Properties.organization, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOrganization()));
			}

		});
		GridData organizationData = new GridData(GridData.FILL_HORIZONTAL);
		organization.setLayoutData(organizationData);
		organization.setID(BsmViewsRepository.BsmMseService.Properties.organization);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmMseService.Properties.organization, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createResourceFlatComboViewer(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmMseService.Properties.resource, BsmMessages.BsmMseServicePropertiesEditionPart_ResourceLabel);
		resource = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmMseService.Properties.resource, BsmViewsRepository.SWT_KIND));
		resource.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		resource.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmMseServicePropertiesEditionPartImpl.this, BsmViewsRepository.BsmMseService.Properties.resource, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getResource()));
			}

		});
		GridData resourceData = new GridData(GridData.FILL_HORIZONTAL);
		resource.setLayoutData(resourceData);
		resource.setID(BsmViewsRepository.BsmMseService.Properties.resource);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmMseService.Properties.resource, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
