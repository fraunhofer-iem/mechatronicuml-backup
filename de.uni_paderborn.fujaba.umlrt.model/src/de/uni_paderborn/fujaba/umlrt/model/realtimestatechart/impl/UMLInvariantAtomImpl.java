/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl;

import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.RealtimestatechartPackage;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLInvariantAtom;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeComplexState;
import de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.UMLRealtimeStatechart;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Invariant Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.realtimestatechart.impl.UMLInvariantAtomImpl#getUMLComplexRealtimeState <em>UML Complex Realtime State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLInvariantAtomImpl extends EObjectImpl implements UMLInvariantAtom {
	/**
	 * The cached value of the '{@link #getUMLComplexRealtimeState() <em>UML Complex Realtime State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUMLComplexRealtimeState()
	 * @generated
	 * @ordered
	 */
	protected UMLRealtimeComplexState uMLComplexRealtimeState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLInvariantAtomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.UML_INVARIANT_ATOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLRealtimeComplexState getUMLComplexRealtimeState() {
		return uMLComplexRealtimeState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUMLComplexRealtimeState(UMLRealtimeComplexState newUMLComplexRealtimeState, NotificationChain msgs) {
		UMLRealtimeComplexState oldUMLComplexRealtimeState = uMLComplexRealtimeState;
		uMLComplexRealtimeState = newUMLComplexRealtimeState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_INVARIANT_ATOM__UML_COMPLEX_REALTIME_STATE, oldUMLComplexRealtimeState, newUMLComplexRealtimeState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUMLComplexRealtimeState(UMLRealtimeComplexState newUMLComplexRealtimeState) {
		if (newUMLComplexRealtimeState != uMLComplexRealtimeState) {
			NotificationChain msgs = null;
			if (uMLComplexRealtimeState != null)
				msgs = ((InternalEObject)uMLComplexRealtimeState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.UML_INVARIANT_ATOM__UML_COMPLEX_REALTIME_STATE, null, msgs);
			if (newUMLComplexRealtimeState != null)
				msgs = ((InternalEObject)newUMLComplexRealtimeState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.UML_INVARIANT_ATOM__UML_COMPLEX_REALTIME_STATE, null, msgs);
			msgs = basicSetUMLComplexRealtimeState(newUMLComplexRealtimeState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.UML_INVARIANT_ATOM__UML_COMPLEX_REALTIME_STATE, newUMLComplexRealtimeState, newUMLComplexRealtimeState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject clone(UMLRealtimeStatechart rtsc, UMLInvariantAtom newAtom) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.UML_INVARIANT_ATOM__UML_COMPLEX_REALTIME_STATE:
				return basicSetUMLComplexRealtimeState(null, msgs);
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
			case RealtimestatechartPackage.UML_INVARIANT_ATOM__UML_COMPLEX_REALTIME_STATE:
				return getUMLComplexRealtimeState();
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
			case RealtimestatechartPackage.UML_INVARIANT_ATOM__UML_COMPLEX_REALTIME_STATE:
				setUMLComplexRealtimeState((UMLRealtimeComplexState)newValue);
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
			case RealtimestatechartPackage.UML_INVARIANT_ATOM__UML_COMPLEX_REALTIME_STATE:
				setUMLComplexRealtimeState((UMLRealtimeComplexState)null);
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
			case RealtimestatechartPackage.UML_INVARIANT_ATOM__UML_COMPLEX_REALTIME_STATE:
				return uMLComplexRealtimeState != null;
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
			case RealtimestatechartPackage.UML_INVARIANT_ATOM___CLONE__UMLREALTIMESTATECHART_UMLINVARIANTATOM:
				return clone((UMLRealtimeStatechart)arguments.get(0), (UMLInvariantAtom)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //UMLInvariantAtomImpl
