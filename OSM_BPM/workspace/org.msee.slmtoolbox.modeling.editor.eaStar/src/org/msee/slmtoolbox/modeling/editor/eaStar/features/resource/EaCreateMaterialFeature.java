package org.msee.slmtoolbox.modeling.editor.eaStar.features.resource;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.jface.window.Window;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaCreateFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.resource.CreateEaMaterialDialog;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaMaterialResource;


public class EaCreateMaterialFeature extends AbstractEaCreateFeature {
	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaCreateMaterialFeature(IFeatureProvider fp) {
		// set name and description of the creation feature
		super(fp, "Material Resource", "Create Material Resource");
	}
	
	/**
	 * Gets the create image id.
	 * 
	 * @return image for UI representation
	 */
	@Override
	public String getCreateImageId() {
		return EaImageProvider.IMG_MATERIAL_RESOURCE;
	}

	/**
	 * Checks if business object can be created for the given context.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return true if create is possible.
	 */
	public boolean canCreate(ICreateContext context) {
		if (super.canCreate(context)) {
			return getAppService().canHaveResource(getOrganization(context));
		}
		return false;
	}

	/**
	 * Creates the business object for the given context.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return the newly created objects
	 */
	public Object[] create(ICreateContext context) {
		// new material to add to diagram
		EaMaterialResource material = null;
		CreateEaMaterialDialog dialog = 
				new CreateEaMaterialDialog(UtilsWizards.getShell(),
						findProcess(), getAppService(), getOrganization(context));
		int retDialog = dialog.open();
		if (retDialog == Window.OK) {
			material = dialog.getResource();
		}
		if (material == null) {
			return EMPTY;
		}
		
		// do the add
		addGraphicalRepresentation(context, material);

		// return newly created business object(s)
		return new Object[] { material };
	}

}
