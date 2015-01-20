/**
 */
package activity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Predicat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Predicat#getDate <em>Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getPredicat()
 * @model
 * @generated
 */
public interface Predicat extends Rule {
	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see activity.ActivityPackage#getPredicat_Date()
	 * @model containment="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link activity.Predicat#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

} // Predicat
