/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.impl;

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
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts.GgLevelPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.providers.CoreElementsMessages;

// End of user code

/**
 * 
 * 
 */
public class GgLevelPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, GgLevelPropertiesEditionPart {

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
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public GgLevelPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence ggLevelStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = ggLevelStep.addStep(CoreElementsViewsRepository.GgLevel.Properties.class);
		propertiesStep.addStep(CoreElementsViewsRepository.GgLevel.Properties.name);
		propertiesStep.addStep(CoreElementsViewsRepository.GgLevel.Properties.code);
		propertiesStep.addStep(CoreElementsViewsRepository.GgLevel.Properties.description);
		
		
		composer = new PartComposer(ggLevelStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CoreElementsViewsRepository.GgLevel.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CoreElementsViewsRepository.GgLevel.Properties.name) {
					return createNameText(parent);
				}
				if (key == CoreElementsViewsRepository.GgLevel.Properties.code) {
					return createCodeText(parent);
				}
				if (key == CoreElementsViewsRepository.GgLevel.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == CoreElementsViewsRepository.GgLevel.Properties.Horizon.class) {
					//FIXME INVALID CASE INTO template public implementation(editor : ViewElement) in SWT Impl for ViewElement Horizon
				}
				if (key == CoreElementsViewsRepository.GgLevel.Properties.Horizon.hUnit) {
					return createHUnitEMFComboViewer(parent);
				}
				if (key == CoreElementsViewsRepository.GgLevel.Properties.Horizon.hValue) {
					return createHValueText(parent);
				}
				if (key == CoreElementsViewsRepository.GgLevel.Properties.Period.class) {
					//FIXME INVALID CASE INTO template public implementation(editor : ViewElement) in SWT Impl for ViewElement Period
				}
				if (key == CoreElementsViewsRepository.GgLevel.Properties.Period.pUnit) {
					return createPUnitEMFComboViewer(parent);
				}
				if (key == CoreElementsViewsRepository.GgLevel.Properties.Period.pValue) {
					return createPValueText(parent);
				}
				if (key == CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.class) {
					//FIXME INVALID CASE INTO template public implementation(editor : ViewElement) in SWT Impl for ViewElement processingUnit
				}
				if (key == CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puUnit) {
					return createPuUnitEMFComboViewer(parent);
				}
				if (key == CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puValue) {
					return createPuValueText(parent);
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
		propertiesGroup.setText(CoreElementsMessages.GgLevelPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgLevel.Properties.name, CoreElementsMessages.GgLevelPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgLevel.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgLevel.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, CoreElementsViewsRepository.GgLevel.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.name, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCodeText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgLevel.Properties.code, CoreElementsMessages.GgLevelPropertiesEditionPart_CodeLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgLevel.Properties.code, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgLevel.Properties.code, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
				}
			}

		});
		EditingUtils.setID(code, CoreElementsViewsRepository.GgLevel.Properties.code);
		EditingUtils.setEEFtype(code, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.code, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgLevel.Properties.description, CoreElementsMessages.GgLevelPropertiesEditionPart_DescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgLevel.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgLevel.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, CoreElementsViewsRepository.GgLevel.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.description, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	protected Composite createHUnitEMFComboViewer(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgLevel.Properties.Horizon.hUnit, CoreElementsMessages.GgLevelPropertiesEditionPart_HUnitLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgLevel.Properties.Horizon.hUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getHUnit()));
			}

		});
		hUnit.setID(CoreElementsViewsRepository.GgLevel.Properties.Horizon.hUnit);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.Horizon.hUnit, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createHValueText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgLevel.Properties.Horizon.hValue, CoreElementsMessages.GgLevelPropertiesEditionPart_HValueLabel);
		hValue = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData hValueData = new GridData(GridData.FILL_HORIZONTAL);
		hValue.setLayoutData(hValueData);
		hValue.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgLevel.Properties.Horizon.hValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, hValue.getText()));
			}

		});
		hValue.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgLevel.Properties.Horizon.hValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, hValue.getText()));
				}
			}

		});
		EditingUtils.setID(hValue, CoreElementsViewsRepository.GgLevel.Properties.Horizon.hValue);
		EditingUtils.setEEFtype(hValue, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.Horizon.hValue, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

//FIXME INVALID CASE INTO template public additionalImplementation(editor : ViewElement, pec : PropertiesEditionComponent, inputPEC : PropertiesEditionComponent) in SWT Impl for ViewElement Period

	
	protected Composite createPUnitEMFComboViewer(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgLevel.Properties.Period.pUnit, CoreElementsMessages.GgLevelPropertiesEditionPart_PUnitLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgLevel.Properties.Period.pUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPUnit()));
			}

		});
		pUnit.setID(CoreElementsViewsRepository.GgLevel.Properties.Period.pUnit);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.Period.pUnit, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPValueText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgLevel.Properties.Period.pValue, CoreElementsMessages.GgLevelPropertiesEditionPart_PValueLabel);
		pValue = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData pValueData = new GridData(GridData.FILL_HORIZONTAL);
		pValue.setLayoutData(pValueData);
		pValue.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgLevel.Properties.Period.pValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, pValue.getText()));
			}

		});
		pValue.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgLevel.Properties.Period.pValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, pValue.getText()));
				}
			}

		});
		EditingUtils.setID(pValue, CoreElementsViewsRepository.GgLevel.Properties.Period.pValue);
		EditingUtils.setEEFtype(pValue, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.Period.pValue, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

//FIXME INVALID CASE INTO template public additionalImplementation(editor : ViewElement, pec : PropertiesEditionComponent, inputPEC : PropertiesEditionComponent) in SWT Impl for ViewElement processingUnit

	
	protected Composite createPuUnitEMFComboViewer(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puUnit, CoreElementsMessages.GgLevelPropertiesEditionPart_PuUnitLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puUnit, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getPuUnit()));
			}

		});
		puUnit.setID(CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puUnit);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puUnit, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPuValueText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puValue, CoreElementsMessages.GgLevelPropertiesEditionPart_PuValueLabel);
		puValue = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData puValueData = new GridData(GridData.FILL_HORIZONTAL);
		puValue.setLayoutData(puValueData);
		puValue.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, puValue.getText()));
			}

		});
		puValue.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(GgLevelPropertiesEditionPartImpl.this, CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puValue, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, puValue.getText()));
				}
			}

		});
		EditingUtils.setID(puValue, CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puValue);
		EditingUtils.setEEFtype(puValue, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.GgLevel.Properties.ProcessingUnit.puValue, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
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
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CoreElementsMessages.GgLevel_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
