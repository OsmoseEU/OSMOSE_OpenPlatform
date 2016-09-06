/**
 * Generated with Acceleo
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.parts;

// Start of user code for imports
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface EaAtomicExtendedActivityPropertiesEditionPart {

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
	 * @return the organization
	 * 
	 */
	public String getOrganization();

	/**
	 * Defines a new organization
	 * @param newValue the new organization to set
	 * 
	 */
	public void setOrganization(String newValue);




	/**
	 * Init the inFlows
	 * @param settings settings for the inFlows ReferencesTable 
	 */
	public void initInFlows(ReferencesTableSettings settings);

	/**
	 * Update the inFlows
	 * @param newValue the inFlows to update
	 * 
	 */
	public void updateInFlows();

	/**
	 * Adds the given filter to the inFlows edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToInFlows(ViewerFilter filter);

	/**
	 * Adds the given filter to the inFlows edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToInFlows(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the inFlows table
	 * 
	 */
	public boolean isContainedInInFlowsTable(EObject element);




	/**
	 * Init the outFlows
	 * @param settings settings for the outFlows ReferencesTable 
	 */
	public void initOutFlows(ReferencesTableSettings settings);

	/**
	 * Update the outFlows
	 * @param newValue the outFlows to update
	 * 
	 */
	public void updateOutFlows();

	/**
	 * Adds the given filter to the outFlows edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOutFlows(ViewerFilter filter);

	/**
	 * Adds the given filter to the outFlows edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToOutFlows(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the outFlows table
	 * 
	 */
	public boolean isContainedInOutFlowsTable(EObject element);


	/**
	 * @return the mission
	 * 
	 */
	public String getMission();

	/**
	 * Defines a new mission
	 * @param newValue the new mission to set
	 * 
	 */
	public void setMission(String newValue);


	/**
	 * @return the functionalRules
	 * 
	 */
	public String getFunctionalRules();

	/**
	 * Defines a new functionalRules
	 * @param newValue the new functionalRules to set
	 * 
	 */
	public void setFunctionalRules(String newValue);


	/**
	 * @return the minCost
	 * 
	 */
	public String getMinCost();

	/**
	 * Defines a new minCost
	 * @param newValue the new minCost to set
	 * 
	 */
	public void setMinCost(String newValue);


	/**
	 * @return the maxCost
	 * 
	 */
	public String getMaxCost();

	/**
	 * Defines a new maxCost
	 * @param newValue the new maxCost to set
	 * 
	 */
	public void setMaxCost(String newValue);


	/**
	 * @return the averageCost
	 * 
	 */
	public String getAverageCost();

	/**
	 * Defines a new averageCost
	 * @param newValue the new averageCost to set
	 * 
	 */
	public void setAverageCost(String newValue);


	/**
	 * @return the minTimeDelay
	 * 
	 */
	public String getMinTimeDelay();

	/**
	 * Defines a new minTimeDelay
	 * @param newValue the new minTimeDelay to set
	 * 
	 */
	public void setMinTimeDelay(String newValue);


	/**
	 * @return the maxTimeDelay
	 * 
	 */
	public String getMaxTimeDelay();

	/**
	 * Defines a new maxTimeDelay
	 * @param newValue the new maxTimeDelay to set
	 * 
	 */
	public void setMaxTimeDelay(String newValue);


	/**
	 * @return the averageTimeDelay
	 * 
	 */
	public String getAverageTimeDelay();

	/**
	 * Defines a new averageTimeDelay
	 * @param newValue the new averageTimeDelay to set
	 * 
	 */
	public void setAverageTimeDelay(String newValue);


	/**
	 * @return the isStarting
	 * 
	 */
	public Boolean getIsStarting();

	/**
	 * Defines a new isStarting
	 * @param newValue the new isStarting to set
	 * 
	 */
	public void setIsStarting(Boolean newValue);


	/**
	 * @return the isEnding
	 * 
	 */
	public Boolean getIsEnding();

	/**
	 * Defines a new isEnding
	 * @param newValue the new isEnding to set
	 * 
	 */
	public void setIsEnding(Boolean newValue);


	/**
	 * @return the decompositionCode
	 * 
	 */
	public String getDecompositionCode();

	/**
	 * Defines a new decompositionCode
	 * @param newValue the new decompositionCode to set
	 * 
	 */
	public void setDecompositionCode(String newValue);

	/**
	 * @return the osmoseWorld
	 * 
	 */
	public Object getOsmoseWorld();

	/**
	 * Init the osmoseWorld
	 * @param input choice of values
	 * @param currentValue the current value
	 */
	public void initOsmoseWorld(Object input, Object currentValue);

	/**
	 * Defines a new osmoseWorld
	 * @param newValue the new osmoseWorld to set
	 * 
	 */
	public void setOsmoseWorld(Object newValue);

	/**
	 * Adds the given filter to the osmoseWorld edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToOsmoseWorld(ViewerFilter filter);



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
