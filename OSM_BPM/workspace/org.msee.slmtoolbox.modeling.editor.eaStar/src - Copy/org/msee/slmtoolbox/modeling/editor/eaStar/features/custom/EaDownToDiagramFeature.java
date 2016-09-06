package org.msee.slmtoolbox.modeling.editor.eaStar.features.custom;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.internal.services.GraphitiUiInternal;
import org.msee.slmtoolbox.modeling.editor.eaStar.EaImageProvider;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;

public class EaDownToDiagramFeature extends AbstractEaOpenDiagramFeature {

	/**
	 * Construct with param
	 * @param fp			feature provider
	 */
	public EaDownToDiagramFeature(IFeatureProvider fp) {
		super(fp);
	}

	/**
	 * Gets the image id.
	 * 
	 * @return the image id
	 */
    @Override
    public String getImageId() {
          return EaImageProvider.IMG_DOWN;
    }

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
    @Override
    public String getName() {
          return "Down";
    }

	/**
	 * Gets the description.
	 * 
	 * @return the description
	 */
    @Override
    public String getDescription() {
          return "Down to the EaStar diagram";
    }
    
    @Override
    public boolean canExecute(ICustomContext context) {
    	// init contexte
    	reset();

    	// only one element selected
    	PictogramElement[] elements = context.getPictogramElements();
    	if (elements.length == 1) {
    		Object bo = getBusinessObjectForPictogramElement(elements[0]);
    		// for a structral Activity
    		if (bo instanceof EaStructuralExtendedActivity) {
    			EaStructuralExtendedActivity activity = (EaStructuralExtendedActivity) bo;
    			// find file
    			IFile file = getAppService().findProcessFile(new ResourceSetImpl(), activity.getIsA().getId());
    			if (null != file) {
    				setFile(new IFile[]{file});
    			}
    			return true;
    		}
    	}
    	return false;
    }
    
    /**
	 * Execute if not find a file
	 * @param context feature context
	 */
    public void executeWithoutFile(ICustomContext context) {
    	// only one element selected
    	PictogramElement[] elements = context.getPictogramElements();
    	if (elements.length == 1) {
    		Object bo = getBusinessObjectForPictogramElement(elements[0]);
    		// for a structral Activity
    		if (bo instanceof EaStructuralExtendedActivity) {
    			EaStructuralExtendedActivity activity = (EaStructuralExtendedActivity) bo;

				Resource resource = getDiagram().eResource();
				
				URI uri = resource.getURI();
				URI uriTrimmed = uri.trimFragment(); //FIXME FTO : est que c'est utile ?
				String elementPath = uriTrimmed.toPlatformString(true);
				// create a uri for a new file
				StringBuffer uriStringBuffer = new StringBuffer();
				uriStringBuffer.append(elementPath.substring(0, elementPath.lastIndexOf("/") + 1));
				uriStringBuffer.append(EaUtils.getDiagramNameFile(activity.getIsA()));
				createAndOpenDiagram(new ResourceSetImpl(), uriStringBuffer.toString(), activity);
    		}
    	}
    }
	
	/**
	 * Create an save the bo for a new diagram
	 * @param newDiagram	target
	 */
	protected void createAndSaveBoProcessInDiagram(Diagram newDiagram, EaStructuralExtendedActivity activity) {
		EaModel model = getAppService().createEaModel(newDiagram, activity);
		save(newDiagram.eResource());
		link(newDiagram, model.getProcess());
	}
    
    /**
	 * Create and open a structural activity diagram 
	 * @param resourceSet
	 * @param diagramUrl
	 */
	private void createAndOpenDiagram(ResourceSet resourceSet, String diagramUrl, EaStructuralExtendedActivity activity) {
		//IDiagramEditor diagramEditor = getFeatureProvider().getDiagramTypeProvider().getDiagramEditor();
		// flag for save decision
		boolean wantSave = false;
		
		/*
		 * FIXME Can't save current diagram and new diagram without editor blocks "Synchronizing EMF resources"
		 */
		// if file s not save
		/*if (diagramEditor.isDirty()) {
			DefaultYesNoMseeDialog dialog = 
					new DefaultYesNoMseeDialog(UtilsWizards.getShell(), 
							"Save the diagram", 
							"If you want create the Activity's diagram, you need save this diagram. Would you want save and create ?");
			int retDialog = dialog.open();
			wantSave = (retDialog == Window.OK);
		}*/
		
		// if wantSave or need'nt save
		//if (wantSave || !diagramEditor.isDirty()) {
			// Save a diagram before create a new diagram
			if (wantSave) {
				// save diagram
				save(getDiagram().eResource());
			}
			// resource does not exists
			// Diagram was not found, create new diagram				
			Diagram newDiagram = Graphiti.getPeCreateService().createDiagram("eaStar", activity.getName(), true);
			newDiagram.setGridUnit(10);

			URI uri = URI.createPlatformResourceURI(diagramUrl, true);
			Resource resource = resourceSet.createResource(uri);
			resource.getContents().add(newDiagram);
			
			// add same element to business objects related to diagram
			PictogramLink link = PictogramsFactory.eINSTANCE.createPictogramLink();
			newDiagram.setLink(link);
			// create BOs for new diagram
			createAndSaveBoProcessInDiagram(newDiagram, activity);
			
			
			// save new diagram
			save(resource);
			openEAStarDiagram(newDiagram);
			
		//}
		
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
	
	protected void save(final Resource resource) {
		TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(resource.getResourceSet());
		if (domain != null) {
			domain.getCommandStack().execute(new RecordingCommand(domain) {
				@Override
				protected void doExecute() {
					saveResource(resource);
				}
			});
		} else {
			saveResource(resource);
		}
	}

	private void saveResource(Resource resource) {
		try {
			// save new diagram
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException ex) {
			// FIXME add log
			ex.printStackTrace();
		}
	}

}
