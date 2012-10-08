/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.model.component.Assembly;
import de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.AssemblyInstanceImpl#getAssemblyType <em>Assembly Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblyInstanceImpl extends ConnectorInstanceImpl implements AssemblyInstance {
	/**
	 * The cached setting delegate for the '{@link #getAssemblyType() <em>Assembly Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ASSEMBLY_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)InstancePackage.Literals.ASSEMBLY_INSTANCE__ASSEMBLY_TYPE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssemblyInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InstancePackage.Literals.ASSEMBLY_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assembly getAssemblyType() {
		return (Assembly)ASSEMBLY_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assembly basicGetAssemblyType() {
		return (Assembly)ASSEMBLY_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InstancePackage.ASSEMBLY_INSTANCE__ASSEMBLY_TYPE:
				if (resolve) return getAssemblyType();
				return basicGetAssemblyType();
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
			case InstancePackage.ASSEMBLY_INSTANCE__ASSEMBLY_TYPE:
				return ASSEMBLY_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //AssemblyInstanceImpl
