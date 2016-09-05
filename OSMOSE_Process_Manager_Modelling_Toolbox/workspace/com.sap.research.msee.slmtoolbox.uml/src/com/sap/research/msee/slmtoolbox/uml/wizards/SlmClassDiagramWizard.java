package com.sap.research.msee.slmtoolbox.uml.wizards;

public class SlmClassDiagramWizard extends AbstractUMLDiagramWizard{

	private static final String COMMAND = "org.eclipse.papyrus.uml.diagram.clazz.CreateClassDiagramCommand";
	
	@Override
	protected String getKind() {
		return COMMAND;
	}
	
}
