package org.msee.slmtoolbox.modeling.editor.graigrid.wizards;

import java.util.List;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.msee.slmtoolbox.modeling.app.properties.MseeProperties.FolderMSeE;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin.SsmProjectFile;
import org.msee.slmtoolbox.modeling.app.utils.UtilsFolder;
import org.msee.slmtoolbox.modeling.app.wizards.AbstractMseeWizardPage;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.graigrid.Activator;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.PropertiesGraiGrid.GraiGridEditorWizardProperties;
import org.msee.slmtoolbox.modeling.editor.util.MseeUtils;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;

public class CreateGraiGridWizardPage extends AbstractMseeWizardPage<GgAppService> {
	
	/** grai grid combo with decision structure name */
	private Combo decisionStructureCombo;

	/** enterprise combo with organization name */
	private Combo enterpriseCombo;
	
	/** decision structure list */
	private List<BsmDecisionStructure> listDecisionStructure;

	/** organization list type */
	private List<BsmOrganization> listOrganization;
	
	/**
	 * Constructor for CreateGraiGridWizardPage.
	 * @param graiGridAppService 
	 * 
	 * @param pageName
	 */
	public CreateGraiGridWizardPage(ISelection selected, GgAppService graiGridAppService) {
		super("createGraiGridWizardPage", graiGridAppService, selected, SsmProjectFile.BSM_PROJECT_TYPE);
		setTitle(GraiGridEditorWizardProperties.GRAI_GRID_TITLE);
		setDescription(GraiGridEditorWizardProperties.GRAI_GRID_DESCRIPTION);
		ImageDescriptor icon = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.PLUGIN_ID, 
				GraiGridEditorWizardProperties.GRAI_GRID_ICON_PATH);
		setImageDescriptor(icon);
		this.setFolderDiagram(FolderMSeE.BSM_FOLDER_GG);
		this.setNameDiagram(GraiGridEditorWizardProperties.DIAGRAM_NAME);
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
		
		// Create a label for a enterprise name
		Label label = new Label(container, SWT.NULL);
		label.setText("&Enterprise name:");
		// find all enterprise
		this.listOrganization = getBsmAppervice().getOrganizationList(true);
		// Create a input field for a enterprise name
		enterpriseCombo = new Combo(container, SWT.BORDER | SWT.SINGLE);
		enterpriseCombo.setItems(UtilsWizards.convertListToArrayName(this.listOrganization));
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		enterpriseCombo.setLayoutData(gd);
		enterpriseCombo.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				dialogChanged();
				organizationChanged();
			}
		});
		
		// Create a label for a grai grid name
		label = new Label(container, SWT.NULL);
		label.setText("&GRAI grid name:");
		// find all decision structure for SSM
		this.listDecisionStructure =  getBsmAppervice().getDecisionStructureList(getOrganizationSelected());
		// Create a input field for a GRAI grid name
		this.decisionStructureCombo = new Combo(container, SWT.BORDER | SWT.SINGLE);
		this.decisionStructureCombo.setItems(UtilsWizards.convertListToArrayName(this.listDecisionStructure));
		this.decisionStructureCombo.setLayoutData(gd);
		this.decisionStructureCombo.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		setControl(containerMain);
	}

	/**
	 * Reload decision list if organization change
	 */
	private void organizationChanged() {
		// find all decision structure for SSM
		this.listDecisionStructure =  getBsmAppervice().getDecisionStructureList(getOrganizationSelected());
		// completed combo with new list
		addNewElementsForCombo(decisionStructureCombo, listDecisionStructure);
	}

	/**
	 * Action when msee project changed
	 */
	protected void mseeProjectChange() {
		// find all enterprise
		this.listOrganization = getBsmAppervice().getOrganizationList(true);
		// completed combo with new list
		addNewElementsForCombo(enterpriseCombo, listOrganization);
		
		// find all decision structure for SSM
		this.listDecisionStructure =  getBsmAppervice().getDecisionStructureList(getOrganizationSelected());
		// completed combo with new list
		addNewElementsForCombo(decisionStructureCombo, listDecisionStructure);
	}
	
	/**
	 * Ensures that both text fields are set.
	 */
	protected void mseeDialogChanged() {
		if (null == enterpriseCombo || null == enterpriseCombo.getText() || enterpriseCombo.getText().length() == 0 ) {
			updateStatus(GraiGridEditorWizardProperties.REQUIRED_NAME_ENTERPRISE_TEXT);
		} else if (null == decisionStructureCombo || null == decisionStructureCombo.getText() || decisionStructureCombo.getText().length() == 0 ) {
			updateStatus(GraiGridEditorWizardProperties.REQUIRED_NAME_GRAIGRID_TEXT);
		} else if (UtilsFolder.isExistFileInProject(this.decisionStructureCombo.getText() + GraiGridEditorWizardProperties.DIAGRAM_EXTENSION, 
				FolderMSeE.BSM_FOLDER_GG, getSelectionProject())) {
			// test file
			updateStatus("Graigird file name is used in project");
		} else {
			updateStatus(null);
		}
	}
	
	/**
	 * Get the grai grid, create it not exist
	 * @return a new graiGrid
	 */
	public GgGraiGrid getGraiGrid() {
		// find organization selected
		BsmOrganization bsmEnterprise = getOrganizationSelected();
		if (null == bsmEnterprise) {
			bsmEnterprise =
					getBsmAppervice().createBsmOrganization(this.enterpriseCombo.getText(), true);
		}
		// find decision structure selected
		BsmDecisionStructure bsmDecisionStructure = null;
		if (-1 != this.decisionStructureCombo.getSelectionIndex()
				&& this.decisionStructureCombo.getSelectionIndex() < this.listDecisionStructure.size()) {
			bsmDecisionStructure = this.listDecisionStructure.get(this.decisionStructureCombo.getSelectionIndex());
		} else {
			bsmDecisionStructure = getBsmAppervice().createBsmDecisionStructure(this.decisionStructureCombo.getText(),bsmEnterprise);
		}
		// create graigird
		GgGraiGrid ggGraiGrid = getAppService().createGraiGrid(bsmDecisionStructure.getName());
		// create code organization
    	String code = "<O>";
    	if (null != bsmEnterprise.getName()
    			&& !" ".equals(bsmEnterprise.getName())) {
    		code = MseeUtils.generateCodeForName(bsmEnterprise.getName());
    	}
		// create organization
		GgOrganization ggOrganization = getAppService().createOrganization(ggGraiGrid, bsmEnterprise.getName(),code);
		// generate Grille
		getAppService().generatesNewGrid(ggGraiGrid, ggOrganization);
		// add bsm link
		getBsmAppervice().addGgGraiGridToDecisionStructure(bsmDecisionStructure,ggGraiGrid);
		getBsmAppervice().addGgOrganizationToOrganization(bsmEnterprise,ggOrganization);
		getBsmAppervice().addLinkDecisionStructureAndOrganization(bsmEnterprise,bsmDecisionStructure);
		return ggGraiGrid;
	}

	/**
	 * @return BsmOrganization selected
	 */
	private BsmOrganization getOrganizationSelected() {
		if (-1 != this.enterpriseCombo.getSelectionIndex()
			&& this.enterpriseCombo.getSelectionIndex() < this.listOrganization.size()) {
			return this.listOrganization.get(this.enterpriseCombo.getSelectionIndex());
		}
		return null;
	}

}
