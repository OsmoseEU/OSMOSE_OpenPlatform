package org.msee.slmtoolbox.modeling.editor.eaStar.diagram;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDoubleClickContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.palette.IPaletteCompartmentEntry;
import org.eclipse.graphiti.palette.impl.ConnectionCreationToolEntry;
import org.eclipse.graphiti.palette.impl.ObjectCreationToolEntry;
import org.eclipse.graphiti.palette.impl.PaletteCompartmentEntry;
import org.eclipse.graphiti.tb.BorderDecorator;
import org.eclipse.graphiti.tb.ContextMenuEntry;
import org.eclipse.graphiti.tb.IContextMenuEntry;
import org.eclipse.graphiti.tb.IDecorator;
import org.eclipse.graphiti.util.IColorConstant;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.structural.EaDrillDownActivityFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.connector.EaDrillDownProcessConnectorFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.custom.EaDownToDiagramFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.custom.EaUpToDiagramFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaActivityAnchors;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.editor.graphiti.diagram.DefaultMseeToolBehaviorProvider;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaLogicalOperator;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaFlowElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;


public class EaToolBehaviorProvider extends DefaultMseeToolBehaviorProvider {

	private List<Class<?>> highlightElements = new ArrayList<>();

	/**
	 * @return the highlightElements
	 */
	public List<Class<?>> getHighlightElements() {
		return highlightElements;
	}

	/**
	 * @param highlightElements
	 *            the highlightElements to set
	 */
	public void setHighlightElements(List<Class<?>> highlightElements) {
		this.highlightElements = highlightElements;
	}

	/**
	 * @return the highlightElements
	 */
	public void clearHighlightElements() {
		highlightElements.clear();
	}

	public EaToolBehaviorProvider(IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
	}

	/**
	 * Set specific anchors of ExtendedActivity visible
	 * 
	 * @param listAnchors
	 */
	public void showRelativeAnchors(List<EaActivityAnchors> listAnchors) {
		final Diagram diagram = this.getDiagramTypeProvider().getDiagram();
		final List<EaActivityAnchors> anchors = listAnchors;

		TransactionalEditingDomain domain = this.getDiagramTypeProvider()
				.getDiagramEditor().getEditingDomain();
		domain.getCommandStack().execute(new RecordingCommand(domain) {

			@Override
			protected void doExecute() {
				EaProcess mainProcess= EaUtils.findProcess(getFeatureProvider(), diagram);
				toggleRelativeAnchorsVisibility(mainProcess, anchors, true);
			}

		});

	}

	/**
	 * Hide anchors of Extended Activities
	 */
	public void hideRelativeAnchors() {
		final Diagram diagram = this.getDiagramTypeProvider().getDiagram();
		final List<EaActivityAnchors> anchors = new ArrayList<>();
		anchors.add(EaActivityAnchors.Control);
		anchors.add(EaActivityAnchors.Support);
		anchors.add(EaActivityAnchors.Input);
		anchors.add(EaActivityAnchors.Output);

		TransactionalEditingDomain domain = this.getDiagramTypeProvider()
				.getDiagramEditor().getEditingDomain();

		domain.getCommandStack().execute(new RecordingCommand(domain) {

			@Override
			protected void doExecute() {
				EaProcess mainProcess= EaUtils.findProcess(getFeatureProvider(), diagram);
				toggleRelativeAnchorsVisibility(mainProcess, anchors, false);
			}

		});

	}
	
	@Override
    public IContextMenuEntry[] getContextMenu(ICustomContext context) {
 
		IContextMenuEntry ret[];
        
        // create a menu-entry in the sub-menu for each custom feature
        if (context instanceof ICustomContext) {
            ICustomContext customContext = (ICustomContext) context;
            ICustomFeature[] customFeatures =
                getFeatureProvider().getCustomFeatures(customContext);
            
            ret = new IContextMenuEntry[customFeatures.length + 2];
            for (int i = 0; i < customFeatures.length; i++) {
                ICustomFeature customFeature = customFeatures[i];
                if (customFeature.isAvailable(customContext)) {
                    ret[i+2] =  new ContextMenuEntry(customFeature, context);
                }
            }
        } else {
        	ret = new IContextMenuEntry[2];
        }
        
        ret[0] = new ContextMenuEntry(new EaUpToDiagramFeature(getFeatureProvider()), context);
        ret[1] = new ContextMenuEntry(new EaDownToDiagramFeature(getFeatureProvider()), context);
        
 
        return ret;
    }

	/**
	 * Set visibility of Extended Activities anchors into true or false
	 * 
	 * @param shape
	 * @param listAnchors
	 * @param visible
	 */
	public void toggleRelativeAnchorsVisibility(EaBaseElement eaElement,
			List<EaActivityAnchors> listAnchors, boolean visible) {
		if (eaElement instanceof EaProcess) {
			// for eaElement is a Process
			EaProcess process = (EaProcess) eaElement;
			
			for (EaFlowElement flowElement : process.getFlowElements()) {
				// search all extended activity
				if (flowElement instanceof EaExtendedActivity) {
					toggleRelativeAnchorsVisibility(flowElement, listAnchors, visible);
				}
			}
			
		} else if (eaElement instanceof EaExtendedActivity) {
			// for eaElement is an  extended activity
			// search shape
			PictogramElement pictogram = getFeatureProvider().getPictogramElementForBusinessObject(eaElement);
			if (pictogram instanceof ContainerShape) {
				ContainerShape shape = (ContainerShape) pictogram;
				// for all EAStarAnchors
				for (EaActivityAnchors anchorModifed : listAnchors) {
					// if found anchor
					if (shape.getAnchors().size()>anchorModifed.getIndex()) {
						// change visibility
						shape.getAnchors().get(anchorModifed.getIndex()).setVisible(visible);
					}
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.graphiti.tb.DefaultToolBehaviorProvider#getDecorators(org.eclipse.graphiti.mm.pictograms.PictogramElement)
	 */
	@Override
	public IDecorator[] getDecorators(PictogramElement pe) {
		Object bo = getFeatureProvider().getBusinessObjectForPictogramElement(
				pe);
		for (Class<?> clazz : highlightElements) {
			if (clazz.isAssignableFrom(bo.getClass())) {
				BorderDecorator id = new BorderDecorator();
				id.setBorderColor(IColorConstant.DARK_GREEN);
				id.setBorderWidth(1);
				id.setBorderStyle(LineStyle.DASHDOT_VALUE);
				return new IDecorator[] { id };
			}
		}

		return new IDecorator[] {};
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.graphiti.tb.DefaultToolBehaviorProvider#getDoubleClickFeature(org.eclipse.graphiti.features.context.IDoubleClickContext)
	 */
	@Override
	public ICustomFeature getDoubleClickFeature(IDoubleClickContext context) {
		PictogramElement pictogramElement = context.getInnerPictogramElement();
		Object bo = getFeatureProvider().getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof EaExtendedActivity) {
			return new EaDrillDownActivityFeature(getFeatureProvider());
		} else if (bo instanceof EaConnector) {
			return new EaDrillDownProcessConnectorFeature(getFeatureProvider());
		}
		
		return super.getDoubleClickFeature(context);
		
	}

	/**
	 * Create Entries in the palette (connections, resources, connectors,
	 * LogicalOperators, and ExtendedActivity)
	 */
	@Override
	public IPaletteCompartmentEntry[] getPalette() {

		// list Of compartment entries
		List<IPaletteCompartmentEntry> compartments = new ArrayList<IPaletteCompartmentEntry>();

		// create new compartments
		PaletteCompartmentEntry connections = new PaletteCompartmentEntry(
				"Connections", null);
		PaletteCompartmentEntry resources = new PaletteCompartmentEntry(
				"Resources", null);
		PaletteCompartmentEntry connectors = new PaletteCompartmentEntry(
				"Connectors", null);
		PaletteCompartmentEntry logicalOperators = new PaletteCompartmentEntry(
				"LogicalOperators", null);
		PaletteCompartmentEntry extendedActivity = new PaletteCompartmentEntry(
				"ExtendedActivity", null);

		// initially close resources and logicalOperators compartments
		resources.setInitiallyOpen(false);
		logicalOperators.setInitiallyOpen(false);

		// add created compartments to compartments list
		compartments.add(connections);
		compartments.add(resources);
		compartments.add(connectors);
		compartments.add(logicalOperators);
		compartments.add(extendedActivity);

		// add all create-connection-features to the new stack-entry
		EaFeatureProvider featureProvider = (EaFeatureProvider) getFeatureProvider();
		ICreateConnectionFeature[] createConnectionFeatures = featureProvider
				.getCreateConnectionFeatures();
		for (ICreateConnectionFeature cf : createConnectionFeatures) {
			ConnectionCreationToolEntry connectionCreationToolEntry = new ConnectionCreationToolEntry(
					cf.getCreateName(), cf.getCreateDescription(),
					cf.getCreateImageId(), cf.getCreateLargeImageId());

			connectionCreationToolEntry.addCreateConnectionFeature(cf);
			connections.addToolEntry(connectionCreationToolEntry);
		}

		populateCompartment(featureProvider.getResourcesFeatures(), resources);
		populateCompartment(featureProvider.getConnectorsFeatures(), connectors);
		populateCompartment(featureProvider.getLogicalOperatorsFeatures(),
				logicalOperators);
		populateCompartment(featureProvider.getExtendedActivityFeatures(),
				extendedActivity);

		return compartments.toArray(new IPaletteCompartmentEntry[compartments
				.size()]);

	}

	/**
	 * Create Tool entry for given compartment.
	 * 
	 * @param createFeatures
	 * @param compartment
	 */
	private void populateCompartment(ICreateFeature[] createFeatures,
			PaletteCompartmentEntry compartment) {
		for (ICreateFeature cf : createFeatures) {
			ObjectCreationToolEntry objectCreationToolEntry = new ObjectCreationToolEntry(
					cf.getCreateName(), cf.getCreateDescription(),
					cf.getCreateImageId(), cf.getCreateLargeImageId(), cf);
			compartment.addToolEntry(objectCreationToolEntry);

		}
	}

	/************************************************************/

	/**
	 * Remove highlights around graphical objects
	 */
	public void clearHighlight() {
		// Clear highlight
		highlightElements.clear();
		this.getFeatureProvider().getDiagramTypeProvider().getDiagramEditor()
				.refresh();
	}

	/**
	 * Highlight a list of objects
	 * 
	 * @param items
	 */
	public void addHighlight(List<Class<?>> items) {
		clearHighlight();

		// Highlight
		this.getHighlightElements().addAll(items);
		this.getFeatureProvider().getDiagramTypeProvider().getDiagramEditor()
				.refresh();

	}

	/**
	 * Hide all anchors of Extended Activities
	 */
	public void hideAnchors() {
		// Hide support flow anchors
		this.hideRelativeAnchors();
	}

	/**
	 * Visualize specific anchors of Extended Activities
	 * 
	 * @param anchors
	 */
	public void showAnchors(List<EaActivityAnchors> anchors) {
		hideAnchors();
		this.showRelativeAnchors(anchors);
	}

	private boolean isReconnecting = false;

	/************************************************************/
	
	/**
	 * The beginning of reconnection of control flow from source
	 */
	public void startControlReConnectingSource() {
		if (!isReconnecting) {
			showControlPossibleSources();
			isReconnecting = true;
		}
	}

	/**
	 * The beginning of reconnection of control flow from target
	 */
	public void startControlReConnectingTarget() {
		if (!isReconnecting) {
			showControlPossibleTargets();
			isReconnecting = true;
		}
	}

	/**
	 * Provide possible allowed source for control flow
	 */
	public void showControlPossibleSources() {
		List<Class<?>> highlightItems = new ArrayList<>();
		highlightItems.add(EaExtendedActivity.class);
		highlightItems.add(EaLogicalOperator.class);
		highlightItems.add(EaConnector.class);
		this.addHighlight(highlightItems);
		List<EaActivityAnchors> anchors = new ArrayList<>();
		anchors.add(EaActivityAnchors.Output);
		this.showAnchors(anchors);
	}

	/**
	 * Provide possible allowed targets for control flow
	 */
	public void showControlPossibleTargets() {
		List<Class<?>> highlightItems = new ArrayList<>();
		highlightItems.add(EaExtendedActivity.class);
		this.addHighlight(highlightItems);
		List<EaActivityAnchors> anchors = new ArrayList<>();
		anchors.add(EaActivityAnchors.Control);
		this.showAnchors(anchors);
	}

	/**
	 * end of reconnection
	 */
	public void endReConnecting() {
		this.clearHighlight();
		this.hideAnchors();
		isReconnecting = false;
	}

	/************************************************************/

	/**
	 * The beginning of reconnection of support flow from source
	 */
	public void startSupportReConnectingSource() {
		if (!isReconnecting) {
			showSupportPossibleSources();
			isReconnecting = true;
		}
	}
	
	/**
	 * The beginning of reconnection of support flow from target
	 */
	public void startSupportReConnectingTarget() {
		if (!isReconnecting) {
			showSupportPossibleTargets();
			isReconnecting = true;
		}
	}
	
	/**
	 * Provide possible allowed source for a support flow
	 */
	public void showSupportPossibleTargets() {
		List<Class<?>> highlightItems = new ArrayList<>();
		highlightItems.add(EaExtendedActivity.class);
		this.addHighlight(highlightItems);
		List<EaActivityAnchors> anchors = new ArrayList<>();
		anchors.add(EaActivityAnchors.Support);
		this.showAnchors(anchors);
	}
	
	/**
	 * Provide possible allowed target for a support flow
	 */
	public void showSupportPossibleSources() {
		List<Class<?>> highlightItems = new ArrayList<>();
		highlightItems.add(EaExtendedActivity.class);
		highlightItems.add(EaResource.class);
		this.addHighlight(highlightItems);
		List<EaActivityAnchors> anchors = new ArrayList<>();
		anchors.add(EaActivityAnchors.Output);
		this.showAnchors(anchors);
	}
	/************************************************************/

	/**
	 * The beginning of reconnection of inputOutput flow from source
	 */
	public void startInputOutputReConnectingSource() {
		if (!isReconnecting) {
			showInputOutputPossibleSources();
			isReconnecting = true;
		}
	}

	/**
	 * The beginning of reconnection of inputOutput flow from target
	 */
	public void startInputOutputReConnectingTarget(EaFlowNode source) {
		if (!isReconnecting) {
			showInputOutputPossibleTargets(source);
			isReconnecting = true;
		}
	}

	/**
	 * Provide allowed target for an inputOutput flow
	 */
	public void showInputOutputPossibleTargets(EaFlowNode source) {
		List<Class<?>> highlightItems = new ArrayList<>();
		highlightItems.add(EaExtendedActivity.class);
		if (!(source instanceof EaConnector)) {
			highlightItems.add(EaConnector.class);
		}
		highlightItems.add(EaLogicalOperator.class);
		this.addHighlight(highlightItems);
		List<EaActivityAnchors> anchors = new ArrayList<>();
		anchors.add(EaActivityAnchors.Input);
		this.showAnchors(anchors);
	}
	
	/**
	 * Provide allowed sources for an inputOutput flow
	 */
	public void showInputOutputPossibleSources() {
		List<Class<?>> highlightItems = new ArrayList<>();
		highlightItems.add(EaExtendedActivity.class);
		highlightItems.add(EaLogicalOperator.class);
		highlightItems.add(EaConnector.class);
		this.addHighlight(highlightItems);
		List<EaActivityAnchors> anchors = new ArrayList<>();
		anchors.add(EaActivityAnchors.Output);
		this.showAnchors(anchors);
	}
}