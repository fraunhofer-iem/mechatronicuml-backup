/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.instance.ComponentInstance;
import org.muml.simulink.LibraryReference;
import org.muml.simulink.adapter.corrmodel.CompInst2LibRef;
import org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comp Inst2 Lib Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.CompInst2LibRefImpl#getCompInst <em>Comp Inst</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.CompInst2LibRefImpl#getLibRef <em>Lib Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompInst2LibRefImpl extends AbstractContainerCorrespondenceNodeImpl implements CompInst2LibRef {
	/**
	 * The cached value of the '{@link #getCompInst() <em>Comp Inst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompInst()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance compInst;

	/**
	 * The cached value of the '{@link #getLibRef() <em>Lib Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLibRef()
	 * @generated
	 * @ordered
	 */
	protected LibraryReference libRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompInst2LibRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fujaba2simulinkPackage.Literals.COMP_INST2_LIB_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getCompInst() {
		if (compInst != null && compInst.eIsProxy()) {
			InternalEObject oldCompInst = (InternalEObject)compInst;
			compInst = (ComponentInstance)eResolveProxy(oldCompInst);
			if (compInst != oldCompInst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.COMP_INST2_LIB_REF__COMP_INST, oldCompInst, compInst));
			}
		}
		return compInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetCompInst() {
		return compInst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompInst(ComponentInstance newCompInst) {
		ComponentInstance oldCompInst = compInst;
		compInst = newCompInst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.COMP_INST2_LIB_REF__COMP_INST, oldCompInst, compInst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryReference getLibRef() {
		if (libRef != null && ((EObject)libRef).eIsProxy()) {
			InternalEObject oldLibRef = (InternalEObject)libRef;
			libRef = (LibraryReference)eResolveProxy(oldLibRef);
			if (libRef != oldLibRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.COMP_INST2_LIB_REF__LIB_REF, oldLibRef, libRef));
			}
		}
		return libRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryReference basicGetLibRef() {
		return libRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLibRef(LibraryReference newLibRef) {
		LibraryReference oldLibRef = libRef;
		libRef = newLibRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.COMP_INST2_LIB_REF__LIB_REF, oldLibRef, libRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Fujaba2simulinkPackage.COMP_INST2_LIB_REF__COMP_INST:
				if (resolve) return getCompInst();
				return basicGetCompInst();
			case Fujaba2simulinkPackage.COMP_INST2_LIB_REF__LIB_REF:
				if (resolve) return getLibRef();
				return basicGetLibRef();
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
			case Fujaba2simulinkPackage.COMP_INST2_LIB_REF__COMP_INST:
				setCompInst((ComponentInstance)newValue);
				return;
			case Fujaba2simulinkPackage.COMP_INST2_LIB_REF__LIB_REF:
				setLibRef((LibraryReference)newValue);
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
			case Fujaba2simulinkPackage.COMP_INST2_LIB_REF__COMP_INST:
				setCompInst((ComponentInstance)null);
				return;
			case Fujaba2simulinkPackage.COMP_INST2_LIB_REF__LIB_REF:
				setLibRef((LibraryReference)null);
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
			case Fujaba2simulinkPackage.COMP_INST2_LIB_REF__COMP_INST:
				return compInst != null;
			case Fujaba2simulinkPackage.COMP_INST2_LIB_REF__LIB_REF:
				return libRef != null;
		}
		return super.eIsSet(featureID);
	}

} //CompInst2LibRefImpl
