/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl;

import org.eclipse.emf.ecore.EClass;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage;
import org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaExtendedActivity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ea Extended Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExtendedActivityImpl#getMission <em>Mission</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExtendedActivityImpl#getFunctionalRules <em>Functional Rules</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExtendedActivityImpl#getMinCost <em>Min Cost</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExtendedActivityImpl#getMaxCost <em>Max Cost</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExtendedActivityImpl#getAverageCost <em>Average Cost</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExtendedActivityImpl#getMinTimeDelay <em>Min Time Delay</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExtendedActivityImpl#getMaxTimeDelay <em>Max Time Delay</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExtendedActivityImpl#getAverageTimeDelay <em>Average Time Delay</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExtendedActivityImpl#isIsStarting <em>Is Starting</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExtendedActivityImpl#isIsEnding <em>Is Ending</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.EaExtendedActivityImpl#getDecompositionCode <em>Decomposition Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EaExtendedActivityImpl extends EaFlowNodeImpl implements EaExtendedActivity {
	/**
	 * The default value of the '{@link #getMission() <em>Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMission()
	 * @generated
	 * @ordered
	 */
	protected static final String MISSION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFunctionalRules() <em>Functional Rules</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalRules()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTIONAL_RULES_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMinCost() <em>Min Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinCost()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_COST_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMaxCost() <em>Max Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCost()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_COST_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getAverageCost() <em>Average Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageCost()
	 * @generated
	 * @ordered
	 */
	protected static final double AVERAGE_COST_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMinTimeDelay() <em>Min Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinTimeDelay()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_TIME_DELAY_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getMaxTimeDelay() <em>Max Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxTimeDelay()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_TIME_DELAY_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getAverageTimeDelay() <em>Average Time Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageTimeDelay()
	 * @generated
	 * @ordered
	 */
	protected static final double AVERAGE_TIME_DELAY_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #isIsStarting() <em>Is Starting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsStarting()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STARTING_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isIsEnding() <em>Is Ending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnding()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENDING_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getDecompositionCode() <em>Decomposition Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecompositionCode()
	 * @generated
	 * @ordered
	 */
	protected static final String DECOMPOSITION_CODE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOsmoseWorld() <em>Osmose World</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsmoseWorld()
	 * @generated
	 * @ordered
	 */
	protected static final String OSMOSE_WORLD_EDEFAULT = "UNDEFINED";

	/**
	 * The cached value of the '{@link #getOsmoseWorld() <em>Osmose World</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsmoseWorld()
	 * @generated
	 * @ordered
	 */
	protected String osmoseWorld = OSMOSE_WORLD_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EaExtendedActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMission() {
		return (String)eDynamicGet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__MISSION, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__MISSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMission(String newMission) {
		eDynamicSet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__MISSION, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__MISSION, newMission);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunctionalRules() {
		return (String)eDynamicGet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__FUNCTIONAL_RULES, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__FUNCTIONAL_RULES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionalRules(String newFunctionalRules) {
		eDynamicSet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__FUNCTIONAL_RULES, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__FUNCTIONAL_RULES, newFunctionalRules);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinCost() {
		return (Double)eDynamicGet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__MIN_COST, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__MIN_COST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinCost(double newMinCost) {
		eDynamicSet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__MIN_COST, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__MIN_COST, newMinCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxCost() {
		return (Double)eDynamicGet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__MAX_COST, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__MAX_COST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCost(double newMaxCost) {
		eDynamicSet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__MAX_COST, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__MAX_COST, newMaxCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAverageCost() {
		return (Double)eDynamicGet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__AVERAGE_COST, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__AVERAGE_COST, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverageCost(double newAverageCost) {
		eDynamicSet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__AVERAGE_COST, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__AVERAGE_COST, newAverageCost);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinTimeDelay() {
		return (Double)eDynamicGet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__MIN_TIME_DELAY, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__MIN_TIME_DELAY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinTimeDelay(double newMinTimeDelay) {
		eDynamicSet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__MIN_TIME_DELAY, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__MIN_TIME_DELAY, newMinTimeDelay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaxTimeDelay() {
		return (Double)eDynamicGet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__MAX_TIME_DELAY, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__MAX_TIME_DELAY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxTimeDelay(double newMaxTimeDelay) {
		eDynamicSet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__MAX_TIME_DELAY, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__MAX_TIME_DELAY, newMaxTimeDelay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAverageTimeDelay() {
		return (Double)eDynamicGet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__AVERAGE_TIME_DELAY, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__AVERAGE_TIME_DELAY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverageTimeDelay(double newAverageTimeDelay) {
		eDynamicSet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__AVERAGE_TIME_DELAY, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__AVERAGE_TIME_DELAY, newAverageTimeDelay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsStarting() {
		return (Boolean)eDynamicGet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__IS_STARTING, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__IS_STARTING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStarting(boolean newIsStarting) {
		eDynamicSet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__IS_STARTING, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__IS_STARTING, newIsStarting);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEnding() {
		return (Boolean)eDynamicGet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__IS_ENDING, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__IS_ENDING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEnding(boolean newIsEnding) {
		eDynamicSet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__IS_ENDING, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__IS_ENDING, newIsEnding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecompositionCode() {
		return (String)eDynamicGet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__DECOMPOSITION_CODE, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__DECOMPOSITION_CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecompositionCode(String newDecompositionCode) {
		eDynamicSet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__DECOMPOSITION_CODE, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__DECOMPOSITION_CODE, newDecompositionCode);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsmoseWorld() {
		return (String)eDynamicGet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__OSMOSE_WORLD, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__OSMOSE_WORLD, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsmoseWorld(String newOsmoseWorld) {
		eDynamicSet(CoreElementsPackage.EA_EXTENDED_ACTIVITY__OSMOSE_WORLD, CoreElementsPackage.Literals.EA_EXTENDED_ACTIVITY__OSMOSE_WORLD, newOsmoseWorld);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();
		StringBuffer result = new StringBuffer();
		result.append("Extended Activity ");
		result.append(this.getName());
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MISSION:
				return getMission();
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__FUNCTIONAL_RULES:
				return getFunctionalRules();
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MIN_COST:
				return getMinCost();
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MAX_COST:
				return getMaxCost();
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__AVERAGE_COST:
				return getAverageCost();
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MIN_TIME_DELAY:
				return getMinTimeDelay();
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MAX_TIME_DELAY:
				return getMaxTimeDelay();
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__AVERAGE_TIME_DELAY:
				return getAverageTimeDelay();
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__IS_STARTING:
				return isIsStarting();
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__IS_ENDING:
				return isIsEnding();
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__DECOMPOSITION_CODE:
				return getDecompositionCode();
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__OSMOSE_WORLD:
				return getOsmoseWorld();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MISSION:
				setMission((String)newValue);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__FUNCTIONAL_RULES:
				setFunctionalRules((String)newValue);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MIN_COST:
				setMinCost((Double)newValue);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MAX_COST:
				setMaxCost((Double)newValue);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__AVERAGE_COST:
				setAverageCost((Double)newValue);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MIN_TIME_DELAY:
				setMinTimeDelay((Double)newValue);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MAX_TIME_DELAY:
				setMaxTimeDelay((Double)newValue);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__AVERAGE_TIME_DELAY:
				setAverageTimeDelay((Double)newValue);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__IS_STARTING:
				setIsStarting((Boolean)newValue);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__IS_ENDING:
				setIsEnding((Boolean)newValue);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__DECOMPOSITION_CODE:
				setDecompositionCode((String)newValue);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__OSMOSE_WORLD:
				setOsmoseWorld((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MISSION:
				setMission(MISSION_EDEFAULT);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__FUNCTIONAL_RULES:
				setFunctionalRules(FUNCTIONAL_RULES_EDEFAULT);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MIN_COST:
				setMinCost(MIN_COST_EDEFAULT);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MAX_COST:
				setMaxCost(MAX_COST_EDEFAULT);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__AVERAGE_COST:
				setAverageCost(AVERAGE_COST_EDEFAULT);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MIN_TIME_DELAY:
				setMinTimeDelay(MIN_TIME_DELAY_EDEFAULT);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MAX_TIME_DELAY:
				setMaxTimeDelay(MAX_TIME_DELAY_EDEFAULT);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__AVERAGE_TIME_DELAY:
				setAverageTimeDelay(AVERAGE_TIME_DELAY_EDEFAULT);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__IS_STARTING:
				setIsStarting(IS_STARTING_EDEFAULT);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__IS_ENDING:
				setIsEnding(IS_ENDING_EDEFAULT);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__DECOMPOSITION_CODE:
				setDecompositionCode(DECOMPOSITION_CODE_EDEFAULT);
				return;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__OSMOSE_WORLD:
				setDecompositionCode(OSMOSE_WORLD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MISSION:
				return MISSION_EDEFAULT == null ? getMission() != null : !MISSION_EDEFAULT.equals(getMission());
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__FUNCTIONAL_RULES:
				return FUNCTIONAL_RULES_EDEFAULT == null ? getFunctionalRules() != null : !FUNCTIONAL_RULES_EDEFAULT.equals(getFunctionalRules());
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MIN_COST:
				return getMinCost() != MIN_COST_EDEFAULT;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MAX_COST:
				return getMaxCost() != MAX_COST_EDEFAULT;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__AVERAGE_COST:
				return getAverageCost() != AVERAGE_COST_EDEFAULT;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MIN_TIME_DELAY:
				return getMinTimeDelay() != MIN_TIME_DELAY_EDEFAULT;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__MAX_TIME_DELAY:
				return getMaxTimeDelay() != MAX_TIME_DELAY_EDEFAULT;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__AVERAGE_TIME_DELAY:
				return getAverageTimeDelay() != AVERAGE_TIME_DELAY_EDEFAULT;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__IS_STARTING:
				return isIsStarting() != IS_STARTING_EDEFAULT;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__IS_ENDING:
				return isIsEnding() != IS_ENDING_EDEFAULT;
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__DECOMPOSITION_CODE:
				return DECOMPOSITION_CODE_EDEFAULT == null ? getDecompositionCode() != null : !DECOMPOSITION_CODE_EDEFAULT.equals(getDecompositionCode());
			case CoreElementsPackage.EA_EXTENDED_ACTIVITY__OSMOSE_WORLD:
				return OSMOSE_WORLD_EDEFAULT == null ? getOsmoseWorld() != null : !OSMOSE_WORLD_EDEFAULT.equals(getOsmoseWorld());
		}
		return super.eIsSet(featureID);
	}

} //EaExtendedActivityImpl
