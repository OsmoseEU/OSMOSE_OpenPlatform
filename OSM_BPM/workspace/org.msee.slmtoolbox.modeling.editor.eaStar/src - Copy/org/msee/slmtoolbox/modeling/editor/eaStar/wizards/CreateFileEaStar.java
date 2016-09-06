package org.msee.slmtoolbox.modeling.editor.eaStar.wizards;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.msee.slmtoolbox.modeling.app.properties.MseeProperties.FolderMSeE;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.EaUtils;
import org.msee.slmtoolbox.modeling.editor.eaStar.util.PropertiesEAStar.EAStarEditorWizardProperties;
import org.msee.slmtoolbox.modeling.editor.graphiti.GraphitiResourceFactory;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;

public class CreateFileEaStar extends RecordingCommand {

	private IProject project;
	private TransactionalEditingDomain editingDomain;
	private EaProcess process;
	private Resource createdGraphicResource;
	public IFile diagramFile;

	public CreateFileEaStar(IProject project,
			TransactionalEditingDomain editingDomain, EaProcess process) {
		super(editingDomain);
		this.project = project;
		this.editingDomain = editingDomain;
		this.process = process;
	}

	@Override
	protected void doExecute() {
		Diagram diagram = Graphiti.getPeCreateService().createDiagram(
				EAStarEditorWizardProperties.DIAGRAM_TYPE_ID,
				process.getName(), true); //$NON-NLS-1$
		// No background grid
		diagram.setGridUnit(10);
		IFolder diagramFolder = project.getFolder(FolderMSeE.BSM_FOLDER_EA);
		diagramFile = diagramFolder
				.getFile(EaUtils.getDiagramNameFile(process));

		URI uri = URI.createPlatformResourceURI(diagramFile.getFullPath()
				.toString(), true);

		// created uri for diagram file above.... now create Resource
		createdGraphicResource = editingDomain.getResourceSet().createResource(
				uri);

		// the resource need specifics options to load and save hibernate URI
		// Hibernate uri contains '&' witch aren't converted to entities
		if (createdGraphicResource instanceof XMLResource) {
			GraphitiResourceFactory
					.addLoadOptions((XMIResource) createdGraphicResource);
			GraphitiResourceFactory
					.addSaveOptions((XMIResource) createdGraphicResource);
		}
		createdGraphicResource.getContents().add(diagram);

		// add same element to business objects related to diagram
		PictogramLink link = PictogramsFactory.eINSTANCE.createPictogramLink();
		diagram.setLink(link);

		IDiagramTypeProvider dtp = GraphitiUi
				.getExtensionManager()
				.createDiagramTypeProvider(diagram,
						"org.msee.slmtoolbox.modeling.editor.eaStar.diagram.EaDiagramTypeProvider"); //$NON-NLS-1$

		initDefaultDiagram(diagram, dtp, process);

		createdGraphicResource.setTrackingModification(true);

		try {
			createdGraphicResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			IStatus status = new Status(IStatus.ERROR,
					"org.msee.slmtoolbox.modeling.editor.eaStar",
					e.getMessage(), e);
			//$NON-NLS-1$
			ErrorDialog.openError(Display.getCurrent().getActiveShell(),
					"Error Occured", e.getMessage(), status);
		}

	}

	private static void initDefaultDiagram(Diagram diagram,
			IDiagramTypeProvider dtp, EaProcess process) {
		IFeatureProvider featureProvider = dtp.getFeatureProvider();

		// add model to default resource if have not resource
		if (null == process.getModel().eResource()) {
			diagram.eResource().getContents().add(process.getModel());
		}

		featureProvider.link(diagram, process);
	}
}
