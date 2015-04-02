/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementInit;
import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureInit;
import de.fraunhofer.iem.m4a.IEC61131.core.types.TypesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureInitImpl#getElementInit <em>Element Init</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructureInitImpl extends MinimalEObjectImpl.Container implements StructureInit {
	/**
	 * The cached value of the '{@link #getElementInit() <em>Element Init</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementInit()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureElementInit> elementInit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureInitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.STRUCTURE_INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureElementInit> getElementInit() {
		if (elementInit == null) {
			elementInit = new EObjectContainmentEList<StructureElementInit>(StructureElementInit.class, this, TypesPackage.STRUCTURE_INIT__ELEMENT_INIT);
		}
		return elementInit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.STRUCTURE_INIT__ELEMENT_INIT:
				return ((InternalEList<?>)getElementInit()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.STRUCTURE_INIT__ELEMENT_INIT:
				return getElementInit();
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
			case TypesPackage.STRUCTURE_INIT__ELEMENT_INIT:
				getElementInit().clear();
				getElementInit().addAll((Collection<? extends StructureElementInit>)newValue);
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
			case TypesPackage.STRUCTURE_INIT__ELEMENT_INIT:
				getElementInit().clear();
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
			case TypesPackage.STRUCTURE_INIT__ELEMENT_INIT:
				return elementInit != null && !elementInit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructureInitImpl
