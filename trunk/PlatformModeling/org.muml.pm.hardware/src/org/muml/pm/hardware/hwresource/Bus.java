/**
 */
package org.muml.pm.hardware.hwresource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a bus. A bus is used to connect several BusPortInstances.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getBus()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='BusProtocol'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL BusProtocol='-- Must use a Bus Protocol\nself.protocol.oclIsTypeOf(hwresource::BusProtocol)'"
 * @generated
 */
public interface Bus extends CommunicationMedia {
} // Bus
