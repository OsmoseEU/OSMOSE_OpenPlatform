/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enterprise</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise#getType <em>Type</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise#getResources <em>Resources</em>}</li>
 *   <li>{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise#getVeParticipations <em>Ve Participations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmEnterprise()
 * @model
 * @generated
 */
public interface BsmEnterprise extends BsmOrganization {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmEnterprise_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmEnterprise#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getOrganization <em>Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmEnterprise_Resources()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmResource#getOrganization
	 * @model opposite="organization" containment="true"
	 * @generated
	 */
	EList<BsmResource> getResources();

	/**
	 * Returns the value of the '<em><b>Ve Participations</b></em>' reference list.
	 * The list contents are of type {@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation}.
	 * It is bidirectional and its opposite is '{@link org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation#getEnterprise <em>Enterprise</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ve Participations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ve Participations</em>' reference list.
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmEnterprise_VeParticipations()
	 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmVEParticipation#getEnterprise
	 * @model opposite="enterprise"
	 * @generated
	 */
	EList<BsmVEParticipation> getVeParticipations();

} // BsmEnterprise
