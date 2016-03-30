/**
 */
package org.muml.pm.hardware.hwresource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a link connection. A link can only be connected to two LinkPortInstances or to one LinkPortInstance and one Bridge.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.pm.hardware.hwresource.HwresourcePackage#getLink()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='LinkProtocol'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL LinkProtocol='-- Must use a Link Protocl\nself.protocol.oclIsTypeOf(hwresource::LinkProtocol)'"
 * @generated
 */
public interface Link extends CommunicationMedia {
} // Link
