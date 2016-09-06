package org.msee.slmtoolbox.modeling.editor.eaStar.features.organization;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.diagram.EaGraphitiDiagramEditor;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

/**
 * The Class DefaultResizeShapeFeature for Ea star
 * @author fto
 *
 */
public class EaResizeSHapeOrganizationFeature extends DefaultResizeShapeFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public EaResizeSHapeOrganizationFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * @return Eastar app service
	 */
	protected EAStarAppService getAppService() {
		return ((EaGraphitiDiagramEditor)getDiagramEditor()).getAppService();
	}

	/**
	 * Resize shape.
	 * 
	 * @param context
	 *            the context
	 */
	public void resizeShape(IResizeShapeContext context) {
		super.resizeShape(context);
		// for a business object linked
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		// if is a EaOrganization
		if (bo instanceof EaOrganization) {
			// Refresh and Add node to the organization
			EaUtils.refreshAndAddNodeToOrganization(getFeatureProvider(), getDiagram(), (EaOrganization) bo, getAppService());
		}
	}

}
