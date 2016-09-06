package org.msee.slmtoolbox.modeling.service.data.lang.eastar;

import java.util.List;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaResource;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.root.EaModel;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource;
import org.msee.slmtoolbox.modeling.service.data.AbstractDataService;
import org.msee.slmtoolbox.modeling.service.data.exception.ServiceDataException;

/**
 * Implementation EAStar data service
 * @author fto
 *
 * @deprecated Following the change management repository :
 * <ul>
 * <li>there is no longer an association between the system and LANG</li>
 * <li>the data service is without CDO</li>
 * </ul>
 *
 */
public class EAStarDataService extends AbstractDataService implements IEAStarDataService {
	
	/** log */
	//private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(EAStarDataService.class);
	
	/**
	 * Default constructor
	 */
	public EAStarDataService() {
		super();
	}
	
	/**
	 * Find ExtendedActigramModel for a id
	 * @param id		element id
	 * @return ExtendedActigramModel or null if not exist
	 * @throws ServiceDataException	error from database
	 */
	public EaModel findExtendedActigramModel(String id) {
		return (EaModel) findObjectById(id, EaModel.class);
	}
	
	/**
	 * Find EAStarExtendedActivity for a id
	 * @param id		element id
	 * @return ExtendedActigramModel or null if not exist
	 * @throws ServiceDataException	error from database
	 */
	public EaExtendedActivity findExtendedActivity(String id) {
		return (EaExtendedActivity) findObjectById(id, EaExtendedActivity.class);
	}

	/**
	 * Find EAStarResource for a BsmResource and EAStarProcess
	 * @param resource		bsm resource for search
	 * @param process		eaStar proces for search
	 * @param resourceType	resource type : EAStarHuman.class, EAStarIT.class or EAStarMaterial.class
	 * @return EAStarResource or null if not found
	 */
	public EaResource findResource(BsmResource resource, EaProcess process, Class<? extends EaResource> resourceType) {
		// object to find
		EaResource objectToFind = null;
		/*
		try {
			// Create a query 
			CDOQuery cdoQuery = getTransaction().createQuery("hql", 
					" SELECT eaResource "
					+ " FROM BsmProcess AS bsmProcess"
							+ " JOIN bsmProcess.eaProcess AS eaProcess"
							+ " JOIN bsmProcess.resources AS bsmResource"
							+ " JOIN bsmResource.eaResource AS eaResource"
					+ " WHERE eaProcess.id=:eaProcess AND bsmResource.id=:bsmResource ");
			cdoQuery.setParameter("eaProcess", process.getId());
			cdoQuery.setParameter("bsmResource", resource.getId());
			// execute the query
			List<?> objectList = cdoQuery.getResult(resourceType);
			// select object
			if (objectList.size() > 0)
				objectToFind = (EAStarResource) objectList.get(0);
		} catch (RemoteException e) {
			log.warn(e.getMessage());
			objectToFind = null;
		} catch (Exception e) {
			log.error(e.getMessage());
			throw new ServiceDataException(e);
		}*/
		return objectToFind;
	}

	/**
	 * Find extended activity Children for a process
	 * @param process					process parent
	 * @return extended activity Children list of process.
	 * 		   If type isn't null, return only objects of type passed as a parameter
	 */
	public List<EaExtendedActivity> findExtendedActivityList(EaProcess process) {
		List<EaExtendedActivity> objectList = null;
		/*
		try {
			// Create a query 
			// body query
			StringBuffer query = new StringBuffer();
			query.append(" SELECT activityChildren ");
			query.append(" FROM EAStarProcess AS parent ");
			query.append(" JOIN parent.flowElements AS element");
			query.append(" , EAStarExtendedActivity AS activityChildren");
			query.append(" WHERE parent.id=:id  AND activityChildren.id = element.id");
			// if the type is defined, add constraint
			if (null != type)
				query.append(" AND activityChildren.activityType=:type");
			
			CDOQuery cdoQuery = getTransaction().createQuery("hql", query.toString());
			cdoQuery.setParameter("id", process.getId());
			// if the type is defined, add parameter
			if (null != type)
				cdoQuery.setParameter("type", type);
			// execute the query
			objectList = cdoQuery.getResult(EAStarExtendedActivity.class);
		} catch (RemoteException e) {
			log.warn(e.getMessage());
		} catch (Exception e) {
			log.error(e.getMessage());
			throw new ServiceDataException(e);
		}*/
		return objectList;
	}

}
