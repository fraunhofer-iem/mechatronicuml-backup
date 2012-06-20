/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.impl;

import de.uni_paderborn.fujaba.muml.model.component.impl.StructuredComponentImpl;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.Executor;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.Manager;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurableStructuredComponent;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationController;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationMessageType;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconfigurable Structured Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurableStructuredComponentImpl#getControllers <em>Controllers</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurableStructuredComponentImpl#getManager <em>Manager</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurableStructuredComponentImpl#getExecutor <em>Executor</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.ReconfigurableStructuredComponentImpl#getDeclaredReconfigurationMessageTypes <em>Declared Reconfiguration Message Types</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReconfigurableStructuredComponentImpl extends StructuredComponentImpl implements ReconfigurableStructuredComponent {
	/**
	 * The cached value of the '{@link #getControllers() <em>Controllers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllers()
	 * @generated
	 * @ordered
	 */
	protected EList<ReconfigurationController> controllers;

	/**
	 * The cached setting delegate for the '{@link #getManager() <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate MANAGER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ReconfigurationPackage.Literals.RECONFIGURABLE_STRUCTURED_COMPONENT__MANAGER).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getExecutor() <em>Executor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutor()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate EXECUTOR__ESETTING_DELEGATE = ((EStructuralFeature.Internal)ReconfigurationPackage.Literals.RECONFIGURABLE_STRUCTURED_COMPONENT__EXECUTOR).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getDeclaredReconfigurationMessageTypes() <em>Declared Reconfiguration Message Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaredReconfigurationMessageTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ReconfigurationMessageType> declaredReconfigurationMessageTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurableStructuredComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.RECONFIGURABLE_STRUCTURED_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReconfigurationController> getControllers() {
		if (controllers == null) {
			controllers = new EObjectContainmentWithInverseEList<ReconfigurationController>(ReconfigurationController.class, this, ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLERS, ReconfigurationPackage.RECONFIGURATION_CONTROLLER__STRUCTURED_COMPONENT);
		}
		return controllers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager getManager() {
		return (Manager)MANAGER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager basicGetManager() {
		return (Manager)MANAGER__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor getExecutor() {
		return (Executor)EXECUTOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Executor basicGetExecutor() {
		return (Executor)EXECUTOR__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReconfigurationMessageType> getDeclaredReconfigurationMessageTypes() {
		if (declaredReconfigurationMessageTypes == null) {
			declaredReconfigurationMessageTypes = new EObjectContainmentEList<ReconfigurationMessageType>(ReconfigurationMessageType.class, this, ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__DECLARED_RECONFIGURATION_MESSAGE_TYPES);
		}
		return declaredReconfigurationMessageTypes;
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
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getControllers()).basicAdd(otherEnd, msgs);
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
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLERS:
				return ((InternalEList<?>)getControllers()).basicRemove(otherEnd, msgs);
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__DECLARED_RECONFIGURATION_MESSAGE_TYPES:
				return ((InternalEList<?>)getDeclaredReconfigurationMessageTypes()).basicRemove(otherEnd, msgs);
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
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLERS:
				return getControllers();
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__MANAGER:
				if (resolve) return getManager();
				return basicGetManager();
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__EXECUTOR:
				if (resolve) return getExecutor();
				return basicGetExecutor();
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__DECLARED_RECONFIGURATION_MESSAGE_TYPES:
				return getDeclaredReconfigurationMessageTypes();
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
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLERS:
				getControllers().clear();
				getControllers().addAll((Collection<? extends ReconfigurationController>)newValue);
				return;
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__DECLARED_RECONFIGURATION_MESSAGE_TYPES:
				getDeclaredReconfigurationMessageTypes().clear();
				getDeclaredReconfigurationMessageTypes().addAll((Collection<? extends ReconfigurationMessageType>)newValue);
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
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLERS:
				getControllers().clear();
				return;
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__DECLARED_RECONFIGURATION_MESSAGE_TYPES:
				getDeclaredReconfigurationMessageTypes().clear();
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
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__CONTROLLERS:
				return controllers != null && !controllers.isEmpty();
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__MANAGER:
				return MANAGER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__EXECUTOR:
				return EXECUTOR__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case ReconfigurationPackage.RECONFIGURABLE_STRUCTURED_COMPONENT__DECLARED_RECONFIGURATION_MESSAGE_TYPES:
				return declaredReconfigurationMessageTypes != null && !declaredReconfigurationMessageTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReconfigurableStructuredComponentImpl
