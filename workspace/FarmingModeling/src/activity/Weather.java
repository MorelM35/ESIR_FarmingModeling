/**
 */
package activity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weather</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Weather#getComparator <em>Comparator</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getWeather()
 * @model abstract="true"
 * @generated
 */
public interface Weather extends Predicat {
	/**
	 * Returns the value of the '<em><b>Comparator</b></em>' attribute.
	 * The literals are from the enumeration {@link activity.ComparatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparator</em>' attribute.
	 * @see activity.ComparatorType
	 * @see #setComparator(ComparatorType)
	 * @see activity.ActivityPackage#getWeather_Comparator()
	 * @model
	 * @generated
	 */
	ComparatorType getComparator();

	/**
	 * Sets the value of the '{@link activity.Weather#getComparator <em>Comparator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparator</em>' attribute.
	 * @see activity.ComparatorType
	 * @see #getComparator()
	 * @generated
	 */
	void setComparator(ComparatorType value);

} // Weather
