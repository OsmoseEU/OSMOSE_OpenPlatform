/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPerformanceIndicator;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs.BsmAddObjectiveToPIDialog;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.dialogs.BsmAddVariableToPIDialog;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmPerformanceIndicatorPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, BsmPerformanceIndicatorPropertiesEditionPart {

	protected Text name;
	protected Text description;
	protected Text unit;
	protected Text formula;
	protected Text requiredInfo;
	protected Text requiredProcessing;
	protected EObjectFlatComboViewer decision;
	protected ReferencesTable variables;
	protected List<ViewerFilter> variablesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> variablesFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable objectives;
	protected List<ViewerFilter> objectivesBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> objectivesFilters = new ArrayList<ViewerFilter>();
	protected Text category1;
	protected Text category2;
	protected Text category3;
	protected Text dimension;



	/**
	 * For {@link ISection} use only.
	 */
	public BsmPerformanceIndicatorPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmPerformanceIndicatorPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence bsmPerformanceIndicatorStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = bsmPerformanceIndicatorStep.addStep(BsmViewsRepository.BsmPerformanceIndicator.Properties.class);
		propertiesStep.addStep(BsmViewsRepository.BsmPerformanceIndicator.Properties.name);
		propertiesStep.addStep(BsmViewsRepository.BsmPerformanceIndicator.Properties.description);
		propertiesStep.addStep(BsmViewsRepository.BsmPerformanceIndicator.Properties.unit);
		propertiesStep.addStep(BsmViewsRepository.BsmPerformanceIndicator.Properties.formula);
		propertiesStep.addStep(BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredInfo);
		propertiesStep.addStep(BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredProcessing);
		propertiesStep.addStep(BsmViewsRepository.BsmPerformanceIndicator.Properties.decision);
		propertiesStep.addStep(BsmViewsRepository.BsmPerformanceIndicator.Properties.variables);
		propertiesStep.addStep(BsmViewsRepository.BsmPerformanceIndicator.Properties.objectives);
		propertiesStep.addStep(BsmViewsRepository.BsmPerformanceIndicator.Properties.category1);
		propertiesStep.addStep(BsmViewsRepository.BsmPerformanceIndicator.Properties.category2);
		propertiesStep.addStep(BsmViewsRepository.BsmPerformanceIndicator.Properties.category3);
		propertiesStep.addStep(BsmViewsRepository.BsmPerformanceIndicator.Properties.dimension);
		
		
		composer = new PartComposer(bsmPerformanceIndicatorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == BsmViewsRepository.BsmPerformanceIndicator.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmPerformanceIndicator.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmPerformanceIndicator.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmPerformanceIndicator.Properties.unit) {
					return createUnitText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmPerformanceIndicator.Properties.formula) {
					return createFormulaText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredInfo) {
					return createRequiredInfoText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredProcessing) {
					return createRequiredProcessingText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmPerformanceIndicator.Properties.decision) {
					return createDecisionFlatComboViewer(parent, widgetFactory);
				}
				if (key == BsmViewsRepository.BsmPerformanceIndicator.Properties.variables) {
					return createVariablesReferencesTable(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmPerformanceIndicator.Properties.objectives) {
					return createObjectivesReferencesTable(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmPerformanceIndicator.Properties.category1) {
					return createCategory1Text(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmPerformanceIndicator.Properties.category2) {
					return createCategory2Text(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmPerformanceIndicator.Properties.category3) {
					return createCategory3Text(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmPerformanceIndicator.Properties.dimension) {
					return createDimensionText(widgetFactory, parent);
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
		propertiesSection.setText(BsmMessages.BsmPerformanceIndicatorPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, BsmViewsRepository.BsmPerformanceIndicator.Properties.name, BsmMessages.BsmPerformanceIndicatorPropertiesEditionPart_NameLabel);
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
							BsmPerformanceIndicatorPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmPerformanceIndicator.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmPerformanceIndicator.Properties.name,
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
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmPerformanceIndicatorPropertiesEditionPartForm.this, BsmViewsRepository.BsmPerformanceIndicator.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, BsmViewsRepository.BsmPerformanceIndicator.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmPerformanceIndicator.Properties.name, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmPerformanceIndicator.Properties.description, BsmMessages.BsmPerformanceIndicatorPropertiesEditionPart_DescriptionLabel);
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
							BsmPerformanceIndicatorPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmPerformanceIndicator.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmPerformanceIndicator.Properties.description,
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
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmPerformanceIndicatorPropertiesEditionPartForm.this, BsmViewsRepository.BsmPerformanceIndicator.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, BsmViewsRepository.BsmPerformanceIndicator.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmPerformanceIndicator.Properties.description, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createUnitText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmPerformanceIndicator.Properties.unit, BsmMessages.BsmPerformanceIndicatorPropertiesEditionPart_UnitLabel);
		unit = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		unit.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData unitData = new GridData(GridData.FILL_HORIZONTAL);
		unit.setLayoutData(unitData);
		unit.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmPerformanceIndicatorPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmPerformanceIndicator.Properties.unit,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, unit.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmPerformanceIndicator.Properties.unit,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, unit.getText()));
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
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		unit.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmPerformanceIndicatorPropertiesEditionPartForm.this, BsmViewsRepository.BsmPerformanceIndicator.Properties.unit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, unit.getText()));
				}
			}
		});
		EditingUtils.setID(unit, BsmViewsRepository.BsmPerformanceIndicator.Properties.unit);
		EditingUtils.setEEFtype(unit, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmPerformanceIndicator.Properties.unit, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createFormulaText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmPerformanceIndicator.Properties.formula, BsmMessages.BsmPerformanceIndicatorPropertiesEditionPart_FormulaLabel);
		formula = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		formula.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData formulaData = new GridData(GridData.FILL_HORIZONTAL);
		formula.setLayoutData(formulaData);
		formula.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmPerformanceIndicatorPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmPerformanceIndicator.Properties.formula,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, formula.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmPerformanceIndicator.Properties.formula,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, formula.getText()));
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
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		formula.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmPerformanceIndicatorPropertiesEditionPartForm.this, BsmViewsRepository.BsmPerformanceIndicator.Properties.formula, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, formula.getText()));
				}
			}
		});
		EditingUtils.setID(formula, BsmViewsRepository.BsmPerformanceIndicator.Properties.formula);
		EditingUtils.setEEFtype(formula, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmPerformanceIndicator.Properties.formula, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRequiredInfoText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredInfo, BsmMessages.BsmPerformanceIndicatorPropertiesEditionPart_RequiredInfoLabel);
		requiredInfo = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		requiredInfo.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData requiredInfoData = new GridData(GridData.FILL_HORIZONTAL);
		requiredInfo.setLayoutData(requiredInfoData);
		requiredInfo.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmPerformanceIndicatorPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredInfo,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, requiredInfo.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredInfo,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, requiredInfo.getText()));
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
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		requiredInfo.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmPerformanceIndicatorPropertiesEditionPartForm.this, BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredInfo, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, requiredInfo.getText()));
				}
			}
		});
		EditingUtils.setID(requiredInfo, BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredInfo);
		EditingUtils.setEEFtype(requiredInfo, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredInfo, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createRequiredProcessingText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredProcessing, BsmMessages.BsmPerformanceIndicatorPropertiesEditionPart_RequiredProcessingLabel);
		requiredProcessing = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		requiredProcessing.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData requiredProcessingData = new GridData(GridData.FILL_HORIZONTAL);
		requiredProcessing.setLayoutData(requiredProcessingData);
		requiredProcessing.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmPerformanceIndicatorPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredProcessing,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, requiredProcessing.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredProcessing,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, requiredProcessing.getText()));
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
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		requiredProcessing.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmPerformanceIndicatorPropertiesEditionPartForm.this, BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredProcessing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, requiredProcessing.getText()));
				}
			}
		});
		EditingUtils.setID(requiredProcessing, BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredProcessing);
		EditingUtils.setEEFtype(requiredProcessing, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmPerformanceIndicator.Properties.requiredProcessing, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createDecisionFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, BsmViewsRepository.BsmPerformanceIndicator.Properties.decision, BsmMessages.BsmPerformanceIndicatorPropertiesEditionPart_DecisionLabel);
		decision = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmPerformanceIndicator.Properties.decision, BsmViewsRepository.FORM_KIND));
		widgetFactory.adapt(decision);
		decision.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData decisionData = new GridData(GridData.FILL_HORIZONTAL);
		decision.setLayoutData(decisionData);
		decision.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmPerformanceIndicatorPropertiesEditionPartForm.this, BsmViewsRepository.BsmPerformanceIndicator.Properties.decision, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDecision()));
			}

		});
		decision.setID(BsmViewsRepository.BsmPerformanceIndicator.Properties.decision);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmPerformanceIndicator.Properties.decision, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createVariablesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.variables = new ReferencesTable(getDescription(BsmViewsRepository.BsmPerformanceIndicator.Properties.variables, BsmMessages.BsmPerformanceIndicatorPropertiesEditionPart_VariablesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addVariables(); }
			public void handleEdit(EObject element) { editVariables(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveVariables(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromVariables(element); }
			public void navigateTo(EObject element) { }
		});
		this.variables.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmPerformanceIndicator.Properties.variables, BsmViewsRepository.FORM_KIND));
		this.variables.createControls(parent, widgetFactory);
		this.variables.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmPerformanceIndicatorPropertiesEditionPartForm.this, BsmViewsRepository.BsmPerformanceIndicator.Properties.variables, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData variablesData = new GridData(GridData.FILL_HORIZONTAL);
		variablesData.horizontalSpan = 3;
		this.variables.setLayoutData(variablesData);
		this.variables.disableMove();
		variables.setID(BsmViewsRepository.BsmPerformanceIndicator.Properties.variables);
		variables.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addVariables() {
		// Start of user code
		BsmAddVariableToPIDialog dialog = new BsmAddVariableToPIDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), variables.getLabelProvider(), (BsmPerformanceIndicator) ((ReferencesTableSettings)this.variables.getInput()).getSource());		
		dialog.open();
		variables.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveVariables(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmPerformanceIndicatorPropertiesEditionPartForm.this, BsmViewsRepository.BsmPerformanceIndicator.Properties.variables, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		variables.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromVariables(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmPerformanceIndicatorPropertiesEditionPartForm.this, BsmViewsRepository.BsmPerformanceIndicator.Properties.variables, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		variables.refresh();
	}

	/**
	 * 
	 */
	protected void editVariables(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				variables.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createObjectivesReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.objectives = new ReferencesTable(getDescription(BsmViewsRepository.BsmPerformanceIndicator.Properties.objectives, BsmMessages.BsmPerformanceIndicatorPropertiesEditionPart_ObjectivesLabel), new ReferencesTableListener	() {
			public void handleAdd() { addObjectives(); }
			public void handleEdit(EObject element) { editObjectives(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveObjectives(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromObjectives(element); }
			public void navigateTo(EObject element) { }
		});
		this.objectives.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmPerformanceIndicator.Properties.objectives, BsmViewsRepository.FORM_KIND));
		this.objectives.createControls(parent, widgetFactory);
		this.objectives.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmPerformanceIndicatorPropertiesEditionPartForm.this, BsmViewsRepository.BsmPerformanceIndicator.Properties.objectives, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData objectivesData = new GridData(GridData.FILL_HORIZONTAL);
		objectivesData.horizontalSpan = 3;
		this.objectives.setLayoutData(objectivesData);
		this.objectives.disableMove();
		objectives.setID(BsmViewsRepository.BsmPerformanceIndicator.Properties.objectives);
		objectives.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addObjectives() {
		// Start of user code
		BsmAddObjectiveToPIDialog dialog = new BsmAddObjectiveToPIDialog(PlatformUI.getWorkbench().getDisplay().getActiveShell(), objectives.getLabelProvider(), (BsmPerformanceIndicator) ((ReferencesTableSettings)this.objectives.getInput()).getSource());		
		dialog.open();
		objectives.refresh();	
		// End of user code
	}

	/**
	 * 
	 */
	protected void moveObjectives(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmPerformanceIndicatorPropertiesEditionPartForm.this, BsmViewsRepository.BsmPerformanceIndicator.Properties.objectives, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		objectives.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromObjectives(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmPerformanceIndicatorPropertiesEditionPartForm.this, BsmViewsRepository.BsmPerformanceIndicator.Properties.objectives, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		objectives.refresh();
	}

	/**
	 * 
	 */
	protected void editObjectives(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				objectives.refresh();
			}
		}
	}

	
	protected Composite createCategory1Text(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmPerformanceIndicator.Properties.category1, BsmMessages.BsmPerformanceIndicatorPropertiesEditionPart_Category1Label);
		category1 = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		category1.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData category1Data = new GridData(GridData.FILL_HORIZONTAL);
		category1.setLayoutData(category1Data);
		category1.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmPerformanceIndicatorPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmPerformanceIndicator.Properties.category1,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category1.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmPerformanceIndicator.Properties.category1,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, category1.getText()));
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
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		category1.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmPerformanceIndicatorPropertiesEditionPartForm.this, BsmViewsRepository.BsmPerformanceIndicator.Properties.category1, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category1.getText()));
				}
			}
		});
		EditingUtils.setID(category1, BsmViewsRepository.BsmPerformanceIndicator.Properties.category1);
		EditingUtils.setEEFtype(category1, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmPerformanceIndicator.Properties.category1, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCategory2Text(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmPerformanceIndicator.Properties.category2, BsmMessages.BsmPerformanceIndicatorPropertiesEditionPart_Category2Label);
		category2 = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		category2.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData category2Data = new GridData(GridData.FILL_HORIZONTAL);
		category2.setLayoutData(category2Data);
		category2.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmPerformanceIndicatorPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmPerformanceIndicator.Properties.category2,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category2.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmPerformanceIndicator.Properties.category2,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, category2.getText()));
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
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		category2.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmPerformanceIndicatorPropertiesEditionPartForm.this, BsmViewsRepository.BsmPerformanceIndicator.Properties.category2, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category2.getText()));
				}
			}
		});
		EditingUtils.setID(category2, BsmViewsRepository.BsmPerformanceIndicator.Properties.category2);
		EditingUtils.setEEFtype(category2, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmPerformanceIndicator.Properties.category2, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCategory3Text(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmPerformanceIndicator.Properties.category3, BsmMessages.BsmPerformanceIndicatorPropertiesEditionPart_Category3Label);
		category3 = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		category3.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData category3Data = new GridData(GridData.FILL_HORIZONTAL);
		category3.setLayoutData(category3Data);
		category3.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmPerformanceIndicatorPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmPerformanceIndicator.Properties.category3,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category3.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmPerformanceIndicator.Properties.category3,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, category3.getText()));
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
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		category3.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmPerformanceIndicatorPropertiesEditionPartForm.this, BsmViewsRepository.BsmPerformanceIndicator.Properties.category3, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, category3.getText()));
				}
			}
		});
		EditingUtils.setID(category3, BsmViewsRepository.BsmPerformanceIndicator.Properties.category3);
		EditingUtils.setEEFtype(category3, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmPerformanceIndicator.Properties.category3, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDimensionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmPerformanceIndicator.Properties.dimension, BsmMessages.BsmPerformanceIndicatorPropertiesEditionPart_DimensionLabel);
		dimension = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		dimension.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData dimensionData = new GridData(GridData.FILL_HORIZONTAL);
		dimension.setLayoutData(dimensionData);
		dimension.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmPerformanceIndicatorPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmPerformanceIndicator.Properties.dimension,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dimension.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmPerformanceIndicator.Properties.dimension,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, dimension.getText()));
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
									BsmPerformanceIndicatorPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		dimension.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmPerformanceIndicatorPropertiesEditionPartForm.this, BsmViewsRepository.BsmPerformanceIndicator.Properties.dimension, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, dimension.getText()));
				}
			}
		});
		EditingUtils.setID(dimension, BsmViewsRepository.BsmPerformanceIndicator.Properties.dimension);
		EditingUtils.setEEFtype(dimension, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmPerformanceIndicator.Properties.dimension, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#getUnit()
	 * 
	 */
	public String getUnit() {
		return unit.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#setUnit(String newValue)
	 * 
	 */
	public void setUnit(String newValue) {
		if (newValue != null) {
			unit.setText(newValue);
		} else {
			unit.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#getFormula()
	 * 
	 */
	public String getFormula() {
		return formula.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#setFormula(String newValue)
	 * 
	 */
	public void setFormula(String newValue) {
		if (newValue != null) {
			formula.setText(newValue);
		} else {
			formula.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#getRequiredInfo()
	 * 
	 */
	public String getRequiredInfo() {
		return requiredInfo.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#setRequiredInfo(String newValue)
	 * 
	 */
	public void setRequiredInfo(String newValue) {
		if (newValue != null) {
			requiredInfo.setText(newValue);
		} else {
			requiredInfo.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#getRequiredProcessing()
	 * 
	 */
	public String getRequiredProcessing() {
		return requiredProcessing.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#setRequiredProcessing(String newValue)
	 * 
	 */
	public void setRequiredProcessing(String newValue) {
		if (newValue != null) {
			requiredProcessing.setText(newValue);
		} else {
			requiredProcessing.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#getDecision()
	 * 
	 */
	public EObject getDecision() {
		if (decision.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) decision.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#initDecision(EObjectFlatComboSettings)
	 */
	public void initDecision(EObjectFlatComboSettings settings) {
		decision.setInput(settings);
		if (current != null) {
			decision.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#setDecision(EObject newValue)
	 * 
	 */
	public void setDecision(EObject newValue) {
		if (newValue != null) {
			decision.setSelection(new StructuredSelection(newValue));
		} else {
			decision.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#setDecisionButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDecisionButtonMode(ButtonsModeEnum newValue) {
		decision.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#addFilterDecision(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecision(ViewerFilter filter) {
		decision.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#addBusinessFilterDecision(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecision(ViewerFilter filter) {
		decision.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#initVariables(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initVariables(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		variables.setContentProvider(contentProvider);
		variables.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#updateVariables()
	 * 
	 */
	public void updateVariables() {
	variables.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#addFilterVariables(ViewerFilter filter)
	 * 
	 */
	public void addFilterToVariables(ViewerFilter filter) {
		variablesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#addBusinessFilterVariables(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToVariables(ViewerFilter filter) {
		variablesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#isContainedInVariablesTable(EObject element)
	 * 
	 */
	public boolean isContainedInVariablesTable(EObject element) {
		return ((ReferencesTableSettings)variables.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#initObjectives(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initObjectives(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		objectives.setContentProvider(contentProvider);
		objectives.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#updateObjectives()
	 * 
	 */
	public void updateObjectives() {
	objectives.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#addFilterObjectives(ViewerFilter filter)
	 * 
	 */
	public void addFilterToObjectives(ViewerFilter filter) {
		objectivesFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#addBusinessFilterObjectives(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToObjectives(ViewerFilter filter) {
		objectivesBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#isContainedInObjectivesTable(EObject element)
	 * 
	 */
	public boolean isContainedInObjectivesTable(EObject element) {
		return ((ReferencesTableSettings)objectives.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#getCategory1()
	 * 
	 */
	public String getCategory1() {
		return category1.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#setCategory1(String newValue)
	 * 
	 */
	public void setCategory1(String newValue) {
		if (newValue != null) {
			category1.setText(newValue);
		} else {
			category1.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#getCategory2()
	 * 
	 */
	public String getCategory2() {
		return category2.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#setCategory2(String newValue)
	 * 
	 */
	public void setCategory2(String newValue) {
		if (newValue != null) {
			category2.setText(newValue);
		} else {
			category2.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#getCategory3()
	 * 
	 */
	public String getCategory3() {
		return category3.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#setCategory3(String newValue)
	 * 
	 */
	public void setCategory3(String newValue) {
		if (newValue != null) {
			category3.setText(newValue);
		} else {
			category3.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#getDimension()
	 * 
	 */
	public String getDimension() {
		return dimension.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmPerformanceIndicatorPropertiesEditionPart#setDimension(String newValue)
	 * 
	 */
	public void setDimension(String newValue) {
		if (newValue != null) {
			dimension.setText(newValue);
		} else {
			dimension.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return BsmMessages.BsmPerformanceIndicator_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
