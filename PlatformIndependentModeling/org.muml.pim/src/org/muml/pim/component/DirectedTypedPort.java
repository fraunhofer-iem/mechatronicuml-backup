/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component;

import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.behavior.TypedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Typed Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Directed typed port is the common super class of continuous and hybrid ports. 
 * A directed typed port has a direction (either IN or OUT) and specifies a data type.
 * At present, we only support primitive and array data types, where the array elements
 * need to have a primitive type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.component.DirectedTypedPort#getKind <em>Kind</em>}</li>
 *   <li>{@link org.muml.pim.component.DirectedTypedPort#isOptional <em>Optional</em>}</li>
 *   <li>{@link org.muml.pim.component.DirectedTypedPort#isOutPort <em>Out Port</em>}</li>
 *   <li>{@link org.muml.pim.component.DirectedTypedPort#isInPort <em>In Port</em>}</li>
 *   <li>{@link org.muml.pim.component.DirectedTypedPort#getInitializeExpression <em>Initialize Expression</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.component.ComponentPackage#getDirectedTypedPort()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InitializeExpressionOnlyForOutPorts'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL InitializeExpressionOnlyForOutPorts='-- Only out ports may have an initialize expression.\nself.kind <> component::PortDirectionKind::OUT implies self.initializeExpression.oclIsUndefined()'"
 * @generated
 */
public interface DirectedTypedPort extends Port, TypedNamedElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.muml.pim.component.PortDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the direction of this directed typed port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.muml.pim.component.PortDirectionKind
	 * @see #setKind(PortDirectionKind)
	 * @see org.muml.pim.component.ComponentPackage#getDirectedTypedPort_Kind()
	 * @model required="true"
	 * @generated
	 */
	PortDirectionKind getKind();

	/**
	 * Sets the value of the '{@link org.muml.pim.component.DirectedTypedPort#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.muml.pim.component.PortDirectionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(PortDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Decides if this port is optional. An optional port does not need to be instantiated
	 * in all instances of the containing component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see org.muml.pim.component.ComponentPackage#getDirectedTypedPort_Optional()
	 * @model default="false"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link org.muml.pim.component.DirectedTypedPort#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>In Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the port is an IN port
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>In Port</em>' attribute.
	 * @see org.muml.pim.component.ComponentPackage#getDirectedTypedPort_InPort()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.kind = component::PortDirectionKind::IN'"
	 * @generated
	 */
	boolean isInPort();

	/**
	 * Returns the value of the '<em><b>Initialize Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initialize Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A initialize expression specifies the initial value that is emitted by the port after
	 * it has been instantiated. Thus, we only provide initialize expressions for out-port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialize Expression</em>' containment reference.
	 * @see #setInitializeExpression(Expression)
	 * @see org.muml.pim.component.ComponentPackage#getDirectedTypedPort_InitializeExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitializeExpression();

	/**
	 * Sets the value of the '{@link org.muml.pim.component.DirectedTypedPort#getInitializeExpression <em>Initialize Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialize Expression</em>' containment reference.
	 * @see #getInitializeExpression()
	 * @generated
	 */
	void setInitializeExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Out Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the port is an OUT port
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out Port</em>' attribute.
	 * @see org.muml.pim.component.ComponentPackage#getDirectedTypedPort_OutPort()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.kind = component::PortDirectionKind::OUT'"
	 * @generated
	 */
	boolean isOutPort();

} // DirectedTypedPort
