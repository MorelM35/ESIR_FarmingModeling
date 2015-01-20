/**
 */
package activity;

import exploitation.Atelier;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodic Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.PeriodicActivity#getName <em>Name</em>}</li>
 *   <li>{@link activity.PeriodicActivity#getStart <em>Start</em>}</li>
 *   <li>{@link activity.PeriodicActivity#getEnd <em>End</em>}</li>
 *   <li>{@link activity.PeriodicActivity#getRule <em>Rule</em>}</li>
 *   <li>{@link activity.PeriodicActivity#getResAllocation <em>Res Allocation</em>}</li>
 *   <li>{@link activity.PeriodicActivity#getAtelier <em>Atelier</em>}</li>
 *   <li>{@link activity.PeriodicActivity#getPeriodicityType <em>Periodicity Type</em>}</li>
 *   <li>{@link activity.PeriodicActivity#getFrequency <em>Frequency</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getPeriodicActivity()
 * @model
 * @generated
 */
public interface PeriodicActivity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see activity.ActivityPackage#getPeriodicActivity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link activity.PeriodicActivity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Date)
	 * @see activity.ActivityPackage#getPeriodicActivity_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link activity.PeriodicActivity#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Date)
	 * @see activity.ActivityPackage#getPeriodicActivity_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link activity.PeriodicActivity#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' containment reference list.
	 * The list contents are of type {@link activity.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' containment reference list.
	 * @see activity.ActivityPackage#getPeriodicActivity_Rule()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRule();

	/**
	 * Returns the value of the '<em><b>Res Allocation</b></em>' containment reference list.
	 * The list contents are of type {@link activity.RessourceAllocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Allocation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Allocation</em>' containment reference list.
	 * @see activity.ActivityPackage#getPeriodicActivity_ResAllocation()
	 * @model containment="true"
	 * @generated
	 */
	EList<RessourceAllocation> getResAllocation();

	/**
	 * Returns the value of the '<em><b>Atelier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link exploitation.Atelier#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Atelier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atelier</em>' reference.
	 * @see #setAtelier(Atelier)
	 * @see activity.ActivityPackage#getPeriodicActivity_Atelier()
	 * @see exploitation.Atelier#getActivity
	 * @model opposite="activity"
	 * @generated
	 */
	Atelier getAtelier();

	/**
	 * Sets the value of the '{@link activity.PeriodicActivity#getAtelier <em>Atelier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atelier</em>' reference.
	 * @see #getAtelier()
	 * @generated
	 */
	void setAtelier(Atelier value);

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
	 * @see activity.ActivityPackage#getPeriodicActivity_PeriodicityType()
	 * @model dataType="activity.periodicity"
	 * @generated
	 */
	periodicity getPeriodicityType();

	/**
	 * Sets the value of the '{@link activity.PeriodicActivity#getPeriodicityType <em>Periodicity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodicity Type</em>' attribute.
	 * @see activity.periodicity
	 * @see #getPeriodicityType()
	 * @generated
	 */
	void setPeriodicityType(periodicity value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #setFrequency(int)
	 * @see activity.ActivityPackage#getPeriodicActivity_Frequency()
	 * @model default="1"
	 * @generated
	 */
	int getFrequency();

	/**
	 * Sets the value of the '{@link activity.PeriodicActivity#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(int value);

} // PeriodicActivity
