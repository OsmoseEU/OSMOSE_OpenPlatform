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
public interface BsmVirtualEnterprisePropertiesEditionPart {

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
	 * Init the processes
	 * @param settings settings for the processes ReferencesTable 
	 */
	public void initProcesses(ReferencesTableSettings settings);

	/**
	 * Update the processes
	 * @param newValue the processes to update
	 * 
	 */
	public void updateProcesses();

	/**
	 * Adds the given filter to the processes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProcesses(ViewerFilter filter);

	/**
	 * Adds the given filter to the processes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProcesses(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the processes table
	 * 
	 */
	public boolean isContainedInProcessesTable(EObject element);




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
	 * Init the decisionStructures
	 * @param settings settings for the decisionStructures ReferencesTable 
	 */
	public void initDecisionStructures(ReferencesTableSettings settings);

	/**
	 * Update the decisionStructures
	 * @param newValue the decisionStructures to update
	 * 
	 */
	public void updateDecisionStructures();

	/**
	 * Adds the given filter to the decisionStructures edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDecisionStructures(ViewerFilter filter);

	/**
	 * Adds the given filter to the decisionStructures edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDecisionStructures(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the decisionStructures table
	 * 
	 */
	public boolean isContainedInDecisionStructuresTable(EObject element);




	/**
	 * Init the ggOrganizations
	 * @param settings settings for the ggOrganizations ReferencesTable 
	 */
	public void initGgOrganizations(ReferencesTableSettings settings);

	/**
	 * Update the ggOrganizations
	 * @param newValue the ggOrganizations to update
	 * 
	 */
	public void updateGgOrganizations();

	/**
	 * Adds the given filter to the ggOrganizations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGgOrganizations(ViewerFilter filter);

	/**
	 * Adds the given filter to the ggOrganizations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGgOrganizations(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ggOrganizations table
	 * 
	 */
	public boolean isContainedInGgOrganizationsTable(EObject element);




	/**
	 * Init the eaOrganizations
	 * @param settings settings for the eaOrganizations ReferencesTable 
	 */
	public void initEaOrganizations(ReferencesTableSettings settings);

	/**
	 * Update the eaOrganizations
	 * @param newValue the eaOrganizations to update
	 * 
	 */
	public void updateEaOrganizations();

	/**
	 * Adds the given filter to the eaOrganizations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEaOrganizations(ViewerFilter filter);

	/**
	 * Adds the given filter to the eaOrganizations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEaOrganizations(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the eaOrganizations table
	 * 
	 */
	public boolean isContainedInEaOrganizationsTable(EObject element);




	/**
	 * Init the mseService
	 * @param settings settings for the mseService ReferencesTable 
	 */
	public void initMseService(ReferencesTableSettings settings);

	/**
	 * Update the mseService
	 * @param newValue the mseService to update
	 * 
	 */
	public void updateMseService();

	/**
	 * Adds the given filter to the mseService edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMseService(ViewerFilter filter);

	/**
	 * Adds the given filter to the mseService edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMseService(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the mseService table
	 * 
	 */
	public boolean isContainedInMseServiceTable(EObject element);


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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
