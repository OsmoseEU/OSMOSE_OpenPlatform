package org.msee.slmtoolbox.modeling.editor.wizard.dialog.editor;

import org.eclipse.graphiti.mm.algorithms.styles.Style;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.AbstractMsseTemplateColoredAreas;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.MseeStylePainPalette;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.MseeStylePaintColor;
import org.msee.slmtoolbox.modeling.editor.graphiti.style.MseeStylePaintManager;

public class DefaultMseePaintDialog extends Dialog {

    /**
     * Input combo widget.
     */
    private Combo combo;
    
    /**
     * index select
     */
    private int index;
    
    /**
     * Palette for style paint
     */
    private MseeStylePainPalette painPalette;
    /**
     * Template colored area for style paint
     */
    private AbstractMsseTemplateColoredAreas templateColored;

    /**
     * Creates an input dialog with OK and Cancel buttons. Note that the dialog
     * will have no visual representation (no widgets) until it is told to open.
     * <p>
     * Note that the <code>open</code> method blocks for input dialogs.
     * </p>
     * 
     * @param parentShell
     *            the parent shell, or <code>null</code> to create a top-level
     */
    public DefaultMseePaintDialog(Shell parentShell,MseeStylePainPalette painPalette, AbstractMsseTemplateColoredAreas templateColored) {
        super(parentShell);
        this.painPalette = painPalette;
        this.templateColored = templateColored;
    }

    /*
     * (non-Javadoc) Method declared on Dialog.
     */
    protected void buttonPressed(int buttonId) {
    	this.index = this.combo.getSelectionIndex();
        super.buttonPressed(buttonId);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.dialogs.Dialog#createButtonsForButtonBar(org.eclipse.swt.widgets.Composite)
     */
    protected void createButtonsForButtonBar(Composite parent) {
    	createButton(parent, IDialogConstants.OK_ID,
                IDialogConstants.OK_LABEL, true);
    }

    /*
     * (non-Javadoc) Method declared on Dialog.
     */
    protected Control createDialogArea(Composite parent) {
        // create composite
        Composite composite = (Composite) super.createDialogArea(parent);
        // create message
            Label label = new Label(composite, SWT.WRAP);
            label.setText("Pick up a color"); //TODO Properties
            GridData data = new GridData(GridData.GRAB_HORIZONTAL
                    | GridData.GRAB_VERTICAL | GridData.HORIZONTAL_ALIGN_FILL
                    | GridData.VERTICAL_ALIGN_CENTER);
            data.widthHint = convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH);
            label.setLayoutData(data);
            label.setFont(parent.getFont());
		// Create a input field for a GRAI grid name
        this.combo = new Combo(composite, SWT.BORDER | SWT.SINGLE);
        this.combo.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
                | GridData.HORIZONTAL_ALIGN_FILL));
        this.combo.setItems(painPalette.getListNameStyle());

        applyDialogFont(composite);
        return composite;
    }

    /**
     * Returns the style selected
     * @return style
     */
    public Style getStyle(Diagram diagram) {
    	MseeStylePaintColor stylePaint = painPalette.getStylePaint(this.index);
    	Style style = null;
    	if (null != stylePaint)  {
    		style = MseeStylePaintManager.getStyle(diagram, stylePaint, templateColored);
    	}
    	return style;
    }

 
}
