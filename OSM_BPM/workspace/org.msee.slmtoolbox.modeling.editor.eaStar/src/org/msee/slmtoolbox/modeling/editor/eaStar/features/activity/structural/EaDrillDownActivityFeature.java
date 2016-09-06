package org.msee.slmtoolbox.modeling.editor.eaStar.features.activity.structural;


import java.io.IOException;
import java.util.Collections;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaDrillDownOpenDiagramFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;

/**
 * Class to Structural activity drill down feature
 * @author fto
 */
public class EaDrillDownActivityFeature extends AbstractEaDrillDownOpenDiagramFeature {

	private EaStructuralExtendedActivity structuralActivity;
	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaDrillDownActivityFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Gets the description.
	 * 
	 * @return the description
	 */
	@Override
	public String getDescription() {
		return "Open the diagram associated with this Structural Extended Activity";
	}
	
	/**
	 * Can execute.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return true, if successful
	 */
	@Override
	public boolean canExecute(ICustomContext context) {
		PictogramElement[] pes = context.getPictogramElements();

		// first check, if one EClass is selected
		if (pes != null && pes.length == 1) {
			Object bo = getBusinessObjectForPictogramElement(pes[0]);
			if (bo instanceof EaStructuralExtendedActivity) {
				EaStructuralExtendedActivity ea = (EaStructuralExtendedActivity) bo;
					this.structuralActivity = ea;
					return super.canExecute(context);
				}
			}
		return false;
	}
	
	/**
	 * @return process name
	 */
	@Override
	protected String getFileName() {
		return EaUtils.getDiagramNameFile(this.structuralActivity.getIsA(), false);
	}
	
	/**
	 * @return process id
	 */
	@Override
	protected String getProcessId() {
		String id = null;
		if (null != this.structuralActivity.getIsA()) {
			id = this.structuralActivity.getIsA().getId();
		}
		return id;
	}
	
	/**
	 * Create an save the bo for a new diagram
	 * @param newDiagram	target
	 */
	protected void createAndSaveBoProcessInDiagram(Diagram newDiagram) {
		EaModel model = getAppService().createEaModel(newDiagram, this.structuralActivity);
		try {
			newDiagram.eResource().save(Collections.EMPTY_MAP);
		} catch (IOException ex) {
			// FIXME add log
			ex.printStackTrace();
		}
		link(newDiagram, model.getProcess());
	}
}
