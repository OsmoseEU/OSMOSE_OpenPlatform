package org.msee.slmtoolbox.modeling.app.wizards;


import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
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
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin;

/**
 * Create wizard page for a service system modeling
 */
public class BSMModelingWizardPage extends WizardPage {
	/** Default value for a BSM name */
	private static final String DEFAULT_VALUE_BSM_NAME = "<OBM Service System Modeling name>";
	
	/** Default value for a enterprise name */
	private static final String DEFAULT_VALUE_ORGANIZATION_NAME = "<Organization name>";
	
	/** Default value for a service name */
	private static final String DEFAULT_VALUE_SERVICE_NAME = "<Service name>";
	
	/** Input field for the name of SSM project */
	private Text bsmNameText;

	/** Input field for the name of organization */
	private Text organizationText;

	/** Input field for the name of service */
	private Text serviceText;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public BSMModelingWizardPage(ISelection selection) {
		super("wizardPage");
		setTitle("Create a OBM project Service System Modeling");
		setDescription("This wizard creates a new project for a OBM Service System Modeling.");
		ImageDescriptor icon = AbstractUIPlugin.imageDescriptorFromPlugin(MSeEPlugin.ID_PLUGIN_SSM_PROJECT, "icons/MSEE_logo.64.png");
		setImageDescriptor(icon);
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		// Create a container
		Composite container = new Composite(parent, SWT.NULL);
		// Create a Layout
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		layout.verticalSpacing = 9;
		
		// Create a label for a BSM project name
		Label label = new Label(container, SWT.NULL);
		label.setText("&BSM project name:");
		// Create an input field for a BSM project name
		bsmNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		bsmNameText.setLayoutData(gd);
		bsmNameText.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent arg0) {
				if (null == getBSMPojectName()
						|| getBSMPojectName().equals("")) {
					bsmNameText.setForeground(ConstantsMseeWizard.getColorTextUndefined(getShell().getDisplay()));
					bsmNameText.setText(DEFAULT_VALUE_BSM_NAME);
				}
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				if (null != getBSMPojectName()
						&& getBSMPojectName().equals(DEFAULT_VALUE_BSM_NAME)) {
					bsmNameText.setForeground(ConstantsMseeWizard.getColorTextDefault(getShell().getDisplay()));
					bsmNameText.setText("");
				}
			}
		});
		bsmNameText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		// Create a label for a enterprise name
		label = new Label(container, SWT.NULL);
		label.setText("&Organization name:");
		// Create an input field for a enterprise name
		organizationText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		organizationText.setLayoutData(gd);
		organizationText.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent arg0) {
				if (null == getOrganizationName()
						|| getOrganizationName().equals("")) {
					organizationText.setForeground(ConstantsMseeWizard.getColorTextUndefined(getShell().getDisplay()));
					organizationText.setText(DEFAULT_VALUE_ORGANIZATION_NAME);
				}
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				if (null != getOrganizationName()
						&& getOrganizationName().equals(DEFAULT_VALUE_ORGANIZATION_NAME)){
					organizationText.setForeground(ConstantsMseeWizard.getColorTextDefault(getShell().getDisplay()));
					organizationText.setText("");
				}
			}
		});
		organizationText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		// Create a label for a service name
		label = new Label(container, SWT.NULL);
		label.setText("&Service name:");
		// Create a input field for a enterprise name
		serviceText = new Text(container, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		serviceText.setLayoutData(gd);
		serviceText.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent arg0) {
				if (null == getServiceName()
						|| getServiceName().equals("")){
					serviceText.setForeground(ConstantsMseeWizard.getColorTextUndefined(getShell().getDisplay()));
					serviceText.setText(DEFAULT_VALUE_SERVICE_NAME);
				}
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				if (null != getServiceName()
						&& getServiceName().equals(DEFAULT_VALUE_SERVICE_NAME)){
					serviceText.setForeground(ConstantsMseeWizard.getColorTextDefault(getShell().getDisplay()));
					serviceText.setText("");
				}
			}
		});
		serviceText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
		
		initialize();
		setControl(container);
	}

	/**
	 * Tests if the current workbench selection is a suitable container to use.
	 */

	private void initialize() {
		bsmNameText.setText(DEFAULT_VALUE_BSM_NAME);
		bsmNameText.setForeground(ConstantsMseeWizard.getColorTextUndefined(getShell().getDisplay()));
		organizationText.setText(DEFAULT_VALUE_ORGANIZATION_NAME);
		organizationText.setForeground(ConstantsMseeWizard.getColorTextUndefined(getShell().getDisplay()));
		serviceText.setText(DEFAULT_VALUE_SERVICE_NAME);
		serviceText.setForeground(ConstantsMseeWizard.getColorTextUndefined(getShell().getDisplay()));
	}


	/**
	 * Ensures that all text fields are set.
	 */
	private void dialogChanged() {
		if (getBSMPojectName().length() == 0 || getBSMPojectName().endsWith(DEFAULT_VALUE_BSM_NAME)) {
			updateStatus("OBM project name must be specified");
			return;
		}
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(getBSMPojectName());
		if (project.exists()) {
			updateStatus("A project with this name already exists.");
			return;
		}
		if (getOrganizationName().length() == 0 || getOrganizationName().endsWith(DEFAULT_VALUE_BSM_NAME)) {
			updateStatus("Organization name must be specified");
			return;
		}
		if (getServiceName().length() == 0 || getServiceName().endsWith(DEFAULT_VALUE_SERVICE_NAME)) {
			updateStatus("Service name must be specified");
			return;
		}
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getBSMPojectName() {
		return bsmNameText.getText();
	}

	public String getOrganizationName() {
		return organizationText.getText();
	}

	public String getServiceName() {
		return serviceText.getText();
	}
}