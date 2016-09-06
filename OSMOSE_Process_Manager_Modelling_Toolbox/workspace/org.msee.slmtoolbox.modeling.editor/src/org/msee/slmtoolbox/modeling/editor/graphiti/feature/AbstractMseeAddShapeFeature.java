package org.msee.slmtoolbox.modeling.editor.graphiti.feature;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.impl.AbstractAddShapeFeature;
import org.msee.slmtoolbox.modeling.editor.graphiti.diagram.AbstractMseeGraphitiDiagramEditor;
import org.msee.slmtoolbox.modeling.service.app.AbstractAppService;

/**
 * 
 * @param <S> define the editor AppService
 */
public abstract class AbstractMseeAddShapeFeature<S extends AbstractAppService> extends AbstractAddShapeFeature {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public AbstractMseeAddShapeFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * @return MSeE app service
	 */
	@SuppressWarnings("unchecked")
	protected S getAppService() {
		return ((AbstractMseeGraphitiDiagramEditor<S>)getDiagramEditor()).getAppService();
	}

	/**
	 * @return resource for data
	 */
	protected Resource getDataResource() {
		return ((AbstractMseeGraphitiDiagramEditor<?>) getDiagramEditor()).getResource();
	}
}