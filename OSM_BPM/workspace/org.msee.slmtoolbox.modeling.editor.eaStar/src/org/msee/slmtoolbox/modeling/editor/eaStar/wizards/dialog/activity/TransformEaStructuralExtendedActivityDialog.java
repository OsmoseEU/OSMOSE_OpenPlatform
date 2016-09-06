package org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.activity;

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
import org.msee.slmtoolbox.modeling.editor.wizard.dialog.editor.AbstractMseeDialog;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAtomicExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;

/**
 * Dialog for create an ExtendedActivity
 * @author fto
 *
 */
public class TransformEaStructuralExtendedActivityDialog extends AbstractMseeDialog<EAStarAppService> {
	/**
     * Input combo widget.
     */
    private Combo combo;
    
    /**
     * Input text widget
     */
    private Text textDecompo;
    
    /**
     * Input text widget
     */
    private Text textCode;
    
    /**
     * process source
     */
    private EaProcess process;
    
    /**
     * organization target
     */
    private EaOrganization organization;
    
    /**
     * extendedActivity to create
     */
    private EaStructuralExtendedActivity extendedActivity;
    
    /**
     * old activity
     */
    private EaAtomicExtendedActivity oldActivity;
    
    /**
     * Service Bsm
     */
    private BsmAppService bsmService;
    
    /**
     * Sub process list
     */
    private List<BsmProcess> processList;
    
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
     * @param eaOrganization 
     * @param service
     * 				AppService
     * @param title
     *            the dialog title, or <code>null</code> if none
     * 			
     */
    public TransformEaStructuralExtendedActivityDialog(Shell parentShell, EaProcess process, EaOrganization eaOrganization, EAStarAppService service,
    		 EaAtomicExtendedActivity oldActivity) {
		super(parentShell, service, "Transforme the Atomic activity to Structural activity");
		this.process = process;
        this.bsmService = BsmProjectManager.eInstance.createBsmService(getAppService().getProject());
		this.processList = getBsmService().getProcessList(process, true);
		this.organization = eaOrganization;
		this.oldActivity = oldActivity;
        if (null == this.processList) {
        	this.processList = new ArrayList<BsmProcess>();
        } else {
        	//Collections.sort(this.processList, new ComparatorBsmElement());
        }
    }

    /*
     * (non-Javadoc) Method declared on Dialog.
     */
	protected void buttonPressed(int buttonId) {
        if (buttonId == IDialogConstants.OK_ID) {
        	// Find Function selected
        	BsmProcess bsmProcess = null;
        	if (-1 != this.combo.getSelectionIndex()
        			&& this.processList.size() > this.combo.getSelectionIndex()) {
        		bsmProcess = this.processList.get(this.combo.getSelectionIndex());
        	} else {
        		bsmProcess = getBsmService().createBsmProcess(this.combo.getText());
        	}
        	// call AppService
        	this.extendedActivity = 
        			getAppService().getOrCreateEaStructuralExtendedActivity(this.process, bsmProcess, this.organization);
        	this.extendedActivity.setCode(this.textCode.getText());
        	this.extendedActivity.setDecompositionCode(this.textDecompo.getText());
        	if (null != this.extendedActivity.getIsA()) {
            	this.extendedActivity.getIsA().setCode(this.textCode.getText());
            	this.extendedActivity.getIsA().setDecompositionCode(this.textDecompo.getText());
        	}
        	// add a link with Ea and Bsm
        	getBsmService().addEaProcessToProcess(bsmProcess, this.extendedActivity.getIsA());
        	// add link Bsm object
        	BsmOrganization bsmOrganization = getBsmService().getOrganization(this.organization);
        	getBsmService().addLinkOrganizationAndProcess(bsmOrganization, this.extendedActivity.getIsA());
        	getBsmService().addLinkMainAndSub(this.process,this.extendedActivity.getIsA());
        } else {
        	this.extendedActivity = null;
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
		//GridLayout  layoutMain = new GridLayout ();
		//layoutMain.numColumns = 2;
		//composite.setLayout(layoutMain);
		
        // create message
        Label label = new Label(composite, SWT.WRAP);
        label.setText("Enter process name :");
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
        this.combo.setItems(UtilsWizards.convertListToArrayName(this.processList));
        this.combo.add(this.oldActivity.getName());
        this.combo.setText(this.oldActivity.getName());
        
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
		this.textCode.setText(oldActivity.getCode());
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
		this.textDecompo.setText(oldActivity.getDecompositionCode());
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
    		setErrorMessage("The extended activity name is required");
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
    				this.textCode.setText(oldActivity.getCode());
    				this.textCode.setEditable(true);
    				this.textCode.setForeground(ConstantsMseeWizard.getColorTextDefault(getShell().getDisplay()));
    			}
    			if (null != bsmProcess.getEaProcess().getDecompositionCode()) {
    				this.textDecompo.setText(bsmProcess.getEaProcess().getDecompositionCode());
    				this.textDecompo.setEditable(false);
    				this.textDecompo.setForeground(ConstantsMseeWizard.getColorTextUndefined(getShell().getDisplay()));
    			} else {
    				this.textDecompo.setText(oldActivity.getDecompositionCode());
    				this.textDecompo.setEditable(true);
    				this.textDecompo.setForeground(ConstantsMseeWizard.getColorTextDefault(getShell().getDisplay()));
    			}
    		}
    	} else {
			this.textCode.setText(oldActivity.getCode());
			this.textCode.setEditable(true);
			this.textCode.setForeground(ConstantsMseeWizard.getColorTextDefault(getShell().getDisplay()));
			this.textDecompo.setText(oldActivity.getDecompositionCode());
			this.textDecompo.setEditable(true);
			this.textDecompo.setForeground(ConstantsMseeWizard.getColorTextDefault(getShell().getDisplay()));
    	}
    	validateInput();
	}

	/**
	 * @return the extendedActivity
	 */
	public EaStructuralExtendedActivity getEaStructuralExtendedActivity() {
		return extendedActivity;
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
