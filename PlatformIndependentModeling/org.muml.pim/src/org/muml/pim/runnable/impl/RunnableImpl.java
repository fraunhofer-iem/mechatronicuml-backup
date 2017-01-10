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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.muml.core.impl.NamedElementImpl;
import org.muml.pim.instance.ComponentInstance;
import org.muml.pim.instance.InstancePackage;
import org.muml.pim.instance.PortInstance;
import org.muml.pim.runnable.LabelAccess;
import org.muml.pim.runnable.RunnablePackage;
import org.muml.pim.valuetype.TimeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runnable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.runnable.impl.RunnableImpl#getComponentInstance <em>Component Instance</em>}</li>
 *   <li>{@link org.muml.pim.runnable.impl.RunnableImpl#getPortInstance <em>Port Instance</em>}</li>
 *   <li>{@link org.muml.pim.runnable.impl.RunnableImpl#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.muml.pim.runnable.impl.RunnableImpl#getLabelAccesses <em>Label Accesses</em>}</li>
 *   <li>{@link org.muml.pim.runnable.impl.RunnableImpl#getDeadline <em>Deadline</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RunnableImpl extends NamedElementImpl implements org.muml.pim.runnable.Runnable {
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
	 * The cached value of the '{@link #getPortInstance() <em>Port Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<PortInstance> portInstance;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected TimeValue period;

	/**
	 * The cached value of the '{@link #getLabelAccesses() <em>Label Accesses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelAccesses()
	 * @generated
	 * @ordered
	 */
	protected EList<LabelAccess> labelAccesses;

	/**
	 * The cached value of the '{@link #getDeadline() <em>Deadline</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadline()
	 * @generated
	 * @ordered
	 */
	protected TimeValue deadline;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RunnableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RunnablePackage.Literals.RUNNABLE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RunnablePackage.RUNNABLE__COMPONENT_INSTANCE, oldComponentInstance, componentInstance));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RunnablePackage.RUNNABLE__COMPONENT_INSTANCE, oldComponentInstance, newComponentInstance);
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
				msgs = ((InternalEObject)componentInstance).eInverseRemove(this, InstancePackage.COMPONENT_INSTANCE__RUNNABLES, ComponentInstance.class, msgs);
			if (newComponentInstance != null)
				msgs = ((InternalEObject)newComponentInstance).eInverseAdd(this, InstancePackage.COMPONENT_INSTANCE__RUNNABLES, ComponentInstance.class, msgs);
			msgs = basicSetComponentInstance(newComponentInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunnablePackage.RUNNABLE__COMPONENT_INSTANCE, newComponentInstance, newComponentInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortInstance> getPortInstance() {
		if (portInstance == null) {
			portInstance = new EObjectWithInverseResolvingEList.ManyInverse<PortInstance>(PortInstance.class, this, RunnablePackage.RUNNABLE__PORT_INSTANCE, InstancePackage.PORT_INSTANCE__RUNNABLE);
		}
		return portInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(TimeValue newPeriod, NotificationChain msgs) {
		TimeValue oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RunnablePackage.RUNNABLE__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(TimeValue newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RunnablePackage.RUNNABLE__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RunnablePackage.RUNNABLE__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunnablePackage.RUNNABLE__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelAccess> getLabelAccesses() {
		if (labelAccesses == null) {
			labelAccesses = new EObjectWithInverseResolvingEList<LabelAccess>(LabelAccess.class, this, RunnablePackage.RUNNABLE__LABEL_ACCESSES, RunnablePackage.LABEL_ACCESS__ACCESSING_RUNNABLE);
		}
		return labelAccesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeValue getDeadline() {
		return deadline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeadline(TimeValue newDeadline, NotificationChain msgs) {
		TimeValue oldDeadline = deadline;
		deadline = newDeadline;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RunnablePackage.RUNNABLE__DEADLINE, oldDeadline, newDeadline);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadline(TimeValue newDeadline) {
		if (newDeadline != deadline) {
			NotificationChain msgs = null;
			if (deadline != null)
				msgs = ((InternalEObject)deadline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RunnablePackage.RUNNABLE__DEADLINE, null, msgs);
			if (newDeadline != null)
				msgs = ((InternalEObject)newDeadline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RunnablePackage.RUNNABLE__DEADLINE, null, msgs);
			msgs = basicSetDeadline(newDeadline, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunnablePackage.RUNNABLE__DEADLINE, newDeadline, newDeadline));
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
			case RunnablePackage.RUNNABLE__COMPONENT_INSTANCE:
				if (componentInstance != null)
					msgs = ((InternalEObject)componentInstance).eInverseRemove(this, InstancePackage.COMPONENT_INSTANCE__RUNNABLES, ComponentInstance.class, msgs);
				return basicSetComponentInstance((ComponentInstance)otherEnd, msgs);
			case RunnablePackage.RUNNABLE__PORT_INSTANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPortInstance()).basicAdd(otherEnd, msgs);
			case RunnablePackage.RUNNABLE__LABEL_ACCESSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLabelAccesses()).basicAdd(otherEnd, msgs);
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
			case RunnablePackage.RUNNABLE__COMPONENT_INSTANCE:
				return basicSetComponentInstance(null, msgs);
			case RunnablePackage.RUNNABLE__PORT_INSTANCE:
				return ((InternalEList<?>)getPortInstance()).basicRemove(otherEnd, msgs);
			case RunnablePackage.RUNNABLE__PERIOD:
				return basicSetPeriod(null, msgs);
			case RunnablePackage.RUNNABLE__LABEL_ACCESSES:
				return ((InternalEList<?>)getLabelAccesses()).basicRemove(otherEnd, msgs);
			case RunnablePackage.RUNNABLE__DEADLINE:
				return basicSetDeadline(null, msgs);
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
			case RunnablePackage.RUNNABLE__COMPONENT_INSTANCE:
				if (resolve) return getComponentInstance();
				return basicGetComponentInstance();
			case RunnablePackage.RUNNABLE__PORT_INSTANCE:
				return getPortInstance();
			case RunnablePackage.RUNNABLE__PERIOD:
				return getPeriod();
			case RunnablePackage.RUNNABLE__LABEL_ACCESSES:
				return getLabelAccesses();
			case RunnablePackage.RUNNABLE__DEADLINE:
				return getDeadline();
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
			case RunnablePackage.RUNNABLE__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)newValue);
				return;
			case RunnablePackage.RUNNABLE__PORT_INSTANCE:
				getPortInstance().clear();
				getPortInstance().addAll((Collection<? extends PortInstance>)newValue);
				return;
			case RunnablePackage.RUNNABLE__PERIOD:
				setPeriod((TimeValue)newValue);
				return;
			case RunnablePackage.RUNNABLE__LABEL_ACCESSES:
				getLabelAccesses().clear();
				getLabelAccesses().addAll((Collection<? extends LabelAccess>)newValue);
				return;
			case RunnablePackage.RUNNABLE__DEADLINE:
				setDeadline((TimeValue)newValue);
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
			case RunnablePackage.RUNNABLE__COMPONENT_INSTANCE:
				setComponentInstance((ComponentInstance)null);
				return;
			case RunnablePackage.RUNNABLE__PORT_INSTANCE:
				getPortInstance().clear();
				return;
			case RunnablePackage.RUNNABLE__PERIOD:
				setPeriod((TimeValue)null);
				return;
			case RunnablePackage.RUNNABLE__LABEL_ACCESSES:
				getLabelAccesses().clear();
				return;
			case RunnablePackage.RUNNABLE__DEADLINE:
				setDeadline((TimeValue)null);
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
			case RunnablePackage.RUNNABLE__COMPONENT_INSTANCE:
				return componentInstance != null;
			case RunnablePackage.RUNNABLE__PORT_INSTANCE:
				return portInstance != null && !portInstance.isEmpty();
			case RunnablePackage.RUNNABLE__PERIOD:
				return period != null;
			case RunnablePackage.RUNNABLE__LABEL_ACCESSES:
				return labelAccesses != null && !labelAccesses.isEmpty();
			case RunnablePackage.RUNNABLE__DEADLINE:
				return deadline != null;
		}
		return super.eIsSet(featureID);
	}

} //RunnableImpl
