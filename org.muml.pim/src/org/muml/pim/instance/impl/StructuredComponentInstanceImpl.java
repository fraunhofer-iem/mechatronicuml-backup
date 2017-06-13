/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.instance.StructuredComponentInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.instance.impl.StructuredComponentInstanceImpl#getEmbeddedCIC <em>Embedded CIC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuredComponentInstanceImpl extends ComponentInstanceImpl implements StructuredComponentInstance {
	/**
	 * The cached value of the '{@link #getEmbeddedCIC() <em>Embedded CIC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddedCIC()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstanceConfiguration embeddedCIC;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.STRUCTURED_COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration getEmbeddedCIC() {
		return embeddedCIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmbeddedCIC(ComponentInstanceConfiguration newEmbeddedCIC, NotificationChain msgs) {
		ComponentInstanceConfiguration oldEmbeddedCIC = embeddedCIC;
		embeddedCIC = newEmbeddedCIC;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC, oldEmbeddedCIC, newEmbeddedCIC);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmbeddedCIC(ComponentInstanceConfiguration newEmbeddedCIC) {
		if (newEmbeddedCIC != embeddedCIC) {
			NotificationChain msgs = null;
			if (embeddedCIC != null)
				msgs = ((InternalEObject)embeddedCIC).eInverseRemove(this, InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__PARENT_STRUCTURED_COMPONENT_INSTANCE, ComponentInstanceConfiguration.class, msgs);
			if (newEmbeddedCIC != null)
				msgs = ((InternalEObject)newEmbeddedCIC).eInverseAdd(this, InstancePackage.COMPONENT_INSTANCE_CONFIGURATION__PARENT_STRUCTURED_COMPONENT_INSTANCE, ComponentInstanceConfiguration.class, msgs);
			msgs = basicSetEmbeddedCIC(newEmbeddedCIC, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC, newEmbeddedCIC, newEmbeddedCIC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InstancePackage.STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC:
				if (embeddedCIC != null)
					msgs = ((InternalEObject)embeddedCIC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InstancePackage.STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC, null, msgs);
				return basicSetEmbeddedCIC((ComponentInstanceConfiguration)otherEnd, msgs);
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
			case InstancePackage.STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC:
				return basicSetEmbeddedCIC(null, msgs);
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
			case InstancePackage.STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC:
				return getEmbeddedCIC();
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
			case InstancePackage.STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC:
				setEmbeddedCIC((ComponentInstanceConfiguration)newValue);
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
			case InstancePackage.STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC:
				setEmbeddedCIC((ComponentInstanceConfiguration)null);
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
			case InstancePackage.STRUCTURED_COMPONENT_INSTANCE__EMBEDDED_CIC:
				return embeddedCIC != null;
		}
		return super.eIsSet(featureID);
	}

} //StructuredComponentInstanceImpl
