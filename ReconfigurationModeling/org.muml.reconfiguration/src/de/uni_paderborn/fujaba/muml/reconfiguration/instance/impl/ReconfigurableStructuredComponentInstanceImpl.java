/**
 */
package de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.instance.impl.StructuredComponentInstanceImpl;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ControllerInstance;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.reconfiguration.instance.ReconfigurableStructuredComponentInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reconfigurable Structured Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.reconfiguration.instance.impl.ReconfigurableStructuredComponentInstanceImpl#getControllerInstance <em>Controller Instance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReconfigurableStructuredComponentInstanceImpl extends StructuredComponentInstanceImpl implements ReconfigurableStructuredComponentInstance {
	/**
	 * The cached value of the '{@link #getControllerInstance() <em>Controller Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControllerInstance()
	 * @generated
	 * @ordered
	 */
	protected ControllerInstance controllerInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReconfigurableStructuredComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerInstance getControllerInstance() {
		if (controllerInstance != null && controllerInstance.eIsProxy()) {
			InternalEObject oldControllerInstance = (InternalEObject)controllerInstance;
			controllerInstance = (ControllerInstance)eResolveProxy(oldControllerInstance);
			if (controllerInstance != oldControllerInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__CONTROLLER_INSTANCE, oldControllerInstance, controllerInstance));
			}
		}
		return controllerInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerInstance basicGetControllerInstance() {
		return controllerInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControllerInstance(ControllerInstance newControllerInstance) {
		ControllerInstance oldControllerInstance = controllerInstance;
		controllerInstance = newControllerInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__CONTROLLER_INSTANCE, oldControllerInstance, controllerInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__CONTROLLER_INSTANCE:
				if (resolve) return getControllerInstance();
				return basicGetControllerInstance();
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
			case InstancePackage.RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__CONTROLLER_INSTANCE:
				setControllerInstance((ControllerInstance)newValue);
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
			case InstancePackage.RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__CONTROLLER_INSTANCE:
				setControllerInstance((ControllerInstance)null);
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
			case InstancePackage.RECONFIGURABLE_STRUCTURED_COMPONENT_INSTANCE__CONTROLLER_INSTANCE:
				return controllerInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //ReconfigurableStructuredComponentInstanceImpl
