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
public interface BsmMseServicePropertiesEditionPart {

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
	 * @return the owner
	 * 
	 */
	public String getOwner();

	/**
	 * Defines a new owner
	 * @param newValue the new owner to set
	 * 
	 */
	public void setOwner(String newValue);


	/**
	 * @return the createDate
	 * 
	 */
	public String getCreateDate();

	/**
	 * Defines a new createDate
	 * @param newValue the new createDate to set
	 * 
	 */
	public void setCreateDate(String newValue);


	/**
	 * @return the publishedDate
	 * 
	 */
	public String getPublishedDate();

	/**
	 * Defines a new publishedDate
	 * @param newValue the new publishedDate to set
	 * 
	 */
	public void setPublishedDate(String newValue);


	/**
	 * @return the published
	 * 
	 */
	public String getPublished();

	/**
	 * Defines a new published
	 * @param newValue the new published to set
	 * 
	 */
	public void setPublished(String newValue);


	/**
	 * @return the process
	 * 
	 */
	public EObject getProcess();

	/**
	 * Init the process
	 * @param settings the combo setting
	 */
	public void initProcess(EObjectFlatComboSettings settings);

	/**
	 * Defines a new process
	 * @param newValue the new process to set
	 * 
	 */
	public void setProcess(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setProcessButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the process edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToProcess(ViewerFilter filter);

	/**
	 * Adds the given filter to the process edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToProcess(ViewerFilter filter);


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
	 * @return the resource
	 * 
	 */
	public EObject getResource();

	/**
	 * Init the resource
	 * @param settings the combo setting
	 */
	public void initResource(EObjectFlatComboSettings settings);

	/**
	 * Defines a new resource
	 * @param newValue the new resource to set
	 * 
	 */
	public void setResource(EObject newValue);

	/**
	 * Defines the button mode
	 * @param newValue the new mode to set
	 * 
	 */
	public void setResourceButtonMode(ButtonsModeEnum newValue);

	/**
	 * Adds the given filter to the resource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToResource(ViewerFilter filter);

	/**
	 * Adds the given filter to the resource edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToResource(ViewerFilter filter);





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
