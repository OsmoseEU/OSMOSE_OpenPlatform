/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.root;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.root.RootPackage
 * @generated
 */
public interface RootFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RootFactory eINSTANCE = org.msee.slmtoolbox.modeling.model.lang.eaStar.root.impl.RootFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ea Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ea Model</em>'.
	 * @generated
	 */
	EaModel createEaModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RootPackage getRootPackage();

} //RootFactory
