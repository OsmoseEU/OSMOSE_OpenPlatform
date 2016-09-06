package org.msee.slmtoolbox.modeling.editor.eaStar.features;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.platform.IDiagramEditor;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.internal.services.GraphitiUiInternal;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.msee.slmtoolbox.modeling.app.wizards.UtilsWizards;
import org.msee.slmtoolbox.modeling.editor.eaStar.diagram.EaGraphitiDiagramEditor;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.PropertiesEAStar.EAStarEditorWizardProperties;
import org.msee.slmtoolbox.modeling.editor.wizard.dialog.editor.DefaultYesNoMseeDialog;

/**
 * Class to drill down action for open diagram 
 * @author fto
 */
@SuppressWarnings("restriction")
public abstract class AbstractEaDrillDownOpenDiagramFeature extends AbstractEaDrillDownFeature {
	
	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public AbstractEaDrillDownOpenDiagramFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	@Override
	public String getName() {
		return "Open associated diagram";
	}

	/**
	 * @return file name
	 */
	protected abstract String getFileName();

	/**
	 * @return process id
	 */
	protected abstract String getProcessId();
	
	/**
	 * Create an save the bo for a new diagram
	 * @param newDiagram	target
	 */
	protected abstract void createAndSaveBoProcessInDiagram(Diagram newDiagram);
	
	/**
	 * Returns all diagrams which are considered for navigation.
	 * 
	 * @return the diagrams
	 */
	@Override
	protected Collection<Diagram> getDiagrams() {
		
		Resource resource = getDiagram().eResource();
		
		URI uri = resource.getURI();
		URI uriTrimmed = uri.trimFragment(); //FIXME FTO : est que c'est utile ?

		if (uriTrimmed.isPlatformResource()) {

			// create a resourceSet for the diagram
			final ResourceSet resourceSet = new ResourceSetImpl();
			
			// find and open the diagram for the structural activity
			boolean findDiagram = findAndOpenDiagram(resourceSet);
			
			// if not find
			if (!findDiagram) {
				String elementPath = uriTrimmed.toPlatformString(true);
				// create a uri for a new file
				StringBuffer uriStringBuffer = new StringBuffer();
				uriStringBuffer.append(elementPath.substring(0, elementPath.lastIndexOf("/") + 1));
				uriStringBuffer.append(getFileName());
				uriStringBuffer.append(EAStarEditorWizardProperties.DIAGRAM_EXTENSION);
				// create and open a new diagram
				createAndOpenDiagram(resourceSet, uriStringBuffer.toString());
			}
		}
		
		// Do not use AbstractDrillDownFeature to open editor
		// Always return empty list, the editor is already open
		return new ArrayList<Diagram>();
	}

	/**
	 * Find and open a structural activity diagram
	 * @param resourceSet
	 * @param idProcess
	 * @return false if not found
	 */
	private boolean findAndOpenDiagram(ResourceSet resourceSet) {
		//diagram file is find
		boolean findDiagram = false;

		IFile file = getAppService().findProcessFile(resourceSet, getProcessId());
		if (null!= file) {
			findDiagram = true;
			openEAStarDiagram(file);
		}
		
		return findDiagram;
	}

	/**
	 * Create and open a structural activity diagram 
	 * @param resourceSet
	 * @param diagramUrl
	 */
	private void createAndOpenDiagram(ResourceSet resourceSet, String diagramUrl) {
		IDiagramEditor diagramEditor = getFeatureProvider().getDiagramTypeProvider().getDiagramEditor();
		// flag for save decision
		boolean wantSave = false;
		
		// if file s not save
		if (diagramEditor.isDirty()) {
			DefaultYesNoMseeDialog dialog = 
					new DefaultYesNoMseeDialog(UtilsWizards.getShell(), 
							"Save the diagram", 
							"If you want create the Activity's diagram, you need save this diagram. Would you want save and create ?");
			int retDialog = dialog.open();
			wantSave = (retDialog == Window.OK);
		}
		
		// if wantSave or need'nt save
		if (wantSave || !diagramEditor.isDirty()) {
			// Save a diagram before create a new diagram
			if (wantSave && diagramEditor instanceof EaGraphitiDiagramEditor) {
				EaGraphitiDiagramEditor eaStarEditor = (EaGraphitiDiagramEditor) diagramEditor;
				eaStarEditor.doSave(null);
			}
			// resource does not exists
			// Diagram was not found, create new diagram				
			Diagram newDiagram = Graphiti.getPeCreateService().createDiagram("eaStar", getFileName(), true);
			newDiagram.setGridUnit(10);

			URI uri = URI.createPlatformResourceURI(diagramUrl, true);
			Resource resource = resourceSet.createResource(uri);
			resource.getContents().add(newDiagram);
			
			// add same element to business objects related to diagram
			PictogramLink link = PictogramsFactory.eINSTANCE.createPictogramLink();
			newDiagram.setLink(link);
			// create BOs for new diagram
			createAndSaveBoProcessInDiagram(newDiagram);
			
			try {
				// save diagram
				getDiagram().eResource().save(Collections.EMPTY_MAP);
				// save new diagram
				resource.save(Collections.EMPTY_MAP);
				openEAStarDiagram(newDiagram);
			} catch (IOException ex) {
				// FIXME add log
				ex.printStackTrace();
			}
		}
		
	}

	/**
	 * Open a eastar diagram
	 * @param diagram
	 */
	private void openEAStarDiagram(Diagram diagram) {
		// if it's process diagram oppen
		GraphitiUiInternal.getWorkbenchService().openDiagramEditor(
				diagram, 
				"org.msee.slmtoolbox.modeling.editor.eaStar.diagram.EaDiagramTypeProvider", 
				"org.msee.slmtoolbox.modeling.editor.eaStar.EaDiagramEditor");
	}

	/**
	 * Open a eastar diagram
	 * @param diagram
	 */
	private void openEAStarDiagram(IFile file) {
		try {
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			IDE.openEditor( page, file );
		} catch(PartInitException e ) {
			// FIXME add log
			e.printStackTrace();
		}
	}
}
