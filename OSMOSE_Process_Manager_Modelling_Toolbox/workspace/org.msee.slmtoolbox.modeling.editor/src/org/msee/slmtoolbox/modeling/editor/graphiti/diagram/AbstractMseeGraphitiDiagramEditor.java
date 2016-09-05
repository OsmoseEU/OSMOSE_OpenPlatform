package org.msee.slmtoolbox.modeling.editor.graphiti.diagram;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.ui.editor.DefaultUpdateBehavior;
import org.eclipse.graphiti.ui.editor.DiagramEditor;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.msee.slmtoolbox.modeling.editor.exception.EditorException;
import org.msee.slmtoolbox.modeling.service.app.AbstractAppService;

/**
 * Abstract GraphitiDiagramEditor for editor Msee
 * @author fto
 *
 * @param <S> define the editor AppService
 */
public abstract class AbstractMseeGraphitiDiagramEditor <S extends AbstractAppService> extends DiagramEditor {

	//private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(AbstractMseeGraphitiDiagramEditor.class);

	/** 
	 * Service App for the graphiti editor
	 */
	private S appService;
	
	/**
	 * Data model resource
	 */
	private Resource resource;
	
	/**
	 * Default constructor
	 * @param appServiceClass	app service class
	 */
	public AbstractMseeGraphitiDiagramEditor() {
		super();
	}
	
	public Object executeFeature(IFeature feature, IContext context) {
		Object object = null;
		try {
			object = super.executeFeature(feature, context);
		} catch(EditorException exception) {
			MessageDialog.openInformation(PlatformUI.getWorkbench()
		              .getActiveWorkbenchWindow().getShell(), "Error",
		              exception.getMessage());
			throw exception;
		}
		return object;
	}

	/**
	 * Does the initialization of the editor. The default implementation cares
	 * about:
	 * <ol>
	 * <li>converting the passed {@link IEditorInput} to a
	 * {@link DiagramEditorInput}. In case this fails, a
	 * {@link PartInitException} is thrown.</li>
	 * <li>creating the editing domain by delegating to the update behavior
	 * extension, see {@link DefaultUpdateBehavior#createEditingDomain()} for
	 * details</li>
	 * <li>initializing the underlying GEF editor by delegating to super</li>
	 * <li>initializing the update behavior extension (the order is important
	 * here as this must happen after initializing the GEF editor!)</li>
	 * <li>triggering the migration of diagram data if necessary</li>
	 * </ol>
	 * Any clients overriding this method have to make sure that they they
	 * always call <code>super.init(site, input)</code>.
	 * 
	 * @see org.eclipse.ui.IEditorPart#init(IEditorSite, IEditorInput)
	 * @param site
	 *            the Eclipse {@link IEditorSite} that will host this editor
	 * @param input
	 *            the editor input that shall be used. Note that this method
	 *            will exchange the input instance in case it is no
	 *            {@link DiagramEditorInput}.
	 * 
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input)
			throws PartInitException {

		super.init(site, input);
		
		// initialize the data access
		for (Resource resource : this.getResourceSet().getResources()) {
			if (resource instanceof XMIResource) {
				this.setResource(resource);
			}
		}
	}

	/**
	 * get diagram uri
	 * @return null if  not find
	 */
	protected URI getDiagramUri() {
		URI diagramUri = null;
		if (null != getDiagramTypeProvider() 
				&& null!=getDiagramTypeProvider().getDiagram()) {
			Resource resource = getDiagramTypeProvider().getDiagram().eResource();
			if (null != resource) {
				diagramUri = resource.getURI();
			}
		}
		return diagramUri;
	}

	/**
	 * @return the service
	 */
	public S getAppService() {
		return this.appService;
	}

	/**
	 * @param service the service to set
	 */
	protected void setAppService(S appService) {
		this.appService = appService;
	}

	/**
	 * @return the resource
	 */
	public Resource getResource() {
		return resource;
	}

	/**
	 * @param resource the resource to set
	 */
	private void setResource(Resource resource) {
		this.resource = resource;
	}
}
