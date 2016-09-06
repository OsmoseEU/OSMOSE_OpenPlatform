package org.msee.slmtoolbox.modeling.editor.eaStar.features.custom;

import org.eclipse.core.resources.IFile;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.msee.slmtoolbox.modeling.editor.eaStar.features.AbstractEaCustomFeature;

/**
 * Custom feature for open diagram
 * @author fto
 *
 */
public abstract class AbstractEaOpenDiagramFeature extends AbstractEaCustomFeature{

	
	private IFile file[];

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public AbstractEaOpenDiagramFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
    @Override
    public abstract String getName();
    
    @Override
    public abstract boolean canExecute(ICustomContext context) ;

	@Override
	public void execute(ICustomContext context) {
		if (isFile()) {
			// select file if multi file
			IFile fileSelect;
			if (this.file.length>1) {
				// TODO FTO : add dialog for select file
				fileSelect = this.file[0];
			} else {
				fileSelect = this.file[0];
			}
				
			try {
				IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
				IDE.openEditor( page, fileSelect );
			} catch(PartInitException e ) {
				// FIXME add log
				e.printStackTrace();
			}
		} else {
			executeWithoutFile(context);
		}
	}

	/**
	 * Execute if not find a file
	 * @param context feature context
	 */
    public abstract void executeWithoutFile(ICustomContext context);

	/**
	 * @param file the file to set
	 */
	protected void setFile(IFile[] file) {
		this.file = file;
	}
	

	/**
	 * @return true if defined file
	 */
	protected boolean isFile() {
		return null != this.file
				&& this.file.length>0;
	}

	/**
	 * reset feature
	 */
	protected void reset() {
		this.file = null;
	}
	
	
}
