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
import org.muml.pim.runnable.Label;
import org.muml.pim.runnable.LabelAccess;
import org.muml.pim.runnable.LabelAccessKind;
import org.muml.pim.runnable.RunnablePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.runnable.impl.LabelAccessImpl#getAccessKind <em>Access Kind</em>}</li>
 *   <li>{@link org.muml.pim.runnable.impl.LabelAccessImpl#getAccessLabel <em>Access Label</em>}</li>
 *   <li>{@link org.muml.pim.runnable.impl.LabelAccessImpl#getAccessingRunnable <em>Accessing Runnable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelAccessImpl extends NamedElementImpl implements LabelAccess {
	/**
	 * The default value of the '{@link #getAccessKind() <em>Access Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessKind()
	 * @generated
	 * @ordered
	 */
	protected static final LabelAccessKind ACCESS_KIND_EDEFAULT = LabelAccessKind.READACCESS;

	/**
	 * The cached value of the '{@link #getAccessKind() <em>Access Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessKind()
	 * @generated
	 * @ordered
	 */
	protected LabelAccessKind accessKind = ACCESS_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAccessLabel() <em>Access Label</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessLabel()
	 * @generated
	 * @ordered
	 */
	protected Label accessLabel;

	/**
	 * The cached value of the '{@link #getAccessingRunnable() <em>Accessing Runnable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessingRunnable()
	 * @generated
	 * @ordered
	 */
	protected org.muml.pim.runnable.Runnable accessingRunnable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelAccessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RunnablePackage.Literals.LABEL_ACCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelAccessKind getAccessKind() {
		return accessKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessKind(LabelAccessKind newAccessKind) {
		LabelAccessKind oldAccessKind = accessKind;
		accessKind = newAccessKind == null ? ACCESS_KIND_EDEFAULT : newAccessKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunnablePackage.LABEL_ACCESS__ACCESS_KIND, oldAccessKind, accessKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getAccessLabel() {
		if (accessLabel != null && accessLabel.eIsProxy()) {
			InternalEObject oldAccessLabel = (InternalEObject)accessLabel;
			accessLabel = (Label)eResolveProxy(oldAccessLabel);
			if (accessLabel != oldAccessLabel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RunnablePackage.LABEL_ACCESS__ACCESS_LABEL, oldAccessLabel, accessLabel));
			}
		}
		return accessLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label basicGetAccessLabel() {
		return accessLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessLabel(Label newAccessLabel) {
		Label oldAccessLabel = accessLabel;
		accessLabel = newAccessLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunnablePackage.LABEL_ACCESS__ACCESS_LABEL, oldAccessLabel, accessLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.pim.runnable.Runnable getAccessingRunnable() {
		if (accessingRunnable != null && accessingRunnable.eIsProxy()) {
			InternalEObject oldAccessingRunnable = (InternalEObject)accessingRunnable;
			accessingRunnable = (org.muml.pim.runnable.Runnable)eResolveProxy(oldAccessingRunnable);
			if (accessingRunnable != oldAccessingRunnable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RunnablePackage.LABEL_ACCESS__ACCESSING_RUNNABLE, oldAccessingRunnable, accessingRunnable));
			}
		}
		return accessingRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.muml.pim.runnable.Runnable basicGetAccessingRunnable() {
		return accessingRunnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessingRunnable(org.muml.pim.runnable.Runnable newAccessingRunnable, NotificationChain msgs) {
		org.muml.pim.runnable.Runnable oldAccessingRunnable = accessingRunnable;
		accessingRunnable = newAccessingRunnable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RunnablePackage.LABEL_ACCESS__ACCESSING_RUNNABLE, oldAccessingRunnable, newAccessingRunnable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessingRunnable(org.muml.pim.runnable.Runnable newAccessingRunnable) {
		if (newAccessingRunnable != accessingRunnable) {
			NotificationChain msgs = null;
			if (accessingRunnable != null)
				msgs = ((InternalEObject)accessingRunnable).eInverseRemove(this, RunnablePackage.RUNNABLE__LABEL_ACCESSES, org.muml.pim.runnable.Runnable.class, msgs);
			if (newAccessingRunnable != null)
				msgs = ((InternalEObject)newAccessingRunnable).eInverseAdd(this, RunnablePackage.RUNNABLE__LABEL_ACCESSES, org.muml.pim.runnable.Runnable.class, msgs);
			msgs = basicSetAccessingRunnable(newAccessingRunnable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RunnablePackage.LABEL_ACCESS__ACCESSING_RUNNABLE, newAccessingRunnable, newAccessingRunnable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RunnablePackage.LABEL_ACCESS__ACCESSING_RUNNABLE:
				if (accessingRunnable != null)
					msgs = ((InternalEObject)accessingRunnable).eInverseRemove(this, RunnablePackage.RUNNABLE__LABEL_ACCESSES, org.muml.pim.runnable.Runnable.class, msgs);
				return basicSetAccessingRunnable((org.muml.pim.runnable.Runnable)otherEnd, msgs);
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
			case RunnablePackage.LABEL_ACCESS__ACCESSING_RUNNABLE:
				return basicSetAccessingRunnable(null, msgs);
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
			case RunnablePackage.LABEL_ACCESS__ACCESS_KIND:
				return getAccessKind();
			case RunnablePackage.LABEL_ACCESS__ACCESS_LABEL:
				if (resolve) return getAccessLabel();
				return basicGetAccessLabel();
			case RunnablePackage.LABEL_ACCESS__ACCESSING_RUNNABLE:
				if (resolve) return getAccessingRunnable();
				return basicGetAccessingRunnable();
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
			case RunnablePackage.LABEL_ACCESS__ACCESS_KIND:
				setAccessKind((LabelAccessKind)newValue);
				return;
			case RunnablePackage.LABEL_ACCESS__ACCESS_LABEL:
				setAccessLabel((Label)newValue);
				return;
			case RunnablePackage.LABEL_ACCESS__ACCESSING_RUNNABLE:
				setAccessingRunnable((org.muml.pim.runnable.Runnable)newValue);
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
			case RunnablePackage.LABEL_ACCESS__ACCESS_KIND:
				setAccessKind(ACCESS_KIND_EDEFAULT);
				return;
			case RunnablePackage.LABEL_ACCESS__ACCESS_LABEL:
				setAccessLabel((Label)null);
				return;
			case RunnablePackage.LABEL_ACCESS__ACCESSING_RUNNABLE:
				setAccessingRunnable((org.muml.pim.runnable.Runnable)null);
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
			case RunnablePackage.LABEL_ACCESS__ACCESS_KIND:
				return accessKind != ACCESS_KIND_EDEFAULT;
			case RunnablePackage.LABEL_ACCESS__ACCESS_LABEL:
				return accessLabel != null;
			case RunnablePackage.LABEL_ACCESS__ACCESSING_RUNNABLE:
				return accessingRunnable != null;
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
		result.append(" (accessKind: ");
		result.append(accessKind);
		result.append(')');
		return result.toString();
	}

} //LabelAccessImpl
