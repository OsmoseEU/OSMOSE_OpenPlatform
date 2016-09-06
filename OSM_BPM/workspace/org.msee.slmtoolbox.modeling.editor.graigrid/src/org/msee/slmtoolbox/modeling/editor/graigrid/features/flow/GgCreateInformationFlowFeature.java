package org.msee.slmtoolbox.modeling.editor.graigrid.features.flow;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.msee.slmtoolbox.modeling.editor.graigrid.GraiGridImageProvider;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.PropertiesGraiGrid.InformationFlowProperties;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFlow;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;

/**
 *  Management class of the create Information Flow action 
 * @author nco
 */
public class GgCreateInformationFlowFeature extends AbstractGgCreateDefaultFlowFeature {
	
	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
    public GgCreateInformationFlowFeature (IFeatureProvider fp) {
    	// provide name and description for the UI, e.g. the palette
        super(fp, InformationFlowProperties.MENU_ENTRY_NAME, InformationFlowProperties.MENU_ENTRY_TOOLTIP);
    }
    
	/**
	 * get the menu entry image key in GraiGridImageProvider
	 */
	public String getCreateImageId() {
		return GraiGridImageProvider.IMG_16_INFORMATION_FLOW;
	}
 
    /**
    * Creates a EReference between two EClasses.
    */
    protected GgFlow createFlow(GgNode source, GgNode target) {
    	return getAppService().createInformationFlow(source, target);
   }
}