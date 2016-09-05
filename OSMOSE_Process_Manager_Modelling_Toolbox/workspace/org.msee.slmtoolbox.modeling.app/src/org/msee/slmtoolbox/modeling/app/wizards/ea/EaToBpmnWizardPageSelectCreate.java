package org.msee.slmtoolbox.modeling.app.wizards.ea;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin.SsmProjectFile;
import org.msee.slmtoolbox.modeling.app.wizards.AbstractMseeWizardPage;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

/**
 * Page wizard for select BPMN File to create
 * @author fto
 *
 */
public class EaToBpmnWizardPageSelectCreate extends AbstractMseeWizardPage<EAStarAppService> {
	
	/** page name */
	public static String PAGE_NAME = "wizard.select.create";
	/** id for create a collaboration BPMN diagram */
	public static int CREATE_COLLABORATION = 0;
	/** id for create a process BPMN diagram */
	public static int CREATE_PROCESS = 1;
	/** wizard buttons radios */
	private Button[] radios;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public EaToBpmnWizardPageSelectCreate(ISelection selection) {
		super(PAGE_NAME,null,selection,SsmProjectFile.TIM_PROJECT_TYPE);
		setTitle("Select a wizard");
		setDescription("Select a diagram type to create.");
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
		
		// Create radio button
		Label seprator = new Label(containerMain, SWT.SEPARATOR | SWT.HORIZONTAL);
		seprator.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		radios = new Button[2];
		radios[0] = new Button(containerMain, SWT.RADIO);
	    radios[0].setSelection(true);
	    radios[0].setText("Create a Collaboration BPMN2.0 diagram");
	    radios[0].setSelection(true);
		radios[1] = new Button(containerMain, SWT.RADIO);
	    radios[1].setSelection(false);
	    radios[1].setText("Create a Process BPMN2.0 diagram");
		
		setControl(containerMain);
	}
	
	/**
	 * Get user selection
	 * @return -1 if not found selection
	 */
	public int getSelectionWizard() {
		if (null != this.radios) {
			for (int index = 0; index < radios.length; index++) {
				if (this.radios[index].getSelection()) {
					return index;
				}
			}
		}
		return -1;
	}

	@Override
	protected void mseeProjectChange() {
	}

	@Override
	protected void mseeDialogChanged() {
		updateStatus(null);
	}
	
	/**
	 * Get user selection
	 * @return -1 if not found selection
	 */
	public int getSelectionCreate() {
		if (null != this.radios) {
			for (int index = 0; index < radios.length; index++) {
				if (this.radios[index].getSelection()) {
					return index;
				}
			}
		}
		return -1;
	}

	/**
	 * @return the project target
	 */
	public IProject getProjectTarget() {
		return getSelectionProject();
	}

}
