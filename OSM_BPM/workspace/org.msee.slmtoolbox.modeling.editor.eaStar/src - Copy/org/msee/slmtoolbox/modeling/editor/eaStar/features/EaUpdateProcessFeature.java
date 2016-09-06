package org.msee.slmtoolbox.modeling.editor.eaStar.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeUpdateFeature;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

/**
 * Process update Feature for EA* editor Graphiti
 * @author fto
 */
public class EaUpdateProcessFeature extends AbstractMseeUpdateFeature<EAStarAppService> {

	/**
	 * default constructor
	 * @param fp
	 */
	public EaUpdateProcessFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Checks whether the values of the current pictogram element of the given
	 * context can be updated.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return true if update is possible
	 */
	public boolean canUpdate(IUpdateContext context) {
		// return true, if linked business object is a EClass
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		return (bo instanceof EaProcess);
	}


    /**
     * If need an update
	 * @param context for update
     */
    public IReason updateNeeded(IUpdateContext context) {
        return Reason.createTrueReason("");
    }
 
    /***
     * Update graphic element
	 * @param context for update
     */
    public boolean update(IUpdateContext context) {
        // retrieve name from business model
        PictogramElement pictogramElement = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        // update bsm data
        if (bo instanceof EaProcess) {
            getAppService().update((EaProcess)bo);
        }
        
        return false;
    }
    
}