/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.umlrt.model.instance.impl;

import de.uni_paderborn.fujaba.umlrt.model.component.Component;
import de.uni_paderborn.fujaba.umlrt.model.component.ComponentPackage;
import de.uni_paderborn.fujaba.umlrt.model.component.Port;

import de.uni_paderborn.fujaba.umlrt.model.instance.ComponentInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.ConnectorInstance;
import de.uni_paderborn.fujaba.umlrt.model.instance.InstancePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.storydriven.modeling.impl.NamedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ComponentInstanceImpl#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ComponentInstanceImpl#getToRef <em>To Ref</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ComponentInstanceImpl#getFromRef <em>From Ref</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.umlrt.model.instance.impl.ComponentInstanceImpl#getPortsDerived <em>Ports Derived</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstanceImpl extends NamedElementImpl implements ComponentInstance {
	/**
	 * The cached value of the '{@link #getComponentType() <em>Component Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentType()
	 * @generated
	 * @ordered
	 */
	protected Component componentType;

	/**
	 * The cached value of the '{@link #getToRef() <em>To Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToRef()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorInstance> toRef;

	/**
	 * The cached value of the '{@link #getFromRef() <em>From Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromRef()
	 * @generated
	 * @ordered
	 */
	protected EList<ConnectorInstance> fromRef;

	/**
	 * The cached setting delegate for the '{@link #getPortsDerived() <em>Ports Derived</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortsDerived()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PORTS_DERIVED__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.COMPONENT_INSTANCE__PORTS_DERIVED).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getComponentType() {
		if (componentType != null && componentType.eIsProxy()) {
			InternalEObject oldComponentType = (InternalEObject)componentType;
			componentType = (Component)eResolveProxy(oldComponentType);
			if (componentType != oldComponentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE, oldComponentType, componentType));
			}
		}
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetComponentType() {
		return componentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentType(Component newComponentType, NotificationChain msgs) {
		Component oldComponentType = componentType;
		componentType = newComponentType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE, oldComponentType, newComponentType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentType(Component newComponentType) {
		if (newComponentType != componentType) {
			NotificationChain msgs = null;
			if (componentType != null)
				msgs = ((InternalEObject)componentType).eInverseRemove(this, ComponentPackage.COMPONENT__COMPONENT_INSTANCES, Component.class, msgs);
			if (newComponentType != null)
				msgs = ((InternalEObject)newComponentType).eInverseAdd(this, ComponentPackage.COMPONENT__COMPONENT_INSTANCES, Component.class, msgs);
			msgs = basicSetComponentType(newComponentType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE, newComponentType, newComponentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorInstance> getToRef() {
		if (toRef == null) {
			toRef = new EObjectWithInverseResolvingEList<ConnectorInstance>(ConnectorInstance.class, this, InstancePackage.COMPONENT_INSTANCE__TO_REF, InstancePackage.CONNECTOR_INSTANCE__TO_COMPONENT_I);
		}
		return toRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectorInstance> getFromRef() {
		if (fromRef == null) {
			fromRef = new EObjectWithInverseResolvingEList<ConnectorInstance>(ConnectorInstance.class, this, InstancePackage.COMPONENT_INSTANCE__FROM_REF, InstancePackage.CONNECTOR_INSTANCE__FROM_COMPONENT_I);
		}
		return fromRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Port> getPortsDerived() {
		return (EList<Port>)PORTS_DERIVED__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				if (componentType != null)
					msgs = ((InternalEObject)componentType).eInverseRemove(this, ComponentPackage.COMPONENT__COMPONENT_INSTANCES, Component.class, msgs);
				return basicSetComponentType((Component)otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__TO_REF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToRef()).basicAdd(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__FROM_REF:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFromRef()).basicAdd(otherEnd, msgs);
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
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				return basicSetComponentType(null, msgs);
			case InstancePackage.COMPONENT_INSTANCE__TO_REF:
				return ((InternalEList<?>)getToRef()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__FROM_REF:
				return ((InternalEList<?>)getFromRef()).basicRemove(otherEnd, msgs);
			case InstancePackage.COMPONENT_INSTANCE__PORTS_DERIVED:
				return ((InternalEList<?>)getPortsDerived()).basicRemove(otherEnd, msgs);
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
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				if (resolve) return getComponentType();
				return basicGetComponentType();
			case InstancePackage.COMPONENT_INSTANCE__TO_REF:
				return getToRef();
			case InstancePackage.COMPONENT_INSTANCE__FROM_REF:
				return getFromRef();
			case InstancePackage.COMPONENT_INSTANCE__PORTS_DERIVED:
				return getPortsDerived();
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
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				setComponentType((Component)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__TO_REF:
				getToRef().clear();
				getToRef().addAll((Collection<? extends ConnectorInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__FROM_REF:
				getFromRef().clear();
				getFromRef().addAll((Collection<? extends ConnectorInstance>)newValue);
				return;
			case InstancePackage.COMPONENT_INSTANCE__PORTS_DERIVED:
				getPortsDerived().clear();
				getPortsDerived().addAll((Collection<? extends Port>)newValue);
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
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				setComponentType((Component)null);
				return;
			case InstancePackage.COMPONENT_INSTANCE__TO_REF:
				getToRef().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__FROM_REF:
				getFromRef().clear();
				return;
			case InstancePackage.COMPONENT_INSTANCE__PORTS_DERIVED:
				getPortsDerived().clear();
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
			case InstancePackage.COMPONENT_INSTANCE__COMPONENT_TYPE:
				return componentType != null;
			case InstancePackage.COMPONENT_INSTANCE__TO_REF:
				return toRef != null && !toRef.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__FROM_REF:
				return fromRef != null && !fromRef.isEmpty();
			case InstancePackage.COMPONENT_INSTANCE__PORTS_DERIVED:
				return PORTS_DERIVED__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InstancePackage.COMPONENT_INSTANCE___TO_STRING:
				return toString();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ComponentInstanceImpl
