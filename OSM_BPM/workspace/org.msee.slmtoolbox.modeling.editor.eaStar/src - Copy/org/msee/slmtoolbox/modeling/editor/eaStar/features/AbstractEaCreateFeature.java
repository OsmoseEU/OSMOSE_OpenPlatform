package org.msee.slmtoolbox.modeling.editor.eaStar.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeCreateFeature;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

/**
 * abstract class to create a EAStar feature
 * @author fto
 */
public abstract class AbstractEaCreateFeature extends AbstractMseeCreateFeature<EAStarAppService> {
	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 * @param name			menu entry name
	 * @param description	menu entry tooltip
	 */
	public AbstractEaCreateFeature(IFeatureProvider fp, String name, String description) {
		super(fp, name, description);
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
		ContainerShape shape = context.getTargetContainer();
		Object bo = getBusinessObjectForPictogramElement(shape);
		return bo instanceof EaProcess || bo instanceof EaOrganization;
	}
	
	/**
	 * find the process business object
	 * @return null if not found a process
	 */
	protected EaProcess findProcess() {
		EaProcess process = null;
		// find the businesseObject 
		Object businesseObject = getBusinessObjectForPictogramElement(getDiagram());
		// if not a GraiGrid, it's error, return null
		if (businesseObject instanceof EaProcess) {
			process = (EaProcess) businesseObject;
		}
		
		return process;
	}

	protected EaOrganization getOrganization(ICreateContext context) {
		ContainerShape shape = context.getTargetContainer();
		Object bo = getBusinessObjectForPictogramElement(shape);
		EaOrganization organization = null;
		if (bo instanceof EaOrganization) {
			organization = (EaOrganization) bo;
		}
		// get default organization
		if(null == organization) {
			organization = EaUtils.getDefaultOrganization(getFeatureProvider(), getDiagram());
		}
		return organization;
	}

}
