package org.msee.slmtoolbox.modeling.editor.eaStar.diagram;


import org.eclipse.graphiti.tb.IToolBehaviorProvider;
import org.msee.slmtoolbox.modeling.editor.graphiti.diagram.AbstractMseeDiagramTypeProvider;


/** DiagramTypeProvider for EAStar diagram */
public class EaDiagramTypeProvider extends AbstractMseeDiagramTypeProvider {

	/**
	 * tool behavior providers for EAStar editor
	 */
	private IToolBehaviorProvider[] toolBehaviorProviders;

	/** Default constructor */
	public EaDiagramTypeProvider() {
		super();
		setFeatureProvider(new EaFeatureProvider(this));
	}

	/**
	 * Returns all available tool behavior providers
	 * @return An array of all registered tool behavior providers
	 */
	@Override
	public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
		if (toolBehaviorProviders == null) {
			toolBehaviorProviders = new IToolBehaviorProvider[] {
					new EaToolBehaviorProvider(this)
			};
		}
		return toolBehaviorProviders;
	}

}
