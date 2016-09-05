package org.msee.slmtoolbox.modeling.app.wizards.tim;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.FilteredList;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin.SsmProjectFile;
import org.msee.slmtoolbox.modeling.app.utils.UtilsFolder;
import org.msee.slmtoolbox.modeling.app.wizards.ConstantsMseeWizard;
import org.msee.slmtoolbox.modeling.app.wizards.LabelProjectProvider;

/**
 * Wizard page for transformation bsm project to tim project
 */
public class TIMModelingWizardPageTransformProject extends WizardPage {
	/** page name */
	public static String PAGE_NAME = "wizard.create.from";
	/** project bsm list */
	private FilteredList list;
	/** name of project */
	private Text textName;
	/** default name for project */
	private String defaultName;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public TIMModelingWizardPageTransformProject(ISelection selection) {
		super(PAGE_NAME);
		setTitle("Select a OBM project");
		setDescription("Select a OBM project and enter a new  name for create a OTIM project Service System Modeling.");
		ImageDescriptor icon = AbstractUIPlugin.imageDescriptorFromPlugin(
				MSeEPlugin.ID_PLUGIN_SSM_PROJECT, "icons/MSEE_logo.64.png");
		setImageDescriptor(icon);
		this.defaultName = "";
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
		label.setText("&TIM project name:");
		label.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		// field
		textName = new Text(container, SWT.BORDER | SWT.SINGLE);
		textName.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		textName.setForeground(ConstantsMseeWizard.getColorTextUndefined(getShell().getDisplay()));
		textName.addFocusListener(new FocusListener() {

			@Override
			public void focusLost(FocusEvent arg0) {
				if (null == getTIMProjectName()
						|| getTIMProjectName().equals("")) {
					textName.setForeground(ConstantsMseeWizard.getColorTextUndefined(getShell().getDisplay()));
				}
			}

			@Override
			public void focusGained(FocusEvent arg0) {
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

	protected FilteredList createFilteredList(Composite parent) {
		// Label
		Label label = new Label(parent, SWT.NULL);
		label.setText("&Bsm project source:");

		// Field
		int flags = SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | SWT.SINGLE;

		list = new FilteredList(parent, flags, new LabelProjectProvider(),
				false, false, true);

		GridData data = new GridData();
		// data.widthHint = convertWidthInCharsToPixels(fWidth);
		// data.heightHint = convertHeightInCharsToPixels(fHeight);
		data.grabExcessVerticalSpace = true;
		data.grabExcessHorizontalSpace = true;
		data.horizontalAlignment = GridData.FILL;
		data.verticalAlignment = GridData.FILL;
		list.setLayoutData(data);
		list.setFont(parent.getFont());
		list.setFilter(""); //$NON-NLS-1$
		list.setElements(UtilsFolder.getProjectForType(ResourcesPlugin
				.getWorkspace().getRoot().getProjects(),
				SsmProjectFile.BSM_PROJECT_TYPE));

		list.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {
				listChanged();
				dialogChanged();
			}

			public void widgetSelected(SelectionEvent e) {
				listChanged();
				dialogChanged();
			}
		});
		return list;
	}

	/**
	 * Get project name
	 * 
	 * @return
	 */
	public String getTIMProjectName() {
		return textName.getText();
	}

	/**
	 * Get bsm project source
	 * 
	 * @return null if not bsm project selected
	 */
	public IProject getBsmPojectSource() {
		if (list.getSelection().length == 1) {
			return UtilsFolder.findProject(new TreeSelection(new TreePath(list
					.getSelection())));
		}
		return null;
	}

	/**
	 * Ensures that all text fields are set.
	 */
	private void dialogChanged() {
		if (null == getBsmPojectSource()) {
			updateStatus("Bsm project must be selected");
			return;
		} else if (null == getTIMProjectName()
				|| getTIMProjectName().length() == 0) {
			updateStatus("TIM project name must be specified");
			return;
		} else if (UtilsFolder.isExistInProject(getTIMProjectName())) {
			updateStatus("Project name is used");
			return;
		}
		updateStatus(null);
	}

	/**
	 * Ensures that all text fields are set.
	 */
	private void listChanged() {
		if (getTIMProjectName().length() == 0
				|| this.defaultName.equals(getTIMProjectName())) {
			IProject project = getBsmPojectSource();
			if (null != project) {
				this.defaultName = project.getName() + " - TIM";
				this.textName.setText(this.defaultName);
				this.textName.setForeground(ConstantsMseeWizard.getColorTextGenerated(getShell().getDisplay()));
			}
		}
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}
}
