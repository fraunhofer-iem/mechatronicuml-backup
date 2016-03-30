/**
 */
package org.muml.reconfiguration.componentstorydiagram.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.pim.behavior.ParameterBinding;
import org.muml.pim.msgtype.MessageType;
import org.muml.reconfiguration.componentstorydiagram.ComponentstorydiagramPackage;
import org.muml.reconfiguration.componentstorydiagram.SendReconfigurationMessageExpression;
import org.muml.reconfiguration.componentstorypattern.impl.TriggerEmbeddedComponentExpressionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Reconfiguration Message Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.muml.reconfiguration.componentstorydiagram.impl.SendReconfigurationMessageExpressionImpl#getReconfigurationMessageType <em>Reconfiguration Message Type</em>}</li>
 *   <li>{@link org.muml.reconfiguration.componentstorydiagram.impl.SendReconfigurationMessageExpressionImpl#getParameterBindings <em>Parameter Bindings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SendReconfigurationMessageExpressionImpl extends TriggerEmbeddedComponentExpressionImpl implements SendReconfigurationMessageExpression {
	/**
	 * The cached value of the '{@link #getReconfigurationMessageType() <em>Reconfiguration Message Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconfigurationMessageType()
	 * @generated
	 * @ordered
	 */
	protected MessageType reconfigurationMessageType;

	/**
	 * The cached value of the '{@link #getParameterBindings() <em>Parameter Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<ParameterBinding> parameterBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendReconfigurationMessageExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorydiagramPackage.Literals.SEND_RECONFIGURATION_MESSAGE_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType getReconfigurationMessageType() {
		if (reconfigurationMessageType != null && reconfigurationMessageType.eIsProxy()) {
			InternalEObject oldReconfigurationMessageType = (InternalEObject)reconfigurationMessageType;
			reconfigurationMessageType = (MessageType)eResolveProxy(oldReconfigurationMessageType);
			if (reconfigurationMessageType != oldReconfigurationMessageType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentstorydiagramPackage.SEND_RECONFIGURATION_MESSAGE_EXPRESSION__RECONFIGURATION_MESSAGE_TYPE, oldReconfigurationMessageType, reconfigurationMessageType));
			}
		}
		return reconfigurationMessageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageType basicGetReconfigurationMessageType() {
		return reconfigurationMessageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReconfigurationMessageType(MessageType newReconfigurationMessageType) {
		MessageType oldReconfigurationMessageType = reconfigurationMessageType;
		reconfigurationMessageType = newReconfigurationMessageType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorydiagramPackage.SEND_RECONFIGURATION_MESSAGE_EXPRESSION__RECONFIGURATION_MESSAGE_TYPE, oldReconfigurationMessageType, reconfigurationMessageType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterBinding> getParameterBindings() {
		if (parameterBindings == null) {
			parameterBindings = new EObjectContainmentEList<ParameterBinding>(ParameterBinding.class, this, ComponentstorydiagramPackage.SEND_RECONFIGURATION_MESSAGE_EXPRESSION__PARAMETER_BINDINGS);
		}
		return parameterBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentstorydiagramPackage.SEND_RECONFIGURATION_MESSAGE_EXPRESSION__PARAMETER_BINDINGS:
				return ((InternalEList<?>)getParameterBindings()).basicRemove(otherEnd, msgs);
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
			case ComponentstorydiagramPackage.SEND_RECONFIGURATION_MESSAGE_EXPRESSION__RECONFIGURATION_MESSAGE_TYPE:
				if (resolve) return getReconfigurationMessageType();
				return basicGetReconfigurationMessageType();
			case ComponentstorydiagramPackage.SEND_RECONFIGURATION_MESSAGE_EXPRESSION__PARAMETER_BINDINGS:
				return getParameterBindings();
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
			case ComponentstorydiagramPackage.SEND_RECONFIGURATION_MESSAGE_EXPRESSION__RECONFIGURATION_MESSAGE_TYPE:
				setReconfigurationMessageType((MessageType)newValue);
				return;
			case ComponentstorydiagramPackage.SEND_RECONFIGURATION_MESSAGE_EXPRESSION__PARAMETER_BINDINGS:
				getParameterBindings().clear();
				getParameterBindings().addAll((Collection<? extends ParameterBinding>)newValue);
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
			case ComponentstorydiagramPackage.SEND_RECONFIGURATION_MESSAGE_EXPRESSION__RECONFIGURATION_MESSAGE_TYPE:
				setReconfigurationMessageType((MessageType)null);
				return;
			case ComponentstorydiagramPackage.SEND_RECONFIGURATION_MESSAGE_EXPRESSION__PARAMETER_BINDINGS:
				getParameterBindings().clear();
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
			case ComponentstorydiagramPackage.SEND_RECONFIGURATION_MESSAGE_EXPRESSION__RECONFIGURATION_MESSAGE_TYPE:
				return reconfigurationMessageType != null;
			case ComponentstorydiagramPackage.SEND_RECONFIGURATION_MESSAGE_EXPRESSION__PARAMETER_BINDINGS:
				return parameterBindings != null && !parameterBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SendReconfigurationMessageExpressionImpl
