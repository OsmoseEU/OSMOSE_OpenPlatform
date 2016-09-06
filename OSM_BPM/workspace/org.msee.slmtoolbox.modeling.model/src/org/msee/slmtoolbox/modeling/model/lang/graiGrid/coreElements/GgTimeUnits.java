/**
 */
package org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Gg Time Units</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.msee.slmtoolbox.modeling.model.lang.graiGrid.coreElements.CoreElementsPackage#getGgTimeUnits()
 * @model
 * @generated
 */
public enum GgTimeUnits implements Enumerator {
	/**
	 * The '<em><b>YEAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	YEAR(0, "YEAR", "Year"),

	/**
	 * The '<em><b>MONTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MONTH_VALUE
	 * @generated
	 * @ordered
	 */
	MONTH(1, "MONTH", "Month"),

	/**
	 * The '<em><b>WEEK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEEK_VALUE
	 * @generated
	 * @ordered
	 */
	WEEK(2, "WEEK", "Week"),

	/**
	 * The '<em><b>DAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAY_VALUE
	 * @generated
	 * @ordered
	 */
	DAY(3, "DAY", "Day");

	/**
	 * The '<em><b>YEAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YEAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YEAR
	 * @model literal="Year"
	 * @generated
	 * @ordered
	 */
	public static final int YEAR_VALUE = 0;

	/**
	 * The '<em><b>MONTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MONTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MONTH
	 * @model literal="Month"
	 * @generated
	 * @ordered
	 */
	public static final int MONTH_VALUE = 1;

	/**
	 * The '<em><b>WEEK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEEK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEEK
	 * @model literal="Week"
	 * @generated
	 * @ordered
	 */
	public static final int WEEK_VALUE = 2;

	/**
	 * The '<em><b>DAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAY
	 * @model literal="Day"
	 * @generated
	 * @ordered
	 */
	public static final int DAY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Gg Time Units</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GgTimeUnits[] VALUES_ARRAY =
		new GgTimeUnits[] {
			YEAR,
			MONTH,
			WEEK,
			DAY,
		};

	/**
	 * A public read-only list of all the '<em><b>Gg Time Units</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GgTimeUnits> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gg Time Units</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GgTimeUnits get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GgTimeUnits result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gg Time Units</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GgTimeUnits getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GgTimeUnits result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gg Time Units</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GgTimeUnits get(int value) {
		switch (value) {
			case YEAR_VALUE: return YEAR;
			case MONTH_VALUE: return MONTH;
			case WEEK_VALUE: return WEEK;
			case DAY_VALUE: return DAY;
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
	private GgTimeUnits(int value, String name, String literal) {
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
	
} //GgTimeUnits
