package org.msee.slmtoolbox.modeling.editor.graphiti.feature;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.ui.features.AbstractDrillDownFeature;
import org.msee.slmtoolbox.modeling.editor.graphiti.diagram.AbstractMseeGraphitiDiagramEditor;
import org.msee.slmtoolbox.modeling.service.app.AbstractAppService;
/**
 * abstract class to drill down a MSeE feature
 * @author fto
 * @param <S> define the editor AppService
 */
public abstract class AbstractMseeDrillDownFeature<S extends AbstractAppService> extends AbstractDrillDownFeature {
	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public AbstractMseeDrillDownFeature(IFeatureProvider fp) {
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
