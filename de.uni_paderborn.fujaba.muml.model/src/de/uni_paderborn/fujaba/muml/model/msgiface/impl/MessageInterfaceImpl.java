/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.msgiface.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageType;
import de.uni_paderborn.fujaba.muml.model.msgiface.MsgifacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.msgiface.impl.MessageInterfaceImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.msgiface.impl.MessageInterfaceImpl#getMessageTypes <em>Message Types</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.msgiface.impl.MessageInterfaceImpl#getAllAvailableMessageTypes <em>All Available Message Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageInterfaceImpl extends NamedElementImpl implements MessageInterface {
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
	 * The cached value of the '{@link #getMessageTypes() <em>Message Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageType> messageTypes;

	/**
	 * The cached setting delegate for the '{@link #getAllAvailableMessageTypes() <em>All Available Message Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllAvailableMessageTypes()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALL_AVAILABLE_MESSAGE_TYPES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)MsgifacePackage.Literals.MESSAGE_INTERFACE__ALL_AVAILABLE_MESSAGE_TYPES).getSettingDelegate();

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
			messageTypes = new EObjectContainmentWithInverseEList<MessageType>(MessageType.class, this, MsgifacePackage.MESSAGE_INTERFACE__MESSAGE_TYPES, MsgifacePackage.MESSAGE_TYPE__MESSAGE_INTERFACE);
		}
		return messageTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<MessageType> getAllAvailableMessageTypes() {
		return (EList<MessageType>)ALL_AVAILABLE_MESSAGE_TYPES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
			case MsgifacePackage.MESSAGE_INTERFACE__ALL_AVAILABLE_MESSAGE_TYPES:
				return getAllAvailableMessageTypes();
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
			case MsgifacePackage.MESSAGE_INTERFACE__ALL_AVAILABLE_MESSAGE_TYPES:
				return ALL_AVAILABLE_MESSAGE_TYPES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //MessageInterfaceImpl
