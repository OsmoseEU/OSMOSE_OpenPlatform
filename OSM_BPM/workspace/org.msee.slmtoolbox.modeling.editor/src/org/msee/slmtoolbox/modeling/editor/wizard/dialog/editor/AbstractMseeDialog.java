package org.msee.slmtoolbox.modeling.editor.wizard.dialog.editor;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.IInputValidator;
import org.eclipse.jface.resource.StringConverter;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * Main class for a dialog which call a MSEE AppService
 * @author fto
 *
 * @param <S> define an AppService
 */
public abstract class AbstractMseeDialog<S> extends Dialog {

    /**
     * The input validator, or <code>null</code> if none.
     */
    private IInputValidator validator;

    /**
     * Ok button widget.
     */
    private Button okButton;

    /**
     * Error message label widget.
     */
    private Text errorMessageText;
    
    /**
     * Error message string.
     */
    private String errorMessage;
    
    /**
     * AppService for find element and create with the wizard
     */
    private S appService;
    
    /**
     * Dialog title
     */
    private String title;
    

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
    public AbstractMseeDialog(Shell parentShell, S service, String title) {
        super(parentShell);
        this.appService = service;
        this.title = title;
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
        // create OK and Cancel buttons by default
        okButton = createButton(parent, IDialogConstants.OK_ID,
                IDialogConstants.OK_LABEL, true);
        createButton(parent, IDialogConstants.CANCEL_ID,
                IDialogConstants.CANCEL_LABEL, false);
    }


	/**
	 * @return the validator
	 */
	protected IInputValidator getValidator() {
		return validator;
	}


	/**
	 * @param validator the validator to set
	 */
	protected void setValidator(IInputValidator validator) {
		this.validator = validator;
	}


	/**
	 * @return the okButton
	 */
	protected Button getOkButton() {
		return okButton;
	}


	/**
	 * @param okButton the okButton to set
	 */
	protected void setOkButton(Button okButton) {
		this.okButton = okButton;
	}


	/**
	 * @return the errorMessageText
	 */
	protected Text getErrorMessageText() {
		return errorMessageText;
	}


	/**
	 * @param errorMessageText the errorMessageText to set
	 */
	protected void setErrorMessageText(Text errorMessageText) {
		this.errorMessageText = errorMessageText;
	}


	/**
	 * @return the errorMessage
	 */
	protected String getErrorMessage() {
		return errorMessage;
	}


    /**
     * Sets or clears the error message.
     * If not <code>null</code>, the OK button is disabled.
     * 
     * @param errorMessage
     *            the error message, or <code>null</code> to clear
     * @since 3.0
     */
	protected void setErrorMessage(String errorMessage) {
    	this.errorMessage = errorMessage;
    	if (errorMessageText != null && !errorMessageText.isDisposed()) {
    		errorMessageText.setText(errorMessage == null ? " \n " : errorMessage); //$NON-NLS-1$
    		// Disable the error message text control if there is no error, or
    		// no error text (empty or whitespace only).  Hide it also to avoid
    		// color change.
    		// See https://bugs.eclipse.org/bugs/show_bug.cgi?id=130281
    		boolean hasError = errorMessage != null && (StringConverter.removeWhiteSpaces(errorMessage)).length() > 0;
    		errorMessageText.setEnabled(hasError);
    		errorMessageText.setVisible(hasError);
    		errorMessageText.getParent().update();
    		// Access the ok button by id, in case clients have overridden button creation.
    		// See https://bugs.eclipse.org/bugs/show_bug.cgi?id=113643
    		Control button = getButton(IDialogConstants.OK_ID);
    		if (button != null) {
    			button.setEnabled(errorMessage == null);
    		}
    	}
    }


	/**
	 * @return the appService
	 */
	protected S getAppService() {
		return appService;
	}


	/**
	 * @param appService the appService to set
	 */
	protected void setAppService(S appService) {
		this.appService = appService;
	}

}
