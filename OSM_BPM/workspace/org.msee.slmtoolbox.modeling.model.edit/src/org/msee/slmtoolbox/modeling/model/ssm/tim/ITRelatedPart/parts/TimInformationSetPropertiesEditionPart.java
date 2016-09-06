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
public interface TimInformationSetPropertiesEditionPart {

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
	 * Init the entrepriseApplications
	 * @param settings settings for the entrepriseApplications ReferencesTable 
	 */
	public void initEntrepriseApplications(ReferencesTableSettings settings);

	/**
	 * Update the entrepriseApplications
	 * @param newValue the entrepriseApplications to update
	 * 
	 */
	public void updateEntrepriseApplications();

	/**
	 * Adds the given filter to the entrepriseApplications edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEntrepriseApplications(ViewerFilter filter);

	/**
	 * Adds the given filter to the entrepriseApplications edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEntrepriseApplications(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the entrepriseApplications table
	 * 
	 */
	public boolean isContainedInEntrepriseApplicationsTable(EObject element);


	/**
	 * @return the model
	 * 
	 */
	public String getModel();

	/**
	 * Defines a new model
	 * @param newValue the new model to set
	 * 
	 */
	public void setModel(String newValue);





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
