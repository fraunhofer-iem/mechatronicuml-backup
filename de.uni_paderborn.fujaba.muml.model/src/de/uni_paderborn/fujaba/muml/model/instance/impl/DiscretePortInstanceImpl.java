/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.common.adapter.DerivedAttributeAdapter;
import de.uni_paderborn.fujaba.muml.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.muml.model.instance.DiscretePortInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.model.msgiface.MessageInterface;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Port Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DiscretePortInstanceImpl#getReceiverMessageInterface <em>Receiver Message Interface</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.DiscretePortInstanceImpl#getSenderMessageInterface <em>Sender Message Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DiscretePortInstanceImpl extends PortInstanceImpl implements DiscretePortInstance {
	/**
	 * The cached setting delegate for the '{@link #getReceiverMessageInterface() <em>Receiver Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverMessageInterface()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RECEIVER_MESSAGE_INTERFACE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_INTERFACE).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getSenderMessageInterface() <em>Sender Message Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSenderMessageInterface()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SENDER_MESSAGE_INTERFACE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_INTERFACE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DiscretePortInstanceImpl() {
		super();

		DerivedAttributeAdapter receiverMessageInterfaceAdapter = new DerivedAttributeAdapter(this, InstancePackage.Literals.DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_INTERFACE);
		receiverMessageInterfaceAdapter.addNavigatedDependency(InstancePackage.Literals.PORT_INSTANCE__PORT_TYPE, ComponentPackage.Literals.DISCRETE_PORT__RECEIVER_MESSAGE_INTERFACE);
		
		DerivedAttributeAdapter senderMessageInterfaceAdapter = new DerivedAttributeAdapter(this, InstancePackage.Literals.DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_INTERFACE);
		senderMessageInterfaceAdapter.addNavigatedDependency(InstancePackage.Literals.PORT_INSTANCE__PORT_TYPE, ComponentPackage.Literals.DISCRETE_PORT__SENDER_MESSAGE_INTERFACE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.DISCRETE_PORT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getReceiverMessageInterface() {
		return (MessageInterface)RECEIVER_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetReceiverMessageInterface() {
		return (MessageInterface)RECEIVER_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface getSenderMessageInterface() {
		return (MessageInterface)SENDER_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageInterface basicGetSenderMessageInterface() {
		return (MessageInterface)SENDER_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_INTERFACE:
				if (resolve) return getReceiverMessageInterface();
				return basicGetReceiverMessageInterface();
			case InstancePackage.DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_INTERFACE:
				if (resolve) return getSenderMessageInterface();
				return basicGetSenderMessageInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InstancePackage.DISCRETE_PORT_INSTANCE__RECEIVER_MESSAGE_INTERFACE:
				return RECEIVER_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case InstancePackage.DISCRETE_PORT_INSTANCE__SENDER_MESSAGE_INTERFACE:
				return SENDER_MESSAGE_INTERFACE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //DiscretePortInstanceImpl
