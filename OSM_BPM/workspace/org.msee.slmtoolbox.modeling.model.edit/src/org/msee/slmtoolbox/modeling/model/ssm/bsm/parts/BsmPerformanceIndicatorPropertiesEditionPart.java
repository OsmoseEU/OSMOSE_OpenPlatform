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
public interface BsmPerformanceIndicatorPropertiesEditionPart {

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
	 * @return the unit
	 * 
	 */
	public String getUnit();

	/**
	 * Defines a new unit
	 * @param newValue the new unit to set
	 * 
	 */
	public void setUnit(String newValue);


	/**
	 * @return the formula
	 * 
	 */
	public String getFormula();

	/**
	 * Defines a new formula
	 * @param newValue the new formula to set
	 * 
	 */
	public void setFormula(String newValue);


	/**
	 * @return the requiredInfo
	 * 
	 */
	public String getRequiredInfo();

	/**
	 * Defines a new requiredInfo
	 * @param newValue the new requiredInfo to set
	 * 
	 */
	public void setRequiredInfo(String newValue);


	/**
	 * @return the requiredProcessing
	 * 
	 */
	public String getRequiredProcessing();

	/**
	 * Defines a new requiredProcessing
	 * @param newValue the new requiredProcessing to set
	 * 
	 */
	public void setRequiredProcessing(String newValue);


	/**
	 * @return the decision
	 * 
	 */
	public EObject getDecision();

	/**
	 * Init the decision
	 * @param settings the combo setting
	 */
	public void initDecision(EObjectFlatComboSettings settings);

	/**
	 * Defines a new decision
	 * @param newValue the new decision to set
	 * 
	 */
	public void setDecision(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setDecisionButtonMode(ButtonsModeEnum newValue);

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
	 * Init the variables
	 * @param settings settings for the variables ReferencesTable 
	 */
	public void initVariables(ReferencesTableSettings settings);

	/**
	 * Update the variables
	 * @param newValue the variables to update
	 * 
	 */
	public void updateVariables();

	/**
	 * Adds the given filter to the variables edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToVariables(ViewerFilter filter);

	/**
	 * Adds the given filter to the variables edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToVariables(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the variables table
	 * 
	 */
	public boolean isContainedInVariablesTable(EObject element);




	/**
	 * Init the objectives
	 * @param settings settings for the objectives ReferencesTable 
	 */
	public void initObjectives(ReferencesTableSettings settings);

	/**
	 * Update the objectives
	 * @param newValue the objectives to update
	 * 
	 */
	public void updateObjectives();

	/**
	 * Adds the given filter to the objectives edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToObjectives(ViewerFilter filter);

	/**
	 * Adds the given filter to the objectives edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToObjectives(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the objectives table
	 * 
	 */
	public boolean isContainedInObjectivesTable(EObject element);


	/**
	 * @return the category1
	 * 
	 */
	public String getCategory1();

	/**
	 * Defines a new category1
	 * @param newValue the new category1 to set
	 * 
	 */
	public void setCategory1(String newValue);


	/**
	 * @return the category2
	 * 
	 */
	public String getCategory2();

	/**
	 * Defines a new category2
	 * @param newValue the new category2 to set
	 * 
	 */
	public void setCategory2(String newValue);


	/**
	 * @return the category3
	 * 
	 */
	public String getCategory3();

	/**
	 * Defines a new category3
	 * @param newValue the new category3 to set
	 * 
	 */
	public void setCategory3(String newValue);


	/**
	 * @return the dimension
	 * 
	 */
	public String getDimension();

	/**
	 * Defines a new dimension
	 * @param newValue the new dimension to set
	 * 
	 */
	public void setDimension(String newValue);





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
