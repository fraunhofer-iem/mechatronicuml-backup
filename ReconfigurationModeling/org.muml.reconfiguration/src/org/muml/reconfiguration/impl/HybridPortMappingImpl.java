/**
 */
package org.muml.reconfiguration.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.muml.mumlcore.expressions.Expression;
import org.muml.pim.component.HybridPort;
import org.muml.reconfiguration.HybridPortMapping;
import org.muml.reconfiguration.ReconfigurationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hybrid Port Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfiguration.impl.HybridPortMappingImpl#getHybridPort <em>Hybrid Port</em>}</li>
 *   <li>{@link org.muml.reconfiguration.impl.HybridPortMappingImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HybridPortMappingImpl extends EObjectImpl implements HybridPortMapping {
	/**
	 * The cached value of the '{@link #getHybridPort() <em>Hybrid Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHybridPort()
	 * @generated
	 * @ordered
	 */
	protected HybridPort hybridPort;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected Expression function;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HybridPortMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.HYBRID_PORT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridPort getHybridPort() {
		if (hybridPort != null && hybridPort.eIsProxy()) {
			InternalEObject oldHybridPort = (InternalEObject)hybridPort;
			hybridPort = (HybridPort)eResolveProxy(oldHybridPort);
			if (hybridPort != oldHybridPort) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfigurationPackage.HYBRID_PORT_MAPPING__HYBRID_PORT, oldHybridPort, hybridPort));
			}
		}
		return hybridPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HybridPort basicGetHybridPort() {
		return hybridPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHybridPort(HybridPort newHybridPort) {
		HybridPort oldHybridPort = hybridPort;
		hybridPort = newHybridPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.HYBRID_PORT_MAPPING__HYBRID_PORT, oldHybridPort, hybridPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunction(Expression newFunction, NotificationChain msgs) {
		Expression oldFunction = function;
		function = newFunction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.HYBRID_PORT_MAPPING__FUNCTION, oldFunction, newFunction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Expression newFunction) {
		if (newFunction != function) {
			NotificationChain msgs = null;
			if (function != null)
				msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.HYBRID_PORT_MAPPING__FUNCTION, null, msgs);
			if (newFunction != null)
				msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReconfigurationPackage.HYBRID_PORT_MAPPING__FUNCTION, null, msgs);
			msgs = basicSetFunction(newFunction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.HYBRID_PORT_MAPPING__FUNCTION, newFunction, newFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReconfigurationPackage.HYBRID_PORT_MAPPING__FUNCTION:
				return basicSetFunction(null, msgs);
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
			case ReconfigurationPackage.HYBRID_PORT_MAPPING__HYBRID_PORT:
				if (resolve) return getHybridPort();
				return basicGetHybridPort();
			case ReconfigurationPackage.HYBRID_PORT_MAPPING__FUNCTION:
				return getFunction();
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
			case ReconfigurationPackage.HYBRID_PORT_MAPPING__HYBRID_PORT:
				setHybridPort((HybridPort)newValue);
				return;
			case ReconfigurationPackage.HYBRID_PORT_MAPPING__FUNCTION:
				setFunction((Expression)newValue);
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
			case ReconfigurationPackage.HYBRID_PORT_MAPPING__HYBRID_PORT:
				setHybridPort((HybridPort)null);
				return;
			case ReconfigurationPackage.HYBRID_PORT_MAPPING__FUNCTION:
				setFunction((Expression)null);
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
			case ReconfigurationPackage.HYBRID_PORT_MAPPING__HYBRID_PORT:
				return hybridPort != null;
			case ReconfigurationPackage.HYBRID_PORT_MAPPING__FUNCTION:
				return function != null;
		}
		return super.eIsSet(featureID);
	}

} //HybridPortMappingImpl
