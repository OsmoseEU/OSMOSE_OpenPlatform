package org.msee.slmtoolbox.modeling.editor.graigrid.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;

/**
 *  Default management class of the resize element action 
 * @author fto
 */
public class GgDefaultResizeShapeFeature extends DefaultResizeShapeFeature {

	/**
	 *  Construct with param
	 * @param fp	grai grid feature provider
	 */
	public GgDefaultResizeShapeFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Can't resize shape a grai grid element
	 * @param context for deleted
	 */
    @Override
    public boolean canResizeShape(IResizeShapeContext context) {
        return false;
    }
}
