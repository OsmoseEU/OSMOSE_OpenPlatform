package org.msee.slmtoolbox.modeling.editor.graigrid.diagram;

import org.eclipse.graphiti.ui.editor.DefaultUpdateBehavior;
import org.eclipse.graphiti.ui.editor.DiagramEditorInput;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.msee.slmtoolbox.modeling.app.service.BsmProjectManager;
import org.msee.slmtoolbox.modeling.editor.graphiti.diagram.AbstractMseeGraphitiDiagramEditor;
import org.msee.slmtoolbox.modeling.service.app.lang.graigrid.GgAppService;


/**
 * Implementation grai grid GraphitiDiagramEditor with a GraiGridAppService
 * @author FTO
 */
public class GgGraphitiDiagramEditor extends AbstractMseeGraphitiDiagramEditor<GgAppService> {
	
	/**
	 * Default constructor
	 */
	public GgGraphitiDiagramEditor() {
		super();
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
		this.setAppService(BsmProjectManager.eInstance.createGgService(getDiagramUri()));
	}
}
