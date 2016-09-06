package org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.IPiElement;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiDimension;

/**
 * PiDimension request factory dao
 * @author fto
 *
 */
public class PiRequestFactoryDimension implements IPiRequestFactoryDao {

	@Override
	public List<String> createRequestAdd(IPiElement element, boolean generateId) {
		List<String> allRequest = new ArrayList<String>();
		// create request for add main element
		StringBuffer request = new StringBuffer("INSERT INTO ");
		request.append(PiDimension.TABLE_NAME);
		request.append(" (");
		request.append(PiDimension.FIELD_ID);
		request.append(" ,");
		request.append(PiDimension.FIELD_NAME);
		request.append(" ) VALUES('");
		if (generateId || null == element.getId()) {
			element.setId("DIM_" + UUID.randomUUID().toString());
		}
		request.append(element.getId());
		request.append("','");
		request.append(element.getName());
		request.append("' );");
		
		allRequest.add(request.toString());
		
		return allRequest;
	}

	@Override
	public List<String> createRequestDelete(IPiElement element) {
		List<String> allRequest = new ArrayList<String>();
		allRequest.add("DELETE FROM " + PiDimension.TABLE_NAME + " WHERE " + PiDimension.FIELD_ID +"='"+ element.getId() +"'");
		return allRequest;
	}

	/**
	 * Create a request for find element with id
	 * @param id		main id
	 * @param idFilter	other id for filter (can be null)
	 * @return	request
	 */
	public String createRequestFind(String id, String idFilter) {
		StringBuffer request = new StringBuffer("SELECT * FROM ");
		request.append(PiDimension.TABLE_NAME);
		request.append(" WHERE ");
		request.append(PiDimension.FIELD_ID);
		request.append("='");
		request.append(id);
		request.append("'");
		return request.toString();
	}
	
	/**
	 * Create a request for find element with name
	 * @param name		
	 * @return	request
	 */
	public String createRequestFindByName(String name) {
		StringBuffer request = new StringBuffer("SELECT * FROM ");
		request.append(PiDimension.TABLE_NAME);
		request.append(" WHERE ");
		request.append(PiDimension.FIELD_NAME);
		request.append("='");
		request.append(name);
		request.append("'");
		return request.toString();
	}

}
