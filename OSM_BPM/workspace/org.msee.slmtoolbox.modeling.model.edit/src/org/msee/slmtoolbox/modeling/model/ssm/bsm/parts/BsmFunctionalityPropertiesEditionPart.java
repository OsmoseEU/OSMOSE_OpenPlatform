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
public interface BsmFunctionalityPropertiesEditionPart {

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
	 * @return the product
	 * 
	 */
	public EObject getProduct();

	/**
	 * Init the product
	 * @param settings the combo setting
	 */
	public void initProduct(EObjectFlatComboSettings settings);

	/**
	 * Defines a new product
	 * @param newValue the new product to set
	 * 
	 */
	public void setProduct(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setProductButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the product edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProduct(ViewerFilter filter);

	/**
	 * Adds the given filter to the product edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProduct(ViewerFilter filter);




	/**
	 * Init the subFunctions
	 * @param settings settings for the subFunctions ReferencesTable 
	 */
	public void initSubFunctions(ReferencesTableSettings settings);

	/**
	 * Update the subFunctions
	 * @param newValue the subFunctions to update
	 * 
	 */
	public void updateSubFunctions();

	/**
	 * Adds the given filter to the subFunctions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSubFunctions(ViewerFilter filter);

	/**
	 * Adds the given filter to the subFunctions edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSubFunctions(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the subFunctions table
	 * 
	 */
	public boolean isContainedInSubFunctionsTable(EObject element);


	/**
	 * @return the mainFunction
	 * 
	 */
	public EObject getMainFunction();

	/**
	 * Init the mainFunction
	 * @param settings the combo setting
	 */
	public void initMainFunction(EObjectFlatComboSettings settings);

	/**
	 * Defines a new mainFunction
	 * @param newValue the new mainFunction to set
	 * 
	 */
	public void setMainFunction(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setMainFunctionButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the mainFunction edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToMainFunction(ViewerFilter filter);

	/**
	 * Adds the given filter to the mainFunction edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToMainFunction(ViewerFilter filter);





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
