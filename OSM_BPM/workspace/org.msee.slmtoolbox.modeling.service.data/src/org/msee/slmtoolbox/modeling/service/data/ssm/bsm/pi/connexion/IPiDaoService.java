package org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.connexion;

import java.util.List;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.IPiElement;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory1;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory2;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory3;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiDimension;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiField;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiMetric;

public interface IPiDaoService {

	/**
	 * Get all piCcategory1
	 * @return not null
	 */
	public List<PiCategory1> getListCategory1();

	/**
	 * Get all piCcategory2 for piCategory1
	 * @param piCategory1 
	 * @return not null
	 */
	public List<PiCategory2> getListCategory2(PiCategory1 piCategory1);

	/**
	 * Get all piCcategory3 for piCategory2
	 * @param piCategory2
	 * @return not null
	 */
	public List<PiCategory3> getListCategory3(PiCategory2 piCategory2);

	/**
	 * Get all Metrics filer with param
	 * @param category1		can be null
	 * @param category2		can be null
	 * @param category3		can be null
	 * @param dimension		can be null
	 * @param field			can be null
	 * @param name			can be null
	 * @return all Metrics filer with param
	 */
	public List<PiMetric> getListMetrics(PiCategory1 category1, PiCategory2 category2,
			PiCategory3 category3, PiDimension dimension, PiField field, String name);

	/**
	 * Get all field filter with param
	 * @param category1		can be null
	 * @param category2		can be null
	 * @param category3		can be null
	 * @return all field filer with param
	 */
	public List<PiField> getListField(PiCategory1 category1,
			PiCategory2 category2, PiCategory3 category3);

	/**
	 * Get all dimension filer with param
	 * @param category1		can be null
	 * @param category2		can be null
	 * @param category3		can be null
	 * @return all dimension filer with param
	 */
	public List<PiDimension> getListDimension(PiCategory1 category1,
			PiCategory2 category2, PiCategory3 category3);
	
	/**
	 * @return all dimension
	 */
	public List<PiDimension> getListDimension();
	
	/**
	 * Add (and update object id) or update Metric
	 * @param metric	to add or update
	 */
	public void addOrUpdateMetric(PiMetric metric);
	
	/**
	 * Delete metric
	 * @param metric	to delete
	 */
	public void deleteMetric(PiMetric metric);
	
	/**
	 * @param fieldName		field name to find
	 * @return Field with name in param, null if not found
	 */
	public PiField getField(String fieldName);

	/**
	 * Add element to data base
	 * @param element
	 */
	public void add(IPiElement element);

	/**
	 * Delete element to data base
	 * @param element
	 */
	public void delete(IPiElement element);
	
	/**
	 * Find Category1 for an id
	 * @param idCat1	Category1 id
	 * @return null if not exist
	 */
	public PiCategory1 findCategory1(String idCat1);
	
	/**
	 * Find Category2 for an id
	 * @param idCat2	Category2 id
	 * @param idCat1	Category1 id
	 * @return null if not exist
	 */
	public PiCategory2 findCategory2(String idCat2, String idCat1);
	
	/**
	 * Find Category3 for an id
	 * @param idCat3	Category3 id
	 * @param idCat2	Category2 id
	 * @return null if not exist
	 */
	public PiCategory3 findCategory3(String idCat3, String idCat2);
	
	/**
	 * Find Dimension for a name
	 * @param name	Dimension name
	 * @return null if not exist
	 */
	public PiDimension findDimension(String name);

	/**
	 * Find Field for a name
	 * @param name	Field name
	 * @return null if not exist
	 */
	public PiField findField(String name);
	
}
