/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl;

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

import org.eclipse.emf.eef.runtime.ui.providers.EMFListContentProvider;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;

import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;

import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;

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

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.providers.CoreElementsMessages;

// End of user code

/**
 * 
 * 
 */
public class EaAtomicExtendedActivityPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EaAtomicExtendedActivityPropertiesEditionPart {

	protected Text name;
	protected Text code;
	protected Text description;
	protected Text organization;
	protected ReferencesTable inFlows;
	protected List<ViewerFilter> inFlowsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> inFlowsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable outFlows;
	protected List<ViewerFilter> outFlowsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> outFlowsFilters = new ArrayList<ViewerFilter>();
	protected Text mission;
	protected Text functionalRules;
	protected Text minCost;
	protected Text maxCost;
	protected Text averageCost;
	protected Text minTimeDelay;
	protected Text maxTimeDelay;
	protected Text averageTimeDelay;
	protected Button isStarting;
	protected Button isEnding;
	protected EMFComboViewer osmoseWorld;
	protected Text decompositionCode;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EaAtomicExtendedActivityPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence eaAtomicExtendedActivityStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = eaAtomicExtendedActivityStep.addStep(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.class);
		propertiesStep.addStep(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.name);
		propertiesStep.addStep(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.code);
		propertiesStep.addStep(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.osmoseWorld);
		propertiesStep.addStep(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.decompositionCode);
		propertiesStep.addStep(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.description);
		propertiesStep.addStep(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.organization);
		propertiesStep.addStep(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.inFlows);
		propertiesStep.addStep(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.outFlows);
		propertiesStep.addStep(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.mission);
		propertiesStep.addStep(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.functionalRules);
		propertiesStep.addStep(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.minCost);
		propertiesStep.addStep(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.maxCost);
		propertiesStep.addStep(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.averageCost);
		propertiesStep.addStep(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.minTimeDelay);
		propertiesStep.addStep(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.maxTimeDelay);
		propertiesStep.addStep(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.averageTimeDelay);
		propertiesStep.addStep(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.isStarting);
		propertiesStep.addStep(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.isEnding);
		
		
		composer = new PartComposer(eaAtomicExtendedActivityStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.name) {
					return createNameText(parent);
				}
				if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.code) {
					return createCodeText(parent);
				}
				if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.organization) {
					return createOrganizationText(parent);
				}
				if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.inFlows) {
					return createInFlowsAdvancedReferencesTable(parent);
				}
				if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.outFlows) {
					return createOutFlowsAdvancedReferencesTable(parent);
				}
				if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.mission) {
					return createMissionText(parent);
				}
				if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.functionalRules) {
					return createFunctionalRulesText(parent);
				}
				if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.minCost) {
					return createMinCostText(parent);
				}
				if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.maxCost) {
					return createMaxCostText(parent);
				}
				if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.averageCost) {
					return createAverageCostText(parent);
				}
				if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.minTimeDelay) {
					return createMinTimeDelayText(parent);
				}
				if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.maxTimeDelay) {
					return createMaxTimeDelayText(parent);
				}
				if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.averageTimeDelay) {
					return createAverageTimeDelayText(parent);
				}
				if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.isStarting) {
					return createIsStartingCheckbox(parent);
				}
				if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.isEnding) {
					return createIsEndingCheckbox(parent);
				}
				if (key == CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.osmoseWorld) {
					return createOsmoseWorldEMFComboViewer(parent);
				}
				if (key == CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.decompositionCode) {
					return createDecompositionCodeText(parent);
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
		propertiesGroup.setText(CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.name, CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.name, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCodeText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.code, CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_CodeLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.code, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.code, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
				}
			}

		});
		EditingUtils.setID(code, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.code);
		EditingUtils.setEEFtype(code, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.code, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.description, CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_DescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.description, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * @param parent the parent composite
	 * 
	 */
	protected Composite createOrganizationText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.organization, CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_OrganizationLabel);
		organization = SWTUtils.createScrollableText(parent, SWT.BORDER);
		organization.setEnabled(false);
		organization.setToolTipText(CoreElementsMessages.EaAtomicExtendedActivity_ReadOnly);
		GridData organizationData = new GridData(GridData.FILL_HORIZONTAL);
		organization.setLayoutData(organizationData);
		organization.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.organization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, organization.getText()));
			}

		});
		organization.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.organization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, organization.getText()));
				}
			}

		});
		EditingUtils.setID(organization, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.organization);
		EditingUtils.setEEFtype(organization, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.organization, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createInFlowsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.inFlows, CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_InFlowsLabel);		 
		this.inFlows = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addInFlows(); }
			public void handleEdit(EObject element) { editInFlows(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveInFlows(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromInFlows(element); }
			public void navigateTo(EObject element) { }
		});
		this.inFlows.setHelpText(propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.inFlows, CoreElementsViewsRepository.SWT_KIND));
		this.inFlows.createControls(parent);
		this.inFlows.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.inFlows, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		inFlows.setEnabled(false);
		inFlows.setToolTipText(CoreElementsMessages.EaAtomicExtendedActivity_ReadOnly);
		GridData inFlowsData = new GridData(GridData.FILL_HORIZONTAL);
		inFlowsData.horizontalSpan = 3;
		this.inFlows.setLayoutData(inFlowsData);
		this.inFlows.disableMove();
		inFlows.setID(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.inFlows);
		inFlows.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addInFlows() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(inFlows.getInput(), inFlowsFilters, inFlowsBusinessFilters,
		"inFlows", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.inFlows,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				inFlows.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveInFlows(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.inFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		inFlows.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInFlows(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.inFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		inFlows.refresh();
	}

	/**
	 * 
	 */
	protected void editInFlows(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				inFlows.refresh();
			}
		}
	}

	/**
	 * 
	 */
	protected Composite createOutFlowsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.outFlows, CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_OutFlowsLabel);		 
		this.outFlows = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addOutFlows(); }
			public void handleEdit(EObject element) { editOutFlows(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutFlows(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutFlows(element); }
			public void navigateTo(EObject element) { }
		});
		this.outFlows.setHelpText(propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.outFlows, CoreElementsViewsRepository.SWT_KIND));
		this.outFlows.createControls(parent);
		this.outFlows.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.outFlows, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		outFlows.setEnabled(false);
		outFlows.setToolTipText(CoreElementsMessages.EaAtomicExtendedActivity_ReadOnly);
		GridData outFlowsData = new GridData(GridData.FILL_HORIZONTAL);
		outFlowsData.horizontalSpan = 3;
		this.outFlows.setLayoutData(outFlowsData);
		this.outFlows.disableMove();
		outFlows.setID(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.outFlows);
		outFlows.setEEFType("eef::AdvancedReferencesTable"); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected void addOutFlows() {
		TabElementTreeSelectionDialog dialog = new TabElementTreeSelectionDialog(outFlows.getInput(), outFlowsFilters, outFlowsBusinessFilters,
		"outFlows", propertiesEditionComponent.getEditingContext().getAdapterFactory(), current.eResource()) {
			@Override
			public void process(IStructuredSelection selection) {
				for (Iterator<?> iter = selection.iterator(); iter.hasNext();) {
					EObject elem = (EObject) iter.next();
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.outFlows,
						PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, elem));
				}
				outFlows.refresh();
			}
		};
		dialog.open();
	}

	/**
	 * 
	 */
	protected void moveOutFlows(EObject element, int oldIndex, int newIndex) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.outFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outFlows.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutFlows(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.outFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
		outFlows.refresh();
	}

	/**
	 * 
	 */
	protected void editOutFlows(EObject element) {
		EObjectPropertiesEditionContext context = new EObjectPropertiesEditionContext(propertiesEditionComponent.getEditingContext(), propertiesEditionComponent, element, adapterFactory);
		PropertiesEditingProvider provider = (PropertiesEditingProvider)adapterFactory.adapt(element, PropertiesEditingProvider.class);
		if (provider != null) {
			PropertiesEditingPolicy policy = provider.getPolicy(context);
			if (policy != null) {
				policy.execute();
				outFlows.refresh();
			}
		}
	}

	
	protected Composite createMissionText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.mission, CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_MissionLabel);
		mission = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData missionData = new GridData(GridData.FILL_HORIZONTAL);
		mission.setLayoutData(missionData);
		mission.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.mission, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mission.getText()));
			}

		});
		mission.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.mission, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, mission.getText()));
				}
			}

		});
		EditingUtils.setID(mission, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.mission);
		EditingUtils.setEEFtype(mission, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.mission, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createFunctionalRulesText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.functionalRules, CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_FunctionalRulesLabel);
		functionalRules = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData functionalRulesData = new GridData(GridData.FILL_HORIZONTAL);
		functionalRules.setLayoutData(functionalRulesData);
		functionalRules.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.functionalRules, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, functionalRules.getText()));
			}

		});
		functionalRules.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.functionalRules, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, functionalRules.getText()));
				}
			}

		});
		EditingUtils.setID(functionalRules, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.functionalRules);
		EditingUtils.setEEFtype(functionalRules, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.functionalRules, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMinCostText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.minCost, CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_MinCostLabel);
		minCost = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData minCostData = new GridData(GridData.FILL_HORIZONTAL);
		minCost.setLayoutData(minCostData);
		minCost.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.minCost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minCost.getText()));
			}

		});
		minCost.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.minCost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minCost.getText()));
				}
			}

		});
		EditingUtils.setID(minCost, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.minCost);
		EditingUtils.setEEFtype(minCost, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.minCost, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMaxCostText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.maxCost, CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_MaxCostLabel);
		maxCost = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData maxCostData = new GridData(GridData.FILL_HORIZONTAL);
		maxCost.setLayoutData(maxCostData);
		maxCost.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.maxCost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxCost.getText()));
			}

		});
		maxCost.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.maxCost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxCost.getText()));
				}
			}

		});
		EditingUtils.setID(maxCost, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.maxCost);
		EditingUtils.setEEFtype(maxCost, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.maxCost, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAverageCostText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.averageCost, CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_AverageCostLabel);
		averageCost = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData averageCostData = new GridData(GridData.FILL_HORIZONTAL);
		averageCost.setLayoutData(averageCostData);
		averageCost.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.averageCost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, averageCost.getText()));
			}

		});
		averageCost.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.averageCost, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, averageCost.getText()));
				}
			}

		});
		EditingUtils.setID(averageCost, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.averageCost);
		EditingUtils.setEEFtype(averageCost, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.averageCost, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMinTimeDelayText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.minTimeDelay, CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_MinTimeDelayLabel);
		minTimeDelay = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData minTimeDelayData = new GridData(GridData.FILL_HORIZONTAL);
		minTimeDelay.setLayoutData(minTimeDelayData);
		minTimeDelay.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.minTimeDelay, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minTimeDelay.getText()));
			}

		});
		minTimeDelay.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.minTimeDelay, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, minTimeDelay.getText()));
				}
			}

		});
		EditingUtils.setID(minTimeDelay, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.minTimeDelay);
		EditingUtils.setEEFtype(minTimeDelay, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.minTimeDelay, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createMaxTimeDelayText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.maxTimeDelay, CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_MaxTimeDelayLabel);
		maxTimeDelay = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData maxTimeDelayData = new GridData(GridData.FILL_HORIZONTAL);
		maxTimeDelay.setLayoutData(maxTimeDelayData);
		maxTimeDelay.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.maxTimeDelay, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxTimeDelay.getText()));
			}

		});
		maxTimeDelay.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.maxTimeDelay, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, maxTimeDelay.getText()));
				}
			}

		});
		EditingUtils.setID(maxTimeDelay, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.maxTimeDelay);
		EditingUtils.setEEFtype(maxTimeDelay, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.maxTimeDelay, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createAverageTimeDelayText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.averageTimeDelay, CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_AverageTimeDelayLabel);
		averageTimeDelay = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData averageTimeDelayData = new GridData(GridData.FILL_HORIZONTAL);
		averageTimeDelay.setLayoutData(averageTimeDelayData);
		averageTimeDelay.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.averageTimeDelay, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, averageTimeDelay.getText()));
			}

		});
		averageTimeDelay.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.averageTimeDelay, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, averageTimeDelay.getText()));
				}
			}

		});
		EditingUtils.setID(averageTimeDelay, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.averageTimeDelay);
		EditingUtils.setEEFtype(averageTimeDelay, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.averageTimeDelay, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsStartingCheckbox(Composite parent) {
		isStarting = new Button(parent, SWT.CHECK);
		isStarting.setText(getDescription(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.isStarting, CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_IsStartingLabel));
		isStarting.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.isStarting, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isStarting.getSelection())));
			}

		});
		GridData isStartingData = new GridData(GridData.FILL_HORIZONTAL);
		isStartingData.horizontalSpan = 2;
		isStarting.setLayoutData(isStartingData);
		EditingUtils.setID(isStarting, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.isStarting);
		EditingUtils.setEEFtype(isStarting, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.isStarting, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createIsEndingCheckbox(Composite parent) {
		isEnding = new Button(parent, SWT.CHECK);
		isEnding.setText(getDescription(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.isEnding, CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_IsEndingLabel));
		isEnding.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.isEnding, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(isEnding.getSelection())));
			}

		});
		GridData isEndingData = new GridData(GridData.FILL_HORIZONTAL);
		isEndingData.horizontalSpan = 2;
		isEnding.setLayoutData(isEndingData);
		EditingUtils.setID(isEnding, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.isEnding);
		EditingUtils.setEEFtype(isEnding, "eef::Checkbox"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.isEnding, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDecompositionCodeText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.decompositionCode, CoreElementsMessages.EaAtomicExtendedActivityPropertiesEditionPart_DecompositionCodeLabel);
		decompositionCode = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData decompositionCodeData = new GridData(GridData.FILL_HORIZONTAL);
		decompositionCode.setLayoutData(decompositionCodeData);
		decompositionCode.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.decompositionCode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, decompositionCode.getText()));
			}

		});
		decompositionCode.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.decompositionCode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, decompositionCode.getText()));
				}
			}

		});
		EditingUtils.setID(decompositionCode, CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.decompositionCode);
		EditingUtils.setEEFtype(decompositionCode, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaAtomicExtendedActivity.Properties.decompositionCode, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}
	
	protected Composite createOsmoseWorldEMFComboViewer(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.osmoseWorld, CoreElementsMessages.EaStructuralExtendedActivityPropertiesEditionPart_OsmoseWorldLabel);
		osmoseWorld = new EMFComboViewer(parent);
		GridData osmoseWorldData = new GridData(GridData.FILL_HORIZONTAL);
		osmoseWorld.getCombo().setLayoutData(osmoseWorldData);
		osmoseWorld.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		osmoseWorld.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaAtomicExtendedActivityPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.osmoseWorld, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getOsmoseWorld()));
			}

		});
		osmoseWorld.setContentProvider(new EMFListContentProvider());
		EditingUtils.setID(osmoseWorld.getCombo(), CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.osmoseWorld);
		EditingUtils.setEEFtype(osmoseWorld.getCombo(), "eef::Combo"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaStructuralExtendedActivity.Properties.osmoseWorld, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#getCode()
	 * 
	 */
	public String getCode() {
		return code.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#setCode(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#getOrganization()
	 * 
	 */
	public String getOrganization() {
		return organization.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#setOrganization(String newValue)
	 * 
	 */
	public void setOrganization(String newValue) {
		if (newValue != null) {
			organization.setText(newValue);
		} else {
			organization.setText(""); //$NON-NLS-1$
		}
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#initInFlows(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initInFlows(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		inFlows.setContentProvider(contentProvider);
		inFlows.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#updateInFlows()
	 * 
	 */
	public void updateInFlows() {
		inFlows.refresh();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#addFilterInFlows(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInFlows(ViewerFilter filter) {
		inFlowsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#addBusinessFilterInFlows(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInFlows(ViewerFilter filter) {
		inFlowsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#isContainedInInFlowsTable(EObject element)
	 * 
	 */
	public boolean isContainedInInFlowsTable(EObject element) {
		return ((ReferencesTableSettings)inFlows.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#initOutFlows(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
	 */
	public void initOutFlows(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		outFlows.setContentProvider(contentProvider);
		outFlows.setInput(settings);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#updateOutFlows()
	 * 
	 */
	public void updateOutFlows() {
	outFlows.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#addFilterOutFlows(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutFlows(ViewerFilter filter) {
		outFlowsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#addBusinessFilterOutFlows(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutFlows(ViewerFilter filter) {
		outFlowsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#isContainedInOutFlowsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutFlowsTable(EObject element) {
		return ((ReferencesTableSettings)outFlows.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#getMission()
	 * 
	 */
	public String getMission() {
		return mission.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#setMission(String newValue)
	 * 
	 */
	public void setMission(String newValue) {
		if (newValue != null) {
			mission.setText(newValue);
		} else {
			mission.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#getFunctionalRules()
	 * 
	 */
	public String getFunctionalRules() {
		return functionalRules.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#setFunctionalRules(String newValue)
	 * 
	 */
	public void setFunctionalRules(String newValue) {
		if (newValue != null) {
			functionalRules.setText(newValue);
		} else {
			functionalRules.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#getMinCost()
	 * 
	 */
	public String getMinCost() {
		return minCost.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#setMinCost(String newValue)
	 * 
	 */
	public void setMinCost(String newValue) {
		if (newValue != null) {
			minCost.setText(newValue);
		} else {
			minCost.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#getMaxCost()
	 * 
	 */
	public String getMaxCost() {
		return maxCost.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#setMaxCost(String newValue)
	 * 
	 */
	public void setMaxCost(String newValue) {
		if (newValue != null) {
			maxCost.setText(newValue);
		} else {
			maxCost.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#getAverageCost()
	 * 
	 */
	public String getAverageCost() {
		return averageCost.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#setAverageCost(String newValue)
	 * 
	 */
	public void setAverageCost(String newValue) {
		if (newValue != null) {
			averageCost.setText(newValue);
		} else {
			averageCost.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#getMinTimeDelay()
	 * 
	 */
	public String getMinTimeDelay() {
		return minTimeDelay.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#setMinTimeDelay(String newValue)
	 * 
	 */
	public void setMinTimeDelay(String newValue) {
		if (newValue != null) {
			minTimeDelay.setText(newValue);
		} else {
			minTimeDelay.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#getMaxTimeDelay()
	 * 
	 */
	public String getMaxTimeDelay() {
		return maxTimeDelay.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#setMaxTimeDelay(String newValue)
	 * 
	 */
	public void setMaxTimeDelay(String newValue) {
		if (newValue != null) {
			maxTimeDelay.setText(newValue);
		} else {
			maxTimeDelay.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#getAverageTimeDelay()
	 * 
	 */
	public String getAverageTimeDelay() {
		return averageTimeDelay.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#setAverageTimeDelay(String newValue)
	 * 
	 */
	public void setAverageTimeDelay(String newValue) {
		if (newValue != null) {
			averageTimeDelay.setText(newValue);
		} else {
			averageTimeDelay.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#getIsStarting()
	 * 
	 */
	public Boolean getIsStarting() {
		return Boolean.valueOf(isStarting.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#setIsStarting(Boolean newValue)
	 * 
	 */
	public void setIsStarting(Boolean newValue) {
		if (newValue != null) {
			isStarting.setSelection(newValue.booleanValue());
		} else {
			isStarting.setSelection(false);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#getIsEnding()
	 * 
	 */
	public Boolean getIsEnding() {
		return Boolean.valueOf(isEnding.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#setIsEnding(Boolean newValue)
	 * 
	 */
	public void setIsEnding(Boolean newValue) {
		if (newValue != null) {
			isEnding.setSelection(newValue.booleanValue());
		} else {
			isEnding.setSelection(false);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#getDecompositionCode()
	 * 
	 */
	public String getDecompositionCode() {
		return decompositionCode.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaAtomicExtendedActivityPropertiesEditionPart#setDecompositionCode(String newValue)
	 * 
	 */
	public void setDecompositionCode(String newValue) {
		if (newValue != null) {
			decompositionCode.setText(newValue);
		} else {
			decompositionCode.setText(""); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#getOsmoseWorld()
	 * 
	 */
	public Object getOsmoseWorld() {
		if (osmoseWorld.getSelection() instanceof StructuredSelection) {
			return ((StructuredSelection) osmoseWorld.getSelection()).getFirstElement();
		}
		return "";
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#initOsmoseWorld(Object input, Object currentValue)
	 */
	public void initOsmoseWorld(Object input, Object currentValue) {
		osmoseWorld.setInput(input);
		if (currentValue != null) {
			osmoseWorld.setSelection(new StructuredSelection(currentValue));
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#setOsmoseWorld(Object newValue)
	 * 
	 */
	public void setOsmoseWorld(Object newValue) {
		if (newValue != null) {
			osmoseWorld.modelUpdating(new StructuredSelection(newValue));
		} else {
			osmoseWorld.modelUpdating(new StructuredSelection("")); //$NON-NLS-1$
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see eaStar.coreElements.parts.EaStructuralExtendedActivityPropertiesEditionPart#addFilterOsmoseWorld(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOsmoseWorld(ViewerFilter filter) {
		osmoseWorld.addFilter(filter);
	}




	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CoreElementsMessages.EaAtomicExtendedActivity_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
