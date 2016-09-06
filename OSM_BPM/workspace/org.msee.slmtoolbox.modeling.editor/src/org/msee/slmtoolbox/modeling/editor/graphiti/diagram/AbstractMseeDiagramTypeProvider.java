package org.msee.slmtoolbox.modeling.editor.graphiti.diagram;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;

/**
 * Abstract DiagramTypeProvider for editor Msee
 * @author fto
 */
public abstract class AbstractMseeDiagramTypeProvider extends AbstractDiagramTypeProvider {
	
	/** log */
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(AbstractMseeDiagramTypeProvider.class);
	
	/**
	 * This method will be called by the DiagramEditor when a diagram has been
	 * saved.
	 * 
	 * @param diagram
	 *            The diagram for which the editor has been saved
	 * @param savedResources
	 *            The resources that have been saved
	 */
	@Override
	public void resourcesSaved(Diagram diagram, Resource[] savedResources) {
		super.resourcesSaved(diagram, savedResources);
		log.debug("resourcesSaved with AbstractMseeDiagramTypeProvider");
		 try {
				for (int i = 0; i < savedResources.length; i++) {
					savedResources[i].save(null);
				}
			} catch (IOException e) {
				log.error("An error occurred while saving resource");
				log.error(e);
			}
		/* Following the change management repository : the data service is without CDO
		 try {
			for (int i = 0; i < savedResources.length; i++) {
				if (savedResources[i] instanceof CDOResource)
						savedResources[i].save(null);
			}
			for (int i = 0; i < savedResources.length; i++) {
				if (!(savedResources[i] instanceof CDOResource))
						savedResources[i].save(null);
			}
		} catch (IOException e) {
			log.error("An error occurred while saving resource");
			log.error(e);
		}*/
	}

}
