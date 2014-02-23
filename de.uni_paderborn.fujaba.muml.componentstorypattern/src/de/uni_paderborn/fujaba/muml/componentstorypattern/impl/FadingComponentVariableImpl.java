/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern.impl;

import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.FadingComponentVariable;

import de.uni_paderborn.fujaba.muml.reconfiguration.FadingComponent;
import de.uni_paderborn.fujaba.muml.reconfiguration.FadingFunction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fading Component Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.FadingComponentVariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.FadingComponentVariableImpl#getAppliedFadingFunction <em>Applied Fading Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FadingComponentVariableImpl extends ComponentStoryPatternVariableImpl implements FadingComponentVariable {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected FadingComponent type;

	/**
	 * The cached value of the '{@link #getAppliedFadingFunction() <em>Applied Fading Function</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliedFadingFunction()
	 * @generated
	 * @ordered
	 */
	protected FadingFunction appliedFadingFunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FadingComponentVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.FADING_COMPONENT_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FadingComponent getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (FadingComponent)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentstorypatternPackage.FADING_COMPONENT_VARIABLE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FadingComponent basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(FadingComponent newType) {
		FadingComponent oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.FADING_COMPONENT_VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FadingFunction getAppliedFadingFunction() {
		if (appliedFadingFunction != null && appliedFadingFunction.eIsProxy()) {
			InternalEObject oldAppliedFadingFunction = (InternalEObject)appliedFadingFunction;
			appliedFadingFunction = (FadingFunction)eResolveProxy(oldAppliedFadingFunction);
			if (appliedFadingFunction != oldAppliedFadingFunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentstorypatternPackage.FADING_COMPONENT_VARIABLE__APPLIED_FADING_FUNCTION, oldAppliedFadingFunction, appliedFadingFunction));
			}
		}
		return appliedFadingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FadingFunction basicGetAppliedFadingFunction() {
		return appliedFadingFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliedFadingFunction(FadingFunction newAppliedFadingFunction) {
		FadingFunction oldAppliedFadingFunction = appliedFadingFunction;
		appliedFadingFunction = newAppliedFadingFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.FADING_COMPONENT_VARIABLE__APPLIED_FADING_FUNCTION, oldAppliedFadingFunction, appliedFadingFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentstorypatternPackage.FADING_COMPONENT_VARIABLE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ComponentstorypatternPackage.FADING_COMPONENT_VARIABLE__APPLIED_FADING_FUNCTION:
				if (resolve) return getAppliedFadingFunction();
				return basicGetAppliedFadingFunction();
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
			case ComponentstorypatternPackage.FADING_COMPONENT_VARIABLE__TYPE:
				setType((FadingComponent)newValue);
				return;
			case ComponentstorypatternPackage.FADING_COMPONENT_VARIABLE__APPLIED_FADING_FUNCTION:
				setAppliedFadingFunction((FadingFunction)newValue);
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
			case ComponentstorypatternPackage.FADING_COMPONENT_VARIABLE__TYPE:
				setType((FadingComponent)null);
				return;
			case ComponentstorypatternPackage.FADING_COMPONENT_VARIABLE__APPLIED_FADING_FUNCTION:
				setAppliedFadingFunction((FadingFunction)null);
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
			case ComponentstorypatternPackage.FADING_COMPONENT_VARIABLE__TYPE:
				return type != null;
			case ComponentstorypatternPackage.FADING_COMPONENT_VARIABLE__APPLIED_FADING_FUNCTION:
				return appliedFadingFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //FadingComponentVariableImpl
