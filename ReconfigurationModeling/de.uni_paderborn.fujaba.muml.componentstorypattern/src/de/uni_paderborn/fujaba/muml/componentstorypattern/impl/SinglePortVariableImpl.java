/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortVariable;
import de.uni_paderborn.fujaba.muml.componentstorypattern.SinglePortVariable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Port Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.SinglePortVariableImpl#getMultiPortVariable <em>Multi Port Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SinglePortVariableImpl extends PortVariableImpl implements SinglePortVariable {
	/**
	 * The cached value of the '{@link #getMultiPortVariable() <em>Multi Port Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiPortVariable()
	 * @generated
	 * @ordered
	 */
	protected MultiPortVariable multiPortVariable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SinglePortVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.SINGLE_PORT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPortVariable getMultiPortVariable() {
		if (multiPortVariable != null && multiPortVariable.eIsProxy()) {
			InternalEObject oldMultiPortVariable = (InternalEObject)multiPortVariable;
			multiPortVariable = (MultiPortVariable)eResolveProxy(oldMultiPortVariable);
			if (multiPortVariable != oldMultiPortVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentstorypatternPackage.SINGLE_PORT_VARIABLE__MULTI_PORT_VARIABLE, oldMultiPortVariable, multiPortVariable));
			}
		}
		return multiPortVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPortVariable basicGetMultiPortVariable() {
		return multiPortVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiPortVariable(MultiPortVariable newMultiPortVariable, NotificationChain msgs) {
		MultiPortVariable oldMultiPortVariable = multiPortVariable;
		multiPortVariable = newMultiPortVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.SINGLE_PORT_VARIABLE__MULTI_PORT_VARIABLE, oldMultiPortVariable, newMultiPortVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiPortVariable(MultiPortVariable newMultiPortVariable) {
		if (newMultiPortVariable != multiPortVariable) {
			NotificationChain msgs = null;
			if (multiPortVariable != null)
				msgs = ((InternalEObject)multiPortVariable).eInverseRemove(this, ComponentstorypatternPackage.MULTI_PORT_VARIABLE__SUB_PORT_VARIABLES, MultiPortVariable.class, msgs);
			if (newMultiPortVariable != null)
				msgs = ((InternalEObject)newMultiPortVariable).eInverseAdd(this, ComponentstorypatternPackage.MULTI_PORT_VARIABLE__SUB_PORT_VARIABLES, MultiPortVariable.class, msgs);
			msgs = basicSetMultiPortVariable(newMultiPortVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.SINGLE_PORT_VARIABLE__MULTI_PORT_VARIABLE, newMultiPortVariable, newMultiPortVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentstorypatternPackage.SINGLE_PORT_VARIABLE__MULTI_PORT_VARIABLE:
				if (multiPortVariable != null)
					msgs = ((InternalEObject)multiPortVariable).eInverseRemove(this, ComponentstorypatternPackage.MULTI_PORT_VARIABLE__SUB_PORT_VARIABLES, MultiPortVariable.class, msgs);
				return basicSetMultiPortVariable((MultiPortVariable)otherEnd, msgs);
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
			case ComponentstorypatternPackage.SINGLE_PORT_VARIABLE__MULTI_PORT_VARIABLE:
				return basicSetMultiPortVariable(null, msgs);
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
			case ComponentstorypatternPackage.SINGLE_PORT_VARIABLE__MULTI_PORT_VARIABLE:
				if (resolve) return getMultiPortVariable();
				return basicGetMultiPortVariable();
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
			case ComponentstorypatternPackage.SINGLE_PORT_VARIABLE__MULTI_PORT_VARIABLE:
				setMultiPortVariable((MultiPortVariable)newValue);
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
			case ComponentstorypatternPackage.SINGLE_PORT_VARIABLE__MULTI_PORT_VARIABLE:
				setMultiPortVariable((MultiPortVariable)null);
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
			case ComponentstorypatternPackage.SINGLE_PORT_VARIABLE__MULTI_PORT_VARIABLE:
				return multiPortVariable != null;
		}
		return super.eIsSet(featureID);
	}

} //SinglePortVariableImpl
