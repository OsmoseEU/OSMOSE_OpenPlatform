package org.msee.slmtoolbox.modeling.editor.graphiti.feature;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.jface.window.Window;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.exception.EditorException;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.MseeStylePainPalette;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.MseeDefaultTemplateColoredAreas;
import org.msee.slmtoolbox.modeling.editor.wizard.dialog.editor.DefaultMseePaintDialog;

/**
 * abstract class to create a MSeE feature for paint element
 * @author fto
 */
public abstract class AbstractMseePaintFeature extends AbstractCustomFeature {
	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
    public AbstractMseePaintFeature(IFeatureProvider fp) {
          super(fp);
    }

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
    @Override
    public String getName() {
          return "Paint";
    }

	/**
	 * Gets the description.
	 * 
	 * @return the description
	 */
    @Override
    public String getDescription() {
          return "Paint Figure";
    }
    
	/**
	 * Gets the image id.
	 * 
	 * @return the image id
	 */
    @Override
    public abstract String getImageId();



	/**
	 * Can execute.
	 * 
	 * @param context
	 *            the context
	 * 
	 * @return true, if successful
	 */
    @Override
    public boolean canExecute(ICustomContext context) {
          boolean ret = false;
          PictogramElement[] pes = context.getPictogramElements();
          if (pes != null && pes.length == 1) {
                Object bo = getBusinessObjectForPictogramElement(pes[0]);
                ret = canExecuteForBo(bo);
          }
          return ret;
    }

	/**
	 * Can execute for a business Object
	 * @param bo business Object
	 * @return true, if successful
	 */
    protected abstract boolean canExecuteForBo(Object bo);

	@Override
    public boolean isAvailable(IContext context) {
          return true;
    }

	/**
	 * Execute.
	 * 
	 * @param context
	 *            the context
	 */
    @Override
    public void execute(ICustomContext context) {
        PictogramElement[] pes = context.getPictogramElements();
        DefaultMseePaintDialog dialog = getMseePaintDialog();
        if (null == dialog) {
        	throw new EditorException("Not dialog is define for feature " + this.getClass().getName());
        }
		int retDialog = dialog.open();
		if (retDialog == Window.OK && pes != null) {
			Style style = dialog.getStyle(getDiagram());
			for (int i =0; i<pes.length; i++ ) {
	            Object bo = getBusinessObjectForPictogramElement(pes[0]);
	            if (canExecuteForBo(bo)) {
	            	addStyleToGraphicsElement(bo,pes[i] .getGraphicsAlgorithm(),style);
	            }
	      }
		}
    }

	/**
     * implement the method for another color selection dialog
     * @return a color selection dialog
     */
	protected DefaultMseePaintDialog getMseePaintDialog() {
		return new DefaultMseePaintDialog(UtilsWizards.getShell(), new MseeStylePainPalette(), new MseeDefaultTemplateColoredAreas());
	}

	/**
     * implement the method for specific  graphicsAlgorithm
     * @param bo business object
     * @param graphicsAlgorithm slected	
     * @param style to apply
     */
    protected void addStyleToGraphicsElement(Object bo,
			GraphicsAlgorithm graphicsAlgorithm, Style style) {
    	graphicsAlgorithm.setStyle(style);
	}
}
