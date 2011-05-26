/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component;

import org.eclipse.emf.ecore.EClass;

import de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract super class for all connectors that have an associated behavior. The 
 * behavior is specified as a real-time statechart.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.BehavioralConnector#getConnectorClass <em>Connector Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getBehavioralConnector()
 * @model abstract="true"
 * @generated
 */
public interface BehavioralConnector extends BehavioralElement {
	/**
	 * Returns the value of the '<em><b>Connector Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The class associated with this behavioral connector is used to store local variables
	 * and operations that are used in the real-time statechart of this connector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Class</em>' reference.
	 * @see #setConnectorClass(EClass)
	 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getBehavioralConnector_ConnectorClass()
	 * @model
	 * @generated
	 */
	EClass getConnectorClass();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.umlrt.model.component.BehavioralConnector#getConnectorClass <em>Connector Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Class</em>' reference.
	 * @see #getConnectorClass()
	 * @generated
	 */
	void setConnectorClass(EClass value);

} // BehavioralConnector
