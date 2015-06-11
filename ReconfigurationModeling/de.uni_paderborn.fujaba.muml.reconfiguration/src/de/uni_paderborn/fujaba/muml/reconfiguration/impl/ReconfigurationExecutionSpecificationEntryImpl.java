/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.impl;

import de.uni_paderborn.fujaba.muml.realtimestatechart.Message;

import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationConstraint;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationExecutionSpecificationEntry;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationPackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.ReconfigurationRule;

import de.uni_paderborn.fujaba.muml.types.impl.DataTypeImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execution Specification Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationExecutionSpecificationEntryImpl#getGuards <em>Guards</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationExecutionSpecificationEntryImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.impl.ReconfigurationExecutionSpecificationEntryImpl#getReconfigurationRule <em>Reconfiguration Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReconfigurationExecutionSpecificationEntryImpl extends DataTypeImpl implements ReconfigurationExecutionSpecificationEntry {
	/**
	 * The cached value of the '{@link #getGuards() <em>Guards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuards()
	 * @generated
	 * @ordered
	 */
	protected EList<ReconfigurationConstraint> guards;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected Message message;

	/**
	 * The cached value of the '{@link #getReconfigurationRule() <em>Reconfiguration Rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfigurationRule()
	 * @generated
	 * @ordered
	 */
	protected ReconfigurationRule reconfigurationRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationExecutionSpecificationEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReconfigurationConstraint> getGuards() {
		if (guards == null) {
			guards = new EObjectContainmentEList<ReconfigurationConstraint>(ReconfigurationConstraint.class, this, ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__GUARDS);
		}
		return guards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessage(Message newMessage, NotificationChain msgs) {
		Message oldMessage = message;
		message = newMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__MESSAGE, oldMessage, newMessage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(Message newMessage) {
		if (newMessage != message) {
			NotificationChain msgs = null;
			if (message != null)
				msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__MESSAGE, null, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__MESSAGE, null, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__MESSAGE, newMessage, newMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationRule getReconfigurationRule() {
		return reconfigurationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReconfigurationRule(ReconfigurationRule newReconfigurationRule, NotificationChain msgs) {
		ReconfigurationRule oldReconfigurationRule = reconfigurationRule;
		reconfigurationRule = newReconfigurationRule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__RECONFIGURATION_RULE, oldReconfigurationRule, newReconfigurationRule);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfigurationRule(ReconfigurationRule newReconfigurationRule) {
		if (newReconfigurationRule != reconfigurationRule) {
			NotificationChain msgs = null;
			if (reconfigurationRule != null)
				msgs = ((InternalEObject)reconfigurationRule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__RECONFIGURATION_RULE, null, msgs);
			if (newReconfigurationRule != null)
				msgs = ((InternalEObject)newReconfigurationRule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__RECONFIGURATION_RULE, null, msgs);
			msgs = basicSetReconfigurationRule(newReconfigurationRule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__RECONFIGURATION_RULE, newReconfigurationRule, newReconfigurationRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__GUARDS:
				return ((InternalEList<?>)getGuards()).basicRemove(otherEnd, msgs);
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__MESSAGE:
				return basicSetMessage(null, msgs);
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__RECONFIGURATION_RULE:
				return basicSetReconfigurationRule(null, msgs);
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
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__GUARDS:
				return getGuards();
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__MESSAGE:
				return getMessage();
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__RECONFIGURATION_RULE:
				return getReconfigurationRule();
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
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__GUARDS:
				getGuards().clear();
				getGuards().addAll((Collection<? extends ReconfigurationConstraint>)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__MESSAGE:
				setMessage((Message)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__RECONFIGURATION_RULE:
				setReconfigurationRule((ReconfigurationRule)newValue);
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
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__GUARDS:
				getGuards().clear();
				return;
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__MESSAGE:
				setMessage((Message)null);
				return;
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__RECONFIGURATION_RULE:
				setReconfigurationRule((ReconfigurationRule)null);
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
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__GUARDS:
				return guards != null && !guards.isEmpty();
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__MESSAGE:
				return message != null;
			case ReconfigurationPackage.RECONFIGURATION_EXECUTION_SPECIFICATION_ENTRY__RECONFIGURATION_RULE:
				return reconfigurationRule != null;
		}
		return super.eIsSet(featureID);
	}

} //ReconfigurationExecutionSpecificationEntryImpl
