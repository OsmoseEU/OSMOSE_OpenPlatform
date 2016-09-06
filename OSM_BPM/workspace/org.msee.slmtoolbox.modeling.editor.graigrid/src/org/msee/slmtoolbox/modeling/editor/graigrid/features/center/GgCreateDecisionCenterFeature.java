package org.msee.slmtoolbox.modeling.editor.graigrid.features.center;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.jface.window.Window;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.graigrid.GraiGridImageProvider;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.AbstractGgCreateFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.PropertiesGraiGrid.CenterProperties;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGrid;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGridSize;
import org.msee.slmtoolbox.modeling.editor.graigrid.wizards.dialog.CreateGgDecisionCenterDialog;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;

/**
 *  Management class of the create Decision Center action 
 * @author fto
 */
public class GgCreateDecisionCenterFeature  extends AbstractGgCreateFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public GgCreateDecisionCenterFeature(IFeatureProvider fp) {
		// set name and description of the creation feature
		super(fp, CenterProperties.MENU_ENTRY_NAME_DECISION , CenterProperties.MENU_ENTRY_TOOLTIP_DECISION);
	}

	public String getCreateImageId() {
		return GraiGridImageProvider.IMG_16_DECISION_CENTER;
	}

	public boolean canCreate(ICreateContext context) {
		boolean canCreate = true;
		// find level and function for a context
		GgLevel level = GgUtilsGrid.findLevel(getFeatureProvider(),context.getTargetContainer());
		GgFunction function = GgUtilsGrid.findFunction(getFeatureProvider(),context.getTargetContainer(),context.getX());
		// if function and level exist
		if (null != function && null != level) {
			// for all center
			for (GgDecisionCenter center : function.getDecisionCenters()) {
				if (level.getNodes().contains(center)) {
					// the center is at the intersection of function and level. Can't create a new center.
					canCreate = false;
				}
			}
		} else {
			canCreate = false;
		}
		return canCreate;
	}

	/**
	 * Create a decision center
	 * @param context for create
	 */
	public Object[] create(ICreateContext context) {
		// Get function
		GgFunction function = (GgFunction) GgUtilsGrid.findObjectOnAxeX(this.getFeatureProvider(), context.getX() 
        		- GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH);
		// Get level
		GgLevel level = (GgLevel) GgUtilsGrid.findObjectOnAxeY(this.getFeatureProvider(), context.getY()
        		+ context.getTargetContainer().getGraphicsAlgorithm().getY());
		// new center to add to diagram
		GgDecisionCenter newCenter = null;
		CreateGgDecisionCenterDialog dialog = 
				new CreateGgDecisionCenterDialog(UtilsWizards.getShell(),
						function, level, findGraiGrid(),
						getAppService());
		int retDialog = dialog.open();
		if (retDialog == Window.OK) {
			newCenter = dialog.getDecisionCenter();
		}
		if (newCenter == null) {
			return EMPTY;
		}
		
		// do the add
		addGraphicalRepresentation(context, newCenter);
		// return newly created business object(s)
		return new Object[] { newCenter };
	}

}
