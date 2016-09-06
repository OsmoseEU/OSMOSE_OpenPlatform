package org.msee.slmtoolbox.modeling.app.wizards.tim;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin;

/**
 * Wizard page for select wizard for create a tim project
 */
public class TIMModelingWizardPageSelectWizard extends WizardPage {
	
	/** page name */
	public static String PAGE_NAME = "wizard.create.select";
	/** id for wizard to transformation bsm project */
	public static int SELECT_FROM_BSM = 0;
	/** id for wizard to create a new tim project */
	public static int SELECT_NEW_PROJECT = 1;
	/** wizard buttons radios */
	private Button[] radios;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public TIMModelingWizardPageSelectWizard(ISelection selection) {
		super(PAGE_NAME);
		setTitle("Select a wizard");
		setDescription("Select a wizard for create a OTIM project Service System Modeling.");
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
		layout.numColumns = 1;
		layout.verticalSpacing = 9;
		
		radios = new Button[2];
		
		radios[0] = new Button(container, SWT.RADIO);
	    radios[0].setSelection(true);
	    radios[0].setText("Create a OTIM Service System Modeling project from OBM project");
	    radios[0].setSelection(false);
	    
		radios[1] = new Button(container, SWT.RADIO);
	    radios[1].setSelection(true);
	    radios[1].setText("Create a new OTIM Service System Modeling project");
		
		setControl(container);
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

}
