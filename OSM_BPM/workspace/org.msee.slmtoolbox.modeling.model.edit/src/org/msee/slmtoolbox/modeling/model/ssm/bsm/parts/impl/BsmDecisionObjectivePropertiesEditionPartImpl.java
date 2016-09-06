/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

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
import org.eclipse.emf.eef.runtime.ui.widgets.EObjectFlatComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

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

import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionObjectivePropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmViewsRepository;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.providers.BsmMessages;

// End of user code

/**
 * 
 * 
 */
public class BsmDecisionObjectivePropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, BsmDecisionObjectivePropertiesEditionPart {

	protected Text name;
	protected Text description;
	protected EObjectFlatComboViewer decision;
	protected ReferencesTable performanceIndicators;
	protected List<ViewerFilter> performanceIndicatorsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> performanceIndicatorsFilters = new ArrayList<ViewerFilter>();



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public BsmDecisionObjectivePropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence bsmDecisionObjectiveStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = bsmDecisionObjectiveStep.addStep(BsmViewsRepository.BsmDecisionObjective.Properties.class);
		propertiesStep.addStep(BsmViewsRepository.BsmDecisionObjective.Properties.name);
		propertiesStep.addStep(BsmViewsRepository.BsmDecisionObjective.Properties.description);
		propertiesStep.addStep(BsmViewsRepository.BsmDecisionObjective.Properties.decision);
		propertiesStep.addStep(BsmViewsRepository.BsmDecisionObjective.Properties.performanceIndicators);
		
		
		composer = new PartComposer(bsmDecisionObjectiveStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == BsmViewsRepository.BsmDecisionObjective.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == BsmViewsRepository.BsmDecisionObjective.Properties.name) {
					return createNameText(parent);
				}
				if (key == BsmViewsRepository.BsmDecisionObjective.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == BsmViewsRepository.BsmDecisionObjective.Properties.decision) {
					return createDecisionFlatComboViewer(parent);
				}
				if (key == BsmViewsRepository.BsmDecisionObjective.Properties.performanceIndicators) {
					return createPerformanceIndicatorsAdvancedReferencesTable(parent);
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
		propertiesGroup.setText(BsmMessages.BsmDecisionObjectivePropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecisionObjective.Properties.name, BsmMessages.BsmDecisionObjectivePropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionObjectivePropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecisionObjective.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionObjectivePropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecisionObjective.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, BsmViewsRepository.BsmDecisionObjective.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecisionObjective.Properties.name, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecisionObjective.Properties.description, BsmMessages.BsmDecisionObjectivePropertiesEditionPart_DescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionObjectivePropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecisionObjective.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionObjectivePropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecisionObjective.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, BsmViewsRepository.BsmDecisionObjective.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecisionObjective.Properties.description, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createDecisionFlatComboViewer(Composite parent) {
		createDescription(parent, BsmViewsRepository.BsmDecisionObjective.Properties.decision, BsmMessages.BsmDecisionObjectivePropertiesEditionPart_DecisionLabel);
		decision = new EObjectFlatComboViewer(parent, !propertiesEditionComponent.isRequired(BsmViewsRepository.BsmDecisionObjective.Properties.decision, BsmViewsRepository.SWT_KIND));
		decision.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		decision.addSelectionChangedListener(new ISelectionChangedListener() {

			public void selectionChanged(SelectionChangedEvent event) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionObjectivePropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecisionObjective.Properties.decision, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SET, null, getDecision()));
			}

		});
		GridData decisionData = new GridData(GridData.FILL_HORIZONTAL);
		decision.setLayoutData(decisionData);
		decision.setID(BsmViewsRepository.BsmDecisionObjective.Properties.decision);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecisionObjective.Properties.decision, BsmViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createPerformanceIndicatorsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(BsmViewsRepository.BsmDecisionObjective.Properties.performanceIndicators, BsmMessages.BsmDecisionObjectivePropertiesEditionPart_PerformanceIndicatorsLabel);		 
		this.performanceIndicators = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addPerformanceIndicators(); }
			public void handleEdit(EObject element) { editPerformanceIndicators(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { movePerformanceIndicators(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromPerformanceIndicators(element); }
			public void navigateTo(EObject element) { }
		});
		this.performanceIndicators.setHelpText(propertiesEditionComponent.getHelpContent(BsmViewsRepository.BsmDecisionObjective.Properties.performanceIndicators, BsmViewsRepository.SWT_KIND));
		this.performanceIndicators.createControls(parent);
		this.performanceIndicators.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionObjectivePropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecisionObjective.Properties.performanceIndicators, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData performanceIndicatorsData = new GridData(GridData.FILL_HORIZONTAL);
		performanceIndicatorsData.horizontalSpan = 3;
		this.performanceIndicators.setLayoutData(performanceIndicatorsData);
		this.performanceIndicators.disableMove();
		performanceIndicators.setID(BsmViewsRepository.BsmDecisionObjective.Properties.performanceIndicators);
		performanceIndicators.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addPerformanceIndicators() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(performanceIndicators.getInput(), performanceIndicatorsFilters, performanceIndicatorsBusinessFilters,
		"performanceIndicators", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionObjectivePropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecisionObjective.Properties.performanceIndicators,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				performanceIndicators.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void movePerformanceIndicators(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionObjectivePropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecisionObjective.Properties.performanceIndicators, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		performanceIndicators.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromPerformanceIndicators(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(BsmDecisionObjectivePropertiesEditionPartImpl.this, BsmViewsRepository.BsmDecisionObjective.Properties.performanceIndicators, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		performanceIndicators.refresh();
	}

	/**
	 * 
	 */
	protected void editPerformanceIndicators(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				performanceIndicators.refresh();
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionObjectivePropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionObjectivePropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionObjectivePropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionObjectivePropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionObjectivePropertiesEditionPart#getDecision()
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionObjectivePropertiesEditionPart#initDecision(EObjectFlatComboSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionObjectivePropertiesEditionPart#setDecision(EObject newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionObjectivePropertiesEditionPart#setDecisionButtonMode(ButtonsModeEnum newValue)
	 */
	public void setDecisionButtonMode(ButtonsModeEnum newValue) {
		decision.setButtonMode(newValue);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionObjectivePropertiesEditionPart#addFilterDecision(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDecision(ViewerFilter filter) {
		decision.addFilter(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionObjectivePropertiesEditionPart#addBusinessFilterDecision(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDecision(ViewerFilter filter) {
		decision.addBusinessRuleFilter(filter);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionObjectivePropertiesEditionPart#initPerformanceIndicators(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initPerformanceIndicators(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		performanceIndicators.setContentProvider(contentProvider);
		performanceIndicators.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionObjectivePropertiesEditionPart#updatePerformanceIndicators()
	 * 
	 */
	public void updatePerformanceIndicators() {
	performanceIndicators.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionObjectivePropertiesEditionPart#addFilterPerformanceIndicators(ViewerFilter filter)
	 * 
	 */
	public void addFilterToPerformanceIndicators(ViewerFilter filter) {
		performanceIndicatorsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionObjectivePropertiesEditionPart#addBusinessFilterPerformanceIndicators(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToPerformanceIndicators(ViewerFilter filter) {
		performanceIndicatorsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.parts.BsmDecisionObjectivePropertiesEditionPart#isContainedInPerformanceIndicatorsTable(EObject element)
	 * 
	 */
	public boolean isContainedInPerformanceIndicatorsTable(EObject element) {
		return ((ReferencesTableSettings)performanceIndicators.getInput()).contains(element);
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return BsmMessages.BsmDecisionObjective_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
