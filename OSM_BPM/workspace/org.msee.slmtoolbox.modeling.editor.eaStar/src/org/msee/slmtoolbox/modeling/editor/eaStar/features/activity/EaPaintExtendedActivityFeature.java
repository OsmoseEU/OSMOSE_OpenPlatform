package org.msee.slmtoolbox.modeling.editor.eaStar.features.activity;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaPaintFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.style.EaStyleUtil;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;

/**
 * Class to create an EaStar feature for paint element
 * @author fto
 */
public class EaPaintExtendedActivityFeature extends AbstractEaPaintFeature {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
    public EaPaintExtendedActivityFeature(IFeatureProvider fp) {
          super(fp);
    }

	@Override
	protected boolean canExecuteForBo(Object bo) {
		return bo instanceof EaExtendedActivity;
	}

	/**
     * implement the method for specific  graphicsAlgorithm
     * @param bo business object
     * @param graphicsAlgorithm slected	
     * @param style to apply
     */
    protected void addStyleToGraphicsElement(Object bo,
			GraphicsAlgorithm graphicsAlgorithm, Style style) {
    	if (null == style && bo instanceof EaExtendedActivity) {
			switch (((EaExtendedActivity)bo).getOsmoseWorld()) {
				case "REAL": style = EaStyleUtil.getStyleRealActivity(getDiagram());break;
				case "VIRTUAL": style =EaStyleUtil.getStyleVirtualActivity(getDiagram());;break;
				case "DIGITAL": style =EaStyleUtil.getStyleDigitalActivity(getDiagram());;break;
				default:style =EaStyleUtil.getStyleDefaultActivity(getDiagram());
			}
    	}
    	
    	if (bo instanceof EaExtendedActivity && 
    			graphicsAlgorithm instanceof RoundedRectangle) {
    		graphicsAlgorithm.setStyle(style);
    	}
	}
}
