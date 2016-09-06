package org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.structural;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.jface.window.Window;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaCreateFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.activity.CreateEaStructuralExtendedActivityDialog;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;

/**
 * Class for Structural activity create feature
 * @author fto
 *
 */
public class EaCreateStructuralActivityFeature extends AbstractEaCreateFeature {
	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaCreateStructuralActivityFeature(IFeatureProvider fp) {
		// set name and description of the creation feature
		super(fp, "Structural ExtActivity", "Create Structural Extended Activity");
	}

	/**
	 * Gets the create image id.
	 * 
	 * @return image for UI representation
	 */
	@Override
	public String getCreateImageId() {
		return EaImageProvider.IMG_STRUCTURAL_ACTIVITY;
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
		// new structural activity to add to diagram
		EaStructuralExtendedActivity activity = null;
		CreateEaStructuralExtendedActivityDialog dialog = 
				new CreateEaStructuralExtendedActivityDialog(UtilsWizards.getShell(),
						findProcess(), getOrganization(context), getAppService(), getDescription());
		int retDialog = dialog.open();
		if (retDialog == Window.OK) {
			activity = dialog.getEaStructuralExtendedActivity();
		}
		if (activity == null) {
			return EMPTY;
		}
		
		// do the add
		addGraphicalRepresentation(context, activity);

		// return newly created business object(s)
		return new Object[] { activity };
	}

}
