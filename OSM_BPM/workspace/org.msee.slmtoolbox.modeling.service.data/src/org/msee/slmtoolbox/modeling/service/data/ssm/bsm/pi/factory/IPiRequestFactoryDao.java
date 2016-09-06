package org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.factory;

import java.util.List;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.IPiElement;

/**
 * Interface for request factory dao
 * @author fto
 *
 */
public interface IPiRequestFactoryDao {
	
	/**
	 * Create all request for add element
	 * @param element		to add
	 * @param generateId	flag for generate id
	 * @return	request
	 */
	public List<String> createRequestAdd(IPiElement element, boolean generateId);
	
	/**
	 * Create all request for delete element
	 * @param element	to delete
	 * @return	request
	 */
	public List<String> createRequestDelete(IPiElement element);

	/**
	 * Create a request for find element with id
	 * @param id		main id
	 * @param idFilter	other id for filter (can be null)
	 * @return	request
	 */
	public String createRequestFind(String id, String idFilter);
	
	

}
