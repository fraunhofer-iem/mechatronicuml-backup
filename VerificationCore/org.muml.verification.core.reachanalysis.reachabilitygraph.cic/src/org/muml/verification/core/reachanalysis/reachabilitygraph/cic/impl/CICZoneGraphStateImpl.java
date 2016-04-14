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
package org.muml.verification.core.reachanalysis.reachabilitygraph.cic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.pim.instance.ComponentInstanceConfiguration;
import org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CICZoneGraphState;
import org.muml.verification.core.reachanalysis.reachabilitygraph.cic.CicPackage;
import org.muml.verification.core.reachanalysis.reachabilitygraph.rtsc.impl.ZoneGraphStateImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CIC Zone Graph State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.verification.core.reachanalysis.reachabilitygraph.cic.impl.CICZoneGraphStateImpl#getCic <em>Cic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CICZoneGraphStateImpl extends ZoneGraphStateImpl implements CICZoneGraphState {
	/**
	 * The cached value of the '{@link #getCic() <em>Cic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCic()
	 * @generated
	 * @ordered
	 */
	protected ComponentInstanceConfiguration cic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CICZoneGraphStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CicPackage.Literals.CIC_ZONE_GRAPH_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentInstanceConfiguration getCic() {
		return cic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCic(ComponentInstanceConfiguration newCic, NotificationChain msgs) {
		ComponentInstanceConfiguration oldCic = cic;
		cic = newCic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CicPackage.CIC_ZONE_GRAPH_STATE__CIC, oldCic, newCic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCic(ComponentInstanceConfiguration newCic) {
		if (newCic != cic) {
			NotificationChain msgs = null;
			if (cic != null)
				msgs = ((InternalEObject)cic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CicPackage.CIC_ZONE_GRAPH_STATE__CIC, null, msgs);
			if (newCic != null)
				msgs = ((InternalEObject)newCic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CicPackage.CIC_ZONE_GRAPH_STATE__CIC, null, msgs);
			msgs = basicSetCic(newCic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CicPackage.CIC_ZONE_GRAPH_STATE__CIC, newCic, newCic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CicPackage.CIC_ZONE_GRAPH_STATE__CIC:
				return basicSetCic(null, msgs);
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
			case CicPackage.CIC_ZONE_GRAPH_STATE__CIC:
				return getCic();
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
			case CicPackage.CIC_ZONE_GRAPH_STATE__CIC:
				setCic((ComponentInstanceConfiguration)newValue);
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
			case CicPackage.CIC_ZONE_GRAPH_STATE__CIC:
				setCic((ComponentInstanceConfiguration)null);
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
			case CicPackage.CIC_ZONE_GRAPH_STATE__CIC:
				return cic != null;
		}
		return super.eIsSet(featureID);
	}

} //CICZoneGraphStateImpl
