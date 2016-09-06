/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.parts;

// Start of user code for imports
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
public interface TimOrganizationUnitPropertiesEditionPart {

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
	 * @return the responsibility
	 * 
	 */
	public String getResponsibility();

	/**
	 * Defines a new responsibility
	 * @param newValue the new responsibility to set
	 * 
	 */
	public void setResponsibility(String newValue);


	/**
	 * @return the authorization
	 * 
	 */
	public String getAuthorization();

	/**
	 * Defines a new authorization
	 * @param newValue the new authorization to set
	 * 
	 */
	public void setAuthorization(String newValue);


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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
