/**
 */
package es.unican.mast.xmlmast.model.impl;

import es.unican.mast.xmlmast.model.ModelPackage;
import es.unican.mast.xmlmast.model.OverriddenFixedPriority;
import es.unican.mast.xmlmast.model.OverriddenPermanentFP;
import es.unican.mast.xmlmast.model.SimpleOperation;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SimpleOperationImpl#getOverriddenFixedPriority <em>Overridden Fixed Priority</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SimpleOperationImpl#getOverriddenPermanentFP <em>Overridden Permanent FP</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SimpleOperationImpl#getSharedResourcesList <em>Shared Resources List</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SimpleOperationImpl#getSharedResourcesToLock <em>Shared Resources To Lock</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SimpleOperationImpl#getSharedResourcesToUnlock <em>Shared Resources To Unlock</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SimpleOperationImpl#getAverageCaseExecutionTime <em>Average Case Execution Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SimpleOperationImpl#getBestCaseExecutionTime <em>Best Case Execution Time</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SimpleOperationImpl#getName <em>Name</em>}</li>
 *   <li>{@link es.unican.mast.xmlmast.model.impl.SimpleOperationImpl#getWorstCaseExecutionTime <em>Worst Case Execution Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleOperationImpl extends MinimalEObjectImpl.Container implements SimpleOperation {
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
	 * The default value of the '{@link #getSharedResourcesList() <em>Shared Resources List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedResourcesList()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> SHARED_RESOURCES_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSharedResourcesList() <em>Shared Resources List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedResourcesList()
	 * @generated
	 * @ordered
	 */
	protected List<String> sharedResourcesList = SHARED_RESOURCES_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSharedResourcesToLock() <em>Shared Resources To Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedResourcesToLock()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> SHARED_RESOURCES_TO_LOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSharedResourcesToLock() <em>Shared Resources To Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedResourcesToLock()
	 * @generated
	 * @ordered
	 */
	protected List<String> sharedResourcesToLock = SHARED_RESOURCES_TO_LOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getSharedResourcesToUnlock() <em>Shared Resources To Unlock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedResourcesToUnlock()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> SHARED_RESOURCES_TO_UNLOCK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSharedResourcesToUnlock() <em>Shared Resources To Unlock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedResourcesToUnlock()
	 * @generated
	 * @ordered
	 */
	protected List<String> sharedResourcesToUnlock = SHARED_RESOURCES_TO_UNLOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverageCaseExecutionTime() <em>Average Case Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageCaseExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected static final float AVERAGE_CASE_EXECUTION_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAverageCaseExecutionTime() <em>Average Case Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverageCaseExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected float averageCaseExecutionTime = AVERAGE_CASE_EXECUTION_TIME_EDEFAULT;

	/**
	 * This is true if the Average Case Execution Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean averageCaseExecutionTimeESet;

	/**
	 * The default value of the '{@link #getBestCaseExecutionTime() <em>Best Case Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestCaseExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected static final float BEST_CASE_EXECUTION_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getBestCaseExecutionTime() <em>Best Case Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBestCaseExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected float bestCaseExecutionTime = BEST_CASE_EXECUTION_TIME_EDEFAULT;

	/**
	 * This is true if the Best Case Execution Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bestCaseExecutionTimeESet;

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
	 * The default value of the '{@link #getWorstCaseExecutionTime() <em>Worst Case Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstCaseExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected static final float WORST_CASE_EXECUTION_TIME_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWorstCaseExecutionTime() <em>Worst Case Execution Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorstCaseExecutionTime()
	 * @generated
	 * @ordered
	 */
	protected float worstCaseExecutionTime = WORST_CASE_EXECUTION_TIME_EDEFAULT;

	/**
	 * This is true if the Worst Case Execution Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean worstCaseExecutionTimeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SIMPLE_OPERATION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SIMPLE_OPERATION__OVERRIDDEN_FIXED_PRIORITY, oldOverriddenFixedPriority, newOverriddenFixedPriority);
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
				msgs = ((InternalEObject)overriddenFixedPriority).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SIMPLE_OPERATION__OVERRIDDEN_FIXED_PRIORITY, null, msgs);
			if (newOverriddenFixedPriority != null)
				msgs = ((InternalEObject)newOverriddenFixedPriority).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SIMPLE_OPERATION__OVERRIDDEN_FIXED_PRIORITY, null, msgs);
			msgs = basicSetOverriddenFixedPriority(newOverriddenFixedPriority, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMPLE_OPERATION__OVERRIDDEN_FIXED_PRIORITY, newOverriddenFixedPriority, newOverriddenFixedPriority));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SIMPLE_OPERATION__OVERRIDDEN_PERMANENT_FP, oldOverriddenPermanentFP, newOverriddenPermanentFP);
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
				msgs = ((InternalEObject)overriddenPermanentFP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SIMPLE_OPERATION__OVERRIDDEN_PERMANENT_FP, null, msgs);
			if (newOverriddenPermanentFP != null)
				msgs = ((InternalEObject)newOverriddenPermanentFP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SIMPLE_OPERATION__OVERRIDDEN_PERMANENT_FP, null, msgs);
			msgs = basicSetOverriddenPermanentFP(newOverriddenPermanentFP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMPLE_OPERATION__OVERRIDDEN_PERMANENT_FP, newOverriddenPermanentFP, newOverriddenPermanentFP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getSharedResourcesList() {
		return sharedResourcesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharedResourcesList(List<String> newSharedResourcesList) {
		List<String> oldSharedResourcesList = sharedResourcesList;
		sharedResourcesList = newSharedResourcesList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMPLE_OPERATION__SHARED_RESOURCES_LIST, oldSharedResourcesList, sharedResourcesList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getSharedResourcesToLock() {
		return sharedResourcesToLock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharedResourcesToLock(List<String> newSharedResourcesToLock) {
		List<String> oldSharedResourcesToLock = sharedResourcesToLock;
		sharedResourcesToLock = newSharedResourcesToLock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMPLE_OPERATION__SHARED_RESOURCES_TO_LOCK, oldSharedResourcesToLock, sharedResourcesToLock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getSharedResourcesToUnlock() {
		return sharedResourcesToUnlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharedResourcesToUnlock(List<String> newSharedResourcesToUnlock) {
		List<String> oldSharedResourcesToUnlock = sharedResourcesToUnlock;
		sharedResourcesToUnlock = newSharedResourcesToUnlock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMPLE_OPERATION__SHARED_RESOURCES_TO_UNLOCK, oldSharedResourcesToUnlock, sharedResourcesToUnlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAverageCaseExecutionTime() {
		return averageCaseExecutionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverageCaseExecutionTime(float newAverageCaseExecutionTime) {
		float oldAverageCaseExecutionTime = averageCaseExecutionTime;
		averageCaseExecutionTime = newAverageCaseExecutionTime;
		boolean oldAverageCaseExecutionTimeESet = averageCaseExecutionTimeESet;
		averageCaseExecutionTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMPLE_OPERATION__AVERAGE_CASE_EXECUTION_TIME, oldAverageCaseExecutionTime, averageCaseExecutionTime, !oldAverageCaseExecutionTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAverageCaseExecutionTime() {
		float oldAverageCaseExecutionTime = averageCaseExecutionTime;
		boolean oldAverageCaseExecutionTimeESet = averageCaseExecutionTimeESet;
		averageCaseExecutionTime = AVERAGE_CASE_EXECUTION_TIME_EDEFAULT;
		averageCaseExecutionTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SIMPLE_OPERATION__AVERAGE_CASE_EXECUTION_TIME, oldAverageCaseExecutionTime, AVERAGE_CASE_EXECUTION_TIME_EDEFAULT, oldAverageCaseExecutionTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAverageCaseExecutionTime() {
		return averageCaseExecutionTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBestCaseExecutionTime() {
		return bestCaseExecutionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBestCaseExecutionTime(float newBestCaseExecutionTime) {
		float oldBestCaseExecutionTime = bestCaseExecutionTime;
		bestCaseExecutionTime = newBestCaseExecutionTime;
		boolean oldBestCaseExecutionTimeESet = bestCaseExecutionTimeESet;
		bestCaseExecutionTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMPLE_OPERATION__BEST_CASE_EXECUTION_TIME, oldBestCaseExecutionTime, bestCaseExecutionTime, !oldBestCaseExecutionTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBestCaseExecutionTime() {
		float oldBestCaseExecutionTime = bestCaseExecutionTime;
		boolean oldBestCaseExecutionTimeESet = bestCaseExecutionTimeESet;
		bestCaseExecutionTime = BEST_CASE_EXECUTION_TIME_EDEFAULT;
		bestCaseExecutionTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SIMPLE_OPERATION__BEST_CASE_EXECUTION_TIME, oldBestCaseExecutionTime, BEST_CASE_EXECUTION_TIME_EDEFAULT, oldBestCaseExecutionTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBestCaseExecutionTime() {
		return bestCaseExecutionTimeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMPLE_OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWorstCaseExecutionTime() {
		return worstCaseExecutionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorstCaseExecutionTime(float newWorstCaseExecutionTime) {
		float oldWorstCaseExecutionTime = worstCaseExecutionTime;
		worstCaseExecutionTime = newWorstCaseExecutionTime;
		boolean oldWorstCaseExecutionTimeESet = worstCaseExecutionTimeESet;
		worstCaseExecutionTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SIMPLE_OPERATION__WORST_CASE_EXECUTION_TIME, oldWorstCaseExecutionTime, worstCaseExecutionTime, !oldWorstCaseExecutionTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorstCaseExecutionTime() {
		float oldWorstCaseExecutionTime = worstCaseExecutionTime;
		boolean oldWorstCaseExecutionTimeESet = worstCaseExecutionTimeESet;
		worstCaseExecutionTime = WORST_CASE_EXECUTION_TIME_EDEFAULT;
		worstCaseExecutionTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ModelPackage.SIMPLE_OPERATION__WORST_CASE_EXECUTION_TIME, oldWorstCaseExecutionTime, WORST_CASE_EXECUTION_TIME_EDEFAULT, oldWorstCaseExecutionTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorstCaseExecutionTime() {
		return worstCaseExecutionTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SIMPLE_OPERATION__OVERRIDDEN_FIXED_PRIORITY:
				return basicSetOverriddenFixedPriority(null, msgs);
			case ModelPackage.SIMPLE_OPERATION__OVERRIDDEN_PERMANENT_FP:
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
			case ModelPackage.SIMPLE_OPERATION__OVERRIDDEN_FIXED_PRIORITY:
				return getOverriddenFixedPriority();
			case ModelPackage.SIMPLE_OPERATION__OVERRIDDEN_PERMANENT_FP:
				return getOverriddenPermanentFP();
			case ModelPackage.SIMPLE_OPERATION__SHARED_RESOURCES_LIST:
				return getSharedResourcesList();
			case ModelPackage.SIMPLE_OPERATION__SHARED_RESOURCES_TO_LOCK:
				return getSharedResourcesToLock();
			case ModelPackage.SIMPLE_OPERATION__SHARED_RESOURCES_TO_UNLOCK:
				return getSharedResourcesToUnlock();
			case ModelPackage.SIMPLE_OPERATION__AVERAGE_CASE_EXECUTION_TIME:
				return getAverageCaseExecutionTime();
			case ModelPackage.SIMPLE_OPERATION__BEST_CASE_EXECUTION_TIME:
				return getBestCaseExecutionTime();
			case ModelPackage.SIMPLE_OPERATION__NAME:
				return getName();
			case ModelPackage.SIMPLE_OPERATION__WORST_CASE_EXECUTION_TIME:
				return getWorstCaseExecutionTime();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.SIMPLE_OPERATION__OVERRIDDEN_FIXED_PRIORITY:
				setOverriddenFixedPriority((OverriddenFixedPriority)newValue);
				return;
			case ModelPackage.SIMPLE_OPERATION__OVERRIDDEN_PERMANENT_FP:
				setOverriddenPermanentFP((OverriddenPermanentFP)newValue);
				return;
			case ModelPackage.SIMPLE_OPERATION__SHARED_RESOURCES_LIST:
				setSharedResourcesList((List<String>)newValue);
				return;
			case ModelPackage.SIMPLE_OPERATION__SHARED_RESOURCES_TO_LOCK:
				setSharedResourcesToLock((List<String>)newValue);
				return;
			case ModelPackage.SIMPLE_OPERATION__SHARED_RESOURCES_TO_UNLOCK:
				setSharedResourcesToUnlock((List<String>)newValue);
				return;
			case ModelPackage.SIMPLE_OPERATION__AVERAGE_CASE_EXECUTION_TIME:
				setAverageCaseExecutionTime((Float)newValue);
				return;
			case ModelPackage.SIMPLE_OPERATION__BEST_CASE_EXECUTION_TIME:
				setBestCaseExecutionTime((Float)newValue);
				return;
			case ModelPackage.SIMPLE_OPERATION__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.SIMPLE_OPERATION__WORST_CASE_EXECUTION_TIME:
				setWorstCaseExecutionTime((Float)newValue);
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
			case ModelPackage.SIMPLE_OPERATION__OVERRIDDEN_FIXED_PRIORITY:
				setOverriddenFixedPriority((OverriddenFixedPriority)null);
				return;
			case ModelPackage.SIMPLE_OPERATION__OVERRIDDEN_PERMANENT_FP:
				setOverriddenPermanentFP((OverriddenPermanentFP)null);
				return;
			case ModelPackage.SIMPLE_OPERATION__SHARED_RESOURCES_LIST:
				setSharedResourcesList(SHARED_RESOURCES_LIST_EDEFAULT);
				return;
			case ModelPackage.SIMPLE_OPERATION__SHARED_RESOURCES_TO_LOCK:
				setSharedResourcesToLock(SHARED_RESOURCES_TO_LOCK_EDEFAULT);
				return;
			case ModelPackage.SIMPLE_OPERATION__SHARED_RESOURCES_TO_UNLOCK:
				setSharedResourcesToUnlock(SHARED_RESOURCES_TO_UNLOCK_EDEFAULT);
				return;
			case ModelPackage.SIMPLE_OPERATION__AVERAGE_CASE_EXECUTION_TIME:
				unsetAverageCaseExecutionTime();
				return;
			case ModelPackage.SIMPLE_OPERATION__BEST_CASE_EXECUTION_TIME:
				unsetBestCaseExecutionTime();
				return;
			case ModelPackage.SIMPLE_OPERATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.SIMPLE_OPERATION__WORST_CASE_EXECUTION_TIME:
				unsetWorstCaseExecutionTime();
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
			case ModelPackage.SIMPLE_OPERATION__OVERRIDDEN_FIXED_PRIORITY:
				return overriddenFixedPriority != null;
			case ModelPackage.SIMPLE_OPERATION__OVERRIDDEN_PERMANENT_FP:
				return overriddenPermanentFP != null;
			case ModelPackage.SIMPLE_OPERATION__SHARED_RESOURCES_LIST:
				return SHARED_RESOURCES_LIST_EDEFAULT == null ? sharedResourcesList != null : !SHARED_RESOURCES_LIST_EDEFAULT.equals(sharedResourcesList);
			case ModelPackage.SIMPLE_OPERATION__SHARED_RESOURCES_TO_LOCK:
				return SHARED_RESOURCES_TO_LOCK_EDEFAULT == null ? sharedResourcesToLock != null : !SHARED_RESOURCES_TO_LOCK_EDEFAULT.equals(sharedResourcesToLock);
			case ModelPackage.SIMPLE_OPERATION__SHARED_RESOURCES_TO_UNLOCK:
				return SHARED_RESOURCES_TO_UNLOCK_EDEFAULT == null ? sharedResourcesToUnlock != null : !SHARED_RESOURCES_TO_UNLOCK_EDEFAULT.equals(sharedResourcesToUnlock);
			case ModelPackage.SIMPLE_OPERATION__AVERAGE_CASE_EXECUTION_TIME:
				return isSetAverageCaseExecutionTime();
			case ModelPackage.SIMPLE_OPERATION__BEST_CASE_EXECUTION_TIME:
				return isSetBestCaseExecutionTime();
			case ModelPackage.SIMPLE_OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.SIMPLE_OPERATION__WORST_CASE_EXECUTION_TIME:
				return isSetWorstCaseExecutionTime();
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
		result.append(" (sharedResourcesList: ");
		result.append(sharedResourcesList);
		result.append(", sharedResourcesToLock: ");
		result.append(sharedResourcesToLock);
		result.append(", sharedResourcesToUnlock: ");
		result.append(sharedResourcesToUnlock);
		result.append(", averageCaseExecutionTime: ");
		if (averageCaseExecutionTimeESet) result.append(averageCaseExecutionTime); else result.append("<unset>");
		result.append(", bestCaseExecutionTime: ");
		if (bestCaseExecutionTimeESet) result.append(bestCaseExecutionTime); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", worstCaseExecutionTime: ");
		if (worstCaseExecutionTimeESet) result.append(worstCaseExecutionTime); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SimpleOperationImpl
