/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ConfigurationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramOutputReference;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.SymbolicVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program Output Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.configurations.impl.ProgramOutputReferenceImpl#getRefernce <em>Refernce</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProgramOutputReferenceImpl extends MinimalEObjectImpl.Container implements ProgramOutputReference {
	/**
	 * The cached value of the '{@link #getRefernce() <em>Refernce</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefernce()
	 * @generated
	 * @ordered
	 */
	protected SymbolicVariable refernce;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramOutputReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationsPackage.Literals.PROGRAM_OUTPUT_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicVariable getRefernce() {
		if (refernce != null && refernce.eIsProxy()) {
			InternalEObject oldRefernce = (InternalEObject)refernce;
			refernce = (SymbolicVariable)eResolveProxy(oldRefernce);
			if (refernce != oldRefernce) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConfigurationsPackage.PROGRAM_OUTPUT_REFERENCE__REFERNCE, oldRefernce, refernce));
			}
		}
		return refernce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicVariable basicGetRefernce() {
		return refernce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefernce(SymbolicVariable newRefernce) {
		SymbolicVariable oldRefernce = refernce;
		refernce = newRefernce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationsPackage.PROGRAM_OUTPUT_REFERENCE__REFERNCE, oldRefernce, refernce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationsPackage.PROGRAM_OUTPUT_REFERENCE__REFERNCE:
				if (resolve) return getRefernce();
				return basicGetRefernce();
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
			case ConfigurationsPackage.PROGRAM_OUTPUT_REFERENCE__REFERNCE:
				setRefernce((SymbolicVariable)newValue);
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
			case ConfigurationsPackage.PROGRAM_OUTPUT_REFERENCE__REFERNCE:
				setRefernce((SymbolicVariable)null);
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
			case ConfigurationsPackage.PROGRAM_OUTPUT_REFERENCE__REFERNCE:
				return refernce != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgramOutputReferenceImpl
