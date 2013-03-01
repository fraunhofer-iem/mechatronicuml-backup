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
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getMessageKind <em>Message Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getExpectedResponseTime <em>Expected Response Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationMessagePortInterfaceEntry()
 * @model
 * @generated
 */
public interface ReconfigurationMessagePortInterfaceEntry extends ReconfigurationPortInterfaceEntry {
	/**
	 * Returns the value of the '<em><b>Message Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessageKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessageKind
	 * @see #setMessageKind(ReconfigurationMessageKind)
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationMessagePortInterfaceEntry_MessageKind()
	 * @model
	 * @generated
	 */
	ReconfigurationMessageKind getMessageKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessagePortInterfaceEntry#getMessageKind <em>Message Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationMessageKind
	 * @see #getMessageKind()
	 * @generated
	 */
	void setMessageKind(ReconfigurationMessageKind value);

	/**
	 * Returns the value of the '<em><b>Expected Response Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Response Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
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

} // ReconfigurationMessagePortInterfaceEntry
