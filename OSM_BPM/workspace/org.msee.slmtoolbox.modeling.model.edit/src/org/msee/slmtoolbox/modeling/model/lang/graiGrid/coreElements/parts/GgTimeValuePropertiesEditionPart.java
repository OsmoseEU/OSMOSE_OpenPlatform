/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;


// End of user code

/**
 * 
 * 
 */
public interface GgTimeValuePropertiesEditionPart {

	/**
	 * @return the unit
	 * 
	 */
	public Enumerator getUnit();

	/**
	 * Init the unit
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initUnit(Object input, Enumerator current);

	/**
	 * Defines a new unit
	 * @param newValue the new unit to set
	 * 
	 */
	public void setUnit(Enumerator newValue);


	/**
	 * @return the value
	 * 
	 */
	public String getValue();

	/**
	 * Defines a new value
	 * @param newValue the new value to set
	 * 
	 */
	public void setValue(String newValue);





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
