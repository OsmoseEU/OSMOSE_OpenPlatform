package org.msee.slmtoolbox.modeling.editor.graphiti.feature;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.msee.slmtoolbox.modeling.editor.graphiti.diagram.AbstractMseeGraphitiDiagramEditor;
import org.msee.slmtoolbox.modeling.service.app.AbstractAppService;

/**
 * abstract class to create a EAStar connection feature
 * @author fto
 * @param <S> define the editor AppService
 */
public abstract class AbstractMseeCreateConnectionFeature<S extends AbstractAppService> extends
		AbstractCreateConnectionFeature {
	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 * @param name			menu entry name
	 * @param description	menu entry tooltip
	 */
	public AbstractMseeCreateConnectionFeature(IFeatureProvider fp, String name, String description) {
		super(fp, name, description);
	}
	
	/**
	 * @return MSeE app service
	 */
	@SuppressWarnings("unchecked")
	protected S getAppService() {
		return ((AbstractMseeGraphitiDiagramEditor<S>)getDiagramEditor()).getAppService();
	}

}
