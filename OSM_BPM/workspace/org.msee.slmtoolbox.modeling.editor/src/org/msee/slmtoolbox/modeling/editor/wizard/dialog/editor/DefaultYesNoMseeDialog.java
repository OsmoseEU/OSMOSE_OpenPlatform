package org.msee.slmtoolbox.modeling.editor.wizard.dialog.editor;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class DefaultYesNoMseeDialog  extends Dialog {
    
    /**
     * Dialog title
     */
    private String title;
    
    /**
     * Dialog text
     */
    private String textDialog;
    

    /**
     * Creates an input dialog with OK and Cancel buttons. Note that the dialog
     * will have no visual representation (no widgets) until it is told to open.
     * <p>
     * Note that the <code>open</code> method blocks for input dialogs.
     * </p>
     * 
     * @param parentShell
     *            the parent shell, or <code>null</code> to create a top-level
     *            shell
     * @param service
     * 				AppService
     * @param title
     *            the dialog title, or <code>null</code> if none
     */
    public DefaultYesNoMseeDialog(Shell parentShell, String title, String textDialog) {
        super(parentShell);
        this.title = title;
        this.textDialog = textDialog;
    }
    
    
    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
     */
    protected void configureShell(Shell shell) {
        super.configureShell(shell);
		shell.setText(title);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.dialogs.Dialog#createButtonsForButtonBar(org.eclipse.swt.widgets.Composite)
     */
    protected void createButtonsForButtonBar(Composite parent) {
    	createButton(parent, IDialogConstants.OK_ID,
                IDialogConstants.YES_LABEL, true);
        createButton(parent, IDialogConstants.CANCEL_ID,
                IDialogConstants.NO_LABEL, false);
    }
    /*
     * (non-Javadoc) Method declared on Dialog.
     */
    protected Control createDialogArea(Composite parent) {
        // create composite
        Composite composite = (Composite) super.createDialogArea(parent);
        // create message
         Label label = new Label(composite, SWT.WRAP);
          label.setText(this.textDialog);
            GridData data = new GridData(GridData.GRAB_HORIZONTAL
                    | GridData.GRAB_VERTICAL | GridData.HORIZONTAL_ALIGN_FILL
                    | GridData.VERTICAL_ALIGN_CENTER);
            data.widthHint = convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH);
            label.setLayoutData(data);
            label.setFont(parent.getFont());

        applyDialogFont(composite);
        return composite;
    }
}
