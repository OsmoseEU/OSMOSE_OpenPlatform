/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.impl;

// Start of user code for imports
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;
import org.eclipse.emf.eef.runtime.ui.widgets.TabElementTreeSelectionDialog;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.CoreElementsViewsRepository;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.providers.CoreElementsMessages;

// End of user code

/**
 * 
 * 
 */
public class EaProcessConnectorPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, EaProcessConnectorPropertiesEditionPart {

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
	protected Text processRef;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public EaProcessConnectorPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence eaProcessConnectorStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = eaProcessConnectorStep.addStep(CoreElementsViewsRepository.EaProcessConnector.Properties.class);
		propertiesStep.addStep(CoreElementsViewsRepository.EaProcessConnector.Properties.name);
		propertiesStep.addStep(CoreElementsViewsRepository.EaProcessConnector.Properties.code);
		propertiesStep.addStep(CoreElementsViewsRepository.EaProcessConnector.Properties.description);
		propertiesStep.addStep(CoreElementsViewsRepository.EaProcessConnector.Properties.organization);
		propertiesStep.addStep(CoreElementsViewsRepository.EaProcessConnector.Properties.inFlows);
		propertiesStep.addStep(CoreElementsViewsRepository.EaProcessConnector.Properties.outFlows);
		propertiesStep.addStep(CoreElementsViewsRepository.EaProcessConnector.Properties.processRef);
		
		
		composer = new PartComposer(eaProcessConnectorStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == CoreElementsViewsRepository.EaProcessConnector.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == CoreElementsViewsRepository.EaProcessConnector.Properties.name) {
					return createNameText(parent);
				}
				if (key == CoreElementsViewsRepository.EaProcessConnector.Properties.code) {
					return createCodeText(parent);
				}
				if (key == CoreElementsViewsRepository.EaProcessConnector.Properties.description) {
					return createDescriptionText(parent);
				}
				if (key == CoreElementsViewsRepository.EaProcessConnector.Properties.organization) {
					return createOrganizationText(parent);
				}
				if (key == CoreElementsViewsRepository.EaProcessConnector.Properties.inFlows) {
					return createInFlowsAdvancedReferencesTable(parent);
				}
				if (key == CoreElementsViewsRepository.EaProcessConnector.Properties.outFlows) {
					return createOutFlowsAdvancedReferencesTable(parent);
				}
				if (key == CoreElementsViewsRepository.EaProcessConnector.Properties.processRef) {
					return createProcessRefText(parent);
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
		propertiesGroup.setText(CoreElementsMessages.EaProcessConnectorPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaProcessConnector.Properties.name, CoreElementsMessages.EaProcessConnectorPropertiesEditionPart_NameLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessConnectorPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaProcessConnector.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessConnectorPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaProcessConnector.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, CoreElementsViewsRepository.EaProcessConnector.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaProcessConnector.Properties.name, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createCodeText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaProcessConnector.Properties.code, CoreElementsMessages.EaProcessConnectorPropertiesEditionPart_CodeLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessConnectorPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaProcessConnector.Properties.code, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessConnectorPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaProcessConnector.Properties.code, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, code.getText()));
				}
			}

		});
		EditingUtils.setID(code, CoreElementsViewsRepository.EaProcessConnector.Properties.code);
		EditingUtils.setEEFtype(code, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaProcessConnector.Properties.code, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createDescriptionText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaProcessConnector.Properties.description, CoreElementsMessages.EaProcessConnectorPropertiesEditionPart_DescriptionLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessConnectorPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaProcessConnector.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessConnectorPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaProcessConnector.Properties.description, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, description.getText()));
				}
			}

		});
		EditingUtils.setID(description, CoreElementsViewsRepository.EaProcessConnector.Properties.description);
		EditingUtils.setEEFtype(description, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaProcessConnector.Properties.description, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	
	protected Composite createOrganizationText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaProcessConnector.Properties.organization, CoreElementsMessages.EaProcessConnectorPropertiesEditionPart_OrganizationLabel);
		organization = SWTUtils.createScrollableText(parent, SWT.BORDER);
		organization.setEnabled(false);
		organization.setToolTipText(CoreElementsMessages.EaProcessConnector_ReadOnly);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessConnectorPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaProcessConnector.Properties.organization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, organization.getText()));
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessConnectorPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaProcessConnector.Properties.organization, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, organization.getText()));
				}
			}

		});
		EditingUtils.setID(organization, CoreElementsViewsRepository.EaProcessConnector.Properties.organization);
		EditingUtils.setEEFtype(organization, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaProcessConnector.Properties.organization, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		return parent;
	}

	/**
	 * 
	 */
	protected Composite createInFlowsAdvancedReferencesTable(Composite parent) {
		String label = getDescription(CoreElementsViewsRepository.EaProcessConnector.Properties.inFlows, CoreElementsMessages.EaProcessConnectorPropertiesEditionPart_InFlowsLabel);		 
		this.inFlows = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addInFlows(); }
			public void handleEdit(EObject element) { editInFlows(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveInFlows(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromInFlows(element); }
			public void navigateTo(EObject element) { }
		});
		this.inFlows.setHelpText(propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaProcessConnector.Properties.inFlows, CoreElementsViewsRepository.SWT_KIND));
		this.inFlows.createControls(parent);
		this.inFlows.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessConnectorPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaProcessConnector.Properties.inFlows, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		inFlows.setEnabled(false);
		inFlows.setToolTipText(CoreElementsMessages.EaProcessConnector_ReadOnly);
		GridData inFlowsData = new GridData(GridData.FILL_HORIZONTAL);
		inFlowsData.horizontalSpan = 3;
		this.inFlows.setLayoutData(inFlowsData);
		this.inFlows.disableMove();
		inFlows.setID(CoreElementsViewsRepository.EaProcessConnector.Properties.inFlows);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessConnectorPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaProcessConnector.Properties.inFlows,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessConnectorPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaProcessConnector.Properties.inFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		inFlows.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromInFlows(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessConnectorPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaProcessConnector.Properties.inFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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
		String label = getDescription(CoreElementsViewsRepository.EaProcessConnector.Properties.outFlows, CoreElementsMessages.EaProcessConnectorPropertiesEditionPart_OutFlowsLabel);		 
		this.outFlows = new ReferencesTable(label, new ReferencesTableListener() {
			public void handleAdd() { addOutFlows(); }
			public void handleEdit(EObject element) { editOutFlows(element); }
			public void handleMove(EObject element, int oldIndex, int newIndex) { moveOutFlows(element, oldIndex, newIndex); }
			public void handleRemove(EObject element) { removeFromOutFlows(element); }
			public void navigateTo(EObject element) { }
		});
		this.outFlows.setHelpText(propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaProcessConnector.Properties.outFlows, CoreElementsViewsRepository.SWT_KIND));
		this.outFlows.createControls(parent);
		this.outFlows.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessConnectorPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaProcessConnector.Properties.outFlows, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		outFlows.setEnabled(false);
		outFlows.setToolTipText(CoreElementsMessages.EaProcessConnector_ReadOnly);
		GridData outFlowsData = new GridData(GridData.FILL_HORIZONTAL);
		outFlowsData.horizontalSpan = 3;
		this.outFlows.setLayoutData(outFlowsData);
		this.outFlows.disableMove();
		outFlows.setID(CoreElementsViewsRepository.EaProcessConnector.Properties.outFlows);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessConnectorPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaProcessConnector.Properties.outFlows,
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
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessConnectorPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaProcessConnector.Properties.outFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
		outFlows.refresh();
	}

	/**
	 * 
	 */
	protected void removeFromOutFlows(EObject element) {
		propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessConnectorPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaProcessConnector.Properties.outFlows, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
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

	
	protected Composite createProcessRefText(Composite parent) {
		createDescription(parent, CoreElementsViewsRepository.EaProcessConnector.Properties.processRef, CoreElementsMessages.EaProcessConnectorPropertiesEditionPart_ProcessRefLabel);
		processRef = SWTUtils.createScrollableText(parent, SWT.BORDER);
		processRef.setEnabled(false);
		processRef.setToolTipText(CoreElementsMessages.EaProcessConnector_ReadOnly);
		GridData processRefData = new GridData(GridData.FILL_HORIZONTAL);
		processRef.setLayoutData(processRefData);
		processRef.addFocusListener(new FocusAdapter() {

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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessConnectorPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaProcessConnector.Properties.processRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, processRef.getText()));
			}

		});
		processRef.addKeyListener(new KeyAdapter() {

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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(EaProcessConnectorPropertiesEditionPartImpl.this, CoreElementsViewsRepository.EaProcessConnector.Properties.processRef, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, processRef.getText()));
				}
			}

		});
		EditingUtils.setID(processRef, CoreElementsViewsRepository.EaProcessConnector.Properties.processRef);
		EditingUtils.setEEFtype(processRef, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(CoreElementsViewsRepository.EaProcessConnector.Properties.processRef, CoreElementsViewsRepository.SWT_KIND), null); //$NON-NLS-1$
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#setName(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#getCode()
	 * 
	 */
	public String getCode() {
		return code.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#setCode(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#getDescription()
	 * 
	 */
	public String getDescription() {
		return description.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#setDescription(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#getOrganization()
	 * 
	 */
	public String getOrganization() {
		return organization.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#setOrganization(String newValue)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#initInFlows(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#updateInFlows()
	 * 
	 */
	public void updateInFlows() {
	inFlows.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#addFilterInFlows(ViewerFilter filter)
	 * 
	 */
	public void addFilterToInFlows(ViewerFilter filter) {
		inFlowsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#addBusinessFilterInFlows(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToInFlows(ViewerFilter filter) {
		inFlowsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#isContainedInInFlowsTable(EObject element)
	 * 
	 */
	public boolean isContainedInInFlowsTable(EObject element) {
		return ((ReferencesTableSettings)inFlows.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#initOutFlows(org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings)
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
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#updateOutFlows()
	 * 
	 */
	public void updateOutFlows() {
	outFlows.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#addFilterOutFlows(ViewerFilter filter)
	 * 
	 */
	public void addFilterToOutFlows(ViewerFilter filter) {
		outFlowsFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#addBusinessFilterOutFlows(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToOutFlows(ViewerFilter filter) {
		outFlowsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#isContainedInOutFlowsTable(EObject element)
	 * 
	 */
	public boolean isContainedInOutFlowsTable(EObject element) {
		return ((ReferencesTableSettings)outFlows.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#getProcessRef()
	 * 
	 */
	public String getProcessRef() {
		return processRef.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts.EaProcessConnectorPropertiesEditionPart#setProcessRef(String newValue)
	 * 
	 */
	public void setProcessRef(String newValue) {
		if (newValue != null) {
			processRef.setText(newValue);
		} else {
			processRef.setText(""); //$NON-NLS-1$
		}
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return CoreElementsMessages.EaProcessConnector_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
