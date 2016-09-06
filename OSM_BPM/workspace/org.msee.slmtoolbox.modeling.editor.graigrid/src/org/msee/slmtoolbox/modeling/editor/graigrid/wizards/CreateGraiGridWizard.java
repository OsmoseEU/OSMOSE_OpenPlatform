package org.msee.slmtoolbox.modeling.editor.graigrid.wizards;

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
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;

public class CreateGraiGridWizard extends AbstractMseeWizard<GgAppService> {

	private CreateGraiGridWizardPage page;
	private ISelection selection;
	private IProject selectionProject;

	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(CreateGraiGridWizard.class);
	
	/**
	 * Constructor for ServiceSystemModelingWizard.
	 */
	public CreateGraiGridWizard() {
		super();
		setAppServiceClass(GgAppService.class);
		initAppService();
	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		page = new CreateGraiGridWizardPage(selection, getAppService());
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
				log.debug("Finish wizard");
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
		// Get selected graiGrid
		GgGraiGrid graiGrid = this.page.getGraiGrid();
		this.selectionProject = this.page.getSelectionProject();
		IFile diagramFile = createFileGraphicGraiGrid(graiGrid);
		
		// Open the editor
		GraphitiUtil.openDiagramEditor(diagramFile, "org.msee.slmtoolbox.modeling.editor.graigrid.DiagramEditor");
	}

	/**
	 * Create the grai grid graphical file
	 * 
	 * @param graiGrid
	 *            business object
	 * @return graphical file
	 */
	private IFile createFileGraphicGraiGrid(GgGraiGrid graiGrid) {
		// Get the default resource set to hold the new resource
		ResourceSet resourceSet = new ResourceSetImpl();
		/* Following the change management repository : the data service is without CDO
		//Add resource CDO
		resourceSet.getResources().add(getResource());
		// test conf CDO session
		log.debug(CDOSessionFactory.getInstance().isConfigured() ? "OK" : "KO");
		*/
		
		TransactionalEditingDomain editingDomain = TransactionUtil
				.getEditingDomain(resourceSet);
		if (editingDomain == null) {
			// Not yet existing, create one
			editingDomain = TransactionalEditingDomain.Factory.INSTANCE
					.createEditingDomain(resourceSet);
		}
		CreateFileGraiGrid operation = new CreateFileGraiGrid(
				this.selectionProject, editingDomain, graiGrid);

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
