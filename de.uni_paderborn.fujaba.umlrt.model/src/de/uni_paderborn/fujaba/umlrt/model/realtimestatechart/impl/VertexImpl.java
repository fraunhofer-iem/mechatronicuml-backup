/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.core.AbstractRealtimeStatechart;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.modeling.impl.NamedElementImpl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Transition;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.VertexImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.VertexImpl#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.VertexImpl#getStatechart <em>Statechart</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VertexImpl extends NamedElementImpl implements Vertex {
	/**
	 * The cached value of the '{@link #getOutgoingTransitions() <em>Outgoing Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoingTransitions;

	/**
	 * The cached value of the '{@link #getIncomingTransitions() <em>Incoming Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incomingTransitions;

	/**
	 * The cached value of the '{@link #getStatechart() <em>Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatechart()
	 * @generated
	 * @ordered
	 */
	protected AbstractRealtimeStatechart statechart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.VERTEX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoingTransitions() {
		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, RealtimestatechartPackage.VERTEX__OUTGOING_TRANSITIONS, RealtimestatechartPackage.TRANSITION__SOURCE);
		}
		return outgoingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncomingTransitions() {
		if (incomingTransitions == null) {
			incomingTransitions = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, RealtimestatechartPackage.VERTEX__INCOMING_TRANSITIONS, RealtimestatechartPackage.TRANSITION__TARGET);
		}
		return incomingTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRealtimeStatechart getStatechart() {
		if (statechart != null && statechart.eIsProxy()) {
			InternalEObject oldStatechart = (InternalEObject)statechart;
			statechart = (AbstractRealtimeStatechart)eResolveProxy(oldStatechart);
			if (statechart != oldStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.VERTEX__STATECHART, oldStatechart, statechart));
			}
		}
		return statechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRealtimeStatechart basicGetStatechart() {
		return statechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatechart(AbstractRealtimeStatechart newStatechart) {
		AbstractRealtimeStatechart oldStatechart = statechart;
		statechart = newStatechart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.VERTEX__STATECHART, oldStatechart, statechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractRealtimeStatechart getRootRealtimeStatechart() {
		AbstractRealtimeStatechart root = null;
		org.eclipse.emf.ecore.EObject obj = getStatechart();
		for (org.eclipse.emf.ecore.EObject element = obj; element != null; element = element
			.eContainer()) {
			if (element instanceof AbstractRealtimeStatechart) {
				root = (AbstractRealtimeStatechart)element;
			}
		}
		return root;
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
			case RealtimestatechartPackage.VERTEX__OUTGOING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTransitions()).basicAdd(otherEnd, msgs);
			case RealtimestatechartPackage.VERTEX__INCOMING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingTransitions()).basicAdd(otherEnd, msgs);
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
			case RealtimestatechartPackage.VERTEX__OUTGOING_TRANSITIONS:
				return ((InternalEList<?>)getOutgoingTransitions()).basicRemove(otherEnd, msgs);
			case RealtimestatechartPackage.VERTEX__INCOMING_TRANSITIONS:
				return ((InternalEList<?>)getIncomingTransitions()).basicRemove(otherEnd, msgs);
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
			case RealtimestatechartPackage.VERTEX__OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
			case RealtimestatechartPackage.VERTEX__INCOMING_TRANSITIONS:
				return getIncomingTransitions();
			case RealtimestatechartPackage.VERTEX__STATECHART:
				if (resolve) return getStatechart();
				return basicGetStatechart();
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
			case RealtimestatechartPackage.VERTEX__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				getOutgoingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case RealtimestatechartPackage.VERTEX__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				getIncomingTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case RealtimestatechartPackage.VERTEX__STATECHART:
				setStatechart((AbstractRealtimeStatechart)newValue);
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
			case RealtimestatechartPackage.VERTEX__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				return;
			case RealtimestatechartPackage.VERTEX__INCOMING_TRANSITIONS:
				getIncomingTransitions().clear();
				return;
			case RealtimestatechartPackage.VERTEX__STATECHART:
				setStatechart((AbstractRealtimeStatechart)null);
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
			case RealtimestatechartPackage.VERTEX__OUTGOING_TRANSITIONS:
				return outgoingTransitions != null && !outgoingTransitions.isEmpty();
			case RealtimestatechartPackage.VERTEX__INCOMING_TRANSITIONS:
				return incomingTransitions != null && !incomingTransitions.isEmpty();
			case RealtimestatechartPackage.VERTEX__STATECHART:
				return statechart != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RealtimestatechartPackage.VERTEX___GET_LONG_NAME:
				return getLongName();
			case RealtimestatechartPackage.VERTEX___GET_ROOT_REALTIME_STATECHART:
				return getRootRealtimeStatechart();
		}
		return super.eInvoke(operationID, arguments);
	}

} //VertexImpl
