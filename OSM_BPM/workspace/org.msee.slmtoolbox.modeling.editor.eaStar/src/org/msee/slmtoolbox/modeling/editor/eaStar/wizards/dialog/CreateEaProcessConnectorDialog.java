package org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog;

import java.util.ArrayList;
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
import org.msee.slmtoolbox.modeling.app.wizards.ConstantsMseeWizard;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.PropertiesEAStar.EAStarEditorWizardProperties;
import org.msee.slmtoolbox.modeling.editor.wizard.dialog.editor.AbstractMseeDialog;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;

/**
 * Dialog for create a ProcessConnector
 * @author fto
 *
 */
public class CreateEaProcessConnectorDialog extends AbstractMseeDialog<EAStarAppService> {
	
	 /**
     * Input combo widget.
     */
    private Combo combo;
    
    /**
     * process target
     */
    private EaProcess process;
    
    /**
     * Input text widget
     */
    private Text textDecompo;
    
    /**
     * Input text widget
     */
    private Text textCode;
    
    /**
     * Service Bsm
     */
    private BsmAppService bsmService;
    
    /**
     * Process list
     */
    private List<BsmProcess> processList;
    
    /**
     * Process connector
     */
    private EaProcessConnector processConnector;
    
    /**
     * Organization target
     */
    private EaOrganization organization;
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
     * @param process 
     * 				process
     * @param organization target
     * @param service
     * 				AppService
     * 			
     */
    public CreateEaProcessConnectorDialog(Shell parentShell, EaProcess process, EaOrganization organization, EAStarAppService service) {
        super(parentShell, service, EAStarEditorWizardProperties.CONNECTOR_PROCESS_TITLE);
        this.process = process;
        this.bsmService = BsmProjectManager.eInstance.createBsmService(getAppService().getProject());
		this.processList = getBsmService().getProcessList(process,false);
		this.organization = organization;
        if (null == this.processList) {
        	this.processList = new ArrayList<BsmProcess>();
        } else {
        //	Collections.sort(this.processList, new ComparatorBsmElement());
        }
    }
    
    /*
     * (non-Javadoc) Method declared on Dialog.
     */
	protected void buttonPressed(int buttonId) {
        if (buttonId == IDialogConstants.OK_ID) {
        	// Find process selected
        	BsmProcess bsmProcess = null;
        	if (-1 != this.combo.getSelectionIndex()
        			&& this.processList.size() > this.combo.getSelectionIndex()) {
        		bsmProcess = this.processList.get(this.combo.getSelectionIndex());
        	} else {
        		bsmProcess = getBsmService().createBsmProcess(this.combo.getText());
        	}
        	// call AppService
        	this.processConnector = 
        			getAppService().createEaProcessConnector(this.process, bsmProcess, this.organization);
        	if (null != this.processConnector && null != this.processConnector.getProcessRef()) {
        		this.processConnector.getProcessRef().setCode(this.textCode.getText());
        		this.processConnector.getProcessRef().setDecompositionCode(this.textDecompo.getText());
        	}
        	// add link Ea and Bsm
        	getBsmService().addEaProcessToProcess(bsmProcess, this.processConnector.getProcessRef());
        	// update data BSM if need
        	if (getAppService().needUpdate(this.processConnector.getProcessRef())) {
        		getAppService().update(this.processConnector.getProcessRef());
        	}
        	// add link Bsm object
        	BsmOrganization bsmOrganization = getBsmService().getOrganization(this.organization);
        	getBsmService().addLinkOrganizationAndProcess(bsmOrganization, this.processConnector.getProcessRef());
        	
        } else {
        	this.processConnector = null;
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
        validateInput();
    }

    /*
     * (non-Javadoc) Method declared on Dialog.
     */
    protected Control createDialogArea(Composite parent) {
        // create composite
        Composite composite = (Composite) super.createDialogArea(parent);
        // create message
            Label label = new Label(composite, SWT.WRAP);
            label.setText(EAStarEditorWizardProperties.CONNECTOR_PROCESS_QUESTION);
            GridData data = new GridData(GridData.GRAB_HORIZONTAL
                    | GridData.GRAB_VERTICAL | GridData.HORIZONTAL_ALIGN_FILL
                    | GridData.VERTICAL_ALIGN_CENTER);
            data.widthHint = convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH);
            label.setLayoutData(data);
            label.setFont(parent.getFont());
		// Create a input field for a process name
        this.combo = new Combo(composite, SWT.BORDER | SWT.SINGLE);
        this.combo.setLayoutData(new GridData(GridData.GRAB_HORIZONTAL
                | GridData.HORIZONTAL_ALIGN_FILL));
        this.combo.setItems(UtilsWizards.convertListToArrayName(this.processList));
        
        this.combo.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
            	updateData();
            }
        });
        // create message 
        label = new Label(composite, SWT.WRAP);
        label.setText("Process code :");
        data = new GridData(GridData.GRAB_HORIZONTAL
                | GridData.GRAB_VERTICAL | GridData.HORIZONTAL_ALIGN_FILL
                | GridData.VERTICAL_ALIGN_CENTER);
        this.textCode= new Text(composite, SWT.BORDER | SWT.SINGLE);
        GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		this.textCode.setLayoutData(gd);
		this.textCode.setText("");
		this.textCode.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                validateInput();
            }
        });
		

        // create message 
        label = new Label(composite, SWT.WRAP);
        label.setText("Process decomposition code :");
        data = new GridData(GridData.GRAB_HORIZONTAL
                | GridData.GRAB_VERTICAL | GridData.HORIZONTAL_ALIGN_FILL
                | GridData.VERTICAL_ALIGN_CENTER);
        this.textDecompo= new Text(composite, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		this.textDecompo.setLayoutData(gd);
		this.textDecompo.setText("");
		this.textDecompo.addModifyListener(new ModifyListener() {
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
	 * @return the process connector
	 */
	public EaProcessConnector getProcessConnector() {
		return this.processConnector;
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
    	if (null == this.combo.getText() || "".equals(this.combo.getText()))  {
    		setErrorMessage(EAStarEditorWizardProperties.CONNECTOR_PROCESS_ERROR);
    	} else if (null == this.textCode.getText() || "".equals(this.textCode.getText()))  {
    		setErrorMessage("The process code is required");
    	} else if (null == this.textDecompo.getText() || "".equals(this.textDecompo.getText()))  {
    		setErrorMessage("The process decomposition code is required");
    	} else {
    		setErrorMessage(null);
    	}
    }
    
    /**
	 * Update data in wizard
     */
    protected void updateData() {
    	if (-1 != this.combo.getSelectionIndex()
    			&& this.processList.size() > this.combo.getSelectionIndex()) {
    		BsmProcess bsmProcess = this.processList.get(this.combo.getSelectionIndex());
    		if (null != bsmProcess
    				&& null !=  bsmProcess.getEaProcess()) {
    			if (null != bsmProcess.getEaProcess().getCode()) {
    				this.textCode.setText(bsmProcess.getEaProcess().getCode());
    				this.textCode.setEditable(false);
    				this.textCode.setForeground(ConstantsMseeWizard.getColorTextUndefined(getShell().getDisplay()));
    			} else {
    				this.textCode.setText("");
    				this.textCode.setEditable(true);
    				this.textCode.setForeground(ConstantsMseeWizard.getColorTextDefault(getShell().getDisplay()));
    			}
    			if (null != bsmProcess.getEaProcess().getDecompositionCode()) {
    				this.textDecompo.setText(bsmProcess.getEaProcess().getDecompositionCode());
    				this.textDecompo.setEditable(false);
    				this.textDecompo.setForeground(ConstantsMseeWizard.getColorTextUndefined(getShell().getDisplay()));
    			} else {
    				this.textDecompo.setText("");
    				this.textDecompo.setEditable(true);
    				this.textDecompo.setForeground(ConstantsMseeWizard.getColorTextDefault(getShell().getDisplay()));
    			}
    		}
    	} else {
			this.textCode.setText("");
			this.textCode.setEditable(true);
			this.textCode.setForeground(ConstantsMseeWizard.getColorTextDefault(getShell().getDisplay()));
			this.textDecompo.setText("");
			this.textDecompo.setEditable(true);
			this.textDecompo.setForeground(ConstantsMseeWizard.getColorTextDefault(getShell().getDisplay()));
    	}
    	validateInput();
	}

	/**
	 * @return the bsmService
	 */
	public BsmAppService getBsmService() {
		return bsmService;
	}

	/**
	 * @param bsmService the bsmService to set
	 */
	public void setBsmService(BsmAppService bsmService) {
		this.bsmService = bsmService;
	}
	

}
