/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.parts;

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
public interface TimInformationEntityPropertiesEditionPart {

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
	 * Init the outRelations
	 * @param settings settings for the outRelations ReferencesTable 
	 */
	public void initOutRelations(ReferencesTableSettings settings);

	/**
	 * Update the outRelations
	 * @param newValue the outRelations to update
	 * 
	 */
	public void updateOutRelations();

	/**
	 * Adds the given filter to the outRelations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutRelations(ViewerFilter filter);

	/**
	 * Adds the given filter to the outRelations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutRelations(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the outRelations table
	 * 
	 */
	public boolean isContainedInOutRelationsTable(EObject element);




	/**
	 * Init the inRelations
	 * @param settings settings for the inRelations ReferencesTable 
	 */
	public void initInRelations(ReferencesTableSettings settings);

	/**
	 * Update the inRelations
	 * @param newValue the inRelations to update
	 * 
	 */
	public void updateInRelations();

	/**
	 * Adds the given filter to the inRelations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInRelations(ViewerFilter filter);

	/**
	 * Adds the given filter to the inRelations edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInRelations(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the inRelations table
	 * 
	 */
	public boolean isContainedInInRelationsTable(EObject element);


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
