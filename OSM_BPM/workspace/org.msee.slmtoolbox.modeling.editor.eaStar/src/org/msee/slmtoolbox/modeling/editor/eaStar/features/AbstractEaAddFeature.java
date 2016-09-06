package org.msee.slmtoolbox.modeling.editor.eaStar.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeAddFeature;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

/**
 * abstract class to add a EAStar feature
 * @author fto
 */
public abstract class AbstractEaAddFeature extends AbstractMseeAddFeature<EAStarAppService> {
	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public AbstractEaAddFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Checks, if the add can be executed.
	 * 
	 * @param context
	 *            the context needed to execute the add
	 * 
	 * @return true, if the add can be executed
	 */
	public boolean canAdd(IAddContext context) {
		ContainerShape shape = context.getTargetContainer();
		Object bo = getBusinessObjectForPictogramElement(shape);
		return bo instanceof EaProcess || bo instanceof EaOrganization;
	}
}
