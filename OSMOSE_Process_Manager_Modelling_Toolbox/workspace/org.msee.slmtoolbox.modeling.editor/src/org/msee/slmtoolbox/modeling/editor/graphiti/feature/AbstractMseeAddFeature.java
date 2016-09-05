package org.msee.slmtoolbox.modeling.editor.graphiti.feature;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.msee.slmtoolbox.modeling.editor.graphiti.diagram.AbstractMseeGraphitiDiagramEditor;
import org.msee.slmtoolbox.modeling.service.app.AbstractAppService;

/**
 * 
 * @param <S> define the editor AppService
 */
public abstract class AbstractMseeAddFeature<S extends AbstractAppService> extends AbstractAddFeature {
	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public AbstractMseeAddFeature(IFeatureProvider fp) {
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
