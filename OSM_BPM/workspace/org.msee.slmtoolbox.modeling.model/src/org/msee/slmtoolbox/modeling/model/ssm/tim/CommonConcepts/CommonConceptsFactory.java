/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.CommonConceptsPackage
 * @generated
 */
public interface CommonConceptsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonConceptsFactory eINSTANCE = org.msee.slmtoolbox.modeling.model.ssm.tim.CommonConcepts.impl.CommonConceptsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tim Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tim Service</em>'.
	 * @generated
	 */
	TimService createTimService();

	/**
	 * Returns a new object of class '<em>Tim Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tim Process</em>'.
	 * @generated
	 */
	TimProcess createTimProcess();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CommonConceptsPackage getCommonConceptsPackage();

} //CommonConceptsFactory
