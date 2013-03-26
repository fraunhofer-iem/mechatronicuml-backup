/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component;

import de.uni_paderborn.fujaba.muml.behavior.TypedNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directed Typed Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DirectedTypedPort#getKind <em>Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DirectedTypedPort#isOptional <em>Optional</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DirectedTypedPort#isOutPort <em>Out Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.DirectedTypedPort#isInPort <em>In Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDirectedTypedPort()
 * @model abstract="true"
 * @generated
 */
public interface DirectedTypedPort extends Port, TypedNamedElement {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.component.PortDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Decides the direction of a continous port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.component.PortDirectionKind
	 * @see #setKind(PortDirectionKind)
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDirectedTypedPort_Kind()
	 * @model required="true"
	 * @generated
	 */
	PortDirectionKind getKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.component.DirectedTypedPort#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.component.PortDirectionKind
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
	 * Decides the direction of a continous port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDirectedTypedPort_Optional()
	 * @model default="false"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.component.DirectedTypedPort#isOptional <em>Optional</em>}' attribute.
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
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDirectedTypedPort_InPort()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.kind = component::PortDirectionKind::IN'"
	 * @generated
	 */
	boolean isInPort();

	/**
	 * Returns the value of the '<em><b>Out Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This derived attribute indicates if the port is an OUT port
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Out Port</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getDirectedTypedPort_OutPort()
	 * @model default="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.kind = component::PortDirectionKind::OUT'"
	 * @generated
	 */
	boolean isOutPort();

} // DirectedTypedPort
