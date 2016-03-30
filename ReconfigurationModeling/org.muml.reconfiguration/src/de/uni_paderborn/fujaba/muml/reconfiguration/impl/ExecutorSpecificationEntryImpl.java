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
import org.muml.core.impl.ExtendableElementImpl;

import de.uni_paderborn.fujaba.muml.reconfiguration.Executor;
import de.uni_paderborn.fujaba.muml.reconfiguration.ExecutorSpecificationEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule;
import de.uni_paderborn.fujaba.muml.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Executor Specification Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ExecutorSpecificationEntryImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ExecutorSpecificationEntryImpl#getReconfigurationRule <em>Reconfiguration Rule</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ExecutorSpecificationEntryImpl#getWcet <em>Wcet</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ExecutorSpecificationEntryImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecutorSpecificationEntryImpl extends ExtendableElementImpl implements ExecutorSpecificationEntry {
	/**
	 * The cached value of the '{@link #getReconfigurationRule() <em>Reconfiguration Rule</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfigurationRule()
	 * @generated
	 * @ordered
	 */
	protected ReconfigurationRule reconfigurationRule;

	/**
	 * The cached value of the '{@link #getWcet() <em>Wcet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcet()
	 * @generated
	 * @ordered
	 */
	protected TimeValue wcet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

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
		return (Executor)eInternalContainer();
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
	public ReconfigurationRule getReconfigurationRule() {
		if (reconfigurationRule != null && reconfigurationRule.eIsProxy()) {
			InternalEObject oldReconfigurationRule = (InternalEObject)reconfigurationRule;
			reconfigurationRule = (ReconfigurationRule)eResolveProxy(oldReconfigurationRule);
			if (reconfigurationRule != oldReconfigurationRule) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__RECONFIGURATION_RULE, oldReconfigurationRule, reconfigurationRule));
			}
		}
		return reconfigurationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationRule basicGetReconfigurationRule() {
		return reconfigurationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfigurationRule(ReconfigurationRule newReconfigurationRule) {
		ReconfigurationRule oldReconfigurationRule = reconfigurationRule;
		reconfigurationRule = newReconfigurationRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__RECONFIGURATION_RULE, oldReconfigurationRule, reconfigurationRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getWcet() {
		return wcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWcet(TimeValue newWcet, NotificationChain msgs) {
		TimeValue oldWcet = wcet;
		wcet = newWcet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__WCET, oldWcet, newWcet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWcet(TimeValue newWcet) {
		if (newWcet != wcet) {
			NotificationChain msgs = null;
			if (wcet != null)
				msgs = ((InternalEObject)wcet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__WCET, null, msgs);
			if (newWcet != null)
				msgs = ((InternalEObject)newWcet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__WCET, null, msgs);
			msgs = basicSetWcet(newWcet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__WCET, newWcet, newWcet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__ID, oldId, id));
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
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__WCET:
				return basicSetWcet(null, msgs);
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
				if (resolve) return getReconfigurationRule();
				return basicGetReconfigurationRule();
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__WCET:
				return getWcet();
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__ID:
				return getId();
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
				setReconfigurationRule((ReconfigurationRule)newValue);
				return;
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__WCET:
				setWcet((TimeValue)newValue);
				return;
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__ID:
				setId((Integer)newValue);
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
				setReconfigurationRule((ReconfigurationRule)null);
				return;
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__WCET:
				setWcet((TimeValue)null);
				return;
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__ID:
				setId(ID_EDEFAULT);
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
				return reconfigurationRule != null;
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__WCET:
				return wcet != null;
			case ReconfigurationPackage.EXECUTOR_SPECIFICATION_ENTRY__ID:
				return id != ID_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ExecutorSpecificationEntryImpl
