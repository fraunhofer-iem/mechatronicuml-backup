/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.core;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Statechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getBehavioralElement()
 * @model
 * @generated
 */
public interface BehavioralElement extends EObject {
	/**
	 * Returns the value of the '<em><b>UML Realtime Statechart</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>UML Realtime Statechart</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>UML Realtime Statechart</em>' reference.
	 * @see #setUMLRealtimeStatechart(Statechart)
	 * @see de.uni_paderborn.fujaba.umlrt.model.core.CorePackage#getBehavioralElement_UMLRealtimeStatechart()
	 * @model
	 * @generated
	 */
	Statechart getUMLRealtimeStatechart();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UML Realtime Statechart</em>' reference.
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 */
	void setUMLRealtimeStatechart(Statechart value);

} // BehavioralElement
