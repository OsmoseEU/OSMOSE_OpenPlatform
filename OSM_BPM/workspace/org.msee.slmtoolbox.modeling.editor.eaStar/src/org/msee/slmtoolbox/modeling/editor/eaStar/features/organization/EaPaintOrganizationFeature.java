package org.msee.slmtoolbox.modeling.editor.eaStar.features.organization;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaPaintFeature;
import org.msee.slmtoolbox.modeling.editor.eaStar.style.EaOrganizationStylePainPalette;
import org.msee.slmtoolbox.modeling.editor.eaStar.style.EaOrganizationTemplateColoredAreas;
import org.msee.slmtoolbox.modeling.editor.eaStar.style.EaStyleUtil;
import org.msee.slmtoolbox.modeling.editor.wizard.dialog.editor.DefaultMseePaintDialog;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;

/**
 * Class to create an EaStar feature for paint element
 * @author fto
 */
public class EaPaintOrganizationFeature extends AbstractEaPaintFeature {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
    public EaPaintOrganizationFeature(IFeatureProvider fp) {
          super(fp);
    }

	@Override
	protected boolean canExecuteForBo(Object bo) {
		return bo instanceof EaOrganization;
	}

    /**
     * implement the method for another color selection dialog
     * @return a color selection dialog
     */
	protected DefaultMseePaintDialog getMseePaintDialog() {
		return new DefaultMseePaintDialog(UtilsWizards.getShell(), new EaOrganizationStylePainPalette(), new EaOrganizationTemplateColoredAreas());
	}

	/**
     * implement the method for specific  graphicsAlgorithm
     * @param bo business object
     * @param graphicsAlgorithm slected	
     * @param style to apply
     */
    protected void addStyleToGraphicsElement(Object bo,
			GraphicsAlgorithm graphicsAlgorithm, Style style) {
    	if (null == style && bo instanceof EaOrganization) {
    		style = EaStyleUtil.getStyleDefaultOrganization(getDiagram());
    	}
    	
    	if (bo instanceof EaOrganization) {
    		if (graphicsAlgorithm instanceof Rectangle) {
    			graphicsAlgorithm.setStyle(style);
    		}
    	}
	}
}
