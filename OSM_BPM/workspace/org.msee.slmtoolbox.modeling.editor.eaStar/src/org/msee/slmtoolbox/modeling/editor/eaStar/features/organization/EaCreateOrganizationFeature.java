package org.msee.slmtoolbox.modeling.editor.eaStar.features.organization;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.jface.window.Window;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaCreateFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.CreateEaOrganizationDialog;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;

public class EaCreateOrganizationFeature extends AbstractEaCreateFeature {

	public EaCreateOrganizationFeature(IFeatureProvider fp) {
		// set name and description of the creation feature
		super(fp, "Organization", "Create Organization");
	}

	/**
	 * @return String path of the object's image
	 */
	@Override
	public String getCreateImageId() {
		return EaImageProvider.IMG_ORGANIZATION;
	}

	
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	/**
	 * @return an ExtendedActivity Object
	 */
	public Object[] create(ICreateContext context) {
		// new organization to add to diagram
		EaOrganization organization = null;
		CreateEaOrganizationDialog dialog = 
				new CreateEaOrganizationDialog(UtilsWizards.getShell(),
						findProcess(), getOrganization(context), getAppService());
		int retDialog = dialog.open();
		if (retDialog == Window.OK) {
			organization = dialog.getOrganization();
		}
		if (organization == null) {
			return EMPTY;
		}
		
		// do the add
		addGraphicalRepresentation(context, organization);
		
		// Refresh and Add node to the organization
		EaUtils.refreshAndAddNodeToOrganization(getFeatureProvider(), getDiagram(),organization, getAppService());

		// return newly created business object(s)
		return new Object[] { organization };
	}

}
