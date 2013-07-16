/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.realtimestatechart;

import org.storydriven.core.ExtendableElement;
import org.storydriven.core.expressions.Expression;

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
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Synchronization#getSyncChannel <em>Sync Channel</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Synchronization#getKind <em>Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Synchronization#getSelectorExpression <em>Selector Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getSynchronization()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SelectorExpressionNecessary SelectorExpressionForbidden'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SelectorExpressionNecessary='-- Selected SynchronizationChannel requires this Synchronization to specify a selector expression.\nnot syncChannel.selectorType.oclIsUndefined() implies not selectorExpression.oclIsUndefined()' SelectorExpressionForbidden='-- Selected SynchronizationChannel forbids this Synchronization to specify a selector expression.\nnot syncChannel.oclIsUndefined() implies (syncChannel.selectorType.oclIsUndefined() implies selectorExpression.oclIsUndefined())'"
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
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getSynchronization_SyncChannel()
	 * @model
	 * @generated
	 */
	SynchronizationChannel getSyncChannel();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Synchronization#getSyncChannel <em>Sync Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Channel</em>' reference.
	 * @see #getSyncChannel()
	 * @generated
	 */
	void setSyncChannel(SynchronizationChannel value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Decides the kind: Is this a send or a reveive synchronization?
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationKind
	 * @see #setKind(SynchronizationKind)
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getSynchronization_Kind()
	 * @model required="true"
	 * @generated
	 */
	SynchronizationKind getKind();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Synchronization#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.SynchronizationKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(SynchronizationKind value);

	/**
	 * Returns the value of the '<em><b>Selector Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector Expression</em>' containment reference.
	 * @see #setSelectorExpression(Expression)
	 * @see de.uni_paderborn.fujaba.muml.realtimestatechart.RealtimestatechartPackage#getSynchronization_SelectorExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSelectorExpression();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.realtimestatechart.Synchronization#getSelectorExpression <em>Selector Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector Expression</em>' containment reference.
	 * @see #getSelectorExpression()
	 * @generated
	 */
	void setSelectorExpression(Expression value);

} // Synchronization
