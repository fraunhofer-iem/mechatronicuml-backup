/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.FPPacketBasedScheduler;
import es.unican.mast.xmlmast.model.ModelPackage;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FP Packet Based Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.FPPacketBasedSchedulerImpl#getMaxPriority <em>Max Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.FPPacketBasedSchedulerImpl#getMinPriority <em>Min Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.FPPacketBasedSchedulerImpl#getPacketOverheadAvgSize <em>Packet Overhead Avg Size</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.FPPacketBasedSchedulerImpl#getPacketOverheadMaxSize <em>Packet Overhead Max Size</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.FPPacketBasedSchedulerImpl#getPacketOverheadMinSize <em>Packet Overhead Min Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FPPacketBasedSchedulerImpl extends MinimalEObjectImpl.Container implements FPPacketBasedScheduler {
	/**
	 * The default value of the '{@link #getMaxPriority() <em>Max Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAX_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxPriority() <em>Max Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxPriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maxPriority = MAX_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinPriority() <em>Min Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPriority()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MIN_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinPriority() <em>Min Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinPriority()
	 * @generated
	 * @ordered
	 */
	protected BigInteger minPriority = MIN_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPacketOverheadAvgSize() <em>Packet Overhead Avg Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketOverheadAvgSize()
	 * @generated
	 * @ordered
	 */
	protected static final float PACKET_OVERHEAD_AVG_SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPacketOverheadAvgSize() <em>Packet Overhead Avg Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketOverheadAvgSize()
	 * @generated
	 * @ordered
	 */
	protected float packetOverheadAvgSize = PACKET_OVERHEAD_AVG_SIZE_EDEFAULT;

	/**
	 * This is true if the Packet Overhead Avg Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean packetOverheadAvgSizeESet;

	/**
	 * The default value of the '{@link #getPacketOverheadMaxSize() <em>Packet Overhead Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketOverheadMaxSize()
	 * @generated
	 * @ordered
	 */
	protected static final float PACKET_OVERHEAD_MAX_SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPacketOverheadMaxSize() <em>Packet Overhead Max Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketOverheadMaxSize()
	 * @generated
	 * @ordered
	 */
	protected float packetOverheadMaxSize = PACKET_OVERHEAD_MAX_SIZE_EDEFAULT;

	/**
	 * This is true if the Packet Overhead Max Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean packetOverheadMaxSizeESet;

	/**
	 * The default value of the '{@link #getPacketOverheadMinSize() <em>Packet Overhead Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketOverheadMinSize()
	 * @generated
	 * @ordered
	 */
	protected static final float PACKET_OVERHEAD_MIN_SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getPacketOverheadMinSize() <em>Packet Overhead Min Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPacketOverheadMinSize()
	 * @generated
	 * @ordered
	 */
	protected float packetOverheadMinSize = PACKET_OVERHEAD_MIN_SIZE_EDEFAULT;

	/**
	 * This is true if the Packet Overhead Min Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean packetOverheadMinSizeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FPPacketBasedSchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.FP_PACKET_BASED_SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMaxPriority() {
		return maxPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxPriority(BigInteger newMaxPriority) {
		BigInteger oldMaxPriority = maxPriority;
		maxPriority = newMaxPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FP_PACKET_BASED_SCHEDULER__MAX_PRIORITY, oldMaxPriority, maxPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getMinPriority() {
		return minPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinPriority(BigInteger newMinPriority) {
		BigInteger oldMinPriority = minPriority;
		minPriority = newMinPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FP_PACKET_BASED_SCHEDULER__MIN_PRIORITY, oldMinPriority, minPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPacketOverheadAvgSize() {
		return packetOverheadAvgSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketOverheadAvgSize(float newPacketOverheadAvgSize) {
		float oldPacketOverheadAvgSize = packetOverheadAvgSize;
		packetOverheadAvgSize = newPacketOverheadAvgSize;
		boolean oldPacketOverheadAvgSizeESet = packetOverheadAvgSizeESet;
		packetOverheadAvgSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_AVG_SIZE, oldPacketOverheadAvgSize, packetOverheadAvgSize, !oldPacketOverheadAvgSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPacketOverheadAvgSize() {
		float oldPacketOverheadAvgSize = packetOverheadAvgSize;
		boolean oldPacketOverheadAvgSizeESet = packetOverheadAvgSizeESet;
		packetOverheadAvgSize = PACKET_OVERHEAD_AVG_SIZE_EDEFAULT;
		packetOverheadAvgSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_AVG_SIZE, oldPacketOverheadAvgSize, PACKET_OVERHEAD_AVG_SIZE_EDEFAULT, oldPacketOverheadAvgSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPacketOverheadAvgSize() {
		return packetOverheadAvgSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPacketOverheadMaxSize() {
		return packetOverheadMaxSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketOverheadMaxSize(float newPacketOverheadMaxSize) {
		float oldPacketOverheadMaxSize = packetOverheadMaxSize;
		packetOverheadMaxSize = newPacketOverheadMaxSize;
		boolean oldPacketOverheadMaxSizeESet = packetOverheadMaxSizeESet;
		packetOverheadMaxSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_MAX_SIZE, oldPacketOverheadMaxSize, packetOverheadMaxSize, !oldPacketOverheadMaxSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPacketOverheadMaxSize() {
		float oldPacketOverheadMaxSize = packetOverheadMaxSize;
		boolean oldPacketOverheadMaxSizeESet = packetOverheadMaxSizeESet;
		packetOverheadMaxSize = PACKET_OVERHEAD_MAX_SIZE_EDEFAULT;
		packetOverheadMaxSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_MAX_SIZE, oldPacketOverheadMaxSize, PACKET_OVERHEAD_MAX_SIZE_EDEFAULT, oldPacketOverheadMaxSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPacketOverheadMaxSize() {
		return packetOverheadMaxSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPacketOverheadMinSize() {
		return packetOverheadMinSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPacketOverheadMinSize(float newPacketOverheadMinSize) {
		float oldPacketOverheadMinSize = packetOverheadMinSize;
		packetOverheadMinSize = newPacketOverheadMinSize;
		boolean oldPacketOverheadMinSizeESet = packetOverheadMinSizeESet;
		packetOverheadMinSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_MIN_SIZE, oldPacketOverheadMinSize, packetOverheadMinSize, !oldPacketOverheadMinSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPacketOverheadMinSize() {
		float oldPacketOverheadMinSize = packetOverheadMinSize;
		boolean oldPacketOverheadMinSizeESet = packetOverheadMinSizeESet;
		packetOverheadMinSize = PACKET_OVERHEAD_MIN_SIZE_EDEFAULT;
		packetOverheadMinSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_MIN_SIZE, oldPacketOverheadMinSize, PACKET_OVERHEAD_MIN_SIZE_EDEFAULT, oldPacketOverheadMinSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPacketOverheadMinSize() {
		return packetOverheadMinSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__MAX_PRIORITY:
				return getMaxPriority();
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__MIN_PRIORITY:
				return getMinPriority();
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_AVG_SIZE:
				return getPacketOverheadAvgSize();
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_MAX_SIZE:
				return getPacketOverheadMaxSize();
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_MIN_SIZE:
				return getPacketOverheadMinSize();
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
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__MAX_PRIORITY:
				setMaxPriority((BigInteger)newValue);
				return;
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__MIN_PRIORITY:
				setMinPriority((BigInteger)newValue);
				return;
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_AVG_SIZE:
				setPacketOverheadAvgSize((Float)newValue);
				return;
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_MAX_SIZE:
				setPacketOverheadMaxSize((Float)newValue);
				return;
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_MIN_SIZE:
				setPacketOverheadMinSize((Float)newValue);
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
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__MAX_PRIORITY:
				setMaxPriority(MAX_PRIORITY_EDEFAULT);
				return;
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__MIN_PRIORITY:
				setMinPriority(MIN_PRIORITY_EDEFAULT);
				return;
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_AVG_SIZE:
				unsetPacketOverheadAvgSize();
				return;
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_MAX_SIZE:
				unsetPacketOverheadMaxSize();
				return;
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_MIN_SIZE:
				unsetPacketOverheadMinSize();
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
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__MAX_PRIORITY:
				return MAX_PRIORITY_EDEFAULT == null ? maxPriority != null : !MAX_PRIORITY_EDEFAULT.equals(maxPriority);
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__MIN_PRIORITY:
				return MIN_PRIORITY_EDEFAULT == null ? minPriority != null : !MIN_PRIORITY_EDEFAULT.equals(minPriority);
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_AVG_SIZE:
				return isSetPacketOverheadAvgSize();
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_MAX_SIZE:
				return isSetPacketOverheadMaxSize();
			case ModelPackage.FP_PACKET_BASED_SCHEDULER__PACKET_OVERHEAD_MIN_SIZE:
				return isSetPacketOverheadMinSize();
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
		result.append(" (maxPriority: ");
		result.append(maxPriority);
		result.append(", minPriority: ");
		result.append(minPriority);
		result.append(", packetOverheadAvgSize: ");
		if (packetOverheadAvgSizeESet) result.append(packetOverheadAvgSize); else result.append("<unset>");
		result.append(", packetOverheadMaxSize: ");
		if (packetOverheadMaxSizeESet) result.append(packetOverheadMaxSize); else result.append("<unset>");
		result.append(", packetOverheadMinSize: ");
		if (packetOverheadMinSizeESet) result.append(packetOverheadMinSize); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FPPacketBasedSchedulerImpl
