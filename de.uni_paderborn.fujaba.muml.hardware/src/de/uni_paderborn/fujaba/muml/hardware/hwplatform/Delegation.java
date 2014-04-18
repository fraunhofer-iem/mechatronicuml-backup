/**
 */
package de.uni_paderborn.fujaba.muml.hardware.hwplatform;

import de.uni_paderborn.fujaba.muml.connector.Connector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a delegation.
 *  A delegation connects a hwport of a StructuredResourceInstance and a port of 
 * HWPlatform that contains the StructuredResourceInstance.
 * A delegation has no behavior.
 * At runtime level, the port of the HWPlatform and the port of the StructuredResourceInstance will be the same. 
 * It is used as a technique for encapsulation of a HWPlatform.
 * <!-- end-model-doc -->
 *
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.hwplatform.HwplatformPackage#getDelegation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='HWPortPartToDelegationHWPort'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL HWPortPartToDelegationHWPort='self.connectorEndpoints->exists(c|c.oclIsKindOf(hwplatform::HWPortPart)) and ( self.connectorEndpoints->exists(c|c.oclIsKindOf(hwplatform::DelegationHWPort)) or self.connectorEndpoints->exists(c|c.oclIsKindOf(hwplatform::BusPart)))'"
 * @generated
 */
public interface Delegation extends NetworkingHardwarePart, Connector {
} // Delegation
