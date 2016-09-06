package org.msee.slmtoolbox.modeling.service.data;

import org.msee.slmtoolbox.modeling.service.data.exception.ServiceDataException;

/**
 * Abstract class for all data service
 * @author fto
 *
 */
public abstract class AbstractDataService {
	
	/** log */
	private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(AbstractDataService.class);
	
	/**
	 * Default constructor
	 */
	public AbstractDataService() {
		log.debug("Create a DataService : " + this.getClass());
	}

	/**
	 * Find a Object with a id
	 * @param id			id object
	 * @param objectClass	object class
	 * @return a Object or null
	 */
	protected Object findObjectById(String id, Class<?> objectClass) throws ServiceDataException {
		// object to find
		Object objectToFind = null;
		/*if (null != id) {
			try {
				// Create a query 
				CDOQuery cdoQuery = getTransaction().createQuery("hql", 
						"FROM " + objectClass.getSimpleName()
						+" WHERE id=:id");
				cdoQuery.setParameter("id", id);
				// execute the query
				List<?> objectList = cdoQuery.getResult(objectClass);
				// select object
				if (objectList.size() > 0)
					objectToFind = objectList.get(0);
			} catch (RemoteException e) {
				log.warn(e.getMessage());
				objectToFind = null;
			} catch (Exception e) {
				log.error(e.getMessage());
				throw new ServiceDataException(e);
			}
		}*/
		return objectToFind;
	}
}
