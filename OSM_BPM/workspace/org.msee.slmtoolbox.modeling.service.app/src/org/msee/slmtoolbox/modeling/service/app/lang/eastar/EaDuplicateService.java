package org.msee.slmtoolbox.modeling.service.app.lang.eastar;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsFactory;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaHumanResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaITResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaMaterialResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.GeneralElementsFactory;

/**
 * Duplicate service for EaStar element
 * @author fto
 *
 */
public class EaDuplicateService {

	/**
	 * Find element in resource
	 * @param id		ea base element id
	 * @param resource	target
	 * @return null if not found
	 */
	private static EaBaseElement findElement(String id, Resource resource) {
		EaBaseElement elementFind = null;
		if (null != id && null != resource) {
			// for all element in root resource
			for (EObject eObject : resource.getContents()) {
				// found element if is EaBaseElement and have id
				if (eObject instanceof EaBaseElement
						&& id.equals(((EaBaseElement) eObject).getId())) {
					elementFind = (EaBaseElement) eObject;
					break;
				}
			}
		}
		return elementFind;
	}

	/**
	 * Copy data for EaBaseElement
	 * @param source 	EaBaseElement source
	 * @param target 	EaBaseElement target
	 */
	private static void copieData(EaBaseElement source,
			EaBaseElement target) {
		target.setId(source.getId());
		target.setName(source.getName());
		target.setCode(source.getCode());
		target.setDescription(source.getDescription());
		if(source instanceof EaProcess && target instanceof EaProcess) {
			((EaProcess)target).setDecompositionCode(((EaProcess)source).getDecompositionCode());
		} else if(source instanceof EaExtendedActivity && target instanceof EaExtendedActivity) {
			((EaExtendedActivity)target).setDecompositionCode(((EaExtendedActivity)source).getDecompositionCode());
		} 
	}
	
	/**
	 * Duplicate object in resource
	 * @param object	to duplicate
	 * @param resource	target duplicate object
	 * @return duplicate object
	 */
	public static EaProcess duplicate(EaProcess object, Resource resource) {
		// find or create object
		EaProcess duplicate = (EaProcess) findElement(object.getId(), resource);
		if (null == duplicate) {
			duplicate = GeneralElementsFactory.eINSTANCE.createEaProcess();
			// duplicate value
			copieData(object,duplicate);
		}
		
		if (null != resource) {
			// add to resource
			resource.getContents().add(duplicate);
		}

		return duplicate;
	}

	/**
	 * Duplicate object in resource
	 * @param object	to duplicate
	 * @param resource	target duplicate object
	 * @return duplicate object
	 */
	public static EaStructuralExtendedActivity duplicate(
			EaStructuralExtendedActivity object, Resource resource) {
		// find or create object
		EaStructuralExtendedActivity duplicate = (EaStructuralExtendedActivity) findElement(object.getId(), resource);
		if (null == duplicate) {
			duplicate = CoreElementsFactory.eINSTANCE.createEaStructuralExtendedActivity();
			// duplicate value
			copieData(object,duplicate);
		}
		
		// add to resource
		if (null != resource) {
			resource.getContents().add(duplicate);
		}

		return duplicate;
	}

	/**
	 * Duplicate object in resource
	 * @param object	to duplicate
	 * @param resource	target duplicate object
	 * @param type		class type
	 * @return duplicate object
	 */
	public static EaResource duplicate(EaResource object, Resource resource, Class<? extends EaResource> type) {
		EaResource duplicate = null;
		if (EaHumanResource.class.equals(type)) {
			duplicate = CoreElementsFactory.eINSTANCE.createEaHumanResource();
		} else if (EaITResource.class.equals(type)) {
			duplicate = CoreElementsFactory.eINSTANCE.createEaITResource();
		} else if (EaMaterialResource.class.equals(type)) {
			duplicate = CoreElementsFactory.eINSTANCE.createEaMaterialResource();
		} else {
			// TODO create an exception
		}

		// duplicate value
		if (null != duplicate) {
			copieData(object,duplicate);
			duplicate.setCapabilities(object.getCapabilities());
			duplicate.setLocation(object.getLocation());
			duplicate.setUnitaryCost(object.getUnitaryCost());
		}
		
		// add to resource
		if (null != resource) {
			resource.getContents().add(duplicate);
		}
		return duplicate;
	}

	/**
	 * Duplicate object in resource
	 * @param object	to duplicate
	 * @param resource	target duplicate object
	 * @param type		class type
	 * @return duplicate object
	 */
	public static EaResource duplicate(EaResource object,
			EaProcess resource,
			Class<? extends EaResource> type) {
		EaResource duplicate = null;
		if (EaHumanResource.class.equals(type)) {
			duplicate = CoreElementsFactory.eINSTANCE.createEaHumanResource();
		} else if (EaITResource.class.equals(type)) {
			duplicate = CoreElementsFactory.eINSTANCE.createEaITResource();
		} else if (EaMaterialResource.class.equals(type)) {
			duplicate = CoreElementsFactory.eINSTANCE.createEaMaterialResource();
		} else {
			// TODO create an exception
		}

		if (null != duplicate && null != object) {
			// duplicate value
			copieData(object,duplicate);
			duplicate.setCapabilities(object.getCapabilities());
			duplicate.setLocation(object.getLocation());
			duplicate.setUnitaryCost(object.getUnitaryCost());
			// add to resource
			resource.getFlowElements().add(duplicate);
		}

		return duplicate;
	}

	/**
	 * Duplicate object in resource
	 * @param object	to duplicate
	 * @param resource	target duplicate object
	 * @return duplicate object
	 */
	public static EaOrganization duplicate(EaOrganization object,
			Resource resource) {
		// find or create object
		EaOrganization duplicate = (EaOrganization) findElement(object.getId(), resource);
		if (null == duplicate) {
			duplicate = CoreElementsFactory.eINSTANCE.createEaOrganization();
		}
		
		// duplicate value
		copieData(object,duplicate);
		
		// add to resource
		if (null != resource) {
			resource.getContents().add(duplicate);
		}

		return duplicate;
	}

	/**
	 * Duplicate object
	 * @param object	to duplicate
	 * @return duplicate object
	 */
	public static EaOrganization duplicate(EaOrganization object) {
		// find or create object
		EaOrganization duplicate = CoreElementsFactory.eINSTANCE.createEaOrganization();
		
		// duplicate value
		copieData(object,duplicate);

		return duplicate;
	}
}
