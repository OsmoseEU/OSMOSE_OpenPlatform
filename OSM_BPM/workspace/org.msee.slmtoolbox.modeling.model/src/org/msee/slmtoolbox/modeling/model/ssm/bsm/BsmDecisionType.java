/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Decision Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmDecisionType()
 * @model
 * @generated
 */
public enum BsmDecisionType implements Enumerator {
	/**
	 * The '<em><b>Periodic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERIODIC_VALUE
	 * @generated
	 * @ordered
	 */
	PERIODIC(0, "periodic", "periodic"),

	/**
	 * The '<em><b>Event Based</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EVENT_BASED_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT_BASED(1, "eventBased", "eventBased");

	/**
	 * The '<em><b>Periodic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Periodic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERIODIC
	 * @model name="periodic"
	 * @generated
	 * @ordered
	 */
	public static final int PERIODIC_VALUE = 0;

	/**
	 * The '<em><b>Event Based</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Event Based</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EVENT_BASED
	 * @model name="eventBased"
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_BASED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Decision Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BsmDecisionType[] VALUES_ARRAY =
		new BsmDecisionType[] {
			PERIODIC,
			EVENT_BASED,
		};

	/**
	 * A public read-only list of all the '<em><b>Decision Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BsmDecisionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Decision Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BsmDecisionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BsmDecisionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decision Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BsmDecisionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BsmDecisionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Decision Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BsmDecisionType get(int value) {
		switch (value) {
			case PERIODIC_VALUE: return PERIODIC;
			case EVENT_BASED_VALUE: return EVENT_BASED;
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
	private BsmDecisionType(int value, String name, String literal) {
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
	
} //BsmDecisionType
