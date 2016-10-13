/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;


// End of user code

/**
 * 
 * 
 */
public interface EaSupportFlowPropertiesEditionPart {

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
	 * @return the isTrigger
	 * 
	 */
	public Boolean getIsTrigger();

	/**
	 * Defines a new isTrigger
	 * @param newValue the new isTrigger to set
	 * 
	 */
	public void setIsTrigger(Boolean newValue);


	/**
	 * @return the triggerInfo
	 * 
	 */
	public String getTriggerInfo();

	/**
	 * Defines a new triggerInfo
	 * @param newValue the new triggerInfo to set
	 * 
	 */
	public void setTriggerInfo(String newValue);


	/**
	 * @return the source
	 * 
	 */
	public String getSource();

	/**
	 * Defines a new source
	 * @param newValue the new source to set
	 * 
	 */
	public void setSource(String newValue);


	/**
	 * @return the target
	 * 
	 */
	public String getTarget();

	/**
	 * Defines a new target
	 * @param newValue the new target to set
	 * 
	 */
	public void setTarget(String newValue);


	/**
	 * @return the resourceRole
	 * 
	 */
	public Enumerator getResourceRole();

	/**
	 * Init the resourceRole
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initResourceRole(Object input, Enumerator current);

	/**
	 * Defines a new resourceRole
	 * @param newValue the new resourceRole to set
	 * 
	 */
	public void setResourceRole(Enumerator newValue);


	/**
	 * @return the responsibility
	 * 
	 */
	public String getResponsibility();

	/**
	 * Defines a new responsibility
	 * @param newValue the new responsibility to set
	 * 
	 */
	public void setResponsibility(String newValue);





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