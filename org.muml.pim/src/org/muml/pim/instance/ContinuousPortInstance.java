/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuous Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a continuous port at instance level. The port type of a
 * continuous port instance must be a continuous port.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.pim.instance.InstancePackage#getContinuousPortInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL PortTypeIsKindOfContinuousPort='-- The port type of a ContinuousPortInstance has to be of kind ContinuousPort\n(not self.portType.oclIsUndefined()) implies self.portType.oclIsKindOf(component::ContinuousPort)\n-- adann'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='PortTypeIsKindOfContinuousPort'"
 * @generated
 */
public interface ContinuousPortInstance extends PortInstance {
} // ContinuousPortInstance
