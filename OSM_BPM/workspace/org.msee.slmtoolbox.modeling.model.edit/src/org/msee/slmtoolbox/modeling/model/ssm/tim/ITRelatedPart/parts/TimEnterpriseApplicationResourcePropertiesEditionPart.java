/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts;

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
public interface TimEnterpriseApplicationResourcePropertiesEditionPart {

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
	 * @return the organizationUnit
	 * 
	 */
	public EObject getOrganizationUnit();

	/**
	 * Init the organizationUnit
	 * @param settings the combo setting
	 */
	public void initOrganizationUnit(EObjectFlatComboSettings settings);

	/**
	 * Defines a new organizationUnit
	 * @param newValue the new organizationUnit to set
	 * 
	 */
	public void setOrganizationUnit(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setOrganizationUnitButtonMode(ButtonsModeEnum newValue);

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
	 * Init the services
	 * @param settings settings for the services ReferencesTable 
	 */
	public void initServices(ReferencesTableSettings settings);

	/**
	 * Update the services
	 * @param newValue the services to update
	 * 
	 */
	public void updateServices();

	/**
	 * Adds the given filter to the services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the services edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the services table
	 * 
	 */
	public boolean isContainedInServicesTable(EObject element);


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
	 * @return the functionality
	 * 
	 */
	public String getFunctionality();

	/**
	 * Defines a new functionality
	 * @param newValue the new functionality to set
	 * 
	 */
	public void setFunctionality(String newValue);


	/**
	 * @return the characteristics
	 * 
	 */
	public String getCharacteristics();

	/**
	 * Defines a new characteristics
	 * @param newValue the new characteristics to set
	 * 
	 */
	public void setCharacteristics(String newValue);




	/**
	 * Init the informations
	 * @param settings settings for the informations ReferencesTable 
	 */
	public void initInformations(ReferencesTableSettings settings);

	/**
	 * Update the informations
	 * @param newValue the informations to update
	 * 
	 */
	public void updateInformations();

	/**
	 * Adds the given filter to the informations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInformations(ViewerFilter filter);

	/**
	 * Adds the given filter to the informations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInformations(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the informations table
	 * 
	 */
	public boolean isContainedInInformationsTable(EObject element);





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
