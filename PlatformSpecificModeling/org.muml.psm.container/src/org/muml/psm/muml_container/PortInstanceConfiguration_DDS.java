/**
 */
package org.muml.psm.muml_container;

import org.opendds.modeling.model.dcps.DomainParticipant;
import org.opendds.modeling.model.dcps.Publisher;
import org.opendds.modeling.model.dcps.Subscriber;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Instance Configuration DDS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getDomainID <em>Domain ID</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getPartitionID <em>Partition ID</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getDomainParticipant <em>Domain Participant</em>}</li>
 * </ul>
 *
 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration_DDS()
 * @model
 * @generated
 */
public interface PortInstanceConfiguration_DDS extends PortInstanceConfiguration {
	/**
	 * Returns the value of the '<em><b>Domain ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain ID</em>' attribute.
	 * @see #setDomainID(int)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration_DDS_DomainID()
	 * @model
	 * @generated
	 */
	int getDomainID();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getDomainID <em>Domain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain ID</em>' attribute.
	 * @see #getDomainID()
	 * @generated
	 */
	void setDomainID(int value);

	/**
	 * Returns the value of the '<em><b>Partition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partition ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition ID</em>' attribute.
	 * @see #setPartitionID(int)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration_DDS_PartitionID()
	 * @model
	 * @generated
	 */
	int getPartitionID();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getPartitionID <em>Partition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition ID</em>' attribute.
	 * @see #getPartitionID()
	 * @generated
	 */
	void setPartitionID(int value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' reference.
	 * @see #setPublisher(Publisher)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration_DDS_Publisher()
	 * @model
	 * @generated
	 */
	Publisher getPublisher();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getPublisher <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(Publisher value);

	/**
	 * Returns the value of the '<em><b>Subscriber</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber</em>' reference.
	 * @see #setSubscriber(Subscriber)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration_DDS_Subscriber()
	 * @model
	 * @generated
	 */
	Subscriber getSubscriber();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getSubscriber <em>Subscriber</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber</em>' reference.
	 * @see #getSubscriber()
	 * @generated
	 */
	void setSubscriber(Subscriber value);

	/**
	 * Returns the value of the '<em><b>Domain Participant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Participant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Participant</em>' reference.
	 * @see #setDomainParticipant(DomainParticipant)
	 * @see org.muml.psm.muml_container.Muml_containerPackage#getPortInstanceConfiguration_DDS_DomainParticipant()
	 * @model
	 * @generated
	 */
	DomainParticipant getDomainParticipant();

	/**
	 * Sets the value of the '{@link org.muml.psm.muml_container.PortInstanceConfiguration_DDS#getDomainParticipant <em>Domain Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Participant</em>' reference.
	 * @see #getDomainParticipant()
	 * @generated
	 */
	void setDomainParticipant(DomainParticipant value);

} // PortInstanceConfiguration_DDS
