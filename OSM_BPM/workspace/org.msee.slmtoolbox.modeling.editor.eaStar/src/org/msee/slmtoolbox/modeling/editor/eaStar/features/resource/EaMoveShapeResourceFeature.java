package org.msee.slmtoolbox.modeling.editor.eaStar.features.resource;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.DefaultEaMoveShapeFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;

/**
 * Feature for move shape Resource
 * @author fto
 *
 */
public class EaMoveShapeResourceFeature extends DefaultEaMoveShapeFeature {
	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaMoveShapeResourceFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Can move shape.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return true, if successful
	 */
	@Override
	public boolean canMoveShape(IMoveShapeContext context) {
		if (super.canMoveShape(context)) {
			return getAppService().canHaveResource(getOrganization(context));
		}
		return false;
	}
	
	protected EaOrganization getOrganization(IMoveShapeContext context) {
		ContainerShape shape = context.getTargetContainer();
		Object bo = getBusinessObjectForPictogramElement(shape);
		EaOrganization organization = null;
		if (bo instanceof EaOrganization) {
			organization = (EaOrganization) bo;
		}
		// get default organization
		if(null == organization) {
			organization = EaUtils.getDefaultOrganization(getFeatureProvider(), getDiagram());
		}
		return organization;
	}

}
