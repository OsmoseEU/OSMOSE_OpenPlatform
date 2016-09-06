/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements;

import org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ea Structural Extended Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity#getIsA <em>Is A</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaStructuralExtendedActivity()
 * @model
 * @generated
 */
public interface EaStructuralExtendedActivity extends EaExtendedActivity {
	/**
	 * Returns the value of the '<em><b>Is A</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess#getCanBe <em>Can Be</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is A</em>' reference.
	 * @see #setIsA(EaProcess)
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaStructuralExtendedActivity_IsA()
	 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.generalElements.EaProcess#getCanBe
	 * @model opposite="canBe"
	 * @generated
	 */
	EaProcess getIsA();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.EaStructuralExtendedActivity#getIsA <em>Is A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is A</em>' reference.
	 * @see #getIsA()
	 * @generated
	 */
	void setIsA(EaProcess value);

} // EaStructuralExtendedActivity
