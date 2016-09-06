package org.msee.slmtoolbox.modeling.editor.eaStar.wizards;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.msee.slmtoolbox.modeling.app.utils.MSeEPlugin.SsmProjectFile;
import org.msee.slmtoolbox.modeling.app.wizards.AbstractMseeWizardPage;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaToOmosisProcessBpmnWizardContent;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

public class EaToOsmosisProcessBpmnWizardPageFinish extends AbstractMseeWizardPage<EAStarAppService> {
	public static String PAGE_NAME = "wizard.select.finish";
	private EaToOmosisProcessBpmnWizardContent content;
	private Text text;

	public EaToOsmosisProcessBpmnWizardPageFinish(ISelection selection,
			EaToOmosisProcessBpmnWizardContent content, EAStarAppService eaStarAppService) {
		super(PAGE_NAME, eaStarAppService, selection, SsmProjectFile.BSM_PROJECT_TYPE);
		setTitle("Select Osmiotic Process to Confirm!");
		setDescription("Select an Osmiotic Process to generate the BPMN file.");
		this.content = content;
	}

	public void createControl(Composite parent) {
		// Create a container
		Composite containerMain = new Composite(parent, SWT.NULL);
		// Create a Layout
		GridLayout layout = new GridLayout();
		containerMain.setLayout(layout);
		layout.numColumns = 1;
		layout.verticalSpacing = 2;

		Label description = new Label(containerMain, SWT.LEFT);
		description.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));
		description.setText("Activities to be generated to BPMN File:");

		text = new Text(containerMain, SWT.MULTI | SWT.BORDER | SWT.V_SCROLL
				| SWT.H_SCROLL);
		text.setEditable(false);
		text.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		setControl(containerMain);
	}

	 @Override
	 public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			StringBuilder builder = new StringBuilder();
			builder.append("Osmiotic Transformation Link : " + content.selectedRelation +"\n" );
			builder.append("Osmiotic Transformation Process : " + content.selectedProcess +"\n" );
			builder.append("Osmiotic Transformation Event : " + content.selectedEvent  +"\n" );
			builder.append(content.buildStatus());
			text.setText(builder.toString());
		}
	}


	@Override
	protected void mseeProjectChange() {
		
	}

	@Override
	protected void mseeDialogChanged() {
		
	}

}
