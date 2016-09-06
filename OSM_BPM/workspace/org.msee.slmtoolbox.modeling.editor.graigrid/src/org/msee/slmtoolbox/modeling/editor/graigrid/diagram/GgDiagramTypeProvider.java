package org.msee.slmtoolbox.modeling.editor.graigrid.diagram;

import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.platform.IDiagramEditor;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;
import org.msee.slmtoolbox.modeling.editor.graphiti.diagram.AbstractMseeDiagramTypeProvider;
import org.msee.slmtoolbox.modeling.editor.graphiti.diagram.DefaultMseeToolBehaviorProvider;

/** DiagramTypeProvider for GraiGrid diagram */
public class GgDiagramTypeProvider extends AbstractMseeDiagramTypeProvider {
 
    private IToolBehaviorProvider[] toolBehaviorProviders;

	/** Default constructor */
	public GgDiagramTypeProvider() {
		super();
		setFeatureProvider(new GgFeatureProvider(this));
	}

	/**
	 * Init editor grai grid graphiti
	 * @param diagram		graphic element root
	 * @param diagramEditor diagram manager
	 */
	@Override
	public void init(Diagram diagram, IDiagramEditor diagramEditor) {
		super.init(diagram, diagramEditor);
	}
 
    @Override
    public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
        if (toolBehaviorProviders == null) {
            toolBehaviorProviders =
                new IToolBehaviorProvider[] { new DefaultMseeToolBehaviorProvider(this),
            		new DefaultMseeToolBehaviorProvider(this),
            		new DefaultMseeToolBehaviorProvider(this),
            		};
        }
        return toolBehaviorProviders;
    }

}
