/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.FadingComponentPartVariable;
import de.uni_paderborn.fujaba.muml.reconfiguration.FadingFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fading Component Part Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.FadingComponentPartVariableImpl#getAppliedFadingFunction <em>Applied Fading Function</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FadingComponentPartVariableImpl extends PartVariableImpl implements FadingComponentPartVariable {
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
	protected FadingComponentPartVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.FADING_COMPONENT_PART_VARIABLE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentstorypatternPackage.FADING_COMPONENT_PART_VARIABLE__APPLIED_FADING_FUNCTION, oldAppliedFadingFunction, appliedFadingFunction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.FADING_COMPONENT_PART_VARIABLE__APPLIED_FADING_FUNCTION, oldAppliedFadingFunction, appliedFadingFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentstorypatternPackage.FADING_COMPONENT_PART_VARIABLE__APPLIED_FADING_FUNCTION:
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
			case ComponentstorypatternPackage.FADING_COMPONENT_PART_VARIABLE__APPLIED_FADING_FUNCTION:
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
			case ComponentstorypatternPackage.FADING_COMPONENT_PART_VARIABLE__APPLIED_FADING_FUNCTION:
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
			case ComponentstorypatternPackage.FADING_COMPONENT_PART_VARIABLE__APPLIED_FADING_FUNCTION:
				return appliedFadingFunction != null;
		}
		return super.eIsSet(featureID);
	}

} //FadingComponentPartVariableImpl
