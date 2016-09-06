/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.ButtonsModeEnum;
import org.eclipse.emf.eef.runtime.ui.widgets.eobjflatcombo.EObjectFlatComboSettings;
import org.eclipse.jface.viewers.ViewerFilter;

// Start of user code for imports



// End of user code

/**
 * 
 * 
 */
public interface TimInformationAttributePropertiesEditionPart {

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
	 * @return the informationEntity
	 * 
	 */
	public EObject getInformationEntity();

	/**
	 * Init the informationEntity
	 * @param settings the combo setting
	 */
	public void initInformationEntity(EObjectFlatComboSettings settings);

	/**
	 * Defines a new informationEntity
	 * @param newValue the new informationEntity to set
	 * 
	 */
	public void setInformationEntity(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setInformationEntityButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the informationEntity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInformationEntity(ViewerFilter filter);

	/**
	 * Adds the given filter to the informationEntity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInformationEntity(ViewerFilter filter);





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
