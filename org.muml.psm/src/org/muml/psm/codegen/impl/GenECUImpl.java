/**
 */
package org.muml.psm.codegen.impl;

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
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;
import org.muml.psm.codegen.CodegenPackage;
import org.muml.psm.codegen.GenECU;
import org.muml.psm.codegen.GenTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen ECU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.codegen.impl.GenECUImpl#getEcu <em>Ecu</em>}</li>
 *   <li>{@link org.muml.psm.codegen.impl.GenECUImpl#getAllocatedGenTasks <em>Allocated Gen Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenECUImpl extends MinimalEObjectImpl.Container implements GenECU {
	/**
	 * The cached value of the '{@link #getEcu() <em>Ecu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcu()
	 * @generated
	 * @ordered
	 */
	protected StructuredResourceInstance ecu;

	/**
	 * The cached value of the '{@link #getAllocatedGenTasks() <em>Allocated Gen Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedGenTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<GenTask> allocatedGenTasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenECUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.GEN_ECU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResourceInstance getEcu() {
		if (ecu != null && ecu.eIsProxy()) {
			InternalEObject oldEcu = (InternalEObject)ecu;
			ecu = (StructuredResourceInstance)eResolveProxy(oldEcu);
			if (ecu != oldEcu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CodegenPackage.GEN_ECU__ECU, oldEcu, ecu));
			}
		}
		return ecu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResourceInstance basicGetEcu() {
		return ecu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEcu(StructuredResourceInstance newEcu) {
		StructuredResourceInstance oldEcu = ecu;
		ecu = newEcu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CodegenPackage.GEN_ECU__ECU, oldEcu, ecu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenTask> getAllocatedGenTasks() {
		if (allocatedGenTasks == null) {
			allocatedGenTasks = new EObjectContainmentEList<GenTask>(GenTask.class, this, CodegenPackage.GEN_ECU__ALLOCATED_GEN_TASKS);
		}
		return allocatedGenTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CodegenPackage.GEN_ECU__ALLOCATED_GEN_TASKS:
				return ((InternalEList<?>)getAllocatedGenTasks()).basicRemove(otherEnd, msgs);
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
			case CodegenPackage.GEN_ECU__ECU:
				if (resolve) return getEcu();
				return basicGetEcu();
			case CodegenPackage.GEN_ECU__ALLOCATED_GEN_TASKS:
				return getAllocatedGenTasks();
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
			case CodegenPackage.GEN_ECU__ECU:
				setEcu((StructuredResourceInstance)newValue);
				return;
			case CodegenPackage.GEN_ECU__ALLOCATED_GEN_TASKS:
				getAllocatedGenTasks().clear();
				getAllocatedGenTasks().addAll((Collection<? extends GenTask>)newValue);
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
			case CodegenPackage.GEN_ECU__ECU:
				setEcu((StructuredResourceInstance)null);
				return;
			case CodegenPackage.GEN_ECU__ALLOCATED_GEN_TASKS:
				getAllocatedGenTasks().clear();
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
			case CodegenPackage.GEN_ECU__ECU:
				return ecu != null;
			case CodegenPackage.GEN_ECU__ALLOCATED_GEN_TASKS:
				return allocatedGenTasks != null && !allocatedGenTasks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GenECUImpl
