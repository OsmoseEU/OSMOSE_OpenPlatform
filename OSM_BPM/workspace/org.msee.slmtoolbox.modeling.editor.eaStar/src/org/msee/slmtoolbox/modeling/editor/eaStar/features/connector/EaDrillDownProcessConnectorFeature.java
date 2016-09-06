package org.msee.slmtoolbox.modeling.editor.eaStar.features.connector;


import java.io.IOException;
import java.util.Collections;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaDrillDownOpenDiagramFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;

public class EaDrillDownProcessConnectorFeature extends AbstractEaDrillDownOpenDiagramFeature {

	private EaProcessConnector connector;

	public EaDrillDownProcessConnectorFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public String getDescription() {
		return "Open the diagram associated with this Process connector";
	}

	@Override
	public boolean canExecute(ICustomContext context) {
		PictogramElement[] pes = context.getPictogramElements();

		// first check, if one EClass is selected
		if (pes != null && pes.length == 1) {
			Object bo = getBusinessObjectForPictogramElement(pes[0]);
			if (bo instanceof EaProcessConnector) {
				EaProcessConnector processConnector = (EaProcessConnector) bo;
				if (null != processConnector.getProcessRef()) {
					this.connector = processConnector;
					return super.canExecute(context);
				}
			}
		}
		return false;
	}

	@Override
	protected String getFileName() {
		return EaUtils.getDiagramNameFile(this.connector.getProcessRef(), false);
	}

	@Override
	protected String getProcessId() {
		String id = null;
		if (null != this.connector.getProcessRef()) {
			id = this.connector.getProcessRef().getId();
		}
		return id;
	}

	@Override
	protected void createAndSaveBoProcessInDiagram(Diagram newDiagram) {
		EaModel model = getAppService().createEaModel(newDiagram, this.connector);
		try {
			newDiagram.eResource().save(Collections.EMPTY_MAP);
		} catch (IOException ex) {
			// FIXME add log
			ex.printStackTrace();
		}
		link(newDiagram, model.getProcess());
	}

}
