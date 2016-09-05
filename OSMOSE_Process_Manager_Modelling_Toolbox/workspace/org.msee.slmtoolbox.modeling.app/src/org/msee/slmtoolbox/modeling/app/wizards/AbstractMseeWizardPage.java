package org.msee.slmtoolbox.modeling.app.wizards;

import java.io.File;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.msee.slmtoolbox.modeling.app.service.BsmProjectManager;
import org.msee.slmtoolbox.modeling.app.service.TimProjectManager;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin.SsmProjectFile;
import org.msee.slmtoolbox.modeling.app.utils.UtilsFolder;
import org.msee.slmtoolbox.modeling.service.app.AbstractAppService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;

public abstract class AbstractMseeWizardPage<S extends AbstractAppService> extends WizardPage {

	/** organization list */
	private S appService;
	
	/** select folder*/
	private IResource diagramContainer;
	
	/** select project */
	private IProject selection;
	
	/** text for folder path of project **/
	private Text containerText;
	
	/** folder name in project **/
	private String folderDiagram;
	
	/** diagram name */
	private String nameDiagram;
	
	/** project type */
	private String typeProject;
	
	/** define if the control brower is create */
	private boolean controlBrowerCreate;
	
	/** flag for folder change */
	private boolean folderChange;
	
	/** Bsm service */
	private BsmAppService bsmAppervice;
	
	
	/** Constructor by default
	 * 
	 * @param pageName			page name
	 * @param appService		app service
	 * @param selectionFolder	folder selected
	 * @param typeProject		type project <code>SsmProjectFile</code>
	 */
	protected AbstractMseeWizardPage(String pageName, S appService, ISelection selectionFolder, String typeProject) {
		super(pageName);
		this.setAppService(appService);
		this.selection = UtilsFolder.findProject(selectionFolder);
		this.typeProject = typeProject;
		this.controlBrowerCreate = false;
		this.folderChange = false;
		this.bsmAppervice = BsmProjectManager.eInstance.createBsmService(this.selection);
	}

	/**
	 * create control for create a GRAI grid wizard
	 */
	public void createControlBrower(Composite containerMain) {
		this.controlBrowerCreate = true;
		// Create a container main
		Composite container = new Composite(containerMain, SWT.NULL);
		// Create a Layout main
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		container.setLayout(layout);
		container.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		
		Label label = new Label(container, SWT.NULL);
		label.setText("&Location:");
	
		containerText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		containerText.setLayoutData(gd);
		containerText.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		// defin a default path
		String pathProject = UtilsFolder.findProjectPath(this.selection);
		if (null != pathProject) {
			// if folder define add to path
			if (null != this.folderDiagram) {
				pathProject += File.separator + this.folderDiagram + File.separator;
			}
			containerText.setText(pathProject);
		}
	
		Button button = new Button(container, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});

		dialogChanged();
	}


	/**
	 * Uses the standard diagramContainer selection dialog to choose the new value for the diagramContainer field.
	 */

	private void handleBrowse() {
		// Create a label provider for presentation of the list element 
		ILabelProvider labelProvider = new LabelProjectProvider();
		// Create a dialog for project list
		ElementListSelectionDialog  dialog = new ElementListSelectionDialog (getShell(), labelProvider);
		// Add project list
		dialog.setElements(UtilsFolder.getProjectForType(ResourcesPlugin.getWorkspace().getRoot().getProjects(),this.typeProject));
		// add title and message
		dialog.setTitle("Select a project");
		dialog.setMessage("Select project for create the " + nameDiagram + " diagram");
		
		if (dialog.open() == Window.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				selection = UtilsFolder.findProject(new TreeSelection(new TreePath(result)));
				// defin a default path
				String path = UtilsFolder.findProjectPath(selection);
				if (null != path) {
					// if folder define add to path
					if (null != this.folderDiagram) {
						path += File.separator + this.folderDiagram + File.separator;
					}
					if (path.equals(containerText.getText())) {
						this.folderChange = false;
					} else {
						this.folderChange = true;
						containerText.setText(path);
					}
				}
			}
		}
	}
	
	/**
	 * Ensures that both text fields are set.
	 */
	public void dialogChanged() {
		if (controlBrowerCreate) {
			diagramContainer = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getContainerName()));
	
			if (null!=this.typeProject) {
				boolean isGoodProject = false;
				String type = null;
				if (SsmProjectFile.BSM_PROJECT_TYPE.equals(this.typeProject)) {
					// if project find is BSM
					isGoodProject = BsmProjectManager.eInstance.isBsmProject(this.getSelectionProject());
					type = SsmProjectFile.BSM_PROJECT_TYPE_NAME;
				} else if (SsmProjectFile.TIM_PROJECT_TYPE.equals(this.typeProject)) {
					// if project find is TIM
					isGoodProject = TimProjectManager.eInstance.isTimProject(this.getSelectionProject());
					type = SsmProjectFile.TIM_PROJECT_TYPE_NAME;
				}
				
				if (!isGoodProject && null!= type) {
					updateStatus("Project selected are not a type " + type);
					return;
				}
			}
			if (getContainerName().length() == 0) {
				updateStatus("Folder must be specified");
				return;
			}
			if (diagramContainer == null || (diagramContainer.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
				updateStatus("Folder must exist");
				return;
			}
			if (!diagramContainer.isAccessible()) {
				updateStatus("Project must be writable");
				return;
			}
			if (this.folderChange) {
				this.bsmAppervice = BsmProjectManager.eInstance.createBsmService(getSelectionProject());
				mseeProjectChange();
				this.folderChange = false;
			}
		}
		mseeDialogChanged();
	}

	/**
	 * Action when msee project changed
	 */
	protected abstract void mseeProjectChange();
	
	protected abstract void mseeDialogChanged();
	
	protected void addNewElementsForCombo(Combo combo, List<?> list) {
		// Stop modify listener combo
		Listener[] temp = combo.getListeners(SWT.Modify);
		for (int i=0; i< temp.length; i++)
			combo.removeListener(SWT.Modify, temp[i]);
		// modify combo
		combo.setItems(UtilsWizards.convertListToArrayName(list));
		// active modify listener combo
		for (int i=0; i< temp.length; i++)
			combo.addListener(SWT.Modify, temp[i]);
	}

	protected String getContainerName() {
		return containerText.getText();
	}

	
	/**
	 * @return the appService
	 */
	public S getAppService() {
		return appService;
	}

	/**
	 * @param appService the appService to set
	 */
	protected void setAppService(S appService) {
		this.appService = appService;
	}
	
	/**
	 * Update status with error message
	 * @param message	error message
	 */
	protected void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	/**
	 * @return the selectionProject
	 */
	public IProject getSelectionProject() {
		return UtilsFolder.findProject(this.selection);
	}

	/**
	 * @return the folderDiagram
	 */
	public String getFolderDiagram() {
		return folderDiagram;
	}

	/**
	 * @param folderDiagram the folderDiagram to set
	 */
	public void setFolderDiagram(String folderDiagram) {
		this.folderDiagram = folderDiagram;
	}

	/**
	 * @return the nameDiagram
	 */
	public String getNameDiagram() {
		return nameDiagram;
	}

	/**
	 * @param nameDiagram the nameDiagram to set
	 */
	public void setNameDiagram(String nameDiagram) {
		this.nameDiagram = nameDiagram;
	}

	/**
	 * @return the bsmAppervice
	 */
	public BsmAppService getBsmAppervice() {
		return bsmAppervice;
	}

	/**
	 * @param bsmAppervice the bsmAppervice to set
	 */
	public void setBsmAppervice(BsmAppService bsmAppervice) {
		this.bsmAppervice = bsmAppervice;
	}


}
