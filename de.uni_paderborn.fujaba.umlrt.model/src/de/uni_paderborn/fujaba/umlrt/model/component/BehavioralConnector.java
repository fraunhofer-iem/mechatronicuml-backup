/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.component;

import de.uni_paderborn.fujaba.umlrt.model.core.BehavioralElement;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavioral Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.component.BehavioralConnector#getConnectorClass <em>Connector Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage#getBehavioralConnector()
 * @model
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
