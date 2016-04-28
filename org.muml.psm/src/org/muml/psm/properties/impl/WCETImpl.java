/**
 */
package org.muml.psm.properties.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.mumlcore.impl.ExtensionImpl;
import org.muml.pim.valuetype.TimeValue;
import org.muml.pm.hardware.hwresourceinstance.StructuredResourceInstance;
import org.muml.psm.properties.PropertiesPackage;
import org.muml.psm.properties.WCET;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WCET</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.psm.properties.impl.WCETImpl#getWcet <em>Wcet</em>}</li>
 *   <li>{@link org.muml.psm.properties.impl.WCETImpl#getResourceInstance <em>Resource Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WCETImpl extends ExtensionImpl implements WCET {
	/**
	 * The cached value of the '{@link #getWcet() <em>Wcet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWcet()
	 * @generated
	 * @ordered
	 */
	protected TimeValue wcet;

	/**
	 * The cached value of the '{@link #getResourceInstance() <em>Resource Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceInstance()
	 * @generated
	 * @ordered
	 */
	protected StructuredResourceInstance resourceInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WCETImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PropertiesPackage.Literals.WCET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getWcet() {
		return wcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWcet(TimeValue newWcet, NotificationChain msgs) {
		TimeValue oldWcet = wcet;
		wcet = newWcet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PropertiesPackage.WCET__WCET, oldWcet, newWcet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWcet(TimeValue newWcet) {
		if (newWcet != wcet) {
			NotificationChain msgs = null;
			if (wcet != null)
				msgs = ((InternalEObject)wcet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PropertiesPackage.WCET__WCET, null, msgs);
			if (newWcet != null)
				msgs = ((InternalEObject)newWcet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PropertiesPackage.WCET__WCET, null, msgs);
			msgs = basicSetWcet(newWcet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.WCET__WCET, newWcet, newWcet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResourceInstance getResourceInstance() {
		if (resourceInstance != null && resourceInstance.eIsProxy()) {
			InternalEObject oldResourceInstance = (InternalEObject)resourceInstance;
			resourceInstance = (StructuredResourceInstance)eResolveProxy(oldResourceInstance);
			if (resourceInstance != oldResourceInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PropertiesPackage.WCET__RESOURCE_INSTANCE, oldResourceInstance, resourceInstance));
			}
		}
		return resourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredResourceInstance basicGetResourceInstance() {
		return resourceInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceInstance(StructuredResourceInstance newResourceInstance) {
		StructuredResourceInstance oldResourceInstance = resourceInstance;
		resourceInstance = newResourceInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PropertiesPackage.WCET__RESOURCE_INSTANCE, oldResourceInstance, resourceInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PropertiesPackage.WCET__WCET:
				return basicSetWcet(null, msgs);
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
			case PropertiesPackage.WCET__WCET:
				return getWcet();
			case PropertiesPackage.WCET__RESOURCE_INSTANCE:
				if (resolve) return getResourceInstance();
				return basicGetResourceInstance();
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
			case PropertiesPackage.WCET__WCET:
				setWcet((TimeValue)newValue);
				return;
			case PropertiesPackage.WCET__RESOURCE_INSTANCE:
				setResourceInstance((StructuredResourceInstance)newValue);
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
			case PropertiesPackage.WCET__WCET:
				setWcet((TimeValue)null);
				return;
			case PropertiesPackage.WCET__RESOURCE_INSTANCE:
				setResourceInstance((StructuredResourceInstance)null);
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
			case PropertiesPackage.WCET__WCET:
				return wcet != null;
			case PropertiesPackage.WCET__RESOURCE_INSTANCE:
				return resourceInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //WCETImpl
