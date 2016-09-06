/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage
 * @generated
 */
public interface CoreElementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CoreElementsFactory eINSTANCE = org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.impl.CoreElementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gg Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gg Function</em>'.
	 * @generated
	 */
	GgFunction createGgFunction();

	/**
	 * Returns a new object of class '<em>Gg Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gg Level</em>'.
	 * @generated
	 */
	GgLevel createGgLevel();

	/**
	 * Returns a new object of class '<em>Gg Decision Frame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gg Decision Frame</em>'.
	 * @generated
	 */
	GgDecisionFrame createGgDecisionFrame();

	/**
	 * Returns a new object of class '<em>Gg Information Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gg Information Flow</em>'.
	 * @generated
	 */
	GgInformationFlow createGgInformationFlow();

	/**
	 * Returns a new object of class '<em>Gg Decision Center</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gg Decision Center</em>'.
	 * @generated
	 */
	GgDecisionCenter createGgDecisionCenter();

	/**
	 * Returns a new object of class '<em>Gg Time Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gg Time Value</em>'.
	 * @generated
	 */
	GgTimeValue createGgTimeValue();

	/**
	 * Returns a new object of class '<em>Gg External Information Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gg External Information Source</em>'.
	 * @generated
	 */
	GgExternalInformationSource createGgExternalInformationSource();

	/**
	 * Returns a new object of class '<em>Gg Internal Information Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gg Internal Information Source</em>'.
	 * @generated
	 */
	GgInternalInformationSource createGgInternalInformationSource();

	/**
	 * Returns a new object of class '<em>Gg Information Center</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gg Information Center</em>'.
	 * @generated
	 */
	GgInformationCenter createGgInformationCenter();

	/**
	 * Returns a new object of class '<em>Gg Collaborative Decision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gg Collaborative Decision</em>'.
	 * @generated
	 */
	GgCollaborativeDecision createGgCollaborativeDecision();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CoreElementsPackage getCoreElementsPackage();

} //CoreElementsFactory
