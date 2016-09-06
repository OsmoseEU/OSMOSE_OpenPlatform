/**
 * 
 */
package org.msee.slmtoolbox.modeling.editor.eaStar.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;


/**
 * @author HBA6
 *
 */
public class EAResourceResizeFeature extends DefaultResizeShapeFeature {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EAResourceResizeFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * @return false so that resources cannot be resized
	 */
	@Override
	public boolean canResizeShape(IResizeShapeContext context) {
	
		return false;
	}

}
