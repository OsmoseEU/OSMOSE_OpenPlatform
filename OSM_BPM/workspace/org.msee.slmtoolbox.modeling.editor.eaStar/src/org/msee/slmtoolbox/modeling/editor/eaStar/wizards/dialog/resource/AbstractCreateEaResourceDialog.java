package org.msee.slmtoolbox.modeling.editor.eaStar.wizards.dialog.resource;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
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
import org.msee.slmtoolbox.modeling.editor.wizard.dialog.editor.AbstractMseeDialog;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;


/**
 * Main class for a dialog which create a EAStarResource
 * @author fto
 *
 * @param <S> define an EAStarResource
 */
public abstract class AbstractCreateEaResourceDialog<S extends EaResource> extends AbstractMseeDialog<EAStarAppService> {

    /**
     * Input combo widget.
     */
    private Combo combo;
    
    /**
     * process target
     */
    private EaProcess process;
    
    /**
     * Resource
     */
    private S resource;
    
    /**
     * Resource type : EAStarHuman.class, EAStarIT.class or EAStarMaterial.class
     */
    private Class<S> resourceType;
    
    /**
     * Resource list
     */
    private List<BsmResource> resourceList;
    
    /**
     * Organization target
     */
    private EaOrganization eaOrganization;
    
    /**
     * Service Bsm
     */
    private BsmAppService bsmService;
    
    /**
     * Error label for name required, must be initialized in the constructor
     */
    private String errorNameRequired;
    
    /**
     * Text for question, must be initialized in the constructor
     */
    private String userQuestionName;
    
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
    public AbstractCreateEaResourceDialog(Shell parentShell, EaProcess process, Class<S> resourceType, EAStarAppService service,
    		String title, EaOrganization eaOrganization) {
        super(parentShell, service, title);
        this.process = process;
        this.resourceType = resourceType;
        this.bsmService = BsmProjectManager.eInstance.createBsmService(getAppService().getProject());
        this.eaOrganization = eaOrganization;
        try {
			this.resourceList = getBsmService().getResourceList(process, this.eaOrganization, resourceType);
	        if (null == this.resourceList) {
	        	this.resourceList = new ArrayList<BsmResource>();
	        } else {
	        //	Collections.sort(this.resourceList, new ComparatorEaElement());
	        }
		} catch (CoreException e) {
			// TODO Auto-generated catch block
        	this.resourceList = new ArrayList<BsmResource>();
		}
    }

    /*
     * (non-Javadoc) Method declared on Dialog.
     */
    @SuppressWarnings("unchecked")
	protected void buttonPressed(int buttonId) {
        if (buttonId == IDialogConstants.OK_ID) {
        	// Find resource selected
        	BsmResource resource = null;
        	if (-1 != this.combo.getSelectionIndex()
        			&& this.resourceList.size() > this.combo.getSelectionIndex()) {
        		resource = this.resourceList.get(this.combo.getSelectionIndex());
        	} else {
        		resource = getBsmService().createBsmResource(this.combo.getText(), this.eaOrganization, resourceType);
        	}
        	// create ea resource
        	this.resource = 
        			(S) getAppService().getOrCreateResource(this.process,  this.eaOrganization, resourceType, resource);
        	// add link BSM
        	getBsmService().addEaResourceToResource(resource, this.resource, resourceType);
        	getBsmService().addLinkResourceAndProcess(resource, this.process);
        } else {
        	this.resource = null;
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
            label.setText(this.userQuestionName);
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
        this.combo.setItems(UtilsWizards.convertListToArrayName(this.resourceList));
        
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
	 * @return the resource
	 */
	public S getResource() {
		return this.resource;
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
    		setErrorMessage(this.errorNameRequired);
    	} else {
     	        setErrorMessage(null);
    	}
    }

	/**
	 * @return the errorNameRequired
	 */
	protected String getErrorNameRequired() {
		return errorNameRequired;
	}

	/**
	 * @param errorNameRequired the errorNameRequired to set
	 */
	protected void setErrorNameRequired(String errorNameRequired) {
		this.errorNameRequired = errorNameRequired;
	}

	/**
	 * @return the userQuestionName
	 */
	protected String getUserQuestionName() {
		return userQuestionName;
	}

	/**
	 * @param userQuestionName the userQuestionName to set
	 */
	protected void setUserQuestionName(String userQuestionName) {
		this.userQuestionName = userQuestionName;
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

	/**
	 * @return the eaOrganization
	 */
	public EaOrganization getEaOrganization() {
		return eaOrganization;
	}

	/**
	 * @param eaOrganization the eaOrganization to set
	 */
	public void setEaOrganization(EaOrganization eaOrganization) {
		this.eaOrganization = eaOrganization;
	}
	
	
}
