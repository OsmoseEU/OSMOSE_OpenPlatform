package org.msee.slmtoolbox.modeling.editor.eaStar.features.connector;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polygon;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaPaintFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.style.EaStyleUtil;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaConnector;

/**
 * class to create an EaStar feature for paint element
 * @author fto
 */
public class EaPaintConnectorFeature extends AbstractEaPaintFeature {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
    public EaPaintConnectorFeature(IFeatureProvider fp) {
          super(fp);
    }

	@Override
	protected boolean canExecuteForBo(Object bo) {
		return bo instanceof EaConnector;
	}

	/**
     * implement the method for specific  graphicsAlgorithm
     * @param bo business object
     * @param graphicsAlgorithm slected	
     * @param style to apply
     */
    protected void addStyleToGraphicsElement(Object bo,
			GraphicsAlgorithm graphicsAlgorithm, Style style) {
    	if (null == style && bo instanceof EaConnector) {
    		style = EaStyleUtil.getStyleDefault(getDiagram());
    	}
    	
    	if (bo instanceof EaConnector && 
    			(graphicsAlgorithm instanceof Ellipse
    					|| graphicsAlgorithm instanceof Polygon)) {
    		graphicsAlgorithm.setStyle(style);
    	}
	}
}
