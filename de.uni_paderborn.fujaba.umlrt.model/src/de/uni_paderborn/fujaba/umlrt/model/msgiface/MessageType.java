/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.msgiface;

import org.storydriven.modeling.NamedElement;

import org.storydriven.modeling.calls.Callable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A message type defines the signature of one event. That includes the name
 * of the event as well as the list of parameters. The message type inherits from
 * callable because concrete events in a real-time statechart must provide a 
 * parameter mapping for the parameters of the message type as it is defined for
 * method invocations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageType#getMessageInterface <em>Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageType#getMessageTypeExpr <em>Message Type Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage#getMessageType()
 * @model
 * @generated
 */
public interface MessageType extends Callable, NamedElement {
	/**
	 * Returns the value of the '<em><b>Message Interface</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface#getMessageTypes <em>Message Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The message interface this message type belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Interface</em>' container reference.
	 * @see #setMessageInterface(MessageInterface)
	 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage#getMessageType_MessageInterface()
	 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface#getMessageTypes
	 * @model opposite="messageTypes" required="true" transient="false"
	 * @generated
	 */
	MessageInterface getMessageInterface();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageType#getMessageInterface <em>Message Interface</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Interface</em>' container reference.
	 * @see #getMessageInterface()
	 * @generated
	 */
	void setMessageInterface(MessageInterface value);

	/**
	 * Returns the value of the '<em><b>Message Type Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Type Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Type Expr</em>' attribute.
	 * @see #isSetMessageTypeExpr()
	 * @see de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage#getMessageType_MessageTypeExpr()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='toMyString()'"
	 * @generated
	 */
	String getMessageTypeExpr();

	/**
	 * Returns whether the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageType#getMessageTypeExpr <em>Message Type Expr</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Message Type Expr</em>' attribute is set.
	 * @see #getMessageTypeExpr()
	 * @generated
	 */
	boolean isSetMessageTypeExpr();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='String value =\"null\";\r\nboolean firstTime = true;\r\nif(name!=null) {\r\nvalue = name ;\r\nif(containedParameters!=null){\r\n\tvalue = value+\"(\";\r\n\tjava.util.Iterator<EParameter> iter = containedParameters.iterator();\r\n\twhile(iter.hasNext()){\r\n\t\tEParameter tmp = iter.next();\r\n\t\tif(tmp.getName()!=null && tmp.getEType()!=null && \r\n\t\t\ttmp.getEType().getInstanceTypeName()!=null){\t\t\t\t\r\n\t\t\t\tif(firstTime){\r\n\t\t\t\t\tfirstTime=false;\r\n\t\t\t\t\tvalue = value + tmp.getName() + \":\" + tmp.getEType().getName();\r\n\t\t\t\t}else{\r\n\t\t\t\t\tvalue = value +\", \"+ tmp.getName() + \":\" + tmp.getEType().getName() ;\r\n\t\t\t\t}\t\r\n\t\t\t}\r\n\t\t}\r\n\tvalue = value + \")\";\r\n\t}else{\r\n\t\tvalue = value+\"()\";\r\n\t}\r\n}\r\nreturn value;'"
	 * @generated
	 */
	String toMyString();

} // MessageType
