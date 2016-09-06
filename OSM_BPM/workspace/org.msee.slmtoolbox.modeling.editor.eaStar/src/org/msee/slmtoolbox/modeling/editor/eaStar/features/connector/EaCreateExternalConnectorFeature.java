package org.msee.slmtoolbox.modeling.editor.eaStar.features.connector;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaCreateFeature;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExternalConnector;

public class EaCreateExternalConnectorFeature extends AbstractEaCreateFeature {
	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 * @param name			menu entry name
	 * @param description	menu entry tooltip
	 */
	public EaCreateExternalConnectorFeature(IFeatureProvider fp) {
		// set name and description of the creation feature
		super(fp, "External Connector", "Create External Connector");
	}

	/**
	 * Gets the create image id.
	 * 
	 * @return image for UI representation
	 */
	@Override
	public String getCreateImageId() {
		return EaImageProvider.IMG_EXTERNAL_CONNECTOR;
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
		EaExternalConnector externalCon = getAppService().createExternalConnector(findProcess(),
				getOrganization(context));
		
		// do the add
		addGraphicalRepresentation(context, externalCon);
		// return newly created business object(s)
		return new Object[] { externalCon };
	}

}
