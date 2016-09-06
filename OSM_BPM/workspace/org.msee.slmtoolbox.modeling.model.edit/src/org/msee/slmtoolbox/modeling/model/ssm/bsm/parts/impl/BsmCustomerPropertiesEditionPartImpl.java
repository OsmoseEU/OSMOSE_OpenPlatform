/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl;

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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmCustomerPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, BsmCustomerPropertiesEditionPart {

	protected Text name;
	protected Text categories;
	protected Text levelOfEducation;
	protected EMFComboViewer gender;
	protected Text age;
	protected Text annualRevenueRange;
	protected Text requirement;
	protected Text constraint;
	protected Text targetedUsageFreq;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmCustomerPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence bsmCustomerStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = bsmCustomerStep.addStep(BsmViewsRepository.BsmCustomer.Properties.class);
		propertiesStep.addStep(BsmViewsRepository.BsmCustomer.Properties.name);
		propertiesStep.addStep(BsmViewsRepository.BsmCustomer.Properties.categories);
		propertiesStep.addStep(BsmViewsRepository.BsmCustomer.Properties.levelOfEducation);
		propertiesStep.addStep(BsmViewsRepository.BsmCustomer.Properties.gender);
		propertiesStep.addStep(BsmViewsRepository.BsmCustomer.Properties.age);
		propertiesStep.addStep(BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange);
		propertiesStep.addStep(BsmViewsRepository.BsmCustomer.Properties.requirement);
		propertiesStep.addStep(BsmViewsRepository.BsmCustomer.Properties.constraint);
		propertiesStep.addStep(BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq);
		
		
		composer = new PartComposer(bsmCustomerStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == BsmViewsRepository.BsmCustomer.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == BsmViewsRepository.BsmCustomer.Properties.name) {
					return createNameText(parent);
				}
				if (key == BsmViewsRepository.BsmCustomer.Properties.categories) {
					return createCategoriesText(parent);
				}
				if (key == BsmViewsRepository.BsmCustomer.Properties.levelOfEducation) {
					return createLevelOfEducationText(parent);
				}
				if (key == BsmViewsRepository.BsmCustomer.Properties.gender) {
					return createGenderEMFComboViewer(parent);
				}
				if (key == BsmViewsRepository.BsmCustomer.Properties.age) {
					return createAgeText(parent);
				}
				if (key == BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange) {
					return createAnnualRevenueRangeText(parent);
				}
				if (key == BsmViewsRepository.BsmCustomer.Properties.requirement) {
					return createRequirementText(parent);
				}
				if (key == BsmViewsRepository.BsmCustomer.Properties.constraint) {
					return createConstraintText(parent);
				}
				if (key == BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq) {
					return createTargetedUsageFreqText(parent);
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
		propertiesGroup.setText(BsmMessages.BsmCustomerPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmCustomer.Properties.name, BsmMessages.BsmCustomerPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartImpl.this, BsmViewsRepository.BsmCustomer.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartImpl.this, BsmViewsRepository.BsmCustomer.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, BsmViewsRepository.BsmCustomer.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmCustomer.Properties.name, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCategoriesText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmCustomer.Properties.categories, BsmMessages.BsmCustomerPropertiesEditionPart_CategoriesLabel);
		categories = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData categoriesData = new GridData(GridData.FILL_HORIZONTAL);
		categories.setLayoutData(categoriesData);
		categories.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartImpl.this, BsmViewsRepository.BsmCustomer.Properties.categories, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, categories.getText()));
			}

		});
		categories.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartImpl.this, BsmViewsRepository.BsmCustomer.Properties.categories, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, categories.getText()));
				}
			}

		});
		EditingUtils.setID(categories, BsmViewsRepository.BsmCustomer.Properties.categories);
		EditingUtils.setEEFtype(categories, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmCustomer.Properties.categories, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLevelOfEducationText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmCustomer.Properties.levelOfEducation, BsmMessages.BsmCustomerPropertiesEditionPart_LevelOfEducationLabel);
		levelOfEducation = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData levelOfEducationData = new GridData(GridData.FILL_HORIZONTAL);
		levelOfEducation.setLayoutData(levelOfEducationData);
		levelOfEducation.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartImpl.this, BsmViewsRepository.BsmCustomer.Properties.levelOfEducation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, levelOfEducation.getText()));
			}

		});
		levelOfEducation.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartImpl.this, BsmViewsRepository.BsmCustomer.Properties.levelOfEducation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, levelOfEducation.getText()));
				}
			}

		});
		EditingUtils.setID(levelOfEducation, BsmViewsRepository.BsmCustomer.Properties.levelOfEducation);
		EditingUtils.setEEFtype(levelOfEducation, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmCustomer.Properties.levelOfEducation, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createGenderEMFComboViewer(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmCustomer.Properties.gender, BsmMessages.BsmCustomerPropertiesEditionPart_GenderLabel);
		gender = new EMFComboViewer(parent);
		gender.setContentProvider(new ArrayContentProvider());
		gender.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData genderData = new GridData(GridData.FILL_HORIZONTAL);
		gender.getCombo().setLayoutData(genderData);
		gender.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartImpl.this, BsmViewsRepository.BsmCustomer.Properties.gender, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getGender()));
			}

		});
		gender.setID(BsmViewsRepository.BsmCustomer.Properties.gender);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmCustomer.Properties.gender, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAgeText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmCustomer.Properties.age, BsmMessages.BsmCustomerPropertiesEditionPart_AgeLabel);
		age = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData ageData = new GridData(GridData.FILL_HORIZONTAL);
		age.setLayoutData(ageData);
		age.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartImpl.this, BsmViewsRepository.BsmCustomer.Properties.age, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, age.getText()));
			}

		});
		age.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartImpl.this, BsmViewsRepository.BsmCustomer.Properties.age, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, age.getText()));
				}
			}

		});
		EditingUtils.setID(age, BsmViewsRepository.BsmCustomer.Properties.age);
		EditingUtils.setEEFtype(age, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmCustomer.Properties.age, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAnnualRevenueRangeText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange, BsmMessages.BsmCustomerPropertiesEditionPart_AnnualRevenueRangeLabel);
		annualRevenueRange = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData annualRevenueRangeData = new GridData(GridData.FILL_HORIZONTAL);
		annualRevenueRange.setLayoutData(annualRevenueRangeData);
		annualRevenueRange.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartImpl.this, BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, annualRevenueRange.getText()));
			}

		});
		annualRevenueRange.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartImpl.this, BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, annualRevenueRange.getText()));
				}
			}

		});
		EditingUtils.setID(annualRevenueRange, BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange);
		EditingUtils.setEEFtype(annualRevenueRange, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRequirementText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmCustomer.Properties.requirement, BsmMessages.BsmCustomerPropertiesEditionPart_RequirementLabel);
		requirement = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData requirementData = new GridData(GridData.FILL_HORIZONTAL);
		requirement.setLayoutData(requirementData);
		requirement.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartImpl.this, BsmViewsRepository.BsmCustomer.Properties.requirement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, requirement.getText()));
			}

		});
		requirement.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartImpl.this, BsmViewsRepository.BsmCustomer.Properties.requirement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, requirement.getText()));
				}
			}

		});
		EditingUtils.setID(requirement, BsmViewsRepository.BsmCustomer.Properties.requirement);
		EditingUtils.setEEFtype(requirement, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmCustomer.Properties.requirement, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConstraintText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmCustomer.Properties.constraint, BsmMessages.BsmCustomerPropertiesEditionPart_ConstraintLabel);
		constraint = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData constraintData = new GridData(GridData.FILL_HORIZONTAL);
		constraint.setLayoutData(constraintData);
		constraint.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartImpl.this, BsmViewsRepository.BsmCustomer.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
			}

		});
		constraint.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartImpl.this, BsmViewsRepository.BsmCustomer.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
				}
			}

		});
		EditingUtils.setID(constraint, BsmViewsRepository.BsmCustomer.Properties.constraint);
		EditingUtils.setEEFtype(constraint, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmCustomer.Properties.constraint, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTargetedUsageFreqText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq, BsmMessages.BsmCustomerPropertiesEditionPart_TargetedUsageFreqLabel);
		targetedUsageFreq = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData targetedUsageFreqData = new GridData(GridData.FILL_HORIZONTAL);
		targetedUsageFreq.setLayoutData(targetedUsageFreqData);
		targetedUsageFreq.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartImpl.this, BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, targetedUsageFreq.getText()));
			}

		});
		targetedUsageFreq.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartImpl.this, BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, targetedUsageFreq.getText()));
				}
			}

		});
		EditingUtils.setID(targetedUsageFreq, BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq);
		EditingUtils.setEEFtype(targetedUsageFreq, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#getCategories()
	 * 
	 */
	public String getCategories() {
		return categories.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#setCategories(String newValue)
	 * 
	 */
	public void setCategories(String newValue) {
		if (newValue != null) {
			categories.setText(newValue);
		} else {
			categories.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#getLevelOfEducation()
	 * 
	 */
	public String getLevelOfEducation() {
		return levelOfEducation.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#setLevelOfEducation(String newValue)
	 * 
	 */
	public void setLevelOfEducation(String newValue) {
		if (newValue != null) {
			levelOfEducation.setText(newValue);
		} else {
			levelOfEducation.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#getGender()
	 * 
	 */
	public Enumerator getGender() {
		Enumerator selection = (Enumerator) ((StructuredSelection) gender.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#initGender(Object input, Enumerator current)
	 */
	public void initGender(Object input, Enumerator current) {
		gender.setInput(input);
		gender.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#setGender(Enumerator newValue)
	 * 
	 */
	public void setGender(Enumerator newValue) {
		gender.modelUpdating(new StructuredSelection(newValue));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#getAge()
	 * 
	 */
	public String getAge() {
		return age.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#setAge(String newValue)
	 * 
	 */
	public void setAge(String newValue) {
		if (newValue != null) {
			age.setText(newValue);
		} else {
			age.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#getAnnualRevenueRange()
	 * 
	 */
	public String getAnnualRevenueRange() {
		return annualRevenueRange.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#setAnnualRevenueRange(String newValue)
	 * 
	 */
	public void setAnnualRevenueRange(String newValue) {
		if (newValue != null) {
			annualRevenueRange.setText(newValue);
		} else {
			annualRevenueRange.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#getRequirement()
	 * 
	 */
	public String getRequirement() {
		return requirement.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#setRequirement(String newValue)
	 * 
	 */
	public void setRequirement(String newValue) {
		if (newValue != null) {
			requirement.setText(newValue);
		} else {
			requirement.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#getConstraint()
	 * 
	 */
	public String getConstraint() {
		return constraint.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#setConstraint(String newValue)
	 * 
	 */
	public void setConstraint(String newValue) {
		if (newValue != null) {
			constraint.setText(newValue);
		} else {
			constraint.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#getTargetedUsageFreq()
	 * 
	 */
	public String getTargetedUsageFreq() {
		return targetedUsageFreq.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart#setTargetedUsageFreq(String newValue)
	 * 
	 */
	public void setTargetedUsageFreq(String newValue) {
		if (newValue != null) {
			targetedUsageFreq.setText(newValue);
		} else {
			targetedUsageFreq.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return BsmMessages.BsmCustomer_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
