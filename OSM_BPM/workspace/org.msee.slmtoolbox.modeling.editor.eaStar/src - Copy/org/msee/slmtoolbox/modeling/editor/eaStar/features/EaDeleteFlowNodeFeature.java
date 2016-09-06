package org.msee.slmtoolbox.modeling.editor.eaStar.features;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.DefaultMseeDeleteFeature;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

/**
 * Resource delete Feature for EA* editor Graphiti
 * @author fto
 *
 */
public class EaDeleteFlowNodeFeature extends DefaultMseeDeleteFeature<EAStarAppService> {
	
	/**
	 * Default constructor 
	 * @param fp
	 *            the feature provider
	 */
	public EaDeleteFlowNodeFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Pre delete hook that can be implemented by users to perform any
	 * operations that need to be done before the standard delete functionality
	 * starts. Be sure to call
	 * {@link DefaultDeleteFeature#setDoneChanges(boolean)} in case you modify
	 * any EMF objects to enable that the command stack gets updated.
	 * 
	 * @param context
	 *            the context
	 */
	public void preDelete(IDeleteContext context) {
		PictogramElement pe = context.getPictogramElement();
		Object businessObject = getBusinessObjectForPictogramElement(pe);
		// update data for bsm
		if (businessObject instanceof EaResource) {
			getAppService().remove(EaUtils.findProcess(getFeatureProvider(), getDiagram()),(EaResource)businessObject);
		} else if (businessObject instanceof EaOrganization) {
			getAppService().remove(EaUtils.findProcess(getFeatureProvider(), getDiagram()),(EaOrganization)businessObject);
		}
		
	}
	
	/**
	 * Implement the default delete functionality.
	 * @param context the context
	 */
	public void delete(IDeleteContext context) {
		// find businessObject
		PictogramElement pe = context.getPictogramElement();
		Object businessObject = getBusinessObjectForPictogramElement(pe);
		// if is an EAStarResource
		if (businessObject instanceof EaFlowNode) {
			EaFlowNode flowNode = (EaFlowNode) businessObject;
			// find all PictogramElement with a link to resource 
			List<PictogramElement> allPictogramElement  = Graphiti.getLinkService().getPictogramElements(getDiagram(), flowNode);
			// if number flow != number connector
			if (allPictogramElement.size() != 1) {
				// find number connector for the graphical element selected
				List<Object> compositeChildConnectionsBOs = collectCompositeConnections(pe);
				// if number connector = 0
				if (0 == compositeChildConnectionsBOs.size()) {
					// remove graphical element selected
					IRemoveContext rc = new RemoveContext(pe);
					callRemove(rc);
					setDoneChanges(true);
				} else {
					// remove graphical element selected
					IRemoveContext rc = new RemoveContext(pe);
					callRemove(rc);
					setDoneChanges(true);
					// delete flow
					deleteBusinessObjects(compositeChildConnectionsBOs.toArray());
				}
			} else {
				// else delete the element
				super.delete(context);
			}
			
		} else {
			super.delete(context);
		}
	}

	/***
	 * Collect all business object connected to resource's PictogramElement by a connector
	 * @param pe		resource's PictogramElement
	 * @return business object collect
	 */
	private List<Object> collectCompositeConnections(PictogramElement pe) {
		List<Object> result = new ArrayList<Object>();
		if (pe instanceof ContainerShape) {
			for (Anchor anchor : ((ContainerShape)pe).getAnchors()) {
				for (Connection Connection : anchor.getIncomingConnections()) {
					Object business = getBusinessObjectForPictogramElement(Connection);
					result.add(business);
				}
				for (Connection Connection : anchor.getOutgoingConnections()) {
					Object business = getBusinessObjectForPictogramElement(Connection);
					result.add(business);
				}
			}
		}
		return result;
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

}
