package org.msee.slmtoolbox.modeling.app.wizards.ea;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.msee.slmtoolbox.modeling.app.properties.MseeProperties.FolderMSeE;
import org.msee.slmtoolbox.modeling.transformation.EastarTransformation;

/**
 * Wizard of create a BPMN File from EaStar File
 * @author fto
 *
 */
public class EaToBpmnWizard extends Wizard implements INewWizard {

	/** page for select bmnp type file to create */
	private EaToBpmnWizardPageSelectCreate pageSelectCreate;

	/** page for select eastat file */
	private EaToBpmnWizardPageSelectFile pageSelectFile;
	
	/** user selection before call wizard */
	private ISelection selection;
	
	/**
	 * Constructor for TIMServiceSystemModelingWizard.
	 */
	public EaToBpmnWizard() {
		super();
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

	/**
	 * Adding the page to the wizard.
	 */
	public void addPages() {
		this.pageSelectCreate = new EaToBpmnWizardPageSelectCreate(selection);
		this.pageSelectFile = new EaToBpmnWizardPageSelectFile(selection);
		
		addPage(this.pageSelectCreate);
		addPage(this.pageSelectFile);
	}
	

	
	public IWizardPage getNextPage(IWizardPage currentPage) {
		if (currentPage instanceof EaToBpmnWizardPageSelectCreate) {
			this.pageSelectFile.setProjectTarget(this.pageSelectCreate.getProjectTarget());
			return getPage(EaToBpmnWizardPageSelectFile.PAGE_NAME);
		} else {
			return null;
		}
	}
	
	public IWizardPage getPreviousPage(IWizardPage currentPage) {
		if (currentPage instanceof EaToBpmnWizardPageSelectFile) {
			return getPage(EaToBpmnWizardPageSelectCreate.PAGE_NAME);
		} else {
			return null;
		}
	}
	
	//Checks if the wizard is allowed to be finished
	public boolean canFinish()
	{
		if(getContainer().getCurrentPage() == pageSelectCreate)
			return false;
		else
			return true;
	}
	
	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	public boolean performFinish() {
		final int selectionCreate = this.pageSelectCreate.getSelectionCreate();
		final IProject projectTarget = this.pageSelectCreate.getProjectTarget();
		final IFile file = this.pageSelectFile.getFile();
		final String fileName = this.pageSelectFile.getFileName();
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				try {
					doFinish(selectionCreate, file, fileName, projectTarget, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			String ExceptionMsg;
			if (e.getCause() != null &&
					e.getCause().getMessage() != null &&
					e.getCause().getMessage().length() > 0)
				ExceptionMsg = e.getCause().getMessage();
			else
				ExceptionMsg = "An unkown error has occurred.\n" +
						"Please make sure all required fields, in all required pages, are properly filled.";
			MessageDialog.openError(getShell(), "Error", ExceptionMsg);
			return false;
		}
		return true;
	}

	/**
	 * The worker method. It will find the container, create the file if missing
	 * or just replace its contents, and open the editor on the newly created
	 * file.
	 * @param bsmProjectSource 
	 */
	private void doFinish(int selectionCreate, IFile fileSource, String fileName, IProject projectTarget, IProgressMonitor monitor) throws CoreException {
		// Get the URI of the model file.
		IFile fileTarget = projectTarget.getFile(FolderMSeE.TIM_FOLDER_PROCESS + "/" + fileName + ".bpmn");
		
		if (selectionCreate ==  EaToBpmnWizardPageSelectCreate.CREATE_COLLABORATION) {
			EastarTransformation.toBpmnCollaboration(fileSource.getFullPath().toString(),
					fileTarget.getFullPath().toString(),projectTarget.getName());
		} else if (selectionCreate ==  EaToBpmnWizardPageSelectCreate.CREATE_PROCESS) {
			EastarTransformation.toBpmnProcess(fileSource.getFullPath().toString(),
					fileTarget.getFullPath().toString(),projectTarget.getName());
		}
	}

}
