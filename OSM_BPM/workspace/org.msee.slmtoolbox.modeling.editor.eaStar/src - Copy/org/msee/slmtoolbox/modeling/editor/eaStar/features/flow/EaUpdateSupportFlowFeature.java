package org.msee.slmtoolbox.modeling.editor.eaStar.features.flow;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.FreeFormConnection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.msee.slmtoolbox.modeling.editor.eaStar.style.EaStyleUtil;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResourceRole;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaSupportFlow;

/**
 * Update manager for a eSupportFlow
 * @author fto
 *
 */
public class EaUpdateSupportFlowFeature extends EaUpdateFlowFeature {

	/**
	 * Default constructor
	 * @param fp
	 */
	public EaUpdateSupportFlowFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Updates the pictogram element. It copies the latest values from the
	 * business model to the graphics algorithm of this pictogram elements.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return true, if update process was successfull
	 */
	public boolean update(IUpdateContext context) {
		boolean update = super.update(context);
		
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		GraphicsAlgorithm gaLine = findLine(pictogramElement);
		
		if (bo instanceof EaSupportFlow) {
			EaSupportFlow flow = (EaSupportFlow) bo;
			if (EaResourceRole.RESPONSIBLE_FOR == flow.getResourceRole()) {
				gaLine.setStyle(EaStyleUtil.getStyleSupportFlowResponsableFor(getDiagram()));
			} else if (EaResourceRole.PARTICIPATES_IN == flow.getResourceRole()) {
				gaLine.setStyle(EaStyleUtil.getStyleSupportFlowParticipatIn(getDiagram()));
			} else {
				gaLine.setStyle(EaStyleUtil.getStyleTextFlow(getDiagram()));
			}
			gaLine.setLineStyle(gaLine.getStyle().getLineStyle());
			gaLine.setLineWidth(gaLine.getStyle().getLineWidth());
		} else {
			update = false;
		}
		
		return update;
	}

	/**
	 * Find PictogramElement of line
	 * @param connectionDecorator
	 * @return
	 */
	private GraphicsAlgorithm findLine(PictogramElement pictogramElement) {
		if (pictogramElement instanceof ConnectionDecorator) {
			ConnectionDecorator connectionDecorator = (ConnectionDecorator)pictogramElement;
			if (connectionDecorator.eContainer() instanceof FreeFormConnection) {
				FreeFormConnection connection = (FreeFormConnection) connectionDecorator.eContainer();
				return connection.getGraphicsAlgorithm();
			}
		} else if (pictogramElement instanceof FreeFormConnection) {
			FreeFormConnection connection = (FreeFormConnection) pictogramElement;
			return connection.getGraphicsAlgorithm();
		}
		return pictogramElement.getGraphicsAlgorithm();
	}

	/**
	 * Check whether the values in the pictogram element are up to date, that
	 * means whether the graphics algorithm of this pictogram element contain
	 * the latest values from the business objects.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return true if parts of the pictogram model needs to be updated with the
	 *         latest values from the business model
	 */
	@Override
	public IReason updateNeeded(IUpdateContext context) {
		IReason updateNeeded = super.updateNeeded(context);
		
		if (!updateNeeded.toBoolean()) {
			// if not need update verify teh resource Role
			PictogramElement pictogramElement = context.getPictogramElement();
			Object bo = getBusinessObjectForPictogramElement(pictogramElement);
			GraphicsAlgorithm gaLine = findLine(pictogramElement);
			// find style
			Style styleGa = gaLine.getStyle();
			
			if (bo instanceof EaSupportFlow && null != styleGa) {
				EaSupportFlow flow = (EaSupportFlow) bo;
				if (EaResourceRole.RESPONSIBLE_FOR == flow.getResourceRole()
						&& !"SUPPORT_FLOW_RESPONSABLE_FOR".equals(styleGa.getId())) {
					updateNeeded = Reason.createTrueReason("Role is out of date");
				} else if (EaResourceRole.PARTICIPATES_IN == flow.getResourceRole()
						&& !"SUPPORT_FLOW_PARTICIPATE_IN".equals(styleGa.getId())) {
					updateNeeded = Reason.createTrueReason("Role is out of date");
				}
			} if (null == styleGa) {
				updateNeeded = Reason.createTrueReason("Role is out of date");
			}
		}
		return updateNeeded;
	}

}
