/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents a hardware bus port at instance level.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.BusPortInstance#getConnectedBus <em>Connected Bus</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getBusPortInstance()
 * @model
 * @generated
 */
public interface BusPortInstance extends HWPortInstance {
	/**
	 * Returns the value of the '<em><b>Connected Bus</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.Bus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Bus which is connected to this BusPortInstance.
	 * It is derived from the reference connectedMedia of the super class HWPortInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Bus</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getBusPortInstance_ConnectedBus()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='self.connectedMedia->select(m|m.oclIsTypeOf(platform::Bus)).oclAsType(platform::Bus)->asOrderedSet()'"
	 * @generated
	 */
	EList<Bus> getConnectedBus();

} // BusPortInstance
