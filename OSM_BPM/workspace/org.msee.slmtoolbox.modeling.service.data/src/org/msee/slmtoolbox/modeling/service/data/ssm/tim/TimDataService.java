package org.msee.slmtoolbox.modeling.service.data.ssm.tim;

//import java.util.List;

import org.msee.slmtoolbox.modeling.model.ssm.tim.TimModel;
import org.msee.slmtoolbox.modeling.service.data.AbstractDataService;
//import org.eclipse.emf.cdo.view.CDOQuery;
//import org.eclipse.net4j.signal.RemoteException;
//import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EAStarProcess;
//import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GraiGridDecisionCenter;
//import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GraiGrid;
//import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision;
//import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecisionStructure;
//import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmOrganization;
//import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmProcess;
//import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmRecourceType;
//import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;
//import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmService;
//import org.msee.slmtoolbox.modeling.service.data.exception.ServiceDataException;

/**
 * Implementation BSM data service
 * @author fto
 *
 * @deprecated Following the change management repository :
 * <ul>
 * <li>there is no longer an association between the system and LANG</li>
 * <li>the data service is without CDO</li>
 * </ul>
 *
 */
public class TimDataService extends AbstractDataService implements ITimDataService {
	
	/** log */
//	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(TimDataService.class);
	
	/**
	 * Default constructor
	 */
	public TimDataService() {
		super();
	}

	/**
	 * Add a BSM service system mModel in data base
	 * @param ssm		BSM service system mModel
	 */
	public void addServiceSystemModel(TimModel ssm) {
		/*// Open a new Session and start transaction.
		final Session session = getSession();
		session.beginTransaction();
		// Make it persistent.
		session.save(ssm);
		// Commit the changes to the database.
		session.getTransaction().commit();*/
	}


	/**
	 * find a BsmModel by id
	 * @param id	BsmModel id
	 * @return BsmModel
	 */
	public TimModel findServiceSystemModelsById(String id) {
		return (TimModel) findObjectById(id, TimModel.class);
	}

//	/**
//	 * find a decision by id
//	 * @param id	decision id
//	 * @return decision
//	 */
//	public BsmDecision findDecisionById(String id) {
//		return (BsmDecision) findObjectById(id, BsmDecision.class);
//	}
//
//	/**
//	 * find a decision structure by id
//	 * @param id	decision structure id
//	 * @return decision structure
//	 */
//	public BsmDecisionStructure findDecisionStructureById(String id) {
//		return (BsmDecisionStructure) findObjectById(id, BsmDecisionStructure.class);
//	}
//
//
//	/**
//	 * Find a BsmProcess by id
//	 * @param id		BSM process id
//	 * @return a BsmProcess or null if not found
//	 */
//	public BsmProcess findProcessById(String id) {
//		return (BsmProcess) findObjectById(id, BsmProcess.class);
//	}
//
//	/**
//	 * Find a Resource by id
//	 * @param id		Bsm resource id
//	 * @return a BsmResource
//	 */
//	public BsmResource findResourceById(String id) {
//		return (BsmResource) findObjectById(id, BsmResource.class);
//	}
//
//	/**
//	 * find an organization by id
//	 * @param id	organization id
//	 * @return organization
//	 */
//	public BsmOrganization findOrganizationById(String id) {
//		return (BsmOrganization) findObjectById(id, BsmOrganization.class);
//	}
//
//	/**
//	 * find a service by id
//	 * @param id	service id
//	 * @return organization
//	 */
//	public BsmService findServiceById(String id) {
//		return (BsmService) findObjectById(id, BsmService.class);
//	}
//	
//	/**
//	 * find a decision by GraiGridDecisionCenter
//	 * @param center		graiGrid DecisionCenter
//	 * @return BsmDecision
//	 */
//	public BsmDecision findDecisionByDecisionCenter(GraiGridDecisionCenter center) {
//		log.debug("findDecisionByDecisionCenter");
//		// object to find
//		BsmDecision objectToFind = null;
//		
//		try {
//			// Create a query 
//			CDOQuery cdoQuery = getTransaction().createQuery("hql", 
//					"SELECT decision FROM BsmDecision AS decision JOIN decision.ggDecisionCenter AS center WHERE center.id=:center");
//			cdoQuery.setParameter("center", center.getId());
//			// execute the query
//			List<?> objectList = cdoQuery.getResult(BsmDecision.class);
//			// select object
//			if (objectList.size() > 0)
//				objectToFind = (BsmDecision) objectList.get(0);
//		} catch (RemoteException e) {
//			log.warn(e.getMessage());
//			objectToFind = null;
//		} catch (Exception e) {
//			log.error(e.getMessage());
//			throw new ServiceDataException(e);
//		}
//		return objectToFind;
//	}
//
//	/**
//	 * Find decision structure list for a BSM SSM
//	 * @param idBsmSsm				bsm service system model id
//	 * @return a decision structure list
//	 */
//	public List<BsmDecisionStructure> findDecisionStructureList(String idBsmSsm) {
//		log.debug("findDecisionStructureList");
//		List<BsmDecisionStructure> objectsToFind = null;
//		try {
//			// query
//			CDOQuery cdoQuery = getTransaction().createQuery("hql", 
//					"SELECT ds " +
//							" FROM BsmModel AS bsm " +
//								" JOIN bsm.decisionStructure AS ds " +
//							" WHERE bsm.id=:idBsmSsm");
//			cdoQuery.setParameter("idBsmSsm", idBsmSsm);
//			// execute the query
//			objectsToFind = cdoQuery.getResult(BsmDecisionStructure.class);
//		} catch (RemoteException e) {
//			log.warn(e.getMessage());
//			objectsToFind = null;
//		} catch (Exception e) {
//			log.error(e.getMessage());
//			throw new ServiceDataException(e);
//		}
//		return objectsToFind;
//	}
//
//	/**
//	 * Find organization list for a BSM SSM
//	 * @param idBsmSsm				bsm service system model id
//	 * @return an organization list
//	 */
//	public List<BsmOrganization> findOrganizationList(String idBsmSsm) {
//		log.debug("findOrganizationList");
//		List<BsmOrganization> objectsToFind = null;
//		try {
//			// query
//			CDOQuery cdoQuery = getTransaction().createQuery("hql", 
//					"SELECT organization " +
//							" FROM BsmModel AS bsm " +
//								" JOIN bsm.organization AS organization " +
//							" WHERE bsm.id=:idBsmSsm");
//			cdoQuery.setParameter("idBsmSsm", idBsmSsm);
//			// execute the query
//			objectsToFind = cdoQuery.getResult(BsmOrganization.class);
//		} catch (RemoteException e) {
//			log.warn(e.getMessage());
//			objectsToFind = null;
//		} catch (Exception e) {
//			log.error(e.getMessage());
//			throw new ServiceDataException(e);
//		}
//		return objectsToFind;
//	}
//
//	/**
//	 * Find organization list for a BSM SSM
//	 * @param idBsmSsm				bsm service system model id
//	 * @return an organization list
//	 */
//	public List<BsmService> findServiceList(String idBsmSsm) {
//		log.debug("findServiceList");
//		List<BsmService> objectsToFind = null;
//		try {
//			// query
//			CDOQuery cdoQuery = getTransaction().createQuery("hql", 
//					"SELECT service " +
//							" FROM BsmModel AS bsm " +
//								" JOIN bsm.service AS service " +
//							" WHERE bsm.id=:idBsmSsm");
//			cdoQuery.setParameter("idBsmSsm", idBsmSsm);
//			// execute the query
//			objectsToFind = cdoQuery.getResult(BsmService.class);
//		} catch (RemoteException e) {
//			log.warn(e.getMessage());
//			objectsToFind = null;
//		} catch (Exception e) {
//			log.error(e.getMessage());
//			throw new ServiceDataException(e);
//		}
//		return objectsToFind;
//	}
//
//	/**
//	 * Find process list for a BSM SSM
//	 * @param idBsmSsm				bsm service system model id
//	 * @param idOrganization		organization id, can be null 
//	 * @param idService				service id, can be null 
//	 * @return a process list
//	 */
//	public List<BsmProcess> findProcessList(String idBsmSsm, String idOrganization, String idService) {
//		log.debug("findProcessList");
//		List<BsmProcess> objectsToFind = null;
//		try {
//			// create query
//			StringBuffer requet = new StringBuffer("SELECT process " +
//							" FROM BsmModel AS bsm " +
//								" JOIN bsm.process AS process " +
//								" JOIN process.organization AS organization " +
//								" JOIN process.service AS service " +
//							" WHERE bsm.id=:idBsmSsm ");
//			if (null != idOrganization)
//				requet.append(" AND organization.id=:idOrganization");
//			if (null != idService)
//				requet.append(" AND service.id=:idService");
//			// create CDO query
//			CDOQuery cdoQuery = getTransaction().createQuery("hql",requet.toString());
//			cdoQuery.setParameter("idBsmSsm", idBsmSsm);
//			// add parameter
//			if (null != idOrganization)
//				cdoQuery.setParameter("idOrganization", idOrganization);
//			if (null != idService)
//				cdoQuery.setParameter("idService", idService);
//			// execute the query
//			objectsToFind = cdoQuery.getResult(BsmProcess.class);
//		} catch (RemoteException e) {
//			log.warn(e.getMessage());
//			objectsToFind = null;
//		} catch (Exception e) {
//			log.error(e.getMessage());
//			throw new ServiceDataException(e);
//		}
//		return objectsToFind;
//	}
//
//	/**
//	 * Find a list resource for a organization
//	 * @param organization		bsm organization
//	 * @param type				bsm resource type
//	 * @return a resource bsm list
//	 */
//	public List<BsmResource> findResourceListForAOrganization(BsmOrganization organization, BsmRecourceType type) {
//		log.debug("findResourceListForAOrganization");
//		List<BsmResource> objectsToFind = null;
//		try {
//			// query
//			CDOQuery cdoQuery = getTransaction().createQuery("hql", 
//					"SELECT resource " +
//							" FROM BsmOrganization AS organization " +
//								" JOIN organization.resource AS resource " +
//							" WHERE organization=:organization AND resource.type=:type");
//			cdoQuery.setParameter("organization", organization);
//			cdoQuery.setParameter("type", type);
//			// execute the query
//			objectsToFind = cdoQuery.getResult(BsmResource.class);
//		} catch (RemoteException e) {
//			log.warn(e.getMessage());
//			objectsToFind = null;
//		} catch (Exception e) {
//			log.error(e.getMessage());
//			throw new ServiceDataException(e);
//		}
//		return objectsToFind;
//	}
//
//	/**
//	 * Find BsmModel for a grai grid
//	 * @param graigrid		for reacher
//	 * @return	a BsmModel
//	 */
//	public BsmModel findBsmModelByGraiGrid(
//			GraiGrid graigrid) {
//		log.debug("findBsmModelByGraiGrid");
//		BsmModel objectToFind = null;
//		try {
//			// query
//			CDOQuery cdoQuery = getTransaction().createQuery("hql", 
//					"SELECT bsm " +
//							" FROM BsmModel AS bsm " +
//								" JOIN bsm.decisionStructure AS ds " +
//								" JOIN ds.ggGraiGrid AS ggGraiGrid " +
//							" WHERE ggGraiGrid=:ggGraiGrid");
//			cdoQuery.setParameter("ggGraiGrid", graigrid);
//			// execute the query
//			List<BsmModel> objectsToFind = cdoQuery.getResult(BsmModel.class);
//			// find unique response
//			if (objectsToFind.size() == 1)
//				objectToFind = objectsToFind.get(0);
//		} catch (RemoteException e) {
//			log.error(e.getMessage());
//			throw new ServiceDataException(e);
//		} catch (Exception e) {
//			log.error(e.getMessage());
//			throw new ServiceDataException(e);
//		}
//		return objectToFind;
//	}
//
//	/**
//	 * Find BsmModel for a process
//	 * @param process		for reacher
//	 * @return	a BsmModel
//	 */
//	public BsmModel findBsmModelByProcess(
//			EAStarProcess process) {
//		log.debug("findBsmModelByProcess");
//		BsmModel objectToFind = null;
//		try {
//			// query
//			CDOQuery cdoQuery = getTransaction().createQuery("hql", 
//					"SELECT bsm " +
//							" FROM BsmModel AS bsm " +
//								" JOIN bsm.process AS process " +
//								" JOIN process.eaProcess AS eaProcess " +
//							" WHERE eaProcess=:eaProcess");
//			cdoQuery.setParameter("eaProcess", process);
//			// execute the query
//			List<BsmModel> objectsToFind = cdoQuery.getResult(BsmModel.class);
//			// find unique response
//			if (objectsToFind.size() == 1)
//				objectToFind = objectsToFind.get(0);
//		} catch (RemoteException e) {
//			log.error(e.getMessage());
//			throw new ServiceDataException(e);
//		} catch (Exception e) {
//			log.error(e.getMessage());
//			throw new ServiceDataException(e);
//		}
//		return objectToFind;
//	}
//
//	/**
//	 * Find BsmModel for a grai grid
//	 * @param graigrid		for reacher
//	 * @return	a BsmModel
//	 */
//	public BsmDecisionStructure findDecisionStructureForAGraiGrid(GraiGrid graigrid) {
//		log.debug("findDecisionStructureForAGraiGrid");
//		BsmDecisionStructure objectToFind = null;
//		try {
//			// query
//			CDOQuery cdoQuery = getTransaction().createQuery("hql", 
//					"SELECT ds " +
//							" FROM BsmModel AS bsm " +
//								" JOIN bsm.decisionStructure AS ds " +
//								" JOIN ds.ggGraiGrid AS ggGraiGrid " +
//							" WHERE ggGraiGrid=:ggGraiGrid");
//			cdoQuery.setParameter("ggGraiGrid", graigrid);
//			// execute the query
//			List<BsmDecisionStructure> objectsToFind = cdoQuery.getResult(BsmDecisionStructure.class);
//			// find unique response
//			if (objectsToFind.size() == 1)
//				objectToFind = objectsToFind.get(0);
//		} catch (RemoteException e) {
//			log.error(e.getMessage());
//			throw new ServiceDataException(e);
//		} catch (Exception e) {
//			log.error(e.getMessage());
//			throw new ServiceDataException(e);
//		}
//		return objectToFind;
//	}
//
//	/**
//	 * Find BsmDecision for a decisionCenter
//	 * @param decisionCenter		for reacher
//	 * @return	a BsmDecision
//	 */
//	public BsmDecision findDecisionForDecisionCenter(GraiGridDecisionCenter decisionCenter) {
//		log.debug("findDecisionForDecisionCenter");
//		BsmDecision objectToFind = null;
//		try {
//			// query
//			CDOQuery cdoQuery = getTransaction().createQuery("hql", 
//					"SELECT decision " +
//							" FROM BsmDecision AS decision " +
//								" JOIN decision.ggDecisionCenter  AS center " +
//							" WHERE center=:center");
//			cdoQuery.setParameter("center", decisionCenter);
//			// execute the query
//			List<BsmDecision> objectsToFind = cdoQuery.getResult(BsmDecision.class);
//			// find unique response
//			if (objectsToFind.size() == 1)
//				objectToFind = objectsToFind.get(0);
//		} catch (RemoteException e) {
//			log.error(e.getMessage());
//			throw new ServiceDataException(e);
//		} catch (Exception e) {
//			log.error(e.getMessage());
//			throw new ServiceDataException(e);
//		}
//		return objectToFind;
//	}
//
//	/**
//	 * Find BsmProcess for a eaStar process
//	 * @param id		process id for reacher
//	 * @return	a BsmProcess
//	 */
//	public BsmProcess findProcessForEAStarProcess(String id) {
//		log.debug("findProcessForEAStarProcess");
//		BsmProcess objectToFind = null;
//		try {
//			// query
//			CDOQuery cdoQuery = getTransaction().createQuery("hql", 
//					"SELECT process " +
//							" FROM BsmProcess AS process " +
//								" JOIN process.eaProcess  AS eaProcess " +
//							" WHERE eaProcess.id=:id");
//			cdoQuery.setParameter("id", id);
//			// execute the query
//			List<BsmProcess> objectsToFind = cdoQuery.getResult(BsmProcess.class);
//			// find unique response
//			if (objectsToFind.size() == 1)
//				objectToFind = objectsToFind.get(0);
//		} catch (RemoteException e) {
//			log.error(e.getMessage());
//			throw new ServiceDataException(e);
//		} catch (Exception e) {
//			log.error(e.getMessage());
//			throw new ServiceDataException(e);
//		}
//		return objectToFind;
//	}
//
//	/**
//	 * Find BsmResource for a eaStar resource
//	 * @param id		resource id for reacher
//	 * @return	a BsmResource
//	 */
//	public BsmResource findResourceForEAStarResource(String id) {
//		log.debug("findResourceForEAStarResource");
//		BsmResource objectToFind = null;
//		try {
//			// query
//			CDOQuery cdoQuery = getTransaction().createQuery("hql", 
//					"SELECT resource " +
//							" FROM BsmResource AS resource " +
//								" JOIN resource.eaResource  AS eaResource " +
//							" WHERE eaResource.id=:id");
//			cdoQuery.setParameter("id", id);
//			// execute the query
//			List<BsmResource> objectsToFind = cdoQuery.getResult(BsmResource.class);
//			// find unique response
//			if (objectsToFind.size() == 1)
//				objectToFind = objectsToFind.get(0);
//		} catch (RemoteException e) {
//			log.error(e.getMessage());
//			throw new ServiceDataException(e);
//		} catch (Exception e) {
//			log.error(e.getMessage());
//			throw new ServiceDataException(e);
//		}
//		return objectToFind;
//	}
}
