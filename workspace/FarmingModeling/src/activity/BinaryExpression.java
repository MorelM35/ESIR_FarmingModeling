/**
 */
package activity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activity.BinaryExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link activity.BinaryExpression#getRight <em>Right</em>}</li>
 *   <li>{@link activity.BinaryExpression#getOpe <em>Ope</em>}</li>
 * </ul>
 * </p>
 *
 * @see activity.ActivityPackage#getBinaryExpression()
 * @model
 * @generated
 */
public interface BinaryExpression extends Rule {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Rule)
	 * @see activity.ActivityPackage#getBinaryExpression_Left()
	 * @model containment="true"
	 * @generated
	 */
	Rule getLeft();

	/**
	 * Sets the value of the '{@link activity.BinaryExpression#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Rule value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Rule)
	 * @see activity.ActivityPackage#getBinaryExpression_Right()
	 * @model containment="true"
	 * @generated
	 */
	Rule getRight();

	/**
	 * Sets the value of the '{@link activity.BinaryExpression#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Rule value);

	/**
	 * Returns the value of the '<em><b>Ope</b></em>' attribute.
	 * The literals are from the enumeration {@link activity.BinaryExpressionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ope</em>' attribute.
	 * @see activity.BinaryExpressionType
	 * @see #setOpe(BinaryExpressionType)
	 * @see activity.ActivityPackage#getBinaryExpression_Ope()
	 * @model
	 * @generated
	 */
	BinaryExpressionType getOpe();

	/**
	 * Sets the value of the '{@link activity.BinaryExpression#getOpe <em>Ope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ope</em>' attribute.
	 * @see activity.BinaryExpressionType
	 * @see #getOpe()
	 * @generated
	 */
	void setOpe(BinaryExpressionType value);

} // BinaryExpression
