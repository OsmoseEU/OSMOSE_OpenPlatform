/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface TimInformationPropertiesEditionPart {

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
	 * @return the informationEntity
	 * 
	 */
	public String getInformationEntity();

	/**
	 * Defines a new informationEntity
	 * @param newValue the new informationEntity to set
	 * 
	 */
	public void setInformationEntity(String newValue);


	/**
	 * @return the relationShip
	 * 
	 */
	public String getRelationShip();

	/**
	 * Defines a new relationShip
	 * @param newValue the new relationShip to set
	 * 
	 */
	public void setRelationShip(String newValue);




	/**
	 * Init the software
	 * @param settings settings for the software ReferencesTable 
	 */
	public void initSoftware(ReferencesTableSettings settings);

	/**
	 * Update the software
	 * @param newValue the software to update
	 * 
	 */
	public void updateSoftware();

	/**
	 * Adds the given filter to the software edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSoftware(ViewerFilter filter);

	/**
	 * Adds the given filter to the software edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSoftware(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the software table
	 * 
	 */
	public boolean isContainedInSoftwareTable(EObject element);


	/**
	 * @return the serviceSystem
	 * 
	 */
	public String getServiceSystem();

	/**
	 * Defines a new serviceSystem
	 * @param newValue the new serviceSystem to set
	 * 
	 */
	public void setServiceSystem(String newValue);





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
