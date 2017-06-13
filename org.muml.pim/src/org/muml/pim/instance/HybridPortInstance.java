/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hybrid Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a hybrid port at instance level. The port type of a hybrid 
 * port instance must be a hybrid port.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.pim.instance.InstancePackage#getHybridPortInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL PortTypeIsKindOfHybridPort='-- The port type of a HybridPortInstance has to be of kind HybridPort\n(not self.portType.oclIsUndefined()) implies self.portType.oclIsKindOf(component::HybridPort)\n-- adann'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PortTypeIsKindOfHybridPort'"
 * @generated
 */
public interface HybridPortInstance extends PortInstance {
} // HybridPortInstance
