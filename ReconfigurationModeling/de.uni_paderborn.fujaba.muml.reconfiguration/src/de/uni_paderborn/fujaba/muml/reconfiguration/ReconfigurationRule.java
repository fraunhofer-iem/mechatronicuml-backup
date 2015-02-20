/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import org.storydriven.core.CommentableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reconfiguration rule describes a modification of the internal structure of a 
 * reconfigurable component. It has a Signature that defines the name of the 
 * reconfiguration rule as well as its input and output parameters.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getReconfiguredComponent <em>Reconfigured Component</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getSignature <em>Signature</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationRule()
 * @model abstract="true"
 * @generated
 */
public interface ReconfigurationRule extends CommentableElement {
	/**
	 * Returns the value of the '<em><b>Reconfigured Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfigured Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The component on which the reconfiguration rule is to be applied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reconfigured Component</em>' reference.
	 * @see #setReconfiguredComponent(ReconfigurableComponent)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationRule_ReconfiguredComponent()
	 * @model required="true"
	 * @generated
	 */
	ReconfigurableComponent getReconfiguredComponent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getReconfiguredComponent <em>Reconfigured Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfigured Component</em>' reference.
	 * @see #getReconfiguredComponent()
	 * @generated
	 */
	void setReconfiguredComponent(ReconfigurableComponent value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.Signature#getReconfigurationRule <em>Reconfiguration Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The signature of the reconfiguration rule that defines the name as well as the
	 * input and output parameters of this reconfiguration rule.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference.
	 * @see #setSignature(Signature)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationRule_Signature()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.Signature#getReconfigurationRule
	 * @model opposite="reconfigurationRule" containment="true" required="true"
	 * @generated
	 */
	Signature getSignature();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule#getSignature <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' containment reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derives the name of the reconfiguration rule from the signature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationRule_Name()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if self.signature.oclIsUndefined() then null else self.signature.name endif'"
	 * @generated
	 */
	String getName();

} // ReconfigurationRule
