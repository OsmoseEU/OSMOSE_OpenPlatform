package org.msee.slmtoolbox.modeling.model.ssm.bsm.pi;

/**
 * Bean DAO for Dimension
 * @author fto
 *
 */
public class PiDimension implements IPiElement {
	
	/** Table name */
	public final static String TABLE_NAME = "PI_DIMENSION";
	
	/** Table field name id  */
	public final static String FIELD_ID = "PDI_ID";
	
	/** Table field name name  */
	public final static String FIELD_NAME = "PDI_NAME";
	
	/** id */
	private String id;
	
	/** name */
	private String name;

	/* ******************************
	 * C O N S T R U C T E U R
	 * *****************************/
	/**
	 * Default constructor
	 */
	public PiDimension() {
	}
	
	/**
	 * Constructor with param
	 * @param id
	 * @param name
	 */
	public PiDimension(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	/* ******************************
	 * M E T H O D E S
	 * *****************************/
	public String toString() {
		return this.name;
	}
	
	public boolean equals(Object obj) {
        if (null != obj && obj instanceof PiDimension) {
        	if (null == this.id) {
        		return null == ((PiDimension)obj).getId();
        	} else {
        		return (this.id.equals(((PiDimension)obj).getId()));
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

}
