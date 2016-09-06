/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.root.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface GraiGridModelPropertiesEditionPart {

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
	 * Init the graiGrids
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initGraiGrids(ReferencesTableSettings settings);

	/**
	 * Update the graiGrids
	 * @param newValue the graiGrids to update
	 * 
	 */
	public void updateGraiGrids();

	/**
	 * Adds the given filter to the graiGrids edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGraiGrids(ViewerFilter filter);

	/**
	 * Adds the given filter to the graiGrids edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGraiGrids(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the graiGrids table
	 * 
	 */
	public boolean isContainedInGraiGridsTable(EObject element);




	/**
	 * Init the enterprise
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initEnterprise(ReferencesTableSettings settings);

	/**
	 * Update the enterprise
	 * @param newValue the enterprise to update
	 * 
	 */
	public void updateEnterprise();

	/**
	 * Adds the given filter to the enterprise edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEnterprise(ViewerFilter filter);

	/**
	 * Adds the given filter to the enterprise edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEnterprise(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the enterprise table
	 * 
	 */
	public boolean isContainedInEnterpriseTable(EObject element);





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
