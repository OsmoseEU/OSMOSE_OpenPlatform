package org.msee.slmtoolbox.modeling.editor;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.msee.slmtoolbox.modeling.editor.graphiti.GraphitiDiagramEditor;

/**
 * PreferredPerspectivePartListener is to be registered using the extension
 * point "org.eclipse.ui.startup". It will register itself as listener for the
 * activation of parts. When a part which implements IPrefersPerspective is
 * activated it will activate the preferred perspective of this part.
 */
public class OneEditorPartListener implements IPartListener, IStartup {

    private static final Logger log = Logger.getLogger(OneEditorPartListener.class.toString());

    public void partActivated(IWorkbenchPart part) {
    	
    }

    public static void refresh(final IWorkbenchPart part) {
    	// force the switch to the correct perspective
    	
//        if (!(part instanceof IPrefersPerspective)) {
//            return;
//        }
//
//        final IWorkbenchWindow workbenchWindow = part.getSite().getPage().getWorkbenchWindow();
//
//        IPerspectiveDescriptor activePerspective = workbenchWindow.getActivePage().getPerspective();
//        final String preferredPerspectiveId = ((IPrefersPerspective) part)
//                .getPreferredPerspectiveId();
//
//        if (preferredPerspectiveId == null) {
//            return;
//        }
//
//        if (activePerspective == null || !activePerspective.getId().equals(preferredPerspectiveId)) {
//            // Switching of the perspective is delayed using Display.asyncExec
//            // because switching the perspective while the workbench is
//            // activating parts might cause conflicts.
//            Display.getCurrent().asyncExec(new Runnable() {
//
//                public void run() {
//                    log.debug("Switching to preferred perspective " + preferredPerspectiveId
//                            + " for " + part.getClass());
//                    try {
//                        workbenchWindow.getWorkbench().showPerspective(preferredPerspectiveId,
//                                workbenchWindow);
//                    } catch (WorkbenchException e) {
//                        log.warn("Could not switch to preferred perspective "
//                                + preferredPerspectiveId + " for " + part.getClass(), e);
//                    }
//                }
//
//            });
//        }
    }

    public void earlyStartup() {
        Display.getDefault().asyncExec(new Runnable() {

            public void run() {
                try {
                	// register the listener instance into eclipse platform
                    PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
                            .addPartListener(new OneEditorPartListener());
                } catch (Exception e) {
                    log.log(Level.SEVERE, e.getMessage(), e);
                }
            }

        });
    }

    public void partBroughtToTop(IWorkbenchPart part) {
        // nothing to do
    }

    public void partClosed(IWorkbenchPart part) {
        // nothing to do
    }

    public void partDeactivated(IWorkbenchPart part) {
        // nothing to do
    }

    public void partOpened(IWorkbenchPart part) {
    	// garantee that only one "DiagramEditor" can be opened at once
        if(part instanceof GraphitiDiagramEditor) {
        	GraphitiDiagramEditor newGraphitiEditor = (GraphitiDiagramEditor) part;
        	IWorkbenchPage page = newGraphitiEditor.getSite().getWorkbenchWindow().getActivePage();
    		IEditorReference[] references = page.getEditorReferences();
    		
    		// if at least one diagram editor is open
    		if(references.length > 1) {
    			// perform save
    			if(page.saveAllEditors(true)) {
	    			for(IEditorReference ref : references) {
	    				IWorkbenchPart openedPart = ref.getPart(false);
	    				if(!openedPart.equals(newGraphitiEditor)) {
	    					// perform close
	    					page.closeEditor((IEditorPart) openedPart, false);
	    				}
	    			}
    			} else {
    				newGraphitiEditor.setAutoClose(true);
    			}
    		}
        }
    }

}