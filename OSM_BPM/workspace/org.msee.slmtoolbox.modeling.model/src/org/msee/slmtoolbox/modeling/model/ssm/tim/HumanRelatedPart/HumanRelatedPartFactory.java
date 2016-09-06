/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.HumanRelatedPartPackage
 * @generated
 */
public interface HumanRelatedPartFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HumanRelatedPartFactory eINSTANCE = org.msee.slmtoolbox.modeling.model.ssm.tim.HumanRelatedPart.impl.HumanRelatedPartFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tim Human Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tim Human Resource</em>'.
	 * @generated
	 */
	TimHumanResource createTimHumanResource();

	/**
	 * Returns a new object of class '<em>Tim Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tim Organization</em>'.
	 * @generated
	 */
	TimOrganization createTimOrganization();

	/**
	 * Returns a new object of class '<em>Tim Organization Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tim Organization Unit</em>'.
	 * @generated
	 */
	TimOrganizationUnit createTimOrganizationUnit();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HumanRelatedPartPackage getHumanRelatedPartPackage();

} //HumanRelatedPartFactory
