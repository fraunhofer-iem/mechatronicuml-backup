/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.simulink.adapter.corrmodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.muml.pim.instance.DelegationConnectorInstance;
import org.muml.simulink.Line;
import org.muml.simulink.adapter.corrmodel.Del2Line;
import org.muml.simulink.adapter.corrmodel.Fujaba2simulinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Del2 Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Del2LineImpl#getDelegationInstance <em>Delegation Instance</em>}</li>
 *   <li>{@link org.muml.simulink.adapter.corrmodel.impl.Del2LineImpl#getLine <em>Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Del2LineImpl extends AbstractContainerCorrespondenceNodeImpl implements Del2Line {
	/**
	 * The cached value of the '{@link #getDelegationInstance() <em>Delegation Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegationInstance()
	 * @generated
	 * @ordered
	 */
	protected DelegationConnectorInstance delegationInstance;

	/**
	 * The cached value of the '{@link #getLine() <em>Line</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLine()
	 * @generated
	 * @ordered
	 */
	protected EList<Line> line;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Del2LineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Fujaba2simulinkPackage.Literals.DEL2_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationConnectorInstance getDelegationInstance() {
		if (delegationInstance != null && delegationInstance.eIsProxy()) {
			InternalEObject oldDelegationInstance = (InternalEObject)delegationInstance;
			delegationInstance = (DelegationConnectorInstance)eResolveProxy(oldDelegationInstance);
			if (delegationInstance != oldDelegationInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Fujaba2simulinkPackage.DEL2_LINE__DELEGATION_INSTANCE, oldDelegationInstance, delegationInstance));
			}
		}
		return delegationInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationConnectorInstance basicGetDelegationInstance() {
		return delegationInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelegationInstance(DelegationConnectorInstance newDelegationInstance) {
		DelegationConnectorInstance oldDelegationInstance = delegationInstance;
		delegationInstance = newDelegationInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Fujaba2simulinkPackage.DEL2_LINE__DELEGATION_INSTANCE, oldDelegationInstance, delegationInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Line> getLine() {
		if (line == null) {
			line = new EObjectResolvingEList<Line>(Line.class, this, Fujaba2simulinkPackage.DEL2_LINE__LINE);
		}
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Fujaba2simulinkPackage.DEL2_LINE__DELEGATION_INSTANCE:
				if (resolve) return getDelegationInstance();
				return basicGetDelegationInstance();
			case Fujaba2simulinkPackage.DEL2_LINE__LINE:
				return getLine();
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
			case Fujaba2simulinkPackage.DEL2_LINE__DELEGATION_INSTANCE:
				setDelegationInstance((DelegationConnectorInstance)newValue);
				return;
			case Fujaba2simulinkPackage.DEL2_LINE__LINE:
				getLine().clear();
				getLine().addAll((Collection<? extends Line>)newValue);
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
			case Fujaba2simulinkPackage.DEL2_LINE__DELEGATION_INSTANCE:
				setDelegationInstance((DelegationConnectorInstance)null);
				return;
			case Fujaba2simulinkPackage.DEL2_LINE__LINE:
				getLine().clear();
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
			case Fujaba2simulinkPackage.DEL2_LINE__DELEGATION_INSTANCE:
				return delegationInstance != null;
			case Fujaba2simulinkPackage.DEL2_LINE__LINE:
				return line != null && !line.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //Del2LineImpl
