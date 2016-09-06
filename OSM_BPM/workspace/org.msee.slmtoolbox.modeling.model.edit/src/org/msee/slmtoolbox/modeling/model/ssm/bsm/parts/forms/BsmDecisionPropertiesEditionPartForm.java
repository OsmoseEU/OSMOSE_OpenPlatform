/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.forms;

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
import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
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
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmDecisionPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, BsmDecisionPropertiesEditionPart {

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
	 * For {@link ISection} use only.
	 */
	public BsmDecisionPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmDecisionPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.type) {
					return createTypeEMFComboViewer(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.horizon) {
					return createHorizonText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.period) {
					return createPeriodText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.constraint) {
					return createConstraintText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.objective) {
					return createObjectiveText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.variable) {
					return createVariableText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.event) {
					return createEventText(widgetFactory, parent);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.decisionStructure) {
					return createDecisionStructureFlatComboViewer(parent, widgetFactory);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.organization) {
					return createOrganizationFlatComboViewer(parent, widgetFactory);
				}
				if (key == BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters) {
					return createGgDecisionCentersReferencesTable(widgetFactory, parent);
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
		propertiesSection.setText(BsmMessages.BsmDecisionPropertiesEditionPart_PropertiesGroupLabel);
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
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.name, BsmMessages.BsmDecisionPropertiesEditionPart_NameLabel);
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
							BsmDecisionPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmDecision.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmDecisionPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmDecision.Properties.name,
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
									BsmDecisionPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartForm.this, BsmViewsRepository.BsmDecision.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, BsmViewsRepository.BsmDecision.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.name, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createTypeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartForm.this, BsmViewsRepository.BsmDecision.Properties.type, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getType()));
			}

		});
		type.setID(BsmViewsRepository.BsmDecision.Properties.type);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.type, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createHorizonText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.horizon, BsmMessages.BsmDecisionPropertiesEditionPart_HorizonLabel);
		horizon = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		horizon.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData horizonData = new GridData(GridData.FILL_HORIZONTAL);
		horizon.setLayoutData(horizonData);
		horizon.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmDecisionPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmDecision.Properties.horizon,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, horizon.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmDecisionPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmDecision.Properties.horizon,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, horizon.getText()));
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
									BsmDecisionPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		horizon.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartForm.this, BsmViewsRepository.BsmDecision.Properties.horizon, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, horizon.getText()));
				}
			}
		});
		EditingUtils.setID(horizon, BsmViewsRepository.BsmDecision.Properties.horizon);
		EditingUtils.setEEFtype(horizon, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.horizon, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createPeriodText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.period, BsmMessages.BsmDecisionPropertiesEditionPart_PeriodLabel);
		period = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		period.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData periodData = new GridData(GridData.FILL_HORIZONTAL);
		period.setLayoutData(periodData);
		period.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmDecisionPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmDecision.Properties.period,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, period.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmDecisionPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmDecision.Properties.period,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, period.getText()));
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
									BsmDecisionPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		period.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartForm.this, BsmViewsRepository.BsmDecision.Properties.period, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, period.getText()));
				}
			}
		});
		EditingUtils.setID(period, BsmViewsRepository.BsmDecision.Properties.period);
		EditingUtils.setEEFtype(period, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.period, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createConstraintText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.constraint, BsmMessages.BsmDecisionPropertiesEditionPart_ConstraintLabel);
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
							BsmDecisionPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmDecision.Properties.constraint,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmDecisionPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmDecision.Properties.constraint,
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
									BsmDecisionPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartForm.this, BsmViewsRepository.BsmDecision.Properties.constraint, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, constraint.getText()));
				}
			}
		});
		EditingUtils.setID(constraint, BsmViewsRepository.BsmDecision.Properties.constraint);
		EditingUtils.setEEFtype(constraint, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.constraint, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createObjectiveText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.objective, BsmMessages.BsmDecisionPropertiesEditionPart_ObjectiveLabel);
		objective = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		objective.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData objectiveData = new GridData(GridData.FILL_HORIZONTAL);
		objective.setLayoutData(objectiveData);
		objective.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmDecisionPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmDecision.Properties.objective,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, objective.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmDecisionPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmDecision.Properties.objective,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, objective.getText()));
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
									BsmDecisionPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		objective.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartForm.this, BsmViewsRepository.BsmDecision.Properties.objective, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, objective.getText()));
				}
			}
		});
		EditingUtils.setID(objective, BsmViewsRepository.BsmDecision.Properties.objective);
		EditingUtils.setEEFtype(objective, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.objective, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createVariableText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.variable, BsmMessages.BsmDecisionPropertiesEditionPart_VariableLabel);
		variable = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		variable.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData variableData = new GridData(GridData.FILL_HORIZONTAL);
		variable.setLayoutData(variableData);
		variable.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmDecisionPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmDecision.Properties.variable,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, variable.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmDecisionPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmDecision.Properties.variable,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, variable.getText()));
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
									BsmDecisionPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		variable.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartForm.this, BsmViewsRepository.BsmDecision.Properties.variable, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, variable.getText()));
				}
			}
		});
		EditingUtils.setID(variable, BsmViewsRepository.BsmDecision.Properties.variable);
		EditingUtils.setEEFtype(variable, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.variable, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createEventText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.event, BsmMessages.BsmDecisionPropertiesEditionPart_EventLabel);
		event = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		event.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData eventData = new GridData(GridData.FILL_HORIZONTAL);
		event.setLayoutData(eventData);
		event.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							BsmDecisionPropertiesEditionPartForm.this,
							BsmViewsRepository.BsmDecision.Properties.event,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, event.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									BsmDecisionPropertiesEditionPartForm.this,
									BsmViewsRepository.BsmDecision.Properties.event,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, event.getText()));
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
									BsmDecisionPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		event.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartForm.this, BsmViewsRepository.BsmDecision.Properties.event, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, event.getText()));
				}
			}
		});
		EditingUtils.setID(event, BsmViewsRepository.BsmDecision.Properties.event);
		EditingUtils.setEEFtype(event, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.event, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createDecisionStructureFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.decisionStructure, BsmMessages.BsmDecisionPropertiesEditionPart_DecisionStructureLabel);
		decisionStructure = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmDecision.Properties.decisionStructure, BsmViewsRepository.FORM_KIND));
		widgetFactory.adapt(decisionStructure);
		decisionStructure.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		GridData decisionStructureData = new GridData(GridData.FILL_HORIZONTAL);
		decisionStructure.setLayoutData(decisionStructureData);
		decisionStructure.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartForm.this, BsmViewsRepository.BsmDecision.Properties.decisionStructure, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getDecisionStructure()));
			}

		});
		decisionStructure.setID(BsmViewsRepository.BsmDecision.Properties.decisionStructure);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.decisionStructure, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * @param widgetFactory factory to use to instanciante widget of the form
	 * 
	 */
	protected Composite createOrganizationFlatComboViewer(Composite parent, FormToolkit widgetFactory) {
		createDescription(parent, BsmViewsRepository.BsmDecision.Properties.organization, BsmMessages.BsmDecisionPropertiesEditionPart_OrganizationLabel);
		organization = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmDecision.Properties.organization, BsmViewsRepository.FORM_KIND));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartForm.this, BsmViewsRepository.BsmDecision.Properties.organization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOrganization()));
			}

		});
		organization.setID(BsmViewsRepository.BsmDecision.Properties.organization);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.organization, BsmViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createGgDecisionCentersReferencesTable(FormToolkit widgetFactory, Composite parent) {
		this.ggDecisionCenters = new ReferencesTable(getDescription(BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters, BsmMessages.BsmDecisionPropertiesEditionPart_GgDecisionCentersLabel), new ReferencesTableListener	() {
			public void handleAdd() { addGgDecisionCenters(); }
			public void handleEdit(EObject element) { editGgDecisionCenters(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveGgDecisionCenters(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromGgDecisionCenters(element); }
			public void navigateTo(EObject element) { }
		});
		this.ggDecisionCenters.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters, BsmViewsRepository.FORM_KIND));
		this.ggDecisionCenters.createControls(parent, widgetFactory);
		this.ggDecisionCenters.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartForm.this, BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartForm.this, BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartForm.this, BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		ggDecisionCenters.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromGgDecisionCenters(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionPropertiesEditionPartForm.this, BsmViewsRepository.BsmDecision.Properties.ggDecisionCenters, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
