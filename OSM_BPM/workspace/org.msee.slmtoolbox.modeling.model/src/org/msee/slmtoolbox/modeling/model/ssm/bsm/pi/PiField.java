package org.msee.slmtoolbox.modeling.model.ssm.bsm.pi;


/**
 * Bean DAO for Field
 * @author fto
 *
 */
public class PiField implements IPiElement {
	
	/** Table name */
	public final static String TABLE_NAME = "PI_FIELD";
	
	/** Table field name id  */
	public final static String FIELD_ID = "PFI_ID";
	
	/** Table field name name  */
	public final static String FIELD_NAME = "PFI_NAME";

	/** ID for select without field criteria */
	public static final String ID_ALL = "PFI_ID_ALL";

	/** ID for select with field empty criteria*/
	public static final String ID_EMPTY = "PFI_ID_EMPTY";;
	
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
	public PiField() {
	}
	
	/**
	 * Constructor with param
	 * @param id
	 * @param name
	 */
	public PiField(String id, String name) {
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
        if (null != obj && obj instanceof PiField && null != this.id) {
        	if (null == this.id) {
        		return null == ((PiField)obj).getId();
        	} else {
        		return (this.id.equals(((PiField)obj).getId()));
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
