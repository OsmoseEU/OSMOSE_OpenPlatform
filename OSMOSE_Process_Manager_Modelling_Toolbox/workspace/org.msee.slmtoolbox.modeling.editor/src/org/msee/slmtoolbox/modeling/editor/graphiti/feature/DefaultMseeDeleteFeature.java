package org.msee.slmtoolbox.modeling.editor.graphiti.feature;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IMultiDeleteInfo;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.context.impl.RemoveContext;
import org.eclipse.graphiti.features.impl.DefaultRemoveFeature;
import org.eclipse.graphiti.mm.pictograms.CompositeConnection;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.DefaultDeleteFeature;
import org.msee.slmtoolbox.modeling.editor.graphiti.diagram.AbstractMseeGraphitiDiagramEditor;
import org.msee.slmtoolbox.modeling.service.app.AbstractAppService;

/**
 * Default delete Feature for MSeE editor Graphiti
 * @author fto
 * @param <S> define the editor AppService
 */
public class DefaultMseeDeleteFeature<S extends AbstractAppService> extends DefaultDeleteFeature {

	/**
	 * Default constructor 
	 * @param fp
	 *            the feature provider
	 */
	public DefaultMseeDeleteFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Can delete hook. Needs to be implemented in order to decide if a feature
	 * can (and wants to) handle a delete request.
	 * 
	 * @param context
	 *            the context describing the request
	 * 
	 * @return <code>true</code>, if the feature can perform the delete
	 *         operation
	 */
	public boolean canDelete(IDeleteContext context) {
		return !(context.getPictogramElement() instanceof Diagram);
	}
	
	/**
	 * Implement the default delete functionality.
	 * @param context the context
	 */
	public void delete(IDeleteContext context) {
		// we need this reset, since the an instance of this feature can be
		// used multiple times, e.g. as a part of a pattern
		setDoneChanges(false);

		IMultiDeleteInfo multiDeleteInfo = context.getMultiDeleteInfo();
		if (multiDeleteInfo != null && multiDeleteInfo.isDeleteCanceled()) {
			return;
		}
		PictogramElement pe = context.getPictogramElement();
		Object[] businessObjectsForPictogramElement = getAllBusinessObjectsForPictogramElement(pe);
		if (businessObjectsForPictogramElement != null && businessObjectsForPictogramElement.length > 0) {
			if (multiDeleteInfo == null) {
				if (!getUserDecision(context)) {
					return;
				}
			} else {
				if (multiDeleteInfo.isShowDialog()) {
					boolean okPressed = getUserDecision(context);
					if (okPressed) {
						// don't show further dialogs
						multiDeleteInfo.setShowDialog(false);
					} else {
						multiDeleteInfo.setDeleteCanceled(true);
						return;
					}
				}
			}
		}

		preDelete(context);
		if (pe instanceof CompositeConnection) {
			// Find all domain objects for the children connections of the
			// composite connection...
			List<Object> compositeChildConnectionsBOs = collectCompositeConnectionsBOs((CompositeConnection) pe);
			// ... and add them to the list of BOs to delete (no duplicates)
			for (Object object : businessObjectsForPictogramElement) {
				if (!compositeChildConnectionsBOs.contains(object)) {
					compositeChildConnectionsBOs.add(object);
				}
			}
			// Update BOs to delete
			businessObjectsForPictogramElement = compositeChildConnectionsBOs
					.toArray(new Object[compositeChildConnectionsBOs.size()]);
		}
		
		// Change default call of remove of DefaultDeleteFeature 
		IRemoveContext rc = new RemoveContext(pe);
		callRemove(rc);
		setDoneChanges(true);
		
		deleteBusinessObjects(businessObjectsForPictogramElement);

		postDelete(context);
	}

	/**
	 * Call for remove element, overload for a selection of special feature
	 * @param rc		context for remove
	 */
	protected void callRemove(IRemoveContext rc) {
		IRemoveFeature removeFeature = new DefaultRemoveFeature(getFeatureProvider());
		removeFeature.remove(rc);
	}

	private List<Object> collectCompositeConnectionsBOs(CompositeConnection composite) {
		List<Object> result = new ArrayList<Object>();
		for (Connection childConnection : composite.getChildren()) {
			Object[] allBusinessObjectsForChildConnection = getAllBusinessObjectsForPictogramElement(childConnection);
			for (Object object : allBusinessObjectsForChildConnection) {
				if (!result.contains(object)) {
					result.add(object);
				}
			}
		}
		return result;
	}
	
	/**
	 * @return MSeE app service
	 */
	@SuppressWarnings("unchecked")
	protected S getAppService() {
		return ((AbstractMseeGraphitiDiagramEditor<S>)getDiagramEditor()).getAppService();
	}

	/**
	 * @return resource for data
	 */
	protected Resource getDataResource() {
		return ((AbstractMseeGraphitiDiagramEditor<?>) getDiagramEditor()).getResource();
	}


}
