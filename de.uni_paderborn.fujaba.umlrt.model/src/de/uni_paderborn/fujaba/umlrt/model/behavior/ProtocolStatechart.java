/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.behavior;

import de.uni_paderborn.fujaba.umlrt.model.component.Port;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractStatechart;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Statechart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the statechart of a port. The statechart describes the communication behavior of the port.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.behavior.ProtocolStatechart#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.behavior.BehaviorPackage#getProtocolStatechart()
 * @model
 * @generated
 */
public interface ProtocolStatechart extends AbstractStatechart {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port this protocol statechart belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see de.uni_paderborn.fujaba.umlrt.model.behavior.BehaviorPackage#getProtocolStatechart_Port()
	 * @model
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.behavior.ProtocolStatechart#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * After invocation of this method the realtime statechart given as a parameter is clone of this realtime statechart.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EObject clone(AbstractStatechart newpsc);

} // ProtocolStatechart
