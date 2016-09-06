package org.msee.slmtoolbox.modeling.app.wizards.ea;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.msee.slmtoolbox.modeling.app.properties.MseeProperties.FolderMSeE;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin;
import org.msee.slmtoolbox.modeling.app.utils.UtilsFolder;
import org.msee.slmtoolbox.modeling.app.wizards.ConstantsMseeWizard;

public class EaExportBpmnWizardPageSelectFile extends WizardPage {
	/** page name */
	public static String PAGE_NAME = "wizard.select.from";
	/** area for select bpmn file */
	private TreeViewer fileSelect;
	/** name of project */
	private Text textName;
	/** default name for project */
	private String defaultName;
	/** Project target selected in other page */
	private IProject projectTarget;
	

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public EaExportBpmnWizardPageSelectFile(ISelection selection) {
		super(PAGE_NAME);
		setTitle("Select an BPMN file");
		setDescription("Select an BPMN file to be splited and exported.");
		ImageDescriptor icon = AbstractUIPlugin.imageDescriptorFromPlugin(
				MSeEPlugin.ID_PLUGIN_SSM_PROJECT, "icons/MSEE_logo.64.png");
		setImageDescriptor(icon);
		this.defaultName = "<BPMN file name>";
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		// Create a container
		Composite container = new Composite(parent, SWT.NULL);
		// Create a Layout
		GridLayout layout = new GridLayout();
		layout.numColumns = 1;
		layout.verticalSpacing = 9;
		container.setLayout(layout);

		// Create an input field for select a BSM
		createFilteredList(container);

		// Create an input field for a TIM project name
		// label
		Label label = new Label(container, SWT.NULL);
		label.setText("&BPMN file name:");
		label.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		// field
		textName = new Text(container, SWT.BORDER | SWT.SINGLE);
		textName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		textName.setForeground(ConstantsMseeWizard.getColorTextUndefined(getShell().getDisplay()));
		textName.setText(this.defaultName);
		textName.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent arg0) {
				if (null == getFileName()
						|| "".equals(getFileName())) {
					textName.setText(defaultName);
					textName.setForeground(ConstantsMseeWizard.getColorTextUndefined(getShell().getDisplay()));
				}
			}

			@Override
			public void focusGained(FocusEvent arg0) {
				if (null != getFileName()
						&& defaultName.equals(getFileName())) {
					textName.setText("");
				}
				textName.setForeground(ConstantsMseeWizard.getColorTextDefault(getShell().getDisplay()));
			}
		});
		textName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});

		listChanged();

		setControl(container);
	}

	protected TreeViewer createFilteredList(Composite parent) {
		// Label
		Label label = new Label(parent, SWT.NULL);
		label.setText("&Eastar file source:");
		label.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// Field
		int style = SWT.BORDER | SWT.SINGLE;

		fileSelect = new TreeViewer(new Tree(parent, style));
		fileSelect.setContentProvider(new BaseWorkbenchContentProvider());
		fileSelect.setLabelProvider(new WorkbenchLabelProvider());
		fileSelect.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				updateFileName();
				dialogChanged();
			}
		});
		fileSelect.setInput(ResourcesPlugin.getWorkspace().getRoot());
		fileSelect.getTree().setLayoutData(new GridData(GridData.FILL_HORIZONTAL|GridData.FILL_VERTICAL));
		
		return fileSelect;
	}

	/**
	 * Get file name
	 * 
	 * @return
	 */
	public String getFileName() {
		return textName.getText();
	}
	
	/**
	 * Update text name if new slect file
	 */
	public void updateFileName() {
		IFile file = getFile();
		if (null!= file && "bpmn".equals(getFile().getFileExtension())) {
			this.textName.setText(UtilsFolder.getNameFile(file));
			textName.setForeground(ConstantsMseeWizard.getColorTextGenerated(getShell().getDisplay()));
		}
	}


	/**
	 * Get file source
	 * 
	 * @return null if not bsm project selected
	 */
	public IFile getFile() {
		if (null != fileSelect.getSelection()) {
			return UtilsFolder.findFile(fileSelect.getSelection());
		}
		return null;
	}

	/**
	 * Ensures that all text fields are set.
	 */
	private void dialogChanged() {
		if (null == getFile()) {
			updateStatus("BPMN file must be selected");
			return;
		} else if (!"bpmn".equals(getFile().getFileExtension())) {
			updateStatus("File selected must be BPMN file");
			return;
		} else if (null == getFileName()
				|| getFileName().length() == 0
				|| this.defaultName.equals(getFileName())) {
			updateStatus("BPMN file name must be specified");
			return;
		} else if (null != this.projectTarget
				&& UtilsFolder.isExistFileInProject(getFileName()+".bpmn", FolderMSeE.TIM_FOLDER_PROCESS, this.projectTarget)) {
			updateStatus("BPMN file name is used in project");
			return;
		}
		updateStatus(null);
	}

	/**
	 * Ensures that all text fields are set.
	 */
	private void listChanged() {
		if (getFileName().length() == 0
				|| this.defaultName.equals(getFileName())) {
			IFile file = getFile();
			if (null != file) {
				this.defaultName = file.getName();
				this.textName.setText(this.defaultName);
				this.textName.setForeground(ConstantsMseeWizard.getColorTextGenerated(getShell().getDisplay()));
			}
		}
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	/**
	 * @return the projectTarget
	 */
	public IProject getProjectTarget() {
		return projectTarget;
	}

	/**
	 * @param projectTarget the projectTarget to set
	 */
	public void setProjectTarget(IProject projectTarget) {
		this.projectTarget = projectTarget;
	}
}
