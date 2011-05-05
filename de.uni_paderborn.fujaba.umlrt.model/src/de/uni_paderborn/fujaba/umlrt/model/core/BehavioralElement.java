/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement#getRealtimeStatechart <em>Realtime Statechart</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getBehavioralElement()
 * @model
 * @generated
 */
public interface BehavioralElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realtime Statechart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realtime Statechart</em>' reference.
	 * @see #setRealtimeStatechart(AbstractRealtimeStatechart)
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getBehavioralElement_RealtimeStatechart()
	 * @model
	 * @generated
	 */
	AbstractRealtimeStatechart getRealtimeStatechart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement#getRealtimeStatechart <em>Realtime Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realtime Statechart</em>' reference.
	 * @see #getRealtimeStatechart()
	 * @generated
	 */
	void setRealtimeStatechart(AbstractRealtimeStatechart value);

} // BehavioralElement
