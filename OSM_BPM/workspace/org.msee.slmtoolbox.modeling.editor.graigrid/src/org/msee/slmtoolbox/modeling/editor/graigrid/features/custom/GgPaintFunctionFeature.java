package org.msee.slmtoolbox.modeling.editor.graigrid.features.custom;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.graigrid.GraiGridImageProvider;
import org.msee.slmtoolbox.modeling.editor.graigrid.style.GgFunctionTemplateColoredAreas;
import org.msee.slmtoolbox.modeling.editor.graigrid.style.GgStyleUtil;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseePaintFeature;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.MseeStylePainPalette;
import org.msee.slmtoolbox.modeling.editor.wizard.dialog.editor.DefaultMseePaintDialog;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;

public class GgPaintFunctionFeature extends AbstractMseePaintFeature {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
    public GgPaintFunctionFeature(IFeatureProvider fp) {
          super(fp);
    }

	/**
	 * Gets the image id.
	 * 
	 * @return the image id
	 */
    @Override
    public String getImageId() {
          return GraiGridImageProvider.IMG_16_PAINT;
    }

	@Override
	protected boolean canExecuteForBo(Object bo) {
		return bo instanceof GgFunction;
	}

    /**
     * implement the method for another color selection dialog
     * @return a color selection dialog
     */
	protected DefaultMseePaintDialog getMseePaintDialog() {
		return new DefaultMseePaintDialog(UtilsWizards.getShell(), new MseeStylePainPalette(), new GgFunctionTemplateColoredAreas());
	}

	/**
     * implement the method for specific  graphicsAlgorithm
     * @param bo business object
     * @param graphicsAlgorithm slected	
     * @param style to apply
     */
    protected void addStyleToGraphicsElement(Object bo, GraphicsAlgorithm graphicsAlgorithm, Style style) {
    	if (null != style) {
    		graphicsAlgorithm.setStyle(style);
    	} else if (bo instanceof GgFunction) {
    		graphicsAlgorithm.setStyle(GgStyleUtil.getStyleFunction(getDiagram()));
    	}
	}
}
