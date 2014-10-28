/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Port Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable#getMultiPortVariable <em>Multi Port Variable</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable#getPositionConstraints <em>Position Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getSinglePortVariable()
 * @model
 * @generated
 */
public interface SinglePortVariable extends PortVariable {
	/**
	 * Returns the value of the '<em><b>Multi Port Variable</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable#getSubPortVariables <em>Sub Port Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Port Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Port Variable</em>' reference.
	 * @see #setMultiPortVariable(MultiPortVariable)
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getSinglePortVariable_MultiPortVariable()
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable#getSubPortVariables
	 * @model opposite="subPortVariables"
	 * @generated
	 */
	MultiPortVariable getMultiPortVariable();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable#getMultiPortVariable <em>Multi Port Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Port Variable</em>' reference.
	 * @see #getMultiPortVariable()
	 * @generated
	 */
	void setMultiPortVariable(MultiPortVariable value);

	/**
	 * Returns the value of the '<em><b>Position Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraint}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraint#getSubPortVariable <em>Sub Port Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Constraints</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getSinglePortVariable_PositionConstraints()
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraint#getSubPortVariable
	 * @model opposite="subPortVariable" containment="true"
	 * @generated
	 */
	EList<MultiPortPositionConstraint> getPositionConstraints();

} // SinglePortVariable
