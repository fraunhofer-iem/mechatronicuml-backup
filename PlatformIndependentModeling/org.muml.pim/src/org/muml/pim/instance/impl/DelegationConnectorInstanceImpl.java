/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.pim.component.DelegationConnector;
import org.muml.pim.instance.DelegationConnectorInstance;
import org.muml.pim.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegation Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.instance.impl.DelegationConnectorInstanceImpl#getDelegationConnectorType <em>Delegation Connector Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelegationConnectorInstanceImpl extends PortConnectorInstanceImpl implements DelegationConnectorInstance {
	/**
	 * The cached setting delegate for the '{@link #getDelegationConnectorType() <em>Delegation Connector Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegationConnectorType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate DELEGATION_CONNECTOR_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.DELEGATION_CONNECTOR_INSTANCE__DELEGATION_CONNECTOR_TYPE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegationConnectorInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.DELEGATION_CONNECTOR_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationConnector getDelegationConnectorType() {
		return (DelegationConnector)DELEGATION_CONNECTOR_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegationConnector basicGetDelegationConnectorType() {
		return (DelegationConnector)DELEGATION_CONNECTOR_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.DELEGATION_CONNECTOR_INSTANCE__DELEGATION_CONNECTOR_TYPE:
				if (resolve) return getDelegationConnectorType();
				return basicGetDelegationConnectorType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InstancePackage.DELEGATION_CONNECTOR_INSTANCE__DELEGATION_CONNECTOR_TYPE:
				return DELEGATION_CONNECTOR_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //DelegationConnectorInstanceImpl
