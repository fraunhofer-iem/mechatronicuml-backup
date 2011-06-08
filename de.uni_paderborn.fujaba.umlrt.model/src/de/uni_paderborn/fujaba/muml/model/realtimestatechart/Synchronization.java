/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;

import org.storydriven.modeling.calls.Invocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Synchronization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Two transitions can synchron fire. One transition is the sender, the other the receiver. This means that both transitions (exactly one sender and one receiver) must be activated and has to fire at the same time. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization#getSyncChannel <em>Sync Channel</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization#getSynchronizationKind <em>Synchronization Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getSynchronization()
 * @model
 * @generated
 */
public interface Synchronization extends Invocation {
	/**
	 * Returns the value of the '<em><b>Sync Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the channel that is used by the synchronization
	 * \todosd{ocl: implement derived}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sync Channel</em>' reference.
	 * @see #setSyncChannel(SynchronizationChannel)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getSynchronization_SyncChannel()
	 * @model required="true" derived="true"
	 * @generated
	 */
	SynchronizationChannel getSyncChannel();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization#getSyncChannel <em>Sync Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Channel</em>' reference.
	 * @see #getSyncChannel()
	 * @generated
	 */
	void setSyncChannel(SynchronizationChannel value);

	/**
	 * Returns the value of the '<em><b>Synchronization Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronization Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronization Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationKind
	 * @see #setSynchronizationKind(SynchronizationKind)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getSynchronization_SynchronizationKind()
	 * @model
	 * @generated
	 */
	SynchronizationKind getSynchronizationKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization#getSynchronizationKind <em>Synchronization Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronization Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationKind
	 * @see #getSynchronizationKind()
	 * @generated
	 */
	void setSynchronizationKind(SynchronizationKind value);

} // Synchronization
