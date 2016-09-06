package org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.factory;

import java.util.ArrayList;
import java.util.List;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.IPiElement;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory3;

/**
 * PiCategory3 request factory dao
 * @author fto
 *
 */
public class PiRequestFactoryCategory3 implements IPiRequestFactoryDao {
	
	/**
	 * Create all request for add element
	 * @param element		to add
	 * @param generateId	not use, element must have a id
	 * @return	request
	 */
	@Override
	public List<String> createRequestAdd(IPiElement element, boolean generateId) {
		List<String> allRequest = new ArrayList<String>();
		// create request for add main element
		StringBuffer request = new StringBuffer("INSERT INTO ");
		request.append(PiCategory3.TABLE_NAME);
		request.append(" (");
		request.append(PiCategory3.FIELD_ID);
		request.append(" ,");
		request.append(PiCategory3.FIELD_NAME);
		request.append(" ,");
		request.append(PiCategory3.FIELD_CATEGORY_2);
		request.append(" ) VALUES('");
		request.append(element.getId());
		request.append("','");
		request.append(element.getName());
		request.append("','");
		if (element instanceof PiCategory3 && null != ((PiCategory3)element).getCategory2()) {
			request.append(((PiCategory3)element).getCategory2().getId());
		} else {
			request.append("null");
		}
		request.append("' );");
		allRequest.add(request.toString());
		
		return allRequest;
	}

	@Override
	public List<String> createRequestDelete(IPiElement element) {
		List<String> allRequest = new ArrayList<String>();
		allRequest.add("DELETE FROM " + PiCategory3.TABLE_NAME + " WHERE " + PiCategory3.FIELD_ID +"='"+ element.getId() +"'");
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
		request.append(PiCategory3.TABLE_NAME);
		request.append(" WHERE ");
		request.append(PiCategory3.FIELD_ID);
		request.append("='");
		request.append(id);
		request.append("'");
		if (null != idFilter) {
			request.append(" AND ");
			request.append(PiCategory3.FIELD_CATEGORY_2);
			request.append("='");
			request.append(idFilter);
			request.append("'");
		}
		return request.toString();
	}


}
