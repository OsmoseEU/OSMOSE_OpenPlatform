/**
 */
package org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ea Resource Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.msee.slmtoolbox.modeling.model.lang.eaStar.coreElements.CoreElementsPackage#getEaResourceRole()
 * @model
 * @generated
 */
public enum EaResourceRole implements Enumerator {
	/**
	 * The '<em><b>Responsible For</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESPONSIBLE_FOR_VALUE
	 * @generated
	 * @ordered
	 */
	RESPONSIBLE_FOR(0, "responsibleFor", "responsibleFor"),

	/**
	 * The '<em><b>Participates In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARTICIPATES_IN_VALUE
	 * @generated
	 * @ordered
	 */
	PARTICIPATES_IN(1, "participatesIn", "participatesIn");

	/**
	 * The '<em><b>Responsible For</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Responsible For</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESPONSIBLE_FOR
	 * @model name="responsibleFor"
	 * @generated
	 * @ordered
	 */
	public static final int RESPONSIBLE_FOR_VALUE = 0;

	/**
	 * The '<em><b>Participates In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Participates In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARTICIPATES_IN
	 * @model name="participatesIn"
	 * @generated
	 * @ordered
	 */
	public static final int PARTICIPATES_IN_VALUE = 1;

	/**
	 * An array of all the '<em><b>Ea Resource Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EaResourceRole[] VALUES_ARRAY =
		new EaResourceRole[] {
			RESPONSIBLE_FOR,
			PARTICIPATES_IN,
		};

	/**
	 * A public read-only list of all the '<em><b>Ea Resource Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EaResourceRole> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Ea Resource Role</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EaResourceRole get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EaResourceRole result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ea Resource Role</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EaResourceRole getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EaResourceRole result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Ea Resource Role</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EaResourceRole get(int value) {
		switch (value) {
			case RESPONSIBLE_FOR_VALUE: return RESPONSIBLE_FOR;
			case PARTICIPATES_IN_VALUE: return PARTICIPATES_IN;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EaResourceRole(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EaResourceRole
