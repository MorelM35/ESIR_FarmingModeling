/**
 */
package activity;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Launcher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.Launcher#getBegin <em>Begin</em>}</li>
 *   <li>{@link activity.Launcher#getEnd <em>End</em>}</li>
 *   <li>{@link activity.Launcher#getQMax <em>QMax</em>}</li>
 *   <li>{@link activity.Launcher#getQuantityOfWater <em>Quantity Of Water</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getLauncher()
 * @model
 * @generated
 */
public interface Launcher extends EObject {
	/**
	 * Returns the value of the '<em><b>Begin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Begin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Begin</em>' containment reference.
	 * @see #setBegin(Date)
	 * @see activity.ActivityPackage#getLauncher_Begin()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Date getBegin();

	/**
	 * Sets the value of the '{@link activity.Launcher#getBegin <em>Begin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Begin</em>' containment reference.
	 * @see #getBegin()
	 * @generated
	 */
	void setBegin(Date value);

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
	 * @see activity.ActivityPackage#getLauncher_End()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link activity.Launcher#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

	/**
	 * Returns the value of the '<em><b>QMax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>QMax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>QMax</em>' attribute.
	 * @see #setQMax(int)
	 * @see activity.ActivityPackage#getLauncher_QMax()
	 * @model
	 * @generated
	 */
	int getQMax();

	/**
	 * Sets the value of the '{@link activity.Launcher#getQMax <em>QMax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>QMax</em>' attribute.
	 * @see #getQMax()
	 * @generated
	 */
	void setQMax(int value);

	/**
	 * Returns the value of the '<em><b>Quantity Of Water</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Of Water</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Of Water</em>' attribute.
	 * @see #setQuantityOfWater(int)
	 * @see activity.ActivityPackage#getLauncher_QuantityOfWater()
	 * @model
	 * @generated
	 */
	int getQuantityOfWater();

	/**
	 * Sets the value of the '{@link activity.Launcher#getQuantityOfWater <em>Quantity Of Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity Of Water</em>' attribute.
	 * @see #getQuantityOfWater()
	 * @generated
	 */
	void setQuantityOfWater(int value);

} // Launcher
