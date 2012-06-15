/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.reconfiguration.impl;

import de.uni_paderborn.fujaba.muml.model.component.ComponentPart;

import de.uni_paderborn.fujaba.muml.model.core.impl.DataTypeImpl;

import de.uni_paderborn.fujaba.muml.model.reconfiguration.PartDataType;
import de.uni_paderborn.fujaba.muml.model.reconfiguration.ReconfigurationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Part Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.reconfiguration.impl.PartDataTypeImpl#getComponentPart <em>Component Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PartDataTypeImpl extends DataTypeImpl implements PartDataType {
	/**
	 * The cached value of the '{@link #getComponentPart() <em>Component Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentPart()
	 * @generated
	 * @ordered
	 */
	protected ComponentPart componentPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReconfigurationPackage.Literals.PART_DATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPart getComponentPart() {
		if (componentPart != null && componentPart.eIsProxy()) {
			InternalEObject oldComponentPart = (InternalEObject)componentPart;
			componentPart = (ComponentPart)eResolveProxy(oldComponentPart);
			if (componentPart != oldComponentPart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReconfigurationPackage.PART_DATA_TYPE__COMPONENT_PART, oldComponentPart, componentPart));
			}
		}
		return componentPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentPart basicGetComponentPart() {
		return componentPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentPart(ComponentPart newComponentPart) {
		ComponentPart oldComponentPart = componentPart;
		componentPart = newComponentPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReconfigurationPackage.PART_DATA_TYPE__COMPONENT_PART, oldComponentPart, componentPart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReconfigurationPackage.PART_DATA_TYPE__COMPONENT_PART:
				if (resolve) return getComponentPart();
				return basicGetComponentPart();
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
			case ReconfigurationPackage.PART_DATA_TYPE__COMPONENT_PART:
				setComponentPart((ComponentPart)newValue);
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
			case ReconfigurationPackage.PART_DATA_TYPE__COMPONENT_PART:
				setComponentPart((ComponentPart)null);
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
			case ReconfigurationPackage.PART_DATA_TYPE__COMPONENT_PART:
				return componentPart != null;
		}
		return super.eIsSet(featureID);
	}

} //PartDataTypeImpl
