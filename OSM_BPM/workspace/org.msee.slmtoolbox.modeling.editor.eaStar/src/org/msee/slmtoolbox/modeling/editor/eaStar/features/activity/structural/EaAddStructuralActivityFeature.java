package org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.structural;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.AbstractEaAddActivityFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.ConstantesEAStarActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;

/**
 * Class for structural activity add feature
 * @author fto
 *
 */
public class EaAddStructuralActivityFeature extends AbstractEaAddActivityFeature {

	/**
	 * Default constructor
	 * @param fp
	 */
	public EaAddStructuralActivityFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Create a Image for a structual activity
	 * @param gaService 
	 * @param roundedRectangle
	 * @param width
	 * @param height
	 */
	@Override
	protected void createImageForActivity(IPeCreateService peCreateService, IGaService gaService, ContainerShape containerShape,EaExtendedActivity addedNode) {
		Shape shape = peCreateService.createShape(containerShape, false);
    	Image img;
		if (getAppService().haveMseService(addedNode)) {
	    	img = gaService.createImage(shape, EaImageProvider.IMG_MSE_SERVICE_PLUS);
		} else {
	    	img = gaService.createImage(shape, EaImageProvider.IMG_PLUS_SIGN);
		}
    	gaService.setLocationAndSize(img, 
    			ConstantesEAStarActivity.GRAPHIC_WIDTH- ConstantesEAStarActivity.STRUCUTRAL_ICON_SIZE - ConstantesEAStarActivity.EXTERN_ANCHOR_SIZE - ConstantesEAStarActivity.TEXT_MARGE,
    			ConstantesEAStarActivity.GRAPHIC_HEIGHT- ConstantesEAStarActivity.STRUCUTRAL_ICON_SIZE - ConstantesEAStarActivity.EXTERN_ANCHOR_SIZE - ConstantesEAStarActivity.TEXT_MARGE,
    			ConstantesEAStarActivity.STRUCUTRAL_ICON_SIZE, ConstantesEAStarActivity.STRUCUTRAL_ICON_SIZE);
		
	}
}
