/**
 */
package activity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Comparator Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see activity.ActivityPackage#getComparatorType()
 * @model
 * @generated
 */
public enum ComparatorType implements Enumerator {
	/**
	 * The '<em><b>Inferior</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFERIOR_VALUE
	 * @generated
	 * @ordered
	 */
	INFERIOR(0, "inferior", "inferior"),

	/**
	 * The '<em><b>Inferior Or Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFERIOR_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	INFERIOR_OR_EQUAL(1, "inferiorOrEqual", "inferiorOrEqual"),

	/**
	 * The '<em><b>Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL(2, "equal", "equal"),

	/**
	 * The '<em><b>Different</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIFFERENT_VALUE
	 * @generated
	 * @ordered
	 */
	DIFFERENT(3, "different", "different"),

	/**
	 * The '<em><b>Superior</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPERIOR_VALUE
	 * @generated
	 * @ordered
	 */
	SUPERIOR(4, "superior", "superior"),

	/**
	 * The '<em><b>Superior Or Equal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPERIOR_OR_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	SUPERIOR_OR_EQUAL(5, "superiorOrEqual", "superiorOrEqual");

	/**
	 * The '<em><b>Inferior</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inferior</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFERIOR
	 * @model name="inferior"
	 * @generated
	 * @ordered
	 */
	public static final int INFERIOR_VALUE = 0;

	/**
	 * The '<em><b>Inferior Or Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Inferior Or Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INFERIOR_OR_EQUAL
	 * @model name="inferiorOrEqual"
	 * @generated
	 * @ordered
	 */
	public static final int INFERIOR_OR_EQUAL_VALUE = 1;

	/**
	 * The '<em><b>Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL
	 * @model name="equal"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_VALUE = 2;

	/**
	 * The '<em><b>Different</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Different</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIFFERENT
	 * @model name="different"
	 * @generated
	 * @ordered
	 */
	public static final int DIFFERENT_VALUE = 3;

	/**
	 * The '<em><b>Superior</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Superior</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPERIOR
	 * @model name="superior"
	 * @generated
	 * @ordered
	 */
	public static final int SUPERIOR_VALUE = 4;

	/**
	 * The '<em><b>Superior Or Equal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Superior Or Equal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPERIOR_OR_EQUAL
	 * @model name="superiorOrEqual"
	 * @generated
	 * @ordered
	 */
	public static final int SUPERIOR_OR_EQUAL_VALUE = 5;

	/**
	 * An array of all the '<em><b>Comparator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComparatorType[] VALUES_ARRAY =
		new ComparatorType[] {
			INFERIOR,
			INFERIOR_OR_EQUAL,
			EQUAL,
			DIFFERENT,
			SUPERIOR,
			SUPERIOR_OR_EQUAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Comparator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComparatorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Comparator Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComparatorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComparatorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparator Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComparatorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComparatorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Comparator Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComparatorType get(int value) {
		switch (value) {
			case INFERIOR_VALUE: return INFERIOR;
			case INFERIOR_OR_EQUAL_VALUE: return INFERIOR_OR_EQUAL;
			case EQUAL_VALUE: return EQUAL;
			case DIFFERENT_VALUE: return DIFFERENT;
			case SUPERIOR_VALUE: return SUPERIOR;
			case SUPERIOR_OR_EQUAL_VALUE: return SUPERIOR_OR_EQUAL;
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
	private ComparatorType(int value, String name, String literal) {
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
	
} //ComparatorType
