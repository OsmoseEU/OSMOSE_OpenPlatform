/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface BsmResourcePropertiesEditionPart {

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
	public Enumerator getType();

	/**
	 * Init the type
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initType(Object input, Enumerator current);

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * 
	 */
	public void setType(Enumerator newValue);


	/**
	 * @return the role
	 * 
	 */
	public String getRole();

	/**
	 * Defines a new role
	 * @param newValue the new role to set
	 * 
	 */
	public void setRole(String newValue);


	/**
	 * @return the capability
	 * 
	 */
	public String getCapability();

	/**
	 * Defines a new capability
	 * @param newValue the new capability to set
	 * 
	 */
	public void setCapability(String newValue);


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
	 * @return the service
	 * 
	 */
	public EObject getService();

	/**
	 * Init the service
	 * @param settings the combo setting
	 */
	public void initService(EObjectFlatComboSettings settings);

	/**
	 * Defines a new service
	 * @param newValue the new service to set
	 * 
	 */
	public void setService(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setServiceButtonMode(ButtonsModeEnum newValue);

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
	 * @return the organization
	 * 
	 */
	public EObject getOrganization();

	/**
	 * Init the organization
	 * @param settings the combo setting
	 */
	public void initOrganization(EObjectFlatComboSettings settings);

	/**
	 * Defines a new organization
	 * @param newValue the new organization to set
	 * 
	 */
	public void setOrganization(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setOrganizationButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the organization edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOrganization(ViewerFilter filter);

	/**
	 * Adds the given filter to the organization edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOrganization(ViewerFilter filter);




	/**
	 * Init the eaResources
	 * @param settings settings for the eaResources ReferencesTable 
	 */
	public void initEaResources(ReferencesTableSettings settings);

	/**
	 * Update the eaResources
	 * @param newValue the eaResources to update
	 * 
	 */
	public void updateEaResources();

	/**
	 * Adds the given filter to the eaResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEaResources(ViewerFilter filter);

	/**
	 * Adds the given filter to the eaResources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEaResources(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the eaResources table
	 * 
	 */
	public boolean isContainedInEaResourcesTable(EObject element);





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
