/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.EDFScheduler;
import es.unican.mast.xmlmast.model.FPPacketBasedScheduler;
import es.unican.mast.xmlmast.model.FixedPriorityScheduler;
import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.SecondaryScheduler;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secondary Scheduler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SecondarySchedulerImpl#getFixedPriorityScheduler <em>Fixed Priority Scheduler</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SecondarySchedulerImpl#getEDFScheduler <em>EDF Scheduler</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SecondarySchedulerImpl#getFPPacketBasedScheduler <em>FP Packet Based Scheduler</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SecondarySchedulerImpl#getHost <em>Host</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SecondarySchedulerImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecondarySchedulerImpl extends MinimalEObjectImpl.Container implements SecondaryScheduler {
	/**
	 * The cached value of the '{@link #getFixedPriorityScheduler() <em>Fixed Priority Scheduler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedPriorityScheduler()
	 * @generated
	 * @ordered
	 */
	protected FixedPriorityScheduler fixedPriorityScheduler;

	/**
	 * The cached value of the '{@link #getEDFScheduler() <em>EDF Scheduler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDFScheduler()
	 * @generated
	 * @ordered
	 */
	protected EDFScheduler eDFScheduler;

	/**
	 * The cached value of the '{@link #getFPPacketBasedScheduler() <em>FP Packet Based Scheduler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFPPacketBasedScheduler()
	 * @generated
	 * @ordered
	 */
	protected FPPacketBasedScheduler fPPacketBasedScheduler;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

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
	protected SecondarySchedulerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SECONDARY_SCHEDULER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedPriorityScheduler getFixedPriorityScheduler() {
		return fixedPriorityScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedPriorityScheduler(FixedPriorityScheduler newFixedPriorityScheduler, NotificationChain msgs) {
		FixedPriorityScheduler oldFixedPriorityScheduler = fixedPriorityScheduler;
		fixedPriorityScheduler = newFixedPriorityScheduler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SECONDARY_SCHEDULER__FIXED_PRIORITY_SCHEDULER, oldFixedPriorityScheduler, newFixedPriorityScheduler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedPriorityScheduler(FixedPriorityScheduler newFixedPriorityScheduler) {
		if (newFixedPriorityScheduler != fixedPriorityScheduler) {
			NotificationChain msgs = null;
			if (fixedPriorityScheduler != null)
				msgs = ((InternalEObject)fixedPriorityScheduler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SECONDARY_SCHEDULER__FIXED_PRIORITY_SCHEDULER, null, msgs);
			if (newFixedPriorityScheduler != null)
				msgs = ((InternalEObject)newFixedPriorityScheduler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SECONDARY_SCHEDULER__FIXED_PRIORITY_SCHEDULER, null, msgs);
			msgs = basicSetFixedPriorityScheduler(newFixedPriorityScheduler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SECONDARY_SCHEDULER__FIXED_PRIORITY_SCHEDULER, newFixedPriorityScheduler, newFixedPriorityScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDFScheduler getEDFScheduler() {
		return eDFScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEDFScheduler(EDFScheduler newEDFScheduler, NotificationChain msgs) {
		EDFScheduler oldEDFScheduler = eDFScheduler;
		eDFScheduler = newEDFScheduler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SECONDARY_SCHEDULER__EDF_SCHEDULER, oldEDFScheduler, newEDFScheduler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDFScheduler(EDFScheduler newEDFScheduler) {
		if (newEDFScheduler != eDFScheduler) {
			NotificationChain msgs = null;
			if (eDFScheduler != null)
				msgs = ((InternalEObject)eDFScheduler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SECONDARY_SCHEDULER__EDF_SCHEDULER, null, msgs);
			if (newEDFScheduler != null)
				msgs = ((InternalEObject)newEDFScheduler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SECONDARY_SCHEDULER__EDF_SCHEDULER, null, msgs);
			msgs = basicSetEDFScheduler(newEDFScheduler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SECONDARY_SCHEDULER__EDF_SCHEDULER, newEDFScheduler, newEDFScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FPPacketBasedScheduler getFPPacketBasedScheduler() {
		return fPPacketBasedScheduler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFPPacketBasedScheduler(FPPacketBasedScheduler newFPPacketBasedScheduler, NotificationChain msgs) {
		FPPacketBasedScheduler oldFPPacketBasedScheduler = fPPacketBasedScheduler;
		fPPacketBasedScheduler = newFPPacketBasedScheduler;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SECONDARY_SCHEDULER__FP_PACKET_BASED_SCHEDULER, oldFPPacketBasedScheduler, newFPPacketBasedScheduler);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFPPacketBasedScheduler(FPPacketBasedScheduler newFPPacketBasedScheduler) {
		if (newFPPacketBasedScheduler != fPPacketBasedScheduler) {
			NotificationChain msgs = null;
			if (fPPacketBasedScheduler != null)
				msgs = ((InternalEObject)fPPacketBasedScheduler).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SECONDARY_SCHEDULER__FP_PACKET_BASED_SCHEDULER, null, msgs);
			if (newFPPacketBasedScheduler != null)
				msgs = ((InternalEObject)newFPPacketBasedScheduler).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SECONDARY_SCHEDULER__FP_PACKET_BASED_SCHEDULER, null, msgs);
			msgs = basicSetFPPacketBasedScheduler(newFPPacketBasedScheduler, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SECONDARY_SCHEDULER__FP_PACKET_BASED_SCHEDULER, newFPPacketBasedScheduler, newFPPacketBasedScheduler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SECONDARY_SCHEDULER__HOST, oldHost, host));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SECONDARY_SCHEDULER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SECONDARY_SCHEDULER__FIXED_PRIORITY_SCHEDULER:
				return basicSetFixedPriorityScheduler(null, msgs);
			case ModelPackage.SECONDARY_SCHEDULER__EDF_SCHEDULER:
				return basicSetEDFScheduler(null, msgs);
			case ModelPackage.SECONDARY_SCHEDULER__FP_PACKET_BASED_SCHEDULER:
				return basicSetFPPacketBasedScheduler(null, msgs);
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
			case ModelPackage.SECONDARY_SCHEDULER__FIXED_PRIORITY_SCHEDULER:
				return getFixedPriorityScheduler();
			case ModelPackage.SECONDARY_SCHEDULER__EDF_SCHEDULER:
				return getEDFScheduler();
			case ModelPackage.SECONDARY_SCHEDULER__FP_PACKET_BASED_SCHEDULER:
				return getFPPacketBasedScheduler();
			case ModelPackage.SECONDARY_SCHEDULER__HOST:
				return getHost();
			case ModelPackage.SECONDARY_SCHEDULER__NAME:
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
			case ModelPackage.SECONDARY_SCHEDULER__FIXED_PRIORITY_SCHEDULER:
				setFixedPriorityScheduler((FixedPriorityScheduler)newValue);
				return;
			case ModelPackage.SECONDARY_SCHEDULER__EDF_SCHEDULER:
				setEDFScheduler((EDFScheduler)newValue);
				return;
			case ModelPackage.SECONDARY_SCHEDULER__FP_PACKET_BASED_SCHEDULER:
				setFPPacketBasedScheduler((FPPacketBasedScheduler)newValue);
				return;
			case ModelPackage.SECONDARY_SCHEDULER__HOST:
				setHost((String)newValue);
				return;
			case ModelPackage.SECONDARY_SCHEDULER__NAME:
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
			case ModelPackage.SECONDARY_SCHEDULER__FIXED_PRIORITY_SCHEDULER:
				setFixedPriorityScheduler((FixedPriorityScheduler)null);
				return;
			case ModelPackage.SECONDARY_SCHEDULER__EDF_SCHEDULER:
				setEDFScheduler((EDFScheduler)null);
				return;
			case ModelPackage.SECONDARY_SCHEDULER__FP_PACKET_BASED_SCHEDULER:
				setFPPacketBasedScheduler((FPPacketBasedScheduler)null);
				return;
			case ModelPackage.SECONDARY_SCHEDULER__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case ModelPackage.SECONDARY_SCHEDULER__NAME:
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
			case ModelPackage.SECONDARY_SCHEDULER__FIXED_PRIORITY_SCHEDULER:
				return fixedPriorityScheduler != null;
			case ModelPackage.SECONDARY_SCHEDULER__EDF_SCHEDULER:
				return eDFScheduler != null;
			case ModelPackage.SECONDARY_SCHEDULER__FP_PACKET_BASED_SCHEDULER:
				return fPPacketBasedScheduler != null;
			case ModelPackage.SECONDARY_SCHEDULER__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case ModelPackage.SECONDARY_SCHEDULER__NAME:
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
		result.append(" (host: ");
		result.append(host);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SecondarySchedulerImpl
