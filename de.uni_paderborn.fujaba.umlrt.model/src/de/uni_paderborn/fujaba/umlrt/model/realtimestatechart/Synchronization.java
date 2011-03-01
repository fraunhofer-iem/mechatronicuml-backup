/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import org.storydriven.modeling.calls.Invocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getSendSyncRev <em>Send Sync Rev</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getReceiveSyncRev <em>Receive Sync Rev</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getSynchronization()
 * @model
 * @generated
 */
public interface Synchronization extends Invocation {
	/**
	 * Returns the value of the '<em><b>Send Sync Rev</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getSendSynchronization <em>Send Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Sync Rev</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Sync Rev</em>' reference.
	 * @see #setSendSyncRev(UMLRealtimeTransition)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getSynchronization_SendSyncRev()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getSendSynchronization
	 * @model opposite="sendSynchronization"
	 * @generated
	 */
	UMLRealtimeTransition getSendSyncRev();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getSendSyncRev <em>Send Sync Rev</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Sync Rev</em>' reference.
	 * @see #getSendSyncRev()
	 * @generated
	 */
	void setSendSyncRev(UMLRealtimeTransition value);

	/**
	 * Returns the value of the '<em><b>Receive Sync Rev</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getReceiveSynchronization <em>Receive Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Sync Rev</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Sync Rev</em>' reference.
	 * @see #setReceiveSyncRev(UMLRealtimeTransition)
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage#getSynchronization_ReceiveSyncRev()
	 * @see de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition#getReceiveSynchronization
	 * @model opposite="receiveSynchronization"
	 * @generated
	 */
	UMLRealtimeTransition getReceiveSyncRev();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Synchronization#getReceiveSyncRev <em>Receive Sync Rev</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Sync Rev</em>' reference.
	 * @see #getReceiveSyncRev()
	 * @generated
	 */
	void setReceiveSyncRev(UMLRealtimeTransition value);

} // Synchronization
