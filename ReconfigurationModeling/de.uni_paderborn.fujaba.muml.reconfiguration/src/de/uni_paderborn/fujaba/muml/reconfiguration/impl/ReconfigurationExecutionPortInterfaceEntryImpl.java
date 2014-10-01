/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.uni_paderborn.fujaba.muml.reconfiguration.ExecutionTimingSpecification;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPort;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionPortInterfaceEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Port Interface Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationExecutionPortInterfaceEntryImpl#getTimeForDecision <em>Time For Decision</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationExecutionPortInterfaceEntryImpl#getTimeForExecutionPhase <em>Time For Execution Phase</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationExecutionPortInterfaceEntryImpl#getReconfigurationExecutionPort <em>Reconfiguration Execution Port</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationExecutionPortInterfaceEntryImpl#getMinimumCommitTime <em>Minimum Commit Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReconfigurationExecutionPortInterfaceEntryImpl extends ReconfigurationPortInterfaceEntryImpl implements ReconfigurationExecutionPortInterfaceEntry {
	/**
	 * The cached value of the '{@link #getTimeForDecision() <em>Time For Decision</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeForDecision()
	 * @generated
	 * @ordered
	 */
	protected TimeValue timeForDecision;

	/**
	 * The cached value of the '{@link #getTimeForExecutionPhase() <em>Time For Execution Phase</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeForExecutionPhase()
	 * @generated
	 * @ordered
	 */
	protected ExecutionTimingSpecification timeForExecutionPhase;

	/**
	 * The cached value of the '{@link #getMinimumCommitTime() <em>Minimum Commit Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumCommitTime()
	 * @generated
	 * @ordered
	 */
	protected TimeValue minimumCommitTime;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationExecutionPortInterfaceEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getTimeForDecision() {
		return timeForDecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeForDecision(TimeValue newTimeForDecision, NotificationChain msgs) {
		TimeValue oldTimeForDecision = timeForDecision;
		timeForDecision = newTimeForDecision;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_DECISION, oldTimeForDecision, newTimeForDecision);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeForDecision(TimeValue newTimeForDecision) {
		if (newTimeForDecision != timeForDecision) {
			NotificationChain msgs = null;
			if (timeForDecision != null)
				msgs = ((InternalEObject)timeForDecision).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_DECISION, null, msgs);
			if (newTimeForDecision != null)
				msgs = ((InternalEObject)newTimeForDecision).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_DECISION, null, msgs);
			msgs = basicSetTimeForDecision(newTimeForDecision, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_DECISION, newTimeForDecision, newTimeForDecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExecutionTimingSpecification getTimeForExecutionPhase() {
		return timeForExecutionPhase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeForExecutionPhase(ExecutionTimingSpecification newTimeForExecutionPhase, NotificationChain msgs) {
		ExecutionTimingSpecification oldTimeForExecutionPhase = timeForExecutionPhase;
		timeForExecutionPhase = newTimeForExecutionPhase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_EXECUTION_PHASE, oldTimeForExecutionPhase, newTimeForExecutionPhase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeForExecutionPhase(ExecutionTimingSpecification newTimeForExecutionPhase) {
		if (newTimeForExecutionPhase != timeForExecutionPhase) {
			NotificationChain msgs = null;
			if (timeForExecutionPhase != null)
				msgs = ((InternalEObject)timeForExecutionPhase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_EXECUTION_PHASE, null, msgs);
			if (newTimeForExecutionPhase != null)
				msgs = ((InternalEObject)newTimeForExecutionPhase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_EXECUTION_PHASE, null, msgs);
			msgs = basicSetTimeForExecutionPhase(newTimeForExecutionPhase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_EXECUTION_PHASE, newTimeForExecutionPhase, newTimeForExecutionPhase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationExecutionPort getReconfigurationExecutionPort() {
		if (eContainerFeatureID() != ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RECONFIGURATION_EXECUTION_PORT) return null;
		return (ReconfigurationExecutionPort)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReconfigurationExecutionPort(ReconfigurationExecutionPort newReconfigurationExecutionPort, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newReconfigurationExecutionPort, ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RECONFIGURATION_EXECUTION_PORT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfigurationExecutionPort(ReconfigurationExecutionPort newReconfigurationExecutionPort) {
		if (newReconfigurationExecutionPort != eInternalContainer() || (eContainerFeatureID() != ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RECONFIGURATION_EXECUTION_PORT && newReconfigurationExecutionPort != null)) {
			if (EcoreUtil.isAncestor(this, newReconfigurationExecutionPort))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newReconfigurationExecutionPort != null)
				msgs = ((InternalEObject)newReconfigurationExecutionPort).eInverseAdd(this, ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT__INTERFACE_ENTRIES, ReconfigurationExecutionPort.class, msgs);
			msgs = basicSetReconfigurationExecutionPort(newReconfigurationExecutionPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RECONFIGURATION_EXECUTION_PORT, newReconfigurationExecutionPort, newReconfigurationExecutionPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getMinimumCommitTime() {
		return minimumCommitTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinimumCommitTime(TimeValue newMinimumCommitTime, NotificationChain msgs) {
		TimeValue oldMinimumCommitTime = minimumCommitTime;
		minimumCommitTime = newMinimumCommitTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__MINIMUM_COMMIT_TIME, oldMinimumCommitTime, newMinimumCommitTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumCommitTime(TimeValue newMinimumCommitTime) {
		if (newMinimumCommitTime != minimumCommitTime) {
			NotificationChain msgs = null;
			if (minimumCommitTime != null)
				msgs = ((InternalEObject)minimumCommitTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__MINIMUM_COMMIT_TIME, null, msgs);
			if (newMinimumCommitTime != null)
				msgs = ((InternalEObject)newMinimumCommitTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__MINIMUM_COMMIT_TIME, null, msgs);
			msgs = basicSetMinimumCommitTime(newMinimumCommitTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__MINIMUM_COMMIT_TIME, newMinimumCommitTime, newMinimumCommitTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RECONFIGURATION_EXECUTION_PORT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetReconfigurationExecutionPort((ReconfigurationExecutionPort)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_DECISION:
				return basicSetTimeForDecision(null, msgs);
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_EXECUTION_PHASE:
				return basicSetTimeForExecutionPhase(null, msgs);
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RECONFIGURATION_EXECUTION_PORT:
				return basicSetReconfigurationExecutionPort(null, msgs);
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__MINIMUM_COMMIT_TIME:
				return basicSetMinimumCommitTime(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RECONFIGURATION_EXECUTION_PORT:
				return eInternalContainer().eInverseRemove(this, ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT__INTERFACE_ENTRIES, ReconfigurationExecutionPort.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_DECISION:
				return getTimeForDecision();
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_EXECUTION_PHASE:
				return getTimeForExecutionPhase();
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RECONFIGURATION_EXECUTION_PORT:
				return getReconfigurationExecutionPort();
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__MINIMUM_COMMIT_TIME:
				return getMinimumCommitTime();
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
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_DECISION:
				setTimeForDecision((TimeValue)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_EXECUTION_PHASE:
				setTimeForExecutionPhase((ExecutionTimingSpecification)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RECONFIGURATION_EXECUTION_PORT:
				setReconfigurationExecutionPort((ReconfigurationExecutionPort)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__MINIMUM_COMMIT_TIME:
				setMinimumCommitTime((TimeValue)newValue);
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
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_DECISION:
				setTimeForDecision((TimeValue)null);
				return;
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_EXECUTION_PHASE:
				setTimeForExecutionPhase((ExecutionTimingSpecification)null);
				return;
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RECONFIGURATION_EXECUTION_PORT:
				setReconfigurationExecutionPort((ReconfigurationExecutionPort)null);
				return;
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__MINIMUM_COMMIT_TIME:
				setMinimumCommitTime((TimeValue)null);
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
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_DECISION:
				return timeForDecision != null;
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__TIME_FOR_EXECUTION_PHASE:
				return timeForExecutionPhase != null;
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__RECONFIGURATION_EXECUTION_PORT:
				return getReconfigurationExecutionPort() != null;
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_PORT_INTERFACE_ENTRY__MINIMUM_COMMIT_TIME:
				return minimumCommitTime != null;
		}
		return super.eIsSet(featureID);
	}

} //ReconfigurationExecutionPortInterfaceEntryImpl
