/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.GeneralElementsPackage
 * @generated
 */
public interface GeneralElementsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeneralElementsFactory eINSTANCE = org.msee.slmtoolbox.modeling.model.lang.graiGrid.generalElements.impl.GeneralElementsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gg Grai Grid</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gg Grai Grid</em>'.
	 * @generated
	 */
	GgGraiGrid createGgGraiGrid();

	/**
	 * Returns a new object of class '<em>Gg Organization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gg Organization</em>'.
	 * @generated
	 */
	GgOrganization createGgOrganization();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GeneralElementsPackage getGeneralElementsPackage();

} //GeneralElementsFactory
