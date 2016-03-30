/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration;

import org.muml.pim.component.Port;
import org.muml.pim.connector.DiscreteInteractionEndpoint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reconfiguration port defines the external interface for accessing the reconfiguration capabilities of a reconfigurable structured component. In case of a reconfigurable structured component, they are delegated to one of the controllers of the component. In case of a reconfigurable atomic component, the reconfiguration port is directly implemented.
 * <!-- end-model-doc -->
 *
 *
 * @see de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage#getReconfigurationPort()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ReconfigurationPortRequiresMessageTypes='self.senderMessageTypes->notEmpty() or self.receiverMessageTypes->notEmpty()' ReconfigurationPortAtStructuredComponentHasNoBehavior='(not self.component.oclIsUndefined() and self.component.oclIsTypeOf(muml::component::StructuredComponent))\r\n\timplies self.behavior.oclIsUndefined()'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ReconfigurationPortRequiresMessageTypes ReconfigurationPortAtStructuredComponentHasNoBehavior'"
 * @generated
 */
public interface ReconfigurationPort extends Port, DiscreteInteractionEndpoint {
} // ReconfigurationPort
