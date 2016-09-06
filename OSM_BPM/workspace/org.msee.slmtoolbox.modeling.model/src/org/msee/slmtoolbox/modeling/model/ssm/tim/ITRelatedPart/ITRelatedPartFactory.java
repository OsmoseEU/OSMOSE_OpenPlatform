/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.ITRelatedPartPackage
 * @generated
 */
public interface ITRelatedPartFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ITRelatedPartFactory eINSTANCE = org.msee.slmtoolbox.modeling.model.ssm.tim.ITRelatedPart.impl.ITRelatedPartFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Tim Enterprise Application Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tim Enterprise Application Resource</em>'.
	 * @generated
	 */
	TimEnterpriseApplicationResource createTimEnterpriseApplicationResource();

	/**
	 * Returns a new object of class '<em>Tim Information Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tim Information Set</em>'.
	 * @generated
	 */
	TimInformationSet createTimInformationSet();

	/**
	 * Returns a new object of class '<em>Tim Information Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tim Information Entity</em>'.
	 * @generated
	 */
	TimInformationEntity createTimInformationEntity();

	/**
	 * Returns a new object of class '<em>Tim Information Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tim Information Relationship</em>'.
	 * @generated
	 */
	TimInformationRelationship createTimInformationRelationship();

	/**
	 * Returns a new object of class '<em>Tim Information Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tim Information Attribute</em>'.
	 * @generated
	 */
	TimInformationAttribute createTimInformationAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ITRelatedPartPackage getITRelatedPartPackage();

} //ITRelatedPartFactory
