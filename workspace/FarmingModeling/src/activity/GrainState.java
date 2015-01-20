/**
 */
package activity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grain State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.GrainState#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getGrainState()
 * @model
 * @generated
 */
public interface GrainState extends Predicat {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link activity.GrainStateEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see activity.GrainStateEnum
	 * @see #setState(GrainStateEnum)
	 * @see activity.ActivityPackage#getGrainState_State()
	 * @model
	 * @generated
	 */
	GrainStateEnum getState();

	/**
	 * Sets the value of the '{@link activity.GrainState#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see activity.GrainStateEnum
	 * @see #getState()
	 * @generated
	 */
	void setState(GrainStateEnum value);

} // GrainState
