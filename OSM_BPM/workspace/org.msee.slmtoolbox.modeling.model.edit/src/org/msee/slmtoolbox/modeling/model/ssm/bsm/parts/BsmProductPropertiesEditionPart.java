/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface BsmProductPropertiesEditionPart {

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
	 * @return the type
	 * 
	 */
	public String getType();

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * 
	 */
	public void setType(String newValue);


	/**
	 * @return the function
	 * 
	 */
	public String getFunction();

	/**
	 * Defines a new function
	 * @param newValue the new function to set
	 * 
	 */
	public void setFunction(String newValue);


	/**
	 * @return the techCharacteristics
	 * 
	 */
	public String getTechCharacteristics();

	/**
	 * Defines a new techCharacteristics
	 * @param newValue the new techCharacteristics to set
	 * 
	 */
	public void setTechCharacteristics(String newValue);




	/**
	 * Init the functionalities
	 * @param settings settings for the functionalities ReferencesTable 
	 */
	public void initFunctionalities(ReferencesTableSettings settings);

	/**
	 * Update the functionalities
	 * @param newValue the functionalities to update
	 * 
	 */
	public void updateFunctionalities();

	/**
	 * Adds the given filter to the functionalities edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFunctionalities(ViewerFilter filter);

	/**
	 * Adds the given filter to the functionalities edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFunctionalities(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the functionalities table
	 * 
	 */
	public boolean isContainedInFunctionalitiesTable(EObject element);





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
