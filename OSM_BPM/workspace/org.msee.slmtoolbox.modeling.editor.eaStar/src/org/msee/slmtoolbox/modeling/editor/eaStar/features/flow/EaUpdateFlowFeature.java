package org.msee.slmtoolbox.modeling.editor.eaStar.features.flow;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.AbstractText;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.util.IColorConstant;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow;

public class EaUpdateFlowFeature extends AbstractUpdateFeature {

	public EaUpdateFlowFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canUpdate(IUpdateContext context) {
		// return true, if linked business object is a EClass
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		return (bo instanceof EaFlow);
	}

	public boolean update(IUpdateContext context) {
		// retrieve name from business model
		boolean trigger = false;
		String flowName = null;
		
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		EaFlow node = (EaFlow) bo;
		
		if (bo instanceof EaFlow) {
			trigger = node.isIsTrigger();
		}
		if (pictogramElement instanceof FreeFormConnection) {
			FreeFormConnection cs = (FreeFormConnection) pictogramElement;
			GraphicsAlgorithm graphics = cs.getGraphicsAlgorithm();
			if (graphics instanceof Polyline) {
				if (trigger == false) {
					graphics.setLineWidth(1);
				} else if (node.getSource() instanceof EaResource
						|| !(node.getTarget() instanceof EaExtendedActivity)
						|| node instanceof EaSupportFlow) {
					graphics.setLineWidth(1);
					node.setIsTrigger(false);
				} else {
					graphics.setLineWidth(2);
				}
			}
			
			// search for a "Text" decorator in the current connection object...
			AbstractText textGa = null;
			for(ConnectionDecorator elt : cs.getConnectionDecorators()) {
				if(elt.getGraphicsAlgorithm() instanceof AbstractText) {
					textGa = (AbstractText) elt.getGraphicsAlgorithm();
				}
			}
			
			// if the "Text" decorator doens't exists :
			if(textGa == null) {
				// add dynamic text decorator for the association name 
			     ConnectionDecorator textDecorator = Graphiti.getPeCreateService().createConnectionDecorator(cs, true, 0.5, true);
			     textGa = Graphiti.getGaService().createDefaultText(getDiagram(),textDecorator);
			     textGa.setForeground(manageColor(IColorConstant.BLACK));
			     Graphiti.getGaService().setLocation(textGa, 10, 0);
			     // set Flow name in the text decorator
			     textGa.setValue(node.getName());
			     link(textDecorator, node);
			} else {
				flowName = textGa.getValue();
			}
			
			// update the decorator name with the 
	        boolean updateNameNeeded =
	                ((flowName == null && node.getName() != null)
	        		|| (flowName != null && !flowName.equals(node.getName())));
			if (updateNameNeeded) {
				textGa.setValue(node.getName());
			}
		}

		return false;
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		int lineWidth = 1;
		String flowName = null;
		if (pictogramElement instanceof FreeFormConnection) {
			FreeFormConnection freeFormConnec = (FreeFormConnection) pictogramElement;
			GraphicsAlgorithm graphics = freeFormConnec.getGraphicsAlgorithm();
			lineWidth = graphics.getLineWidth();
			
			// search for a "Text" decorator in the current connection object...
			for(ConnectionDecorator elt : freeFormConnec.getConnectionDecorators()) {
				if(elt.getGraphicsAlgorithm() instanceof AbstractText) {
					// update the name of the graphic object with the business object name
					flowName = ((AbstractText) (elt.getGraphicsAlgorithm())).getValue();
				}
			}
		} else if (pictogramElement instanceof ConnectionDecorator) {
			ConnectionDecorator connection = (ConnectionDecorator)pictogramElement;
			if(connection.getGraphicsAlgorithm() instanceof AbstractText) {
				// update the name of the graphic object with the business object name
				flowName = ((AbstractText) (connection.getGraphicsAlgorithm())).getValue();
			}
		}

		// retrieve name from business model
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		EaFlow flow = (EaFlow) bo;
		boolean trigger = flow.isIsTrigger();

		// update needed, if names are different
		boolean updateTriggerNeeded = (lineWidth == 1 && !trigger == false)
				|| (lineWidth == 2 && !trigger == true) 
				|| null != flow.getName()  && null == flowName 
				||(flowName != null && !flowName.equals(flow.getName()));
		if (updateTriggerNeeded) {
			return Reason.createTrueReason("Name is out of date");
		} else {
			return Reason.createFalseReason();
		}
	}
}
