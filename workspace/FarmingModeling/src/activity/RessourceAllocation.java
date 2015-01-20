/**
 */
package activity;

import exploitation.Ressource;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ressource Allocation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.RessourceAllocation#getDuration <em>Duration</em>}</li>
 *   <li>{@link activity.RessourceAllocation#getRessource <em>Ressource</em>}</li>
 *   <li>{@link activity.RessourceAllocation#getPeriodicityType <em>Periodicity Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getRessourceAllocation()
 * @model
 * @generated
 */
public interface RessourceAllocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see activity.ActivityPackage#getRessourceAllocation_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link activity.RessourceAllocation#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link exploitation.Ressource#getResAllocation <em>Res Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ressource</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' reference.
	 * @see #setRessource(Ressource)
	 * @see activity.ActivityPackage#getRessourceAllocation_Ressource()
	 * @see exploitation.Ressource#getResAllocation
	 * @model opposite="resAllocation" required="true"
	 * @generated
	 */
	Ressource getRessource();

	/**
	 * Sets the value of the '{@link activity.RessourceAllocation#getRessource <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource</em>' reference.
	 * @see #getRessource()
	 * @generated
	 */
	void setRessource(Ressource value);

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
	 * @see activity.ActivityPackage#getRessourceAllocation_PeriodicityType()
	 * @model dataType="activity.periodicity"
	 * @generated
	 */
	periodicity getPeriodicityType();

	/**
	 * Sets the value of the '{@link activity.RessourceAllocation#getPeriodicityType <em>Periodicity Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Periodicity Type</em>' attribute.
	 * @see activity.periodicity
	 * @see #getPeriodicityType()
	 * @generated
	 */
	void setPeriodicityType(periodicity value);

} // RessourceAllocation
