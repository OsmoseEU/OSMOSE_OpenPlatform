/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts;

import org.eclipse.jface.viewers.ViewerFilter;

// Start of user code for imports


// End of user code

/**
 * 
 * 
 */
public interface EaProcessPropertiesEditionPart {

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
	 * @return the decompositionCode
	 * 
	 */
	public String getDecompositionCode();

	/**
	 * Defines a new decompositionCode
	 * @param newValue the new decompositionCode to set
	 * 
	 */
	public void setDecompositionCode(String newValue);


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
	 * @return the osmioticProcess
	 * 
	 */
	public Object getOsmioticProcess();

	/**
	 * Init the osmioticProcess
	 * @param input choice of values
	 * @param currentValue the current value
	 */
	public void initOsmioticProcess(Object input, Object currentValue);

	/**
	 * Defines a new osmioticProcess
	 * @param newValue the new osmioticProcess to set
	 * 
	 */
	public void setOsmioticProcess(Object newValue);

	/**
	 * Adds the given filter to the osmioticProcess edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOsmioticProcess(ViewerFilter filter);



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
