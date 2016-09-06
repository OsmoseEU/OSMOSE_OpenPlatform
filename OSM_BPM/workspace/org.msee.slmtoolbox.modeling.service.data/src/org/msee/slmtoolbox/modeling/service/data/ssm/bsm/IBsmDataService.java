package org.msee.slmtoolbox.modeling.service.data.ssm.bsm;

import java.util.List;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmModel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResourceType;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;

public interface IBsmDataService {


	/**
	 * Add a BSM service system mModel in data base
	 * @param ssm		BSM service system mModel
	 */
	public void addServiceSystemModel(BsmModel ssm);


	/**
	 * find a BsmModel by id
	 * @param id	BsmModel id
	 * @return BsmModel
	 */
	public BsmModel findModelsById(String id);
	
	/**
	 * find a decision by id
	 * @param id	decision id
	 * @return decision
	 */
	public BsmDecision findDecisionById(String id);

	/**
	 * find a decision structure by id
	 * @param id	decision structure id
	 * @return decision structure
	 */
	public BsmDecisionStructure findDecisionStructureById(String id);


	/**
	 * Find a BsmProcess by id
	 * @param id		BSM process id
	 * @return a BsmProcess or null if not found
	 */
	public BsmProcess findProcessById(String id);

	/**
	 * Find a Resource by id
	 * @param id		Bsm resource id
	 * @return a BsmResource
	 */
	public BsmResource findResourceById(String id);

	/**
	 * find an organization by id
	 * @param id	organization id
	 * @return organization
	 */
	public BsmOrganization findOrganizationById(String id);

	/**
	 * find a service by id
	 * @param id	service id
	 * @return organization
	 */
	public BsmService findServiceById(String id);
	
	/**
	 * find a decision by GraiGridDecisionCenter
	 * @param center		graiGrid DecisionCenter
	 * @return BsmDecision
	 */
	public BsmDecision findDecisionByDecisionCenter(GgDecisionCenter center);

	/**
	 * Find decision structure list for a BSM SSM
	 * @param idBsmSsm				bsm service system model id
	 * @return a decision structure list
	 */
	public List<BsmDecisionStructure> findDecisionStructureList(String idBsmSsm);

	/**
	 * Find organization list for a BSM SSM
	 * @param idBsmSsm				bsm service system model id
	 * @return an organization list
	 */
	public List<BsmOrganization> findOrganizationList(String idBsmSsm);

	/**
	 * Find organization list for a BSM SSM
	 * @param idBsmSsm				bsm service system model id
	 * @return an organization list
	 */
	public List<BsmService> findServiceList(String idBsmSsm);

	/**
	 * Find process list for a BSM SSM
	 * @param idBsmSsm				bsm service system model id
	 * @param idOrganization		organization id, can be null 
	 * @param idService				service id, can be null 
	 * @param activityType 			EA* type define for subprocess, if null no constraint
	 * @return a process list
	 */
	/*public List<BsmProcess> getProcessListForAEAActivityType(String idBsmSsm, String idOrganization, String idService, 
			EAStarActivityType activityType);*/
	
	/**
	 * Find subProcess list for a BSM process
	 * @param idProcess				bsm process id
	 * @return a subprocess list <id, name>
	 */
	public List<BsmProcess> findSubProcessList(String idProcess);

	/**
	 * Find a list resource for a organization
	 * @param organization		bsm organization
	 * @param type				bsm resource type
	 * @return a resource bsm list
	 */
	public List<BsmResource> findResourceListForAOrganization(BsmOrganization organization, BsmResourceType type);

	/**
	 * Find BsmModel for a grai grid
	 * @param graigrid		for search
	 * @return	a BsmModel
	 */
	public BsmModel findBsmModelByGraiGrid(
			GgGraiGrid graigrid);

	/**
	 * Find BsmModel for a process
	 * @param process		for search
	 * @return	a BsmModel
	 */
	public BsmModel findBsmModelByProcess(
			EaProcess process);

	/**
	 * Find BsmModel for a grai grid
	 * @param id				grai grid id for search
	 * @return	a BsmModel
	 */
	public BsmDecisionStructure findDecisionStructureForAGraiGrid(String id);

	/**
	 * Find BsmDecision for a decisionCenter
	 * @param id				decision center id for search
	 * @return	a BsmDecision
	 */
	public BsmDecision findDecisionForDecisionCenter(String id);

	/**
	 * Find BsmOrganization for an enterprise
	 * @param id				enterprise id for search
	 * @return	a BsmDecision
	 */
	public BsmOrganization findOrganizationForAEnterprise(String id);
	
	/**
	 * Find BsmProcess for a eaStar process
	 * @param id		process id for search
	 * @return	a BsmProcess
	 */
	public BsmProcess findProcessForEAStarProcess(String id);

	/**
	 * Find BsmResource for a eaStar resource
	 * @param id		resource id for search
	 * @return	a BsmResource
	 */
	public BsmResource findResourceForEAStarResource(String id);

	public EaModel findEAStarProcessById(String eAStarModelId);
}
