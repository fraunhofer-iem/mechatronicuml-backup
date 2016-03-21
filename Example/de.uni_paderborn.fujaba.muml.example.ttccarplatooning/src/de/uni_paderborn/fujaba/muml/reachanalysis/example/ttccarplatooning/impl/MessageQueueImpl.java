/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl;

import de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Carprocess;
import de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.Message;
import de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.MessageQueue;
import de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.TtccarplatooningPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Queue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.MessageQueueImpl#getCarprocess <em>Carprocess</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reachanalysis.example.ttccarplatooning.impl.MessageQueueImpl#getMessages <em>Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageQueueImpl extends EObjectImpl implements MessageQueue {
	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> messages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageQueueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TtccarplatooningPackage.Literals.MESSAGE_QUEUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carprocess getCarprocess() {
		if (eContainerFeatureID() != TtccarplatooningPackage.MESSAGE_QUEUE__CARPROCESS) return null;
		return (Carprocess)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarprocess(Carprocess newCarprocess, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCarprocess, TtccarplatooningPackage.MESSAGE_QUEUE__CARPROCESS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCarprocess(Carprocess newCarprocess) {
		if (newCarprocess != eInternalContainer() || (eContainerFeatureID() != TtccarplatooningPackage.MESSAGE_QUEUE__CARPROCESS && newCarprocess != null)) {
			if (EcoreUtil.isAncestor(this, newCarprocess))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCarprocess != null)
				msgs = ((InternalEObject)newCarprocess).eInverseAdd(this, TtccarplatooningPackage.CARPROCESS__QUEUE, Carprocess.class, msgs);
			msgs = basicSetCarprocess(newCarprocess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtccarplatooningPackage.MESSAGE_QUEUE__CARPROCESS, newCarprocess, newCarprocess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentEList<Message>(Message.class, this, TtccarplatooningPackage.MESSAGE_QUEUE__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TtccarplatooningPackage.MESSAGE_QUEUE__CARPROCESS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCarprocess((Carprocess)otherEnd, msgs);
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
			case TtccarplatooningPackage.MESSAGE_QUEUE__CARPROCESS:
				return basicSetCarprocess(null, msgs);
			case TtccarplatooningPackage.MESSAGE_QUEUE__MESSAGES:
				return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TtccarplatooningPackage.MESSAGE_QUEUE__CARPROCESS:
				return eInternalContainer().eInverseRemove(this, TtccarplatooningPackage.CARPROCESS__QUEUE, Carprocess.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TtccarplatooningPackage.MESSAGE_QUEUE__CARPROCESS:
				return getCarprocess();
			case TtccarplatooningPackage.MESSAGE_QUEUE__MESSAGES:
				return getMessages();
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
			case TtccarplatooningPackage.MESSAGE_QUEUE__CARPROCESS:
				setCarprocess((Carprocess)newValue);
				return;
			case TtccarplatooningPackage.MESSAGE_QUEUE__MESSAGES:
				getMessages().clear();
				getMessages().addAll((Collection<? extends Message>)newValue);
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
			case TtccarplatooningPackage.MESSAGE_QUEUE__CARPROCESS:
				setCarprocess((Carprocess)null);
				return;
			case TtccarplatooningPackage.MESSAGE_QUEUE__MESSAGES:
				getMessages().clear();
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
			case TtccarplatooningPackage.MESSAGE_QUEUE__CARPROCESS:
				return getCarprocess() != null;
			case TtccarplatooningPackage.MESSAGE_QUEUE__MESSAGES:
				return messages != null && !messages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MessageQueueImpl
