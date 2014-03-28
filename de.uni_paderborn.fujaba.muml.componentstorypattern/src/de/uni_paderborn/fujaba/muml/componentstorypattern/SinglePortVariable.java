/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Port Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable#getMultiPortVariable <em>Multi Port Variable</em>}</li>
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

} // SinglePortVariable
