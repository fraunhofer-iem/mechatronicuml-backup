/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.component;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assembly Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an assembly connector. Assembly connectors connect the port parts of two component parts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.AssemblyConnector#getCoordinationProtocolPart <em>Coordination Protocol Part</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.component.AssemblyConnector#getPortParts <em>Port Parts</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getAssemblyConnector()
 * @model
 * @generated
 */
public interface AssemblyConnector extends PortConnector {
	/**
	 * Returns the value of the '<em><b>Coordination Protocol Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The coordination protocol part that this assembly uses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coordination Protocol Part</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getAssemblyConnector_CoordinationProtocolPart()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.portParts->first().coordinationProtocolPart'"
	 * @generated
	 */
	CoordinationProtocolPart getCoordinationProtocolPart();

	/**
	 * Returns the value of the '<em><b>Port Parts</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.component.PortPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Parts</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.component.ComponentPackage#getAssemblyConnector_PortParts()
	 * @model lower="2" upper="2" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectorEndpoints->select(c | c.oclIsKindOf(PortPart)).oclAsType(PortPart)->asOrderedSet()'"
	 * @generated
	 */
	EList<PortPart> getPortParts();

} // AssemblyConnector
