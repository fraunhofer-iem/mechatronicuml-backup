/**
 */
package de.uni_paderbor.fujaba.muml.psm.codegen.impl;

import de.uni_paderbor.fujaba.muml.psm.codegen.CodGen;
import de.uni_paderbor.fujaba.muml.psm.codegen.CodegenPackage;
import de.uni_paderbor.fujaba.muml.psm.codegen.RefindedStructuredResourceInstance;

import de.uni_paderborn.fujaba.muml.instance.impl.ComponentInstanceConfigurationImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cod Gen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderbor.fujaba.muml.psm.codegen.impl.CodGenImpl#getAllResourceInstances <em>All Resource Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodGenImpl extends ComponentInstanceConfigurationImpl implements CodGen {
	/**
	 * The cached value of the '{@link #getAllResourceInstances() <em>All Resource Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllResourceInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<RefindedStructuredResourceInstance> allResourceInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodGenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.COD_GEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefindedStructuredResourceInstance> getAllResourceInstances() {
		if (allResourceInstances == null) {
			allResourceInstances = new EObjectContainmentEList<RefindedStructuredResourceInstance>(RefindedStructuredResourceInstance.class, this, CodegenPackage.COD_GEN__ALL_RESOURCE_INSTANCES);
		}
		return allResourceInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.COD_GEN__ALL_RESOURCE_INSTANCES:
				return ((InternalEList<?>)getAllResourceInstances()).basicRemove(otherEnd, msgs);
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
			case CodegenPackage.COD_GEN__ALL_RESOURCE_INSTANCES:
				return getAllResourceInstances();
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
			case CodegenPackage.COD_GEN__ALL_RESOURCE_INSTANCES:
				getAllResourceInstances().clear();
				getAllResourceInstances().addAll((Collection<? extends RefindedStructuredResourceInstance>)newValue);
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
			case CodegenPackage.COD_GEN__ALL_RESOURCE_INSTANCES:
				getAllResourceInstances().clear();
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
			case CodegenPackage.COD_GEN__ALL_RESOURCE_INSTANCES:
				return allResourceInstances != null && !allResourceInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CodGenImpl
