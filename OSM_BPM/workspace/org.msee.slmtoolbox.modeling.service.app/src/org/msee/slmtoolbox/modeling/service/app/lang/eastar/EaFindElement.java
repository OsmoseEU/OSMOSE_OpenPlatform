package org.msee.slmtoolbox.modeling.service.app.lang.eastar;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaOrganization;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaProcessConnector;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaBaseElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaFlowElement;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;

/**
 * Search service for EaStar element
 * @author fto
 *
 */
public class EaFindElement {
	
	/**
	 * Find a EaBaseElement reference in process
	 * @param process		source
	 * @param id			id EaFlowElement
	 * @param typeElement	element find is a class typeElement
	 * @return null if not found
	 */
	public EaBaseElement findElement(EaProcess process, String id,
			Class<? extends EaBaseElement> typeElement) {
		// if param aren't define, EaFlowElement can't be found
		if (null == id || null == typeElement || null == process) {
			return null;
		}
		// for all element
		for (EaFlowElement element : process.getFlowElements()) {
			// find a EaFlowElement
			if (typeElement.isInstance(element)
					&& id.equals((element.getId()))) {
				return (EaBaseElement) element;
			}
		}
		return null;
	}

	/**
	 * Find a process connector for a processRef in process
	 * @param process		source
	 * @param processReference	reference process 
	 * @return null if not found
	 */
	public EaProcessConnector findProcessConnector(EaProcess process,
			BsmProcess processReference) {
		EaProcessConnector elementFound = null;
		// if processRef isn't define, processConnector can't be found
		if (null == processReference || null == processReference.getEaProcess()) {
			return null;
		}
		// for all element
		for (EaFlowElement element : process.getFlowElements()) {
			// find a process connector
			if (element instanceof EaProcessConnector) {
				EaProcessConnector processConnector = (EaProcessConnector) element;
				// with processRef
				if (null != processConnector.getProcessRef()) {
					// exiting in EaProcess of BsmProcess
					if (null != processReference.getEaProcess() &&
							processConnector.getProcessRef().getId().equals(processReference.getEaProcess().getId())) {
						elementFound = processConnector;
						break;
					}
				}
				
			}
		}
		return elementFound;
	}

	/**
	 * Find a structural activity for a process reference in process
	 * @param process		source
	 * @param processReference	process reference
	 * @return null if not found
	 */
	public EaStructuralExtendedActivity findStructuralExtendedActivity(
			EaProcess process, BsmProcess processReference) {
		EaStructuralExtendedActivity elementFound = null;
		// if processReference isn't define, EaStructuralExtendedActivity can't be found
		if (null == processReference || null == processReference.getId()) {
			return null;
		}
		// for all element
		for (EaFlowElement element : process.getFlowElements()) {
			// find a EaStructuralExtendedActivity
			if (element instanceof EaStructuralExtendedActivity) {
				EaStructuralExtendedActivity activity = (EaStructuralExtendedActivity) element;
				// with processReference
				if (null != activity.getIsA()) {
					// exiting in EaProcess of BsmProcess
					if (null != processReference.getEaProcess() &&
							activity.getIsA().getId().equals(processReference.getEaProcess().getId())) {
						elementFound = activity;
						break;
					}
				}
				
			}
		}
		return elementFound;
	}

	/**
	 * Find a EaOrganization reference in process
	 * @param process			source
	 * @param bsmOrganization	organization to find 
	 * @return null if not found
	 */
	public EaOrganization findOrgnization(EaProcess process,
			BsmOrganization bsmOrganization) {
		EaOrganization elementFound = null;
		if (null != process && null != bsmOrganization) {
			// for all ea* element in bsm object
			for (EaOrganization organization : bsmOrganization.getEaOrganizations()) {
				// search in process
				elementFound = (EaOrganization) findOrgnization(process, organization.getId());
				if (null != elementFound) {
					// stop if find
					break;
				}
			}
		}
		return elementFound;
	}
	
	/**
	 * Find a EaBaseElement reference in process
	 * @param process		source
	 * @param id			id EaFlowElement
	 * @param typeElement	element find is a class typeElement
	 * @return null if not found
	 */
	public EaBaseElement findOrgnization(EaProcess process, String id) {
		// if param aren't define, EaFlowElement can't be found
		if (null == id || null == process || null == process.getModel()) {
			return null;
		}
		// for all element
		for (EaOrganization element : process.getModel().getOrganizations()) {
			// find a EaFlowElement
			if (id.equals((element.getId()))) {
				return (EaBaseElement) element;
			}
		}
		return null;
	}

	/**
	 * Find a EaResource reference in process
	 * @param process			source
	 * @param bsmOrganization	organization to find 
	 * @return null if not found
	 */
	public EaResource findResource(EaProcess process, BsmResource bsmReference) {
		EaResource elementFound = null;
		if (null != process && null != bsmReference) {
			// for all ea* element in bsm object
			for (EaResource resource : bsmReference.getEaResources()) {
				// search in process
				elementFound = (EaResource) findElement(process, resource.getId(), EaResource.class);
				if (null != elementFound) {
					// stop if find
					break;
				}
			}
		}
		return elementFound;
	}

}
