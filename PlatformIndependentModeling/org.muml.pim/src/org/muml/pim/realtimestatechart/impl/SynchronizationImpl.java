/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.realtimestatechart.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.core.expressions.Expression;
import org.muml.core.impl.ExtendableElementImpl;
import org.muml.pim.realtimestatechart.RealtimestatechartPackage;
import org.muml.pim.realtimestatechart.Synchronization;
import org.muml.pim.realtimestatechart.SynchronizationChannel;
import org.muml.pim.realtimestatechart.SynchronizationKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.SynchronizationImpl#getSyncChannel <em>Sync Channel</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.SynchronizationImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.muml.pim.realtimestatechart.impl.SynchronizationImpl#getSelectorExpression <em>Selector Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronizationImpl extends ExtendableElementImpl implements Synchronization {
	/**
	 * The cached value of the '{@link #getSyncChannel() <em>Sync Channel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSyncChannel()
	 * @generated
	 * @ordered
	 */
	protected SynchronizationChannel syncChannel;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final SynchronizationKind KIND_EDEFAULT = SynchronizationKind.SEND;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected SynchronizationKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSelectorExpression() <em>Selector Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectorExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression selectorExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RealtimestatechartPackage.Literals.SYNCHRONIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationChannel getSyncChannel() {
		if (syncChannel != null && syncChannel.eIsProxy()) {
			InternalEObject oldSyncChannel = (InternalEObject)syncChannel;
			syncChannel = (SynchronizationChannel)eResolveProxy(oldSyncChannel);
			if (syncChannel != oldSyncChannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RealtimestatechartPackage.SYNCHRONIZATION__SYNC_CHANNEL, oldSyncChannel, syncChannel));
			}
		}
		return syncChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationChannel basicGetSyncChannel() {
		return syncChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncChannel(SynchronizationChannel newSyncChannel) {
		SynchronizationChannel oldSyncChannel = syncChannel;
		syncChannel = newSyncChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.SYNCHRONIZATION__SYNC_CHANNEL, oldSyncChannel, syncChannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(SynchronizationKind newKind) {
		SynchronizationKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.SYNCHRONIZATION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSelectorExpression() {
		return selectorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectorExpression(Expression newSelectorExpression, NotificationChain msgs) {
		Expression oldSelectorExpression = selectorExpression;
		selectorExpression = newSelectorExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.SYNCHRONIZATION__SELECTOR_EXPRESSION, oldSelectorExpression, newSelectorExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectorExpression(Expression newSelectorExpression) {
		if (newSelectorExpression != selectorExpression) {
			NotificationChain msgs = null;
			if (selectorExpression != null)
				msgs = ((InternalEObject)selectorExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.SYNCHRONIZATION__SELECTOR_EXPRESSION, null, msgs);
			if (newSelectorExpression != null)
				msgs = ((InternalEObject)newSelectorExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RealtimestatechartPackage.SYNCHRONIZATION__SELECTOR_EXPRESSION, null, msgs);
			msgs = basicSetSelectorExpression(newSelectorExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RealtimestatechartPackage.SYNCHRONIZATION__SELECTOR_EXPRESSION, newSelectorExpression, newSelectorExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RealtimestatechartPackage.SYNCHRONIZATION__SELECTOR_EXPRESSION:
				return basicSetSelectorExpression(null, msgs);
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
			case RealtimestatechartPackage.SYNCHRONIZATION__SYNC_CHANNEL:
				if (resolve) return getSyncChannel();
				return basicGetSyncChannel();
			case RealtimestatechartPackage.SYNCHRONIZATION__KIND:
				return getKind();
			case RealtimestatechartPackage.SYNCHRONIZATION__SELECTOR_EXPRESSION:
				return getSelectorExpression();
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
			case RealtimestatechartPackage.SYNCHRONIZATION__SYNC_CHANNEL:
				setSyncChannel((SynchronizationChannel)newValue);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION__KIND:
				setKind((SynchronizationKind)newValue);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION__SELECTOR_EXPRESSION:
				setSelectorExpression((Expression)newValue);
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
			case RealtimestatechartPackage.SYNCHRONIZATION__SYNC_CHANNEL:
				setSyncChannel((SynchronizationChannel)null);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case RealtimestatechartPackage.SYNCHRONIZATION__SELECTOR_EXPRESSION:
				setSelectorExpression((Expression)null);
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
			case RealtimestatechartPackage.SYNCHRONIZATION__SYNC_CHANNEL:
				return syncChannel != null;
			case RealtimestatechartPackage.SYNCHRONIZATION__KIND:
				return kind != KIND_EDEFAULT;
			case RealtimestatechartPackage.SYNCHRONIZATION__SELECTOR_EXPRESSION:
				return selectorExpression != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //SynchronizationImpl
