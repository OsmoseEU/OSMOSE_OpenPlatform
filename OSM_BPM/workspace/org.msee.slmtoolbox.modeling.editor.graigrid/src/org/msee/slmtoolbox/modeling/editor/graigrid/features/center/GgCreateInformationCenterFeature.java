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
import org.msee.slmtoolbox.modeling.editor.graigrid.wizards.dialog.CreateGgInformationCenterDialog;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;


public class GgCreateInformationCenterFeature  extends AbstractGgCreateFeature {

	public GgCreateInformationCenterFeature(IFeatureProvider fp) {
		// set name and description of the creation feature
		super(fp, CenterProperties.MENU_ENTRY_NAME_INFORMATION, CenterProperties.MENU_ENTRY_TOOLTIP_INFORMATION);
	}
	
	public String getCreateImageId() {
		return GraiGridImageProvider.IMG_16_INFORMATION_CENTER;
	}

	public boolean canCreate(ICreateContext context) {
		boolean canCreate = true;
		// find level and function for a context
		GgLevel level = GgUtilsGrid.findLevel(getFeatureProvider(),context.getTargetContainer());
		GgInformationSource informationSource = GgUtilsGrid.findInformationSource(getFeatureProvider(),context.getTargetContainer(),context.getX());
		// if center exist 
		if (null != informationSource && null != level) {
			// for all center
			for (GgInformationCenter center : informationSource.getInformationCenters()) {
				// if center have the level 
				if (level.getNodes().contains(center)) {
					// the center is at the informationSource and level. Can't create a new center.
					canCreate = false;
				}
			}
		} else {
			canCreate = false;
		}
		return canCreate;
	}

	public Object[] create(ICreateContext context) {
		// Get function
		GgInformationSource infoSource = (GgInformationSource) GgUtilsGrid.findObjectOnAxeX(this.getFeatureProvider(), context.getX() 
        		- GgUtilsGridSize.SIZE_LEVEL_HEAD_WIDTH);
		// Get level
		GgLevel level = (GgLevel) GgUtilsGrid.findObjectOnAxeY(this.getFeatureProvider(), context.getY()
        		+ context.getTargetContainer().getGraphicsAlgorithm().getY());
		// new center to add to diagram
		GgInformationCenter newCenter = null;
		CreateGgInformationCenterDialog dialog = 
				new CreateGgInformationCenterDialog(UtilsWizards.getShell(),
						infoSource, level, findGraiGrid(),
						getAppService());
		int retDialog = dialog.open();
		if (retDialog == Window.OK) {
			newCenter = dialog.getInformationCenter();
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
