package org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.atomic;

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
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.activity.TransformEaStructuralExtendedActivityDialog;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAtomicExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;

public class EaAtomicToStructuralFeature extends AbstractEaCustomFeature {

	public EaAtomicToStructuralFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
    @Override
    public String getName() {
          return "Transforms";
    }

	/**
	 * Gets the description.
	 * 
	 * @return the description
	 */
    @Override
    public String getDescription() {
          return "Transforms Atomic extended activity to structural extended activity";
    }


	/**
	 * Gets the image id.
	 * 
	 * @return the image id
	 */
    @Override
    public String getImageId() {
          return EaImageProvider.IMG_TRANSFORM_ACTIVITY;
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
                ret = bo instanceof EaAtomicExtendedActivity;
          }
          return ret;
    }
	
	@Override
	public void execute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof EaAtomicExtendedActivity) {
            	// call wizard
            	EaAtomicExtendedActivity oldActivity = (EaAtomicExtendedActivity)bo;
            	EaStructuralExtendedActivity newActivity = null;

            	TransformEaStructuralExtendedActivityDialog dialog = 
        				new TransformEaStructuralExtendedActivityDialog(UtilsWizards.getShell(),
        						oldActivity.getProcess(), oldActivity.getOrganization(), getAppService(), oldActivity);
        		int retDialog = dialog.open();
        		
        		if (retDialog == Window.OK) {
        			newActivity = dialog.getEaStructuralExtendedActivity();
        		}
        		
        		// if new activity
        		if (newActivity != null) {
        			//unlink pictogram and old bo
        			//link pictogram and new bo
        			link(pes[0], newActivity);
        			// copy data
        			getAppService().coptyData(oldActivity, newActivity);
        			//remove old bo
        			oldActivity.getOrganization().getFlowNode().remove(oldActivity);
        			newActivity.getProcess().getFlowElements().remove(oldActivity);
        			
        			
                	// add icon
                	if ( pes[0] instanceof ContainerShape) {
                		addIconStructural((ContainerShape)pes[0]);
                	}
        		}
        		
            }
        }
		
	}

	private void addIconStructural(ContainerShape container) {
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
	    	Image img = gaService.createImage(shape, EaImageProvider.IMG_PLUS_SIGN);
	    	gaService.setLocationAndSize(img, 
	    			activityGA.getWidth() - ConstantesEAStarActivity.STRUCUTRAL_ICON_SIZE - ConstantesEAStarActivity.EXTERN_ANCHOR_SIZE - ConstantesEAStarActivity.TEXT_MARGE,
	    			activityGA.getHeight() - ConstantesEAStarActivity.STRUCUTRAL_ICON_SIZE - ConstantesEAStarActivity.EXTERN_ANCHOR_SIZE - ConstantesEAStarActivity.TEXT_MARGE,
	    			ConstantesEAStarActivity.STRUCUTRAL_ICON_SIZE, 
	    			ConstantesEAStarActivity.STRUCUTRAL_ICON_SIZE);
		}

	}

}
