package org.msee.slmtoolbox.modeling.service.data.lang.graigrid;

import java.util.List;

import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgDecisionFrame;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgFunction;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationCenter;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationFlow;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgInformationSource;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgLevel;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.GgNode;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GgGraiGrid;
import org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.GgModel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmDecision;
import org.msee.slmtoolbox.modeling.service.data.AbstractDataService;
import org.msee.slmtoolbox.modeling.service.data.exception.ServiceDataException;

/**
 * Implementation GraiGrid data service
 * @author fto
 *
 * @deprecated Following the change management repository :
 * <ul>
 * <li>there is no longer an association between the system and LANG</li>
 * <li>the data service is without CDO</li>
 * </ul>
 */
public class GraiGridDataService extends AbstractDataService implements IGraiGridDataService {
	
	/** log */
	//private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(GraiGridDataService.class);
	
	/**
	 * Default constructor
	 */
	public GraiGridDataService() {
		super();
	}
	
	/**
	 * Find decision list for a enterprise, function and level
	 * @param graigrid		for research
	 * @param function		for research
	 * @param level			for research
	 * @return a decision list
	 */
	public List<BsmDecision> findDecisionList(GgGraiGrid graigrid, GgFunction function, GgLevel level) {
		List<BsmDecision> objectsToFind = null;
		/*CDOQuery cdoQuery = null;
		
		try {
			// Create a query 
			cdoQuery = getTransaction().createQuery("hql", 
					"SELECT decision "
							+ " FROM BsmModel AS bsm"
								+ " JOIN bsm.decision AS decision "
								// decision can have a decisionStructure
								+ " LEFT JOIN decision.decisionStructure AS ds "
									+ " LEFT JOIN ds.ggGraiGrid AS gg "
										+ " LEFT JOIN gg.levels AS level "
											+ " LEFT JOIN level.nodes AS node "
								// decision can have a center
								+ " LEFT JOIN decision.ggDecisionCenter AS center "
									+ " LEFT JOIN center.function AS function "
							+ " WHERE " 
								// if not GG
								+ "(gg IS NULL "
									+ " OR "
									// or target gg and/or target level
									+ "(gg.id=:graigrid"
										+ " AND "
										+ " (level.id=:level AND (node.id = center.id OR node IS NULL))" 
									+ ")"
								+ " AND (" 
									// if not center
									+ "(center IS NULL) "
									+ " OR " 
									// or center in target function
									+ "(function.id=:function OR center IS NULL)"
									+"))"
								);
			cdoQuery.setParameter("graigrid", graigrid.getId());
			cdoQuery.setParameter("function", function.getId());
			cdoQuery.setParameter("level", level.getId());
			// execute the query
			objectsToFind = cdoQuery.getResult(BsmDecision.class);
		} catch (RemoteException e) {
			log.warn(e.getMessage() + ", Query : " + cdoQuery.toString());
			objectsToFind = null;
		} catch (Exception e) {
			log.error(e.getMessage());
			throw new ServiceDataException(e);
		}*/
		return objectsToFind;
		
	}

	/**
	 * Find information center list for a information source and level
	 * @param informationSource
	 * @param level
	 * @return a information center list
	 */
	public List<GgInformationCenter> findInformationCenterList(GgInformationSource informationSource, GgLevel level) {
		List<GgInformationCenter> objectsToFind = null;
		/*CDOQuery cdoQuery = null;
		
		try {
			cdoQuery = getTransaction().createQuery("hql", 
					"SELECT decision " +
							" FROM GgInformationSource AS source " +
								" JOIN source.informationCenters AS center " +
								", GgLevel AS level " +
								" JOIN level.nodes AS node " +
							" WHERE source.id=:source AND level.id=:level AND node=center");
			cdoQuery.setParameter("source", informationSource.getId());
			cdoQuery.setParameter("level", level.getId());
			// execute the query
			objectsToFind = cdoQuery.getResult(GgInformationCenter.class);
		} catch (RemoteException e) {
			log.warn(e.getMessage() + ", Query : " + cdoQuery.toString());
			objectsToFind = null;
		} catch (Exception e) {
			log.warn(e.getMessage() + ", Query : " + cdoQuery.toString());
			throw new ServiceDataException(e);
		}*/
		return objectsToFind;
	}
	
	/**
	 * Find function list not in graigrid, but link to graigrid's enterprise
	 * @param graigird		function not link to graigrid
	 * @return a function list <id, name>
	 */
	public List<GgFunction> findFunctionListNotInGraiGird(GgGraiGrid graigrid) {
		List<GgFunction> objectsToFind = null;
		/*CDOQuery cdoQuery = null;
		
		try {
			cdoQuery = getTransaction().createQuery("hql", 
					"SELECT function " +
							" FROM GraiGrid AS graigrid " +
								" JOIN graigrid.enterprise AS enterprise " +
								" JOIN enterprise.functions AS function " +
							" WHERE graigrid.id=:graigrid " +
								" AND function.id NOT IN (" +
									"SELECT functionReject.id " +
									"FROM GraiGrid AS graigridReject " +
										"JOIN graigridReject.functions AS functionReject " +
									"WHERE graigridReject.id=:graigrid)");
			cdoQuery.setParameter("graigrid", graigrid.getId());
			// execute the query
			objectsToFind = cdoQuery.getResult(GraiGridFunction.class);
			
		} catch (RemoteException e) {
			log.warn(e.getMessage() + ", Query : " + cdoQuery.toString());
			objectsToFind = null;
		} catch (Exception e) {
			log.warn(e.getMessage() + ", Query : " + cdoQuery.toString());
			throw new ServiceDataException(e);
		}*/
		return objectsToFind;
	}


	/**
	 * Find the grai grid model
	 * @return a grai grid model or null if not exist
	 */
	public GgModel findGgModel() {
		
		GgModel objectToFind = null;
		/*CDOQuery cdoQuery = null;
		
		try {
			// Create a query 
			cdoQuery = getTransaction().createQuery("hql", "from GgModel ");
			// execute the query
			List<GgModel> objectList = cdoQuery.getResult(GgModel.class);
			// select object
			if (objectList.size() > 0)
				objectToFind = objectList.get(0);
		} catch (RemoteException e) {
			log.warn(e.getMessage() + " Query : " + cdoQuery.toString());
			objectToFind = null;
		} catch (Exception e) {
			log.warn(e.getMessage() + " Query : " + cdoQuery.toString());
			throw new ServiceDataException(e);
		}*/
		return objectToFind;
	}

	/**
	 * Find function for a id
	 * @param id	function id
	 * @return function or null if not exist
	 * @throws ServiceDataException	error from database
	 */
	public GgFunction findFunctionById(String id) throws ServiceDataException {
		return (GgFunction) findObjectById(id, GgFunction.class);
	}

	/**
	 * Find information source for a id
	 * @param id	information source id
	 * @return information source or null if not exist
	 * @throws ServiceDataException	error from database
	 */
	public GgInformationSource findInformationSourceById(String id) throws ServiceDataException {
		return (GgInformationSource) findObjectById(id, GgInformationSource.class);
	}

	/**
	 * Find information center for a id
	 * @param id	information center id
	 * @return information source or null if not exist
	 * @throws ServiceDataException	error from database
	 */
	public GgInformationCenter findInformationCenterById(String idCenter) throws ServiceDataException {
		return (GgInformationCenter) findObjectById(idCenter, GgInformationCenter.class);
	}

	/**
	 * Find decision center for a id
	 * @param id	information center id
	 * @return information source or null if not exist
	 * @throws ServiceDataException	error from database
	 */
	public GgDecisionCenter findDecisionCenterById(String idCenter) throws ServiceDataException {
		return (GgDecisionCenter) findObjectById(idCenter, GgDecisionCenter.class);
	}

	/**
	 * Find information flow for a source and target
	 * @param source	of information flow
	 * @param target	of information flow
	 * @return information flow  or null if not exist
	 */
	public GgInformationFlow findInformationFlowByNodes(GgNode source, GgNode target) {
		Object object = findFlow(source, target, GgInformationFlow.class);
		if (object instanceof GgInformationFlow)
			return (GgInformationFlow) object;
		else 
			return null;
	}
	
	/**
	 * Find decision frame for a source and target
	 * @param source	of decision frame
	 * @param target	of decision frame
	 * @return decision frame or null if not exist
	 */
	public GgDecisionFrame findDecisionFrameNodes(GgNode source, GgNode target) {
		Object object = findFlow(source, target, GgDecisionFrame.class);
		if (object instanceof GgDecisionFrame)
			return (GgDecisionFrame) object;
		else 
			return null;
	}

	/**
	 * Find a flow
	 * @param source	flow source
	 * @param target	flow target
	 * @param class1		flow type
	 * @return	a flow or null
	 */
	private Object findFlow(GgNode source, GgNode target, Class<?> objectClass) {
		
		Object objectToFind = null;
		/*CDOQuery cdoQuery = null;
		
		try {
			// Create a query 
			cdoQuery = getTransaction().createQuery("hql", 
					"SELECT flow from " + objectClass.getSimpleName() + " flow " +
					" JOIN flow.target AS target " +
					" JOIN flow.source AS source" +
					" WHERE target.id=:target AND source.id=:source");
			cdoQuery.setParameter("target", target.getId());
			cdoQuery.setParameter("source", source.getId());
			// execute the query
			List<?> objectList = cdoQuery.getResult(objectClass);
			// select object
			if (objectList.size() > 0)
				objectToFind = objectList.get(0);
		} catch (RemoteException e) {
			log.warn(e.getMessage() + ", Query : " + cdoQuery.toString());
			objectToFind = null;
		} catch (Exception e) {
			log.warn(e.getMessage() + ", Query : " + cdoQuery.toString());
			throw new ServiceDataException(e);
		}*/
		return objectToFind;
		
	}

}
