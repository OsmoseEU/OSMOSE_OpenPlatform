package tu.org.org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.connexion;

import java.util.ArrayList;
import java.util.List;

import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.IPiElement;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory1;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory2;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiCategory3;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiDimension;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiField;
import org.msee.slmtoolbox.modeling.model.ssm.bsm.pi.PiMetric;
import org.msee.slmtoolbox.modeling.service.data.ssm.bsm.pi.connexion.IPiDaoService;

/**
 * Service for test wizard
 * @author fto
 *
 */
public class TestPiDaoService implements IPiDaoService {
	
	/**
	 * Default constructor
	 */
	public TestPiDaoService() {
	}

	/**
	 * Get all piCcategory1
	 * @return not null
	 */
	public List<PiCategory1> getListCategory1() {
		List<PiCategory1> list1 = new ArrayList<PiCategory1>();
		list1.add(new PiCategory1(null,""));
		for (int i = 1; i<4;i++){
			PiCategory1 cat1 = new PiCategory1(String.valueOf(i), "Category "+i);
			for (int j = 1; j<4;j++){
				PiCategory2 cat2 = new PiCategory2(String.valueOf(j), "Category "+i+"."+j);
				cat2.setCategory1(cat1);
				for (int k = 1; k<4;k++){
					PiCategory3 cat3 = new PiCategory3(String.valueOf(k), "Category "+i+"."+j+"."+k);
					cat3.setCategory2(cat2);
					for (int p = 1; p<4;p++){
						PiMetric metric = new PiMetric(String.valueOf(p), " Metric " + p);
						metric.setCategory3(cat3);
						cat3.getMetricsList().add(metric);
					}
					cat2.getCategory3List().add(cat3);
				}
				cat1.getCategory2List().add(cat2);
			}
			list1.add(cat1);
		}
		
		return list1;
	}

	/**
	 * Get all piCcategory2 for piCategory1
	 * @param piCategory1 
	 * @return not null
	 */
	public List<PiCategory2> getListCategory2(PiCategory1 piCategory1) {
		List<PiCategory2> list2 = new ArrayList<PiCategory2>();
		list2.add(new PiCategory2(null,""));
		list2.addAll(piCategory1.getCategory2List());
		return list2;
	}

	/**
	 * Get all piCcategory3 for piCategory2
	 * @param piCategory2
	 * @return not null
	 */
	public List<PiCategory3> getListCategory3(PiCategory2 piCategory2) {
		List<PiCategory3> list3 = new ArrayList<PiCategory3>();
		list3.add(new PiCategory3(null,""));
		list3.addAll(piCategory2.getCategory3List());
		return list3;
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
		
		if (null != category3 && null != category3.getId()) {
			list.addAll(category3.getMetricsList());
		} else if (null != category2 && null != category2.getId()) {
			for (PiCategory3 temp3 : category2.getCategory3List()) {
				list.addAll(temp3.getMetricsList());
			}
		}  else if (null != category1 && null != category1.getId()) {
			for (PiCategory2 temp2 : category1.getCategory2List()) {
				for (PiCategory3 temp3 : temp2.getCategory3List()) {
					list.addAll(temp3.getMetricsList());
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
		list.add(new PiField("1", "Field 1"));
		list.add(new PiField("2", "Field 2"));
		list.add(new PiField("3", "Field 3"));
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
		list.add(new PiDimension("1", "Dimension 1"));
		list.add(new PiDimension("2", "Dimension 2"));
		list.add(new PiDimension("3", "Dimension 3"));
		return list;
	}

	/**
	 * @return all dimension
	 */
	@Override
	public List<PiDimension> getListDimension() {
		List<PiDimension> list = new ArrayList<PiDimension>();
		list.add(new PiDimension("1", "Dimension 1"));
		list.add(new PiDimension("2", "Dimension 2"));
		list.add(new PiDimension("3", "Dimension 3"));
		return list;
	}
	
	/**
	 * Add (and update object id) or update Metric
	 * @param metric	to add or update
	 */
	public void addOrUpdateMetric(PiMetric metric) {
	}
	

	/**
	 * Delete metric
	 * @param metric	to delete
	 */
	public void deleteMetric(PiMetric metric) {
	}
	
	/**
	 * @param fieldName		field name to find
	 * @return Field with name in param, null if not found
	 */
	public PiField getField(String fieldName) {
		return new PiField("test", fieldName);
	}
	
	/**
	 * Create a field (and update object id)
	 */
	public void addField(PiField field) {
	}

	/**
	 * Add element to data base
	 * @param element
	 */
	public void add(IPiElement element) {
	}

	/**
	 * Delete element to data base
	 * @param element
	 */
	public void delete(IPiElement element) {
	}
	
	/**
	 * Find Category1 for an id
	 * @param idCat1	Category1 id
	 * @return null if not exist
	 */
	public PiCategory1 findCategory1(String idCat1) {
		return null;
	}
	
	/**
	 * Find Category2 for an id
	 * @param idCat2	Category2 id
	 * @param idCat1	Category1 id
	 * @return null if not exist
	 */
	public PiCategory2 findCategory2(String idCat2, String idCat1) {
		return null;
	}
	
	/**
	 * Find Category3 for an id
	 * @param idCat3	Category3 id
	 * @param idCat2	Category2 id
	 * @return null if not exist
	 */
	public PiCategory3 findCategory3(String idCat3, String idCat2) {
		return null;
	}
	
	/**
	 * Find Dimension for an id
	 * @param idDimension	Dimension id
	 * @return null if not exist
	 */
	public PiDimension findDimension(String id) {
		return null;
	}

	/**
	 * Find Field for a name
	 * @param name	Field name
	 * @return null if not exist
	 */
	public PiField findField(String name) {
		return null;
	}

}
