package org.msee.slmtoolbox.modeling.editor.eaStar.features.resource;


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
import org.msee.slmtoolbox.modeling.editor.eaStar.util.ConstantesEAResource;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.resource.AddMseServiceToResourceDialog;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.resource.UpdateMseServiceToResourceDialog;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;

/**
 * Class for add MseService feature
 * @author fto
 *
 */
public class EaAddMseServiceToResourceFeature  extends AbstractEaCustomFeature {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaAddMseServiceToResourceFeature(IFeatureProvider fp) {
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
          return "MSE Assets Repository Browser";
    }

	/**
	 * Gets the description.
	 * 
	 * @return the description
	 */
    @Override
    public String getDescription() {
          return "Open the MSE Assets Repository Browser";
    }


	/**
	 * Gets the image id.
	 * 
	 * @return the image id
	 */
    @Override
    public String getImageId() {
          return EaImageProvider.IMG_MSE_ASSET;
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
                ret = bo instanceof EaResource;
          }
          return ret;
    }
	
	@Override
	public void execute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
            Object bo = getBusinessObjectForPictogramElement(pes[0]);
            if (bo instanceof EaResource) {
            	// call wizard
            	EaResource resource = (EaResource)bo;

            	if (null != this.getAppService().getMseServiceToResource(resource)) {
            		new UpdateMseServiceToResourceDialog(UtilsWizards.getShell(),
            					resource, getAppService());
            	} else {
            		AddMseServiceToResourceDialog dialog = 
	        				new AddMseServiceToResourceDialog(UtilsWizards.getShell(),
	        						resource, getAppService());
	        		int retDialog = dialog.getCodeResponse();
	        		
	        		if (retDialog == Window.OK) {
	            		addIconMseAsset((ContainerShape)pes[0]);
	        		}
            	}
            }
        }
	}


	private void addIconMseAsset(ContainerShape container) {
		Shape shape = null;
		if (container.getChildren().size()> ConstantesEAResource.MSE_ICON_ID) {
			shape = container.getChildren().get(ConstantesEAResource.MSE_ICON_ID);
		} else if (container.getChildren().size() == ConstantesEAResource.MSE_ICON_ID) {
			IPeCreateService peCreateService = Graphiti.getPeCreateService();
			shape = peCreateService.createShape(container, false);
		}
		
		if (null != shape) {
			// create image
	        IGaService gaService = Graphiti.getGaService();
	        
			GraphicsAlgorithm activityGA = container.getGraphicsAlgorithm();
	    	Image img = gaService.createImage(shape, EaImageProvider.IMG_MSE_ASSET_PLUS);
	    	gaService.setLocationAndSize(img, 
	    			activityGA.getWidth() - ConstantesEAResource.MSE_ICON_SIZE - ConstantesEAResource.MARGE,
	    			ConstantesEAResource.MARGE,
	    			ConstantesEAResource.MSE_ICON_SIZE, 
	    			ConstantesEAResource.MSE_ICON_SIZE);
		}

	}

}
