package org.msee.slmtoolbox.modeling.model.ssm.bsm.pi;

import java.util.ArrayList;
import java.util.List;

/**
 * Bean DAO for Category 2
 * @author fto
 *
 */
public class PiCategory2 implements IPiElement {

	/** Table name */
	public final static String TABLE_NAME = "PI_CATEGORY_2";
	
	/** Table field name id  */
	public final static String FIELD_ID = "PC2_ID";
	
	/** Table field name name  */
	public final static String FIELD_NAME = "PC2_NAME";
	
	/** Table field name category1 */
	public final static String FIELD_CATEGORY_1 = "PC1_ID";
	
	/** id */
	private String id;
	
	/** name */
	private String name;
	
	/** list of category 3 */
	private List<PiCategory3> category3List;

	/** Parent element */
	private PiCategory1 category1;

	/* ******************************
	 * C O N S T R U C T E U R
	 * *****************************/
	/**
	 * Default constructor
	 */
	public PiCategory2() {
		this.category3List = new ArrayList<PiCategory3>();
	}
	
	/**
	 * Constructor with param
	 * @param id
	 * @param name
	 */
	public PiCategory2(String id, String name) {
		this.id = id;
		this.name = name;
		this.category3List = new ArrayList<PiCategory3>();
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
        if (null != obj && obj instanceof PiCategory2) {
        	if (null == this.id) {
        		return null == ((PiCategory2)obj).getId();
        	} else {
        		return (this.id.equals(((PiCategory2)obj).getId()));
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
	 * @return the category3List
	 */
	public List<PiCategory3> getCategory3List() {
		return category3List;
	}

	/**
	 * @param category3List the category3List to set
	 */
	public void setCategory3List(List<PiCategory3> category3List) {
		this.category3List = category3List;
	}

	/**
	 * @return the category1
	 */
	public PiCategory1 getCategory1() {
		return category1;
	}

	/**
	 * @param category1 the category1 to set
	 */
	public void setCategory1(PiCategory1 category1) {
		this.category1 = category1;
	}
	
	
}
