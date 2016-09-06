package org.msee.slmtoolbox.modeling.app.wizards.ea;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin.SsmProjectFile;
import org.msee.slmtoolbox.modeling.app.wizards.AbstractMseeWizardPage;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

public class EaExportBpmnWizardPageSelectCreate extends AbstractMseeWizardPage<EAStarAppService> {
	public static String PAGE_NAME = "wizard.select.create";

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public EaExportBpmnWizardPageSelectCreate(ISelection selection) {
		super(PAGE_NAME,null,selection,SsmProjectFile.TIM_PROJECT_TYPE);
		setTitle("Select a wizard");
		setDescription("Select the osmosis process type to create.");
		ImageDescriptor icon = AbstractUIPlugin.imageDescriptorFromPlugin(MSeEPlugin.ID_PLUGIN_SSM_PROJECT, "icons/MSEE_logo.64.png");
		setImageDescriptor(icon);
	}
	
	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		// Create a container
		Composite containerMain = new Composite(parent, SWT.NULL);
		// Create a Layout
		GridLayout layout = new GridLayout();
		containerMain.setLayout(layout);
		layout.numColumns = 1;
		layout.verticalSpacing = 9;
		
		// Create element for folder
		createControlBrower(containerMain);
		
		// Create radio buttons
		Label seprator = new Label(containerMain, SWT.SEPARATOR | SWT.HORIZONTAL);
		seprator.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		setControl(containerMain);
	}
	
	@Override
	protected void mseeProjectChange() {
	}

	@Override
	protected void mseeDialogChanged() {
		updateStatus(null);
	}
	
	/**
	 * @return the project target
	 */
	public IProject getProjectTarget() {
		return getSelectionProject();
	}
}
