/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.impl;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.Executor;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ExecutorSpecificationEntry;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationRule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executor Specification Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExecutorSpecificationEntryImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExecutorSpecificationEntryImpl#getReconfigurationRule <em>Reconfiguration Rule</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExecutorSpecificationEntryImpl#isExternallyVisible <em>Externally Visible</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExecutorSpecificationEntryImpl#getTimeToFailure <em>Time To Failure</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ExecutorSpecificationEntryImpl#getTimeToSuccess <em>Time To Success</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecutorSpecificationEntryImpl extends EObjectImpl implements ExecutorSpecificationEntry {
	/**
	 * The cached value of the '{@link #getReconfigurationRule() <em>Reconfiguration Rule</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfigurationRule()
	 * @generated
	 * @ordered
	 */
	protected EList<ReconfigurationRule> reconfigurationRule;

	/**
	 * The default value of the '{@link #isExternallyVisible() <em>Externally Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternallyVisible()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNALLY_VISIBLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isExternallyVisible() <em>Externally Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternallyVisible()
	 * @generated
	 * @ordered
	 */
	protected boolean externallyVisible = EXTERNALLY_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeToFailure() <em>Time To Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToFailure()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_TO_FAILURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeToFailure() <em>Time To Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToFailure()
	 * @generated
	 * @ordered
	 */
	protected int timeToFailure = TIME_TO_FAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeToSuccess() <em>Time To Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToSuccess()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_TO_SUCCESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTimeToSuccess() <em>Time To Success</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeToSuccess()
	 * @generated
	 * @ordered
	 */
	protected int timeToSuccess = TIME_TO_SUCCESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExecutorSpecificationEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.EXECUTOR_SPECIFICATION_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor getExecutor() {
		if (eContainerFeatureID() != ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR) return null;
		return (Executor)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExecutor(Executor newExecutor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newExecutor, ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutor(Executor newExecutor) {
		if (newExecutor != eInternalContainer() || (eContainerFeatureID() != ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR && newExecutor != null)) {
			if (EcoreUtil.isAncestor(this, newExecutor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newExecutor != null)
				msgs = ((InternalEObject)newExecutor).eInverseAdd(this, ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES, Executor.class, msgs);
			msgs = basicSetExecutor(newExecutor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR, newExecutor, newExecutor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReconfigurationRule> getReconfigurationRule() {
		if (reconfigurationRule == null) {
			reconfigurationRule = new EObjectResolvingEList<ReconfigurationRule>(ReconfigurationRule.class, this, ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__RECONFIGURATION_RULE);
		}
		return reconfigurationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExternallyVisible() {
		return externallyVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternallyVisible(boolean newExternallyVisible) {
		boolean oldExternallyVisible = externallyVisible;
		externallyVisible = newExternallyVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXTERNALLY_VISIBLE, oldExternallyVisible, externallyVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeToFailure() {
		return timeToFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeToFailure(int newTimeToFailure) {
		int oldTimeToFailure = timeToFailure;
		timeToFailure = newTimeToFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__TIME_TO_FAILURE, oldTimeToFailure, timeToFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTimeToSuccess() {
		return timeToSuccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeToSuccess(int newTimeToSuccess) {
		int oldTimeToSuccess = timeToSuccess;
		timeToSuccess = newTimeToSuccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__TIME_TO_SUCCESS, oldTimeToSuccess, timeToSuccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetExecutor((Executor)otherEnd, msgs);
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
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR:
				return basicSetExecutor(null, msgs);
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
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR:
				return eInternalContainer().eInverseRemove(this, ReconfigurationPackage.EXECUTOR__SPECIFICATION_ENTRIES, Executor.class, msgs);
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
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR:
				return getExecutor();
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__RECONFIGURATION_RULE:
				return getReconfigurationRule();
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXTERNALLY_VISIBLE:
				return isExternallyVisible();
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__TIME_TO_FAILURE:
				return getTimeToFailure();
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__TIME_TO_SUCCESS:
				return getTimeToSuccess();
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
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR:
				setExecutor((Executor)newValue);
				return;
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__RECONFIGURATION_RULE:
				getReconfigurationRule().clear();
				getReconfigurationRule().addAll((Collection<? extends ReconfigurationRule>)newValue);
				return;
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXTERNALLY_VISIBLE:
				setExternallyVisible((Boolean)newValue);
				return;
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__TIME_TO_FAILURE:
				setTimeToFailure((Integer)newValue);
				return;
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__TIME_TO_SUCCESS:
				setTimeToSuccess((Integer)newValue);
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
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR:
				setExecutor((Executor)null);
				return;
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__RECONFIGURATION_RULE:
				getReconfigurationRule().clear();
				return;
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXTERNALLY_VISIBLE:
				setExternallyVisible(EXTERNALLY_VISIBLE_EDEFAULT);
				return;
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__TIME_TO_FAILURE:
				setTimeToFailure(TIME_TO_FAILURE_EDEFAULT);
				return;
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__TIME_TO_SUCCESS:
				setTimeToSuccess(TIME_TO_SUCCESS_EDEFAULT);
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
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXECUTOR:
				return getExecutor() != null;
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__RECONFIGURATION_RULE:
				return reconfigurationRule != null && !reconfigurationRule.isEmpty();
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__EXTERNALLY_VISIBLE:
				return externallyVisible != EXTERNALLY_VISIBLE_EDEFAULT;
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__TIME_TO_FAILURE:
				return timeToFailure != TIME_TO_FAILURE_EDEFAULT;
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__TIME_TO_SUCCESS:
				return timeToSuccess != TIME_TO_SUCCESS_EDEFAULT;
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
		result.append(" (externallyVisible: ");
		result.append(externallyVisible);
		result.append(", timeToFailure: ");
		result.append(timeToFailure);
		result.append(", timeToSuccess: ");
		result.append(timeToSuccess);
		result.append(')');
		return result.toString();
	}

} //ExecutorSpecificationEntryImpl
