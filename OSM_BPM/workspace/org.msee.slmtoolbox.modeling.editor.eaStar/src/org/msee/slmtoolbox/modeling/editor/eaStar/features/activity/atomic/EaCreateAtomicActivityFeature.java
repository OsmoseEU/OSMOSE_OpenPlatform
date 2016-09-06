package org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.atomic;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.jface.window.Window;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaCreateFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.activity.CreateEaAtomicExtendedActivityDialog;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAtomicExtendedActivity;

/**
 * Class for Atomic activity create feature
 * @author fto
 *
 */
public class EaCreateAtomicActivityFeature extends AbstractEaCreateFeature {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaCreateAtomicActivityFeature(IFeatureProvider fp) {
		// set name and description of the creation feature
		super(fp, "Atomic ExtActivity", "Create Atomic Extended Activity");
	}

	/**
	 * @return String path of the object's image
	 */
	@Override
	public String getCreateImageId() {
		return EaImageProvider.IMG_FLOWNODE;
	}

	/**
	 * @return an ExtendedActivity Object
	 */
	public Object[] create(ICreateContext context) {
		// new structural activity to add to diagram
		EaAtomicExtendedActivity activity = null;
		CreateEaAtomicExtendedActivityDialog dialog = 
				new CreateEaAtomicExtendedActivityDialog(UtilsWizards.getShell(),
						findProcess(), getOrganization(context), getAppService(), getDescription());
		int retDialog = dialog.open();
		if (retDialog == Window.OK) {
			activity = dialog.getEaAtomicExtendedActivity();
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
