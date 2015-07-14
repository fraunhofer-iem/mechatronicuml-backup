/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Port Interface Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Each ReconfigurationMessagePortInterfaceEntry defines one reconfiguration 
 * message that is sent by a component to its parent. In addition to the message, 
 * it defines the ReconfigurationMessageType and, in case that it is a request, 
 * the expected response time for the parent.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getReconfigurationMessageType <em>Reconfiguration Message Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getExpectedResponseTime <em>Expected Response Time</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getReconfigurationMessagePort <em>Reconfiguration Message Port</em>}</li>
 * </ul>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationMessagePortInterfaceEntry()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='RequestRequiresExpectedResponseTime'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL RequestRequiresExpectedResponseTime='self.reconfigurationMessageType = ReconfigurationMessageTypeEnum::REQUEST implies (not self.expectedResponseTime.oclIsUndefined())'"
 * @generated
 */
public interface ReconfigurationMessagePortInterfaceEntry extends ReconfigurationPortInterfaceEntry {
	/**
	 * Returns the value of the '<em><b>Reconfiguration Message Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessageTypeEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Message Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines whether the message is an info message or a request. A request needs
	 * to be answered by the parent within the expected response time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reconfiguration Message Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessageTypeEnum
	 * @see #setReconfigurationMessageType(ReconfigurationMessageTypeEnum)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationMessagePortInterfaceEntry_ReconfigurationMessageType()
	 * @model
	 * @generated
	 */
	ReconfigurationMessageTypeEnum getReconfigurationMessageType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getReconfigurationMessageType <em>Reconfiguration Message Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Message Type</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessageTypeEnum
	 * @see #getReconfigurationMessageType()
	 * @generated
	 */
	void setReconfigurationMessageType(ReconfigurationMessageTypeEnum value);

	/**
	 * Returns the value of the '<em><b>Expected Response Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Response Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the message is a request, then the expected response time denotes how long 
	 * the parent has time to answer the request. For an info message, no answer of
	 * the parent is sent and, consequently, no expected response time is specified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Response Time</em>' containment reference.
	 * @see #setExpectedResponseTime(TimeValue)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationMessagePortInterfaceEntry_ExpectedResponseTime()
	 * @model containment="true"
	 * @generated
	 */
	TimeValue getExpectedResponseTime();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getExpectedResponseTime <em>Expected Response Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Response Time</em>' containment reference.
	 * @see #getExpectedResponseTime()
	 * @generated
	 */
	void setExpectedResponseTime(TimeValue value);

	/**
	 * Returns the value of the '<em><b>Reconfiguration Message Port</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort#getInterfaceEntries <em>Interface Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reconfiguration Message Port</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The reconfiguration message port that contains this interface entry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reconfiguration Message Port</em>' container reference.
	 * @see #setReconfigurationMessagePort(ReconfigurationMessagePort)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationMessagePortInterfaceEntry_ReconfigurationMessagePort()
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePort#getInterfaceEntries
	 * @model opposite="interfaceEntries" required="true" transient="false"
	 * @generated
	 */
	ReconfigurationMessagePort getReconfigurationMessagePort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getReconfigurationMessagePort <em>Reconfiguration Message Port</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reconfiguration Message Port</em>' container reference.
	 * @see #getReconfigurationMessagePort()
	 * @generated
	 */
	void setReconfigurationMessagePort(ReconfigurationMessagePort value);

} // ReconfigurationMessagePortInterfaceEntry
