/**
 */
package org.msee.slmtoolbox.modeling.model.ssm.bsm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resource Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.msee.slmtoolbox.modeling.model.ssm.bsm.BsmPackage#getBsmResourceType()
 * @model
 * @generated
 */
public enum BsmResourceType implements Enumerator {
	/**
	 * The '<em><b>Physical Mean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_MEAN_VALUE
	 * @generated
	 * @ordered
	 */
	PHYSICAL_MEAN(0, "physicalMean", "physicalMean"),

	/**
	 * The '<em><b>IT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IT_VALUE
	 * @generated
	 * @ordered
	 */
	IT(1, "IT", "IT"),

	/**
	 * The '<em><b>Human</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMAN_VALUE
	 * @generated
	 * @ordered
	 */
	HUMAN(2, "human", "human"),

	/**
	 * The '<em><b>Undefined</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	UNDEFINED(3, "undefined", "undefined");

	/**
	 * The '<em><b>Physical Mean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Physical Mean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHYSICAL_MEAN
	 * @model name="physicalMean"
	 * @generated
	 * @ordered
	 */
	public static final int PHYSICAL_MEAN_VALUE = 0;

	/**
	 * The '<em><b>IT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IT_VALUE = 1;

	/**
	 * The '<em><b>Human</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Human</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HUMAN
	 * @model name="human"
	 * @generated
	 * @ordered
	 */
	public static final int HUMAN_VALUE = 2;

	/**
	 * The '<em><b>Undefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Undefined</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED
	 * @model name="undefined"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Resource Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BsmResourceType[] VALUES_ARRAY =
		new BsmResourceType[] {
			PHYSICAL_MEAN,
			IT,
			HUMAN,
			UNDEFINED,
		};

	/**
	 * A public read-only list of all the '<em><b>Resource Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BsmResourceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BsmResourceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BsmResourceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BsmResourceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BsmResourceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BsmResourceType get(int value) {
		switch (value) {
			case PHYSICAL_MEAN_VALUE: return PHYSICAL_MEAN;
			case IT_VALUE: return IT;
			case HUMAN_VALUE: return HUMAN;
			case UNDEFINED_VALUE: return UNDEFINED;
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
	private BsmResourceType(int value, String name, String literal) {
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
	
} //BsmResourceType
