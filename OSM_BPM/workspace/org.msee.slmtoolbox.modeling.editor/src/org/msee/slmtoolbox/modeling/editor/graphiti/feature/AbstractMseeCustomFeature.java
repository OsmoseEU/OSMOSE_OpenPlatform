package org.msee.slmtoolbox.modeling.editor.graphiti.feature;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.msee.slmtoolbox.modeling.editor.graphiti.diagram.AbstractMseeGraphitiDiagramEditor;
import org.msee.slmtoolbox.modeling.service.app.AbstractAppService;

/**
 * abstract class to custom action for a MSeE feature
 * @author fto
 * @param <S> define the editor AppService
 */
public abstract class AbstractMseeCustomFeature<S extends AbstractAppService> extends AbstractCustomFeature {
	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public AbstractMseeCustomFeature(IFeatureProvider fp) {
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