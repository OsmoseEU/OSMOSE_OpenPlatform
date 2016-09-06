/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;
import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;
import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;
import org.eclipse.emf.eef.runtime.context.impl.EObjectPropertiesEditionContext;
import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;
import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;
import org.eclipse.emf.eef.runtime.policies.PropertiesEditingPolicy;
import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;
import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;
import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmDecisionPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, BsmDecisionPropertiesEditionPart {

	protected Text name;
	protected EMFComboViewer type;
	protected Text horizon;
	protected Text period;
	protected Text constraint;
	protected Text objective;
	protected Text variable;
	protected Text event;
	protected EObjectFlatComboViewer decisionStructure;
	protected EObjectFlatComboViewer organization;
	protected ReferencesTable ggDecisionCenters;
	protected List<ViewerFilter> ggDecisionCentersBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> ggDecisionCentersFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmDecisionPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence bsmDecisionStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = bsmDecisionStep.addStep(BsmViewsRepository.BsmDecision.Properties.class);
		propertiesStep.addStep(BsmViewsRepository.BsmDecision.Properties.name);
		propertiesStep.addStep(BsmViewsRepository.BsmDecision.Properties.type);
		propertiesStep.addStep(BsmViewsRepository.BsmDecision.Properties.horizon);
		propertiesStep.addStep(BsmViewsRepository.BsmDecision.Properties.period);
		propertiesStep.addStep(BsmViewsRepository.BsmDecision.Properties.constraint);
		propertiesStep.addStep(BsmViewsRepository.BsmDecision.Properties.objective);
		propertiesStep.addStep(BsmViewsRepository.BsmDecision.Properties.variable);
		propertiesStep.addStep(BsmViewsRepository.BsmDecision.Properties.event);
		propertiesStep.addStep(BsmViewsRepository.BsmDecision.Properties.decisionStructure);
		propertiesStep.addStep(BsmViewsRepository.BsmDecision.Properties.organization);
		propertiesStep.addStep(BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters);
		
		
		composer = new PartComposer(bsmDecisionStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == BsmViewsRepository.BsmDecision.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.name) {
					return createNameText(parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.type) {
					return createTypeEMFComboViewer(parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.horizon) {
					return createHorizonText(parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.period) {
					return createPeriodText(parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.constraint) {
					return createConstraintText(parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.objective) {
					return createObjectiveText(parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.variable) {
					return createVariableText(parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.event) {
					return createEventText(parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.decisionStructure) {
					return createDecisionStructureFlatComboViewer(parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.organization) {
					return createOrganizationFlatComboViewer(parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters) {
					return createGgDecisionCentersAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(BsmMessages.BsmDecisionPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.name, BsmMessages.BsmDecisionPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, BsmViewsRepository.BsmDecision.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.name, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeEMFComboViewer(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.type, BsmMessages.BsmDecisionPropertiesEditionPart_TypeLabel);
		type = new EMFComboViewer(parent);
		type.setContentProvider(new ArrayContentProvider());
		type.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData typeData = new GridData(GridData.FILL_HORIZONTAL);
		type.getCombo().setLayoutData(typeData);
		type.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		type.setID(BsmViewsRepository.BsmDecision.Properties.type);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.type, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createHorizonText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.horizon, BsmMessages.BsmDecisionPropertiesEditionPart_HorizonLabel);
		horizon = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData horizonData = new GridData(GridData.FILL_HORIZONTAL);
		horizon.setLayoutData(horizonData);
		horizon.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.horizon, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, horizon.getText()));
			}

		});
		horizon.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.horizon, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, horizon.getText()));
				}
			}

		});
		EditingUtils.setID(horizon, BsmViewsRepository.BsmDecision.Properties.horizon);
		EditingUtils.setEEFtype(horizon, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.horizon, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPeriodText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.period, BsmMessages.BsmDecisionPropertiesEditionPart_PeriodLabel);
		period = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData periodData = new GridData(GridData.FILL_HORIZONTAL);
		period.setLayoutData(periodData);
		period.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.period, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, period.getText()));
			}

		});
		period.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.period, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, period.getText()));
				}
			}

		});
		EditingUtils.setID(period, BsmViewsRepository.BsmDecision.Properties.period);
		EditingUtils.setEEFtype(period, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.period, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConstraintText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.constraint, BsmMessages.BsmDecisionPropertiesEditionPart_ConstraintLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
				}
			}

		});
		EditingUtils.setID(constraint, BsmViewsRepository.BsmDecision.Properties.constraint);
		EditingUtils.setEEFtype(constraint, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.constraint, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createObjectiveText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.objective, BsmMessages.BsmDecisionPropertiesEditionPart_ObjectiveLabel);
		objective = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData objectiveData = new GridData(GridData.FILL_HORIZONTAL);
		objective.setLayoutData(objectiveData);
		objective.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.objective, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, objective.getText()));
			}

		});
		objective.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.objective, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, objective.getText()));
				}
			}

		});
		EditingUtils.setID(objective, BsmViewsRepository.BsmDecision.Properties.objective);
		EditingUtils.setEEFtype(objective, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.objective, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createVariableText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.variable, BsmMessages.BsmDecisionPropertiesEditionPart_VariableLabel);
		variable = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData variableData = new GridData(GridData.FILL_HORIZONTAL);
		variable.setLayoutData(variableData);
		variable.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.variable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, variable.getText()));
			}

		});
		variable.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.variable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, variable.getText()));
				}
			}

		});
		EditingUtils.setID(variable, BsmViewsRepository.BsmDecision.Properties.variable);
		EditingUtils.setEEFtype(variable, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.variable, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createEventText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.event, BsmMessages.BsmDecisionPropertiesEditionPart_EventLabel);
		event = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData eventData = new GridData(GridData.FILL_HORIZONTAL);
		event.setLayoutData(eventData);
		event.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.event, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, event.getText()));
			}

		});
		event.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.event, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, event.getText()));
				}
			}

		});
		EditingUtils.setID(event, BsmViewsRepository.BsmDecision.Properties.event);
		EditingUtils.setEEFtype(event, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.event, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createDecisionStructureFlatComboViewer(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.decisionStructure, BsmMessages.BsmDecisionPropertiesEditionPart_DecisionStructureLabel);
		decisionStructure = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmDecision.Properties.decisionStructure, BsmViewsRepository.SWT_KIND));
		decisionStructure.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		decisionStructure.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.decisionStructure, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getDecisionStructure()));
			}

		});
		GridData decisionStructureData = new GridData(GridData.FILL_HORIZONTAL);
		decisionStructure.setLayoutData(decisionStructureData);
		decisionStructure.setID(BsmViewsRepository.BsmDecision.Properties.decisionStructure);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.decisionStructure, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createOrganizationFlatComboViewer(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.organization, BsmMessages.BsmDecisionPropertiesEditionPart_OrganizationLabel);
		organization = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmDecision.Properties.organization, BsmViewsRepository.SWT_KIND));
		organization.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		organization.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.organization, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getOrganization()));
			}

		});
		GridData organizationData = new GridData(GridData.FILL_HORIZONTAL);
		organization.setLayoutData(organizationData);
		organization.setID(BsmViewsRepository.BsmDecision.Properties.organization);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.organization, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}


	/**
	 * 
	 */
	protected Composite createGgDecisionCentersAdvancedReferencesTable(Composite parent) {
		String label = getDescription(BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters, BsmMessages.BsmDecisionPropertiesEditionPart_GgDecisionCentersLabel);		 
		this.ggDecisionCenters = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addGgDecisionCenters(); }
			public void handleEdit(EObject element) { editGgDecisionCenters(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGgDecisionCenters(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGgDecisionCenters(element); }
			public void navigateTo(EObject element) { }
		});
		this.ggDecisionCenters.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters, BsmViewsRepository.SWT_KIND));
		this.ggDecisionCenters.createControls(parent);
		this.ggDecisionCenters.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData ggDecisionCentersData = new GridData(GridData.FILL_HORIZONTAL);
		ggDecisionCentersData.horizontalSpan = 3;
		this.ggDecisionCenters.setLayoutData(ggDecisionCentersData);
		this.ggDecisionCenters.disableMove();
		ggDecisionCenters.setID(BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters);
		ggDecisionCenters.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addGgDecisionCenters() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(ggDecisionCenters.getInput(), ggDecisionCentersFilters, ggDecisionCentersBusinessFilters,
		"ggDecisionCenters", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				ggDecisionCenters.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveGgDecisionCenters(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		ggDecisionCenters.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGgDecisionCenters(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		ggDecisionCenters.refresh();
	}

	/**
	 * 
	 */
	protected void editGgDecisionCenters(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				ggDecisionCenters.refresh();
			}
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#getType()
	 * 
	 */
	public Enumerator getType() {
		Enumerator selection = (Enumerator) ((StructuredSelection) type.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#initType(Object input, Enumerator current)
	 */
	public void initType(Object input, Enumerator current) {
		type.setInput(input);
		type.modelUpdating(new StructuredSelection(current));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#setType(Enumerator newValue)
	 * 
	 */
	public void setType(Enumerator newValue) {
		type.modelUpdating(new StructuredSelection(newValue));
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#getHorizon()
	 * 
	 */
	public String getHorizon() {
		return horizon.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#setHorizon(String newValue)
	 * 
	 */
	public void setHorizon(String newValue) {
		if (newValue != null) {
			horizon.setText(newValue);
		} else {
			horizon.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#getPeriod()
	 * 
	 */
	public String getPeriod() {
		return period.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#setPeriod(String newValue)
	 * 
	 */
	public void setPeriod(String newValue) {
		if (newValue != null) {
			period.setText(newValue);
		} else {
			period.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#getConstraint()
	 * 
	 */
	public String getConstraint() {
		return constraint.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#setConstraint(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#getObjective()
	 * 
	 */
	public String getObjective() {
		return objective.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#setObjective(String newValue)
	 * 
	 */
	public void setObjective(String newValue) {
		if (newValue != null) {
			objective.setText(newValue);
		} else {
			objective.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#getVariable()
	 * 
	 */
	public String getVariable() {
		return variable.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#setVariable(String newValue)
	 * 
	 */
	public void setVariable(String newValue) {
		if (newValue != null) {
			variable.setText(newValue);
		} else {
			variable.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#getEvent()
	 * 
	 */
	public String getEvent() {
		return event.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#setEvent(String newValue)
	 * 
	 */
	public void setEvent(String newValue) {
		if (newValue != null) {
			event.setText(newValue);
		} else {
			event.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#getDecisionStructure()
	 * 
	 */
	public EObject getDecisionStructure() {
		if (decisionStructure.getSelection() instanceof StructuredSelection) {
			Object firstElement = ((StructuredSelection) decisionStructure.getSelection()).getFirstElement();
			if (firstElement instanceof EObject)
				return (EObject) firstElement;
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#initDecisionStructure(EObjectFlatComboSettings)
	 */
	public void initDecisionStructure(EObjectFlatComboSettings settings) {
		decisionStructure.setInput(settings);
		if (current != null) {
			decisionStructure.setSelection(new StructuredSelection(settings.getValue()));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#setDecisionStructure(EObject newValue)
	 * 
	 */
	public void setDecisionStructure(EObject newValue) {
		if (newValue != null) {
			decisionStructure.setSelection(new StructuredSelection(newValue));
		} else {
			decisionStructure.setSelection(new StructuredSelection()); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#setDecisionStructureButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDecisionStructureButtonMode(ButtonsModeEnum newValue) {
		decisionStructure.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#addFilterDecisionStructure(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecisionStructure(ViewerFilter filter) {
		decisionStructure.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#addBusinessFilterDecisionStructure(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecisionStructure(ViewerFilter filter) {
		decisionStructure.addBusinessRuleFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#getOrganization()
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#initOrganization(EObjectFlatComboSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#setOrganization(EObject newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#setOrganizationButtonMode(ButtonsModeEnum newValue)
	 */
	public void setOrganizationButtonMode(ButtonsModeEnum newValue) {
		organization.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#addFilterOrganization(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOrganization(ViewerFilter filter) {
		organization.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#addBusinessFilterOrganization(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOrganization(ViewerFilter filter) {
		organization.addBusinessRuleFilter(filter);
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#initGgDecisionCenters(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initGgDecisionCenters(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		ggDecisionCenters.setContentProvider(contentProvider);
		ggDecisionCenters.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#updateGgDecisionCenters()
	 * 
	 */
	public void updateGgDecisionCenters() {
	ggDecisionCenters.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#addFilterGgDecisionCenters(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGgDecisionCenters(ViewerFilter filter) {
		ggDecisionCentersFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#addBusinessFilterGgDecisionCenters(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGgDecisionCenters(ViewerFilter filter) {
		ggDecisionCentersBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart#isContainedInGgDecisionCentersTable(EObject element)
	 * 
	 */
	public boolean isContainedInGgDecisionCentersTable(EObject element) {
		return ((ReferencesTableSettings)ggDecisionCenters.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return BsmMessages.BsmDecision_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
