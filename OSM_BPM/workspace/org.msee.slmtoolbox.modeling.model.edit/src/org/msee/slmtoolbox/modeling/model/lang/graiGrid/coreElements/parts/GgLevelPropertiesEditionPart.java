/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts;

import org.eclipse.emf.common.util.Enumerator;

// Start of user code for imports


// End of user code

/**
 * 
 * 
 */
public interface GgLevelPropertiesEditionPart {

	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);


	/**
	 * @return the code
	 * 
	 */
	public String getCode();

	/**
	 * Defines a new code
	 * @param newValue the new code to set
	 * 
	 */
	public void setCode(String newValue);


	/**
	 * @return the description
	 * 
	 */
	public String getDescription();

	/**
	 * Defines a new description
	 * @param newValue the new description to set
	 * 
	 */
	public void setDescription(String newValue);
	
	/**
	 * @return the hUnit
	 * 
	 */
	public Enumerator getHUnit();

	/**
	 * Init the hUnit
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initHUnit(Object input, Enumerator current);

	/**
	 * Defines a new hUnit
	 * @param newValue the new hUnit to set
	 * 
	 */
	public void setHUnit(Enumerator newValue);


	/**
	 * @return the hValue
	 * 
	 */
	public String getHValue();

	/**
	 * Defines a new hValue
	 * @param newValue the new hValue to set
	 * 
	 */
	public void setHValue(String newValue);


	/**
	 * @return the pUnit
	 * 
	 */
	public Enumerator getPUnit();

	/**
	 * Init the pUnit
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initPUnit(Object input, Enumerator current);

	/**
	 * Defines a new pUnit
	 * @param newValue the new pUnit to set
	 * 
	 */
	public void setPUnit(Enumerator newValue);


	/**
	 * @return the pValue
	 * 
	 */
	public String getPValue();

	/**
	 * Defines a new pValue
	 * @param newValue the new pValue to set
	 * 
	 */
	public void setPValue(String newValue);


	/**
	 * @return the puUnit
	 * 
	 */
	public Enumerator getPuUnit();

	/**
	 * Init the puUnit
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initPuUnit(Object input, Enumerator current);

	/**
	 * Defines a new puUnit
	 * @param newValue the new puUnit to set
	 * 
	 */
	public void setPuUnit(Enumerator newValue);


	/**
	 * @return the puValue
	 * 
	 */
	public String getPuValue();

	/**
	 * Defines a new puValue
	 * @param newValue the new puValue to set
	 * 
	 */
	public void setPuValue(String newValue);


	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
