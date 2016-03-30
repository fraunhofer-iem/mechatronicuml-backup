/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.pim.instance.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.muml.pim.component.AssemblyConnector;
import org.muml.pim.instance.AssemblyConnectorInstance;
import org.muml.pim.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Connector Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.pim.instance.impl.AssemblyConnectorInstanceImpl#getAssemblyConnectorType <em>Assembly Connector Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssemblyConnectorInstanceImpl extends PortConnectorInstanceImpl implements AssemblyConnectorInstance {
	/**
	 * The cached setting delegate for the '{@link #getAssemblyConnectorType() <em>Assembly Connector Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyConnectorType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ASSEMBLY_CONNECTOR_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.ASSEMBLY_CONNECTOR_INSTANCE__ASSEMBLY_CONNECTOR_TYPE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyConnectorInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.ASSEMBLY_CONNECTOR_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector getAssemblyConnectorType() {
		return (AssemblyConnector)ASSEMBLY_CONNECTOR_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssemblyConnector basicGetAssemblyConnectorType() {
		return (AssemblyConnector)ASSEMBLY_CONNECTOR_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__ASSEMBLY_CONNECTOR_TYPE:
				if (resolve) return getAssemblyConnectorType();
				return basicGetAssemblyConnectorType();
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
			case InstancePackage.ASSEMBLY_CONNECTOR_INSTANCE__ASSEMBLY_CONNECTOR_TYPE:
				return ASSEMBLY_CONNECTOR_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //AssemblyConnectorInstanceImpl
