package org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.connexion;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.IPiElement;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory1;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory2;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory3;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiDimension;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiField;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiMetric;
import org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.factory.IPiRequestFactoryDao;
import org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.factory.PiRequestFactoryCategory1;
import org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.factory.PiRequestFactoryCategory2;
import org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.factory.PiRequestFactoryCategory3;
import org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.factory.PiRequestFactoryDimension;
import org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.factory.PiRequestFactoryField;
import org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.factory.PiRequestFactoryMetric;

/**
 * Dao service for PI
 * @author fto
 *
 */
public class PiDaoService extends AbstractDaoService implements IPiDaoService {
	
	/**
	 * Default constructor
	 */
	public PiDaoService() {
		super();
	}

	/**
	 * Get all piCcategory1
	 * @return not null
	 */
	public List<PiCategory1> getListCategory1() {
		List<PiCategory1> list = new ArrayList<PiCategory1>();
		getConnection().connect();
		// test table
		if (isTableExists(PiCategory1.TABLE_NAME)) {
			//create request
			ResultSet result = getConnection().query(
					createQuerySelectAll(PiCategory1.TABLE_NAME, PiCategory1.FIELD_NAME));
			//create result
			if (null != result) {
				try {
					while (result.next()) {
						list.add(new PiCategory1(result.getString(PiCategory1.FIELD_ID), result.getString(PiCategory1.FIELD_NAME)));
					}
				} catch (SQLException e) {
					log.error("Error with SQLite result : "+ e.getMessage());
				}
			}
			
		} else {
			log.error("Error with table : "+ PiCategory1.TABLE_NAME +" not exist ");
		}
		getConnection().close();
		
		return list;
	}

	/**
	 * Get all piCcategory2 for piCategory1
	 * @param piCategory1 
	 * @return not null
	 */
	public List<PiCategory2> getListCategory2(PiCategory1 piCategory1) {
		List<PiCategory2> list = new ArrayList<PiCategory2>();
		getConnection().connect();
		// test table
		if (isTableExists(PiCategory2.TABLE_NAME)) {
			//create request
			ResultSet result = getConnection().query(
					createQuerySelectAll(PiCategory2.TABLE_NAME, PiCategory2.FIELD_NAME, PiCategory2.FIELD_CATEGORY_1, piCategory1.getId()));
			//create result
			if (null != result) {
				try {
					while (result.next()) {
						list.add(new PiCategory2(result.getString(PiCategory2.FIELD_ID), result.getString(PiCategory2.FIELD_NAME)));
					}
				} catch (SQLException e) {
					log.error("Error with SQLite result : "+ e.getMessage());
				}
			}
			
		} else {
			log.error("Error with table : "+ PiCategory2.TABLE_NAME +" not exist ");
		}
		getConnection().close();
		
		return list;
	}

	/**
	 * Get all piCcategory3 for piCategory2
	 * @param piCategory2
	 * @return not null
	 */
	public List<PiCategory3> getListCategory3(PiCategory2 piCategory2) {
		List<PiCategory3> list = new ArrayList<PiCategory3>();
		getConnection().connect();
		// test table
		if (isTableExists(PiCategory3.TABLE_NAME)) {
			//create request
			ResultSet result = getConnection().query(
					createQuerySelectAll(PiCategory3.TABLE_NAME, PiCategory3.FIELD_NAME, PiCategory3.FIELD_CATEGORY_2, piCategory2.getId()));
			//create result
			if (null != result) {
				try {
					while (result.next()) {
						list.add(new PiCategory3(result.getString(PiCategory3.FIELD_ID), result.getString(PiCategory3.FIELD_NAME)));
					}
				} catch (SQLException e) {
					log.error("Error with SQLite result : "+ e.getMessage());
				}
			}
			
		} else {
			log.error("Error with table : "+ PiCategory3.TABLE_NAME +" not exist ");
		}
		getConnection().close();
		
		return list;
	}

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
			PiCategory3 category3, PiDimension dimension, PiField field, String name) {
		List<PiMetric> list = new ArrayList<PiMetric>();
		getConnection().connect();
		if (isTableExists(PiMetric.TABLE_NAME)) {
			//create request
			StringBuffer request = new StringBuffer();
			request.append("select distinct PI_METRIC.* ");
			request.append(" , PI_CATEGORY_3.PC3_ID as ID_CAT_3, PI_CATEGORY_3.PC3_NAME ");
			request.append(" , PI_CATEGORY_2.PC2_ID as ID_CAT_2, PI_CATEGORY_2.PC2_NAME ");
			request.append(" , PI_CATEGORY_1.PC1_ID as ID_CAT_1, PI_CATEGORY_1.PC1_NAME ");
			request.append(" , PI_DIMENSION.* ");
			request.append(" from PI_METRIC");
			request.append(" join PI_CATEGORY_3 on PI_METRIC.PC3_ID = PI_CATEGORY_3.PC3_ID");
			request.append(" join PI_CATEGORY_2 on PI_CATEGORY_3.PC2_ID = PI_CATEGORY_2.PC2_ID");
			request.append(" join PI_CATEGORY_1 on PI_CATEGORY_2.PC1_ID = PI_CATEGORY_1.PC1_ID");
			if(null != field && (null != field.getId() || PiField.ID_ALL.equals(field.getId()))) {
				request.append(" left join PI_METRIC_FIELDS on PI_METRIC.PME_ID = PI_METRIC_FIELDS.PME_ID");
			}
			request.append(" left join PI_DIMENSION on PI_METRIC.PME_DIMENSION = PI_DIMENSION.PDI_ID");
			
			request.append(" WHERE 1=1");
			if(null != category1 && null != category1.getId()) {
				request.append(" AND PI_CATEGORY_2.PC1_ID='"+category1.getId()+"'");
			}
			if(null != category2 && null != category2.getId()) {
				request.append(" AND PI_CATEGORY_3.PC2_ID='"+category2.getId()+"'");
			}
			if(null != category3 && null != category3.getId()) {
				request.append(" AND PI_METRIC.PC3_ID='"+category3.getId()+"'");
			}
			if(null != dimension && null != dimension.getId()) {
				request.append(" AND PI_METRIC.PME_DIMENSION='"+dimension.getId()+"'");
			}
			if(null != field && null != field.getId()) {
				if (PiField.ID_EMPTY.equals(field.getId())) {
					request.append(" AND PI_METRIC_FIELDS.PFI_ID IS NULL");
				} else if (!PiField.ID_ALL.equals(field.getId())) {
					request.append(" AND PI_METRIC_FIELDS.PFI_ID='"+field.getId()+"'");
				}
			}
			if(null != name && !"".equals(name)) {
				request.append(" AND PI_METRIC.PME_NAME LIKE '%"+name+"%'");
			}
			
			ResultSet result = getConnection().query(request.toString());
			//create result
			if (null != result) {
				try {
					while (result.next()) {
						PiMetric temp = new PiMetric(result.getString(PiMetric.FIELD_ID), result.getString(PiMetric.FIELD_NAME));
						temp.setUnit(result.getString(PiMetric.FIELD_UNIT));
						PiCategory3 tempC3 = new PiCategory3(result.getString("ID_CAT_3"), result.getString(PiCategory3.FIELD_NAME));
						PiCategory2 tempC2 = new PiCategory2(result.getString("ID_CAT_2"), result.getString(PiCategory2.FIELD_NAME));
						PiCategory1 tempC1 = new PiCategory1(result.getString("ID_CAT_1"), result.getString(PiCategory1.FIELD_NAME));
						PiDimension tempDim = new PiDimension(result.getString(PiDimension.FIELD_ID), result.getString(PiDimension.FIELD_NAME));
						tempC2.setCategory1(tempC1);
						tempC3.setCategory2(tempC2);
						temp.setCategory3(tempC3);
						temp.setDimension(tempDim);
						list.add(temp);
					}
				} catch (SQLException e) {
					log.error("Error with SQLite result : "+ e.getMessage());
				}
			}
			// complete data
			for (PiMetric metric:list) {
				metric.setFieldsList(getListPiField(metric));
			}
			
		} else {
			log.error("Error with table : "+ PiCategory3.TABLE_NAME +" not exist ");
		}
		getConnection().close();
		
		return list;
	}

	/**
	 * @param metric
	 * @return get all field for a metric
	 */
	private List<PiField> getListPiField(PiMetric metric) {
		List<PiField> list = new ArrayList<PiField>();
		if (isTableExists(PiField.TABLE_NAME)) {
			//create request
			String request = "select distinct PI_FIELD.* "
					+ " from PI_FIELD join PI_METRIC_FIELDS"
					+ " on PI_FIELD.PFI_ID = PI_METRIC_FIELDS.PFI_ID" 
					+ " where PI_METRIC_FIELDS.PME_ID ='"+ metric.getId() +"'"
					+ " order by PI_FIELD.PFI_NAME";

			ResultSet result = getConnection().query(request);
			//create result
			if (null != result) {
				try {
					while (result.next()) {
						list.add(new PiField(result.getString(PiField.FIELD_ID), result.getString(PiField.FIELD_NAME)));
					}
				} catch (SQLException e) {
					log.error("Error with SQLite result : "+ e.getMessage());
				}
			}
		}
		return list;
	}

	/**
	 * Get all field filter with param
	 * @param category1		can be null
	 * @param category2		can be null
	 * @param category3		can be null
	 * @return all field filer with param
	 */
	public List<PiField> getListField(PiCategory1 category1,
			PiCategory2 category2, PiCategory3 category3) {
		List<PiField> list = new ArrayList<PiField>();
		getConnection().connect();
		if (isTableExists(PiMetric.TABLE_NAME)) {
			//create request
			StringBuffer request = new StringBuffer();
			request.append("select distinct PI_FIELD.* ");
			request.append(" from PI_METRIC");
			request.append(" join PI_CATEGORY_3 on PI_METRIC.PC3_ID = PI_CATEGORY_3.PC3_ID");
			request.append(" join PI_CATEGORY_2 on PI_CATEGORY_3.PC2_ID = PI_CATEGORY_2.PC2_ID");
			request.append(" join PI_METRIC_FIELDS on PI_METRIC.PME_ID = PI_METRIC_FIELDS.PME_ID");
			request.append(" join PI_FIELD on PI_METRIC_FIELDS.PFI_ID = PI_FIELD.PFI_ID");
			
			request.append(" WHERE 1=1");
			if(null != category1 && null != category1.getId()) {
				request.append(" AND PI_CATEGORY_2.PC1_ID='"+category1.getId()+"'");
			}
			if(null != category2 && null != category2.getId()) {
				request.append(" AND PI_CATEGORY_3.PC2_ID='"+category2.getId()+"'");
			}
			if(null != category3 && null != category3.getId()) {
				request.append(" AND PI_METRIC.PC3_ID='"+category3.getId()+"'");
			}
			request.append(" order by PI_FIELD.PFI_NAME");
			
			ResultSet result = getConnection().query(request.toString());
			//create result
			if (null != result) {
				try {
					while (result.next()) {
						PiField temp = new PiField(result.getString(PiField.FIELD_ID), result.getString(PiField.FIELD_NAME)); 
						list.add(temp);
					}
				} catch (SQLException e) {
					log.error("Error with SQLite result : "+ e.getMessage());
				}
			}
			
		} else {
			log.error("Error with table : "+ PiCategory3.TABLE_NAME +" not exist ");
		}
		getConnection().close();
		
		return list;
	}

	/**
	 * Get all dimension filer with param
	 * @param category1		can be null
	 * @param category2		can be null
	 * @param category3		can be null
	 * @return all dimension filer with param
	 */
	public List<PiDimension> getListDimension(PiCategory1 category1,
			PiCategory2 category2, PiCategory3 category3) {
		List<PiDimension> list = new ArrayList<PiDimension>();
		getConnection().connect();
		if (isTableExists(PiMetric.TABLE_NAME)) {
			//create request
			StringBuffer request = new StringBuffer();
			request.append("select distinct PI_DIMENSION.* ");
			request.append(" from PI_METRIC");
			request.append(" join PI_CATEGORY_3 on  PI_METRIC.PC3_ID = PI_CATEGORY_3.PC3_ID");
			request.append(" join PI_CATEGORY_2 on  PI_CATEGORY_3.PC2_ID = PI_CATEGORY_2.PC2_ID");
			request.append(" join PI_DIMENSION on PI_METRIC.PME_DIMENSION = PI_DIMENSION.PDI_ID");
			
			request.append(" WHERE 1=1");
			if(null != category1 && null != category1.getId()) {
				request.append(" AND PI_CATEGORY_2.PC1_ID='"+category1.getId()+"'");
			}
			if(null != category2 && null != category2.getId()) {
				request.append(" AND PI_CATEGORY_3.PC2_ID='"+category2.getId()+"'");
			}
			if(null != category3 && null != category3.getId()) {
				request.append(" AND PI_METRIC.PC3_ID='"+category3.getId()+"'");
			}
			request.append(" order by PI_DIMENSION.PDI_NAME");
			
			ResultSet result = getConnection().query(request.toString());
			//create result
			if (null != result) {
				try {
					while (result.next()) {
						PiDimension temp = new PiDimension(result.getString(PiDimension.FIELD_ID), result.getString(PiDimension.FIELD_NAME)); 
						list.add(temp);
					}
				} catch (SQLException e) {
					log.error("Error with SQLite result : "+ e.getMessage());
				}
			}
			
		} else {
			log.error("Error with table : "+ PiCategory3.TABLE_NAME +" not exist ");
		}
		getConnection().close();
		
		return list;
	}
	
	/**
	 * @return all dimension
	 */
	public List<PiDimension> getListDimension() {
		List<PiDimension> list = new ArrayList<PiDimension>();
		getConnection().connect();
		if (isTableExists(PiDimension.TABLE_NAME)) {
			//create request
			ResultSet result = getConnection().query(
					createQuerySelectAll(PiDimension.TABLE_NAME, PiDimension.FIELD_NAME));
			
			//create result
			if (null != result) {
				try {
					while (result.next()) {
						PiDimension temp = new PiDimension(result.getString(PiDimension.FIELD_ID), result.getString(PiDimension.FIELD_NAME)); 
						list.add(temp);
					}
				} catch (SQLException e) {
					log.error("Error with SQLite result : "+ e.getMessage());
				}
			}
			
		} else {
			log.error("Error with table : "+ PiCategory3.TABLE_NAME +" not exist ");
		}
		getConnection().close();
		
		return list;
	}
	
	/**
	 * Add (and update object id) or update Metric
	 * @param metric	to add or update
	 */
	public void addOrUpdateMetric(PiMetric metric) {
		getConnection().connect();
		if (isTableExists(PiMetric.TABLE_NAME)) {
			// define an update or insert
			boolean createData = (null == metric.getId());
			//create request
			if (createData) {
				// define new id
				metric.setId("METRIC_" + UUID.randomUUID().toString());
				// create request
				String request = createRequestToInsert(metric);
				// insert metric
				getConnection().insert(request);
				// add metric field
				addMetricFeild(metric);
			} else {
				// create request
				String request = createRequestToUpdate(metric);
				// update metric
				getConnection().update(request);
				// remove all metric field
				deleteMetricField(metric);
				// add metric field
				addMetricFeild(metric);
			}

		} else {
			log.error("Error with table : "+ PiCategory3.TABLE_NAME +" not exist ");
		}
		getConnection().close();
	}

	/**
	 * Create request for update metric in DB
	 * @param metric	metric to update in DB
	 * @return request
	 */
	private String createRequestToUpdate(PiMetric metric) {
		StringBuffer request = new StringBuffer();
		// for update
		request.append("UPDATE ");
		request.append(PiMetric.TABLE_NAME);
		request.append(" SET ");
		// name
		request.append(PiMetric.FIELD_NAME);
		request.append("='");
		request.append(metric.getName());
		// category 3
		request.append("', ");
		request.append(PiMetric.FIELD_CATEGORY_3);
		request.append("='");
		request.append(metric.getCategory3().getId());
		// dimension
		request.append("', ");
		request.append(PiMetric.FIELD_DIMENSION);
		request.append("='");
		if (null != metric.getDimension()) {
			request.append(metric.getDimension().getId());
		} else {
			request.append("null");
		}
		// unit
		request.append("', ");
		request.append(PiMetric.FIELD_UNIT);
		request.append("='");
		request.append(metric.getUnit());
		request.append("' ");
		
		request.append("WHERE ");
		request.append(PiMetric.FIELD_ID);
		request.append("='");
		request.append(metric.getId());
		request.append("';");
		return request.toString();
	}

	/**
	 * Create request for insert metric in DB
	 * @param metric	metric to insert in DB
	 * @return request
	 */
	private String createRequestToInsert(PiMetric metric) {
		StringBuffer request = new StringBuffer();
		request.append("INSERT INTO PI_METRIC (PME_ID,PME_NAME,PC3_ID,PME_DIMENSION,PME_UNIT) VALUES('");
		request.append(metric.getId());
		request.append("','");
		request.append(metric.getName());
		request.append("','");
		request.append(metric.getCategory3().getId());
		request.append("','");
		if (null != metric.getDimension()) {
			request.append(metric.getDimension().getId());
		} else {
			request.append("null");
		}
		request.append("','");
		request.append(metric.getUnit());
		request.append("' );");
		return request.toString();
	}

	/**
	 * Delete metric
	 * @param metric	to delete
	 */
	public void deleteMetric(PiMetric metric) {
		getConnection().connect();
		
		// delete all Metric field
		deleteMetricField(metric);
		// delete Metric
		getConnection().update("DELETE FROM PI_METRIC WHERE PME_ID='"+ metric.getId() +"'");
		
		getConnection().close();
		
	}
	
	/**
	 * Add all field to metric
	 * @param metric	metric source
	 */
	private void addMetricFeild(PiMetric metric) {
		if (null != metric.getFieldsList()) {
			String baseRequest = "INSERT INTO PI_METRIC_FIELDS (PME_ID,PFI_ID) VALUES('";
			// for all field
			for (PiField field : metric.getFieldsList()) {
				// create request
				StringBuffer request = new StringBuffer(baseRequest);
				request.append(metric.getId());
				request.append("','");
				request.append(field.getId());
				request.append("' );");
				// insert data
				getConnection().insert(request.toString());
			}
		}
	}
	
	/**
	 * Delete all Metric field
	 * @param metric 	metric target
	 */
	private void deleteMetricField(PiMetric metric) {
		getConnection().update("DELETE FROM PI_METRIC_FIELDS WHERE PME_ID='"+ metric.getId() +"'");
	}

	/**
	 * @param fieldName		field name to find
	 * @return Field with name in param, null if not found
	 */
	public PiField getField(String fieldName) {
		PiField field = null;
		getConnection().connect();
		if (isTableExists(PiField.TABLE_NAME)) {
			//create request
			String request = "select PI_FIELD.* "
					+ " from PI_FIELD" 
					+ " where PFI_NAME ='"+ fieldName +"'";

			ResultSet result = getConnection().query(request);
			//create result
			if (null != result) {
				try {
					while (result.next()) {
						field = new PiField(result.getString(PiField.FIELD_ID), result.getString(PiField.FIELD_NAME));
					}
				} catch (SQLException e) {
					log.error("Error with SQLite result : "+ e.getMessage());
				}
			}
		}
		getConnection().close();
		return field;
	}

	/**
	 * Add element to data base
	 * @param element
	 */
	public void add(IPiElement element) {
		getConnection().connect();
		IPiRequestFactoryDao requestFactory = getRequestFactory(element);
		if (null != requestFactory) {
			List<String> addAllRequest = requestFactory.createRequestAdd(element, true);
			for (String addRequest : addAllRequest) {
				getConnection().insert(addRequest);
			}
		}
		getConnection().close();
	}

	/**
	 * Delete element to data base
	 * @param element
	 */
	public void delete(IPiElement element) {
		getConnection().connect();
		IPiRequestFactoryDao requestFactory = getRequestFactory(element);
		if (null != requestFactory) {
			List<String> deleteAllRequest = requestFactory.createRequestDelete(element);
			for (String deleteRequest : deleteAllRequest) {
				getConnection().update(deleteRequest);
			}
		}
		getConnection().close();
		
	}

	/**
	 * Get a request factory for element
	 * @param element
	 * @return null if not found
	 */
	private IPiRequestFactoryDao getRequestFactory(IPiElement element) {
		if (element instanceof PiCategory1) {
			return new PiRequestFactoryCategory1();
		} else if (element instanceof PiCategory2) {
			return new PiRequestFactoryCategory2();
		} else if (element instanceof PiCategory3) {
			return new PiRequestFactoryCategory3();
		} else if (element instanceof PiDimension) {
			return new PiRequestFactoryDimension();
		} else if (element instanceof PiField) {
			return new PiRequestFactoryField();
		} else if (element instanceof PiMetric) {
			return new PiRequestFactoryMetric();
		} else {
			return null;
		}
	}
	
	/**
	 * Find Category1 for an id
	 * @param idCat1	Category1 id
	 * @return null if not exist
	 */
	public PiCategory1 findCategory1(String idCat1) {
		getConnection().connect();
		IPiRequestFactoryDao requestFactory = new PiRequestFactoryCategory1();
		
		ResultSet result = getConnection().query(requestFactory.createRequestFind(idCat1, null));
		//create result
		PiCategory1 element = null;
		if (null != result) {
			try {
				if (result.next()) {
					element = new PiCategory1(result.getString(PiCategory1.FIELD_ID), result.getString(PiCategory1.FIELD_NAME));
				}
			} catch (SQLException e) {
				log.error("Error with SQLite result : "+ e.getMessage());
			}
		}
		getConnection().close();
		return element;
	}
	
	/**
	 * Find Category2 for an id
	 * @param idCat2	Category2 id
	 * @param idCat1	Category1 id
	 * @return null if not exist
	 */
	public PiCategory2 findCategory2(String idCat2, String idCat1) {
		getConnection().connect();
		IPiRequestFactoryDao requestFactory = new PiRequestFactoryCategory2();
		
		ResultSet result = getConnection().query(requestFactory.createRequestFind(idCat2,idCat1));
		//create result
		PiCategory2 element = null;
		if (null != result) {
			try {
				if (result.next()) {
					element = new PiCategory2(result.getString(PiCategory2.FIELD_ID), result.getString(PiCategory2.FIELD_NAME));
				}
			} catch (SQLException e) {
				log.error("Error with SQLite result : "+ e.getMessage());
			}
		}
		getConnection().close();
		return element;
	}
	
	/**
	 * Find Category3 for an id
	 * @param idCat3	Category3 id
	 * @param idCat2	Category2 id
	 * @return null if not exist
	 */
	public PiCategory3 findCategory3(String idCat3, String idCat2) {
		getConnection().connect();
		IPiRequestFactoryDao requestFactory = new PiRequestFactoryCategory3();
		
		ResultSet result = getConnection().query(requestFactory.createRequestFind(idCat3,idCat2));
		//create result
		PiCategory3 element = null;
		if (null != result) {
			try {
				if (result.next()) {
					element = new PiCategory3(result.getString(PiCategory3.FIELD_ID), result.getString(PiCategory3.FIELD_NAME));
				}
			} catch (SQLException e) {
				log.error("Error with SQLite result : "+ e.getMessage());
			}
		}
		getConnection().close();
		return element;
	}
	
	/**
	 * Find Dimension for a name
	 * @param name	Dimension name
	 * @return null if not exist
	 */
	public PiDimension findDimension(String name) {
		getConnection().connect();
		PiRequestFactoryDimension requestFactory = new PiRequestFactoryDimension();
		
		ResultSet result = getConnection().query(requestFactory.createRequestFindByName(name));
		//create result
		PiDimension element = null;
		if (null != result) {
			try {
				if (result.next()) {
					element = new PiDimension(result.getString(PiDimension.FIELD_ID), result.getString(PiDimension.FIELD_NAME));
				}
			} catch (SQLException e) {
				log.error("Error with SQLite result : "+ e.getMessage());
			}
		}
		getConnection().close();
		return element;
	}

	/**
	 * Find Field for a name
	 * @param name	Field name
	 * @return null if not exist
	 */
	public PiField findField(String name) {
		getConnection().connect();
		PiRequestFactoryField requestFactory = new PiRequestFactoryField();
		
		ResultSet result = getConnection().query(requestFactory.createRequestFindByName(name));
		//create result
		PiField element = null;
		if (null != result) {
			try {
				if (result.next()) {
					element = new PiField(result.getString(PiField.FIELD_ID), result.getString(PiField.FIELD_NAME));
				}
			} catch (SQLException e) {
				log.error("Error with SQLite result : "+ e.getMessage());
			}
		}
		getConnection().close();
		return element;
	}

}
