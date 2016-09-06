/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface BsmComponentPropertiesEditionPart {

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
	 * @return the cost
	 * 
	 */
	public String getCost();

	/**
	 * Defines a new cost
	 * @param newValue the new cost to set
	 * 
	 */
	public void setCost(String newValue);


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
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
