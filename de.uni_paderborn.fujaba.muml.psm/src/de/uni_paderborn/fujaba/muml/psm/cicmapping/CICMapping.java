/**
 */
package de.uni_paderborn.fujaba.muml.psm.cicmapping;

import de.uni_paderborn.fujaba.muml.hardware.hwresourceinstance.DeviceInstance;

import de.uni_paderborn.fujaba.muml.instance.ComponentInstance;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIC Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.cicmapping.CICMapping#getCic <em>Cic</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.cicmapping.CICMapping#getDeviceInstance <em>Device Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.CicmappingPackage#getCICMapping()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ComponentInstanceIsContinousComponentInstance'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL ComponentInstanceIsContinousComponentInstance='self.cic.componentType.componentKind=muml::component::ComponentKind::CONTINUOUS_COMPONENT'"
 * @generated
 */
public interface CICMapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Cic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cic</em>' reference.
	 * @see #setCic(ComponentInstance)
	 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.CicmappingPackage#getCICMapping_Cic()
	 * @model required="true"
	 * @generated
	 */
	ComponentInstance getCic();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.cicmapping.CICMapping#getCic <em>Cic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cic</em>' reference.
	 * @see #getCic()
	 * @generated
	 */
	void setCic(ComponentInstance value);

	/**
	 * Returns the value of the '<em><b>Device Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Instance</em>' reference.
	 * @see #setDeviceInstance(DeviceInstance)
	 * @see de.uni_paderborn.fujaba.muml.psm.cicmapping.CicmappingPackage#getCICMapping_DeviceInstance()
	 * @model required="true"
	 * @generated
	 */
	DeviceInstance getDeviceInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.psm.cicmapping.CICMapping#getDeviceInstance <em>Device Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Instance</em>' reference.
	 * @see #getDeviceInstance()
	 * @generated
	 */
	void setDeviceInstance(DeviceInstance value);

} // CICMapping
