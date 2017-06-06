/**
 */
package org.muml.psm.muml_container.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.muml.psm.muml_container.Muml_containerPackage;
import org.muml.psm.muml_container.PortInstanceConfiguration_DDS;

import org.opendds.modeling.model.dcps.DomainParticipant;
import org.opendds.modeling.model.dcps.Publisher;
import org.opendds.modeling.model.dcps.Subscriber;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Instance Configuration DDS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_DDSImpl#getDomainID <em>Domain ID</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_DDSImpl#getPartitionID <em>Partition ID</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_DDSImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_DDSImpl#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link org.muml.psm.muml_container.impl.PortInstanceConfiguration_DDSImpl#getDomainParticipant <em>Domain Participant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortInstanceConfiguration_DDSImpl extends PortInstanceConfigurationImpl implements PortInstanceConfiguration_DDS {
	/**
	 * The default value of the '{@link #getDomainID() <em>Domain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainID()
	 * @generated
	 * @ordered
	 */
	protected static final int DOMAIN_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDomainID() <em>Domain ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainID()
	 * @generated
	 * @ordered
	 */
	protected int domainID = DOMAIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPartitionID() <em>Partition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionID()
	 * @generated
	 * @ordered
	 */
	protected static final int PARTITION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPartitionID() <em>Partition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartitionID()
	 * @generated
	 * @ordered
	 */
	protected int partitionID = PARTITION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected Publisher publisher;

	/**
	 * The cached value of the '{@link #getSubscriber() <em>Subscriber</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriber()
	 * @generated
	 * @ordered
	 */
	protected Subscriber subscriber;

	/**
	 * The cached value of the '{@link #getDomainParticipant() <em>Domain Participant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainParticipant()
	 * @generated
	 * @ordered
	 */
	protected DomainParticipant domainParticipant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortInstanceConfiguration_DDSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Muml_containerPackage.Literals.PORT_INSTANCE_CONFIGURATION_DDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDomainID() {
		return domainID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainID(int newDomainID) {
		int oldDomainID = domainID;
		domainID = newDomainID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_ID, oldDomainID, domainID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPartitionID() {
		return partitionID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionID(int newPartitionID) {
		int oldPartitionID = partitionID;
		partitionID = newPartitionID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__PARTITION_ID, oldPartitionID, partitionID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher getPublisher() {
		if (publisher != null && publisher.eIsProxy()) {
			InternalEObject oldPublisher = (InternalEObject)publisher;
			publisher = (Publisher)eResolveProxy(oldPublisher);
			if (publisher != oldPublisher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__PUBLISHER, oldPublisher, publisher));
			}
		}
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher basicGetPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(Publisher newPublisher) {
		Publisher oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscriber getSubscriber() {
		if (subscriber != null && subscriber.eIsProxy()) {
			InternalEObject oldSubscriber = (InternalEObject)subscriber;
			subscriber = (Subscriber)eResolveProxy(oldSubscriber);
			if (subscriber != oldSubscriber) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__SUBSCRIBER, oldSubscriber, subscriber));
			}
		}
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscriber basicGetSubscriber() {
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriber(Subscriber newSubscriber) {
		Subscriber oldSubscriber = subscriber;
		subscriber = newSubscriber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__SUBSCRIBER, oldSubscriber, subscriber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainParticipant getDomainParticipant() {
		if (domainParticipant != null && domainParticipant.eIsProxy()) {
			InternalEObject oldDomainParticipant = (InternalEObject)domainParticipant;
			domainParticipant = (DomainParticipant)eResolveProxy(oldDomainParticipant);
			if (domainParticipant != oldDomainParticipant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_PARTICIPANT, oldDomainParticipant, domainParticipant));
			}
		}
		return domainParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainParticipant basicGetDomainParticipant() {
		return domainParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainParticipant(DomainParticipant newDomainParticipant) {
		DomainParticipant oldDomainParticipant = domainParticipant;
		domainParticipant = newDomainParticipant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_PARTICIPANT, oldDomainParticipant, domainParticipant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_ID:
				return getDomainID();
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__PARTITION_ID:
				return getPartitionID();
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__SUBSCRIBER:
				if (resolve) return getSubscriber();
				return basicGetSubscriber();
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_PARTICIPANT:
				if (resolve) return getDomainParticipant();
				return basicGetDomainParticipant();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_ID:
				setDomainID((Integer)newValue);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__PARTITION_ID:
				setPartitionID((Integer)newValue);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__PUBLISHER:
				setPublisher((Publisher)newValue);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__SUBSCRIBER:
				setSubscriber((Subscriber)newValue);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_PARTICIPANT:
				setDomainParticipant((DomainParticipant)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_ID:
				setDomainID(DOMAIN_ID_EDEFAULT);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__PARTITION_ID:
				setPartitionID(PARTITION_ID_EDEFAULT);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__PUBLISHER:
				setPublisher((Publisher)null);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__SUBSCRIBER:
				setSubscriber((Subscriber)null);
				return;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_PARTICIPANT:
				setDomainParticipant((DomainParticipant)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_ID:
				return domainID != DOMAIN_ID_EDEFAULT;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__PARTITION_ID:
				return partitionID != PARTITION_ID_EDEFAULT;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__PUBLISHER:
				return publisher != null;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__SUBSCRIBER:
				return subscriber != null;
			case Muml_containerPackage.PORT_INSTANCE_CONFIGURATION_DDS__DOMAIN_PARTICIPANT:
				return domainParticipant != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (domainID: ");
		result.append(domainID);
		result.append(", partitionID: ");
		result.append(partitionID);
		result.append(')');
		return result.toString();
	}

} //PortInstanceConfiguration_DDSImpl
