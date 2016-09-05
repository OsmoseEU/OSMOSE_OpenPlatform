package org.msee.slmtoolbox.modeling.app.wizards;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.TeamException;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.msee.slmtoolbox.modeling.app.RepositoryProviderImpl;
import org.msee.slmtoolbox.modeling.app.service.BsmProjectManager;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmAppService;

/**
 * Wizard of create a BSM SSM (ServiceSystemModel) project
 */
public class BsmModelingWizard extends
		AbstractMseeWizard<BsmAppService> {

	private BSMModelingWizardPage pageForCreateFile;
	private ISelection selection;
	private RepositoryProvider repositoryProvider;

	/**
	 * Constructor for BsmModelingWizard.
	 */
	public BsmModelingWizard() {
		super();
		setAppServiceClass(BsmAppService.class);
		initAppService();
		repositoryProvider = new RepositoryProviderImpl();
		
	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		pageForCreateFile = new BSMModelingWizardPage(selection);
		addPage(pageForCreateFile);
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	public boolean performFinish() {
		final String bsmProjectName = pageForCreateFile.getBSMPojectName();
		final String organizationName = pageForCreateFile.getOrganizationName();
		final String serviceName = pageForCreateFile.getServiceName();
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				try {
					doFinish(bsmProjectName, organizationName, serviceName,
							monitor);
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
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error",
					realException.getMessage());
			return false;
		}
		return true;
	}

	/**
	 * The worker method. It will find the container, create the file if missing
	 * or just replace its contents, and open the editor on the newly created
	 * file.
	 */

	private void doFinish(String bsmProjectName, String organizationName,
			String serviceName, IProgressMonitor monitor) throws CoreException {
		// create a project
		monitor.beginTask("Creating OBM project " + bsmProjectName, 2);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(bsmProjectName);
		if (project.exists()) {
			throwCoreException("Project \"" + bsmProjectName
					+ "\" does already exist.");
		}

		// create project
		project.create(monitor);
		project.open(monitor);

		// create a description
		IProjectDescription description = project.getDescription();
		// add nature of SSM project
		project.setDescription(description, monitor);
		
		//map the project and the repositoryProvider
		//the repositoryProvider will assign a MoveDeleteHook to the project
		try {
			repositoryProvider.setProject(project);
			RepositoryProvider.map(project, repositoryProvider.getID());
		} catch (TeamException e1) {
			e1.printStackTrace();
		}

		BsmProjectManager manager = BsmProjectManager.eInstance;
		// create folder
		manager.createTreeForProject(project);

		// create the business objects
		BsmModel bsmProject = createBusinessObject(bsmProjectName,
				organizationName, serviceName);

		// save in project the id projec SSM
		if (null != bsmProject) {
			manager.createConfigurationFileMsee(project, bsmProject, monitor);
		}

		// finishAppService();
		createBsmFile(project, bsmProjectName, bsmProject);

	}

	// create a bsm file with the same name of the project at the time of the
	// project creation
	public void createBsmFile(IProject project, String bsmProjectName,
			BsmModel bsmRoot) {
		ResourceSet resourceSet = new ResourceSetImpl();

		// Get the URI of the model file.
		IFile diagramFile = project.getFile(bsmProjectName + ".bsm");
		URI fileURI = URI.createPlatformResourceURI(diagramFile.getFullPath()
				.toString(), true);
		// Create a resource for this file.
		//
		Resource resource = resourceSet.createResource(fileURI);
		// Add the initial model object to the contents.
		//
		if (bsmRoot != null) {
			resource.getContents().add(bsmRoot);
		}
		// Save the contents of the resource to the file system.
		//

		try {
			/*Map<Object, Object> options = new HashMap<Object, Object>();
			options.put(XMLResource.OPTION_ENCODING, "UTF-8");
			resource.save(options);*/
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * create the business object of BSM SSM project
	 * 
	 * @param bsmProjectName
	 *            name of BSM SSM project
	 * @param organizationName
	 *            name of first organization
	 * @param serviceName
	 *            name of first service
	 * @return a business object of SSM
	 */
	public BsmModel createBusinessObject(String bsmProjectName,
			String organizationName, String serviceName) {
		BsmModel bsm = null;
		try {
			// Create BSM SSM
			bsm = getAppService().createBsmModel(bsmProjectName,
					organizationName, serviceName);
		} catch (Exception e) {
			bsm = null;
			e.printStackTrace();
		}
		return bsm;
	}

	private void throwCoreException(String message) throws CoreException {
		IStatus status = new Status(IStatus.ERROR,
				"org.msee.slmtoolbox.modeling.app", IStatus.OK, message, null);
		throw new CoreException(status);
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