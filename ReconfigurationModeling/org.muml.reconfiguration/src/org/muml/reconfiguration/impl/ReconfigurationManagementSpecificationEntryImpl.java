/**
 */
package org.muml.reconfiguration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.pim.realtimestatechart.Message;
import org.muml.pim.types.impl.DataTypeImpl;
import org.muml.reconfiguration.ReconfigurationConstraint;
import org.muml.reconfiguration.ReconfigurationManagementSpecificationEntry;
import org.muml.reconfiguration.ReconfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Management Specification Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.impl.ReconfigurationManagementSpecificationEntryImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link org.muml.reconfiguration.impl.ReconfigurationManagementSpecificationEntryImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReconfigurationManagementSpecificationEntryImpl extends DataTypeImpl implements ReconfigurationManagementSpecificationEntry {
	/**
	 * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<ReconfigurationConstraint> conditions;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationManagementSpecificationEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReconfigurationConstraint> getConditions() {
		if (conditions == null) {
			conditions = new EObjectContainmentEList<ReconfigurationConstraint>(ReconfigurationConstraint.class, this, ReconfigurationPackage.RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__CONDITIONS);
		}
		return conditions;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__MESSAGE, oldMessage, newMessage);
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
				msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__MESSAGE, null, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__MESSAGE, null, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__MESSAGE, newMessage, newMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__CONDITIONS:
				return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
			case ReconfigurationPackage.RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__MESSAGE:
				return basicSetMessage(null, msgs);
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
			case ReconfigurationPackage.RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__CONDITIONS:
				return getConditions();
			case ReconfigurationPackage.RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__MESSAGE:
				return getMessage();
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
			case ReconfigurationPackage.RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__CONDITIONS:
				getConditions().clear();
				getConditions().addAll((Collection<? extends ReconfigurationConstraint>)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__MESSAGE:
				setMessage((Message)newValue);
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
			case ReconfigurationPackage.RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__CONDITIONS:
				getConditions().clear();
				return;
			case ReconfigurationPackage.RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__MESSAGE:
				setMessage((Message)null);
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
			case ReconfigurationPackage.RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__CONDITIONS:
				return conditions != null && !conditions.isEmpty();
			case ReconfigurationPackage.RECONFIGURATION_MANAGEMENT_SPECIFICATION_ENTRY__MESSAGE:
				return message != null;
		}
		return super.eIsSet(featureID);
	}

} //ReconfigurationManagementSpecificationEntryImpl
