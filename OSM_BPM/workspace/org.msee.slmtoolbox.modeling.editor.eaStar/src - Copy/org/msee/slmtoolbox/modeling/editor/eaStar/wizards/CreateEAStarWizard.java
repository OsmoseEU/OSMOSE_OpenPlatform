package org.msee.slmtoolbox.modeling.editor.eaStar.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.msee.slmtoolbox.modeling.app.wizards.AbstractMseeWizard;
import org.msee.slmtoolbox.modeling.editor.util.GraphitiUtil;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;

public class CreateEAStarWizard extends AbstractMseeWizard<EAStarAppService> {

	private CreateEAStarWizardPage page;
	private ISelection selection;
	private IProject selectionProject;

	/**
	 * Constructor for ServiceSystemModelingWizard.
	 */
	public CreateEAStarWizard() {
		super();
		setAppServiceClass(EAStarAppService.class);
		initAppService();
	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new CreateEAStarWizardPage(selection, getAppService());
		addPage(page);
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	public boolean performFinish() {
		/*final ServiceSystemBsm bsm = BsmCoreService.eINSTANCE
				.getServiceSystemBsm(this.page.getIdSsm());
		TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(bsm);
		// if editingDomain doesn't exist
		if (null == editingDomain)
			// simple add*/
			try {
				doFinish(null);
			} catch (CoreException e) {
				e.printStackTrace();
			}/*
		else {
			// add by Command because editingDomain ...
			editingDomain.getCommandStack().execute(
					new RecordingCommand(editingDomain) {
						@Override
						protected void doExecute() {
							try {
								doFinish(null);
							} catch (CoreException e) {
								e.printStackTrace();
							}
						}
					});
		}*/
		return true;
	}

	/**
	 * The worker method. It will find the container, create the file if missing
	 * or just replace its contents, and open the editor on the newly created
	 * file.
	 */

	private void doFinish(IProgressMonitor monitor) throws CoreException {
		// Get selected Process
		EaProcess process = this.page.getProcess();
		this.selectionProject = this.page.getSelectionProject();
		IFile diagramFile = createFileGraphicEaStar(process);
		
		// Open the editor
		GraphitiUtil.openDiagramEditor(diagramFile, "org.msee.slmtoolbox.modeling.editor.eaStar.EaDiagramEditor");
	}
	
	/**
	 * Create the eaStar graphical file
	 * 
	 * @param process
	 *            eaStar process
	 * @return graphical file
	 */
	private IFile createFileGraphicEaStar(EaProcess process) {
		// Get the default resource set to hold the new resource
		ResourceSet resourceSet = new ResourceSetImpl();
		
		TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(resourceSet);
		if (editingDomain == null) {
			// Not yet existing, create one
			editingDomain = TransactionalEditingDomain.Factory.INSTANCE
					.createEditingDomain(resourceSet);
		}
		// Create new diagram
		CreateFileEaStar operation = new CreateFileEaStar(
				this.selectionProject, editingDomain, process);

		editingDomain.getCommandStack().execute(operation);

		editingDomain.dispose();

		return operation.diagramFile;
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}
