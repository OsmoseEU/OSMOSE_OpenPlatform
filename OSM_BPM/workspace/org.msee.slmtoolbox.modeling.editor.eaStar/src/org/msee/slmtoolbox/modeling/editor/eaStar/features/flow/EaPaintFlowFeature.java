package org.msee.slmtoolbox.modeling.editor.eaStar.features.flow;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.util.IColorConstant;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaPaintFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.style.EaStyleUtil;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow;

/**
 * EaStar class to create a MSeE feature for paint element
 * @author fto
 */
public class EaPaintFlowFeature extends AbstractEaPaintFeature {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
    public EaPaintFlowFeature(IFeatureProvider fp) {
          super(fp);
    }

	@Override
	protected boolean canExecuteForBo(Object bo) {
		return bo instanceof EaFlow;
	}

	/**
     * implement the method for specific  graphicsAlgorithm
     * @param bo business object
     * @param graphicsAlgorithm slected	
     * @param style to apply
     */
    protected void addStyleToGraphicsElement(Object bo,
			GraphicsAlgorithm graphicsAlgorithm, Style style) {
    	Color color;
    	if (null == style && bo instanceof EaFlow) {
    		color = manageColor(IColorConstant.BLACK);
    		style = EaStyleUtil.getStyleDefault(getDiagram());
    	} else {
    		color = style.getForeground();
    	}
    	
    	if (bo instanceof EaFlow && graphicsAlgorithm instanceof Polyline) {
    		graphicsAlgorithm.setForeground(color);
    		Connection connection = (Connection) graphicsAlgorithm.eContainer();
    		for (ConnectionDecorator decorator : connection.getConnectionDecorators()) {
				decorator.getGraphicsAlgorithm().setForeground(color);
				decorator.getGraphicsAlgorithm().setBackground(color);
    		}
    		
    	}
	}
}
