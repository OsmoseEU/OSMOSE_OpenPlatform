package org.msee.slmtoolbox.modeling.editor.eaStar.wizards;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;

import org.eclipse.swt.SWT;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin.SsmProjectFile;
import org.msee.slmtoolbox.modeling.app.wizards.AbstractMseeWizardPage;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaToOmosisProcessBpmnWizardContent;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.Osmose.OsmioticRelation;

public class EaToOsmosisProcessBpmnWizardPageSelectCreate extends AbstractMseeWizardPage<EAStarAppService> {
	
	public static String PAGE_NAME = "wizard.select.create";
	private Composite containerMain;
	/** id for create a digitalization BPMN diagram */
	public static int CREATE_DIGITALIZATION = 0;
	/** id for create a actuation BPMN diagram */
	public static int CREATE_ACTUATION = 1;
	/** id for create a virtualization BPMN diagram */
	public static int CREATE_VIRTUALIZATION = 2;
	/** id for create a augmentation BPMN diagram */
	public static int CREATE_AUGMENTATION = 3;
	/** id for create a enrichment BPMN diagram */
	public static int CREATE_ENRICHMENT = 4;
	/** id for create a simulation BPMN diagram */
	public static int CREATE_SIMULATION = 5;
	/** wizard buttons radios */
	private Button[] radios;
	
	private EaToOmosisProcessBpmnWizardContent content;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public EaToOsmosisProcessBpmnWizardPageSelectCreate(ISelection selection, EaToOmosisProcessBpmnWizardContent content) {
		super(PAGE_NAME,null,selection,SsmProjectFile.TIM_PROJECT_TYPE);
		setTitle("Select a wizard");
		setDescription("Select the osmosis process type to create.");
		ImageDescriptor icon = AbstractUIPlugin.imageDescriptorFromPlugin(MSeEPlugin.ID_PLUGIN_SSM_PROJECT, "icons/MSEE_logo.64.png");
		setImageDescriptor(icon);
		this.content = content;
	}
	

	@Override
	public void createControl(Composite parent) {
		// Create a container
		containerMain = new Composite(parent, SWT.NULL);
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
		Label description = new Label(containerMain, SWT.LEFT);
		description.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		description.setText("Select the osmosis process type to create:");
		
		radios = new Button[6];
        Listener listener = new Listener()
        {
            @Override
            public void handleEvent(Event theEvent) 
            {
                Button button = (Button)(theEvent.widget);
				
                if (button.getSelection())
                {
                    content.selectedProcess = button.getText();
                }
            }
        };
		

		radios[0] = new Button(containerMain, SWT.RADIO);
	    radios[0].setSelection(false);
	    radios[0].setText("Digitalization");
	    radios[0].setEnabled(false);
	    radios[0].addListener(SWT.Selection, listener);
	    
		radios[1] = new Button(containerMain, SWT.RADIO);
	    radios[1].setSelection(false);
	    radios[1].setText("Actuation");
	    radios[1].setEnabled(false);
	    radios[1].addListener(SWT.Selection, listener);
	    
	    radios[2] = new Button(containerMain, SWT.RADIO);
	    radios[2].setSelection(false);
	    radios[2].setText("Virtualization");
	    radios[2].setEnabled(false);
	    radios[2].addListener(SWT.Selection, listener);
	    
	    radios[3] = new Button(containerMain, SWT.RADIO);
	    radios[3].setSelection(false);
	    radios[3].setText("Augmentation");
	    radios[3].setEnabled(false);
	    radios[3].addListener(SWT.Selection, listener);
	    
	    radios[4] = new Button(containerMain, SWT.RADIO);
	    radios[4].setSelection(false);
	    radios[4].setText("Enrichment");
	    radios[4].setEnabled(false);
	    radios[4].addListener(SWT.Selection, listener);
	    
	    radios[5] = new Button(containerMain, SWT.RADIO);
	    radios[5].setSelection(false);
	    radios[5].setText("Simulation");
	    radios[5].setEnabled(false);
	    radios[5].addListener(SWT.Selection, listener);
	    
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
	 public void setVisible(boolean visible) {
		 super.setVisible(visible);
		 if(visible){
			if (null != this.radios) {
				for (int index = 0; index < radios.length; index++) {
					this.radios[index].setSelection(false);
				}
			}
			
        	radios[0].setEnabled(false);
        	radios[1].setEnabled(false);
        	radios[2].setEnabled(false);
        	radios[3].setEnabled(false);
        	radios[4].setEnabled(false);
        	radios[5].setEnabled(false);
        	if(content.osmioticProcess != null){
        		for(OsmioticRelation i : content.osmioticProcess.values()){
        			switch (i.getOsmioticProcess()) {
        			case "DIGITALIZATION":
        				radios[0].setEnabled(true);
        				break;
        			case "VIRTUALIZATION":
        				radios[2].setEnabled(true);
        				break;
        			case "ACTUATION":
        				radios[1].setEnabled(true);
        				break;
        			case "SIMULATION":
        				radios[5].setEnabled(true);
        				break;
        			case "AUGMENTATION":
        				radios[3].setEnabled(true);
        				break;
        			case "ENRICHMENT":
        				radios[4].setEnabled(true);
        				break;
        			}
        		}
        	}
		 }
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
		setErrorMessage("Please Select one Osmiotic process!");
		return -1;
	}

	/**
	 * @return the project target
	 */
	public IProject getProjectTarget() {
		return getSelectionProject();
	}

}

