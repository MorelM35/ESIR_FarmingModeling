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
 *   <li>{@link activity.RessourceAllocation#getDuree <em>Duree</em>}</li>
 *   <li>{@link activity.RessourceAllocation#getRessource <em>Ressource</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getRessourceAllocation()
 * @model
 * @generated
 */
public interface RessourceAllocation extends EObject {
	/**
	 * Returns the value of the '<em><b>Duree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duree</em>' attribute.
	 * @see #setDuree(int)
	 * @see activity.ActivityPackage#getRessourceAllocation_Duree()
	 * @model
	 * @generated
	 */
	int getDuree();

	/**
	 * Sets the value of the '{@link activity.RessourceAllocation#getDuree <em>Duree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duree</em>' attribute.
	 * @see #getDuree()
	 * @generated
	 */
	void setDuree(int value);

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

} // RessourceAllocation
