/**
 */
package org.muml.storydiagram.expressions.common.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.storydiagram.expressions.common.expressions.And#getLeft <em>Left</em>}</li>
 *   <li>{@link org.muml.storydiagram.expressions.common.expressions.And#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.muml.storydiagram.expressions.common.expressions.ExpressionsPackage#getAnd()
 * @model
 * @generated
 */
public interface And extends LExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(LExpression)
   * @see org.muml.storydiagram.expressions.common.expressions.ExpressionsPackage#getAnd_Left()
   * @model containment="true"
   * @generated
   */
  LExpression getLeft();

  /**
   * Sets the value of the '{@link org.muml.storydiagram.expressions.common.expressions.And#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(LExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(LExpression)
   * @see org.muml.storydiagram.expressions.common.expressions.ExpressionsPackage#getAnd_Right()
   * @model containment="true"
   * @generated
   */
  LExpression getRight();

  /**
   * Sets the value of the '{@link org.muml.storydiagram.expressions.common.expressions.And#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(LExpression value);

} // And
