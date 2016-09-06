package org.msee.slmtoolbox.modeling.editor.graigrid.wizards.dialog;

import java.util.Map;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.PropertiesGraiGrid.FunctionProperties;
import org.msee.slmtoolbox.modeling.editor.util.MseeUtils;
import org.msee.slmtoolbox.modeling.editor.wizard.dialog.editor.AbstractMseeDialog;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;

public class CreateGgFunctionDialog extends AbstractMseeDialog<GgAppService> {

    /**
     * Input combo widget.
     */
    private Combo combo;
    
    /**
     * Function list, Entry<String id, String name>[]
     */
    private Object[] listFunction;
    
    /**
     * Function create or find
     */
    private GgFunction function;
    /**
     * Organization target
     */
    private GgOrganization organization;
    
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
     * @param GraiGrid 
     * 				graiGrid
     * @param service
     * 				AppService
     */
    public CreateGgFunctionDialog(Shell parentShell, GgGraiGrid graiGrid, GgOrganization organization, GgAppService service) {
        super(parentShell, service, FunctionProperties.TITLE);
        this.graiGrid = graiGrid;
        this.organization = organization;
		// find all decision structure for SSM
        Map<String, String> dataMap = getAppService().getFunctionListNotInGraiGird(graiGrid);
        if (null != dataMap) {
        	this.listFunction = dataMap.entrySet().toArray();
        } else {
        	this.listFunction = new Object[0];
        }
        //this.validator = validator;
    }

    /*
     * (non-Javadoc) Method declared on Dialog.
     */
    protected void buttonPressed(int buttonId) {
        if (buttonId == IDialogConstants.OK_ID) {
        	// Find Function selected
        	/*String idFunction =
        			UtilsWizards.findEntryKey(this.combo.getSelectionIndex(),this.listFunction);*/
        	String code = "<F>";
        	if (null != this.combo.getText()
        			&& !" ".equals(this.combo.getText())) {
        		code = MseeUtils.generateCodeForName(this.combo.getText());
        	}
        	// call AppService
        	this.function = 
        			this.getAppService().createFunction(this.graiGrid,this.organization, this.combo.getText(), code);
        } else {
        	this.function = null;
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
        this.combo.setFocus();
    }

    /*
     * (non-Javadoc) Method declared on Dialog.
     */
    protected Control createDialogArea(Composite parent) {
        // create composite
        Composite composite = (Composite) super.createDialogArea(parent);
        // create message
            Label label = new Label(composite, SWT.WRAP);
            label.setText(FunctionProperties.USER_QUESTION_NAME);
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
        this.combo.setItems(UtilsWizards.convertEntryValuesToArray(this.listFunction));
        
        this.combo.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                validateInput();
            }
        });
        
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
     * Returns the function selected or created
     * @return function
     */
    public GgFunction getFunction() {
		return this.function;
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
    	if (null == this.combo.getText() || "".equals(this.combo.getText()))  {
    		setErrorMessage(FunctionProperties.ERROR_NAME_REQUIRED);
    	} else {
     	        setErrorMessage(null);
    	}
    }

 
}
