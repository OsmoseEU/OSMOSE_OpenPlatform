package org.msee.slmtoolbox.modeling.editor.eaStar.features.custom;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;

public class EaUpToDiagramFeature extends AbstractEaOpenDiagramFeature {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaUpToDiagramFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Gets the image id.
	 * 
	 * @return the image id
	 */
    @Override
    public String getImageId() {
          return EaImageProvider.IMG_UP;
    }

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
    @Override
    public String getName() {
          return "Up";
    }

	/**
	 * Gets the description.
	 * 
	 * @return the description
	 */
    @Override
    public String getDescription() {
          return "Up to the EaStar diagram";
    }

    @Override
    public boolean canExecute(ICustomContext context) {
    	// init contexte
    	reset();

    	// find process
    	EaProcess process = EaUtils.findProcess(getFeatureProvider(), getDiagram());
    	// find file
		IFile file = getAppService().findMainProcessFile(new ResourceSetImpl(), process.getId());
		if (null != file) {
			setFile(new IFile[]{file});
		}
    	
    	// can execute if file existed
    	return isFile();
    }
    

	/**
	 * Execute if not find a file
	 * @param context feature context
	 */
    public void executeWithoutFile(ICustomContext context) {
    	
    }


}
