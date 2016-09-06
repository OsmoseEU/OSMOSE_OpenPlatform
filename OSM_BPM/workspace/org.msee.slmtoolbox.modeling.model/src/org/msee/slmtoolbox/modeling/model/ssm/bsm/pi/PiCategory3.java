package org.msee.slmtoolbox.modeling.model.ssm.bsm.pi;

import java.util.ArrayList;
import java.util.List;

/**
 * Bean DAO for Category 3
 * @author fto
 *
 */
public class PiCategory3 implements IPiElement {
	
	/** Table name */
	public final static String TABLE_NAME = "PI_CATEGORY_3";
	
	/** Table field name id  */
	public final static String FIELD_ID = "PC3_ID";
	
	/** Table field name name  */
	public final static String FIELD_NAME = "PC3_NAME";
	
	/** Table field name category2 */
	public final static String FIELD_CATEGORY_2 = "PC2_ID";
	
	/** id */
	private String id;
	
	/** name */
	private String name;
	
	/** list of metric */
	private List<PiMetric> metricsList;
	
	/** Parent element */
	private PiCategory2 category2;

	/* ******************************
	 * C O N S T R U C T E U R
	 * *****************************/
	/**
	 * Default constructor
	 */
	public PiCategory3() {
		this.metricsList = new ArrayList<PiMetric>();
	}
	
	/**
	 * Constructor with param
	 * @param id
	 * @param name
	 */
	public PiCategory3(String id, String name) {
		this.id = id;
		this.name = name;
		this.metricsList = new ArrayList<PiMetric>();
	}
	
	/* ******************************
	 * M E T H O D E S
	 * *****************************/
	public String toString() {
		if (null != this.id && ! "".equals(this.id)) {
			return this.id + "-" + this.name;
		} else {
			return this.name;
		}
	}
	
	public boolean equals(Object obj) {
        if (null != obj && obj instanceof PiCategory3) {
        	if (null == this.id) {
        		return null == ((PiCategory3)obj).getId();
        	} else {
        		return (this.id.equals(((PiCategory3)obj).getId()));
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
	 * @return the metricsList
	 */
	public List<PiMetric> getMetricsList() {
		return metricsList;
	}

	/**
	 * @param metricsList the metricsList to set
	 */
	public void setMetricsList(List<PiMetric> metricsList) {
		this.metricsList = metricsList;
	}

	/**
	 * @return the category2
	 */
	public PiCategory2 getCategory2() {
		return category2;
	}

	/**
	 * @param category2 the category2 to set
	 */
	public void setCategory2(PiCategory2 category2) {
		this.category2 = category2;
	}
	
}
