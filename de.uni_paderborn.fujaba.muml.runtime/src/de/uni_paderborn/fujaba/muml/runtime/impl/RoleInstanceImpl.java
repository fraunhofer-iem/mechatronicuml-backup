/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.runtime.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import de.uni_paderborn.fujaba.muml.protocol.Role;
import de.uni_paderborn.fujaba.muml.runtime.RoleInstance;
import de.uni_paderborn.fujaba.muml.runtime.RuntimePackage;
import de.uni_paderborn.fujaba.muml.runtime.RuntimeRoleConnectorInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.impl.RoleInstanceImpl#getRole <em>Role</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.runtime.impl.RoleInstanceImpl#getAssembly <em>Assembly</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RoleInstanceImpl extends RuntimeDiscreteInteractionEndpointInstanceImpl implements RoleInstance {
	/**
	 * The cached setting delegate for the '{@link #getRole() <em>Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ROLE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RuntimePackage.Literals.ROLE_INSTANCE__ROLE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAssembly() <em>Assembly</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssembly()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ASSEMBLY__ESETTING_DELEGATE = ((EStructuralFeature.Internal)RuntimePackage.Literals.ROLE_INSTANCE__ASSEMBLY).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.ROLE_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role getRole() {
		return (Role)ROLE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role basicGetRole() {
		return (Role)ROLE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeRoleConnectorInstance getAssembly() {
		return (RuntimeRoleConnectorInstance)ASSEMBLY__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeRoleConnectorInstance basicGetAssembly() {
		return (RuntimeRoleConnectorInstance)ASSEMBLY__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.ROLE_INSTANCE__ROLE:
				if (resolve) return getRole();
				return basicGetRole();
			case RuntimePackage.ROLE_INSTANCE__ASSEMBLY:
				if (resolve) return getAssembly();
				return basicGetAssembly();
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
			case RuntimePackage.ROLE_INSTANCE__ROLE:
				return ROLE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case RuntimePackage.ROLE_INSTANCE__ASSEMBLY:
				return ASSEMBLY__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //RoleInstanceImpl
