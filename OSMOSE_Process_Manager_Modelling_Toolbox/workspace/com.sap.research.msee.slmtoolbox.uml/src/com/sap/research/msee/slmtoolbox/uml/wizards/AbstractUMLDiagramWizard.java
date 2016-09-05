package com.sap.research.msee.slmtoolbox.uml.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.uml.diagram.wizards.InitModelWizard;
import org.eclipse.papyrus.uml.diagram.wizards.SettingsHelper;
import org.eclipse.papyrus.uml.diagram.wizards.pages.NewModelFilePage;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public abstract class AbstractUMLDiagramWizard extends InitModelWizard implements INewWizard {

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		IDialogSettings settings = getDialogSettings();
		SettingsHelper helper = new SettingsHelper(settings);
		helper.saveDefaultDiagramCategory(new String[]{"uml"});
		List<String> kinds = new ArrayList<String>();
		kinds.add(getKind());
		//kinds.add("org.eclipse.papyrus.diagram.activity.CreateActivityDiagramCommand");
		//kinds.add("org.eclipse.papyrus.diagram.sequence.CreateSequenceDiagramCommand");
		//kinds.add("org.eclipse.papyrus.diagram.statemachine.CreationCommand");
		helper.saveDefaultDiagramKinds("uml", kinds);
	}
	
	@Override
	protected NewModelFilePage createNewModelFilePage(IStructuredSelection selection) {
		if(!isCreateFromExistingDomainModel()) {
			return new NewSlmModelFilePage(selection);
		}
		return super.createNewModelFilePage(selection);
	}
	
	protected abstract String getKind();

}
