/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.Assertion;
import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.OverheadType;
import es.unican.mast.xmlmast.model.PacketDriver;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Packet Driver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PacketDriverImpl#getMessagePartitioning <em>Message Partitioning</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PacketDriverImpl#getPacketReceiveOperation <em>Packet Receive Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PacketDriverImpl#getPacketSendOperation <em>Packet Send Operation</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PacketDriverImpl#getPacketServer <em>Packet Server</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.PacketDriverImpl#getRTAOverheadModel <em>RTA Overhead Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PacketDriverImpl extends MinimalEObjectImpl.Container implements PacketDriver {
	/**
	 * The default value of the '{@link #getMessagePartitioning() <em>Message Partitioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagePartitioning()
	 * @generated
	 * @ordered
	 */
	protected static final Assertion MESSAGE_PARTITIONING_EDEFAULT = Assertion.YES;

	/**
	 * The cached value of the '{@link #getMessagePartitioning() <em>Message Partitioning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagePartitioning()
	 * @generated
	 * @ordered
	 */
	protected Assertion messagePartitioning = MESSAGE_PARTITIONING_EDEFAULT;

	/**
	 * This is true if the Message Partitioning attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean messagePartitioningESet;

	/**
	 * The default value of the '{@link #getPacketReceiveOperation() <em>Packet Receive Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketReceiveOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKET_RECEIVE_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPacketReceiveOperation() <em>Packet Receive Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketReceiveOperation()
	 * @generated
	 * @ordered
	 */
	protected String packetReceiveOperation = PACKET_RECEIVE_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketSendOperation() <em>Packet Send Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketSendOperation()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKET_SEND_OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPacketSendOperation() <em>Packet Send Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketSendOperation()
	 * @generated
	 * @ordered
	 */
	protected String packetSendOperation = PACKET_SEND_OPERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketServer() <em>Packet Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketServer()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKET_SERVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPacketServer() <em>Packet Server</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketServer()
	 * @generated
	 * @ordered
	 */
	protected String packetServer = PACKET_SERVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRTAOverheadModel() <em>RTA Overhead Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRTAOverheadModel()
	 * @generated
	 * @ordered
	 */
	protected static final OverheadType RTA_OVERHEAD_MODEL_EDEFAULT = OverheadType.COUPLED;

	/**
	 * The cached value of the '{@link #getRTAOverheadModel() <em>RTA Overhead Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRTAOverheadModel()
	 * @generated
	 * @ordered
	 */
	protected OverheadType rTAOverheadModel = RTA_OVERHEAD_MODEL_EDEFAULT;

	/**
	 * This is true if the RTA Overhead Model attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rTAOverheadModelESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PacketDriverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.PACKET_DRIVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assertion getMessagePartitioning() {
		return messagePartitioning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessagePartitioning(Assertion newMessagePartitioning) {
		Assertion oldMessagePartitioning = messagePartitioning;
		messagePartitioning = newMessagePartitioning == null ? MESSAGE_PARTITIONING_EDEFAULT : newMessagePartitioning;
		boolean oldMessagePartitioningESet = messagePartitioningESet;
		messagePartitioningESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PACKET_DRIVER__MESSAGE_PARTITIONING, oldMessagePartitioning, messagePartitioning, !oldMessagePartitioningESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMessagePartitioning() {
		Assertion oldMessagePartitioning = messagePartitioning;
		boolean oldMessagePartitioningESet = messagePartitioningESet;
		messagePartitioning = MESSAGE_PARTITIONING_EDEFAULT;
		messagePartitioningESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.PACKET_DRIVER__MESSAGE_PARTITIONING, oldMessagePartitioning, MESSAGE_PARTITIONING_EDEFAULT, oldMessagePartitioningESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMessagePartitioning() {
		return messagePartitioningESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPacketReceiveOperation() {
		return packetReceiveOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketReceiveOperation(String newPacketReceiveOperation) {
		String oldPacketReceiveOperation = packetReceiveOperation;
		packetReceiveOperation = newPacketReceiveOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PACKET_DRIVER__PACKET_RECEIVE_OPERATION, oldPacketReceiveOperation, packetReceiveOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPacketSendOperation() {
		return packetSendOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketSendOperation(String newPacketSendOperation) {
		String oldPacketSendOperation = packetSendOperation;
		packetSendOperation = newPacketSendOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PACKET_DRIVER__PACKET_SEND_OPERATION, oldPacketSendOperation, packetSendOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPacketServer() {
		return packetServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketServer(String newPacketServer) {
		String oldPacketServer = packetServer;
		packetServer = newPacketServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PACKET_DRIVER__PACKET_SERVER, oldPacketServer, packetServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverheadType getRTAOverheadModel() {
		return rTAOverheadModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRTAOverheadModel(OverheadType newRTAOverheadModel) {
		OverheadType oldRTAOverheadModel = rTAOverheadModel;
		rTAOverheadModel = newRTAOverheadModel == null ? RTA_OVERHEAD_MODEL_EDEFAULT : newRTAOverheadModel;
		boolean oldRTAOverheadModelESet = rTAOverheadModelESet;
		rTAOverheadModelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.PACKET_DRIVER__RTA_OVERHEAD_MODEL, oldRTAOverheadModel, rTAOverheadModel, !oldRTAOverheadModelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRTAOverheadModel() {
		OverheadType oldRTAOverheadModel = rTAOverheadModel;
		boolean oldRTAOverheadModelESet = rTAOverheadModelESet;
		rTAOverheadModel = RTA_OVERHEAD_MODEL_EDEFAULT;
		rTAOverheadModelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.PACKET_DRIVER__RTA_OVERHEAD_MODEL, oldRTAOverheadModel, RTA_OVERHEAD_MODEL_EDEFAULT, oldRTAOverheadModelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRTAOverheadModel() {
		return rTAOverheadModelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.PACKET_DRIVER__MESSAGE_PARTITIONING:
				return getMessagePartitioning();
			case ModelPackage.PACKET_DRIVER__PACKET_RECEIVE_OPERATION:
				return getPacketReceiveOperation();
			case ModelPackage.PACKET_DRIVER__PACKET_SEND_OPERATION:
				return getPacketSendOperation();
			case ModelPackage.PACKET_DRIVER__PACKET_SERVER:
				return getPacketServer();
			case ModelPackage.PACKET_DRIVER__RTA_OVERHEAD_MODEL:
				return getRTAOverheadModel();
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
			case ModelPackage.PACKET_DRIVER__MESSAGE_PARTITIONING:
				setMessagePartitioning((Assertion)newValue);
				return;
			case ModelPackage.PACKET_DRIVER__PACKET_RECEIVE_OPERATION:
				setPacketReceiveOperation((String)newValue);
				return;
			case ModelPackage.PACKET_DRIVER__PACKET_SEND_OPERATION:
				setPacketSendOperation((String)newValue);
				return;
			case ModelPackage.PACKET_DRIVER__PACKET_SERVER:
				setPacketServer((String)newValue);
				return;
			case ModelPackage.PACKET_DRIVER__RTA_OVERHEAD_MODEL:
				setRTAOverheadModel((OverheadType)newValue);
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
			case ModelPackage.PACKET_DRIVER__MESSAGE_PARTITIONING:
				unsetMessagePartitioning();
				return;
			case ModelPackage.PACKET_DRIVER__PACKET_RECEIVE_OPERATION:
				setPacketReceiveOperation(PACKET_RECEIVE_OPERATION_EDEFAULT);
				return;
			case ModelPackage.PACKET_DRIVER__PACKET_SEND_OPERATION:
				setPacketSendOperation(PACKET_SEND_OPERATION_EDEFAULT);
				return;
			case ModelPackage.PACKET_DRIVER__PACKET_SERVER:
				setPacketServer(PACKET_SERVER_EDEFAULT);
				return;
			case ModelPackage.PACKET_DRIVER__RTA_OVERHEAD_MODEL:
				unsetRTAOverheadModel();
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
			case ModelPackage.PACKET_DRIVER__MESSAGE_PARTITIONING:
				return isSetMessagePartitioning();
			case ModelPackage.PACKET_DRIVER__PACKET_RECEIVE_OPERATION:
				return PACKET_RECEIVE_OPERATION_EDEFAULT == null ? packetReceiveOperation != null : !PACKET_RECEIVE_OPERATION_EDEFAULT.equals(packetReceiveOperation);
			case ModelPackage.PACKET_DRIVER__PACKET_SEND_OPERATION:
				return PACKET_SEND_OPERATION_EDEFAULT == null ? packetSendOperation != null : !PACKET_SEND_OPERATION_EDEFAULT.equals(packetSendOperation);
			case ModelPackage.PACKET_DRIVER__PACKET_SERVER:
				return PACKET_SERVER_EDEFAULT == null ? packetServer != null : !PACKET_SERVER_EDEFAULT.equals(packetServer);
			case ModelPackage.PACKET_DRIVER__RTA_OVERHEAD_MODEL:
				return isSetRTAOverheadModel();
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
		result.append(" (messagePartitioning: ");
		if (messagePartitioningESet) result.append(messagePartitioning); else result.append("<unset>");
		result.append(", packetReceiveOperation: ");
		result.append(packetReceiveOperation);
		result.append(", packetSendOperation: ");
		result.append(packetSendOperation);
		result.append(", packetServer: ");
		result.append(packetServer);
		result.append(", rTAOverheadModel: ");
		if (rTAOverheadModelESet) result.append(rTAOverheadModel); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PacketDriverImpl
