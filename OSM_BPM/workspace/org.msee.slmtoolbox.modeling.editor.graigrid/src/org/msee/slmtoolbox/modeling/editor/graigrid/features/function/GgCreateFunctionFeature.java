package org.msee.slmtoolbox.modeling.editor.graigrid.features.function;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.jface.window.Window;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.graigrid.GraiGridImageProvider;
import org.msee.slmtoolbox.modeling.editor.graigrid.features.AbstractGgCreateFeature;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.PropertiesGraiGrid.FunctionProperties;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGrid;
import org.msee.slmtoolbox.modeling.editor.graigrid.wizards.dialog.CreateGgFunctionDialog;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;

/**
 *  Management class of the create Function action 
 * @author fto
 */
public class GgCreateFunctionFeature extends AbstractGgCreateFeature {
	
	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public GgCreateFunctionFeature(IFeatureProvider fp) {
		// set name and description of the creation feature
		super(fp, FunctionProperties.MENU_ENTRY_NAME , FunctionProperties.MENU_ENTRY_TOOLTIP);
	}
	
	/**
	 * get the menu entry image key in GraiGridImageProvider
	 */
	public String getCreateImageId() {
		return GraiGridImageProvider.IMG_16_FUNCTION;
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
		GgFunction newFunction = null;
		GgOrganization organization = GgUtilsGrid.findOrganization(getFeatureProvider(), getDiagram(), context);
		CreateGgFunctionDialog dialog = 
				new CreateGgFunctionDialog(UtilsWizards.getShell(), findGraiGrid(), organization,
						getAppService());
		int retDialog = dialog.open();
		if (retDialog == Window.OK) {
			newFunction = dialog.getFunction();
		}
		if (newFunction == null) {
			return EMPTY;
		}
		
		// do the add
		addGraphicalRepresentation(context, newFunction);
		// return newly created business object(s)
		return new Object[] { newFunction };
	}
}
