/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Interface Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageInterfaceDiagram#getMessageInterfaces <em>Message Interfaces</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageInterfaceDiagram#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageinterfaceeditorPackage#getMessageInterfaceDiagram()
 * @model
 * @generated
 */
public interface MessageInterfaceDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Message Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Interfaces</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageinterfaceeditorPackage#getMessageInterfaceDiagram_MessageInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageInterface> getMessageInterfaces();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageinterfaceeditorPackage#getMessageInterfaceDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.messageinterfaceeditor.MessageInterfaceDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MessageInterfaceDiagram
