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
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.PropertiesEAStar.EAStarEditorWizardProperties;
import org.msee.slmtoolbox.modeling.editor.wizard.dialog.editor.AbstractMseeDialog;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;

public class CreateEaOrganizationDialog extends AbstractMseeDialog<EAStarAppService> {
	
	 /**
    * Input combo widget.
    */
   private Combo combo;
   
   /**
    * process target
    */
   private EaProcess process;
   
   /**
    * Organization list
    */
   private List<BsmOrganization> organizationList;
   
   /**
    * Organization connector
    */
   private EaOrganization organization;
   
   /**
    * Defautlt Organization
    */
   private BsmOrganization defaultOrganization;
   
   /**
    * Service Bsm
    */
   private BsmAppService bsmService;
   
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
    * @param defaultOrganization 
    * @param service
    * 				AppService
    * 			
    */
	public CreateEaOrganizationDialog(Shell parentShell, EaProcess process,
			EaOrganization defaultOrganization, EAStarAppService service) {
		super(parentShell, service,
				EAStarEditorWizardProperties.ORGANIZATION_TITLE);
		this.process = process;
		this.bsmService = BsmProjectManager.eInstance.createBsmService(getAppService().getProject());
		this.defaultOrganization = getBsmService().getOrganization(defaultOrganization);
		this.organizationList = getBsmService().getOrganizationList();
		if (null == this.organizationList) {
			this.organizationList = new ArrayList<BsmOrganization>();
		} else if (null != this.defaultOrganization) {
			for (BsmOrganization bsmOrganization : this.organizationList) {
				if (bsmOrganization.getId().equals(this.defaultOrganization.getId())) {
					this.organizationList.remove(bsmOrganization);
					break;
				}
			}
		}
	}
   
   /*
    * (non-Javadoc) Method declared on Dialog.
    */
	protected void buttonPressed(int buttonId) {
		if (buttonId == IDialogConstants.OK_ID) {
			// Find process selected
			BsmOrganization bsmOrganization = null;
			if (-1 != this.combo.getSelectionIndex()
					&& this.organizationList.size() > this.combo
							.getSelectionIndex()) {
				bsmOrganization = this.organizationList.get(this.combo
						.getSelectionIndex());
			} else {
				bsmOrganization = getBsmService().createBsmOrganization(this.combo.getText(), true);
			}
        	// create ea organization
			this.organization = getAppService().getOrCreateOrganization(
					this.process, bsmOrganization, this.combo.getText());
        	// add link BSM
			getBsmService().addEaOrganizationToOrganization(bsmOrganization, this.organization);
        	getBsmService().addLinkOrganizationAndProcess(bsmOrganization, this.process);
		} else {
			this.organization = null;
		}
		super.buttonPressed(buttonId);
	}


	// if reference exist
	/*if (null != bsmReference) {
		bsmService.addEaOrganizationToOrganization(bsmReference,orgnization);
	} else {
		// else create a reference
		bsmService.createBsmOrganization(orgnization, false);
	}*/
   
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
           label.setText(EAStarEditorWizardProperties.ORGANIZATION_QUESTION);
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
       this.combo.setItems(UtilsWizards.convertListToArrayName(this.organizationList));
       
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
	 * @return the organization
	 */
	public EaOrganization getOrganization() {
		return this.organization;
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
		if (null == this.combo.getText() || "".equals(this.combo.getText())) {
			setErrorMessage(EAStarEditorWizardProperties.ORGANIZATION_ERROR);
		} else {
			setErrorMessage(null);
		}
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