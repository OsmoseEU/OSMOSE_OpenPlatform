package org.msee.slmtoolbox.modeling.editor.graigrid.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.DefaultMseeDeleteFeature;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;

/**
 * Default delete Feature for MSeE editor Graphiti
 * @author fto
 */
public class GgDefaultDeleteFeature extends DefaultMseeDeleteFeature<GgAppService> {

	/**
	 * Default constructor 
	 * @param fp
	 *            the feature provider
	 */
	public GgDefaultDeleteFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Standard functionality to delete one domain object. Will delegate for
	 * {@link EObject}s to {@link EcoreUtil#delete(EObject, boolean)}; non-EMF
	 * objects will be ignored.
	 * 
	 * @param bo
	 *            the domain object to delete
	 */
	protected void deleteBusinessObject(Object bo) {
		// Delete all GraiGridFlows for a GraiGridNode
		if (bo instanceof GgNode) {
			GgNode node = (GgNode) bo;
			deleteBusinessObjects(node.getOutFlows().toArray());
			deleteBusinessObjects(node.getInFlows().toArray());
			// update data for bsm
			if (node instanceof GgDecisionCenter) {
				getAppService().removeBsm((GgDecisionCenter) node);
			} else if (node instanceof GgOrganization) {
				getAppService().removeBsm((GgOrganization) node);
			}
		}
		super.deleteBusinessObject(bo);
	}

}
