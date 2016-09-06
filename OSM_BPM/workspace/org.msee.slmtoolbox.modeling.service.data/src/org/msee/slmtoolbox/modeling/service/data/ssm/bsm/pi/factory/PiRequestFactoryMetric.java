package org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.IPiElement;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiField;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiMetric;

/**
 * PiMetric request factory dao
 * @author fto
 *
 */
public class PiRequestFactoryMetric implements IPiRequestFactoryDao {

	@Override
	public List<String> createRequestAdd(IPiElement element, boolean generateId) {
		List<String> allRequest = new ArrayList<String>();
		// create request for add main element
		StringBuffer request = new StringBuffer("INSERT INTO ");
		request.append(PiMetric.TABLE_NAME);
		request.append(" (");
		request.append(PiMetric.FIELD_ID);
		request.append(" ,");
		request.append(PiMetric.FIELD_NAME);
		request.append(" ,");
		request.append(PiMetric.FIELD_CATEGORY_3);
		request.append(" ,");
		request.append(PiMetric.FIELD_UNIT);
		request.append(" ,");
		request.append(PiMetric.FIELD_DIMENSION);
		request.append(" ) VALUES('");
		if (generateId || null == element.getId()) {
			element.setId("METRIC_" + UUID.randomUUID().toString());
		}
		request.append(element.getId());
		request.append("','");
		request.append(element.getName());
		request.append("','");
		if (element instanceof PiMetric && null != ((PiMetric)element).getCategory3()) {
			request.append(((PiMetric)element).getCategory3().getId());
		} else {
			request.append("null");
		}
		request.append("','");
		request.append(((PiMetric)element).getUnit());
		request.append("','");
		if (element instanceof PiMetric && null != ((PiMetric)element).getDimension()) {
			request.append(((PiMetric)element).getDimension().getId());
		} else {
			request.append("null");
		}
		request.append("' );");
		allRequest.add(request.toString());
		
		//  ajout mrequete metric */
		if(element instanceof PiMetric && null != ((PiMetric)element).getFieldsList()) {
			for (PiField field : ((PiMetric)element).getFieldsList()) {
				StringBuffer requestField = new StringBuffer("INSERT INTO ");
				requestField.append(PiMetric.TABLE_FIELDS);
				requestField.append(" (");
				requestField.append(PiMetric.FIELD_ID);
				requestField.append(" ,");
				requestField.append(PiMetric.FIELD);
				requestField.append(" ) VALUES('");
				requestField.append(element.getId());
				requestField.append("','");
				requestField.append(field.getId());
				requestField.append("' );");
				allRequest.add(requestField.toString());
			}
		}
		
		
		return allRequest;
	}

	@Override
	public List<String> createRequestDelete(IPiElement element) {
		List<String> allRequest = new ArrayList<String>();
		allRequest.add("DELETE FROM " + PiMetric.TABLE_NAME + " WHERE " + PiMetric.FIELD_ID +"='"+ element.getId() +"'");
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
		request.append(PiMetric.TABLE_NAME);
		request.append(" WHERE ");
		request.append(PiMetric.FIELD_ID);
		request.append("='");
		request.append(id);
		request.append("'");
		return request.toString();
	}
	

}
