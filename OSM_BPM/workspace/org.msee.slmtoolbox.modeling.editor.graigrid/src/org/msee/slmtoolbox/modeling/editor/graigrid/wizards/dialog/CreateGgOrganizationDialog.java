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
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.PropertiesGraiGrid.FunctionProperties;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.PropertiesGraiGrid.OrganizationProperties;
import org.msee.slmtoolbox.modeling.editor.util.MseeUtils;
import org.msee.slmtoolbox.modeling.editor.wizard.dialog.editor.AbstractMseeDialog;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;

public class CreateGgOrganizationDialog extends AbstractMseeDialog<GgAppService> {

    /**
     * Input combo widget.
     */
    private Combo organizationCombo;
	
	/** Bsm service */
	private BsmAppService bsmService;
    
    /**
     * Bsm Orgnization list
     */
    private List<BsmOrganization> listOrganization;
    
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
    public CreateGgOrganizationDialog(Shell parentShell, GgGraiGrid graiGrid, GgAppService service) {
        super(parentShell, service, OrganizationProperties.TITLE);
	    this.bsmService = BsmProjectManager.eInstance.createBsmService(getAppService().getProject());
        this.graiGrid = graiGrid;
        this.listOrganization = this.bsmService.getOrganizationList(false); //TODO remove organization in graigrid
    }

    /*
     * (non-Javadoc) Method declared on Dialog.
     */
    protected void buttonPressed(int buttonId) {
        if (buttonId == IDialogConstants.OK_ID) {
    		// find organization selected
        	BsmOrganization bsmOrganization = null;
    		if (-1 != this.organizationCombo.getSelectionIndex()
    				&& this.organizationCombo.getSelectionIndex() < this.listOrganization.size()) {
    			bsmOrganization = this.listOrganization.get(this.organizationCombo.getSelectionIndex());
    		} else {
//    			bsmOrganization = this.bsmService.createBsmOrganization(this.organizationCombo.getText(), false);
    			//create an enterprise
    			bsmOrganization = this.bsmService.createBsmOrganization(this.organizationCombo.getText(), true);
    		}
    		// create code
        	String code = "<O>";
        	if (null != this.organizationCombo.getText()
        			&& !" ".equals(this.organizationCombo.getText())) {
        		code = MseeUtils.generateCodeForName(this.organizationCombo.getText());
        	}
    		// create organization
        	this.organization = getAppService().createOrganization(this.graiGrid, bsmOrganization.getName(),code);
    		// add bsm link
        	this.bsmService.addGgOrganizationToOrganization(bsmOrganization,this.organization);
        	this.bsmService.addLinkDecisionStructureAndOrganization(this.graiGrid,bsmOrganization);
        } else {
        	this.organization = null;
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
        this.organizationCombo.setFocus();
    }

    /*
     * (non-Javadoc) Method declared on Dialog.
     */
    protected Control createDialogArea(Composite parent) {
        // create composite
        Composite composite = (Composite) super.createDialogArea(parent);
        // create message
            Label label = new Label(composite, SWT.WRAP);
            label.setText(OrganizationProperties.USER_QUESTION_NAME);
            GridData data = new GridData(GridData.GRAB_HORIZONTAL
                    | GridData.GRAB_VERTICAL | GridData.HORIZONTAL_ALIGN_FILL
                    | GridData.VERTICAL_ALIGN_CENTER);
            data.widthHint = convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH);
            label.setLayoutData(data);
            label.setFont(parent.getFont());
		// Create a input field for a GRAI grid name
        this.organizationCombo = new Combo(composite, SWT.BORDER | SWT.SINGLE);
        this.organizationCombo.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
                | GridData.HORIZONTAL_ALIGN_FILL));
        this.organizationCombo.setItems(UtilsWizards.convertListToArrayName(this.listOrganization));
        
        this.organizationCombo.addModifyListener(new ModifyListener() {
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
     * Validates the input.
     * <p>
     * The default implementation of this framework method delegates the request
     * to the supplied input validator object; if it finds the input invalid,
     * the error message is displayed in the dialog's message line. This hook
     * method is called whenever the text changes in the input field.
     * </p>
     */
    protected void validateInput() {
    	if (null == this.organizationCombo.getText() || "".equals(this.organizationCombo.getText()))  {
    		setErrorMessage(FunctionProperties.ERROR_NAME_REQUIRED);
    	} else {
     	        setErrorMessage(null);
    	}
    }

	/**
	 * @return the organization
	 */
	public GgOrganization getOrganization() {
		return organization;
	}

	/**
	 * @param organization the organization to set
	 */
	public void setOrganization(GgOrganization organization) {
		this.organization = organization;
	}

 
}
