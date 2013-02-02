/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component;

import org.eclipse.emf.common.util.EList;

import de.uni_paderborn.fujaba.muml.connector.Connector;

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
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.PortConnector#getParentComponent <em>Parent Component</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.PortConnector#getPorts <em>Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getPortConnector()
 * @model abstract="true"
 * @generated
 */
public interface PortConnector extends Connector {
	/**
	 * Returns the value of the '<em><b>Parent Component</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.component.StructuredComponent#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The structured component this connector belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Component</em>' container reference.
	 * @see #setParentComponent(StructuredComponent)
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getPortConnector_ParentComponent()
	 * @see de.uni_paderborn.fujaba.muml.component.StructuredComponent#getConnectors
	 * @model opposite="connectors" transient="false"
	 * @generated
	 */
	StructuredComponent getParentComponent();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.component.PortConnector#getParentComponent <em>Parent Component</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Component</em>' container reference.
	 * @see #getParentComponent()
	 * @generated
	 */
	void setParentComponent(StructuredComponent value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.component.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getPortConnector_Ports()
	 * @model lower="2" upper="2" transient="true" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->select(c | c.oclIsKindOf(Port)).oclAsType(Port)->asOrderedSet()'"
	 * @generated
	 */
	EList<Port> getPorts();

} // PortConnector
