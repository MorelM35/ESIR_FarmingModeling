/**
 */
package activity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Precipitation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Precipitation#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getPrecipitation()
 * @model
 * @generated
 */
public interface Precipitation extends Weather {
	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see activity.ActivityPackage#getPrecipitation_Height()
	 * @model
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link activity.Precipitation#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

} // Precipitation
