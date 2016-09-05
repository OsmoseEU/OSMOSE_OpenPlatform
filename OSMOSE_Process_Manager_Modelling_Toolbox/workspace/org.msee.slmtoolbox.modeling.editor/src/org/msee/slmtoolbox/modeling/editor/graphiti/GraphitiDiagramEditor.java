package org.msee.slmtoolbox.modeling.editor.graphiti;

import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;

/**
 * @author HBA6
 * 
 */
public class GraphitiDiagramEditor extends DiagramEditor {

	private boolean autoClose = false;
	
	/**
	 * @return the autoClose
	 */
	public boolean isAutoClose() {
		return autoClose;
	}

	/**
	 * @param autoClose the autoClose to set
	 */
	public void setAutoClose(boolean autoClose) {
		this.autoClose = autoClose;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.graphiti.ui.editor.DiagramEditor#setFocus()
	 */
	@Override
	public void setFocus() {
    	if(this.isAutoClose()) {
    		this.getSite().getWorkbenchWindow().getActivePage().closeEditor(this, false);
    	} else {
    		super.setFocus();
    	}
	}

	public GraphitiDiagramEditor() {
		super();
	}

	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {
		super.init(site, input);
//		IEditorReference[] references = site.getWorkbenchWindow()
//				.getActivePage().getEditorReferences();
//		if(references.length == 1) {
//			super.init(site, input);
//		} else {
//			boolean save = site.getWorkbenchWindow().getActivePage().closeEditor(references[0].getEditor(false), true);
//			if (save) {
//				super.init(site, input);
//			} else {
//				throw new PartInitException("only one Editor is allowed.");
//			}
//		}
	}

}
