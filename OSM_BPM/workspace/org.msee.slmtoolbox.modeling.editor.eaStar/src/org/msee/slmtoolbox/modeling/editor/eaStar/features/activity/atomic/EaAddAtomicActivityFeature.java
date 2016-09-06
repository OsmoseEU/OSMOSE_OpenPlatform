package org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.atomic;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.AbstractEaAddActivityFeature;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;

/**
 * Class for activity atomic add feature
 * @author fto
 *
 */
public class EaAddAtomicActivityFeature extends AbstractEaAddActivityFeature {

	/**
	 * Default constructor
	 * @param fp
	 */
	public EaAddAtomicActivityFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Create a Image for a activity
	 * @param gaService 
	 * @param roundedRectangle
	 * @param width
	 * @param height
	 */
	@Override
	protected void createImageForActivity(IPeCreateService peCreateService, IGaService gaService, ContainerShape containerShape, EaExtendedActivity addedNode) {
		// not image for this activity
	}
}
