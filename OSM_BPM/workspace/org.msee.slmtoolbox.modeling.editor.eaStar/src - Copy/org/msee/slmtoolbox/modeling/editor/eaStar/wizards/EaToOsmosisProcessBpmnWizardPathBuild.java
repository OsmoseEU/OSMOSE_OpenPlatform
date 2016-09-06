package org.msee.slmtoolbox.modeling.editor.eaStar.wizards;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaToOmosisProcessBpmnWizardContent;


public class EaToOsmosisProcessBpmnWizardPathBuild extends WizardPage {

	public static String PAGE_NAME = "wizard.select.build";
	private EaToOmosisProcessBpmnWizardContent content;
	private Composite containerMain;
	private Combo cOsmioticProcess;
	private Combo cType;
	
	public EaToOsmosisProcessBpmnWizardPathBuild(ISelection selection, EaToOmosisProcessBpmnWizardContent content) {
		super(PAGE_NAME);
		setTitle("Select Osmiotic Process to build!");
		setDescription("Select an Osmiotic Process to generate the BPMN file.");
		this.content = content;
	}

	public void createControl(Composite parent) {
		// Create a container
		containerMain = new Composite(parent, SWT.NULL);
		// Create a Layout
		GridLayout layout = new GridLayout();
		containerMain.setLayout(layout);
		layout.numColumns = 1;
		layout.verticalSpacing = 6;
		

		Label description = new Label(containerMain, SWT.LEFT);
		description.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		description.setText("Select the osmosis process type to create:");
		
		Label seprator = new Label(containerMain, SWT.SEPARATOR | SWT.HORIZONTAL);
		seprator.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		
		
		Label osmioticProcess = new Label(containerMain, SWT.LEFT);
		osmioticProcess.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		osmioticProcess.setText("Process: ");
		
        Listener listener = new Listener()
        {
            @Override
            public void handleEvent(Event theEvent) 
            {
            	Combo combo = (Combo)(theEvent.widget);
				content.selectedRelation =combo.getItem(combo.getSelectionIndex());
				if(combo.getSelectionIndex() != -1 && cType.getSelectionIndex() != -1) setPageComplete(true);
            }
        };
		
	    cOsmioticProcess = new Combo(containerMain, SWT.NONE | SWT.READ_ONLY);
		cOsmioticProcess.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, true, false));
		cOsmioticProcess.addListener(SWT.Selection, listener);
		cOsmioticProcess.select(-1);
		
		Label type = new Label(containerMain, SWT.LEFT);
		type.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		type.setText("Type :");
		type.setVisible(false);
		
		listener = new Listener()
        {
            @Override
            public void handleEvent(Event theEvent) 
            {
            	Combo combo = (Combo)(theEvent.widget);
				content.selectedEvent =combo.getItem(combo.getSelectionIndex());
				if(combo.getSelectionIndex() != -1 && cOsmioticProcess.getSelectionIndex() != -1) setPageComplete(true);
            }
        };
		
		cType = new Combo(containerMain, SWT.NONE | SWT.READ_ONLY);
		cType.setItems(new String[] { "GENERIC", "ERROR",
				"CANCEL", "TERMINATE","TIMER","MESSAGE","CATCH" });
		cType.select(0);
		cType.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, true, false));
		cType.addListener(SWT.Selection, listener);
		cType.setVisible(false);

		setControl(containerMain);
		setPageComplete(false);
	}

	 @Override
	 public void setVisible(boolean visible) {
		 super.setVisible(visible);
		 if(visible){	 
			 cOsmioticProcess.setItems(content.listOfProcess());
		 }
	 }
	 

}
