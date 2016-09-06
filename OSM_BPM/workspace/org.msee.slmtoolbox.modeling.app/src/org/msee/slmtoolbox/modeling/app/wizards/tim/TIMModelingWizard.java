package org.msee.slmtoolbox.modeling.app.wizards.tim;

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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.team.core.RepositoryProvider;
import org.eclipse.team.core.TeamException;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.msee.slmtoolbox.modeling.app.RepositoryProviderImpl;
import org.msee.slmtoolbox.modeling.app.service.TimProjectManager;
import org.msee.slmtoolbox.modeling.app.utils.UtilsFolder;
import org.msee.slmtoolbox.modeling.app.wizards.AbstractMseeWizard;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel;
import org.msee.slmtoolbox.modeling.model.ssm.tim.TimResourceSet;
import org.msee.slmtoolbox.modeling.service.app.ssm.tim.TimAppService;
import org.msee.slmtoolbox.modeling.transformation.BsmTransformation;

/**
 * Wizard of create a TIM SSM (ServiceSystemModel) project
 */
public class TIMModelingWizard extends
		AbstractMseeWizard<TimAppService> {

	/** page for select wizard */
	private TIMModelingWizardPageSelectWizard pageSelectWizard;
	/** page for create a new Tim Project*/
	private TIMModelingWizardPageCreateNew pageNewTimProject;
	/** page for transform bsm project to tim project */
	private TIMModelingWizardPageTransformProject pageTransformProject;
	
	/** user selection before call wizard */
	private ISelection selection;
	private RepositoryProvider repositoryProvider;

	/**
	 * Constructor for TIMServiceSystemModelingWizard.
	 */
	public TIMModelingWizard() {
		super();
		setAppServiceClass(TimAppService.class);
		initAppService();
		repositoryProvider = new RepositoryProviderImpl();
		
	}

	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
		this.pageSelectWizard = new TIMModelingWizardPageSelectWizard(selection);
		this.pageTransformProject = new TIMModelingWizardPageTransformProject(selection);
		this.pageNewTimProject = new TIMModelingWizardPageCreateNew(selection);
		
		addPage(this.pageSelectWizard);
		addPage(this.pageTransformProject);
		addPage(this.pageNewTimProject);
	}
	
	public IWizardPage getNextPage(IWizardPage currentPage) {
		if (currentPage instanceof TIMModelingWizardPageSelectWizard) {
			int selectionWizard = pageSelectWizard.getSelectionWizard();
			if (selectionWizard == TIMModelingWizardPageSelectWizard.SELECT_NEW_PROJECT) {
				this.pageNewTimProject.setPageComplete(false);
				this.pageTransformProject.setPageComplete(true);
				return getPage(TIMModelingWizardPageCreateNew.PAGE_NAME);
			} else if (selectionWizard == TIMModelingWizardPageSelectWizard.SELECT_FROM_BSM) {
				this.pageNewTimProject.setPageComplete(true);
				return getPage(TIMModelingWizardPageTransformProject.PAGE_NAME);
			}
			return null;
		} else {
			return null;
		}
	}
	
	public IWizardPage getPreviousPage(IWizardPage currentPage) {
		if (currentPage instanceof TIMModelingWizardPageCreateNew
				|| currentPage instanceof TIMModelingWizardPageTransformProject) {
			return getPage(TIMModelingWizardPageSelectWizard.PAGE_NAME);
		} else {
			return null;
		}
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	public boolean performFinish() {
		final int selectionWizard = pageSelectWizard.getSelectionWizard();
		// define value for create a TIM project
		final String timProjectName;
		final IProject bsmProjectSource;
		final TimModel timProject;
		if (selectionWizard == TIMModelingWizardPageSelectWizard.SELECT_NEW_PROJECT) {
			bsmProjectSource = null;
			timProjectName = this.pageNewTimProject.getTIMProjectName();
			timProject = createBusinessObject(timProjectName,
					this.pageNewTimProject.getOrganizationName(), this.pageNewTimProject.getServiceName());
		} else if (selectionWizard == TIMModelingWizardPageSelectWizard.SELECT_FROM_BSM) {
			bsmProjectSource = this.pageTransformProject.getBsmPojectSource();
			timProjectName = this.pageTransformProject.getTIMProjectName();
			timProject = null;
		} else {
			bsmProjectSource = null;
			timProjectName = null;
			timProject = null;
		}
		
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				try {
					doFinish(timProjectName, timProject, bsmProjectSource, monitor);
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
	 * @param bsmProjectSource 
	 */

	private void doFinish(String timProjectName, TimModel timProject, IProject bsmProjectSource, IProgressMonitor monitor) throws CoreException {

		TimProjectManager manager = TimProjectManager.eInstance;
		// create a project
		IProject project = createAProject(monitor, timProjectName, manager);

		// create Tim File;
		TimModel timModel = createTimFile(project, timProjectName, timProject, bsmProjectSource);
		
		// save in project the id projec SSM
		if (null != timModel) {
			manager.createConfigurationFileMsee(project, timModel, monitor);
		}

	}

	/**
	 * Create a project
	 * @param monitor
	 * @param timProjectName	project tim name 
	 * @param manager
	 * @return
	 * @throws CoreException
	 */
	private IProject createAProject(IProgressMonitor monitor, String timProjectName, TimProjectManager manager) 
			throws CoreException {
		monitor.beginTask("Creating TIM project " + timProjectName, 2);
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject project = root.getProject(timProjectName);
		if (project.exists()) {
			throwCoreException("Project \"" + timProjectName
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
		
		// create folder
		manager.createTreeForProject(project);
		
		return  project;
	}

	/**
	 * Create a tim file with the same name of the project at the time of the project creation.
	 * @param project			timProject
	 * @param timProjectName	project Tim name for tim file
	 * @param timRoot			tim model for create a new project tim
	 * @param bsmProjectSource	project bsm source for transformation to tim proeject, if timRoot is null
	 */
	public TimModel createTimFile(IProject project, String timProjectName,
			TimModel timRoot, IProject bsmProjectSource) {
		ResourceSet resourceSet = new TimResourceSet();

		// Get the URI of the model file.
		IFile diagramFile = project.getFile(timProjectName + ".tim");
		
		if (timRoot != null) {
			URI fileURI = URI.createPlatformResourceURI(diagramFile.getFullPath()
					.toString(), true);
			// Create a resource for this file.
			//
			Resource resource = resourceSet.createResource(fileURI);
			// Add the initial model object to the contents.
			resource.getContents().add(timRoot);
			// Save the contents of the resource to the file system.
			try {
				/*Map<Object, Object> options = new HashMap<Object, Object>();
				options.put(XMLResource.OPTION_ENCODING, "UTF-8");
				resource.save(options);*/
				resource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return timRoot;
		} else if (null != bsmProjectSource) {
			IFile bsmFile = UtilsFolder.findFileBsm(bsmProjectSource);
			BsmTransformation.toTim(bsmFile.getFullPath().toString(), diagramFile.getFullPath().toString());
			// find TimModel in file
			URI resourceURI = URI.createFileURI(diagramFile.getFullPath().toString());
			Resource resourceTemp =  resourceSet.getResource(resourceURI, true);
			if (resourceTemp != null) {
				// does resource contain a diagram as root object?
				for (final EObject object : resourceTemp.getContents()) {
					if (object instanceof TimModel) {
						return (TimModel) object;
					}
				}
			}
		}
		return null;
	}

	/**
	 * create the business object of TIM SSM project
	 * 
	 * @param timProjectName
	 *            name of TIM SSM project
	 * @param organizationName
	 *            name of first organization
	 * @param serviceName
	 *            name of first service
	 * @return a business object of SSM
	 */
	public TimModel createBusinessObject(String timProjectName,
			String organizationName, String serviceName) {
		TimModel tim = null;
		try {
			// Create TIM SSM
			tim = getAppService().createTimModel(timProjectName,
					organizationName, serviceName);
		} catch (Exception e) {
			tim = null;
			e.printStackTrace();
		}
		return tim;
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