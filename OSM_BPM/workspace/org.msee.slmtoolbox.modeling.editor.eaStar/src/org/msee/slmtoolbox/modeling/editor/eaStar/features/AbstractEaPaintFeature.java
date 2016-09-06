package org.msee.slmtoolbox.modeling.editor.eaStar.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.graphiti.feature.AbstractMseePaintFeature;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.MseeDefaultTemplateColoredAreas;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.MseeStylePainPalette;
import org.msee.slmtoolbox.modeling.editor.wizard.dialog.editor.DefaultMseePaintDialog;

/**
 * Abstract class to create a EA* feature for paint element
 * @author fto
 */
public abstract class AbstractEaPaintFeature  extends AbstractMseePaintFeature {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
    public AbstractEaPaintFeature(IFeatureProvider fp) {
          super(fp);
    }

	/**
	 * Gets the image id.
	 * 
	 * @return the image id
	 */
    @Override
    public String getImageId() {
          return EaImageProvider.IMG_PAINT;
    }

    /**
     * implement the method for another color selection dialog
     * @return a color selection dialog
     */
	protected DefaultMseePaintDialog getMseePaintDialog() {
		return new DefaultMseePaintDialog(UtilsWizards.getShell(), new MseeStylePainPalette(), new MseeDefaultTemplateColoredAreas());
	}


}
