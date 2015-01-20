/**
 */
package activity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>No Rain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.NoRain#getElapsedTime <em>Elapsed Time</em>}</li>
 *   <li>{@link activity.NoRain#getPeriodicityType <em>Periodicity Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getNoRain()
 * @model
 * @generated
 */
public interface NoRain extends Predicat {
	/**
	 * Returns the value of the '<em><b>Elapsed Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elapsed Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elapsed Time</em>' attribute.
	 * @see #setElapsedTime(int)
	 * @see activity.ActivityPackage#getNoRain_ElapsedTime()
	 * @model
	 * @generated
	 */
	int getElapsedTime();

	/**
	 * Sets the value of the '{@link activity.NoRain#getElapsedTime <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elapsed Time</em>' attribute.
	 * @see #getElapsedTime()
	 * @generated
	 */
	void setElapsedTime(int value);

	/**
	 * Returns the value of the '<em><b>Periodicity Type</b></em>' attribute.
	 * The literals are from the enumeration {@link activity.periodicity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Periodicity Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Periodicity Type</em>' attribute.
	 * @see activity.periodicity
	 * @see #setPeriodicityType(periodicity)
	 * @see activity.ActivityPackage#getNoRain_PeriodicityType()
	 * @model dataType="activity.periodicity"
	 * @generated
	 */
	periodicity getPeriodicityType();

	/**
	 * Sets the value of the '{@link activity.NoRain#getPeriodicityType <em>Periodicity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodicity Type</em>' attribute.
	 * @see activity.periodicity
	 * @see #getPeriodicityType()
	 * @generated
	 */
	void setPeriodicityType(periodicity value);

} // NoRain
