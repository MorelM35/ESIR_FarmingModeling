/**
 */
package activity;

import exploitation.Atelier;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Periodic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.ActivityPeriodic#getName <em>Name</em>}</li>
 *   <li>{@link activity.ActivityPeriodic#getStart <em>Start</em>}</li>
 *   <li>{@link activity.ActivityPeriodic#getEnd <em>End</em>}</li>
 *   <li>{@link activity.ActivityPeriodic#getRule <em>Rule</em>}</li>
 *   <li>{@link activity.ActivityPeriodic#getResAllocation <em>Res Allocation</em>}</li>
 *   <li>{@link activity.ActivityPeriodic#getAtelier <em>Atelier</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getActivityPeriodic()
 * @model
 * @generated
 */
public interface ActivityPeriodic extends EObject {
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
	 * @see activity.ActivityPackage#getActivityPeriodic_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link activity.ActivityPeriodic#getName <em>Name</em>}' attribute.
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
	 * @see activity.ActivityPackage#getActivityPeriodic_Start()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link activity.ActivityPeriodic#getStart <em>Start</em>}' containment reference.
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
	 * @see activity.ActivityPackage#getActivityPeriodic_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link activity.ActivityPeriodic#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' reference list.
	 * The list contents are of type {@link activity.Rule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' reference list.
	 * @see activity.ActivityPackage#getActivityPeriodic_Rule()
	 * @model
	 * @generated
	 */
	EList<Rule> getRule();

	/**
	 * Returns the value of the '<em><b>Res Allocation</b></em>' reference list.
	 * The list contents are of type {@link activity.RessourceAllocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Res Allocation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Res Allocation</em>' reference list.
	 * @see activity.ActivityPackage#getActivityPeriodic_ResAllocation()
	 * @model
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
	 * @see activity.ActivityPackage#getActivityPeriodic_Atelier()
	 * @see exploitation.Atelier#getActivity
	 * @model opposite="activity"
	 * @generated
	 */
	Atelier getAtelier();

	/**
	 * Sets the value of the '{@link activity.ActivityPeriodic#getAtelier <em>Atelier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atelier</em>' reference.
	 * @see #getAtelier()
	 * @generated
	 */
	void setAtelier(Atelier value);

} // ActivityPeriodic
