/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts;

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
public interface BsmProcessPropertiesEditionPart {

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
	 * @return the trigger
	 * 
	 */
	public String getTrigger();

	/**
	 * Defines a new trigger
	 * @param newValue the new trigger to set
	 * 
	 */
	public void setTrigger(String newValue);


	/**
	 * @return the result
	 * 
	 */
	public String getResult();

	/**
	 * Defines a new result
	 * @param newValue the new result to set
	 * 
	 */
	public void setResult(String newValue);


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
	 * Init the subProcess
	 * @param settings settings for the subProcess ReferencesTable 
	 */
	public void initSubProcess(ReferencesTableSettings settings);

	/**
	 * Update the subProcess
	 * @param newValue the subProcess to update
	 * 
	 */
	public void updateSubProcess();

	/**
	 * Adds the given filter to the subProcess edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSubProcess(ViewerFilter filter);

	/**
	 * Adds the given filter to the subProcess edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSubProcess(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the subProcess table
	 * 
	 */
	public boolean isContainedInSubProcessTable(EObject element);


	/**
	 * @return the mainProcess
	 * 
	 */
	public EObject getMainProcess();

	/**
	 * Init the mainProcess
	 * @param settings the combo setting
	 */
	public void initMainProcess(EObjectFlatComboSettings settings);

	/**
	 * Defines a new mainProcess
	 * @param newValue the new mainProcess to set
	 * 
	 */
	public void setMainProcess(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setMainProcessButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the mainProcess edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMainProcess(ViewerFilter filter);

	/**
	 * Adds the given filter to the mainProcess edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMainProcess(ViewerFilter filter);




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
	 * Init the organizations
	 * @param settings settings for the organizations ReferencesTable 
	 */
	public void initOrganizations(ReferencesTableSettings settings);

	/**
	 * Update the organizations
	 * @param newValue the organizations to update
	 * 
	 */
	public void updateOrganizations();

	/**
	 * Adds the given filter to the organizations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOrganizations(ViewerFilter filter);

	/**
	 * Adds the given filter to the organizations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOrganizations(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the organizations table
	 * 
	 */
	public boolean isContainedInOrganizationsTable(EObject element);


	/**
	 * @return the eaProcess
	 * 
	 */
	public EObject getEaProcess();

	/**
	 * Init the eaProcess
	 * @param settings the combo setting
	 */
	public void initEaProcess(EObjectFlatComboSettings settings);

	/**
	 * Defines a new eaProcess
	 * @param newValue the new eaProcess to set
	 * 
	 */
	public void setEaProcess(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setEaProcessButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the eaProcess edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEaProcess(ViewerFilter filter);

	/**
	 * Adds the given filter to the eaProcess edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEaProcess(ViewerFilter filter);





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
