/**
 */
package es.unican.mast.xmlmast.result.impl;

import es.unican.mast.xmlmast.result.DetailedUtilization;
import es.unican.mast.xmlmast.result.ProcessingResourceResults;
import es.unican.mast.xmlmast.result.ReadyQueueSize;
import es.unican.mast.xmlmast.result.ResultPackage;
import es.unican.mast.xmlmast.result.Slack;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Resource Results</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.ProcessingResourceResultsImpl#getSlack <em>Slack</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.ProcessingResourceResultsImpl#getDetailedUtilization <em>Detailed Utilization</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.ProcessingResourceResultsImpl#getReadyQueueSize <em>Ready Queue Size</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.result.impl.ProcessingResourceResultsImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessingResourceResultsImpl extends MinimalEObjectImpl.Container implements ProcessingResourceResults {
	/**
	 * The cached value of the '{@link #getSlack() <em>Slack</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlack()
	 * @generated
	 * @ordered
	 */
	protected Slack slack;

	/**
	 * The cached value of the '{@link #getDetailedUtilization() <em>Detailed Utilization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetailedUtilization()
	 * @generated
	 * @ordered
	 */
	protected DetailedUtilization detailedUtilization;

	/**
	 * The cached value of the '{@link #getReadyQueueSize() <em>Ready Queue Size</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadyQueueSize()
	 * @generated
	 * @ordered
	 */
	protected ReadyQueueSize readyQueueSize;

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
	protected ProcessingResourceResultsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResultPackage.Literals.PROCESSING_RESOURCE_RESULTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slack getSlack() {
		return slack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlack(Slack newSlack, NotificationChain msgs) {
		Slack oldSlack = slack;
		slack = newSlack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultPackage.PROCESSING_RESOURCE_RESULTS__SLACK, oldSlack, newSlack);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlack(Slack newSlack) {
		if (newSlack != slack) {
			NotificationChain msgs = null;
			if (slack != null)
				msgs = ((InternalEObject)slack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultPackage.PROCESSING_RESOURCE_RESULTS__SLACK, null, msgs);
			if (newSlack != null)
				msgs = ((InternalEObject)newSlack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultPackage.PROCESSING_RESOURCE_RESULTS__SLACK, null, msgs);
			msgs = basicSetSlack(newSlack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.PROCESSING_RESOURCE_RESULTS__SLACK, newSlack, newSlack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailedUtilization getDetailedUtilization() {
		return detailedUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDetailedUtilization(DetailedUtilization newDetailedUtilization, NotificationChain msgs) {
		DetailedUtilization oldDetailedUtilization = detailedUtilization;
		detailedUtilization = newDetailedUtilization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultPackage.PROCESSING_RESOURCE_RESULTS__DETAILED_UTILIZATION, oldDetailedUtilization, newDetailedUtilization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailedUtilization(DetailedUtilization newDetailedUtilization) {
		if (newDetailedUtilization != detailedUtilization) {
			NotificationChain msgs = null;
			if (detailedUtilization != null)
				msgs = ((InternalEObject)detailedUtilization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultPackage.PROCESSING_RESOURCE_RESULTS__DETAILED_UTILIZATION, null, msgs);
			if (newDetailedUtilization != null)
				msgs = ((InternalEObject)newDetailedUtilization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultPackage.PROCESSING_RESOURCE_RESULTS__DETAILED_UTILIZATION, null, msgs);
			msgs = basicSetDetailedUtilization(newDetailedUtilization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.PROCESSING_RESOURCE_RESULTS__DETAILED_UTILIZATION, newDetailedUtilization, newDetailedUtilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadyQueueSize getReadyQueueSize() {
		return readyQueueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReadyQueueSize(ReadyQueueSize newReadyQueueSize, NotificationChain msgs) {
		ReadyQueueSize oldReadyQueueSize = readyQueueSize;
		readyQueueSize = newReadyQueueSize;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ResultPackage.PROCESSING_RESOURCE_RESULTS__READY_QUEUE_SIZE, oldReadyQueueSize, newReadyQueueSize);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadyQueueSize(ReadyQueueSize newReadyQueueSize) {
		if (newReadyQueueSize != readyQueueSize) {
			NotificationChain msgs = null;
			if (readyQueueSize != null)
				msgs = ((InternalEObject)readyQueueSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ResultPackage.PROCESSING_RESOURCE_RESULTS__READY_QUEUE_SIZE, null, msgs);
			if (newReadyQueueSize != null)
				msgs = ((InternalEObject)newReadyQueueSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ResultPackage.PROCESSING_RESOURCE_RESULTS__READY_QUEUE_SIZE, null, msgs);
			msgs = basicSetReadyQueueSize(newReadyQueueSize, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.PROCESSING_RESOURCE_RESULTS__READY_QUEUE_SIZE, newReadyQueueSize, newReadyQueueSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ResultPackage.PROCESSING_RESOURCE_RESULTS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__SLACK:
				return basicSetSlack(null, msgs);
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__DETAILED_UTILIZATION:
				return basicSetDetailedUtilization(null, msgs);
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__READY_QUEUE_SIZE:
				return basicSetReadyQueueSize(null, msgs);
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
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__SLACK:
				return getSlack();
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__DETAILED_UTILIZATION:
				return getDetailedUtilization();
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__READY_QUEUE_SIZE:
				return getReadyQueueSize();
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__NAME:
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
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__SLACK:
				setSlack((Slack)newValue);
				return;
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__DETAILED_UTILIZATION:
				setDetailedUtilization((DetailedUtilization)newValue);
				return;
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__READY_QUEUE_SIZE:
				setReadyQueueSize((ReadyQueueSize)newValue);
				return;
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__NAME:
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
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__SLACK:
				setSlack((Slack)null);
				return;
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__DETAILED_UTILIZATION:
				setDetailedUtilization((DetailedUtilization)null);
				return;
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__READY_QUEUE_SIZE:
				setReadyQueueSize((ReadyQueueSize)null);
				return;
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__NAME:
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
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__SLACK:
				return slack != null;
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__DETAILED_UTILIZATION:
				return detailedUtilization != null;
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__READY_QUEUE_SIZE:
				return readyQueueSize != null;
			case ResultPackage.PROCESSING_RESOURCE_RESULTS__NAME:
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

} //ProcessingResourceResultsImpl
