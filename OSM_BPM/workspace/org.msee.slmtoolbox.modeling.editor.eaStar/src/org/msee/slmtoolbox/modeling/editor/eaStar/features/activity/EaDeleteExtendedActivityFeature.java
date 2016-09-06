package org.msee.slmtoolbox.modeling.editor.eaStar.features.activity;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.internal.services.GraphitiInternal;
import org.eclipse.graphiti.mm.pictograms.AdvancedAnchor;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.CompositeConnection;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.DefaultMseeDeleteFeature;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

/**
 * Delete Feature for ExtendedActivity in editor EAStar
 * @author fto
 */
@SuppressWarnings("restriction")
public class EaDeleteExtendedActivityFeature extends DefaultMseeDeleteFeature<EAStarAppService> {
	
	/**
	 * ExtendedActivity's process which must be removed
	 */
	private EaProcess process;
	
	private List<Object> lisConnectionForDelete;

	/**
	 * Default constructor 
	 * @param fp
	 *            the feature provider
	 */
	public EaDeleteExtendedActivityFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Can be delete if it's an EAStarExtendedActivity
	 */
	public boolean canDelete(IDeleteContext context) {
		PictogramElement IDeleteContext = context.getPictogramElement();
		Object businessObject = getBusinessObjectForPictogramElement(IDeleteContext);
		
		return super.canDelete(context) && (businessObject instanceof EaExtendedActivity);
	}
	
	/**
	 * Select the EAStarProcess for deleted
	 * @param context	the context
	 */
	public void preDelete(IDeleteContext context) {
		PictogramElement pictogram = context.getPictogramElement();
		Object businessObject = getBusinessObjectForPictogramElement(pictogram);
		if (businessObject instanceof EaStructuralExtendedActivity) {
			EaStructuralExtendedActivity activity = (EaStructuralExtendedActivity) businessObject;
			this.process = activity.getIsA();
		}
		
		// New list for connection's BO of Activity
		this.lisConnectionForDelete = new ArrayList<>();
		if (pictogram instanceof Shape) {
			Shape shape = (Shape) pictogram;
			findAllConnectionsBo(shape);
		} else if (pictogram instanceof AdvancedAnchor) {
			findAllConnectionsBoForAnchor((AdvancedAnchor) pictogram);
		} else if (pictogram instanceof CompositeConnection) {
			findCompositeConnectionsBo((CompositeConnection) pictogram);
		}
	}

	/**
	 * Find and add the connection's BO at the list for delete.
	 * @param shape
	 *            the shape
	 */
	protected void findAllConnectionsBo(Shape shape) {
		List<Anchor> anchors = shape.getAnchors();
		for (Anchor anchor : anchors) {
			findAllConnectionsBoForAnchor(anchor);
		}
	}


	/**
	 * Find and add the connection's BO at the list for delete.
	 * @param anchor
	 *            the anchor
	 */
	protected void findAllConnectionsBoForAnchor(Anchor anchor) {
		List<Connection> allConnections = Graphiti.getPeService().getAllConnections(anchor);
		for (Connection connection : allConnections) {
			if (GraphitiInternal.getEmfService().isObjectAlive(connection)) {
				lisConnectionForDelete.add(getBusinessObjectForPictogramElement(connection));
			}
		}
	}


	/**
	 * Find and add the connection's BO at the list for delete.
	 * @param composite
	 *            the composite connection
	 */
	private void findCompositeConnectionsBo(CompositeConnection composite) {
		List<Connection> children = new ArrayList<Connection>(composite.getChildren());
		for (Connection childConnection : children) {
			if (GraphitiInternal.getEmfService().isObjectAlive(childConnection)) {
				lisConnectionForDelete.add(getBusinessObjectForPictogramElement(childConnection));
			}
		}
	}

	
	/**
	 * Deleted the process
	 * @param context	the context
	 */
	public void postDelete(IDeleteContext context) {
		// if process exist
		if (null != this.process) {
			deleteBusinessObject(this.process);
		}
		// if connection exist
		for (Object element : this.lisConnectionForDelete) {
			deleteBusinessObject(element);
		}
		
	}
}
