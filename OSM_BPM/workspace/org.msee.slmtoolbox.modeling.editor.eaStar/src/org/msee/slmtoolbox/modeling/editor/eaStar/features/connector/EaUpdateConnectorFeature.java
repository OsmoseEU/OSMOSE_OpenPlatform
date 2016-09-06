package org.msee.slmtoolbox.modeling.editor.eaStar.features.connector;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeUpdateFeature;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

public class EaUpdateConnectorFeature extends AbstractMseeUpdateFeature<EAStarAppService> {

	Object bo;

	public EaUpdateConnectorFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canUpdate(IUpdateContext context) {
		// return true, if linked business object is a EClass
		bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		return (bo instanceof EaConnector);
	}

	public IReason updateNeeded(IUpdateContext context) {
		
		// test if need bsm update
        boolean needUpdateBsm = false;
        if (bo instanceof EaProcessConnector) {
        	needUpdateBsm = getAppService().needUpdate(((EaProcessConnector) bo).getProcessRef());
        }
		// update needed, if names are different
        IReason updateDiagramNeed = updateNeededForDiagram(context);
		
        if (needUpdateBsm && !updateDiagramNeed.toBoolean()) {
            return Reason.createTrueReason("Name is not updated with the BSM model");
        } else {
        	return updateDiagramNeed;
        }
	}
	
	/**
	 * Check if need an update for diagram values
	 * @param context	feature context
	 * @return true if diagram values need update
	 */
	private IReason updateNeededForDiagram(IUpdateContext context) {
		// retrieve name from pictogram model
		String pictogramName = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			GraphicsAlgorithm graphics = cs.getGraphicsAlgorithm();
			if (graphics instanceof Ellipse || graphics instanceof Polygon )
				for (GraphicsAlgorithm graphic : graphics
						.getGraphicsAlgorithmChildren()) 
				{
					if (graphic instanceof Text) 
					{
						Text text = (Text) graphic;
						pictogramName = text.getValue();
					} 
				}
		}
		// retrieve name from business model
		String businessName = null;
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof EaConnector) {
			EaFlowNode node = (EaConnector) bo;
			businessName = node.getName();
		}

		// update needed, if names are different
		boolean updateNameNeeded = ((pictogramName == null && businessName != null) || (pictogramName != null && !pictogramName
				.equals(businessName)));
		 if (updateNameNeeded) {
			return Reason.createTrueReason("Name is out of date");
		} else {
			return Reason.createFalseReason();
		}
	}

	public boolean update(IUpdateContext context) {
        IReason updateDiagramNeed = updateNeededForDiagram(context);
		// retrieve name from business model
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);

		if (bo instanceof EaConnector) {
			EaFlowNode node = (EaFlowNode) bo;

			// update pictogram element
			if (pictogramElement instanceof ContainerShape) {
				ContainerShape cs = (ContainerShape) pictogramElement;
				GraphicsAlgorithm graphic = cs.getGraphicsAlgorithm();

				// control data
				 // update for EaProcessConnector
                if (!updateDiagramNeed.toBoolean() && bo instanceof EaProcessConnector) {
        			EaProcess process = ((EaProcessConnector) bo).getProcessRef();
        			// if need update with data BSM
					getAppService().updateEa(process);
					node.setName(process.getName());
					node.setCode(process.getCode());
                } else if(updateDiagramNeed.toBoolean() && bo instanceof EaProcessConnector) {
        			EaProcess process = ((EaProcessConnector) bo).getProcessRef();
					// if need update with data BSM
					process.setName(node.getName());
					process.setCode(node.getCode());
					getAppService().update(process);
                }
				
				if ((graphic instanceof Ellipse || graphic instanceof Polygon)
						&& graphic.getGraphicsAlgorithmChildren().size() > 0) {
					AbstractText text = (AbstractText) graphic.getGraphicsAlgorithmChildren().get(0);
					text.setValue(node.getName());
				}
			}
		}

		return false;
	}
}
