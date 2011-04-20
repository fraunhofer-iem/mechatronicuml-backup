/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.realtimeStatechart;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.FujabaRealtimeStatechart;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Realtime Statechart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart#getTmpContainer <em>Tmp Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechartPackage#getRealtimeStatechart()
 * @model
 * @generated
 */
public interface RealtimeStatechart extends FujabaRealtimeStatechart {

	/**
	 * Returns the value of the '<em><b>Tmp Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tmp Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tmp Container</em>' containment reference.
	 * @see #setTmpContainer(EObject)
	 * @see de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechartPackage#getRealtimeStatechart_TmpContainer()
	 * @model containment="true"
	 * @generated
	 */
	EObject getTmpContainer();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.realtimeStatechart.RealtimeStatechart#getTmpContainer <em>Tmp Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tmp Container</em>' containment reference.
	 * @see #getTmpContainer()
	 * @generated
	 */
	void setTmpContainer(EObject value);
} // RealtimeStatechart
