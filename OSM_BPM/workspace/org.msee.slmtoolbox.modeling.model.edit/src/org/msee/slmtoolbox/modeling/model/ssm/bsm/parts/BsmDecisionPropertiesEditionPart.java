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
public interface BsmDecisionPropertiesEditionPart {

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
	 * @return the horizon
	 * 
	 */
	public String getHorizon();

	/**
	 * Defines a new horizon
	 * @param newValue the new horizon to set
	 * 
	 */
	public void setHorizon(String newValue);


	/**
	 * @return the period
	 * 
	 */
	public String getPeriod();

	/**
	 * Defines a new period
	 * @param newValue the new period to set
	 * 
	 */
	public void setPeriod(String newValue);


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
	 * @return the variable
	 * 
	 */
	public String getVariable();

	/**
	 * Defines a new variable
	 * @param newValue the new variable to set
	 * 
	 */
	public void setVariable(String newValue);


	/**
	 * @return the event
	 * 
	 */
	public String getEvent();

	/**
	 * Defines a new event
	 * @param newValue the new event to set
	 * 
	 */
	public void setEvent(String newValue);


	/**
	 * @return the decisionStructure
	 * 
	 */
	public EObject getDecisionStructure();

	/**
	 * Init the decisionStructure
	 * @param settings the combo setting
	 */
	public void initDecisionStructure(EObjectFlatComboSettings settings);

	/**
	 * Defines a new decisionStructure
	 * @param newValue the new decisionStructure to set
	 * 
	 */
	public void setDecisionStructure(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setDecisionStructureButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the decisionStructure edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDecisionStructure(ViewerFilter filter);

	/**
	 * Adds the given filter to the decisionStructure edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDecisionStructure(ViewerFilter filter);


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
	 * Init the ggDecisionCenters
	 * @param settings settings for the ggDecisionCenters ReferencesTable 
	 */
	public void initGgDecisionCenters(ReferencesTableSettings settings);

	/**
	 * Update the ggDecisionCenters
	 * @param newValue the ggDecisionCenters to update
	 * 
	 */
	public void updateGgDecisionCenters();

	/**
	 * Adds the given filter to the ggDecisionCenters edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGgDecisionCenters(ViewerFilter filter);

	/**
	 * Adds the given filter to the ggDecisionCenters edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGgDecisionCenters(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the ggDecisionCenters table
	 * 
	 */
	public boolean isContainedInGgDecisionCentersTable(EObject element);





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
