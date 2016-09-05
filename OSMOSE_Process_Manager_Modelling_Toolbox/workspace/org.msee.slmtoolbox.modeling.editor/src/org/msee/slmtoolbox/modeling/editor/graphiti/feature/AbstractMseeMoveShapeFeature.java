package org.msee.slmtoolbox.modeling.editor.graphiti.feature;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.impl.AbstractMoveShapeFeature;
import org.msee.slmtoolbox.modeling.editor.graphiti.diagram.AbstractMseeGraphitiDiagramEditor;
import org.msee.slmtoolbox.modeling.service.app.AbstractAppService;

/**
 * 
 * @param <S> define the editor AppService
 */
public abstract class AbstractMseeMoveShapeFeature<S extends AbstractAppService> extends AbstractMoveShapeFeature {
	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public AbstractMseeMoveShapeFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * @return MSeE app service
	 */
	@SuppressWarnings("unchecked")
	protected S getAppService() {
		return ((AbstractMseeGraphitiDiagramEditor<S>)getDiagramEditor()).getAppService();
	}

}
