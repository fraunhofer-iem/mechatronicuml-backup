/**
 */
package es.unican.mast.xmlmast.result.impl;

import es.unican.mast.xmlmast.result.PreemptionLevel;
import es.unican.mast.xmlmast.result.PriorityCeiling;
import es.unican.mast.xmlmast.result.QueueSize;
import es.unican.mast.xmlmast.result.ResultPackage;
import es.unican.mast.xmlmast.result.SharedResourceResults;
import es.unican.mast.xmlmast.result.Utilization;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shared Resource Results</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SharedResourceResultsImpl#getPriorityCeiling <em>Priority Ceiling</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SharedResourceResultsImpl#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SharedResourceResultsImpl#getQueueSize <em>Queue Size</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SharedResourceResultsImpl#getPreemptionLevel <em>Preemption Level</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.SharedResourceResultsImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SharedResourceResultsImpl extends MinimalEObjectImpl.Container implements SharedResourceResults {
	/**
	 * The cached value of the '{@link #getPriorityCeiling() <em>Priority Ceiling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityCeiling()
	 * @generated
	 * @ordered
	 */
	protected PriorityCeiling priorityCeiling;

	/**
	 * The cached value of the '{@link #getUtilization() <em>Utilization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilization()
	 * @generated
	 * @ordered
	 */
	protected Utilization utilization;

	/**
	 * The cached value of the '{@link #getQueueSize() <em>Queue Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueueSize()
	 * @generated
	 * @ordered
	 */
	protected QueueSize queueSize;

	/**
	 * The cached value of the '{@link #getPreemptionLevel() <em>Preemption Level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreemptionLevel()
	 * @generated
	 * @ordered
	 */
	protected PreemptionLevel preemptionLevel;

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
	protected SharedResourceResultsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.SHARED_RESOURCE_RESULTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorityCeiling getPriorityCeiling() {
		return priorityCeiling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriorityCeiling(PriorityCeiling newPriorityCeiling, NotificationChain msgs) {
		PriorityCeiling oldPriorityCeiling = priorityCeiling;
		priorityCeiling = newPriorityCeiling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultPackage.SHARED_RESOURCE_RESULTS__PRIORITY_CEILING, oldPriorityCeiling, newPriorityCeiling);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorityCeiling(PriorityCeiling newPriorityCeiling) {
		if (newPriorityCeiling != priorityCeiling) {
			NotificationChain msgs = null;
			if (priorityCeiling != null)
				msgs = ((InternalEObject)priorityCeiling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SHARED_RESOURCE_RESULTS__PRIORITY_CEILING, null, msgs);
			if (newPriorityCeiling != null)
				msgs = ((InternalEObject)newPriorityCeiling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SHARED_RESOURCE_RESULTS__PRIORITY_CEILING, null, msgs);
			msgs = basicSetPriorityCeiling(newPriorityCeiling, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SHARED_RESOURCE_RESULTS__PRIORITY_CEILING, newPriorityCeiling, newPriorityCeiling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Utilization getUtilization() {
		return utilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUtilization(Utilization newUtilization, NotificationChain msgs) {
		Utilization oldUtilization = utilization;
		utilization = newUtilization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultPackage.SHARED_RESOURCE_RESULTS__UTILIZATION, oldUtilization, newUtilization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilization(Utilization newUtilization) {
		if (newUtilization != utilization) {
			NotificationChain msgs = null;
			if (utilization != null)
				msgs = ((InternalEObject)utilization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SHARED_RESOURCE_RESULTS__UTILIZATION, null, msgs);
			if (newUtilization != null)
				msgs = ((InternalEObject)newUtilization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SHARED_RESOURCE_RESULTS__UTILIZATION, null, msgs);
			msgs = basicSetUtilization(newUtilization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SHARED_RESOURCE_RESULTS__UTILIZATION, newUtilization, newUtilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueueSize getQueueSize() {
		return queueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueueSize(QueueSize newQueueSize, NotificationChain msgs) {
		QueueSize oldQueueSize = queueSize;
		queueSize = newQueueSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultPackage.SHARED_RESOURCE_RESULTS__QUEUE_SIZE, oldQueueSize, newQueueSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueSize(QueueSize newQueueSize) {
		if (newQueueSize != queueSize) {
			NotificationChain msgs = null;
			if (queueSize != null)
				msgs = ((InternalEObject)queueSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SHARED_RESOURCE_RESULTS__QUEUE_SIZE, null, msgs);
			if (newQueueSize != null)
				msgs = ((InternalEObject)newQueueSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SHARED_RESOURCE_RESULTS__QUEUE_SIZE, null, msgs);
			msgs = basicSetQueueSize(newQueueSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SHARED_RESOURCE_RESULTS__QUEUE_SIZE, newQueueSize, newQueueSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreemptionLevel getPreemptionLevel() {
		return preemptionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreemptionLevel(PreemptionLevel newPreemptionLevel, NotificationChain msgs) {
		PreemptionLevel oldPreemptionLevel = preemptionLevel;
		preemptionLevel = newPreemptionLevel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultPackage.SHARED_RESOURCE_RESULTS__PREEMPTION_LEVEL, oldPreemptionLevel, newPreemptionLevel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreemptionLevel(PreemptionLevel newPreemptionLevel) {
		if (newPreemptionLevel != preemptionLevel) {
			NotificationChain msgs = null;
			if (preemptionLevel != null)
				msgs = ((InternalEObject)preemptionLevel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SHARED_RESOURCE_RESULTS__PREEMPTION_LEVEL, null, msgs);
			if (newPreemptionLevel != null)
				msgs = ((InternalEObject)newPreemptionLevel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultPackage.SHARED_RESOURCE_RESULTS__PREEMPTION_LEVEL, null, msgs);
			msgs = basicSetPreemptionLevel(newPreemptionLevel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SHARED_RESOURCE_RESULTS__PREEMPTION_LEVEL, newPreemptionLevel, newPreemptionLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.SHARED_RESOURCE_RESULTS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultPackage.SHARED_RESOURCE_RESULTS__PRIORITY_CEILING:
				return basicSetPriorityCeiling(null, msgs);
			case ResultPackage.SHARED_RESOURCE_RESULTS__UTILIZATION:
				return basicSetUtilization(null, msgs);
			case ResultPackage.SHARED_RESOURCE_RESULTS__QUEUE_SIZE:
				return basicSetQueueSize(null, msgs);
			case ResultPackage.SHARED_RESOURCE_RESULTS__PREEMPTION_LEVEL:
				return basicSetPreemptionLevel(null, msgs);
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
			case ResultPackage.SHARED_RESOURCE_RESULTS__PRIORITY_CEILING:
				return getPriorityCeiling();
			case ResultPackage.SHARED_RESOURCE_RESULTS__UTILIZATION:
				return getUtilization();
			case ResultPackage.SHARED_RESOURCE_RESULTS__QUEUE_SIZE:
				return getQueueSize();
			case ResultPackage.SHARED_RESOURCE_RESULTS__PREEMPTION_LEVEL:
				return getPreemptionLevel();
			case ResultPackage.SHARED_RESOURCE_RESULTS__NAME:
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
			case ResultPackage.SHARED_RESOURCE_RESULTS__PRIORITY_CEILING:
				setPriorityCeiling((PriorityCeiling)newValue);
				return;
			case ResultPackage.SHARED_RESOURCE_RESULTS__UTILIZATION:
				setUtilization((Utilization)newValue);
				return;
			case ResultPackage.SHARED_RESOURCE_RESULTS__QUEUE_SIZE:
				setQueueSize((QueueSize)newValue);
				return;
			case ResultPackage.SHARED_RESOURCE_RESULTS__PREEMPTION_LEVEL:
				setPreemptionLevel((PreemptionLevel)newValue);
				return;
			case ResultPackage.SHARED_RESOURCE_RESULTS__NAME:
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
			case ResultPackage.SHARED_RESOURCE_RESULTS__PRIORITY_CEILING:
				setPriorityCeiling((PriorityCeiling)null);
				return;
			case ResultPackage.SHARED_RESOURCE_RESULTS__UTILIZATION:
				setUtilization((Utilization)null);
				return;
			case ResultPackage.SHARED_RESOURCE_RESULTS__QUEUE_SIZE:
				setQueueSize((QueueSize)null);
				return;
			case ResultPackage.SHARED_RESOURCE_RESULTS__PREEMPTION_LEVEL:
				setPreemptionLevel((PreemptionLevel)null);
				return;
			case ResultPackage.SHARED_RESOURCE_RESULTS__NAME:
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
			case ResultPackage.SHARED_RESOURCE_RESULTS__PRIORITY_CEILING:
				return priorityCeiling != null;
			case ResultPackage.SHARED_RESOURCE_RESULTS__UTILIZATION:
				return utilization != null;
			case ResultPackage.SHARED_RESOURCE_RESULTS__QUEUE_SIZE:
				return queueSize != null;
			case ResultPackage.SHARED_RESOURCE_RESULTS__PREEMPTION_LEVEL:
				return preemptionLevel != null;
			case ResultPackage.SHARED_RESOURCE_RESULTS__NAME:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SharedResourceResultsImpl
