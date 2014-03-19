/**
 */
package de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.storydriven.core.CommentableElement;
import org.storydriven.core.CorePackage;
import org.storydriven.core.NamedElement;
import org.storydriven.core.impl.CommentableElementImpl;
import org.storydriven.core.impl.ExtendableElementImpl;

import org.storydriven.core.impl.NamedElementImpl;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.HWPort;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourceType;
import de.uni_paderborn.fujaba.muml.hardware.resourcetype.ResourcetypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.hardware.resourcetype.impl.ResourceTypeImpl#getHwports <em>Hwports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ResourceTypeImpl extends NamedElementImpl implements ResourceType {
	/**
	 * The cached value of the '{@link #getHwports() <em>Hwports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHwports()
	 * @generated
	 * @ordered
	 */
	protected EList<HWPort> hwports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ResourcetypePackage.Literals.RESOURCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HWPort> getHwports() {
		if (hwports == null) {
			hwports = new EObjectContainmentWithInverseEList<HWPort>(HWPort.class, this, ResourcetypePackage.RESOURCE_TYPE__HWPORTS, ResourcetypePackage.HW_PORT__PARENT_RESOURCE);
		}
		return hwports;
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
			case ResourcetypePackage.RESOURCE_TYPE__HWPORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHwports()).basicAdd(otherEnd, msgs);
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
			case ResourcetypePackage.RESOURCE_TYPE__HWPORTS:
				return ((InternalEList<?>)getHwports()).basicRemove(otherEnd, msgs);
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
			case ResourcetypePackage.RESOURCE_TYPE__HWPORTS:
				return getHwports();
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
			case ResourcetypePackage.RESOURCE_TYPE__HWPORTS:
				getHwports().clear();
				getHwports().addAll((Collection<? extends HWPort>)newValue);
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
			case ResourcetypePackage.RESOURCE_TYPE__HWPORTS:
				getHwports().clear();
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
			case ResourcetypePackage.RESOURCE_TYPE__HWPORTS:
				return hwports != null && !hwports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ResourceTypeImpl
