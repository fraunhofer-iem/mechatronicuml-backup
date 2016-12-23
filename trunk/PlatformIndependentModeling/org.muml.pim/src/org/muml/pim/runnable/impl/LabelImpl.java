/**
 * <copyright>
 * Copyright (c) 2013 Software Engineering Group, Heinz Nixdorf Institute, University of Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Software Engineering Group - initial API and implementation
 * </copyright>
 */
package org.muml.pim.runnable.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.muml.core.impl.NamedElementImpl;

import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.InstancePackage;

import org.muml.pim.realtimestatechart.RealtimeStatechart;

import org.muml.pim.runnable.Label;
import org.muml.pim.runnable.RunnablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.runnable.impl.LabelImpl#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link org.muml.pim.runnable.impl.LabelImpl#getComponentStatechart <em>Component Statechart</em>}</li>
 *   <li>{@link org.muml.pim.runnable.impl.LabelImpl#isIsConstant <em>Is Constant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelImpl extends NamedElementImpl implements Label {
	/**
	 * The cached value of the '{@link #getComponentInstance() <em>Component Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentInstance()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstance componentInstance;

	/**
	 * The cached value of the '{@link #getComponentStatechart() <em>Component Statechart</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentStatechart()
	 * @generated
	 * @ordered
	 */
	protected RealtimeStatechart componentStatechart;

	/**
	 * The default value of the '{@link #isIsConstant() <em>Is Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConstant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CONSTANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsConstant() <em>Is Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsConstant()
	 * @generated
	 * @ordered
	 */
	protected boolean isConstant = IS_CONSTANT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RunnablePackage.Literals.LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance getComponentInstance() {
		if (componentInstance != null && componentInstance.eIsProxy()) {
			InternalEObject oldComponentInstance = (InternalEObject)componentInstance;
			componentInstance = (ComponentInstance)eResolveProxy(oldComponentInstance);
			if (componentInstance != oldComponentInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RunnablePackage.LABEL__COMPONENT_INSTANCE, oldComponentInstance, componentInstance));
			}
		}
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstance basicGetComponentInstance() {
		return componentInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentInstance(ComponentInstance newComponentInstance, NotificationChain msgs) {
		ComponentInstance oldComponentInstance = componentInstance;
		componentInstance = newComponentInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RunnablePackage.LABEL__COMPONENT_INSTANCE, oldComponentInstance, newComponentInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentInstance(ComponentInstance newComponentInstance) {
		if (newComponentInstance != componentInstance) {
			NotificationChain msgs = null;
			if (componentInstance != null)
				msgs = ((InternalEObject)componentInstance).eInverseRemove(this, InstancePackage.COMPONENT_INSTANCE__LABELS, ComponentInstance.class, msgs);
			if (newComponentInstance != null)
				msgs = ((InternalEObject)newComponentInstance).eInverseAdd(this, InstancePackage.COMPONENT_INSTANCE__LABELS, ComponentInstance.class, msgs);
			msgs = basicSetComponentInstance(newComponentInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunnablePackage.LABEL__COMPONENT_INSTANCE, newComponentInstance, newComponentInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechart getComponentStatechart() {
		if (componentStatechart != null && componentStatechart.eIsProxy()) {
			InternalEObject oldComponentStatechart = (InternalEObject)componentStatechart;
			componentStatechart = (RealtimeStatechart)eResolveProxy(oldComponentStatechart);
			if (componentStatechart != oldComponentStatechart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RunnablePackage.LABEL__COMPONENT_STATECHART, oldComponentStatechart, componentStatechart));
			}
		}
		return componentStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealtimeStatechart basicGetComponentStatechart() {
		return componentStatechart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentStatechart(RealtimeStatechart newComponentStatechart) {
		RealtimeStatechart oldComponentStatechart = componentStatechart;
		componentStatechart = newComponentStatechart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunnablePackage.LABEL__COMPONENT_STATECHART, oldComponentStatechart, componentStatechart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsConstant() {
		return isConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsConstant(boolean newIsConstant) {
		boolean oldIsConstant = isConstant;
		isConstant = newIsConstant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunnablePackage.LABEL__IS_CONSTANT, oldIsConstant, isConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RunnablePackage.LABEL__COMPONENT_INSTANCE:
				if (componentInstance != null)
					msgs = ((InternalEObject)componentInstance).eInverseRemove(this, InstancePackage.COMPONENT_INSTANCE__LABELS, ComponentInstance.class, msgs);
				return basicSetComponentInstance((ComponentInstance)otherEnd, msgs);
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
			case RunnablePackage.LABEL__COMPONENT_INSTANCE:
				return basicSetComponentInstance(null, msgs);
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
			case RunnablePackage.LABEL__COMPONENT_INSTANCE:
				if (resolve) return getComponentInstance();
				return basicGetComponentInstance();
			case RunnablePackage.LABEL__COMPONENT_STATECHART:
				if (resolve) return getComponentStatechart();
				return basicGetComponentStatechart();
			case RunnablePackage.LABEL__IS_CONSTANT:
				return isIsConstant();
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
			case RunnablePackage.LABEL__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)newValue);
				return;
			case RunnablePackage.LABEL__COMPONENT_STATECHART:
				setComponentStatechart((RealtimeStatechart)newValue);
				return;
			case RunnablePackage.LABEL__IS_CONSTANT:
				setIsConstant((Boolean)newValue);
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
			case RunnablePackage.LABEL__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)null);
				return;
			case RunnablePackage.LABEL__COMPONENT_STATECHART:
				setComponentStatechart((RealtimeStatechart)null);
				return;
			case RunnablePackage.LABEL__IS_CONSTANT:
				setIsConstant(IS_CONSTANT_EDEFAULT);
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
			case RunnablePackage.LABEL__COMPONENT_INSTANCE:
				return componentInstance != null;
			case RunnablePackage.LABEL__COMPONENT_STATECHART:
				return componentStatechart != null;
			case RunnablePackage.LABEL__IS_CONSTANT:
				return isConstant != IS_CONSTANT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isConstant: ");
		result.append(isConstant);
		result.append(')');
		return result.toString();
	}

} //LabelImpl
