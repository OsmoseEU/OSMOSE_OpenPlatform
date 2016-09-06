/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ea Extended Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMission <em>Mission</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getFunctionalRules <em>Functional Rules</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMinCost <em>Min Cost</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMaxCost <em>Max Cost</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getAverageCost <em>Average Cost</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMinTimeDelay <em>Min Time Delay</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMaxTimeDelay <em>Max Time Delay</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getAverageTimeDelay <em>Average Time Delay</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#isIsStarting <em>Is Starting</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#isIsEnding <em>Is Ending</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getDecompositionCode <em>Decomposition Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaExtendedActivity()
 * @model abstract="true"
 * @generated
 */
public interface EaExtendedActivity extends EaFlowNode {
	/**
	 * Returns the value of the '<em><b>Mission</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mission</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mission</em>' attribute.
	 * @see #setMission(String)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaExtendedActivity_Mission()
	 * @model
	 * @generated
	 */
	String getMission();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMission <em>Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mission</em>' attribute.
	 * @see #getMission()
	 * @generated
	 */
	void setMission(String value);

	/**
	 * Returns the value of the '<em><b>Functional Rules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Rules</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Rules</em>' attribute.
	 * @see #setFunctionalRules(String)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaExtendedActivity_FunctionalRules()
	 * @model
	 * @generated
	 */
	String getFunctionalRules();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getFunctionalRules <em>Functional Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Rules</em>' attribute.
	 * @see #getFunctionalRules()
	 * @generated
	 */
	void setFunctionalRules(String value);

	/**
	 * Returns the value of the '<em><b>Min Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Cost</em>' attribute.
	 * @see #setMinCost(double)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaExtendedActivity_MinCost()
	 * @model
	 * @generated
	 */
	double getMinCost();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMinCost <em>Min Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Cost</em>' attribute.
	 * @see #getMinCost()
	 * @generated
	 */
	void setMinCost(double value);

	/**
	 * Returns the value of the '<em><b>Max Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Cost</em>' attribute.
	 * @see #setMaxCost(double)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaExtendedActivity_MaxCost()
	 * @model
	 * @generated
	 */
	double getMaxCost();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMaxCost <em>Max Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Cost</em>' attribute.
	 * @see #getMaxCost()
	 * @generated
	 */
	void setMaxCost(double value);

	/**
	 * Returns the value of the '<em><b>Average Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Cost</em>' attribute.
	 * @see #setAverageCost(double)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaExtendedActivity_AverageCost()
	 * @model
	 * @generated
	 */
	double getAverageCost();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getAverageCost <em>Average Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Cost</em>' attribute.
	 * @see #getAverageCost()
	 * @generated
	 */
	void setAverageCost(double value);

	/**
	 * Returns the value of the '<em><b>Min Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Time Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Time Delay</em>' attribute.
	 * @see #setMinTimeDelay(double)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaExtendedActivity_MinTimeDelay()
	 * @model
	 * @generated
	 */
	double getMinTimeDelay();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMinTimeDelay <em>Min Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Time Delay</em>' attribute.
	 * @see #getMinTimeDelay()
	 * @generated
	 */
	void setMinTimeDelay(double value);

	/**
	 * Returns the value of the '<em><b>Max Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Time Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Time Delay</em>' attribute.
	 * @see #setMaxTimeDelay(double)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaExtendedActivity_MaxTimeDelay()
	 * @model
	 * @generated
	 */
	double getMaxTimeDelay();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getMaxTimeDelay <em>Max Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Time Delay</em>' attribute.
	 * @see #getMaxTimeDelay()
	 * @generated
	 */
	void setMaxTimeDelay(double value);

	/**
	 * Returns the value of the '<em><b>Average Time Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Average Time Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average Time Delay</em>' attribute.
	 * @see #setAverageTimeDelay(double)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaExtendedActivity_AverageTimeDelay()
	 * @model
	 * @generated
	 */
	double getAverageTimeDelay();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getAverageTimeDelay <em>Average Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average Time Delay</em>' attribute.
	 * @see #getAverageTimeDelay()
	 * @generated
	 */
	void setAverageTimeDelay(double value);

	/**
	 * Returns the value of the '<em><b>Is Starting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Starting</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Starting</em>' attribute.
	 * @see #setIsStarting(boolean)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaExtendedActivity_IsStarting()
	 * @model
	 * @generated
	 */
	boolean isIsStarting();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#isIsStarting <em>Is Starting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Starting</em>' attribute.
	 * @see #isIsStarting()
	 * @generated
	 */
	void setIsStarting(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Ending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Ending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Ending</em>' attribute.
	 * @see #setIsEnding(boolean)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaExtendedActivity_IsEnding()
	 * @model
	 * @generated
	 */
	boolean isIsEnding();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#isIsEnding <em>Is Ending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Ending</em>' attribute.
	 * @see #isIsEnding()
	 * @generated
	 */
	void setIsEnding(boolean value);

	/**
	 * Returns the value of the '<em><b>Decomposition Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposition Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposition Code</em>' attribute.
	 * @see #setDecompositionCode(String)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaExtendedActivity_DecompositionCode()
	 * @model
	 * @generated
	 */
	String getDecompositionCode();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity#getDecompositionCode <em>Decomposition Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposition Code</em>' attribute.
	 * @see #getDecompositionCode()
	 * @generated
	 */
	void setDecompositionCode(String value);

	/**
	 * Returns the value of the '<em><b>Osmose World</b></em>' attribute.
	 * The default value is <code>"REAL"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Osmose World</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Osmose World</em>' attribute.
	 * @see #setOsmoseWorld(String)
	 * @see eaStar.coreElements.CoreElementsPackage#getEaExtendedActivity_OsmoseWorld()
	 * @model default="REAL"
	 * @generated
	 */
	String getOsmoseWorld();

	/**
	 * Sets the value of the '{@link eaStar.coreElements.EaExtendedActivity#getOsmoseWorld <em>Osmose World</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Osmose World</em>' attribute.
	 * @see #getOsmoseWorld()
	 * @generated
	 */
	void setOsmoseWorld(String value);
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String toString();

} // EaExtendedActivity
