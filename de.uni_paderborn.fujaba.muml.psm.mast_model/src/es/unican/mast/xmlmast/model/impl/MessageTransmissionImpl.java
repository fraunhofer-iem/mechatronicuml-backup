/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.MessageTransmission;
import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.OverriddenFixedPriority;
import es.unican.mast.xmlmast.model.OverriddenPermanentFP;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Transmission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MessageTransmissionImpl#getOverriddenFixedPriority <em>Overridden Fixed Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MessageTransmissionImpl#getOverriddenPermanentFP <em>Overridden Permanent FP</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MessageTransmissionImpl#getAvgMessageSize <em>Avg Message Size</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MessageTransmissionImpl#getMaxMessageSize <em>Max Message Size</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MessageTransmissionImpl#getMinMessageSize <em>Min Message Size</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.MessageTransmissionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageTransmissionImpl extends MinimalEObjectImpl.Container implements MessageTransmission {
	/**
	 * The cached value of the '{@link #getOverriddenFixedPriority() <em>Overridden Fixed Priority</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverriddenFixedPriority()
	 * @generated
	 * @ordered
	 */
	protected OverriddenFixedPriority overriddenFixedPriority;

	/**
	 * The cached value of the '{@link #getOverriddenPermanentFP() <em>Overridden Permanent FP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverriddenPermanentFP()
	 * @generated
	 * @ordered
	 */
	protected OverriddenPermanentFP overriddenPermanentFP;

	/**
	 * The default value of the '{@link #getAvgMessageSize() <em>Avg Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgMessageSize()
	 * @generated
	 * @ordered
	 */
	protected static final float AVG_MESSAGE_SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAvgMessageSize() <em>Avg Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvgMessageSize()
	 * @generated
	 * @ordered
	 */
	protected float avgMessageSize = AVG_MESSAGE_SIZE_EDEFAULT;

	/**
	 * This is true if the Avg Message Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean avgMessageSizeESet;

	/**
	 * The default value of the '{@link #getMaxMessageSize() <em>Max Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMessageSize()
	 * @generated
	 * @ordered
	 */
	protected static final float MAX_MESSAGE_SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMaxMessageSize() <em>Max Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxMessageSize()
	 * @generated
	 * @ordered
	 */
	protected float maxMessageSize = MAX_MESSAGE_SIZE_EDEFAULT;

	/**
	 * This is true if the Max Message Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean maxMessageSizeESet;

	/**
	 * The default value of the '{@link #getMinMessageSize() <em>Min Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinMessageSize()
	 * @generated
	 * @ordered
	 */
	protected static final float MIN_MESSAGE_SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinMessageSize() <em>Min Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinMessageSize()
	 * @generated
	 * @ordered
	 */
	protected float minMessageSize = MIN_MESSAGE_SIZE_EDEFAULT;

	/**
	 * This is true if the Min Message Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean minMessageSizeESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageTransmissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MESSAGE_TRANSMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverriddenFixedPriority getOverriddenFixedPriority() {
		return overriddenFixedPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverriddenFixedPriority(OverriddenFixedPriority newOverriddenFixedPriority, NotificationChain msgs) {
		OverriddenFixedPriority oldOverriddenFixedPriority = overriddenFixedPriority;
		overriddenFixedPriority = newOverriddenFixedPriority;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MESSAGE_TRANSMISSION__OVERRIDDEN_FIXED_PRIORITY, oldOverriddenFixedPriority, newOverriddenFixedPriority);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverriddenFixedPriority(OverriddenFixedPriority newOverriddenFixedPriority) {
		if (newOverriddenFixedPriority != overriddenFixedPriority) {
			NotificationChain msgs = null;
			if (overriddenFixedPriority != null)
				msgs = ((InternalEObject)overriddenFixedPriority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MESSAGE_TRANSMISSION__OVERRIDDEN_FIXED_PRIORITY, null, msgs);
			if (newOverriddenFixedPriority != null)
				msgs = ((InternalEObject)newOverriddenFixedPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MESSAGE_TRANSMISSION__OVERRIDDEN_FIXED_PRIORITY, null, msgs);
			msgs = basicSetOverriddenFixedPriority(newOverriddenFixedPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MESSAGE_TRANSMISSION__OVERRIDDEN_FIXED_PRIORITY, newOverriddenFixedPriority, newOverriddenFixedPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OverriddenPermanentFP getOverriddenPermanentFP() {
		return overriddenPermanentFP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOverriddenPermanentFP(OverriddenPermanentFP newOverriddenPermanentFP, NotificationChain msgs) {
		OverriddenPermanentFP oldOverriddenPermanentFP = overriddenPermanentFP;
		overriddenPermanentFP = newOverriddenPermanentFP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.MESSAGE_TRANSMISSION__OVERRIDDEN_PERMANENT_FP, oldOverriddenPermanentFP, newOverriddenPermanentFP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverriddenPermanentFP(OverriddenPermanentFP newOverriddenPermanentFP) {
		if (newOverriddenPermanentFP != overriddenPermanentFP) {
			NotificationChain msgs = null;
			if (overriddenPermanentFP != null)
				msgs = ((InternalEObject)overriddenPermanentFP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MESSAGE_TRANSMISSION__OVERRIDDEN_PERMANENT_FP, null, msgs);
			if (newOverriddenPermanentFP != null)
				msgs = ((InternalEObject)newOverriddenPermanentFP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.MESSAGE_TRANSMISSION__OVERRIDDEN_PERMANENT_FP, null, msgs);
			msgs = basicSetOverriddenPermanentFP(newOverriddenPermanentFP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MESSAGE_TRANSMISSION__OVERRIDDEN_PERMANENT_FP, newOverriddenPermanentFP, newOverriddenPermanentFP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAvgMessageSize() {
		return avgMessageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvgMessageSize(float newAvgMessageSize) {
		float oldAvgMessageSize = avgMessageSize;
		avgMessageSize = newAvgMessageSize;
		boolean oldAvgMessageSizeESet = avgMessageSizeESet;
		avgMessageSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MESSAGE_TRANSMISSION__AVG_MESSAGE_SIZE, oldAvgMessageSize, avgMessageSize, !oldAvgMessageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAvgMessageSize() {
		float oldAvgMessageSize = avgMessageSize;
		boolean oldAvgMessageSizeESet = avgMessageSizeESet;
		avgMessageSize = AVG_MESSAGE_SIZE_EDEFAULT;
		avgMessageSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.MESSAGE_TRANSMISSION__AVG_MESSAGE_SIZE, oldAvgMessageSize, AVG_MESSAGE_SIZE_EDEFAULT, oldAvgMessageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAvgMessageSize() {
		return avgMessageSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaxMessageSize() {
		return maxMessageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxMessageSize(float newMaxMessageSize) {
		float oldMaxMessageSize = maxMessageSize;
		maxMessageSize = newMaxMessageSize;
		boolean oldMaxMessageSizeESet = maxMessageSizeESet;
		maxMessageSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MESSAGE_TRANSMISSION__MAX_MESSAGE_SIZE, oldMaxMessageSize, maxMessageSize, !oldMaxMessageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMaxMessageSize() {
		float oldMaxMessageSize = maxMessageSize;
		boolean oldMaxMessageSizeESet = maxMessageSizeESet;
		maxMessageSize = MAX_MESSAGE_SIZE_EDEFAULT;
		maxMessageSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.MESSAGE_TRANSMISSION__MAX_MESSAGE_SIZE, oldMaxMessageSize, MAX_MESSAGE_SIZE_EDEFAULT, oldMaxMessageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMaxMessageSize() {
		return maxMessageSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinMessageSize() {
		return minMessageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinMessageSize(float newMinMessageSize) {
		float oldMinMessageSize = minMessageSize;
		minMessageSize = newMinMessageSize;
		boolean oldMinMessageSizeESet = minMessageSizeESet;
		minMessageSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MESSAGE_TRANSMISSION__MIN_MESSAGE_SIZE, oldMinMessageSize, minMessageSize, !oldMinMessageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMinMessageSize() {
		float oldMinMessageSize = minMessageSize;
		boolean oldMinMessageSizeESet = minMessageSizeESet;
		minMessageSize = MIN_MESSAGE_SIZE_EDEFAULT;
		minMessageSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.MESSAGE_TRANSMISSION__MIN_MESSAGE_SIZE, oldMinMessageSize, MIN_MESSAGE_SIZE_EDEFAULT, oldMinMessageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMinMessageSize() {
		return minMessageSizeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MESSAGE_TRANSMISSION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.MESSAGE_TRANSMISSION__OVERRIDDEN_FIXED_PRIORITY:
				return basicSetOverriddenFixedPriority(null, msgs);
			case ModelPackage.MESSAGE_TRANSMISSION__OVERRIDDEN_PERMANENT_FP:
				return basicSetOverriddenPermanentFP(null, msgs);
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
			case ModelPackage.MESSAGE_TRANSMISSION__OVERRIDDEN_FIXED_PRIORITY:
				return getOverriddenFixedPriority();
			case ModelPackage.MESSAGE_TRANSMISSION__OVERRIDDEN_PERMANENT_FP:
				return getOverriddenPermanentFP();
			case ModelPackage.MESSAGE_TRANSMISSION__AVG_MESSAGE_SIZE:
				return getAvgMessageSize();
			case ModelPackage.MESSAGE_TRANSMISSION__MAX_MESSAGE_SIZE:
				return getMaxMessageSize();
			case ModelPackage.MESSAGE_TRANSMISSION__MIN_MESSAGE_SIZE:
				return getMinMessageSize();
			case ModelPackage.MESSAGE_TRANSMISSION__NAME:
				return getName();
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
			case ModelPackage.MESSAGE_TRANSMISSION__OVERRIDDEN_FIXED_PRIORITY:
				setOverriddenFixedPriority((OverriddenFixedPriority)newValue);
				return;
			case ModelPackage.MESSAGE_TRANSMISSION__OVERRIDDEN_PERMANENT_FP:
				setOverriddenPermanentFP((OverriddenPermanentFP)newValue);
				return;
			case ModelPackage.MESSAGE_TRANSMISSION__AVG_MESSAGE_SIZE:
				setAvgMessageSize((Float)newValue);
				return;
			case ModelPackage.MESSAGE_TRANSMISSION__MAX_MESSAGE_SIZE:
				setMaxMessageSize((Float)newValue);
				return;
			case ModelPackage.MESSAGE_TRANSMISSION__MIN_MESSAGE_SIZE:
				setMinMessageSize((Float)newValue);
				return;
			case ModelPackage.MESSAGE_TRANSMISSION__NAME:
				setName((String)newValue);
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
			case ModelPackage.MESSAGE_TRANSMISSION__OVERRIDDEN_FIXED_PRIORITY:
				setOverriddenFixedPriority((OverriddenFixedPriority)null);
				return;
			case ModelPackage.MESSAGE_TRANSMISSION__OVERRIDDEN_PERMANENT_FP:
				setOverriddenPermanentFP((OverriddenPermanentFP)null);
				return;
			case ModelPackage.MESSAGE_TRANSMISSION__AVG_MESSAGE_SIZE:
				unsetAvgMessageSize();
				return;
			case ModelPackage.MESSAGE_TRANSMISSION__MAX_MESSAGE_SIZE:
				unsetMaxMessageSize();
				return;
			case ModelPackage.MESSAGE_TRANSMISSION__MIN_MESSAGE_SIZE:
				unsetMinMessageSize();
				return;
			case ModelPackage.MESSAGE_TRANSMISSION__NAME:
				setName(NAME_EDEFAULT);
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
			case ModelPackage.MESSAGE_TRANSMISSION__OVERRIDDEN_FIXED_PRIORITY:
				return overriddenFixedPriority != null;
			case ModelPackage.MESSAGE_TRANSMISSION__OVERRIDDEN_PERMANENT_FP:
				return overriddenPermanentFP != null;
			case ModelPackage.MESSAGE_TRANSMISSION__AVG_MESSAGE_SIZE:
				return isSetAvgMessageSize();
			case ModelPackage.MESSAGE_TRANSMISSION__MAX_MESSAGE_SIZE:
				return isSetMaxMessageSize();
			case ModelPackage.MESSAGE_TRANSMISSION__MIN_MESSAGE_SIZE:
				return isSetMinMessageSize();
			case ModelPackage.MESSAGE_TRANSMISSION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (avgMessageSize: ");
		if (avgMessageSizeESet) result.append(avgMessageSize); else result.append("<unset>");
		result.append(", maxMessageSize: ");
		if (maxMessageSizeESet) result.append(maxMessageSize); else result.append("<unset>");
		result.append(", minMessageSize: ");
		if (minMessageSizeESet) result.append(minMessageSize); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MessageTransmissionImpl
