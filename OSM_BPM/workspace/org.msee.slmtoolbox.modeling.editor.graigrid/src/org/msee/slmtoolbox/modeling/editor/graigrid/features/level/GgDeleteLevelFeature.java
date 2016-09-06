package org.msee.slmtoolbox.modeling.editor.graigrid.features.level;

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
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;


/**
 *  Management class of the delete Level action 
 * @author nco
 */
public class GgDeleteLevelFeature extends DefaultMseeDeleteFeature<GgAppService> {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public GgDeleteLevelFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Can deleted a level
	 * @param context for deleted
	 */
	public boolean canDelete(IDeleteContext context) {
		boolean canDelete = true;
		PictogramElement pictogramElement = context.getPictogramElement();
		Object object = getBusinessObjectForPictogramElement(pictogramElement);
		
		if(canDelete) {
			// Prevent Delete if GraiGrid contains only 3 functions
			ContainerShape containerShape = (ContainerShape) pictogramElement.eContainer();
			int nbLevel = 0;
			for (Shape child : containerShape.getChildren()) {
				object = getBusinessObjectForPictogramElement(child);
				if (object instanceof GgLevel) {
					nbLevel++;
				}
			}
			canDelete = (nbLevel > GgUtilsGridSize.NB_MIN_LEVEL);
		}
		return canDelete;
	}

	/**
	 * Delete a level
	 * @param context for deleted
	 */
	public void preDelete(IDeleteContext context) {
		// For the Level
		PictogramElement pictogramElement = context.getPictogramElement();
		GgLevel objectDeleted = (GgLevel) getBusinessObjectForPictogramElement(pictogramElement);
		String idLevel = objectDeleted.getId();
		
		System.out.println("Supp L " + objectDeleted.getName());

		// Find element center on the diagram
		Diagram diagram = getDiagram();
		for (int index = diagram.getChildren().size() - 1; index >=0 ; index -- ) {
			Shape childShape = diagram.getChildren().get(index);
			Object objectChild = getBusinessObjectForPictogramElement(childShape);
			// if a element attached 
			if (objectChild instanceof GgNode) {
				GgNode center = (GgNode) objectChild;
				if (center.getLevel().getId().equals(idLevel)) {
					// delete this element
					DeleteContext contextElementAttachment = new DeleteContext(childShape);
					IDeleteFeature iDeleteFeature = getFeatureProvider().getDeleteFeature(contextElementAttachment);
					iDeleteFeature.execute(contextElementAttachment);
				}
			}
		}
		
	}
	
	/**
	 * Call for remove element, overload for a selection of level feature
	 * @param rc		context for remove
	 */
	protected void callRemove(IRemoveContext rc) {
		IRemoveFeature removeFeature = new GgRemoveLevelFeature(getFeatureProvider());
		removeFeature.remove(rc);
	}
}
