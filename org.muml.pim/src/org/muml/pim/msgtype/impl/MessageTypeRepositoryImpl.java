/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.msgtype.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.impl.RepositoryImpl;
import org.muml.pim.msgtype.MessageType;
import org.muml.pim.msgtype.MessageTypeRepository;
import org.muml.pim.msgtype.MsgtypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Type Repository</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.msgtype.impl.MessageTypeRepositoryImpl#getMessageTypes <em>Message Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageTypeRepositoryImpl extends RepositoryImpl implements MessageTypeRepository {
	/**
	 * The cached value of the '{@link #getMessageTypes() <em>Message Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageType> messageTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageTypeRepositoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsgtypePackage.Literals.MESSAGE_TYPE_REPOSITORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageType> getMessageTypes() {
		if (messageTypes == null) {
			messageTypes = new EObjectContainmentWithInverseEList<MessageType>(MessageType.class, this, MsgtypePackage.MESSAGE_TYPE_REPOSITORY__MESSAGE_TYPES, MsgtypePackage.MESSAGE_TYPE__REPOSITORY);
		}
		return messageTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MsgtypePackage.MESSAGE_TYPE_REPOSITORY__MESSAGE_TYPES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMessageTypes()).basicAdd(otherEnd, msgs);
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
			case MsgtypePackage.MESSAGE_TYPE_REPOSITORY__MESSAGE_TYPES:
				return ((InternalEList<?>)getMessageTypes()).basicRemove(otherEnd, msgs);
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
			case MsgtypePackage.MESSAGE_TYPE_REPOSITORY__MESSAGE_TYPES:
				return getMessageTypes();
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
			case MsgtypePackage.MESSAGE_TYPE_REPOSITORY__MESSAGE_TYPES:
				getMessageTypes().clear();
				getMessageTypes().addAll((Collection<? extends MessageType>)newValue);
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
			case MsgtypePackage.MESSAGE_TYPE_REPOSITORY__MESSAGE_TYPES:
				getMessageTypes().clear();
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
			case MsgtypePackage.MESSAGE_TYPE_REPOSITORY__MESSAGE_TYPES:
				return messageTypes != null && !messageTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MessageTypeRepositoryImpl
