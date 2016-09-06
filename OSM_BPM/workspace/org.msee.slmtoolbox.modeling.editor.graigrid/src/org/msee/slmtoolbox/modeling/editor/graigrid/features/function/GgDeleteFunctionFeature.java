package org.msee.slmtoolbox.modeling.editor.graigrid.features.function;

import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.impl.DeleteContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGridSize;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.DefaultMseeDeleteFeature;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;

/**
 *  Management class of the delete Function action 
 * @author fto
 */
public class GgDeleteFunctionFeature  extends DefaultMseeDeleteFeature<GgAppService> {
	
	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public GgDeleteFunctionFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Can deleted an function
	 * @param context for deleted
	 */
	public boolean canDelete(IDeleteContext context) {
		boolean canDelete = true;
		PictogramElement pictogramElement = context.getPictogramElement();
		Object object = getBusinessObjectForPictogramElement(pictogramElement);
		
		if(canDelete) {
			// Prevent Delete if GraiGrid contains only 3 functions
			ContainerShape containerShape = (ContainerShape) pictogramElement.eContainer();
			int nbFunctionGrai = 0;
			for (Shape child : containerShape.getChildren()) {
				object = getBusinessObjectForPictogramElement(child);
				if (object instanceof GgFunction) {
					nbFunctionGrai++;
				}
			}
			canDelete = (nbFunctionGrai > GgUtilsGridSize.NB_MIN_FUNCTION);
		}
		return canDelete;
	}

	/**
	 * Delete an function
	 * @param context for deleted
	 */
	public void preDelete(IDeleteContext context) {
		// For the EnterpriseFunction
		PictogramElement pictogramElement = context.getPictogramElement();
		GgFunction objectDeleted = (GgFunction) getBusinessObjectForPictogramElement(pictogramElement);
		
		System.out.println("Supp F " + objectDeleted.getName());

		String idFunction = objectDeleted.getId();
		// Find element center on the diagram
		Diagram diagram = getDiagram();
		for (int index = diagram.getChildren().size() - 1; index >=0 ; index -- ) {
			Shape childShape = diagram.getChildren().get(index);
			Object objectChild = getBusinessObjectForPictogramElement(childShape);
			// if a element attached 
			if (objectChild instanceof GgDecisionCenter) {
				GgDecisionCenter decisionCenter = (GgDecisionCenter) objectChild;
				if (decisionCenter.getFunction().getId().equals(idFunction)) {
					// delete this element
					DeleteContext contextElementAttachment = new DeleteContext(childShape);
					IDeleteFeature iDeleteFeature = getFeatureProvider().getDeleteFeature(contextElementAttachment);
					iDeleteFeature.execute(contextElementAttachment);
				}
			}
		}
		
	}
	
	/**
	 * Call for remove element, overload for a selection of function feature
	 * @param rc		context for remove
	 */
	protected void callRemove(IRemoveContext rc) {
		IRemoveFeature removeFeature = new GgRemoveFunctionFeature(getFeatureProvider());
		removeFeature.remove(rc);
	}
	
}
