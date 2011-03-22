/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeTransition;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.storydriven.modeling.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Realtime State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStateImpl#getOutgoingUMLRealtimeTransitions <em>Outgoing UML Realtime Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStateImpl#getIncomingUMLRealtimeTransitions <em>Incoming UML Realtime Transitions</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLRealtimeStateImpl#getUMLRealtimeStatechart <em>UML Realtime Statechart</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UMLRealtimeStateImpl extends NamedElementImpl implements UMLRealtimeState {
	/**
	 * The cached value of the '{@link #getOutgoingUMLRealtimeTransitions() <em>Outgoing UML Realtime Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingUMLRealtimeTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLRealtimeTransition> outgoingUMLRealtimeTransitions;

	/**
	 * The cached value of the '{@link #getIncomingUMLRealtimeTransitions() <em>Incoming UML Realtime Transitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingUMLRealtimeTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLRealtimeTransition> incomingUMLRealtimeTransitions;

	/**
	 * The cached value of the '{@link #getUMLRealtimeStatechart() <em>UML Realtime Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLRealtimeStatechart()
	 * @generated
	 * @ordered
	 */
	protected UMLRealtimeStatechart uMLRealtimeStatechart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLRealtimeStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.UML_REALTIME_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UMLRealtimeTransition> getOutgoingUMLRealtimeTransitions() {
		if (outgoingUMLRealtimeTransitions == null) {
			outgoingUMLRealtimeTransitions = new EObjectResolvingEList<UMLRealtimeTransition>(UMLRealtimeTransition.class, this, RealtimestatechartPackage.UML_REALTIME_STATE__OUTGOING_UML_REALTIME_TRANSITIONS);
		}
		return outgoingUMLRealtimeTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UMLRealtimeTransition> getIncomingUMLRealtimeTransitions() {
		if (incomingUMLRealtimeTransitions == null) {
			incomingUMLRealtimeTransitions = new EObjectResolvingEList<UMLRealtimeTransition>(UMLRealtimeTransition.class, this, RealtimestatechartPackage.UML_REALTIME_STATE__INCOMING_UML_REALTIME_TRANSITIONS);
		}
		return incomingUMLRealtimeTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeStatechart getUMLRealtimeStatechart() {
		if (uMLRealtimeStatechart != null && uMLRealtimeStatechart.eIsProxy()) {
			InternalEObject oldUMLRealtimeStatechart = (InternalEObject)uMLRealtimeStatechart;
			uMLRealtimeStatechart = (UMLRealtimeStatechart)eResolveProxy(oldUMLRealtimeStatechart);
			if (uMLRealtimeStatechart != oldUMLRealtimeStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.UML_REALTIME_STATE__UML_REALTIME_STATECHART, oldUMLRealtimeStatechart, uMLRealtimeStatechart));
			}
		}
		return uMLRealtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeStatechart basicGetUMLRealtimeStatechart() {
		return uMLRealtimeStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLRealtimeStatechart(UMLRealtimeStatechart newUMLRealtimeStatechart) {
		UMLRealtimeStatechart oldUMLRealtimeStatechart = uMLRealtimeStatechart;
		uMLRealtimeStatechart = newUMLRealtimeStatechart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_REALTIME_STATE__UML_REALTIME_STATECHART, oldUMLRealtimeStatechart, uMLRealtimeStatechart));
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
	public UMLRealtimeStatechart getRootRealtimeStatechart() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RealtimestatechartPackage.UML_REALTIME_STATE__OUTGOING_UML_REALTIME_TRANSITIONS:
				return getOutgoingUMLRealtimeTransitions();
			case RealtimestatechartPackage.UML_REALTIME_STATE__INCOMING_UML_REALTIME_TRANSITIONS:
				return getIncomingUMLRealtimeTransitions();
			case RealtimestatechartPackage.UML_REALTIME_STATE__UML_REALTIME_STATECHART:
				if (resolve) return getUMLRealtimeStatechart();
				return basicGetUMLRealtimeStatechart();
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
			case RealtimestatechartPackage.UML_REALTIME_STATE__OUTGOING_UML_REALTIME_TRANSITIONS:
				getOutgoingUMLRealtimeTransitions().clear();
				getOutgoingUMLRealtimeTransitions().addAll((Collection<? extends UMLRealtimeTransition>)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_STATE__INCOMING_UML_REALTIME_TRANSITIONS:
				getIncomingUMLRealtimeTransitions().clear();
				getIncomingUMLRealtimeTransitions().addAll((Collection<? extends UMLRealtimeTransition>)newValue);
				return;
			case RealtimestatechartPackage.UML_REALTIME_STATE__UML_REALTIME_STATECHART:
				setUMLRealtimeStatechart((UMLRealtimeStatechart)newValue);
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
			case RealtimestatechartPackage.UML_REALTIME_STATE__OUTGOING_UML_REALTIME_TRANSITIONS:
				getOutgoingUMLRealtimeTransitions().clear();
				return;
			case RealtimestatechartPackage.UML_REALTIME_STATE__INCOMING_UML_REALTIME_TRANSITIONS:
				getIncomingUMLRealtimeTransitions().clear();
				return;
			case RealtimestatechartPackage.UML_REALTIME_STATE__UML_REALTIME_STATECHART:
				setUMLRealtimeStatechart((UMLRealtimeStatechart)null);
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
			case RealtimestatechartPackage.UML_REALTIME_STATE__OUTGOING_UML_REALTIME_TRANSITIONS:
				return outgoingUMLRealtimeTransitions != null && !outgoingUMLRealtimeTransitions.isEmpty();
			case RealtimestatechartPackage.UML_REALTIME_STATE__INCOMING_UML_REALTIME_TRANSITIONS:
				return incomingUMLRealtimeTransitions != null && !incomingUMLRealtimeTransitions.isEmpty();
			case RealtimestatechartPackage.UML_REALTIME_STATE__UML_REALTIME_STATECHART:
				return uMLRealtimeStatechart != null;
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
			case RealtimestatechartPackage.UML_REALTIME_STATE___GET_LONG_NAME:
				return getLongName();
			case RealtimestatechartPackage.UML_REALTIME_STATE___GET_ROOT_REALTIME_STATECHART:
				return getRootRealtimeStatechart();
		}
		return super.eInvoke(operationID, arguments);
	}

} //UMLRealtimeStateImpl
