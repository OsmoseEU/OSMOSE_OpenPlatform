/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.parts;

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
public interface GraiGridPropertiesEditionPart {

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
	 * Init the levels
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initLevels(ReferencesTableSettings settings);

	/**
	 * Update the levels
	 * @param newValue the levels to update
	 * 
	 */
	public void updateLevels();

	/**
	 * Adds the given filter to the levels edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToLevels(ViewerFilter filter);

	/**
	 * Adds the given filter to the levels edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToLevels(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the levels table
	 * 
	 */
	public boolean isContainedInLevelsTable(EObject element);




	/**
	 * Init the flows
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initFlows(ReferencesTableSettings settings);

	/**
	 * Update the flows
	 * @param newValue the flows to update
	 * 
	 */
	public void updateFlows();

	/**
	 * Adds the given filter to the flows edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFlows(ViewerFilter filter);

	/**
	 * Adds the given filter to the flows edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFlows(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the flows table
	 * 
	 */
	public boolean isContainedInFlowsTable(EObject element);




	/**
	 * Init the nodes
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initNodes(ReferencesTableSettings settings);

	/**
	 * Update the nodes
	 * @param newValue the nodes to update
	 * 
	 */
	public void updateNodes();

	/**
	 * Adds the given filter to the nodes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToNodes(ViewerFilter filter);

	/**
	 * Adds the given filter to the nodes edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToNodes(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the nodes table
	 * 
	 */
	public boolean isContainedInNodesTable(EObject element);




	/**
	 * Init the functions
	 * @param settings settings for the functions ReferencesTable 
	 */
	public void initFunctions(ReferencesTableSettings settings);

	/**
	 * Update the functions
	 * @param newValue the functions to update
	 * 
	 */
	public void updateFunctions();

	/**
	 * Adds the given filter to the functions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFunctions(ViewerFilter filter);

	/**
	 * Adds the given filter to the functions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFunctions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the functions table
	 * 
	 */
	public boolean isContainedInFunctionsTable(EObject element);




	/**
	 * Init the informationSources
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initInformationSources(ReferencesTableSettings settings);

	/**
	 * Update the informationSources
	 * @param newValue the informationSources to update
	 * 
	 */
	public void updateInformationSources();

	/**
	 * Adds the given filter to the informationSources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInformationSources(ViewerFilter filter);

	/**
	 * Adds the given filter to the informationSources edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInformationSources(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the informationSources table
	 * 
	 */
	public boolean isContainedInInformationSourcesTable(EObject element);


	/**
	 * @return the enterprise
	 * 
	 */
	public EObject getEnterprise();

	/**
	 * Init the enterprise
	 * @param settings the combo setting
	 */
	public void initEnterprise(EObjectFlatComboSettings settings);

	/**
	 * Defines a new enterprise
	 * @param newValue the new enterprise to set
	 * 
	 */
	public void setEnterprise(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setEnterpriseButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the enterprise edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToEnterprise(ViewerFilter filter);

	/**
	 * Adds the given filter to the enterprise edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToEnterprise(ViewerFilter filter);





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
