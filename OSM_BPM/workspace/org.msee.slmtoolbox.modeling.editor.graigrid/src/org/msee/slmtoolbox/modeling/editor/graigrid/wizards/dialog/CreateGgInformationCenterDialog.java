package org.msee.slmtoolbox.modeling.editor.graigrid.wizards.dialog;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.PropertiesGraiGrid.CenterProperties;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.PropertiesGraiGrid.LevelProperties;
import org.msee.slmtoolbox.modeling.editor.util.MseeUtils;
import org.msee.slmtoolbox.modeling.editor.wizard.dialog.editor.AbstractMseeDialog;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;

public class CreateGgInformationCenterDialog extends AbstractMseeDialog<GgAppService> {

    /**
     * Input combo widget.
     */
    private Text text;
    
	
    /**
     * Level of center (create or find)
     */
    private GgLevel level;
    
    /**
     * Information source of center (create or find)
     */
    private GgInformationSource source;
    
    /**
     * Decision center create or find
     */
    private GgInformationCenter informationCenter;
    
    /**
     * Grai grid target
     */
    private GgGraiGrid graiGrid;
	
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
     * @param source 
     * 				information source
     * @param level 
     * 				level
     * @param GraiGrid 
     * 				graiGrid
     * @param service
     * 				AppService
     */
	public CreateGgInformationCenterDialog(Shell parentShell, GgInformationSource source, GgLevel level, GgGraiGrid graiGrid, GgAppService service) {
		 super(parentShell, service, LevelProperties.TITLE);
	     this.level = level;
	     this.source = source;
	     this.graiGrid= graiGrid;
	}

	/**
	 * @return the informationCenter
	 */
	public GgInformationCenter getInformationCenter() {
		return this.informationCenter;
	}
	
	 /*
     * (non-Javadoc) Method declared on Dialog.
     */
    protected void buttonPressed(int buttonId) {
        if (buttonId == IDialogConstants.OK_ID) {
    		// find code
        	String code = "<IC>";
        	if (null != this.text.getText()
        			&& !" ".equals(this.text.getText())) {
        		code = MseeUtils.generateCodeForName(this.text.getText());
        	}
        	// call AppService
        	this.informationCenter = getAppService().createInformationCenter(
        			this.graiGrid, this.source, this.level, this.text.getText(), code);
        } else {
        	this.informationCenter = null;
        }
        super.buttonPressed(buttonId);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.dialogs.Dialog#createButtonsForButtonBar(org.eclipse.swt.widgets.Composite)
     */
    protected void createButtonsForButtonBar(Composite parent) {
        super.createButtonsForButtonBar(parent);
        //do this here because setting the text will set enablement on the ok
        // button
        this.text.setFocus();
    }
    

    /*
     * (non-Javadoc) Method declared on Dialog.
     */
    protected Control createDialogArea(Composite parent) {
        // create composite
        Composite composite = (Composite) super.createDialogArea(parent);
        // create message for combo decision
        Label label = new Label(composite, SWT.WRAP);
        label.setText(CenterProperties.USER_QUESTION_NAME_INFORMATION);
        GridData data = new GridData(GridData.GRAB_HORIZONTAL
                | GridData.GRAB_VERTICAL | GridData.HORIZONTAL_ALIGN_FILL
                | GridData.VERTICAL_ALIGN_CENTER);
        data.widthHint = convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH);
        label.setLayoutData(data);
        label.setFont(parent.getFont());
		// Create a input field for combo decision
        this.text = new Text(composite, SWT.BORDER | SWT.SINGLE);
        this.text.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
                | GridData.HORIZONTAL_ALIGN_FILL));
        
        this.text.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                validateInput();
            }
        });
        

        // create message for information source
        label = new Label(composite, SWT.WRAP);
        label.setText(CenterProperties.USER_QUESTION_SELECT_INFORMATION);
        data = new GridData(GridData.GRAB_HORIZONTAL
                | GridData.GRAB_VERTICAL | GridData.HORIZONTAL_ALIGN_FILL
                | GridData.VERTICAL_ALIGN_CENTER);
        data.widthHint = convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH);
        label.setLayoutData(data);
        label.setFont(parent.getFont());
        
		// Create a label field for combo function
        label = new Label(composite, SWT.WRAP);
        label.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
                | GridData.HORIZONTAL_ALIGN_FILL));
        label.setText(this.source.getName());
        

        // create message for combo decision level
        label = new Label(composite, SWT.WRAP);
        label.setText(CenterProperties.USER_QUESTION_SELECT_LEVEL);
        data = new GridData(GridData.GRAB_HORIZONTAL
                | GridData.GRAB_VERTICAL | GridData.HORIZONTAL_ALIGN_FILL
                | GridData.VERTICAL_ALIGN_CENTER);
        data.widthHint = convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH);
        label.setLayoutData(data);
        label.setFont(parent.getFont());
		// Create a input field for combo decision level
        label = new Label(composite, SWT.WRAP);
        label.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
                | GridData.HORIZONTAL_ALIGN_FILL));
        label.setText(this.level.getName());
        

        
        this.setErrorMessageText(new Text(composite, SWT.READ_ONLY | SWT.WRAP));
        this.getErrorMessageText().setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
                | GridData.HORIZONTAL_ALIGN_FILL));
        this.getErrorMessageText().setBackground(this.getErrorMessageText().getDisplay()
                .getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));
        // Set the error message text
        // See https://bugs.eclipse.org/bugs/show_bug.cgi?id=66292
        setErrorMessage(this.getErrorMessage());

        applyDialogFont(composite);
        return composite;
    }


    /**
     * Validates the input.
     * <p>
     * The default implementation of this framework method delegates the request
     * to the supplied input validator object; if it finds the input invalid,
     * the error message is displayed in the dialog's message line. This hook
     * method is called whenever the text changes in the input field.
     * </p>
     */
    protected void validateInput() {
    	// if not find decision and not name for decision
    	if (null == this.text.getText() || "".equals(this.text.getText()))  {
    		setErrorMessage(CenterProperties.WIZARD_ERROR_NAME_INFORMATION);
    	} else {
     	        setErrorMessage(null);
    	}
    }

}
