/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage
 * @generated
 */
public interface CoreElementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreElementsFactory eINSTANCE = org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.impl.CoreElementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ea IT Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea IT Resource</em>'.
	 * @generated
	 */
	EaITResource createEaITResource();

	/**
	 * Returns a new object of class '<em>Ea Human Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea Human Resource</em>'.
	 * @generated
	 */
	EaHumanResource createEaHumanResource();

	/**
	 * Returns a new object of class '<em>Ea Material Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea Material Resource</em>'.
	 * @generated
	 */
	EaMaterialResource createEaMaterialResource();

	/**
	 * Returns a new object of class '<em>Ea Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea Or</em>'.
	 * @generated
	 */
	EaOr createEaOr();

	/**
	 * Returns a new object of class '<em>Ea And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea And</em>'.
	 * @generated
	 */
	EaAnd createEaAnd();

	/**
	 * Returns a new object of class '<em>Ea Diverging And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea Diverging And</em>'.
	 * @generated
	 */
	EaDivergingAnd createEaDivergingAnd();

	/**
	 * Returns a new object of class '<em>Ea Diverging Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea Diverging Or</em>'.
	 * @generated
	 */
	EaDivergingOr createEaDivergingOr();

	/**
	 * Returns a new object of class '<em>Ea Converging And</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea Converging And</em>'.
	 * @generated
	 */
	EaConvergingAnd createEaConvergingAnd();

	/**
	 * Returns a new object of class '<em>Ea Converging Or</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea Converging Or</em>'.
	 * @generated
	 */
	EaConvergingOr createEaConvergingOr();

	/**
	 * Returns a new object of class '<em>Ea Internal Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea Internal Connector</em>'.
	 * @generated
	 */
	EaInternalConnector createEaInternalConnector();

	/**
	 * Returns a new object of class '<em>Ea External Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea External Connector</em>'.
	 * @generated
	 */
	EaExternalConnector createEaExternalConnector();

	/**
	 * Returns a new object of class '<em>Ea Process Connector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea Process Connector</em>'.
	 * @generated
	 */
	EaProcessConnector createEaProcessConnector();

	/**
	 * Returns a new object of class '<em>Ea Output Input Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea Output Input Flow</em>'.
	 * @generated
	 */
	EaOutputInputFlow createEaOutputInputFlow();

	/**
	 * Returns a new object of class '<em>Ea Support Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea Support Flow</em>'.
	 * @generated
	 */
	EaSupportFlow createEaSupportFlow();

	/**
	 * Returns a new object of class '<em>Ea Control Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea Control Flow</em>'.
	 * @generated
	 */
	EaControlFlow createEaControlFlow();

	/**
	 * Returns a new object of class '<em>Ea Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea Organization</em>'.
	 * @generated
	 */
	EaOrganization createEaOrganization();

	/**
	 * Returns a new object of class '<em>Ea Atomic Extended Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea Atomic Extended Activity</em>'.
	 * @generated
	 */
	EaAtomicExtendedActivity createEaAtomicExtendedActivity();

	/**
	 * Returns a new object of class '<em>Ea Structural Extended Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea Structural Extended Activity</em>'.
	 * @generated
	 */
	EaStructuralExtendedActivity createEaStructuralExtendedActivity();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CoreElementsPackage getCoreElementsPackage();

} //CoreElementsFactory
