/**
 */
package activity;

import exploitation.RessourceType;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Model#getActivity <em>Activity</em>}</li>
 *   <li>{@link activity.Model#getRessourceType <em>Ressource Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference list.
	 * The list contents are of type {@link activity.ActivityPeriodic}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference list.
	 * @see activity.ActivityPackage#getModel_Activity()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityPeriodic> getActivity();

	/**
	 * Returns the value of the '<em><b>Ressource Type</b></em>' reference list.
	 * The list contents are of type {@link exploitation.RessourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ressource Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource Type</em>' reference list.
	 * @see activity.ActivityPackage#getModel_RessourceType()
	 * @model
	 * @generated
	 */
	EList<RessourceType> getRessourceType();

} // Model
