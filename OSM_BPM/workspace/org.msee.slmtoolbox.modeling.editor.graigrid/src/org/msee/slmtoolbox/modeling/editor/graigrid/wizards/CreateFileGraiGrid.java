package org.msee.slmtoolbox.modeling.editor.graigrid.wizards;

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
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.services.GraphitiUi;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Display;
import org.msee.slmtoolbox.modeling.app.properties.MseeProperties.FolderMSeE;
import org.msee.slmtoolbox.modeling.editor.graigrid.utils.PropertiesGraiGrid.GraiGridEditorWizardProperties;
import org.msee.slmtoolbox.modeling.editor.graphiti.GraphitiResourceFactory;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgExternalInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInternalInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;

public class CreateFileGraiGrid extends RecordingCommand {

	private IProject project;
	private TransactionalEditingDomain editingDomain;
	private GgGraiGrid graiGrid;
	// Resource for graphics data
	private Resource createdGraphicResource;

	public IFile diagramFile;

	public CreateFileGraiGrid(IProject project,
			TransactionalEditingDomain editingDomain, GgGraiGrid graiGrid) {
		super(editingDomain);
		this.project = project;
		this.editingDomain = editingDomain;
		this.graiGrid = graiGrid;
	}

	@Override
	protected void doExecute() {
		Diagram diagram = Graphiti.getPeCreateService().createDiagram(
				GraiGridEditorWizardProperties.DIAGRAM_TYPE_ID, graiGrid.getName(), true); //$NON-NLS-1$
		// No background grid
		diagram.setGridUnit(0);
		IFolder diagramFolder = project.getFolder(FolderMSeE.BSM_FOLDER_GG); 
		diagramFile = diagramFolder.getFile(graiGrid.getName() + GraiGridEditorWizardProperties.DIAGRAM_EXTENSION);
		URI uri = URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), true);

		// created uri for diagram file above.... now create Resource
		createdGraphicResource = editingDomain.getResourceSet().createResource(uri);
		// the resource need specifics options to load and save hibernate URI
		// Hibernate uri contains '&' witch aren't converted to entities
		if (createdGraphicResource instanceof XMLResource) {
			GraphitiResourceFactory.addLoadOptions((XMIResource) createdGraphicResource);
			GraphitiResourceFactory.addSaveOptions((XMIResource) createdGraphicResource);
		}
		createdGraphicResource.getContents().add(diagram);

		// add same element to business objects related to diagram
		PictogramLink link = PictogramsFactory.eINSTANCE.createPictogramLink();
		diagram.setLink(link);
		
		IDiagramTypeProvider dtp = GraphitiUi
				.getExtensionManager()
				.createDiagramTypeProvider(
						diagram,
						"org.msee.slmtoolbox.modeling.editor.graigrid.diagram.GgDiagramTypeProvider"); //$NON-NLS-1$

		initDefaultDiagram(diagram, dtp, graiGrid);

		createdGraphicResource.setTrackingModification(true);

		try {
			createdGraphicResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			IStatus status = new Status(IStatus.ERROR,
					"org.msee.slmtoolbox.modeling.editor.graigrid",
					e.getMessage(), e);
			//$NON-NLS-1$
			ErrorDialog.openError(Display.getCurrent().getActiveShell(),
					"Error Occured", e.getMessage(),
					status);
		}

	}
	
	private void initDefaultDiagram(Diagram diagram, IDiagramTypeProvider dtp, 
			GgGraiGrid gg) {
		IFeatureProvider featureProvider = dtp.getFeatureProvider();

		// add model to default resource if have not resource
		if (null == gg.eResource()) {
			diagram.eResource().getContents().add(gg.getModel());
		}
			
		// Add context grid
		AddContext addContextGrid = new AddContext();
		addContextGrid.setNewObject(gg);
		addContextGrid.setTargetContainer(diagram);
		IAddFeature addFeatureGrid = featureProvider.getAddFeature(addContextGrid);
		if (null != addFeatureGrid && addFeatureGrid.canAdd(addContextGrid)) {
			addFeatureGrid.add(addContextGrid);
		}
		
		for(GgInformationSource infoSource : gg.getInformationSources()) {
			if (infoSource instanceof GgExternalInformationSource){
				// Add Source External
				AddContext addContextSE = new AddContext();
				addContextSE.setNewObject(infoSource);
				addContextSE.setTargetContainer(diagram);
				IAddFeature addFeatureSE = featureProvider.getAddFeature(addContextSE);
				if (null != addFeatureSE && addFeatureSE.canAdd(addContextSE)) {
					addFeatureSE.add(addContextSE);
				}
			} else if (infoSource instanceof GgInternalInformationSource){
				// Add Source Internal
				AddContext addContextSI = new AddContext();
				addContextSI.setNewObject(infoSource);
				addContextSI.setTargetContainer(diagram);
				IAddFeature addFeatureSI = featureProvider.getAddFeature(addContextSI);
				if (null != addFeatureSI && addFeatureSI.canAdd(addContextSI)) {
					addFeatureSI.add(addContextSI);
				}			
			}
		}
		
		// Add Default FunctionGrai
		for (int i = 0; i < gg.getOrganizations().size(); i++) {
			if (null != gg.getOrganizations().get(i)) {
				GgOrganization organization = (GgOrganization) gg
						.getOrganizations().get(i);
				AddContext addContextOrga = new AddContext();
				addContextOrga.setNewObject(organization);
				addContextOrga.setTargetContainer(diagram);
				IAddFeature addFeatureOrga = featureProvider
						.getAddFeature(addContextOrga);
				if (null != addFeatureOrga && addFeatureOrga.canAdd(addContextOrga)) {
					addFeatureOrga.add(addContextOrga);
				}
				
				for (GgFunction function : organization.getFunctions()) {
					AddContext addContextFunction = new AddContext();
					addContextFunction.setNewObject(function);
					addContextFunction.setTargetContainer(diagram);
					IAddFeature addContextFeature = featureProvider
							.getAddFeature(addContextFunction);
					if (null != addContextFeature && addContextFeature.canAdd(addContextFunction)) {
						addContextFeature.add(addContextFunction);
					}
				}
			}
		}
		// Add Default DecisionLevel
		// BUG ConcurrentModificationException with EIterator.checkModCount if
		// use foreach or Iterator, using classic for
		for (int i = 0; i < gg.getLevels().size(); i++) {
			if (null != gg.getLevels().get(i)) {
				GgLevel defaultDL = (GgLevel) gg.getLevels()
						.get(i);
				AddContext addContextDL = new AddContext();
				addContextDL.setNewObject(defaultDL);
				addContextDL.setTargetContainer(diagram);
				IAddFeature addFeatureDL = featureProvider
						.getAddFeature(addContextDL);
				if (null != addFeatureDL && addFeatureDL.canAdd(addContextDL)) {
					addFeatureDL.add(addContextDL);
				}
			}
		}
		
		//FIXME for generation of the diagram with the data in the database
		// add decision center if exist
		// add information center if exist
		// add decision framework if exist
		// add information link if exist
	}

}
