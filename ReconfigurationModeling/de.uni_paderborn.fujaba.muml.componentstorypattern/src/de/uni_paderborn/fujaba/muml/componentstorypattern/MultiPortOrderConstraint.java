/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Port Order Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint#getMultiPortVariable <em>Multi Port Variable</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint#getSrcSubPortVariable <em>Src Sub Port Variable</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint#getOrderConstraintType <em>Order Constraint Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint#getTgtSubPortVariable <em>Tgt Sub Port Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getMultiPortOrderConstraint()
 * @model
 * @generated
 */
public interface MultiPortOrderConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Multi Port Variable</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable#getOrderConstraints <em>Order Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Port Variable</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Port Variable</em>' container reference.
	 * @see #setMultiPortVariable(MultiPortVariable)
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getMultiPortOrderConstraint_MultiPortVariable()
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable#getOrderConstraints
	 * @model opposite="orderConstraints" required="true" transient="false"
	 * @generated
	 */
	MultiPortVariable getMultiPortVariable();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint#getMultiPortVariable <em>Multi Port Variable</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Port Variable</em>' container reference.
	 * @see #getMultiPortVariable()
	 * @generated
	 */
	void setMultiPortVariable(MultiPortVariable value);

	/**
	 * Returns the value of the '<em><b>Src Sub Port Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src Sub Port Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src Sub Port Variable</em>' reference.
	 * @see #setSrcSubPortVariable(SinglePortVariable)
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getMultiPortOrderConstraint_SrcSubPortVariable()
	 * @model required="true"
	 * @generated
	 */
	SinglePortVariable getSrcSubPortVariable();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint#getSrcSubPortVariable <em>Src Sub Port Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src Sub Port Variable</em>' reference.
	 * @see #getSrcSubPortVariable()
	 * @generated
	 */
	void setSrcSubPortVariable(SinglePortVariable value);

	/**
	 * Returns the value of the '<em><b>Order Constraint Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraintType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order Constraint Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order Constraint Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraintType
	 * @see #setOrderConstraintType(MultiPortOrderConstraintType)
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getMultiPortOrderConstraint_OrderConstraintType()
	 * @model
	 * @generated
	 */
	MultiPortOrderConstraintType getOrderConstraintType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint#getOrderConstraintType <em>Order Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order Constraint Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraintType
	 * @see #getOrderConstraintType()
	 * @generated
	 */
	void setOrderConstraintType(MultiPortOrderConstraintType value);

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
	 * @see de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage#getMultiPortOrderConstraint_TgtSubPortVariable()
	 * @model required="true"
	 * @generated
	 */
	SinglePortVariable getTgtSubPortVariable();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortOrderConstraint#getTgtSubPortVariable <em>Tgt Sub Port Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tgt Sub Port Variable</em>' reference.
	 * @see #getTgtSubPortVariable()
	 * @generated
	 */
	void setTgtSubPortVariable(SinglePortVariable value);

} // MultiPortOrderConstraint
