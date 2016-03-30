/**
 */
package org.muml.reconfiguration.componentstorypattern;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Port Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.SinglePortVariable#getMultiPortVariable <em>Multi Port Variable</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorypattern.SinglePortVariable#getPositionConstraints <em>Position Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getSinglePortVariable()
 * @model
 * @generated
 */
public interface SinglePortVariable extends PortVariable {
	/**
	 * Returns the value of the '<em><b>Multi Port Variable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.muml.reconfiguration.componentstorypattern.MultiPortVariable#getSubPortVariables <em>Sub Port Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Port Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Port Variable</em>' reference.
	 * @see #setMultiPortVariable(MultiPortVariable)
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getSinglePortVariable_MultiPortVariable()
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortVariable#getSubPortVariables
	 * @model opposite="subPortVariables"
	 * @generated
	 */
	MultiPortVariable getMultiPortVariable();

	/**
	 * Sets the value of the '{@link org.muml.reconfiguration.componentstorypattern.SinglePortVariable#getMultiPortVariable <em>Multi Port Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Port Variable</em>' reference.
	 * @see #getMultiPortVariable()
	 * @generated
	 */
	void setMultiPortVariable(MultiPortVariable value);

	/**
	 * Returns the value of the '<em><b>Position Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraint}.
	 * It is bidirectional and its opposite is '{@link org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraint#getSubPortVariable <em>Sub Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Constraints</em>' containment reference list.
	 * @see org.muml.reconfiguration.componentstorypattern.ComponentstorypatternPackage#getSinglePortVariable_PositionConstraints()
	 * @see org.muml.reconfiguration.componentstorypattern.MultiPortPositionConstraint#getSubPortVariable
	 * @model opposite="subPortVariable" containment="true"
	 * @generated
	 */
	EList<MultiPortPositionConstraint> getPositionConstraints();

} // SinglePortVariable
