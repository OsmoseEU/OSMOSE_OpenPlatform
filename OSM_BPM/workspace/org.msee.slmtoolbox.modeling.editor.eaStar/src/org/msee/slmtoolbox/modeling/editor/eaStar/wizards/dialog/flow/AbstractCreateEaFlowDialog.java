package org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.flow;

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
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlow;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaFlowNode;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;


/**
 * Main class for a dialog which create a EAStarFlow
 * @author fto
 *
 * @param <S> define an EAStarResource
 */
public abstract class AbstractCreateEaFlowDialog extends AbstractMseeDialog<EAStarAppService> {

    /**
     * Input combo widget.
     */
    private Text text;
    
    /**
     * process target
     */
    private EaProcess process;
    
    /**
     * Flow
     */
    private EaFlow flow;
    
    /**
     * Source
     */
    private EaFlowNode source;
    
    /**
     * Target
     */
    private EaFlowNode target;
    
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
     * @param resourceType
     * 				resource type
     * @param service
     * 				AppService
     * @param title
     *            the dialog title, or <code>null</code> if none
     * @param eaOrganization 
     * 			
     */
    public AbstractCreateEaFlowDialog(Shell parentShell, EaProcess process, EaFlowNode source, EaFlowNode target, EAStarAppService service,
    		String title) {
        super(parentShell, service, title);
        this.process = process;
        this.source = source;
        this.target = target;
    }

    /*
     * (non-Javadoc) Method declared on Dialog.
     */
	protected void buttonPressed(int buttonId) {
        if (buttonId == IDialogConstants.OK_ID) {
        	// create ea resource
        	this.flow = createFlow(this.process, this.source,this.target);
        	this.flow.setName(this.text.getText());
        } else {
        	this.flow = null;
        }
        super.buttonPressed(buttonId);
    }
    
    protected abstract EaFlow createFlow(EaProcess process, EaFlowNode source,
			EaFlowNode target);

	/*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.dialogs.Dialog#createButtonsForButtonBar(org.eclipse.swt.widgets.Composite)
     */
    protected void createButtonsForButtonBar(Composite parent) {
        super.createButtonsForButtonBar(parent);
        //do this here because setting the text will set enablement on the ok
        validateInput();
        // button
        this.text.setFocus();
    }

    /*
     * (non-Javadoc) Method declared on Dialog.
     */
    protected Control createDialogArea(Composite parent) {
        // create composite
        Composite composite = (Composite) super.createDialogArea(parent);
        // create message
            Label label = new Label(composite, SWT.WRAP);
            label.setText("Enter new flow name :");
            GridData data = new GridData(GridData.GRAB_HORIZONTAL
                    | GridData.GRAB_VERTICAL | GridData.HORIZONTAL_ALIGN_FILL
                    | GridData.VERTICAL_ALIGN_CENTER);
            data.widthHint = convertHorizontalDLUsToPixels(IDialogConstants.MINIMUM_MESSAGE_AREA_WIDTH);
            label.setLayoutData(data);
            label.setFont(parent.getFont());
		// Create a input field for a GRAI grid name
        this.text = new Text(composite, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		this.text.setLayoutData(gd);
		this.text.setText("");
		this.text.addModifyListener(new ModifyListener() {
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
	 * @return the resource
	 */
	public EaFlow getFlow() {
		return this.flow;
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
    		setErrorMessage("The flow name is required");
    	} else {
     	        setErrorMessage(null);
    	}
    }
	
}
