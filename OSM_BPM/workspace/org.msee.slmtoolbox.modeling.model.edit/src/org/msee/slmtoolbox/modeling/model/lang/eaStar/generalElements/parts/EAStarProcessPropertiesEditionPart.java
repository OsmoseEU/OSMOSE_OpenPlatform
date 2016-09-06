/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.parts;

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
public interface EAStarProcessPropertiesEditionPart {

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
	 * Init the flowElements
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initFlowElements(ReferencesTableSettings settings);

	/**
	 * Update the flowElements
	 * @param newValue the flowElements to update
	 * 
	 */
	public void updateFlowElements();

	/**
	 * Adds the given filter to the flowElements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToFlowElements(ViewerFilter filter);

	/**
	 * Adds the given filter to the flowElements edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToFlowElements(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the flowElements table
	 * 
	 */
	public boolean isContainedInFlowElementsTable(EObject element);


	/**
	 * @return the canBe
	 * 
	 */
	public EObject getCanBe();

	/**
	 * Init the canBe
	 * @param settings the combo setting
	 */
	public void initCanBe(EObjectFlatComboSettings settings);

	/**
	 * Defines a new canBe
	 * @param newValue the new canBe to set
	 * 
	 */
	public void setCanBe(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setCanBeButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the canBe edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToCanBe(ViewerFilter filter);

	/**
	 * Adds the given filter to the canBe edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToCanBe(ViewerFilter filter);





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
