package org.msee.slmtoolbox.modeling.editor.eaStar.wizards;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.NoSuchFileException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.msee.slmtoolbox.modeling.app.properties.MseeProperties.FolderMSeE;
import org.msee.slmtoolbox.modeling.app.wizards.AbstractMseeWizard;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaToOmosisProcessBpmnWizardContent;
import org.msee.slmtoolbox.modeling.editor.graphiti.GraphitiResourceFactory;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;
import org.msee.slmtoolbox.modeling.service.app.lang.eastar.EAStarAppService;
import org.msee.slmtoolbox.modeling.transformation.EastarTransformation;

public class EaToOsmosisProcessBpmnWizard extends
		AbstractMseeWizard<EAStarAppService> {

	/** Content to pass back and foward on the wizard menus **/
	private EaToOmosisProcessBpmnWizardContent content;

	/** page for select bmnp type file to create */
	private EaToOsmosisProcessBpmnWizardPageSelectCreate pageSelectCreate;

	/** page for select eastat file */
	private EaToOsmosisProcessBpmnWizardPageSelectFile pageSelectFile;

	/** page for build Osmiotic Process */
	private EaToOsmosisProcessBpmnWizardPathBuild pagePathBuild;

	private EaToOsmosisProcessBpmnWizardPageFinish pageFinish;

	/** user selection before call wizard */
	private ISelection selection;

	/**
	 * Constructor for TIMServiceSystemModelingWizard.
	 */
	public EaToOsmosisProcessBpmnWizard() {
		super();
		this.content = new EaToOmosisProcessBpmnWizardContent();
		setAppServiceClass(EAStarAppService.class);
		initAppService();
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
		this.pageSelectCreate = new EaToOsmosisProcessBpmnWizardPageSelectCreate(
				selection, content);
		this.pageSelectFile = new EaToOsmosisProcessBpmnWizardPageSelectFile(
				selection, content);
		this.pagePathBuild = new EaToOsmosisProcessBpmnWizardPathBuild(
				selection, content);
		this.pageFinish = new EaToOsmosisProcessBpmnWizardPageFinish(selection,
				content, getAppService());

		addPage(this.pageSelectFile);
		addPage(this.pageSelectCreate);
		addPage(this.pagePathBuild);
		addPage(this.pageFinish);
	}

	public IWizardPage getNextPage(IWizardPage currentPage) {
		if (currentPage instanceof EaToOsmosisProcessBpmnWizardPageSelectFile) {
			return getPage(EaToOsmosisProcessBpmnWizardPageSelectCreate.PAGE_NAME);
		} else if (currentPage instanceof EaToOsmosisProcessBpmnWizardPageSelectCreate) {
			this.pageSelectCreate.getSelectionCreate();
			return getPage(EaToOsmosisProcessBpmnWizardPathBuild.PAGE_NAME);
		} else if (currentPage instanceof EaToOsmosisProcessBpmnWizardPathBuild) {
			return getPage(EaToOsmosisProcessBpmnWizardPageFinish.PAGE_NAME);
		} else {
			return null;
		}
	}

	public IWizardPage getPreviousPage(IWizardPage currentPage) {
		if (currentPage instanceof EaToOsmosisProcessBpmnWizardPageSelectCreate) {
			this.pageSelectFile.setProjectTarget(this.pageSelectCreate
					.getProjectTarget());
			return getPage(EaToOsmosisProcessBpmnWizardPageSelectFile.PAGE_NAME);
		} else if (currentPage instanceof EaToOsmosisProcessBpmnWizardPathBuild) {
			return getPage(EaToOsmosisProcessBpmnWizardPageSelectCreate.PAGE_NAME);
		} else if (currentPage instanceof EaToOsmosisProcessBpmnWizardPageFinish) {
			return getPage(EaToOsmosisProcessBpmnWizardPathBuild.PAGE_NAME);
		} else {
			return null;
		}
	}

	// Checks if the wizard is allowed to be finished
	public boolean canFinish() {
		if (getContainer().getCurrentPage() == pageFinish)
			return true;
		else
			return false;
	}

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	public boolean performFinish() {
		final IProject projectTarget = this.pageSelectCreate.getProjectTarget();
		final IFile file = this.pageSelectFile.getFile();
		final String fileName = this.pageSelectFile.getFileName();

		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException {
				try {
					doFinish(file, fileName, projectTarget, monitor);
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
			if (e.getCause() != null && e.getCause().getMessage() != null
					&& e.getCause().getMessage().length() > 0)
				ExceptionMsg = e.getCause().getMessage();
			else
				ExceptionMsg = "An unkown error has occurred.\n"
						+ "Please make sure all required fields, in all required pages, are properly filled.";
			MessageDialog.openError(getShell(), "Error", ExceptionMsg);
			return false;
		}
		return true;
	}

	/**
	 * The worker method. It will find the container, create the file if missing
	 * or just replace its contents, and open the editor on the newly created
	 * file.
	 * 
	 * @param bsmProjectSource
	 */
	private void doFinish(IFile fileSource, String fileName,
			IProject projectTarget, IProgressMonitor monitor)
			throws CoreException {
		// Get the URI of the model file.	
		IFile fileTarget = projectTarget.getFile(FolderMSeE.TIM_FOLDER_PROCESS
				+ "/" + fileName + ".bpmn");
		buildFile();
		EastarTransformation.toBpmnOsmosisProcess(
				this.content.osmoseService.path, fileTarget.getFullPath()
						.toString(), projectTarget.getName(),
				this.content.selectedProcess);
		deleteFile(); //While in debug mode comment

		/*
		 * if (selectionCreate ==
		 * EaToOsmosisProcessBpmnWizardPageSelectCreate.CREATE_DIGITALIZATION) {
		 * E } else if (selectionCreate ==
		 * EaToOsmosisProcessBpmnWizardPageSelectCreate.CREATE_ACTUATION) {
		 * EastarTransformation
		 * .toBpmnOsmosisProcess(fileSource.getFullPath().toString(),
		 * fileTarget.getFullPath().toString(),projectTarget.getName(),
		 * "ACTUATION"); } else if (selectionCreate ==
		 * EaToOsmosisProcessBpmnWizardPageSelectCreate.CREATE_VIRTUALIZATION) {
		 * EastarTransformation
		 * .toBpmnOsmosisProcess(fileSource.getFullPath().toString(),
		 * fileTarget.getFullPath().toString(),projectTarget.getName(),
		 * "VIRTUALIZATION"); } else if (selectionCreate ==
		 * EaToOsmosisProcessBpmnWizardPageSelectCreate.CREATE_AUGMENTATION) {
		 * EastarTransformation
		 * .toBpmnOsmosisProcess(fileSource.getFullPath().toString(),
		 * fileTarget.getFullPath().toString(),projectTarget.getName(),
		 * "AUGMENTATION"); } else if (selectionCreate ==
		 * EaToOsmosisProcessBpmnWizardPageSelectCreate.CREATE_ENRICHMENT) {
		 * EastarTransformation
		 * .toBpmnOsmosisProcess(fileSource.getFullPath().toString(),
		 * fileTarget.getFullPath().toString(),projectTarget.getName(),
		 * "ENRICHMENT"); } else if (selectionCreate ==
		 * EaToOsmosisProcessBpmnWizardPageSelectCreate.CREATE_SIMULATION) {
		 * EastarTransformation
		 * .toBpmnOsmosisProcess(fileSource.getFullPath().toString(),
		 * fileTarget.getFullPath().toString(),projectTarget.getName(),
		 * "SIMULATION"); }
		 */
	}

	private void deleteFile() {
		final String dirPath = this.content.osmoseService.directory;
		try {
			System.out.println(dirPath);
			File directory = new File(dirPath);
			if (!directory.exists()) {

				System.out.println("Directory does not exist.");

			} else {

					delete(directory);

			}
		} catch (NoSuchFileException x) {
			System.err.format("%s: no such" + " file or directory%n", dirPath);
		} catch (DirectoryNotEmptyException x) {
			System.err.format("%s not empty%n", dirPath);
		} catch (IOException x) {
			// File permission problems are caught here.
			System.err.println(x);
		}
	}

	private void buildFile() {
		EaModel model = content.osmoseService
				.rebuildModel(this.content.selectedProcess);

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		URI uri = URI.createPlatformResourceURI(content.osmoseService.path,
				true);
		System.out.println(uri.toString());
		// create a resource
		Resource resource = resSet.createResource(uri);
		GraphitiResourceFactory.addLoadOptions((XMIResource) resource);
		GraphitiResourceFactory.addSaveOptions((XMIResource) resource);
		// Get the first model element and cast it to the right type, in my
		// example everything is hierarchical included in this first node
		resource.getContents().add(model);

		// now save the content.
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void delete(File file)
	    	throws IOException{
	 
	    	if(file.isDirectory()){
	 
	    		//directory is empty, then delete it
	    		if(file.list().length==0){
	    			
	    		   file.delete();
	    		   System.out.println("Directory is deleted : " 
	                                                 + file.getAbsolutePath());
	    			
	    		}else{
	    			
	    		   //list all the directory contents
	        	   String files[] = file.list();
	     
	        	   for (String temp : files) {
	        	      //construct the file structure
	        	      File fileDelete = new File(file, temp);
	        		 
	        	      //recursive delete
	        	     delete(fileDelete);
	        	   }
	        		
	        	   //check the directory again, if empty then delete it
	        	   if(file.list().length==0){
	           	     file.delete();
	        	     System.out.println("Directory is deleted : " 
	                                                  + file.getAbsolutePath());
	        	   }
	    		}
	    		
	    	}else{
	    		//if file, then delete it
	    		file.delete();
	    		System.out.println("File is deleted : " + file.getAbsolutePath());
	    	}
	    }
}