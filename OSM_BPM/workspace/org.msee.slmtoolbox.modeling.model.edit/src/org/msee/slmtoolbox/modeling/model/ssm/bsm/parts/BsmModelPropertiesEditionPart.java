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
public interface BsmModelPropertiesEditionPart {

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
	 * Init the decisions
	 * @param settings settings for the decisions ReferencesTable 
	 */
	public void initDecisions(ReferencesTableSettings settings);

	/**
	 * Update the decisions
	 * @param newValue the decisions to update
	 * 
	 */
	public void updateDecisions();

	/**
	 * Adds the given filter to the decisions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDecisions(ViewerFilter filter);

	/**
	 * Adds the given filter to the decisions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDecisions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the decisions table
	 * 
	 */
	public boolean isContainedInDecisionsTable(EObject element);




	/**
	 * Init the resources
	 * @param settings settings for the resources ReferencesTable 
	 */
	public void initResources(ReferencesTableSettings settings);

	/**
	 * Update the resources
	 * @param newValue the resources to update
	 * 
	 */
	public void updateResources();

	/**
	 * Adds the given filter to the resources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToResources(ViewerFilter filter);

	/**
	 * Adds the given filter to the resources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToResources(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the resources table
	 * 
	 */
	public boolean isContainedInResourcesTable(EObject element);





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
