package org.msee.slmtoolbox.modeling.service.app.lang.graigrid;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsFactory;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsFactory;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgOrganization;

/**
 * Duplicate service for GraiGrid element
 * @author fto
 *
 */

public class GgDuplicateService {

	/**
	 * Find element in resource
	 * @param id		gg base element id
	 * @param resource	target
	 * @return null if not found
	 */
	private static GgBaseElement findElement(String id, Resource resource) {
		GgBaseElement elementFind = null;
		if (null != id && null != resource) {
			// for all element in root resource
			for (EObject eObject : resource.getContents()) {
				// found element if is EaBaseElement and have id
				if (eObject instanceof GgBaseElement
						&& id.equals(((GgBaseElement) eObject).getId())) {
					elementFind = (GgBaseElement) eObject;
					break;
				}
			}
		}
		return elementFind;
	}

	/**
	 * Copy data for GgBaseElement
	 * @param source 	GgBaseElement source
	 * @param target 	GgBaseElement target
	 */
	private static void copieData(GgBaseElement source,
			GgBaseElement target) {
		target.setId(source.getId());
		target.setName(source.getName());
		target.setCode(source.getCode());
		target.setDescription(source.getDescription());
	}

	/**
	 * Duplicate object in resource
	 * @param object	to duplicate
	 * @param resource	target duplicate object
	 * @return duplicate object
	 */
	public static GgGraiGrid duplicate(GgGraiGrid object, Resource resource) {
		// find or create object
		GgGraiGrid duplicate = (GgGraiGrid) findElement(object.getId(), resource);
		if (null == duplicate) {
			duplicate = GeneralElementsFactory.eINSTANCE.createGgGraiGrid();
		}
		
		// duplicate value
		copieData(object,duplicate);
		
		// add to resource
		resource.getContents().add(duplicate);

		return duplicate;
	}

	/**
	 * Duplicate object in resource
	 * @param object	to duplicate
	 * @param resource	target duplicate object
	 * @return duplicate object
	 */
	public static GgOrganization duplicate(GgOrganization object, Resource resource) {
		// find or create object
		GgOrganization duplicate = (GgOrganization) findElement(object.getId(), resource);
		if (null == duplicate) {
			duplicate = GeneralElementsFactory.eINSTANCE.createGgOrganization();
		}
		
		// duplicate value
		copieData(object,duplicate);
		
		// add to resource
		resource.getContents().add(duplicate);

		return duplicate;
	}

	/**
	 * Duplicate object in resource
	 * @param object	to duplicate
	 * @param resource	target duplicate object
	 * @return duplicate object
	 */
	public static GgDecisionCenter duplicate(GgDecisionCenter object, Resource resource) {
		// find or create object
		GgDecisionCenter duplicate = (GgDecisionCenter) findElement(object.getId(), resource);
		if (null == duplicate) {
			duplicate = CoreElementsFactory.eINSTANCE.createGgDecisionCenter();
		}
		
		// duplicate value
		copieData(object,duplicate);
		
		// add to resource
		resource.getContents().add(duplicate);

		return duplicate;
	}

}
