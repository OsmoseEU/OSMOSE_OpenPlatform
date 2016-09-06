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
public interface BsmDecisionObjectivePropertiesEditionPart {

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
	 * Init the performanceIndicators
	 * @param settings settings for the performanceIndicators ReferencesTable 
	 */
	public void initPerformanceIndicators(ReferencesTableSettings settings);

	/**
	 * Update the performanceIndicators
	 * @param newValue the performanceIndicators to update
	 * 
	 */
	public void updatePerformanceIndicators();

	/**
	 * Adds the given filter to the performanceIndicators edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToPerformanceIndicators(ViewerFilter filter);

	/**
	 * Adds the given filter to the performanceIndicators edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToPerformanceIndicators(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the performanceIndicators table
	 * 
	 */
	public boolean isContainedInPerformanceIndicatorsTable(EObject element);





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
