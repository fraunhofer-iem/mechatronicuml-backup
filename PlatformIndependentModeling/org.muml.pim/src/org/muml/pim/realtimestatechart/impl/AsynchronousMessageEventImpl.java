/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.realtimestatechart.AsynchronousMessageEvent;
import org.muml.pim.realtimestatechart.Message;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.one_to_n_schemata.OneToManyCommunicationSchema;
import org.muml.pim.realtimestatechart.one_to_n_schemata.One_to_n_schemataPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asynchronous Message Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.AsynchronousMessageEventImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.AsynchronousMessageEventImpl#getOneToManyCommunicationSchema <em>One To Many Communication Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsynchronousMessageEventImpl extends TransitionEventImpl implements AsynchronousMessageEvent {
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
	 * The cached value of the '{@link #getOneToManyCommunicationSchema() <em>One To Many Communication Schema</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneToManyCommunicationSchema()
	 * @generated
	 * @ordered
	 */
	protected OneToManyCommunicationSchema oneToManyCommunicationSchema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AsynchronousMessageEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.ASYNCHRONOUS_MESSAGE_EVENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE, oldMessage, newMessage);
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
				msgs = ((InternalEObject)message).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE, null, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject)newMessage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE, null, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE, newMessage, newMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneToManyCommunicationSchema getOneToManyCommunicationSchema() {
		return oneToManyCommunicationSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOneToManyCommunicationSchema(OneToManyCommunicationSchema newOneToManyCommunicationSchema, NotificationChain msgs) {
		OneToManyCommunicationSchema oldOneToManyCommunicationSchema = oneToManyCommunicationSchema;
		oneToManyCommunicationSchema = newOneToManyCommunicationSchema;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA, oldOneToManyCommunicationSchema, newOneToManyCommunicationSchema);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOneToManyCommunicationSchema(OneToManyCommunicationSchema newOneToManyCommunicationSchema) {
		if (newOneToManyCommunicationSchema != oneToManyCommunicationSchema) {
			NotificationChain msgs = null;
			if (oneToManyCommunicationSchema != null)
				msgs = ((InternalEObject)oneToManyCommunicationSchema).eInverseRemove(this, One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT, OneToManyCommunicationSchema.class, msgs);
			if (newOneToManyCommunicationSchema != null)
				msgs = ((InternalEObject)newOneToManyCommunicationSchema).eInverseAdd(this, One_to_n_schemataPackage.ONE_TO_MANY_COMMUNICATION_SCHEMA__ASYNCHRONOUS_MESSAGE_EVENT, OneToManyCommunicationSchema.class, msgs);
			msgs = basicSetOneToManyCommunicationSchema(newOneToManyCommunicationSchema, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA, newOneToManyCommunicationSchema, newOneToManyCommunicationSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA:
				if (oneToManyCommunicationSchema != null)
					msgs = ((InternalEObject)oneToManyCommunicationSchema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA, null, msgs);
				return basicSetOneToManyCommunicationSchema((OneToManyCommunicationSchema)otherEnd, msgs);
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
			case RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE:
				return basicSetMessage(null, msgs);
			case RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA:
				return basicSetOneToManyCommunicationSchema(null, msgs);
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
			case RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE:
				return getMessage();
			case RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA:
				return getOneToManyCommunicationSchema();
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
			case RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE:
				setMessage((Message)newValue);
				return;
			case RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA:
				setOneToManyCommunicationSchema((OneToManyCommunicationSchema)newValue);
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
			case RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE:
				setMessage((Message)null);
				return;
			case RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA:
				setOneToManyCommunicationSchema((OneToManyCommunicationSchema)null);
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
			case RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__MESSAGE:
				return message != null;
			case RealtimestatechartPackage.ASYNCHRONOUS_MESSAGE_EVENT__ONE_TO_MANY_COMMUNICATION_SCHEMA:
				return oneToManyCommunicationSchema != null;
		}
		return super.eIsSet(featureID);
	}

} //AsynchronousMessageEventImpl
