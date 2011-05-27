/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.model.instance.impl;

import de.uni_paderborn.fujaba.muml.model.component.Assembly;

import de.uni_paderborn.fujaba.muml.model.instance.AssemblyInstance;
import de.uni_paderborn.fujaba.muml.model.instance.InstancePackage;

import de.uni_paderborn.fujaba.muml.model.pattern.CoordinationPattern;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assembly Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.AssemblyInstanceImpl#getAssemblyType <em>Assembly Type</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.model.instance.impl.AssemblyInstanceImpl#getCoordinationPattern <em>Coordination Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssemblyInstanceImpl extends ConnectorInstanceImpl implements AssemblyInstance {
	/**
	 * The cached value of the '{@link #getAssemblyType() <em>Assembly Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssemblyType()
	 * @generated
	 * @ordered
	 */
	protected Assembly assemblyType;

	/**
	 * The cached value of the '{@link #getCoordinationPattern() <em>Coordination Pattern</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationPattern()
	 * @generated
	 * @ordered
	 */
	protected CoordinationPattern coordinationPattern;

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
		if (assemblyType != null && assemblyType.eIsProxy()) {
			InternalEObject oldAssemblyType = (InternalEObject)assemblyType;
			assemblyType = (Assembly)eResolveProxy(oldAssemblyType);
			if (assemblyType != oldAssemblyType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.ASSEMBLY_INSTANCE__ASSEMBLY_TYPE, oldAssemblyType, assemblyType));
			}
		}
		return assemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assembly basicGetAssemblyType() {
		return assemblyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssemblyType(Assembly newAssemblyType) {
		Assembly oldAssemblyType = assemblyType;
		assemblyType = newAssemblyType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ASSEMBLY_INSTANCE__ASSEMBLY_TYPE, oldAssemblyType, assemblyType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPattern getCoordinationPattern() {
		if (coordinationPattern != null && coordinationPattern.eIsProxy()) {
			InternalEObject oldCoordinationPattern = (InternalEObject)coordinationPattern;
			coordinationPattern = (CoordinationPattern)eResolveProxy(oldCoordinationPattern);
			if (coordinationPattern != oldCoordinationPattern) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, InstancePackage.ASSEMBLY_INSTANCE__COORDINATION_PATTERN, oldCoordinationPattern, coordinationPattern));
			}
		}
		return coordinationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationPattern basicGetCoordinationPattern() {
		return coordinationPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinationPattern(CoordinationPattern newCoordinationPattern) {
		CoordinationPattern oldCoordinationPattern = coordinationPattern;
		coordinationPattern = newCoordinationPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancePackage.ASSEMBLY_INSTANCE__COORDINATION_PATTERN, oldCoordinationPattern, coordinationPattern));
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
			case InstancePackage.ASSEMBLY_INSTANCE__COORDINATION_PATTERN:
				if (resolve) return getCoordinationPattern();
				return basicGetCoordinationPattern();
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
			case InstancePackage.ASSEMBLY_INSTANCE__ASSEMBLY_TYPE:
				setAssemblyType((Assembly)newValue);
				return;
			case InstancePackage.ASSEMBLY_INSTANCE__COORDINATION_PATTERN:
				setCoordinationPattern((CoordinationPattern)newValue);
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
			case InstancePackage.ASSEMBLY_INSTANCE__ASSEMBLY_TYPE:
				setAssemblyType((Assembly)null);
				return;
			case InstancePackage.ASSEMBLY_INSTANCE__COORDINATION_PATTERN:
				setCoordinationPattern((CoordinationPattern)null);
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
			case InstancePackage.ASSEMBLY_INSTANCE__ASSEMBLY_TYPE:
				return assemblyType != null;
			case InstancePackage.ASSEMBLY_INSTANCE__COORDINATION_PATTERN:
				return coordinationPattern != null;
		}
		return super.eIsSet(featureID);
	}

} //AssemblyInstanceImpl
