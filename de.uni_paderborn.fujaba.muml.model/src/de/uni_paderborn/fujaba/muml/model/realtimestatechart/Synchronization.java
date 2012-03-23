/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.realtimestatechart;

import de.uni_paderborn.fujaba.muml.model.core.ParameterBinding;
import org.eclipse.emf.common.util.EList;
import org.storydriven.modeling.ExtendableElement;
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
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization#getKind <em>Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization#getParameterBinding <em>Parameter Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getSynchronization()
 * @model
 * @generated
 */
public interface Synchronization extends ExtendableElement {
	/**
	 * Returns the value of the '<em><b>Sync Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the channel that is used by the synchronization
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sync Channel</em>' reference.
	 * @see #setSyncChannel(SynchronizationChannel)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getSynchronization_SyncChannel()
	 * @model
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
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Decides the kind: Is this a send or a reveive synchronization?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationKind
	 * @see #setKind(SynchronizationKind)
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getSynchronization_Kind()
	 * @model required="true"
	 * @generated
	 */
	SynchronizationKind getKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.model.realtimestatechart.Synchronization#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.SynchronizationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(SynchronizationKind value);

	/**
	 * Returns the value of the '<em><b>Parameter Binding</b></em>' containment reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.model.core.ParameterBinding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Binding</em>' containment reference list.
	 * @see de.uni_paderborn.fujaba.muml.model.realtimestatechart.RealtimestatechartPackage#getSynchronization_ParameterBinding()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParameterBinding> getParameterBinding();

} // Synchronization
