package org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.activity;

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
import org.msee.slmtoolbox.modeling.editor.wizard.dialog.editor.AbstractMseeDialog;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaAtomicExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

/**
 * Dialog for create an ExtendedActivity
 * @author fto
 *
 */
public class CreateEaAtomicExtendedActivityDialog extends AbstractMseeDialog<EAStarAppService> {
	/**
     * Input combo widget.
     */
    private Text textName;
    
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
    private EaAtomicExtendedActivity activity;
    
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
    public CreateEaAtomicExtendedActivityDialog(Shell parentShell, EaProcess process, EaOrganization eaOrganization, EAStarAppService service,
    		 String title) {
		super(parentShell, service, title);
		this.process = process;
		this.organization = eaOrganization;
    }

    /*
     * (non-Javadoc) Method declared on Dialog.
     */
	protected void buttonPressed(int buttonId) {
        if (buttonId == IDialogConstants.OK_ID) {
        	
        	this.activity = getAppService().createEaAtomicExtendedActivity(this.process, this.organization);
        	this.activity.setName(this.textName.getText());
        	this.activity.setDecompositionCode(this.textDecompo.getText());
        	this.activity.setCode(this.textCode.getText());
        	
        } else {
        	this.activity = null;
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
        this.textName.setFocus();
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
        label.setText("Enter new extended activity name :");
        GridData data = new GridData(GridData.GRAB_HORIZONTAL
                | GridData.GRAB_VERTICAL | GridData.HORIZONTAL_ALIGN_FILL
                | GridData.VERTICAL_ALIGN_CENTER);
        data.widthHint = convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH);
        label.setLayoutData(data);
        label.setFont(parent.getFont());
		// Create a input field for a GRAI grid name
        this.textName = new Text(composite, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		this.textName.setLayoutData(gd);
		this.textName.setText("");
		this.textName.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                validateInput();
            }
        });
        

        // create message 
        label = new Label(composite, SWT.WRAP);
        label.setText("Enter code :");
        data = new GridData(GridData.GRAB_HORIZONTAL
                | GridData.GRAB_VERTICAL | GridData.HORIZONTAL_ALIGN_FILL
                | GridData.VERTICAL_ALIGN_CENTER);
        this.textCode= new Text(composite, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		this.textCode.setLayoutData(gd);
		this.textCode.setText("");
		this.textCode.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
                validateInput();
            }
        });
		

        // create message 
        label = new Label(composite, SWT.WRAP);
        label.setText("Enter decomposition code :");
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
    	if (null == this.textName.getText() || "".equals(this.textName.getText()))  {
    		setErrorMessage("The extended activity name is required");
    	} else if (null == this.textCode.getText() || "".equals(this.textCode.getText()))  {
    		setErrorMessage("The extended activity code is required");
    	} else if (null == this.textDecompo.getText() || "".equals(this.textDecompo.getText()))  {
    		setErrorMessage("The extended activity decomposition code is required");
    	} else {
    		setErrorMessage(null);
    	}
    }

	/**
	 * @return the extendedActivity
	 */
	public EaAtomicExtendedActivity getEaAtomicExtendedActivity() {
		return activity;
	}
	
}
