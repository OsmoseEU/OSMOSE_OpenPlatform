package org.msee.slmtoolbox.modeling.editor.graigrid.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.GgUtilsGrid;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseeCreateConnectionFeature;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;

/**
 * abstract class to create a Connection GraiGrid feature
 * @author fto
 */
public abstract class AbstractGgCreateConnectionFeature extends AbstractMseeCreateConnectionFeature<GgAppService> {
	
	/**
	 * Construct with param
	 * @param fp			grai grid feature provider
	 * @param name			menu entry name
	 * @param description	menu entry tooltip
	 */
	public AbstractGgCreateConnectionFeature(IFeatureProvider fp,
			String name, String description) {
		super(fp, name, description);
	}

	/**
	 * find the grid grai business object
	 * @return null if not found a graigrid
	 */
	protected GgGraiGrid findGraiGrid() {
		GgGraiGrid graiGrid = null;
		// find the ContainerShape of grai grid
		ContainerShape containerGG = GgUtilsGrid.getGridContainerShape(getDiagram());
		// find the businesseObject 
		Object businesseObject = getBusinessObjectForPictogramElement(containerGG);
		// if not a GraiGrid, it's error, return null
		if (businesseObject instanceof GgGraiGrid) {
			graiGrid = (GgGraiGrid) businesseObject;
		}
		
		return graiGrid;
	}
}
