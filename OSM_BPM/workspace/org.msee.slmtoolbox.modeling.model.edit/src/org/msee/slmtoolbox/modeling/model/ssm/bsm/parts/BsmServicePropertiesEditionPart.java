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
public interface BsmServicePropertiesEditionPart {

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
	 * @return the constraint
	 * 
	 */
	public String getConstraint();

	/**
	 * Defines a new constraint
	 * @param newValue the new constraint to set
	 * 
	 */
	public void setConstraint(String newValue);


	/**
	 * @return the objective
	 * 
	 */
	public String getObjective();

	/**
	 * Defines a new objective
	 * @param newValue the new objective to set
	 * 
	 */
	public void setObjective(String newValue);


	/**
	 * @return the domain
	 * 
	 */
	public String getDomain();

	/**
	 * Defines a new domain
	 * @param newValue the new domain to set
	 * 
	 */
	public void setDomain(String newValue);


	/**
	 * @return the nature
	 * 
	 */
	public String getNature();

	/**
	 * Defines a new nature
	 * @param newValue the new nature to set
	 * 
	 */
	public void setNature(String newValue);




	/**
	 * Init the products
	 * @param settings settings for the products ReferencesTable 
	 */
	public void initProducts(ReferencesTableSettings settings);

	/**
	 * Update the products
	 * @param newValue the products to update
	 * 
	 */
	public void updateProducts();

	/**
	 * Adds the given filter to the products edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProducts(ViewerFilter filter);

	/**
	 * Adds the given filter to the products edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProducts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the products table
	 * 
	 */
	public boolean isContainedInProductsTable(EObject element);




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
	 * Init the customers
	 * @param settings settings for the customers ReferencesTable 
	 */
	public void initCustomers(ReferencesTableSettings settings);

	/**
	 * Update the customers
	 * @param newValue the customers to update
	 * 
	 */
	public void updateCustomers();

	/**
	 * Adds the given filter to the customers edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCustomers(ViewerFilter filter);

	/**
	 * Adds the given filter to the customers edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCustomers(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the customers table
	 * 
	 */
	public boolean isContainedInCustomersTable(EObject element);




	/**
	 * Init the values
	 * @param settings settings for the values ReferencesTable 
	 */
	public void initValues(ReferencesTableSettings settings);

	/**
	 * Update the values
	 * @param newValue the values to update
	 * 
	 */
	public void updateValues();

	/**
	 * Adds the given filter to the values edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToValues(ViewerFilter filter);

	/**
	 * Adds the given filter to the values edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToValues(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the values table
	 * 
	 */
	public boolean isContainedInValuesTable(EObject element);




	/**
	 * Init the stakeholders
	 * @param settings settings for the stakeholders ReferencesTable 
	 */
	public void initStakeholders(ReferencesTableSettings settings);

	/**
	 * Update the stakeholders
	 * @param newValue the stakeholders to update
	 * 
	 */
	public void updateStakeholders();

	/**
	 * Adds the given filter to the stakeholders edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToStakeholders(ViewerFilter filter);

	/**
	 * Adds the given filter to the stakeholders edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToStakeholders(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the stakeholders table
	 * 
	 */
	public boolean isContainedInStakeholdersTable(EObject element);




	/**
	 * Init the partners
	 * @param settings settings for the partners ReferencesTable 
	 */
	public void initPartners(ReferencesTableSettings settings);

	/**
	 * Update the partners
	 * @param newValue the partners to update
	 * 
	 */
	public void updatePartners();

	/**
	 * Adds the given filter to the partners edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPartners(ViewerFilter filter);

	/**
	 * Adds the given filter to the partners edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPartners(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the partners table
	 * 
	 */
	public boolean isContainedInPartnersTable(EObject element);





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
