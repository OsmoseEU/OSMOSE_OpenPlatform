/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts;

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
public interface TimInformationRelationshipPropertiesEditionPart {

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
	 * @return the sourceEntity
	 * 
	 */
	public EObject getSourceEntity();

	/**
	 * Init the sourceEntity
	 * @param settings the combo setting
	 */
	public void initSourceEntity(EObjectFlatComboSettings settings);

	/**
	 * Defines a new sourceEntity
	 * @param newValue the new sourceEntity to set
	 * 
	 */
	public void setSourceEntity(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setSourceEntityButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the sourceEntity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToSourceEntity(ViewerFilter filter);

	/**
	 * Adds the given filter to the sourceEntity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToSourceEntity(ViewerFilter filter);


	/**
	 * @return the targetEntity
	 * 
	 */
	public EObject getTargetEntity();

	/**
	 * Init the targetEntity
	 * @param settings the combo setting
	 */
	public void initTargetEntity(EObjectFlatComboSettings settings);

	/**
	 * Defines a new targetEntity
	 * @param newValue the new targetEntity to set
	 * 
	 */
	public void setTargetEntity(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setTargetEntityButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the targetEntity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToTargetEntity(ViewerFilter filter);

	/**
	 * Adds the given filter to the targetEntity edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToTargetEntity(ViewerFilter filter);


	/**
	 * @return the information
	 * 
	 */
	public EObject getInformation();

	/**
	 * Init the information
	 * @param settings the combo setting
	 */
	public void initInformation(EObjectFlatComboSettings settings);

	/**
	 * Defines a new information
	 * @param newValue the new information to set
	 * 
	 */
	public void setInformation(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setInformationButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the information edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInformation(ViewerFilter filter);

	/**
	 * Adds the given filter to the information edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInformation(ViewerFilter filter);





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
