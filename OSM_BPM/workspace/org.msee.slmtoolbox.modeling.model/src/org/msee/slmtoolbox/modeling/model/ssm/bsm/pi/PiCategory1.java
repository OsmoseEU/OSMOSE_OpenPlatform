package org.msee.slmtoolbox.modeling.model.ssm.bsm.pi;

import java.util.ArrayList;
import java.util.List;

/**
 * Bean DAO for Category 1
 * @author fto
 *
 */
public class PiCategory1 implements IPiElement{
	
	/** Table name */
	public final static String TABLE_NAME = "PI_CATEGORY_1";
	
	/** Table field name id  */
	public final static String FIELD_ID = "PC1_ID";
	
	/** Table field name name  */
	public final static String FIELD_NAME = "PC1_NAME";
	
	/** id */
	private String id;
	
	/** name */
	private String name;
	
	/** list of category 2 */
	private List<PiCategory2> category2List;

	/* ******************************
	 * C O N S T R U C T E U R
	 * *****************************/
	/**
	 * Default constructor
	 */
	public PiCategory1() {
		this.category2List = new ArrayList<PiCategory2>();
	}
	
	/**
	 * Constructor with param
	 * @param id
	 * @param name
	 */
	public PiCategory1(String id, String name) {
		this.id = id;
		this.name = name;
		this.category2List = new ArrayList<PiCategory2>();
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
        if (null != obj && obj instanceof PiCategory1) {
        	if (null == this.id) {
        		return null == ((PiCategory1)obj).getId();
        	} else {
        		return (this.id.equals(((PiCategory1)obj).getId()));
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
	 * @return the category2List
	 */
	public List<PiCategory2> getCategory2List() {
		return category2List;
	}

	/**
	 * @param category2List the category2List to set
	 */
	public void setCategory2List(List<PiCategory2> category2List) {
		this.category2List = category2List;
	}
	
}
