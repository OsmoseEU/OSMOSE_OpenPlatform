/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;


// End of user code

/**
 * 
 * 
 */
public interface BsmCustomerPropertiesEditionPart {

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
	 * @return the categories
	 * 
	 */
	public String getCategories();

	/**
	 * Defines a new categories
	 * @param newValue the new categories to set
	 * 
	 */
	public void setCategories(String newValue);


	/**
	 * @return the levelOfEducation
	 * 
	 */
	public String getLevelOfEducation();

	/**
	 * Defines a new levelOfEducation
	 * @param newValue the new levelOfEducation to set
	 * 
	 */
	public void setLevelOfEducation(String newValue);


	/**
	 * @return the gender
	 * 
	 */
	public Enumerator getGender();

	/**
	 * Init the gender
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initGender(Object input, Enumerator current);

	/**
	 * Defines a new gender
	 * @param newValue the new gender to set
	 * 
	 */
	public void setGender(Enumerator newValue);


	/**
	 * @return the age
	 * 
	 */
	public String getAge();

	/**
	 * Defines a new age
	 * @param newValue the new age to set
	 * 
	 */
	public void setAge(String newValue);


	/**
	 * @return the annualRevenueRange
	 * 
	 */
	public String getAnnualRevenueRange();

	/**
	 * Defines a new annualRevenueRange
	 * @param newValue the new annualRevenueRange to set
	 * 
	 */
	public void setAnnualRevenueRange(String newValue);


	/**
	 * @return the requirement
	 * 
	 */
	public String getRequirement();

	/**
	 * Defines a new requirement
	 * @param newValue the new requirement to set
	 * 
	 */
	public void setRequirement(String newValue);


	/**
	 * @return the constraint
	 * 
	 */
	public String getConstraint();

	/**
	 * Defines a new constraint
	 * @param newValue the new constraint to set
	 * 
	 */
	public void setConstraint(String newValue);


	/**
	 * @return the targetedUsageFreq
	 * 
	 */
	public String getTargetedUsageFreq();

	/**
	 * Defines a new targetedUsageFreq
	 * @param newValue the new targetedUsageFreq to set
	 * 
	 */
	public void setTargetedUsageFreq(String newValue);





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
