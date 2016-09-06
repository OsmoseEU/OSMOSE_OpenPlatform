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
public interface BsmOrganizationPropertiesEditionPart {

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
	public String getType();

	/**
	 * Defines a new type
	 * @param newValue the new type to set
	 * 
	 */
	public void setType(String newValue);


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
	 * Init the decision
	 * @param settings settings for the decision ReferencesTable 
	 */
	public void initDecision(ReferencesTableSettings settings);

	/**
	 * Update the decision
	 * @param newValue the decision to update
	 * 
	 */
	public void updateDecision();

	/**
	 * Adds the given filter to the decision edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDecision(ViewerFilter filter);

	/**
	 * Adds the given filter to the decision edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDecision(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the decision table
	 * 
	 */
	public boolean isContainedInDecisionTable(EObject element);




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
	 * @return the ggEnterprise
	 * 
	 */
	public EObject getGgEnterprise();

	/**
	 * Init the ggEnterprise
	 * @param settings the combo setting
	 */
	public void initGgEnterprise(EObjectFlatComboSettings settings);

	/**
	 * Defines a new ggEnterprise
	 * @param newValue the new ggEnterprise to set
	 * 
	 */
	public void setGgEnterprise(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setGgEnterpriseButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the ggEnterprise edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGgEnterprise(ViewerFilter filter);

	/**
	 * Adds the given filter to the ggEnterprise edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGgEnterprise(ViewerFilter filter);





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
