package com.sap.research.msee.slmtoolbox.uml.wizards;

public class SlmSequenceDiagramWizard extends AbstractUMLDiagramWizard{

	private static final String COMMAND = "org.eclipse.papyrus.uml.diagram.sequence.CreateSequenceDiagramCommand";
	
	@Override
	protected String getKind() {
		return COMMAND;
	}
	
}
