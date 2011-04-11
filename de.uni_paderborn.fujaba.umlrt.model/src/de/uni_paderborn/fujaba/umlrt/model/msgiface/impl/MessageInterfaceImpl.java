/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.msgiface.impl;

import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageInterface;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.umlrt.model.msgiface.MsgifacePackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EClassImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.impl.MessageInterfaceImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.msgiface.impl.MessageInterfaceImpl#getMessageTypes <em>Message Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageInterfaceImpl extends EObjectImpl implements MessageInterface {
	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageInterface> superType;
	/**
	 * The cached value of the '{@link #getMessageTypes() <em>Message Types</em>}' reference list.
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
	protected MessageInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsgifacePackage.Literals.MESSAGE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageInterface> getSuperType() {
		if (superType == null) {
			superType = new EObjectResolvingEList<MessageInterface>(MessageInterface.class, this, MsgifacePackage.MESSAGE_INTERFACE__SUPER_TYPE);
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageType> getMessageTypes() {
		if (messageTypes == null) {
			messageTypes = new EObjectWithInverseResolvingEList<MessageType>(MessageType.class, this, MsgifacePackage.MESSAGE_INTERFACE__MESSAGE_TYPES, MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE);
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
			case MsgifacePackage.MESSAGE_INTERFACE__MESSAGE_TYPES:
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
			case MsgifacePackage.MESSAGE_INTERFACE__MESSAGE_TYPES:
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
			case MsgifacePackage.MESSAGE_INTERFACE__SUPER_TYPE:
				return getSuperType();
			case MsgifacePackage.MESSAGE_INTERFACE__MESSAGE_TYPES:
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
			case MsgifacePackage.MESSAGE_INTERFACE__SUPER_TYPE:
				getSuperType().clear();
				getSuperType().addAll((Collection<? extends MessageInterface>)newValue);
				return;
			case MsgifacePackage.MESSAGE_INTERFACE__MESSAGE_TYPES:
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
			case MsgifacePackage.MESSAGE_INTERFACE__SUPER_TYPE:
				getSuperType().clear();
				return;
			case MsgifacePackage.MESSAGE_INTERFACE__MESSAGE_TYPES:
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
			case MsgifacePackage.MESSAGE_INTERFACE__SUPER_TYPE:
				return superType != null && !superType.isEmpty();
			case MsgifacePackage.MESSAGE_INTERFACE__MESSAGE_TYPES:
				return messageTypes != null && !messageTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MessageInterfaceImpl
