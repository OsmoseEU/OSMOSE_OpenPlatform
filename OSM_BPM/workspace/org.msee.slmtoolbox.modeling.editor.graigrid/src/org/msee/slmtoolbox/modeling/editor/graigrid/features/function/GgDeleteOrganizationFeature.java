package org.msee.slmtoolbox.modeling.editor.graigrid.features.function;

import java.util.List;

import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.impl.DeleteContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGrid;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGridSize;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.DefaultMseeDeleteFeature;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;

/**
 *  Management class of the delete Organization action 
 * @author fto
 */
public class GgDeleteOrganizationFeature  extends DefaultMseeDeleteFeature<GgAppService> {
	
	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public GgDeleteOrganizationFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Can deleted an function
	 * @param context for deleted
	 */
	public boolean canDelete(IDeleteContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		Object object = getBusinessObjectForPictogramElement(pictogramElement);
		
		// Prevent Delete if GraiGrid contains only 1 organization
		ContainerShape containerShape = GgUtilsGrid.getOrganizationsContainerShape(getDiagram());
		int nbOrganization = 0;
		for (Shape child : containerShape.getChildren()) {
			object = getBusinessObjectForPictogramElement(child);
			if (object instanceof GgOrganization) {
				nbOrganization++;
			}
		}
		return object instanceof GgOrganization
				&& (nbOrganization > GgUtilsGridSize.NB_MIN_ORGANIZATION);
	}

	/**
	 * Delete an function
	 * @param context for deleted
	 */
	public void preDelete(IDeleteContext context) {
		// For the EnterpriseFunction
		PictogramElement pictogramElement = context.getPictogramElement();
		GgOrganization objectDeleted = (GgOrganization) getBusinessObjectForPictogramElement(pictogramElement);
		// update data for bsm
		getAppService().removeBsm(objectDeleted);
		
		// For all function in orgnization
		List<GgFunction> listFunction = objectDeleted.getFunctions();
		for (int index=listFunction.size()-1; index >-1; index--) {
			// delete this element
			PictogramElement peFunction = getFeatureProvider().getPictogramElementForBusinessObject(listFunction.get(index));
			DeleteContext contextElementAttachment = new DeleteContext(peFunction);
			IDeleteFeature iDeleteFeature = getFeatureProvider().getDeleteFeature(contextElementAttachment);
			iDeleteFeature.execute(contextElementAttachment);
		}
	}
}
