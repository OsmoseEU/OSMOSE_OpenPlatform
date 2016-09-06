/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.forms;

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
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.providers.CoreElementsMessages;

// End of user code

/**
 * 
 * 
 */
public class GgLevelPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, GgLevelPropertiesEditionPart {

	protected Text name;
	protected Text code;
	protected Text description;
	protected EMFComboViewer hUnit;
	protected Text hValue;
	protected EMFComboViewer pUnit;
	protected Text pValue;
	protected EMFComboViewer puUnit;
	protected Text puValue;



	/**
	 * For {@link ISection} use only.
	 */
	public GgLevelPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public GgLevelPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence ggLevelStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = ggLevelStep.addStep(CoreElementsViewsRepository.GgLevel.Properties.class);
		propertiesStep.addStep(CoreElementsViewsRepository.GgLevel.Properties.name);
		propertiesStep.addStep(CoreElementsViewsRepository.GgLevel.Properties.code);
		propertiesStep.addStep(CoreElementsViewsRepository.GgLevel.Properties.description);
		CompositionStep horizonStep = propertiesStep.addStep(CoreElementsViewsRepository.GgLevel.Properties.Horizon.class);
		horizonStep.addStep(CoreElementsViewsRepository.GgLevel.Properties.Horizon.hUnit);
		horizonStep.addStep(CoreElementsViewsRepository.GgLevel.Properties.Horizon.hValue);
		
		CompositionStep periodStep = propertiesStep.addStep(CoreElementsViewsRepository.GgLevel.Properties.Period.class);
		periodStep.addStep(CoreElementsViewsRepository.GgLevel.Properties.Period.pUnit);
		periodStep.addStep(CoreElementsViewsRepository.GgLevel.Properties.Period.pValue);
		
		CompositionStep processingUnitStep = propertiesStep.addStep(CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.class);
		processingUnitStep.addStep(CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puUnit);
		processingUnitStep.addStep(CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puValue);
		
		
		composer = new PartComposer(ggLevelStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CoreElementsViewsRepository.GgLevel.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.GgLevel.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.GgLevel.Properties.code) {
					return createCodeText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.GgLevel.Properties.description) {
					return createDescriptionText(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.GgLevel.Properties.Horizon.class) {
					return createHorizon(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.GgLevel.Properties.Period.class) {
					return createPeriod(widgetFactory, parent);
				}
				if (key == CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.class) {
					return createProcessingUnit(widgetFactory, parent);
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
		propertiesSection.setText(CoreElementsMessages.GgLevelPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, CoreElementsViewsRepository.GgLevel.Properties.name, CoreElementsMessages.GgLevelPropertiesEditionPart_NameLabel);
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
							GgLevelPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.GgLevel.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GgLevelPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.GgLevel.Properties.name,
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
									GgLevelPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartForm.this, CoreElementsViewsRepository.GgLevel.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, CoreElementsViewsRepository.GgLevel.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.name, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCodeText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgLevel.Properties.code, CoreElementsMessages.GgLevelPropertiesEditionPart_CodeLabel);
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
							GgLevelPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.GgLevel.Properties.code,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GgLevelPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.GgLevel.Properties.code,
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
									GgLevelPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartForm.this, CoreElementsViewsRepository.GgLevel.Properties.code, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
				}
			}
		});
		EditingUtils.setID(code, CoreElementsViewsRepository.GgLevel.Properties.code);
		EditingUtils.setEEFtype(code, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.code, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgLevel.Properties.description, CoreElementsMessages.GgLevelPropertiesEditionPart_DescriptionLabel);
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
							GgLevelPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.GgLevel.Properties.description,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GgLevelPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.GgLevel.Properties.description,
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
									GgLevelPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartForm.this, CoreElementsViewsRepository.GgLevel.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}
		});
		EditingUtils.setID(description, CoreElementsViewsRepository.GgLevel.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.description, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	// Start of user code
	private Composite createDescriptionForDoubleData(FormToolkit widgetFactory, Composite parent,
			Object editor, String label) {
		createDescription(parent, editor, label);
		Composite compositeValue = widgetFactory.createComposite(parent, parent.getStyle()|SWT.MAX);
		GridLayout  layout = new GridLayout(4,true);
		compositeValue.setLayout(layout);
		return compositeValue;
	}
	// End of user code
	
	// Start of user code for Horizon
	protected Composite createHorizon(FormToolkit widgetFactory, Composite parent) {
		Composite compositeValue = createDescriptionForDoubleData(widgetFactory, parent, CoreElementsViewsRepository.GgLevel.Properties.Horizon.class, "Horizon :");
		
		createHValueText(widgetFactory, compositeValue);
		createHUnitEMFComboViewer(widgetFactory, compositeValue);
		
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.Horizon.class, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}
	
	protected Composite createHUnitEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		hUnit = new EMFComboViewer(parent);
		hUnit.setContentProvider(new ArrayContentProvider());
		hUnit.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData hUnitData = new GridData(GridData.FILL_HORIZONTAL);
		hUnit.getCombo().setLayoutData(hUnitData);
		hUnit.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartForm.this, CoreElementsViewsRepository.GgLevel.Properties.Horizon.hUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getHUnit()));
			}

		});
		hUnit.setID(CoreElementsViewsRepository.GgLevel.Properties.Horizon.hUnit);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.Horizon.hUnit, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createHValueText(FormToolkit widgetFactory, Composite parent) {
		hValue = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		hValue.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData hValueData = new GridData(GridData.FILL_HORIZONTAL);
		hValue.setLayoutData(hValueData);
		hValue.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GgLevelPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.GgLevel.Properties.Horizon.hValue,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, hValue.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GgLevelPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.GgLevel.Properties.Horizon.hValue,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, hValue.getText()));
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
									GgLevelPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		hValue.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartForm.this, CoreElementsViewsRepository.GgLevel.Properties.Horizon.hValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, hValue.getText()));
				}
			}
		});
		EditingUtils.setID(hValue, CoreElementsViewsRepository.GgLevel.Properties.Horizon.hValue);
		EditingUtils.setEEFtype(hValue, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.Horizon.hValue, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}
	// End of user code

	// Start of user code for Period
	protected Composite createPeriod(FormToolkit widgetFactory, Composite parent) {
		Composite compositeValue = createDescriptionForDoubleData(widgetFactory, parent, CoreElementsViewsRepository.GgLevel.Properties.Period.class, "Period :");
		
		createPValueText(widgetFactory, compositeValue);
		createPUnitEMFComboViewer(widgetFactory, compositeValue);
		
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.Period.class, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}
	
	protected Composite createPUnitEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		pUnit = new EMFComboViewer(parent);
		pUnit.setContentProvider(new ArrayContentProvider());
		pUnit.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData pUnitData = new GridData(GridData.FILL_HORIZONTAL);
		pUnit.getCombo().setLayoutData(pUnitData);
		pUnit.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartForm.this, CoreElementsViewsRepository.GgLevel.Properties.Period.pUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPUnit()));
			}

		});
		pUnit.setID(CoreElementsViewsRepository.GgLevel.Properties.Period.pUnit);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.Period.pUnit, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPValueText(FormToolkit widgetFactory, Composite parent) {
		pValue = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		pValue.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData pValueData = new GridData(GridData.FILL_HORIZONTAL);
		pValue.setLayoutData(pValueData);
		pValue.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GgLevelPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.GgLevel.Properties.Period.pValue,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, pValue.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GgLevelPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.GgLevel.Properties.Period.pValue,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, pValue.getText()));
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
									GgLevelPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		pValue.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartForm.this, CoreElementsViewsRepository.GgLevel.Properties.Period.pValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, pValue.getText()));
				}
			}
		});
		EditingUtils.setID(pValue, CoreElementsViewsRepository.GgLevel.Properties.Period.pValue);
		EditingUtils.setEEFtype(pValue, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.Period.pValue, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}
	// End of user code

	// Start of user code for ProcessingUnit
	protected Composite createProcessingUnit(FormToolkit widgetFactory, Composite parent) {
		Composite compositeValue = createDescriptionForDoubleData(widgetFactory, parent, CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.class, "Processing unit :");
				
		createPuValueText(widgetFactory, compositeValue);
		createPuUnitEMFComboViewer(widgetFactory, compositeValue);
		
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.class, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createPuUnitEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		puUnit = new EMFComboViewer(parent);
		puUnit.setContentProvider(new ArrayContentProvider());
		puUnit.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData puUnitData = new GridData(GridData.FILL_HORIZONTAL);
		puUnit.getCombo().setLayoutData(puUnitData);
		puUnit.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartForm.this, CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPuUnit()));
			}

		});
		puUnit.setID(CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puUnit);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puUnit, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPuValueText(FormToolkit widgetFactory, Composite parent) {
		puValue = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		puValue.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData puValueData = new GridData(GridData.FILL_HORIZONTAL);
		puValue.setLayoutData(puValueData);
		puValue.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							GgLevelPropertiesEditionPartForm.this,
							CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puValue,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, puValue.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									GgLevelPropertiesEditionPartForm.this,
									CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puValue,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, puValue.getText()));
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
									GgLevelPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		puValue.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartForm.this, CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, puValue.getText()));
				}
			}
		});
		EditingUtils.setID(puValue, CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puValue);
		EditingUtils.setEEFtype(puValue, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puValue, CoreElementsViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#getCode()
	 * 
	 */
	public String getCode() {
		return code.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#setCode(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#getHUnit()
	 * 
	 */
	public Enumerator getHUnit() {
		Enumerator selection = (Enumerator) ((StructuredSelection) hUnit.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#initHUnit(Object input, Enumerator current)
	 */
	public void initHUnit(Object input, Enumerator current) {
		hUnit.setInput(input);
		hUnit.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#setHUnit(Enumerator newValue)
	 * 
	 */
	public void setHUnit(Enumerator newValue) {
		hUnit.modelUpdating(new StructuredSelection(newValue));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#getHValue()
	 * 
	 */
	public String getHValue() {
		return hValue.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#setHValue(String newValue)
	 * 
	 */
	public void setHValue(String newValue) {
		if (newValue != null) {
			hValue.setText(newValue);
		} else {
			hValue.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#getPUnit()
	 * 
	 */
	public Enumerator getPUnit() {
		Enumerator selection = (Enumerator) ((StructuredSelection) pUnit.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#initPUnit(Object input, Enumerator current)
	 */
	public void initPUnit(Object input, Enumerator current) {
		pUnit.setInput(input);
		pUnit.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#setPUnit(Enumerator newValue)
	 * 
	 */
	public void setPUnit(Enumerator newValue) {
		pUnit.modelUpdating(new StructuredSelection(newValue));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#getPValue()
	 * 
	 */
	public String getPValue() {
		return pValue.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#setPValue(String newValue)
	 * 
	 */
	public void setPValue(String newValue) {
		if (newValue != null) {
			pValue.setText(newValue);
		} else {
			pValue.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#getPuUnit()
	 * 
	 */
	public Enumerator getPuUnit() {
		Enumerator selection = (Enumerator) ((StructuredSelection) puUnit.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#initPuUnit(Object input, Enumerator current)
	 */
	public void initPuUnit(Object input, Enumerator current) {
		puUnit.setInput(input);
		puUnit.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#setPuUnit(Enumerator newValue)
	 * 
	 */
	public void setPuUnit(Enumerator newValue) {
		puUnit.modelUpdating(new StructuredSelection(newValue));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#getPuValue()
	 * 
	 */
	public String getPuValue() {
		return puValue.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart#setPuValue(String newValue)
	 * 
	 */
	public void setPuValue(String newValue) {
		if (newValue != null) {
			puValue.setText(newValue);
		} else {
			puValue.setText(""); //$NON-NLS-1$
		}
	}


	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CoreElementsMessages.GgLevel_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
