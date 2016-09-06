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
public interface BsmDecisionStructurePropertiesEditionPart {

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
	 * Init the organizations
	 * @param settings settings for the organizations ReferencesTable 
	 */
	public void initOrganizations(ReferencesTableSettings settings);

	/**
	 * Update the organizations
	 * @param newValue the organizations to update
	 * 
	 */
	public void updateOrganizations();

	/**
	 * Adds the given filter to the organizations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOrganizations(ViewerFilter filter);

	/**
	 * Adds the given filter to the organizations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOrganizations(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the organizations table
	 * 
	 */
	public boolean isContainedInOrganizationsTable(EObject element);




	/**
	 * Init the ggGraiGrids
	 * @param settings settings for the ggGraiGrids ReferencesTable 
	 */
	public void initGgGraiGrids(ReferencesTableSettings settings);

	/**
	 * Update the ggGraiGrids
	 * @param newValue the ggGraiGrids to update
	 * 
	 */
	public void updateGgGraiGrids();

	/**
	 * Adds the given filter to the ggGraiGrids edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGgGraiGrids(ViewerFilter filter);

	/**
	 * Adds the given filter to the ggGraiGrids edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGgGraiGrids(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ggGraiGrids table
	 * 
	 */
	public boolean isContainedInGgGraiGridsTable(EObject element);





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
