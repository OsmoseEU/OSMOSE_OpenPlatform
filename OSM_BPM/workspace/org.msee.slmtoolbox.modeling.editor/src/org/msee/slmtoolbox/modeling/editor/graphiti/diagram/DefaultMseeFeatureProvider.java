package org.msee.slmtoolbox.modeling.editor.graphiti.diagram;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IDeleteFeature;
import org.eclipse.graphiti.features.IRemoveFeature;
import org.eclipse.graphiti.features.context.IDeleteContext;
import org.eclipse.graphiti.features.context.IRemoveContext;
import org.eclipse.graphiti.features.impl.DefaultRemoveFeature;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.DefaultMseeDeleteFeature;
import org.msee.slmtoolbox.modeling.service.app.AbstractAppService;

/**
 * Default feature provider for MSeE editors
 * @author fto
 * 
 * @param <S> define the editor AppService
 */
public class DefaultMseeFeatureProvider<S extends AbstractAppService> extends DefaultFeatureProvider {

	/**
	 * Default constructor
	 * @param dtp	diagram type provider
	 */
	public DefaultMseeFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}
	
	/**
	 * Remove features remove the grapical representations of domain model
	 * objects.
	 * @param context	the context
	 * 
	 * @return remove feature according to the given context
	 * @see IRemoveFeature
	 */
	@Override
	public IRemoveFeature getRemoveFeature(IRemoveContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		// if pictogramElement is a Connection, return DefaultRemoveFeature
		// for remove graphical element Connection when delete a graphical element connected
		if (pictogramElement instanceof Connection) {
			return new DefaultRemoveFeature(this);
		}
		return null;
	}
	
	/**
	 * Delete features remove the grapical representations of domain model
	 * objects as well as the domain model objects itself.
	 * @param context 	the context
	 * 
	 * @return delete feature according to the given context
	 * @see IDeleteFeature
	 */
	@Override
	public IDeleteFeature getDeleteFeature(IDeleteContext context) {
		return new DefaultMseeDeleteFeature<S>(this);
	}

}
