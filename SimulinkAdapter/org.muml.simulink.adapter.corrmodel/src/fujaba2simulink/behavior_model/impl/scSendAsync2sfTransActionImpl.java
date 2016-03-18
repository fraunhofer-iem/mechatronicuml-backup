/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fujaba2simulink.behavior_model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.behavior.ParameterBinding;
import de.uni_paderborn.fujaba.muml.realtimestatechart.AsynchronousMessageEvent;
import de.uni_paderborn.fujaba.muml.realtimestatechart.Message;
import de.uni_paderborn.fujaba.simulink.model.stateflow.Action;
import fujaba2simulink.behavior_model.Behavior_modelPackage;
import fujaba2simulink.behavior_model.scSendAsync2sfTransAction;
import fujaba2simulink.impl.AbstractContainerCorrespondenceNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>sc Send Async2sf Trans Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scSendAsync2sfTransActionImpl#getSfSendAsync <em>Sf Send Async</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scSendAsync2sfTransActionImpl#getAsynchronousMessageEvent <em>Asynchronous Message Event</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scSendAsync2sfTransActionImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scSendAsync2sfTransActionImpl#getActionValue <em>Action Value</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scSendAsync2sfTransActionImpl#getScPara <em>Sc Para</em>}</li>
 *   <li>{@link fujaba2simulink.behavior_model.impl.scSendAsync2sfTransActionImpl#getParBind <em>Par Bind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class scSendAsync2sfTransActionImpl extends AbstractContainerCorrespondenceNodeImpl implements scSendAsync2sfTransAction {
	/**
	 * The cached value of the '{@link #getSfSendAsync() <em>Sf Send Async</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSfSendAsync()
	 * @generated
	 * @ordered
	 */
	protected Action sfSendAsync;

	/**
	 * The cached value of the '{@link #getAsynchronousMessageEvent() <em>Asynchronous Message Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsynchronousMessageEvent()
	 * @generated
	 * @ordered
	 */
	protected AsynchronousMessageEvent asynchronousMessageEvent;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected Message message;

	/**
	 * The default value of the '{@link #getActionValue() <em>Action Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_VALUE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getActionValue() <em>Action Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionValue()
	 * @generated
	 * @ordered
	 */
	protected String actionValue = ACTION_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScPara() <em>Sc Para</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScPara()
	 * @generated
	 * @ordered
	 */
	protected EParameter scPara;

	/**
	 * The cached value of the '{@link #getParBind() <em>Par Bind</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParBind()
	 * @generated
	 * @ordered
	 */
	protected ParameterBinding parBind;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected scSendAsync2sfTransActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Behavior_modelPackage.Literals.SC_SEND_ASYNC2SF_TRANS_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getSfSendAsync() {
		if (sfSendAsync != null && ((EObject)sfSendAsync).eIsProxy()) {
			InternalEObject oldSfSendAsync = (InternalEObject)sfSendAsync;
			sfSendAsync = (Action)eResolveProxy(oldSfSendAsync);
			if (sfSendAsync != oldSfSendAsync) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__SF_SEND_ASYNC, oldSfSendAsync, sfSendAsync));
			}
		}
		return sfSendAsync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetSfSendAsync() {
		return sfSendAsync;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSfSendAsync(Action newSfSendAsync) {
		Action oldSfSendAsync = sfSendAsync;
		sfSendAsync = newSfSendAsync;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__SF_SEND_ASYNC, oldSfSendAsync, sfSendAsync));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousMessageEvent getAsynchronousMessageEvent() {
		if (asynchronousMessageEvent != null && asynchronousMessageEvent.eIsProxy()) {
			InternalEObject oldAsynchronousMessageEvent = (InternalEObject)asynchronousMessageEvent;
			asynchronousMessageEvent = (AsynchronousMessageEvent)eResolveProxy(oldAsynchronousMessageEvent);
			if (asynchronousMessageEvent != oldAsynchronousMessageEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__ASYNCHRONOUS_MESSAGE_EVENT, oldAsynchronousMessageEvent, asynchronousMessageEvent));
			}
		}
		return asynchronousMessageEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsynchronousMessageEvent basicGetAsynchronousMessageEvent() {
		return asynchronousMessageEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsynchronousMessageEvent(AsynchronousMessageEvent newAsynchronousMessageEvent) {
		AsynchronousMessageEvent oldAsynchronousMessageEvent = asynchronousMessageEvent;
		asynchronousMessageEvent = newAsynchronousMessageEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__ASYNCHRONOUS_MESSAGE_EVENT, oldAsynchronousMessageEvent, asynchronousMessageEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getMessage() {
		if (message != null && message.eIsProxy()) {
			InternalEObject oldMessage = (InternalEObject)message;
			message = (Message)eResolveProxy(oldMessage);
			if (message != oldMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__MESSAGE, oldMessage, message));
			}
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(Message newMessage) {
		Message oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionValue() {
		return actionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionValue(String newActionValue) {
		String oldActionValue = actionValue;
		actionValue = newActionValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__ACTION_VALUE, oldActionValue, actionValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EParameter getScPara() {
		if (scPara != null && scPara.eIsProxy()) {
			InternalEObject oldScPara = (InternalEObject)scPara;
			scPara = (EParameter)eResolveProxy(oldScPara);
			if (scPara != oldScPara) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__SC_PARA, oldScPara, scPara));
			}
		}
		return scPara;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EParameter basicGetScPara() {
		return scPara;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScPara(EParameter newScPara) {
		EParameter oldScPara = scPara;
		scPara = newScPara;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__SC_PARA, oldScPara, scPara));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBinding getParBind() {
		if (parBind != null && parBind.eIsProxy()) {
			InternalEObject oldParBind = (InternalEObject)parBind;
			parBind = (ParameterBinding)eResolveProxy(oldParBind);
			if (parBind != oldParBind) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__PAR_BIND, oldParBind, parBind));
			}
		}
		return parBind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterBinding basicGetParBind() {
		return parBind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParBind(ParameterBinding newParBind) {
		ParameterBinding oldParBind = parBind;
		parBind = newParBind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__PAR_BIND, oldParBind, parBind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__SF_SEND_ASYNC:
				if (resolve) return getSfSendAsync();
				return basicGetSfSendAsync();
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__ASYNCHRONOUS_MESSAGE_EVENT:
				if (resolve) return getAsynchronousMessageEvent();
				return basicGetAsynchronousMessageEvent();
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__MESSAGE:
				if (resolve) return getMessage();
				return basicGetMessage();
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__ACTION_VALUE:
				return getActionValue();
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__SC_PARA:
				if (resolve) return getScPara();
				return basicGetScPara();
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__PAR_BIND:
				if (resolve) return getParBind();
				return basicGetParBind();
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
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__SF_SEND_ASYNC:
				setSfSendAsync((Action)newValue);
				return;
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__ASYNCHRONOUS_MESSAGE_EVENT:
				setAsynchronousMessageEvent((AsynchronousMessageEvent)newValue);
				return;
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__MESSAGE:
				setMessage((Message)newValue);
				return;
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__ACTION_VALUE:
				setActionValue((String)newValue);
				return;
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__SC_PARA:
				setScPara((EParameter)newValue);
				return;
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__PAR_BIND:
				setParBind((ParameterBinding)newValue);
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
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__SF_SEND_ASYNC:
				setSfSendAsync((Action)null);
				return;
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__ASYNCHRONOUS_MESSAGE_EVENT:
				setAsynchronousMessageEvent((AsynchronousMessageEvent)null);
				return;
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__MESSAGE:
				setMessage((Message)null);
				return;
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__ACTION_VALUE:
				setActionValue(ACTION_VALUE_EDEFAULT);
				return;
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__SC_PARA:
				setScPara((EParameter)null);
				return;
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__PAR_BIND:
				setParBind((ParameterBinding)null);
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
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__SF_SEND_ASYNC:
				return sfSendAsync != null;
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__ASYNCHRONOUS_MESSAGE_EVENT:
				return asynchronousMessageEvent != null;
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__MESSAGE:
				return message != null;
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__ACTION_VALUE:
				return ACTION_VALUE_EDEFAULT == null ? actionValue != null : !ACTION_VALUE_EDEFAULT.equals(actionValue);
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__SC_PARA:
				return scPara != null;
			case Behavior_modelPackage.SC_SEND_ASYNC2SF_TRANS_ACTION__PAR_BIND:
				return parBind != null;
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
		result.append(" (ActionValue: ");
		result.append(actionValue);
		result.append(')');
		return result.toString();
	}

} //scSendAsync2sfTransActionImpl
