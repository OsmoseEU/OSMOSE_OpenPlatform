package org.msee.slmtoolbox.modeling.editor.util;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

public abstract class GraphitiUtil {

	/**
	 * Opens the diagram editor for the drill down. Users can override this
	 * method in order to open different editors, open editors in different
	 * windows or do completely different stuff for the drill down.
	 * 
	 * @param diagram
	 *            the diagram for which the editor will be opened.
	 */
	public static void openDiagramEditor(IFile diagramFile, String diagramEditorId) {
		// Open the editor
		IFileEditorInput input = new FileEditorInput(diagramFile);
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow()
					.getActivePage()
					.openEditor(input, diagramEditorId);
		} catch (PartInitException e) {
			IStatus status = new Status(
					IStatus.ERROR,
					"org.msee.slmtoolbox.modeling.editor", e.getMessage(), e); //$NON-NLS-1$
			ErrorDialog.openError(Display.getCurrent().getActiveShell(),
					"Error Occured", e.getMessage(),
					status);
		}
	}
}
