/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.ListOfDrivers;
import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.PacketBasedNetwork;
import es.unican.mast.xmlmast.model.TransmissionType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Packet Based Network</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PacketBasedNetworkImpl#getListOfDrivers <em>List Of Drivers</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PacketBasedNetworkImpl#getMaxBlocking <em>Max Blocking</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PacketBasedNetworkImpl#getMaxPacketSize <em>Max Packet Size</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PacketBasedNetworkImpl#getMinPacketSize <em>Min Packet Size</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PacketBasedNetworkImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PacketBasedNetworkImpl#getSpeedFactor <em>Speed Factor</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PacketBasedNetworkImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PacketBasedNetworkImpl#getTransmission <em>Transmission</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PacketBasedNetworkImpl extends MinimalEObjectImpl.Container implements PacketBasedNetwork {
	/**
	 * The cached value of the '{@link #getListOfDrivers() <em>List Of Drivers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListOfDrivers()
	 * @generated
	 * @ordered
	 */
	protected ListOfDrivers listOfDrivers;

	/**
	 * The default value of the '{@link #getMaxBlocking() <em>Max Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBlocking()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_BLOCKING_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxBlocking() <em>Max Blocking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBlocking()
	 * @generated
	 * @ordered
	 */
	protected float maxBlocking = MAX_BLOCKING_EDEFAULT;

	/**
	 * This is true if the Max Blocking attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxBlockingESet;

	/**
	 * The default value of the '{@link #getMaxPacketSize() <em>Max Packet Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPacketSize()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_PACKET_SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxPacketSize() <em>Max Packet Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPacketSize()
	 * @generated
	 * @ordered
	 */
	protected float maxPacketSize = MAX_PACKET_SIZE_EDEFAULT;

	/**
	 * This is true if the Max Packet Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxPacketSizeESet;

	/**
	 * The default value of the '{@link #getMinPacketSize() <em>Min Packet Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPacketSize()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_PACKET_SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinPacketSize() <em>Min Packet Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPacketSize()
	 * @generated
	 * @ordered
	 */
	protected float minPacketSize = MIN_PACKET_SIZE_EDEFAULT;

	/**
	 * This is true if the Min Packet Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minPacketSizeESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected static final float SPEED_FACTOR_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSpeedFactor() <em>Speed Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedFactor()
	 * @generated
	 * @ordered
	 */
	protected float speedFactor = SPEED_FACTOR_EDEFAULT;

	/**
	 * This is true if the Speed Factor attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean speedFactorESet;

	/**
	 * The default value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final float THROUGHPUT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected float throughput = THROUGHPUT_EDEFAULT;

	/**
	 * This is true if the Throughput attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean throughputESet;

	/**
	 * The default value of the '{@link #getTransmission() <em>Transmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmission()
	 * @generated
	 * @ordered
	 */
	protected static final TransmissionType TRANSMISSION_EDEFAULT = TransmissionType.SIMPLEX;

	/**
	 * The cached value of the '{@link #getTransmission() <em>Transmission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransmission()
	 * @generated
	 * @ordered
	 */
	protected TransmissionType transmission = TRANSMISSION_EDEFAULT;

	/**
	 * This is true if the Transmission attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transmissionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PacketBasedNetworkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PACKET_BASED_NETWORK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOfDrivers getListOfDrivers() {
		return listOfDrivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListOfDrivers(ListOfDrivers newListOfDrivers, NotificationChain msgs) {
		ListOfDrivers oldListOfDrivers = listOfDrivers;
		listOfDrivers = newListOfDrivers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.PACKET_BASED_NETWORK__LIST_OF_DRIVERS, oldListOfDrivers, newListOfDrivers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListOfDrivers(ListOfDrivers newListOfDrivers) {
		if (newListOfDrivers != listOfDrivers) {
			NotificationChain msgs = null;
			if (listOfDrivers != null)
				msgs = ((InternalEObject)listOfDrivers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PACKET_BASED_NETWORK__LIST_OF_DRIVERS, null, msgs);
			if (newListOfDrivers != null)
				msgs = ((InternalEObject)newListOfDrivers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.PACKET_BASED_NETWORK__LIST_OF_DRIVERS, null, msgs);
			msgs = basicSetListOfDrivers(newListOfDrivers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PACKET_BASED_NETWORK__LIST_OF_DRIVERS, newListOfDrivers, newListOfDrivers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxBlocking() {
		return maxBlocking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxBlocking(float newMaxBlocking) {
		float oldMaxBlocking = maxBlocking;
		maxBlocking = newMaxBlocking;
		boolean oldMaxBlockingESet = maxBlockingESet;
		maxBlockingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PACKET_BASED_NETWORK__MAX_BLOCKING, oldMaxBlocking, maxBlocking, !oldMaxBlockingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxBlocking() {
		float oldMaxBlocking = maxBlocking;
		boolean oldMaxBlockingESet = maxBlockingESet;
		maxBlocking = MAX_BLOCKING_EDEFAULT;
		maxBlockingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.PACKET_BASED_NETWORK__MAX_BLOCKING, oldMaxBlocking, MAX_BLOCKING_EDEFAULT, oldMaxBlockingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxBlocking() {
		return maxBlockingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxPacketSize() {
		return maxPacketSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPacketSize(float newMaxPacketSize) {
		float oldMaxPacketSize = maxPacketSize;
		maxPacketSize = newMaxPacketSize;
		boolean oldMaxPacketSizeESet = maxPacketSizeESet;
		maxPacketSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PACKET_BASED_NETWORK__MAX_PACKET_SIZE, oldMaxPacketSize, maxPacketSize, !oldMaxPacketSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxPacketSize() {
		float oldMaxPacketSize = maxPacketSize;
		boolean oldMaxPacketSizeESet = maxPacketSizeESet;
		maxPacketSize = MAX_PACKET_SIZE_EDEFAULT;
		maxPacketSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.PACKET_BASED_NETWORK__MAX_PACKET_SIZE, oldMaxPacketSize, MAX_PACKET_SIZE_EDEFAULT, oldMaxPacketSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxPacketSize() {
		return maxPacketSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinPacketSize() {
		return minPacketSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinPacketSize(float newMinPacketSize) {
		float oldMinPacketSize = minPacketSize;
		minPacketSize = newMinPacketSize;
		boolean oldMinPacketSizeESet = minPacketSizeESet;
		minPacketSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PACKET_BASED_NETWORK__MIN_PACKET_SIZE, oldMinPacketSize, minPacketSize, !oldMinPacketSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinPacketSize() {
		float oldMinPacketSize = minPacketSize;
		boolean oldMinPacketSizeESet = minPacketSizeESet;
		minPacketSize = MIN_PACKET_SIZE_EDEFAULT;
		minPacketSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.PACKET_BASED_NETWORK__MIN_PACKET_SIZE, oldMinPacketSize, MIN_PACKET_SIZE_EDEFAULT, oldMinPacketSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinPacketSize() {
		return minPacketSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PACKET_BASED_NETWORK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpeedFactor() {
		return speedFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedFactor(float newSpeedFactor) {
		float oldSpeedFactor = speedFactor;
		speedFactor = newSpeedFactor;
		boolean oldSpeedFactorESet = speedFactorESet;
		speedFactorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PACKET_BASED_NETWORK__SPEED_FACTOR, oldSpeedFactor, speedFactor, !oldSpeedFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpeedFactor() {
		float oldSpeedFactor = speedFactor;
		boolean oldSpeedFactorESet = speedFactorESet;
		speedFactor = SPEED_FACTOR_EDEFAULT;
		speedFactorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.PACKET_BASED_NETWORK__SPEED_FACTOR, oldSpeedFactor, SPEED_FACTOR_EDEFAULT, oldSpeedFactorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpeedFactor() {
		return speedFactorESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getThroughput() {
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThroughput(float newThroughput) {
		float oldThroughput = throughput;
		throughput = newThroughput;
		boolean oldThroughputESet = throughputESet;
		throughputESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PACKET_BASED_NETWORK__THROUGHPUT, oldThroughput, throughput, !oldThroughputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThroughput() {
		float oldThroughput = throughput;
		boolean oldThroughputESet = throughputESet;
		throughput = THROUGHPUT_EDEFAULT;
		throughputESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.PACKET_BASED_NETWORK__THROUGHPUT, oldThroughput, THROUGHPUT_EDEFAULT, oldThroughputESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThroughput() {
		return throughputESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionType getTransmission() {
		return transmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransmission(TransmissionType newTransmission) {
		TransmissionType oldTransmission = transmission;
		transmission = newTransmission == null ? TRANSMISSION_EDEFAULT : newTransmission;
		boolean oldTransmissionESet = transmissionESet;
		transmissionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PACKET_BASED_NETWORK__TRANSMISSION, oldTransmission, transmission, !oldTransmissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransmission() {
		TransmissionType oldTransmission = transmission;
		boolean oldTransmissionESet = transmissionESet;
		transmission = TRANSMISSION_EDEFAULT;
		transmissionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.PACKET_BASED_NETWORK__TRANSMISSION, oldTransmission, TRANSMISSION_EDEFAULT, oldTransmissionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransmission() {
		return transmissionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.PACKET_BASED_NETWORK__LIST_OF_DRIVERS:
				return basicSetListOfDrivers(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PACKET_BASED_NETWORK__LIST_OF_DRIVERS:
				return getListOfDrivers();
			case ModelPackage.PACKET_BASED_NETWORK__MAX_BLOCKING:
				return getMaxBlocking();
			case ModelPackage.PACKET_BASED_NETWORK__MAX_PACKET_SIZE:
				return getMaxPacketSize();
			case ModelPackage.PACKET_BASED_NETWORK__MIN_PACKET_SIZE:
				return getMinPacketSize();
			case ModelPackage.PACKET_BASED_NETWORK__NAME:
				return getName();
			case ModelPackage.PACKET_BASED_NETWORK__SPEED_FACTOR:
				return getSpeedFactor();
			case ModelPackage.PACKET_BASED_NETWORK__THROUGHPUT:
				return getThroughput();
			case ModelPackage.PACKET_BASED_NETWORK__TRANSMISSION:
				return getTransmission();
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
			case ModelPackage.PACKET_BASED_NETWORK__LIST_OF_DRIVERS:
				setListOfDrivers((ListOfDrivers)newValue);
				return;
			case ModelPackage.PACKET_BASED_NETWORK__MAX_BLOCKING:
				setMaxBlocking((Float)newValue);
				return;
			case ModelPackage.PACKET_BASED_NETWORK__MAX_PACKET_SIZE:
				setMaxPacketSize((Float)newValue);
				return;
			case ModelPackage.PACKET_BASED_NETWORK__MIN_PACKET_SIZE:
				setMinPacketSize((Float)newValue);
				return;
			case ModelPackage.PACKET_BASED_NETWORK__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.PACKET_BASED_NETWORK__SPEED_FACTOR:
				setSpeedFactor((Float)newValue);
				return;
			case ModelPackage.PACKET_BASED_NETWORK__THROUGHPUT:
				setThroughput((Float)newValue);
				return;
			case ModelPackage.PACKET_BASED_NETWORK__TRANSMISSION:
				setTransmission((TransmissionType)newValue);
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
			case ModelPackage.PACKET_BASED_NETWORK__LIST_OF_DRIVERS:
				setListOfDrivers((ListOfDrivers)null);
				return;
			case ModelPackage.PACKET_BASED_NETWORK__MAX_BLOCKING:
				unsetMaxBlocking();
				return;
			case ModelPackage.PACKET_BASED_NETWORK__MAX_PACKET_SIZE:
				unsetMaxPacketSize();
				return;
			case ModelPackage.PACKET_BASED_NETWORK__MIN_PACKET_SIZE:
				unsetMinPacketSize();
				return;
			case ModelPackage.PACKET_BASED_NETWORK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.PACKET_BASED_NETWORK__SPEED_FACTOR:
				unsetSpeedFactor();
				return;
			case ModelPackage.PACKET_BASED_NETWORK__THROUGHPUT:
				unsetThroughput();
				return;
			case ModelPackage.PACKET_BASED_NETWORK__TRANSMISSION:
				unsetTransmission();
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
			case ModelPackage.PACKET_BASED_NETWORK__LIST_OF_DRIVERS:
				return listOfDrivers != null;
			case ModelPackage.PACKET_BASED_NETWORK__MAX_BLOCKING:
				return isSetMaxBlocking();
			case ModelPackage.PACKET_BASED_NETWORK__MAX_PACKET_SIZE:
				return isSetMaxPacketSize();
			case ModelPackage.PACKET_BASED_NETWORK__MIN_PACKET_SIZE:
				return isSetMinPacketSize();
			case ModelPackage.PACKET_BASED_NETWORK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.PACKET_BASED_NETWORK__SPEED_FACTOR:
				return isSetSpeedFactor();
			case ModelPackage.PACKET_BASED_NETWORK__THROUGHPUT:
				return isSetThroughput();
			case ModelPackage.PACKET_BASED_NETWORK__TRANSMISSION:
				return isSetTransmission();
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
		result.append(" (maxBlocking: ");
		if (maxBlockingESet) result.append(maxBlocking); else result.append("<unset>");
		result.append(", maxPacketSize: ");
		if (maxPacketSizeESet) result.append(maxPacketSize); else result.append("<unset>");
		result.append(", minPacketSize: ");
		if (minPacketSizeESet) result.append(minPacketSize); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", speedFactor: ");
		if (speedFactorESet) result.append(speedFactor); else result.append("<unset>");
		result.append(", throughput: ");
		if (throughputESet) result.append(throughput); else result.append("<unset>");
		result.append(", transmission: ");
		if (transmissionESet) result.append(transmission); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PacketBasedNetworkImpl
