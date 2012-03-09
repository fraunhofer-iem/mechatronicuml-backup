/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.core.impl;

import de.uni_paderborn.fujaba.muml.model.core.CompositeDataType;
import de.uni_paderborn.fujaba.muml.model.core.CorePackage;
import de.uni_paderborn.fujaba.muml.model.core.InnerDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.core.impl.CompositeDataTypeImpl#getInnerDeclaration <em>Inner Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CompositeDataTypeImpl extends DataTypeImpl implements CompositeDataType {
	/**
	 * The cached value of the '{@link #getInnerDeclaration() <em>Inner Declaration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EList<InnerDeclaration> innerDeclaration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.COMPOSITE_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InnerDeclaration> getInnerDeclaration() {
		if (innerDeclaration == null) {
			innerDeclaration = new EObjectContainmentWithInverseEList<InnerDeclaration>(InnerDeclaration.class, this, CorePackage.COMPOSITE_DATA_TYPE__INNER_DECLARATION, CorePackage.INNER_DECLARATION__PARENT);
		}
		return innerDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.COMPOSITE_DATA_TYPE__INNER_DECLARATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInnerDeclaration()).basicAdd(otherEnd, msgs);
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
			case CorePackage.COMPOSITE_DATA_TYPE__INNER_DECLARATION:
				return ((InternalEList<?>)getInnerDeclaration()).basicRemove(otherEnd, msgs);
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
			case CorePackage.COMPOSITE_DATA_TYPE__INNER_DECLARATION:
				return getInnerDeclaration();
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
			case CorePackage.COMPOSITE_DATA_TYPE__INNER_DECLARATION:
				getInnerDeclaration().clear();
				getInnerDeclaration().addAll((Collection<? extends InnerDeclaration>)newValue);
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
			case CorePackage.COMPOSITE_DATA_TYPE__INNER_DECLARATION:
				getInnerDeclaration().clear();
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
			case CorePackage.COMPOSITE_DATA_TYPE__INNER_DECLARATION:
				return innerDeclaration != null && !innerDeclaration.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeDataTypeImpl
