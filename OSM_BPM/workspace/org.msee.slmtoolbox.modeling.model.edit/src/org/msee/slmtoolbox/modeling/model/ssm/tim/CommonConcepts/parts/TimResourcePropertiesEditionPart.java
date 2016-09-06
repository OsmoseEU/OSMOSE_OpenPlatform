/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface TimResourcePropertiesEditionPart {

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
	 * Init the process
	 * @param settings settings for the process ReferencesTable 
	 */
	public void initProcess(ReferencesTableSettings settings);

	/**
	 * Update the process
	 * @param newValue the process to update
	 * 
	 */
	public void updateProcess();

	/**
	 * Adds the given filter to the process edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProcess(ViewerFilter filter);

	/**
	 * Adds the given filter to the process edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProcess(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the process table
	 * 
	 */
	public boolean isContainedInProcessTable(EObject element);




	/**
	 * Init the service
	 * @param settings settings for the service ReferencesTable 
	 */
	public void initService(ReferencesTableSettings settings);

	/**
	 * Update the service
	 * @param newValue the service to update
	 * 
	 */
	public void updateService();

	/**
	 * Adds the given filter to the service edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToService(ViewerFilter filter);

	/**
	 * Adds the given filter to the service edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToService(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the service table
	 * 
	 */
	public boolean isContainedInServiceTable(EObject element);




	/**
	 * Init the organizationUnit
	 * @param settings settings for the organizationUnit ReferencesTable 
	 */
	public void initOrganizationUnit(ReferencesTableSettings settings);

	/**
	 * Update the organizationUnit
	 * @param newValue the organizationUnit to update
	 * 
	 */
	public void updateOrganizationUnit();

	/**
	 * Adds the given filter to the organizationUnit edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOrganizationUnit(ViewerFilter filter);

	/**
	 * Adds the given filter to the organizationUnit edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOrganizationUnit(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the organizationUnit table
	 * 
	 */
	public boolean isContainedInOrganizationUnitTable(EObject element);


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
