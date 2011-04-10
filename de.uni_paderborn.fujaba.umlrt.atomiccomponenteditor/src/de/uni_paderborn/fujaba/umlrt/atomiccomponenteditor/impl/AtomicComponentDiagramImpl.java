/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.impl;

import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.AtomicComponentDiagram;
import de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.AtomiccomponenteditorPackage;

import de.uni_paderborn.fujaba.umlrt.model.component.AtomicComponent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Component Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.atomiccomponenteditor.impl.AtomicComponentDiagramImpl#getAtomicComponent <em>Atomic Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicComponentDiagramImpl extends EObjectImpl implements AtomicComponentDiagram {
	/**
	 * The cached value of the '{@link #getAtomicComponent() <em>Atomic Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtomicComponent()
	 * @generated
	 * @ordered
	 */
	protected AtomicComponent atomicComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicComponentDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AtomiccomponenteditorPackage.Literals.ATOMIC_COMPONENT_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicComponent getAtomicComponent() {
		return atomicComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAtomicComponent(AtomicComponent newAtomicComponent, NotificationChain msgs) {
		AtomicComponent oldAtomicComponent = atomicComponent;
		atomicComponent = newAtomicComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AtomiccomponenteditorPackage.ATOMIC_COMPONENT_DIAGRAM__ATOMIC_COMPONENT, oldAtomicComponent, newAtomicComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtomicComponent(AtomicComponent newAtomicComponent) {
		if (newAtomicComponent != atomicComponent) {
			NotificationChain msgs = null;
			if (atomicComponent != null)
				msgs = ((InternalEObject)atomicComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AtomiccomponenteditorPackage.ATOMIC_COMPONENT_DIAGRAM__ATOMIC_COMPONENT, null, msgs);
			if (newAtomicComponent != null)
				msgs = ((InternalEObject)newAtomicComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AtomiccomponenteditorPackage.ATOMIC_COMPONENT_DIAGRAM__ATOMIC_COMPONENT, null, msgs);
			msgs = basicSetAtomicComponent(newAtomicComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AtomiccomponenteditorPackage.ATOMIC_COMPONENT_DIAGRAM__ATOMIC_COMPONENT, newAtomicComponent, newAtomicComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AtomiccomponenteditorPackage.ATOMIC_COMPONENT_DIAGRAM__ATOMIC_COMPONENT:
				return basicSetAtomicComponent(null, msgs);
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
			case AtomiccomponenteditorPackage.ATOMIC_COMPONENT_DIAGRAM__ATOMIC_COMPONENT:
				return getAtomicComponent();
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
			case AtomiccomponenteditorPackage.ATOMIC_COMPONENT_DIAGRAM__ATOMIC_COMPONENT:
				setAtomicComponent((AtomicComponent)newValue);
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
			case AtomiccomponenteditorPackage.ATOMIC_COMPONENT_DIAGRAM__ATOMIC_COMPONENT:
				setAtomicComponent((AtomicComponent)null);
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
			case AtomiccomponenteditorPackage.ATOMIC_COMPONENT_DIAGRAM__ATOMIC_COMPONENT:
				return atomicComponent != null;
		}
		return super.eIsSet(featureID);
	}

} //AtomicComponentDiagramImpl
