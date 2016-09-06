package org.msee.slmtoolbox.modeling.editor.eaStar.features.flow;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.jface.window.Window;
import org.msee.slmtoolbox.modeling.editor.eaStar.diagram.EaToolBehaviorProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaFlowUtil;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.flow.AbstractCreateEaFlowDialog;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeCreateConnectionFeature;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

/**
 * abstract class to create a EAStar connection feature
 * @author fto
 */
public abstract class AbstractEaCreateConnectionFeature<S extends EaFlowUtil> extends
		AbstractMseeCreateConnectionFeature<EAStarAppService> {

	public S flowUtil;
	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 * @param name			menu entry name
	 * @param description	menu entry tooltip
	 */
	public AbstractEaCreateConnectionFeature(IFeatureProvider fp, String name, String description, S flowUtil) {
		super(fp, name, description);
		this.flowUtil = flowUtil;
	}
	
	/**
	 * find the process business object
	 * @return null if not found a process
	 */
	protected EaProcess findProcess() {
		EaProcess process = null;
		// find the businesseObject 
		Object businesseObject = getBusinessObjectForPictogramElement(getDiagram());
		// if not a GraiGrid, it's error, return null
		if (businesseObject instanceof EaProcess) {
			process = (EaProcess) businesseObject;
		}
		
		return process;
	}

	/**
	 * Action when start connecting
	 */
	@Override
	public void startConnecting() {
		getFlowUtil().showSource();
	}

	/**
	 * Action when attached toSource
	 */
	@Override
	public void attachedToSource(ICreateConnectionContext context) {	
		getFlowUtil().showTarget(getFlowNode(context.getSourceAnchor()));
	}
	
	/**
	 * Action when end connecting
	 */
	@Override
	public void endConnecting() {
		getToolBehaviorProvider().clearHighlight();
		getToolBehaviorProvider().hideAnchors();
	}


	/**
	 * Action when cancel connecting
	 */
	@Override
	public void canceledAttaching(ICreateConnectionContext context) {
		getToolBehaviorProvider().clearHighlight();
		getToolBehaviorProvider().hideAnchors();
	}

	/**
	 * Verify if can start connection with source in context
	 */
	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		EaFlowNode source = getFlowNode(context.getSourceAnchor());
		return getFlowUtil().canStartConnection(source, context.getSourceAnchor());
	}


	/**
	 * Verify if can create connection with source and target in context
	 */
	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		EaFlowNode source = getFlowNode(context.getSourceAnchor());
		EaFlowNode target = getFlowNode(context.getTargetAnchor());
		return getFlowUtil().canCreate(source, target, context.getTargetAnchor());
	}


	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;

		// get EClasses which should be connected
		EaFlowNode source = getFlowNode(context.getSourceAnchor());
		EaFlowNode target = getFlowNode(context.getTargetAnchor());

		if (source != null && target != null) {
			// create new business object
			EaFlow flow = null;
			// create wizard
			AbstractCreateEaFlowDialog dialog = createFlowDialog(source, target);

			if (dialog.open() == Window.OK) {
				flow = dialog.getFlow();
			}
			
			if (null != flow) {
				// add connection for business object
				AddConnectionContext addContext = new AddConnectionContext(
						context.getSourceAnchor(), context.getTargetAnchor());
				addContext.setNewObject(flow);
				newConnection = (Connection) getFeatureProvider().addIfPossible(
						addContext);
			}
		}

		return newConnection;
	}

	/**
	 * Returns the FlowNode belonging to the anchor, or null if not available.
	 */
	protected EaFlowNode getFlowNode(Anchor anchor) {
		if (anchor != null) {
			Object object = getBusinessObjectForPictogramElement(anchor.getParent());
			if (object instanceof EaFlowNode) {
				return (EaFlowNode) object;
			}
		}
		return null;
	}

	/**
	 * @return the toolBehaviorProvider
	 */
	protected EaToolBehaviorProvider getToolBehaviorProvider() {
		return (EaToolBehaviorProvider)getFeatureProvider().getDiagramTypeProvider().getCurrentToolBehaviorProvider();
	}
	
	/**
	 * @return the flowUtil
	 */
	protected S getFlowUtil() {
		return flowUtil;
	}

	/**
	 * Creates a Flow between two FlowNode.
	 */
	abstract protected AbstractCreateEaFlowDialog createFlowDialog(EaFlowNode source, EaFlowNode target);
}
