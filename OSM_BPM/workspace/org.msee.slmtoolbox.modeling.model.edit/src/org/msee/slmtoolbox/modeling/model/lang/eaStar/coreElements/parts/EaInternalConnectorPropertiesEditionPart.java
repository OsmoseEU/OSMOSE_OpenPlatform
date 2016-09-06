/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface EaInternalConnectorPropertiesEditionPart {

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
	 * @return the organization
	 * 
	 */
	public String getOrganization();

	/**
	 * Defines a new organization
	 * @param newValue the new organization to set
	 * 
	 */
	public void setOrganization(String newValue);




	/**
	 * Init the inFlows
	 * @param settings settings for the inFlows ReferencesTable 
	 */
	public void initInFlows(ReferencesTableSettings settings);

	/**
	 * Update the inFlows
	 * @param newValue the inFlows to update
	 * 
	 */
	public void updateInFlows();

	/**
	 * Adds the given filter to the inFlows edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInFlows(ViewerFilter filter);

	/**
	 * Adds the given filter to the inFlows edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInFlows(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the inFlows table
	 * 
	 */
	public boolean isContainedInInFlowsTable(EObject element);




	/**
	 * Init the outFlows
	 * @param settings settings for the outFlows ReferencesTable 
	 */
	public void initOutFlows(ReferencesTableSettings settings);

	/**
	 * Update the outFlows
	 * @param newValue the outFlows to update
	 * 
	 */
	public void updateOutFlows();

	/**
	 * Adds the given filter to the outFlows edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutFlows(ViewerFilter filter);

	/**
	 * Adds the given filter to the outFlows edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutFlows(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the outFlows table
	 * 
	 */
	public boolean isContainedInOutFlowsTable(EObject element);





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
