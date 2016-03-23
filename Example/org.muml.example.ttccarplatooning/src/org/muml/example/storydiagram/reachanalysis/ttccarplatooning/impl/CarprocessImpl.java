/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.example.storydiagram.reachanalysis.ttccarplatooning.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.example.storydiagram.reachanalysis.ttccarplatooning.ActiveState;
import org.muml.example.storydiagram.reachanalysis.ttccarplatooning.CarParameter;
import org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Carprocess;
import org.muml.example.storydiagram.reachanalysis.ttccarplatooning.MessageQueue;
import org.muml.example.storydiagram.reachanalysis.ttccarplatooning.Statechart;
import org.muml.example.storydiagram.reachanalysis.ttccarplatooning.TtccarplatooningPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Carprocess</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.impl.CarprocessImpl#getCurState <em>Cur State</em>}</li>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.impl.CarprocessImpl#getQueue <em>Queue</em>}</li>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.impl.CarprocessImpl#getStatechart <em>Statechart</em>}</li>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.impl.CarprocessImpl#getFollower <em>Follower</em>}</li>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.impl.CarprocessImpl#getLeader <em>Leader</em>}</li>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.impl.CarprocessImpl#getAux <em>Aux</em>}</li>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.impl.CarprocessImpl#getBldr <em>Bldr</em>}</li>
 *   <li>{@link org.muml.example.storydiagram.reachanalysis.ttccarplatooning.impl.CarprocessImpl#getCarParameter <em>Car Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CarprocessImpl extends EObjectImpl implements Carprocess {
	/**
	 * The cached value of the '{@link #getCurState() <em>Cur State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurState()
	 * @generated
	 * @ordered
	 */
	protected ActiveState curState;

	/**
	 * The cached value of the '{@link #getQueue() <em>Queue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueue()
	 * @generated
	 * @ordered
	 */
	protected MessageQueue queue;

	/**
	 * The cached value of the '{@link #getStatechart() <em>Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatechart()
	 * @generated
	 * @ordered
	 */
	protected Statechart statechart;

	/**
	 * The cached value of the '{@link #getFollower() <em>Follower</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollower()
	 * @generated
	 * @ordered
	 */
	protected EList<Carprocess> follower;

	/**
	 * The cached value of the '{@link #getLeader() <em>Leader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeader()
	 * @generated
	 * @ordered
	 */
	protected Carprocess leader;

	/**
	 * The cached value of the '{@link #getAux() <em>Aux</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAux()
	 * @generated
	 * @ordered
	 */
	protected Carprocess aux;

	/**
	 * The cached value of the '{@link #getBldr() <em>Bldr</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBldr()
	 * @generated
	 * @ordered
	 */
	protected Carprocess bldr;

	/**
	 * The cached value of the '{@link #getCarParameter() <em>Car Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<CarParameter> carParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CarprocessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TtccarplatooningPackage.Literals.CARPROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveState getCurState() {
		return curState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurState(ActiveState newCurState, NotificationChain msgs) {
		ActiveState oldCurState = curState;
		curState = newCurState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TtccarplatooningPackage.CARPROCESS__CUR_STATE, oldCurState, newCurState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurState(ActiveState newCurState) {
		if (newCurState != curState) {
			NotificationChain msgs = null;
			if (curState != null)
				msgs = ((InternalEObject)curState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TtccarplatooningPackage.CARPROCESS__CUR_STATE, null, msgs);
			if (newCurState != null)
				msgs = ((InternalEObject)newCurState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TtccarplatooningPackage.CARPROCESS__CUR_STATE, null, msgs);
			msgs = basicSetCurState(newCurState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtccarplatooningPackage.CARPROCESS__CUR_STATE, newCurState, newCurState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageQueue getQueue() {
		return queue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueue(MessageQueue newQueue, NotificationChain msgs) {
		MessageQueue oldQueue = queue;
		queue = newQueue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TtccarplatooningPackage.CARPROCESS__QUEUE, oldQueue, newQueue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueue(MessageQueue newQueue) {
		if (newQueue != queue) {
			NotificationChain msgs = null;
			if (queue != null)
				msgs = ((InternalEObject)queue).eInverseRemove(this, TtccarplatooningPackage.MESSAGE_QUEUE__CARPROCESS, MessageQueue.class, msgs);
			if (newQueue != null)
				msgs = ((InternalEObject)newQueue).eInverseAdd(this, TtccarplatooningPackage.MESSAGE_QUEUE__CARPROCESS, MessageQueue.class, msgs);
			msgs = basicSetQueue(newQueue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtccarplatooningPackage.CARPROCESS__QUEUE, newQueue, newQueue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statechart getStatechart() {
		if (statechart != null && statechart.eIsProxy()) {
			InternalEObject oldStatechart = (InternalEObject)statechart;
			statechart = (Statechart)eResolveProxy(oldStatechart);
			if (statechart != oldStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TtccarplatooningPackage.CARPROCESS__STATECHART, oldStatechart, statechart));
			}
		}
		return statechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statechart basicGetStatechart() {
		return statechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatechart(Statechart newStatechart) {
		Statechart oldStatechart = statechart;
		statechart = newStatechart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtccarplatooningPackage.CARPROCESS__STATECHART, oldStatechart, statechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Carprocess> getFollower() {
		if (follower == null) {
			follower = new EObjectResolvingEList<Carprocess>(Carprocess.class, this, TtccarplatooningPackage.CARPROCESS__FOLLOWER);
		}
		return follower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carprocess getLeader() {
		if (leader != null && leader.eIsProxy()) {
			InternalEObject oldLeader = (InternalEObject)leader;
			leader = (Carprocess)eResolveProxy(oldLeader);
			if (leader != oldLeader) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TtccarplatooningPackage.CARPROCESS__LEADER, oldLeader, leader));
			}
		}
		return leader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carprocess basicGetLeader() {
		return leader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeader(Carprocess newLeader) {
		Carprocess oldLeader = leader;
		leader = newLeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtccarplatooningPackage.CARPROCESS__LEADER, oldLeader, leader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carprocess getAux() {
		if (aux != null && aux.eIsProxy()) {
			InternalEObject oldAux = (InternalEObject)aux;
			aux = (Carprocess)eResolveProxy(oldAux);
			if (aux != oldAux) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TtccarplatooningPackage.CARPROCESS__AUX, oldAux, aux));
			}
		}
		return aux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carprocess basicGetAux() {
		return aux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAux(Carprocess newAux) {
		Carprocess oldAux = aux;
		aux = newAux;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtccarplatooningPackage.CARPROCESS__AUX, oldAux, aux));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carprocess getBldr() {
		if (bldr != null && bldr.eIsProxy()) {
			InternalEObject oldBldr = (InternalEObject)bldr;
			bldr = (Carprocess)eResolveProxy(oldBldr);
			if (bldr != oldBldr) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TtccarplatooningPackage.CARPROCESS__BLDR, oldBldr, bldr));
			}
		}
		return bldr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Carprocess basicGetBldr() {
		return bldr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBldr(Carprocess newBldr) {
		Carprocess oldBldr = bldr;
		bldr = newBldr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TtccarplatooningPackage.CARPROCESS__BLDR, oldBldr, bldr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CarParameter> getCarParameter() {
		if (carParameter == null) {
			carParameter = new EObjectWithInverseResolvingEList<CarParameter>(CarParameter.class, this, TtccarplatooningPackage.CARPROCESS__CAR_PARAMETER, TtccarplatooningPackage.CAR_PARAMETER__CAR);
		}
		return carParameter;
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
			case TtccarplatooningPackage.CARPROCESS__QUEUE:
				if (queue != null)
					msgs = ((InternalEObject)queue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TtccarplatooningPackage.CARPROCESS__QUEUE, null, msgs);
				return basicSetQueue((MessageQueue)otherEnd, msgs);
			case TtccarplatooningPackage.CARPROCESS__CAR_PARAMETER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCarParameter()).basicAdd(otherEnd, msgs);
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
			case TtccarplatooningPackage.CARPROCESS__CUR_STATE:
				return basicSetCurState(null, msgs);
			case TtccarplatooningPackage.CARPROCESS__QUEUE:
				return basicSetQueue(null, msgs);
			case TtccarplatooningPackage.CARPROCESS__CAR_PARAMETER:
				return ((InternalEList<?>)getCarParameter()).basicRemove(otherEnd, msgs);
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
			case TtccarplatooningPackage.CARPROCESS__CUR_STATE:
				return getCurState();
			case TtccarplatooningPackage.CARPROCESS__QUEUE:
				return getQueue();
			case TtccarplatooningPackage.CARPROCESS__STATECHART:
				if (resolve) return getStatechart();
				return basicGetStatechart();
			case TtccarplatooningPackage.CARPROCESS__FOLLOWER:
				return getFollower();
			case TtccarplatooningPackage.CARPROCESS__LEADER:
				if (resolve) return getLeader();
				return basicGetLeader();
			case TtccarplatooningPackage.CARPROCESS__AUX:
				if (resolve) return getAux();
				return basicGetAux();
			case TtccarplatooningPackage.CARPROCESS__BLDR:
				if (resolve) return getBldr();
				return basicGetBldr();
			case TtccarplatooningPackage.CARPROCESS__CAR_PARAMETER:
				return getCarParameter();
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
			case TtccarplatooningPackage.CARPROCESS__CUR_STATE:
				setCurState((ActiveState)newValue);
				return;
			case TtccarplatooningPackage.CARPROCESS__QUEUE:
				setQueue((MessageQueue)newValue);
				return;
			case TtccarplatooningPackage.CARPROCESS__STATECHART:
				setStatechart((Statechart)newValue);
				return;
			case TtccarplatooningPackage.CARPROCESS__FOLLOWER:
				getFollower().clear();
				getFollower().addAll((Collection<? extends Carprocess>)newValue);
				return;
			case TtccarplatooningPackage.CARPROCESS__LEADER:
				setLeader((Carprocess)newValue);
				return;
			case TtccarplatooningPackage.CARPROCESS__AUX:
				setAux((Carprocess)newValue);
				return;
			case TtccarplatooningPackage.CARPROCESS__BLDR:
				setBldr((Carprocess)newValue);
				return;
			case TtccarplatooningPackage.CARPROCESS__CAR_PARAMETER:
				getCarParameter().clear();
				getCarParameter().addAll((Collection<? extends CarParameter>)newValue);
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
			case TtccarplatooningPackage.CARPROCESS__CUR_STATE:
				setCurState((ActiveState)null);
				return;
			case TtccarplatooningPackage.CARPROCESS__QUEUE:
				setQueue((MessageQueue)null);
				return;
			case TtccarplatooningPackage.CARPROCESS__STATECHART:
				setStatechart((Statechart)null);
				return;
			case TtccarplatooningPackage.CARPROCESS__FOLLOWER:
				getFollower().clear();
				return;
			case TtccarplatooningPackage.CARPROCESS__LEADER:
				setLeader((Carprocess)null);
				return;
			case TtccarplatooningPackage.CARPROCESS__AUX:
				setAux((Carprocess)null);
				return;
			case TtccarplatooningPackage.CARPROCESS__BLDR:
				setBldr((Carprocess)null);
				return;
			case TtccarplatooningPackage.CARPROCESS__CAR_PARAMETER:
				getCarParameter().clear();
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
			case TtccarplatooningPackage.CARPROCESS__CUR_STATE:
				return curState != null;
			case TtccarplatooningPackage.CARPROCESS__QUEUE:
				return queue != null;
			case TtccarplatooningPackage.CARPROCESS__STATECHART:
				return statechart != null;
			case TtccarplatooningPackage.CARPROCESS__FOLLOWER:
				return follower != null && !follower.isEmpty();
			case TtccarplatooningPackage.CARPROCESS__LEADER:
				return leader != null;
			case TtccarplatooningPackage.CARPROCESS__AUX:
				return aux != null;
			case TtccarplatooningPackage.CARPROCESS__BLDR:
				return bldr != null;
			case TtccarplatooningPackage.CARPROCESS__CAR_PARAMETER:
				return carParameter != null && !carParameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CarprocessImpl
