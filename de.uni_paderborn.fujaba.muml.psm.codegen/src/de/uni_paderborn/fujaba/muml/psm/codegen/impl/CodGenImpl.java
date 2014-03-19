/**
 */
package de.uni_paderborn.fujaba.muml.psm.codegen.impl;

import de.uni_paderborn.fujaba.muml.instance.ComponentInstanceConfiguration;

import de.uni_paderborn.fujaba.muml.psm.codegen.CodGen;
import de.uni_paderborn.fujaba.muml.psm.codegen.CodegenPackage;
import de.uni_paderborn.fujaba.muml.psm.codegen.RefindedStructuredResourceInstance;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cod Gen</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.impl.CodGenImpl#getAllResourceInstances <em>All Resource Instances</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.psm.codegen.impl.CodGenImpl#getCic <em>Cic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodGenImpl extends MinimalEObjectImpl.Container implements CodGen {
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
	 * The cached value of the '{@link #getCic() <em>Cic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCic()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstanceConfiguration cic;

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
	public ComponentInstanceConfiguration getCic() {
		return cic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCic(ComponentInstanceConfiguration newCic, NotificationChain msgs) {
		ComponentInstanceConfiguration oldCic = cic;
		cic = newCic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CodegenPackage.COD_GEN__CIC, oldCic, newCic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCic(ComponentInstanceConfiguration newCic) {
		if (newCic != cic) {
			NotificationChain msgs = null;
			if (cic != null)
				msgs = ((InternalEObject)cic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.COD_GEN__CIC, null, msgs);
			if (newCic != null)
				msgs = ((InternalEObject)newCic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CodegenPackage.COD_GEN__CIC, null, msgs);
			msgs = basicSetCic(newCic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.COD_GEN__CIC, newCic, newCic));
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
			case CodegenPackage.COD_GEN__CIC:
				return basicSetCic(null, msgs);
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
			case CodegenPackage.COD_GEN__CIC:
				return getCic();
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
			case CodegenPackage.COD_GEN__CIC:
				setCic((ComponentInstanceConfiguration)newValue);
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
			case CodegenPackage.COD_GEN__CIC:
				setCic((ComponentInstanceConfiguration)null);
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
			case CodegenPackage.COD_GEN__CIC:
				return cic != null;
		}
		return super.eIsSet(featureID);
	}

} //CodGenImpl
