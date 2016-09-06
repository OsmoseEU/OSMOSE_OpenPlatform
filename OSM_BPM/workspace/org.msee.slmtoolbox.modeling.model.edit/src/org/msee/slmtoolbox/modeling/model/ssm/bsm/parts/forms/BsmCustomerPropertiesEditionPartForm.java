/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmCustomerPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmCustomerPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, BsmCustomerPropertiesEditionPart {

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
	 * For {@link ISection} use only.
	 */
	public BsmCustomerPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmCustomerPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmCustomer.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmCustomer.Properties.categories) {
					return createCategoriesText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmCustomer.Properties.levelOfEducation) {
					return createLevelOfEducationText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmCustomer.Properties.gender) {
					return createGenderEMFComboViewer(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmCustomer.Properties.age) {
					return createAgeText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange) {
					return createAnnualRevenueRangeText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmCustomer.Properties.requirement) {
					return createRequirementText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmCustomer.Properties.constraint) {
					return createConstraintText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq) {
					return createTargetedUsageFreqText(widgetFactory, parent);
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
		propertiesSection.setText(BsmMessages.BsmCustomerPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, BsmViewsRepository.BsmCustomer.Properties.name, BsmMessages.BsmCustomerPropertiesEditionPart_NameLabel);
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
							BsmCustomerPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmCustomer.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmCustomerPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmCustomer.Properties.name,
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
									BsmCustomerPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartForm.this, BsmViewsRepository.BsmCustomer.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, BsmViewsRepository.BsmCustomer.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmCustomer.Properties.name, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCategoriesText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmCustomer.Properties.categories, BsmMessages.BsmCustomerPropertiesEditionPart_CategoriesLabel);
		categories = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		categories.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData categoriesData = new GridData(GridData.FILL_HORIZONTAL);
		categories.setLayoutData(categoriesData);
		categories.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmCustomerPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmCustomer.Properties.categories,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, categories.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmCustomerPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmCustomer.Properties.categories,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, categories.getText()));
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
									BsmCustomerPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		categories.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartForm.this, BsmViewsRepository.BsmCustomer.Properties.categories, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, categories.getText()));
				}
			}
		});
		EditingUtils.setID(categories, BsmViewsRepository.BsmCustomer.Properties.categories);
		EditingUtils.setEEFtype(categories, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmCustomer.Properties.categories, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createLevelOfEducationText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmCustomer.Properties.levelOfEducation, BsmMessages.BsmCustomerPropertiesEditionPart_LevelOfEducationLabel);
		levelOfEducation = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		levelOfEducation.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData levelOfEducationData = new GridData(GridData.FILL_HORIZONTAL);
		levelOfEducation.setLayoutData(levelOfEducationData);
		levelOfEducation.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmCustomerPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmCustomer.Properties.levelOfEducation,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, levelOfEducation.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmCustomerPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmCustomer.Properties.levelOfEducation,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, levelOfEducation.getText()));
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
									BsmCustomerPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		levelOfEducation.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartForm.this, BsmViewsRepository.BsmCustomer.Properties.levelOfEducation, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, levelOfEducation.getText()));
				}
			}
		});
		EditingUtils.setID(levelOfEducation, BsmViewsRepository.BsmCustomer.Properties.levelOfEducation);
		EditingUtils.setEEFtype(levelOfEducation, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmCustomer.Properties.levelOfEducation, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createGenderEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartForm.this, BsmViewsRepository.BsmCustomer.Properties.gender, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getGender()));
			}

		});
		gender.setID(BsmViewsRepository.BsmCustomer.Properties.gender);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmCustomer.Properties.gender, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAgeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmCustomer.Properties.age, BsmMessages.BsmCustomerPropertiesEditionPart_AgeLabel);
		age = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		age.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData ageData = new GridData(GridData.FILL_HORIZONTAL);
		age.setLayoutData(ageData);
		age.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmCustomerPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmCustomer.Properties.age,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, age.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmCustomerPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmCustomer.Properties.age,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, age.getText()));
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
									BsmCustomerPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		age.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartForm.this, BsmViewsRepository.BsmCustomer.Properties.age, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, age.getText()));
				}
			}
		});
		EditingUtils.setID(age, BsmViewsRepository.BsmCustomer.Properties.age);
		EditingUtils.setEEFtype(age, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmCustomer.Properties.age, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAnnualRevenueRangeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange, BsmMessages.BsmCustomerPropertiesEditionPart_AnnualRevenueRangeLabel);
		annualRevenueRange = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		annualRevenueRange.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData annualRevenueRangeData = new GridData(GridData.FILL_HORIZONTAL);
		annualRevenueRange.setLayoutData(annualRevenueRangeData);
		annualRevenueRange.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmCustomerPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, annualRevenueRange.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmCustomerPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, annualRevenueRange.getText()));
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
									BsmCustomerPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		annualRevenueRange.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartForm.this, BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, annualRevenueRange.getText()));
				}
			}
		});
		EditingUtils.setID(annualRevenueRange, BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange);
		EditingUtils.setEEFtype(annualRevenueRange, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmCustomer.Properties.annualRevenueRange, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRequirementText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmCustomer.Properties.requirement, BsmMessages.BsmCustomerPropertiesEditionPart_RequirementLabel);
		requirement = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		requirement.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData requirementData = new GridData(GridData.FILL_HORIZONTAL);
		requirement.setLayoutData(requirementData);
		requirement.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmCustomerPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmCustomer.Properties.requirement,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, requirement.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmCustomerPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmCustomer.Properties.requirement,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, requirement.getText()));
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
									BsmCustomerPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		requirement.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartForm.this, BsmViewsRepository.BsmCustomer.Properties.requirement, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, requirement.getText()));
				}
			}
		});
		EditingUtils.setID(requirement, BsmViewsRepository.BsmCustomer.Properties.requirement);
		EditingUtils.setEEFtype(requirement, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmCustomer.Properties.requirement, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConstraintText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmCustomer.Properties.constraint, BsmMessages.BsmCustomerPropertiesEditionPart_ConstraintLabel);
		constraint = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		constraint.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData constraintData = new GridData(GridData.FILL_HORIZONTAL);
		constraint.setLayoutData(constraintData);
		constraint.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmCustomerPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmCustomer.Properties.constraint,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmCustomerPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmCustomer.Properties.constraint,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, constraint.getText()));
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
									BsmCustomerPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		constraint.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartForm.this, BsmViewsRepository.BsmCustomer.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
				}
			}
		});
		EditingUtils.setID(constraint, BsmViewsRepository.BsmCustomer.Properties.constraint);
		EditingUtils.setEEFtype(constraint, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmCustomer.Properties.constraint, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTargetedUsageFreqText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq, BsmMessages.BsmCustomerPropertiesEditionPart_TargetedUsageFreqLabel);
		targetedUsageFreq = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		targetedUsageFreq.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData targetedUsageFreqData = new GridData(GridData.FILL_HORIZONTAL);
		targetedUsageFreq.setLayoutData(targetedUsageFreqData);
		targetedUsageFreq.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmCustomerPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, targetedUsageFreq.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmCustomerPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, targetedUsageFreq.getText()));
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
									BsmCustomerPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		targetedUsageFreq.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmCustomerPropertiesEditionPartForm.this, BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, targetedUsageFreq.getText()));
				}
			}
		});
		EditingUtils.setID(targetedUsageFreq, BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq);
		EditingUtils.setEEFtype(targetedUsageFreq, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmCustomer.Properties.targetedUsageFreq, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
