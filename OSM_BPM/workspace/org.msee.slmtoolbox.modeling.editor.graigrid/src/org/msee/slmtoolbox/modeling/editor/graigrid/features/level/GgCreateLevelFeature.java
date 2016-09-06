package org.msee.slmtoolbox.modeling.editor.graigrid.features.level;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.jface.window.Window;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.graigrid.GraiGridImageProvider;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.AbstractGgCreateFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.PropertiesGraiGrid.LevelProperties;
import org.msee.slmtoolbox.modeling.editor.graigrid.wizards.dialog.CreateGgLevelDialog;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;



/**
 *  Management class of the create Level action 
 * @author nco
 */
public class GgCreateLevelFeature extends AbstractGgCreateFeature {
	
	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public GgCreateLevelFeature(IFeatureProvider fp) {
		// set name and description of the creation feature
		super(fp, LevelProperties.MENU_ENTRY_NAME, LevelProperties.MENU_ENTRY_TOOLTIP);
	}
	
	/**
	 * get the menu entry image key in GraiGridImageProvider
	 */
	public String getCreateImageId() {
		return GraiGridImageProvider.IMG_16_LEVEL;
	}

	/**
	 * Can create a level
	 * @param context for create
	 */
	public boolean canCreate(ICreateContext context) {
		return true;
	}

	/**
	 * Create a level
	 * @param context for create
	 */
	public Object[] create(ICreateContext context) {
		// Create new Level
		GgLevel newLevel = null;
		CreateGgLevelDialog dialog = 
				new CreateGgLevelDialog(UtilsWizards.getShell(), findGraiGrid(),
						getAppService());
		int retDialog = dialog.open();
		if (retDialog == Window.OK) {
			newLevel = dialog.getLevel();
		}
		if (newLevel == null) {
			return EMPTY;
		}
		
		// do the add
		addGraphicalRepresentation(context, newLevel);
		// return newly created business object(s)
		return new Object[] { newLevel };
	}

}
