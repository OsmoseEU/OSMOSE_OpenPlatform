package org.msee.slmtoolbox.modeling.editor.graigrid.features.center;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.msee.slmtoolbox.modeling.editor.graigrid.GraiGridImageProvider;
import org.msee.slmtoolbox.modeling.editor.graigrid.diagram.GgGraphitiDiagramEditor;
import org.msee.slmtoolbox.modeling.editor.graigrid.wizards.decision.DecisionDialog;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;

/**
 * GraiGrid class to create a MSeE feature for paint element
 * @author fto
 */
public class GgPiFeature extends AbstractCustomFeature {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
    public GgPiFeature(IFeatureProvider fp) {
          super(fp);
    }

	/**
	 * Gets the image id.
	 * 
	 * @return the image id
	 */
    @Override
    public String getImageId() {
          return GraiGridImageProvider.IMG_16_PI;
    }
    

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
    @Override
    public String getName() {
          return "Performance Indicators";
    }

	/**
	 * Gets the description.
	 * 
	 * @return the description
	 */
    @Override
    public String getDescription() {
          return "Define Performance Indicators";
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
                ret = bo instanceof GgDecisionCenter;
          }
          return ret;
    }

	@Override
    public boolean isAvailable(IContext context) {
          return true;
    }

	/**
	 * Execute.
	 * 
	 * @param context
	 *            the context
	 */
    @Override
    public void execute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();

        if (pes != null && pes.length == 1) {
              Object bo = getBusinessObjectForPictogramElement(pes[0]);
              DecisionDialog decisionFrame = new DecisionDialog(getAppService(), (GgDecisionCenter) bo);
              decisionFrame.setVisible(true);
        }
    }

	/**
	 * @return MSeE app service
	 */
	protected GgAppService getAppService() {
		return ((GgGraphitiDiagramEditor)getDiagramEditor()).getAppService();
	}
}
