/**
 */
package de.uni_paderborn.fujaba.muml.hardware.platform;

import org.eclipse.emf.common.util.EList;
import org.storydriven.core.NamedElement;

import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.DataSize;
import de.uni_paderborn.fujaba.muml.hardware.hwvaluetype.TimeInterval;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.CommunicationProtocol;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HW Port Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A HWPortInstance is a HWPort of a ResourceInstance at instance level.
 * Hardware ports are interaction points that can be used to connect ResourceInstances via CommunicationMedia.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getHwportType <em>Hwport Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getParentResourceInstance <em>Parent Resource Instance</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getQueuingTime <em>Queuing Time</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getConnectedMedia <em>Connected Media</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getPayloadDataSize <em>Payload Data Size</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#isIsDelegationPort <em>Is Delegation Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getDelegation <em>Delegation</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPortInstance()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='SameProtocol'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL SameProtocol='if (self.connectedMedia->size()>0) then\n\tself.connectedMedia->forAll(m|m.oclAsType(platform::CommunicationMedia).protocol=self.protocol)\nelse true\nendif'"
 * @generated
 */
public interface HWPortInstance extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Hwport Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The port type of this HWPortInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hwport Type</em>' reference.
	 * @see #setHwportType(HWPort)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPortInstance_HwportType()
	 * @model required="true"
	 * @generated
	 */
	HWPort getHwportType();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getHwportType <em>Hwport Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hwport Type</em>' reference.
	 * @see #getHwportType()
	 * @generated
	 */
	void setHwportType(HWPort value);

	/**
	 * Returns the value of the '<em><b>Parent Resource Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance#getHwportInstances <em>Hwport Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ResourceInstance, this HWPortInstance belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Resource Instance</em>' container reference.
	 * @see #setParentResourceInstance(ResourceInstance)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPortInstance_ParentResourceInstance()
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.ResourceInstance#getHwportInstances
	 * @model opposite="hwportInstances" transient="false"
	 * @generated
	 */
	ResourceInstance getParentResourceInstance();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getParentResourceInstance <em>Parent Resource Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Resource Instance</em>' container reference.
	 * @see #getParentResourceInstance()
	 * @generated
	 */
	void setParentResourceInstance(ResourceInstance value);

	/**
	 * Returns the value of the '<em><b>Queuing Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The queuing time of this HWPortInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queuing Time</em>' containment reference.
	 * @see #setQueuingTime(TimeInterval)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPortInstance_QueuingTime()
	 * @model containment="true"
	 * @generated
	 */
	TimeInterval getQueuingTime();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getQueuingTime <em>Queuing Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queuing Time</em>' containment reference.
	 * @see #getQueuingTime()
	 * @generated
	 */
	void setQueuingTime(TimeInterval value);

	/**
	 * Returns the value of the '<em><b>Protocol</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The used protocol of this HWPortInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol</em>' reference.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPortInstance_Protocol()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if not self.hwportType.oclIsUndefined()\n\tthen\n\t\tself.hwportType.protocol\nelse null\nendif'"
	 * @generated
	 */
	CommunicationProtocol getProtocol();

	/**
	 * Returns the value of the '<em><b>Connected Media</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.CommunicationMedia}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CommunicationMedia that is connected to this HWPortInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Media</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPortInstance_ConnectedMedia()
	 * @model
	 * @generated
	 */
	EList<CommunicationMedia> getConnectedMedia();

	/**
	 * Returns the value of the '<em><b>Payload Data Size</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The average size of the payload data that is transmitted over this HWPortInstance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Payload Data Size</em>' containment reference.
	 * @see #setPayloadDataSize(DataSize)
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPortInstance_PayloadDataSize()
	 * @model containment="true"
	 * @generated
	 */
	DataSize getPayloadDataSize();

	/**
	 * Sets the value of the '{@link de.uni_paderborn.fujaba.muml.hardware.platform.HWPortInstance#getPayloadDataSize <em>Payload Data Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload Data Size</em>' containment reference.
	 * @see #getPayloadDataSize()
	 * @generated
	 */
	void setPayloadDataSize(DataSize value);

	/**
	 * Returns the value of the '<em><b>Is Delegation Port</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determines if this HWPortInstance is used as a delegation port.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Delegation Port</em>' attribute.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPortInstance_IsDelegationPort()
	 * @model default="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL derivation='if (self.parentResourceInstance.oclIsUndefined()) \nthen true\n\telse false\nendif'"
	 * @generated
	 */
	boolean isIsDelegationPort();

	/**
	 * Returns the value of the '<em><b>Delegation</b></em>' reference list.
	 * The list contents are of type {@link de.uni_paderborn.fujaba.muml.hardware.platform.Delegation}.
	 * It is bidirectional and its opposite is '{@link de.uni_paderborn.fujaba.muml.hardware.platform.Delegation#getHwPortInstance <em>Hw Port Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The delegation this HWPortInstance is connected to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delegation</em>' reference list.
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.PlatformPackage#getHWPortInstance_Delegation()
	 * @see de.uni_paderborn.fujaba.muml.hardware.platform.Delegation#getHwPortInstance
	 * @model opposite="hwPortInstance"
	 * @generated
	 */
	EList<Delegation> getDelegation();

} // HWPortInstance
