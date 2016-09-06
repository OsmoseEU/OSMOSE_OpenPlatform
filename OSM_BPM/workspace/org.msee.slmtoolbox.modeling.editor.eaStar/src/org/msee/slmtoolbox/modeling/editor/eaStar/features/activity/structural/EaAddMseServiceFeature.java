package org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.structural;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Image;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.jface.window.Window;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaCustomFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.ConstantesEAStarActivity;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.activity.AddMseServiceToActivityDialog;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.activity.UpdateMseServiceToActivityDialog;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;

/**
 * Class for add MseService feature
 * @author fto
 *
 */
public class EaAddMseServiceFeature  extends AbstractEaCustomFeature {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaAddMseServiceFeature(IFeatureProvider fp) {
		// set name and description of the creation feature
		super(fp);
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
    @Override
    public String getName() {
          return "MSE Service Wizard";
    }

	/**
	 * Gets the description.
	 * 
	 * @return the description
	 */
    @Override
    public String getDescription() {
          return "Open the MSE Service Wizard";
    }


	/**
	 * Gets the image id.
	 * 
	 * @return the image id
	 */
    @Override
    public String getImageId() {
          return EaImageProvider.IMG_MSE_SERVICE;
    }
    
	/**
	 * Can execute.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return true, if successful
	 */
    @Override
    public boolean canExecute(ICustomContext context) {
          boolean ret = false;
          PictogramElement[] pes = context.getPictogramElements();
          if (pes != null && pes.length == 1) {
                Object bo = getBusinessObjectForPictogramElement(pes[0]);
                ret = bo instanceof EaStructuralExtendedActivity;
          }
          return ret;
    }
	
	@Override
	public void execute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof EaStructuralExtendedActivity) {
            	// call wizard
            	EaStructuralExtendedActivity activity = (EaStructuralExtendedActivity)bo;

            	if (this.getAppService().haveMseService(activity)) {
            		new UpdateMseServiceToActivityDialog(UtilsWizards.getShell(),
	        						activity, getAppService());
            	} else {
	            	AddMseServiceToActivityDialog dialog = 
	        				new AddMseServiceToActivityDialog(UtilsWizards.getShell(),
	        						activity, getAppService());
	        		int retDialog = dialog.getCodeResponse();
	        		
	        		if (retDialog == Window.OK) {
	            		addIconMseService((ContainerShape)pes[0]);
	        		}
            	}
            }
        }
	}


	private void addIconMseService(ContainerShape container) {
		Shape shape = null;
		if (container.getChildren().size()> ConstantesEAStarActivity.STRUCUTRAL_ICON_ID) {
			shape = container.getChildren().get(ConstantesEAStarActivity.STRUCUTRAL_ICON_ID);
		} else if (container.getChildren().size() == ConstantesEAStarActivity.STRUCUTRAL_ICON_ID) {
			IPeCreateService peCreateService = Graphiti.getPeCreateService();
			shape = peCreateService.createShape(container, false);
		}
		
		if (null != shape) {
			// create service
	        IGaService gaService = Graphiti.getGaService();
	        
			GraphicsAlgorithm activityGA = container.getGraphicsAlgorithm();
	    	Image img = gaService.createImage(shape, EaImageProvider.IMG_MSE_SERVICE_PLUS);
	    	gaService.setLocationAndSize(img, 
	    			activityGA.getWidth() - ConstantesEAStarActivity.STRUCUTRAL_ICON_SIZE - ConstantesEAStarActivity.EXTERN_ANCHOR_SIZE - ConstantesEAStarActivity.TEXT_MARGE,
	    			activityGA.getHeight() - ConstantesEAStarActivity.STRUCUTRAL_ICON_SIZE - ConstantesEAStarActivity.EXTERN_ANCHOR_SIZE - ConstantesEAStarActivity.TEXT_MARGE,
	    			ConstantesEAStarActivity.STRUCUTRAL_ICON_SIZE, 
	    			ConstantesEAStarActivity.STRUCUTRAL_ICON_SIZE);
		}

	}

}
