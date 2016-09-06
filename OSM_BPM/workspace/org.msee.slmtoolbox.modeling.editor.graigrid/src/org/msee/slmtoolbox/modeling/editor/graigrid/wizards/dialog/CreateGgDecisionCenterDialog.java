package org.msee.slmtoolbox.modeling.editor.graigrid.wizards.dialog;

import java.util.List;

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
import org.msee.slmtoolbox.modeling.app.service.BsmProjectManager;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.PropertiesGraiGrid.CenterProperties;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.PropertiesGraiGrid.LevelProperties;
import org.msee.slmtoolbox.modeling.editor.util.MseeUtils;
import org.msee.slmtoolbox.modeling.editor.wizard.dialog.editor.AbstractMseeDialog;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;

public class CreateGgDecisionCenterDialog extends AbstractMseeDialog<GgAppService> {

    /**
     * Input combo widget.
     */
    private Combo decisionCombo;
	
    /**
     * Level of center (create or find)
     */
    private GgLevel level;
    
    /**
     * Function of center (create or find)
     */
    private GgFunction function;
    
    /**
     * Decision center create or find
     */
    private GgDecisionCenter decisionCenter;
    
    /**
     * Grai grid target
     */
    private GgGraiGrid graiGrid;
	
	/** Bsm service */
	private BsmAppService bsmService;
    
    /**
     * Decision list of bsm
     */
    private List<BsmDecision> listDecision;
	
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
     * @param function 
     * 				function
     * @param level 
     * 				level
     * @param GraiGrid 
     * 				graiGrid
     * @param service
     * 				AppService
     */
	public CreateGgDecisionCenterDialog(Shell parentShell, GgFunction function, GgLevel level, GgGraiGrid graiGrid, GgAppService service) {
		 super(parentShell, service, LevelProperties.TITLE);
	     this.bsmService = BsmProjectManager.eInstance.createBsmService(getAppService().getProject());
	     this.level = level;
	     this.function = function;
	     this.graiGrid= graiGrid;
	     this.listDecision = this.bsmService.getDecisionList(graiGrid,function.getOrganization());
	}

	/**
	 * @return the decisionCenter
	 */
	public GgDecisionCenter getDecisionCenter() {
		return decisionCenter;
	}
	
	 /*
     * (non-Javadoc) Method declared on Dialog.
     */
    protected void buttonPressed(int buttonId) {
        if (buttonId == IDialogConstants.OK_ID) {
    		// find decision selected
    		BsmDecision bsmDecision = null;
    		if (-1 != this.decisionCombo.getSelectionIndex()
    				&& this.decisionCombo.getSelectionIndex() < this.listDecision.size()) {
    			bsmDecision = this.listDecision.get(this.decisionCombo.getSelectionIndex());
    		} else {
    			bsmDecision = this.bsmService.createBsmDecision(this.decisionCombo.getText(),graiGrid);
    		}
    		// find code
        	String code = "<DC>";
        	if (null != this.decisionCombo.getText()
        			&& !" ".equals(this.decisionCombo.getText())) {
        		code = MseeUtils.generateCodeForName(this.decisionCombo.getText());
        	}
    		// create decision center
        	this.decisionCenter = getAppService().createDecisionCenter(this.graiGrid, this.function, this.level, bsmDecision.getName(), code);
    		// add bsm link
        	this.bsmService.addGgDecisionCenterToDecision(bsmDecision,this.decisionCenter);
        	this.bsmService.addLinkDecisionAndOrganization(this.function.getOrganization(),bsmDecision);
        } else {
        	this.decisionCenter = null;
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
        this.decisionCombo.setFocus();
    }
    

    /*
     * (non-Javadoc) Method declared on Dialog.
     */
    protected Control createDialogArea(Composite parent) {
        // create composite
        Composite composite = (Composite) super.createDialogArea(parent);
        // create message for combo decision
        Label label = new Label(composite, SWT.WRAP);
        label.setText(CenterProperties.USER_QUESTION_NAME_DECISION);
        GridData data = new GridData(GridData.GRAB_HORIZONTAL
                | GridData.GRAB_VERTICAL | GridData.HORIZONTAL_ALIGN_FILL
                | GridData.VERTICAL_ALIGN_CENTER);
        data.widthHint = convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH);
        label.setLayoutData(data);
        label.setFont(parent.getFont());
		// Create a input field for combo decision
        this.decisionCombo = new Combo(composite, SWT.BORDER | SWT.SINGLE);
        this.decisionCombo.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
                | GridData.HORIZONTAL_ALIGN_FILL));
        this.decisionCombo.setItems(UtilsWizards.convertListToArrayName(this.listDecision));
        
        this.decisionCombo.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                validateInput();
            }
        });
        

        // create message for combo function
        label = new Label(composite, SWT.WRAP);
        label.setText(CenterProperties.USER_QUESTION_SELECT_FUNCTION);
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
        label.setText(this.function.getName());
        

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
    	if (null == this.decisionCombo.getText() || "".equals(this.decisionCombo.getText()))  {
    		setErrorMessage(CenterProperties.WIZARD_ERROR_NAME_DECISION);
    	} else {
     	        setErrorMessage(null);
    	}
    }

}
