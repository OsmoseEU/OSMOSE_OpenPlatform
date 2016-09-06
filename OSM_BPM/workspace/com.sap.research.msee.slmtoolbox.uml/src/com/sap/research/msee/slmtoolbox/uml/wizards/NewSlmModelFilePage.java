package com.sap.research.msee.slmtoolbox.uml.wizards;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.papyrus.uml.diagram.wizards.pages.NewModelFilePage;
import org.eclipse.swt.widgets.Composite;

public class NewSlmModelFilePage extends NewModelFilePage {

	public NewSlmModelFilePage(IStructuredSelection selection) {
		super(selection);
	}
	
	/*@Override
	protected void initialPopulateContainerNameField() {
		initialContainerFullPath 
		super.initialPopulateContainerNameField();
		
	}*/
	@Override
	public void createControl(Composite parent) {
		try {
			IContainer container = SlmWizardUtils.createProjectIfNecessary();
			if(container != null)
				setContainerFullPath(container.getFullPath());		
			super.createControl(parent);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
}
