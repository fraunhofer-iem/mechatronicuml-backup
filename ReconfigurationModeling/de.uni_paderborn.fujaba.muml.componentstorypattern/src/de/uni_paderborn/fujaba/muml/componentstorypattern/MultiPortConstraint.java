/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Port Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortConstraint#getTgtSubPortVariable <em>Tgt Sub Port Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getMultiPortConstraint()
 * @model
 * @generated
 */
public interface MultiPortConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Tgt Sub Port Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tgt Sub Port Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tgt Sub Port Variable</em>' reference.
	 * @see #setTgtSubPortVariable(SinglePortVariable)
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getMultiPortConstraint_TgtSubPortVariable()
	 * @model required="true"
	 * @generated
	 */
	SinglePortVariable getTgtSubPortVariable();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortConstraint#getTgtSubPortVariable <em>Tgt Sub Port Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt Sub Port Variable</em>' reference.
	 * @see #getTgtSubPortVariable()
	 * @generated
	 */
	void setTgtSubPortVariable(SinglePortVariable value);

} // MultiPortConstraint
