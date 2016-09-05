package org.msee.slmtoolbox.modeling.app;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.team.IMoveDeleteHook;
import org.eclipse.core.resources.team.IResourceTree;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.team.core.RepositoryProvider;

/**
 * 
 * @author HBA6
 *
 */
public class RepositoryProviderImpl extends RepositoryProvider {

	@Override
	public void deconfigure() throws CoreException {
		
	}

	@Override
	public void configureProject() throws CoreException {
		
		
	}

	@Override
	public String getID() {
		//return the id of the RepositoryProvider
		return "org.eclipse.myprovider.myProviderID";
	}
	
	@Override
	public IMoveDeleteHook getMoveDeleteHook(){
		IMoveDeleteHook deleteHook =  new DeleteHook();	
		return deleteHook;
		
	}

	/**
	 * 
	 * @author HBA6
	 *
	 */
	public class DeleteHook implements IMoveDeleteHook{
		//if the file's extension is "bsm", then delete is not allowed
		@Override
		public boolean deleteFile(IResourceTree arg0, IFile arg1, int arg2,
				IProgressMonitor arg3) {
			if (arg1.getFileExtension().equals("bsm"))
			return true;
			else return false;
		}

		//deleting a folder is not allowed
		@Override
		public boolean deleteFolder(IResourceTree arg0, IFolder arg1, int arg2,
				IProgressMonitor arg3) {		
			return true;
		}

		@Override
		public boolean deleteProject(IResourceTree arg0, IProject arg1,
				int arg2, IProgressMonitor arg3) {
			// TODO HBA : Auto-generated method stub
			return false;
		}

		//renaming a bsm file is not allowed
		@Override
		public boolean moveFile(IResourceTree arg0, IFile arg1, IFile arg2,
				int arg3, IProgressMonitor arg4) {
			if (arg1.getFileExtension().equals("bsm"))
				return true;
				else return false;
		}

		@Override
		public boolean moveFolder(IResourceTree arg0, IFolder arg1,
				IFolder arg2, int arg3, IProgressMonitor arg4) {
			// TODO HBA : Auto-generated method stub
			return false;
		}

		@Override
		public boolean moveProject(IResourceTree arg0, IProject arg1,
				IProjectDescription arg2, int arg3, IProgressMonitor arg4) {
			// TODO HBA : Auto-generated method stub
			return false;
		}
		
	}


}
