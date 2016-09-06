package org.msee.slmtoolbox.modeling.editor.eaStar.features.organization;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.diagram.EaGraphitiDiagramEditor;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

public class EaMoveShapeOrganizationFeature extends DefaultMoveShapeFeature {

	/**
	 * Default constructor
	 * @param fp
	 */
	public EaMoveShapeOrganizationFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * @return Eastar app service
	 */
	protected EAStarAppService getAppService() {
		return ((EaGraphitiDiagramEditor)getDiagramEditor()).getAppService();
	}

	/**
	 * Move shape.
	 * 
	 * @param context
	 *            the context
	 */
	@Override
	public void moveShape(IMoveShapeContext context) {
		super.moveShape(context);
		// for a business object linked
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		// if is a EaOrganization
		if (bo instanceof EaOrganization) {
			// Refresh and Add node to the organization
			EaUtils.refreshAndAddNodeToOrganization(getFeatureProvider(), getDiagram(), (EaOrganization) bo, getAppService());
		}
	}

}
