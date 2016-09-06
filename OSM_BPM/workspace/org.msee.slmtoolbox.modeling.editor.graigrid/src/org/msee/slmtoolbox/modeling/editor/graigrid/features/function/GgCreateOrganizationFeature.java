package org.msee.slmtoolbox.modeling.editor.graigrid.features.function;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.jface.window.Window;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.graigrid.GraiGridImageProvider;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.AbstractGgCreateFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.PropertiesGraiGrid.OrganizationProperties;
import org.msee.slmtoolbox.modeling.editor.graigrid.wizards.dialog.CreateGgOrganizationDialog;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;

/**
 *  Management class of the create Organization action 
 * @author fto
 */
public class GgCreateOrganizationFeature extends AbstractGgCreateFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public GgCreateOrganizationFeature(IFeatureProvider fp) {
		// set name and description of the creation feature
		super(fp, OrganizationProperties.MENU_ENTRY_NAME , OrganizationProperties.MENU_ENTRY_TOOLTIP);
	}
	
	/**
	 * get the menu entry image key in GraiGridImageProvider
	 */
	public String getCreateImageId() {
		return GraiGridImageProvider.IMG_16_ORGANIZATION;
	}

	/**
	 * Can create an function
	 * @param context for create
	 */
	public boolean canCreate(ICreateContext context) {
		return true;
	}


	/**
	 * Create an function
	 * @param context for create
	 */
	public Object[] create(ICreateContext context) {
		// new function to add to diagram
		GgOrganization newOrganization = null;
		CreateGgOrganizationDialog dialog = 
				new CreateGgOrganizationDialog(UtilsWizards.getShell(), findGraiGrid(), getAppService());
		int retDialog = dialog.open();
		if (retDialog == Window.OK) {
			newOrganization = dialog.getOrganization();
		}
		if (newOrganization == null) {
			return EMPTY;
		}
		
		// do the add
		addGraphicalRepresentation(context, newOrganization);
		for (GgFunction function : newOrganization.getFunctions()) {
			addGraphicalRepresentation(context, function);
		}
		
		// return newly created business object(s)
		return new Object[] { newOrganization };
	}

}
