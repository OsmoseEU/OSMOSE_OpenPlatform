/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.parts;

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
public interface TimServicePropertiesEditionPart {

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
	 * @return the access
	 * 
	 */
	public String getAccess();

	/**
	 * Defines a new access
	 * @param newValue the new access to set
	 * 
	 */
	public void setAccess(String newValue);


	/**
	 * @return the consumption
	 * 
	 */
	public String getConsumption();

	/**
	 * Defines a new consumption
	 * @param newValue the new consumption to set
	 * 
	 */
	public void setConsumption(String newValue);


	/**
	 * @return the automationLevel
	 * 
	 */
	public String getAutomationLevel();

	/**
	 * Defines a new automationLevel
	 * @param newValue the new automationLevel to set
	 * 
	 */
	public void setAutomationLevel(String newValue);


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
	 * Init the subServices
	 * @param settings settings for the subServices ReferencesTable 
	 */
	public void initSubServices(ReferencesTableSettings settings);

	/**
	 * Update the subServices
	 * @param newValue the subServices to update
	 * 
	 */
	public void updateSubServices();

	/**
	 * Adds the given filter to the subServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSubServices(ViewerFilter filter);

	/**
	 * Adds the given filter to the subServices edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSubServices(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the subServices table
	 * 
	 */
	public boolean isContainedInSubServicesTable(EObject element);


	/**
	 * @return the mainService
	 * 
	 */
	public EObject getMainService();

	/**
	 * Init the mainService
	 * @param settings the combo setting
	 */
	public void initMainService(EObjectFlatComboSettings settings);

	/**
	 * Defines a new mainService
	 * @param newValue the new mainService to set
	 * 
	 */
	public void setMainService(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setMainServiceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the mainService edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMainService(ViewerFilter filter);

	/**
	 * Adds the given filter to the mainService edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMainService(ViewerFilter filter);




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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
