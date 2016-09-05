package com.sap.research.msee.slmtoolbox.uml.wizards;

public class SlmStateDiagramWizard extends AbstractUMLDiagramWizard{

	private static final String COMMAND = "org.eclipse.papyrus.uml.diagram.statemachine.CreationCommand";
	
	@Override
	protected String getKind() {
		return COMMAND;
	}
	
}
