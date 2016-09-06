package org.msee.slmtoolbox.modeling.model.ssm.bsm.pi;

import java.util.ArrayList;
import java.util.List;

/**
 * Bean DAO for Metric
 * @author fto
 *
 */
public class PiMetric implements IPiElement {
	
	/** Table name */
	public final static String TABLE_NAME = "PI_METRIC";
	
	/** Table field name id  */
	public final static String FIELD_ID = "PME_ID";
	
	/** Table field name name  */
	public final static String FIELD_NAME = "PME_NAME";
	
	/** Table field name category3 */
	public final static String FIELD_CATEGORY_3 = "PC3_ID";
	
	/** Table field name dimension */
	public final static String FIELD_DIMENSION = "PME_DIMENSION";
	
	/** Table field name unit */
	public final static String FIELD_UNIT = "PME_UNIT";
	
	/** Table metric field name */
	public final static String TABLE_FIELDS = "PI_METRIC_FIELDS";
	
	/** Table field field */
	public final static String FIELD = "PFI_ID";
	
	
	
	/** id */
	private String id;
	
	/** name */
	private String name;
	
	/** TODO */
	private PiCategory3 category3;

	/** list of field */
	private List<PiField> fieldsList;

	/** list of dimension */
	private PiDimension dimension;
	
	/** unit */
	private String unit;

	/* ******************************
	 * C O N S T R U C T E U R
	 * *****************************/
	/**
	 * Default constructor
	 */
	public PiMetric() {
		this.fieldsList = new ArrayList<PiField>();
	}
	
	/**
	 * Constructor with param
	 * @param id
	 * @param name
	 */
	public PiMetric(String id, String name) {
		this.id = id;
		this.name = name;
		this.fieldsList = new ArrayList<PiField>();
	}
	
	/* ******************************
	 * M E T H O D E S
	 * *****************************/
	public String toString() {
		return this.name;
	}

	public boolean equals(Object obj) {
        if (null != obj && obj instanceof PiMetric && null != this.id) {
        	if (null == this.id) {
        		return null == ((PiMetric)obj).getId();
        	} else {
        		return (this.id.equals(((PiMetric)obj).getId()));
        	}
        } else {
            return false;
        }
    }
	
	/* ******************************
	 * G E T T E R S / S E T T E R S
	 * *****************************/
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the category3
	 */
	public PiCategory3 getCategory3() {
		return category3;
	}

	/**
	 * @param category3 the category3 to set
	 */
	public void setCategory3(PiCategory3 category3) {
		this.category3 = category3;
	}

	/**
	 * @return the fieldsList
	 */
	public List<PiField> getFieldsList() {
		return fieldsList;
	}

	/**
	 * @param fieldsList the fieldsList to set
	 */
	public void setFieldsList(List<PiField> fieldsList) {
		this.fieldsList = fieldsList;
	}

	/**
	 * @return the dimension
	 */
	public PiDimension getDimension() {
		return dimension;
	}

	/**
	 * @param dimension the dimension to set
	 */
	public void setDimension(PiDimension dimension) {
		this.dimension = dimension;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * TODO
	 * @return
	 */
	public String getDescription() {
		StringBuffer buffer = new StringBuffer();
		// Description for category
		if (null != this.getCategory3()) {
			PiCategory3 cat3 = this.getCategory3();
			if (null != cat3.getCategory2()) {
				PiCategory2 cat2 = cat3.getCategory2();
				if (null != cat2.getCategory1()) {
					PiCategory1 cat1 = cat2.getCategory1();
					buffer.append("Category 1: ");
					buffer.append(cat1.toString());
					buffer.append(".\n");
				}
				buffer.append("Category 2: ");
				buffer.append(cat2.toString());
				buffer.append(".\n");
			}
			buffer.append("Category 3: ");
			buffer.append(cat3.toString());
			buffer.append(".\n");
		}

		// Description for dimension
		if(null != this.dimension && null != this.dimension.getId()) {
			buffer.append("Dimension: ");
			buffer.append(this.dimension);
			buffer.append(".\n");
		}
		// Description for fields
		if(null != this.fieldsList && this.fieldsList.size() >0) {
			buffer.append("Field: ");
			buffer.append(getFields());
			buffer.append(".\n");
		}
		// Description for unit
		if(null != this.unit && !"".equals(this.unit)) {
			buffer.append("Unit: ");
			buffer.append(this.unit);
			buffer.append(".\n");
		}
		
		buffer.append(this.name);
		buffer.append(".\n");
		
		return buffer.toString();
	}
	
	/**
	 * TODO
	 * @return
	 */
	public String getFields() {
		StringBuffer buffer = new StringBuffer();
		for (PiField field : this.fieldsList) {
			if (this.fieldsList.indexOf(field)>0) {
				buffer.append(", ");
			}
			buffer.append(field);
		}
		return buffer.toString();
	}
	
}
