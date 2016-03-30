/**
 */
package org.muml.pm.hardware.hwresourceinstance;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programmable Logic Device Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a PLD at instance level.
 * <!-- end-model-doc -->
 *
 *
 * @see org.muml.pm.hardware.hwresourceinstance.HwresourceinstancePackage#getProgrammableLogicDeviceInstance()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='CheckResourceType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL CheckResourceType='-- ResourceType must be of Kind PLD\nself.resourceType.oclIsKindOf(hwresource::ProgrammableLogicDevice)'"
 * @generated
 */
public interface ProgrammableLogicDeviceInstance extends ComputingResourceInstance {
} // ProgrammableLogicDeviceInstance
