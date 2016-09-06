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
public interface BsmVEParticipationPropertiesEditionPart {

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
	 * @return the virtualEnterprise
	 * 
	 */
	public EObject getVirtualEnterprise();

	/**
	 * Init the virtualEnterprise
	 * @param settings the combo setting
	 */
	public void initVirtualEnterprise(EObjectFlatComboSettings settings);

	/**
	 * Defines a new virtualEnterprise
	 * @param newValue the new virtualEnterprise to set
	 * 
	 */
	public void setVirtualEnterprise(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setVirtualEnterpriseButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the virtualEnterprise edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToVirtualEnterprise(ViewerFilter filter);

	/**
	 * Adds the given filter to the virtualEnterprise edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToVirtualEnterprise(ViewerFilter filter);





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
