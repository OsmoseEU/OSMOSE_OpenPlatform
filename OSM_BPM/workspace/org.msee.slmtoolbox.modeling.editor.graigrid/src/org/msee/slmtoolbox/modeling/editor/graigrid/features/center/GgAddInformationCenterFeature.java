package org.msee.slmtoolbox.modeling.editor.graigrid.features.center;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.msee.slmtoolbox.modeling.editor.graigrid.style.GgStyleUtil;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter;

/**
 *  Management class of the add Information Center action 
 * @author nco
 */
public class GgAddInformationCenterFeature extends
		GgAddDecisionCenterFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public GgAddInformationCenterFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Can add Information Center
	 * @param context for add
	 */
	public boolean canAdd(IAddContext context) {
		// check if user wants to add a InformationCenter
		if (context.getNewObject() instanceof GgInformationCenter) {
			return true;
		}
		return false;
	}	
	
	/**
	 * Add graphic element for a Information Center
	 * 
	 * @param context
	 *            for add
	 */
	public PictogramElement add(IAddContext context) {
		return createGraphicElement(context, GgStyleUtil.getStyleInformationCenter(getDiagram()));
	}
}
