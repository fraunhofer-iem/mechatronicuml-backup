/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.types.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.types.StructureElementDeclaration;
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
 * An implementation of the model object '<em><b>Structure Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.types.impl.StructureDeclarationImpl#getDeclElements <em>Decl Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructureDeclarationImpl extends MinimalEObjectImpl.Container implements StructureDeclaration {
	/**
	 * The cached value of the '{@link #getDeclElements() <em>Decl Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclElements()
	 * @generated
	 * @ordered
	 */
	protected EList<StructureElementDeclaration> declElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypesPackage.Literals.STRUCTURE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructureElementDeclaration> getDeclElements() {
		if (declElements == null) {
			declElements = new EObjectContainmentEList<StructureElementDeclaration>(StructureElementDeclaration.class, this, TypesPackage.STRUCTURE_DECLARATION__DECL_ELEMENTS);
		}
		return declElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypesPackage.STRUCTURE_DECLARATION__DECL_ELEMENTS:
				return ((InternalEList<?>)getDeclElements()).basicRemove(otherEnd, msgs);
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
			case TypesPackage.STRUCTURE_DECLARATION__DECL_ELEMENTS:
				return getDeclElements();
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
			case TypesPackage.STRUCTURE_DECLARATION__DECL_ELEMENTS:
				getDeclElements().clear();
				getDeclElements().addAll((Collection<? extends StructureElementDeclaration>)newValue);
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
			case TypesPackage.STRUCTURE_DECLARATION__DECL_ELEMENTS:
				getDeclElements().clear();
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
			case TypesPackage.STRUCTURE_DECLARATION__DECL_ELEMENTS:
				return declElements != null && !declElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StructureDeclarationImpl
