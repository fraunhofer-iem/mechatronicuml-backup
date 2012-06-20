/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.impl;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessagePortEntry;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessageType;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.storydriven.core.impl.CommentableElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Port Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurationMessagePortEntryImpl#getReconfigurationMessageType <em>Reconfiguration Message Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReconfigurationMessagePortEntryImpl extends CommentableElementImpl implements ReconfigurationMessagePortEntry {
	/**
	 * The cached value of the '{@link #getReconfigurationMessageType() <em>Reconfiguration Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfigurationMessageType()
	 * @generated
	 * @ordered
	 */
	protected ReconfigurationMessageType reconfigurationMessageType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurationMessagePortEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.RECONFIGURATION_MESSAGE_PORT_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationMessageType getReconfigurationMessageType() {
		if (reconfigurationMessageType != null && reconfigurationMessageType.eIsProxy()) {
			InternalEObject oldReconfigurationMessageType = (InternalEObject)reconfigurationMessageType;
			reconfigurationMessageType = (ReconfigurationMessageType)eResolveProxy(oldReconfigurationMessageType);
			if (reconfigurationMessageType != oldReconfigurationMessageType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_ENTRY__RECONFIGURATION_MESSAGE_TYPE, oldReconfigurationMessageType, reconfigurationMessageType));
			}
		}
		return reconfigurationMessageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconfigurationMessageType basicGetReconfigurationMessageType() {
		return reconfigurationMessageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfigurationMessageType(ReconfigurationMessageType newReconfigurationMessageType) {
		ReconfigurationMessageType oldReconfigurationMessageType = reconfigurationMessageType;
		reconfigurationMessageType = newReconfigurationMessageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_ENTRY__RECONFIGURATION_MESSAGE_TYPE, oldReconfigurationMessageType, reconfigurationMessageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_ENTRY__RECONFIGURATION_MESSAGE_TYPE:
				if (resolve) return getReconfigurationMessageType();
				return basicGetReconfigurationMessageType();
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_ENTRY__RECONFIGURATION_MESSAGE_TYPE:
				setReconfigurationMessageType((ReconfigurationMessageType)newValue);
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_ENTRY__RECONFIGURATION_MESSAGE_TYPE:
				setReconfigurationMessageType((ReconfigurationMessageType)null);
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
			case ReconfigurationPackage.RECONFIGURATION_MESSAGE_PORT_ENTRY__RECONFIGURATION_MESSAGE_TYPE:
				return reconfigurationMessageType != null;
		}
		return super.eIsSet(featureID);
	}

} //ReconfigurationMessagePortEntryImpl
