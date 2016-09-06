package com.sap.research.msee.slmtoolbox.uml.wizards;

public class SlmActivityDiagramWizard extends AbstractUMLDiagramWizard{

	private static final String COMMAND = "org.eclipse.papyrus.uml.diagram.activity.CreateActivityDiagramCommand";
	
	@Override
	protected String getKind() {
		return COMMAND;
	}
	
}
