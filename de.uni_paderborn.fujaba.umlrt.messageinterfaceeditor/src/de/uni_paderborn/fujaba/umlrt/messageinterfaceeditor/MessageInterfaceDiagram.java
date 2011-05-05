/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor;

import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Interface Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageInterfaceDiagram#getMessageInterfaces <em>Message Interfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageinterfaceeditorPackage#getMessageInterfaceDiagram()
 * @model
 * @generated
 */
public interface MessageInterfaceDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Message Interfaces</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Interfaces</em>' containment reference.
	 * @see #setMessageInterfaces(MessageInterface)
	 * @see de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageinterfaceeditorPackage#getMessageInterfaceDiagram_MessageInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	MessageInterface getMessageInterfaces();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageInterfaceDiagram#getMessageInterfaces <em>Message Interfaces</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Interfaces</em>' containment reference.
	 * @see #getMessageInterfaces()
	 * @generated
	 */
	void setMessageInterfaces(MessageInterface value);

} // MessageInterfaceDiagram
