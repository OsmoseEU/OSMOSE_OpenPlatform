package org.msee.slmtoolbox.modeling.editor.eaStar.wizards;

import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.msee.slmtoolbox.modeling.app.properties.MseeProperties.FolderMSeE;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin.SsmProjectFile;
import org.msee.slmtoolbox.modeling.app.utils.UtilsFolder;
import org.msee.slmtoolbox.modeling.app.wizards.AbstractMseeWizardPage;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.PropertiesEAStar.EAStarEditorWizardProperties;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

public class CreateEAStarWizardPage extends AbstractMseeWizardPage<EAStarAppService> {
	
	/** Process combo with process name */
	private Combo processCombo;

	/** bsm process list */
	private List<BsmProcess> listBsmProcess;
	
	/** Process combo with organization name */
	private Combo organizationCombo;
	
    /** Code  */
    private Text textCode;
	
    /** Decomposition code  */
    private Text textDecompo;

	/** bsm organization list */
	private List<BsmOrganization> listBsmOrganization;
	
	/**
	 * Constructor for CreateGraiGridWizardPage.
	 * 
	 * @param pageName
	 */
	public CreateEAStarWizardPage(ISelection selected, EAStarAppService eaStarAppService) {
		super("createEaStarProcessWizardPage", eaStarAppService, selected, SsmProjectFile.BSM_PROJECT_TYPE);
		setTitle("Create a EAStar diagram");
		setDescription("This wizard creates a new EAStar diagram for a Service System Modeling.");
		this.setFolderDiagram(FolderMSeE.BSM_FOLDER_EA);
		this.setNameDiagram(EAStarEditorWizardProperties.DIAGRAM_NAME);
	}

	/**
	 * create control for create a GRAI grid wizard
	 */
	@Override
	public void createControl(Composite parent) {
		// Create a container main
		Composite containerMain = new Composite(parent, SWT.NONE);
		containerMain.setSize(parent.getSize());
		// Create a Layout main
		GridLayout  layoutMain = new GridLayout ();
		layoutMain.numColumns = 1;
		containerMain.setLayout(layoutMain);
		containerMain.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		
		
		// Create element for folder
		createControlBrower(containerMain);
		Label seprator = new Label(containerMain, SWT.SEPARATOR | SWT.HORIZONTAL);
		seprator.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		
		// Create a container
		Composite container = new Composite(containerMain, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		// Create a Layout main
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		layout.verticalSpacing = 9;
				
		// Create a label for a eaStar name
		Label label = new Label(container, SWT.NULL);
		label.setText("&Process name:");
		// find all process for SSM and organization
		this.listBsmProcess =  getBsmAppervice().getProcessList(null,false);
		// Create a input field for a eaStar name
		this.processCombo = new Combo(container, SWT.BORDER | SWT.SINGLE);
		this.processCombo.setItems(UtilsWizards.convertListToArrayName(this.listBsmProcess));
		this.processCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.processCombo.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				updateData();
				dialogChanged();
			}
		});
		
		// Create a label for a eaStar organization
		label = new Label(container, SWT.NULL);
		label.setText("&Organization name:");
		// find all process for SSM and organization
		this.listBsmOrganization =  getBsmAppervice().getOrganizationList();
		// Create a input field for a eaStar organization
		this.organizationCombo = new Combo(container, SWT.BORDER | SWT.SINGLE);
		this.organizationCombo.setItems(UtilsWizards.convertListToArrayName(this.listBsmOrganization));
		this.organizationCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.organizationCombo.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		// create  a label for a code 
        label = new Label(container, SWT.WRAP);
        label.setText("&Code :");
		// Create a input field for a decomposition code 
        this.textCode = new Text(container, SWT.BORDER | SWT.SINGLE);
		this.textCode.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.textCode.setText("");
		this.textCode.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
            	dialogChanged();
            }
        });
		
		// create  a label for a decomposition code 
        label = new Label(container, SWT.WRAP);
        label.setText("&Decomposition code :");
		// Create a input field for a decomposition code 
        this.textDecompo= new Text(container, SWT.BORDER | SWT.SINGLE);
		this.textDecompo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.textDecompo.setText("");
		this.textDecompo.addModifyListener(new ModifyListener() {
            public void modifyText(ModifyEvent e) {
            	dialogChanged();
            }
        });
		
		
		setControl(container);
	}
	
	protected void mseeProjectChange() {
		// find new Process list
		this.listBsmProcess =  getBsmAppervice().getProcessList(null,false);
		
		// completed combo with new list
		this.processCombo.setItems(UtilsWizards.convertListToArrayName(this.listBsmProcess));
	}
	
	/**
	 * Update data in wizard
	 */
	protected void updateData(){

    	if (-1 != this.processCombo.getSelectionIndex()
    			&& this.listBsmProcess.size() > this.processCombo.getSelectionIndex()) {
    		BsmProcess bsmProcess = this.listBsmProcess.get(this.processCombo.getSelectionIndex());
    		if (null != bsmProcess
    				&& null !=  bsmProcess.getEaProcess()) {
    			if (null != bsmProcess.getEaProcess().getCode()) {
    				this.textCode.setText(bsmProcess.getEaProcess().getCode());
    			} else {
    				this.textCode.setText("");
    			}
    			if (null != bsmProcess.getEaProcess().getDecompositionCode()) {
    				this.textDecompo.setText(bsmProcess.getEaProcess().getDecompositionCode());
    			} else {
    				this.textDecompo.setText("");
    			}
    		}
    	} else {
			this.textCode.setText("");
			this.textDecompo.setText("");
    	}
	}
	
	/**
	 * Ensures that both text fields are set.
	 */
	protected void mseeDialogChanged() {
		if (null == this.processCombo || null == this.processCombo.getText() || this.processCombo.getText().length() == 0 ) {
			// test value process
			updateStatus(EAStarEditorWizardProperties.REQUIRED_NAME_TEXT);
		} else if (null == this.organizationCombo || null == this.organizationCombo.getText() || this.organizationCombo.getText().length() == 0) {
			// test value organization
			updateStatus(EAStarEditorWizardProperties.REQUIRED_NAME_ORGANIZATION_TEXT);
		} else if (null == this.textCode || null == this.textCode.getText() || this.textCode.getText().length() == 0) {
			// test value Code
			updateStatus(EAStarEditorWizardProperties.REQUIRED_CODE_TEXT);
		} else if (null == this.textDecompo || null == this.textDecompo.getText() || this.textDecompo.getText().length() == 0) {
			// test value Decomposition code
			updateStatus(EAStarEditorWizardProperties.REQUIRED_DECOMPO_TEXT);
		} else if (UtilsFolder.isExistFileInProject(EaUtils.getDiagramNameFile(this.processCombo.getText(), this.textDecompo.getText()), 
				FolderMSeE.BSM_FOLDER_EA, getSelectionProject())) {
			// test file
			updateStatus("Eastar file name is used in project");
		} else {
			updateStatus(null);
		}
	}

	public EaProcess getProcess() {
		// find process selected
		BsmProcess bsmProcess = null;
		if (-1 != this.processCombo.getSelectionIndex()
				&& this.processCombo.getSelectionIndex() < this.listBsmProcess.size()) {
			bsmProcess = this.listBsmProcess.get(this.processCombo.getSelectionIndex());
		} else {
			bsmProcess = getBsmAppervice().createBsmProcess(this.processCombo.getText());
		}
		
		EaProcess eaProcess = getAppService().createEaProcess(bsmProcess);
		eaProcess.setCode(this.textCode.getText());
		eaProcess.setDecompositionCode(this.textDecompo.getText());
		getBsmAppervice().updateData(eaProcess);
		getOrCreateOrganization(eaProcess);
		// Add link Bsm to Ea*
		getBsmAppervice().addEaProcessToProcess(bsmProcess,eaProcess);
		return eaProcess;
	}

	/**
	 * Get or create an organization in model of process
	 * @param eaProcess
	 */
	private void getOrCreateOrganization(EaProcess eaProcess) {
		// find orgnization selected
		BsmOrganization bsmOrganization = null;
		if (-1 != this.organizationCombo.getSelectionIndex()
				&& this.organizationCombo.getSelectionIndex() < this.listBsmOrganization.size()) {
			bsmOrganization = this.listBsmOrganization.get(this.organizationCombo.getSelectionIndex());
		} else {
			bsmOrganization = getBsmAppervice().createBsmOrganization(this.organizationCombo.getText(), true);
		}
		
		EaOrganization eaOrganization = getAppService().createEaOrganization(eaProcess.getModel(), bsmOrganization.getName());
		// Add link Bsm to Ea*
		getBsmAppervice().addEaOrganizationToOrganization(bsmOrganization, eaOrganization);
		getBsmAppervice().addLinkOrganizationAndProcess(bsmOrganization, eaProcess);
	}

}
