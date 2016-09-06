package org.msee.slmtoolbox.modeling.editor.eaStar.features.connector;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.jface.window.Window;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaCreateFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.CreateEaProcessConnectorDialog;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector;

public class EaCreateProcessConnectorFeature extends AbstractEaCreateFeature {
	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 * @param name			menu entry name
	 * @param description	menu entry tooltip
	 */
	public EaCreateProcessConnectorFeature(IFeatureProvider fp) {
		// set name and description of the creation feature
		super(fp, "Process Connector", "Create Process Connector");
	}

	/**
	 * Gets the create image id.
	 * 
	 * @return image for UI representation
	 */
	@Override
	public String getCreateImageId() {
		return EaImageProvider.IMG_PROCESS_CONNECTOR;
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
		// create EClass
		EaProcessConnector processCon = null;
		CreateEaProcessConnectorDialog dialog = 
				new CreateEaProcessConnectorDialog(UtilsWizards.getShell(),
						findProcess(), getOrganization(context), getAppService());
		int retDialog = dialog.open();
		if (retDialog == Window.OK) {
			processCon = dialog.getProcessConnector();
		}
		
		if (processCon == null) {
			return EMPTY;
		}
		
		// do the add
		addGraphicalRepresentation(context, processCon);

		// return newly created business object(s)
		return new Object[] { processCon };
	}

}
