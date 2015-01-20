/**
 */
package activity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Check Done Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.CheckDoneActivity#getElapsedTime <em>Elapsed Time</em>}</li>
 *   <li>{@link activity.CheckDoneActivity#getEReference0 <em>EReference0</em>}</li>
 *   <li>{@link activity.CheckDoneActivity#getActivityToValidate <em>Activity To Validate</em>}</li>
 *   <li>{@link activity.CheckDoneActivity#getPeriodicityType <em>Periodicity Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getCheckDoneActivity()
 * @model
 * @generated
 */
public interface CheckDoneActivity extends Predicat {
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
	 * @see activity.ActivityPackage#getCheckDoneActivity_ElapsedTime()
	 * @model
	 * @generated
	 */
	int getElapsedTime();

	/**
	 * Sets the value of the '{@link activity.CheckDoneActivity#getElapsedTime <em>Elapsed Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elapsed Time</em>' attribute.
	 * @see #getElapsedTime()
	 * @generated
	 */
	void setElapsedTime(int value);

	/**
	 * Returns the value of the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EReference0</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EReference0</em>' reference.
	 * @see #setEReference0(CheckDoneActivity)
	 * @see activity.ActivityPackage#getCheckDoneActivity_EReference0()
	 * @model
	 * @generated
	 */
	CheckDoneActivity getEReference0();

	/**
	 * Sets the value of the '{@link activity.CheckDoneActivity#getEReference0 <em>EReference0</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EReference0</em>' reference.
	 * @see #getEReference0()
	 * @generated
	 */
	void setEReference0(CheckDoneActivity value);

	/**
	 * Returns the value of the '<em><b>Activity To Validate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity To Validate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity To Validate</em>' reference.
	 * @see #setActivityToValidate(PeriodicActivity)
	 * @see activity.ActivityPackage#getCheckDoneActivity_ActivityToValidate()
	 * @model
	 * @generated
	 */
	PeriodicActivity getActivityToValidate();

	/**
	 * Sets the value of the '{@link activity.CheckDoneActivity#getActivityToValidate <em>Activity To Validate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity To Validate</em>' reference.
	 * @see #getActivityToValidate()
	 * @generated
	 */
	void setActivityToValidate(PeriodicActivity value);

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
	 * @see activity.ActivityPackage#getCheckDoneActivity_PeriodicityType()
	 * @model dataType="activity.periodicity"
	 * @generated
	 */
	periodicity getPeriodicityType();

	/**
	 * Sets the value of the '{@link activity.CheckDoneActivity#getPeriodicityType <em>Periodicity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodicity Type</em>' attribute.
	 * @see activity.periodicity
	 * @see #getPeriodicityType()
	 * @generated
	 */
	void setPeriodicityType(periodicity value);

} // CheckDoneActivity
