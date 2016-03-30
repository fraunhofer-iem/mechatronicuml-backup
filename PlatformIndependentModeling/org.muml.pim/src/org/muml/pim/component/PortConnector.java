/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.component;

import org.muml.pim.connector.Connector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class is the common super class of delegations and assemblies between two ports.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.component.PortConnector#getParentComponent <em>Parent Component</em>}</li>
 * </ul>
 *
 * @see org.muml.pim.component.ComponentPackage#getPortConnector()
 * @model abstract="true"
 * @generated
 */
public interface PortConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Parent Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.muml.pim.component.StructuredComponent#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The structured component this connector belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Component</em>' container reference.
	 * @see #setParentComponent(StructuredComponent)
	 * @see org.muml.pim.component.ComponentPackage#getPortConnector_ParentComponent()
	 * @see org.muml.pim.component.StructuredComponent#getConnectors
	 * @model opposite="connectors" required="true" transient="false"
	 * @generated
	 */
	StructuredComponent getParentComponent();

	/**
	 * Sets the value of the '{@link org.muml.pim.component.PortConnector#getParentComponent <em>Parent Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Component</em>' container reference.
	 * @see #getParentComponent()
	 * @generated
	 */
	void setParentComponent(StructuredComponent value);

} // PortConnector
