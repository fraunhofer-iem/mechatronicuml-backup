/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration;
import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ResourceDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.InstanceSpecificVarInit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Specific Var Init</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificVarInitImpl#getResourceRef <em>Resource Ref</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.InstanceSpecificVarInitImpl#getProgramRef <em>Program Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class InstanceSpecificVarInitImpl extends MinimalEObjectImpl.Container implements InstanceSpecificVarInit {
	/**
	 * The cached value of the '{@link #getResourceRef() <em>Resource Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceRef()
	 * @generated
	 * @ordered
	 */
	protected ResourceDeclaration resourceRef;
	/**
	 * The cached value of the '{@link #getProgramRef() <em>Program Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramRef()
	 * @generated
	 * @ordered
	 */
	protected ProgramConfiguration programRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceSpecificVarInitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationsPackage.Literals.INSTANCE_SPECIFIC_VAR_INIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDeclaration getResourceRef() {
		if (resourceRef != null && resourceRef.eIsProxy()) {
			InternalEObject oldResourceRef = (InternalEObject)resourceRef;
			resourceRef = (ResourceDeclaration)eResolveProxy(oldResourceRef);
			if (resourceRef != oldResourceRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationsPackage.INSTANCE_SPECIFIC_VAR_INIT__RESOURCE_REF, oldResourceRef, resourceRef));
			}
		}
		return resourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceDeclaration basicGetResourceRef() {
		return resourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceRef(ResourceDeclaration newResourceRef) {
		ResourceDeclaration oldResourceRef = resourceRef;
		resourceRef = newResourceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.INSTANCE_SPECIFIC_VAR_INIT__RESOURCE_REF, oldResourceRef, resourceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramConfiguration getProgramRef() {
		if (programRef != null && programRef.eIsProxy()) {
			InternalEObject oldProgramRef = (InternalEObject)programRef;
			programRef = (ProgramConfiguration)eResolveProxy(oldProgramRef);
			if (programRef != oldProgramRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationsPackage.INSTANCE_SPECIFIC_VAR_INIT__PROGRAM_REF, oldProgramRef, programRef));
			}
		}
		return programRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramConfiguration basicGetProgramRef() {
		return programRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramRef(ProgramConfiguration newProgramRef) {
		ProgramConfiguration oldProgramRef = programRef;
		programRef = newProgramRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.INSTANCE_SPECIFIC_VAR_INIT__PROGRAM_REF, oldProgramRef, programRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DeclarationsPackage.INSTANCE_SPECIFIC_VAR_INIT__RESOURCE_REF:
				if (resolve) return getResourceRef();
				return basicGetResourceRef();
			case DeclarationsPackage.INSTANCE_SPECIFIC_VAR_INIT__PROGRAM_REF:
				if (resolve) return getProgramRef();
				return basicGetProgramRef();
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
			case DeclarationsPackage.INSTANCE_SPECIFIC_VAR_INIT__RESOURCE_REF:
				setResourceRef((ResourceDeclaration)newValue);
				return;
			case DeclarationsPackage.INSTANCE_SPECIFIC_VAR_INIT__PROGRAM_REF:
				setProgramRef((ProgramConfiguration)newValue);
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
			case DeclarationsPackage.INSTANCE_SPECIFIC_VAR_INIT__RESOURCE_REF:
				setResourceRef((ResourceDeclaration)null);
				return;
			case DeclarationsPackage.INSTANCE_SPECIFIC_VAR_INIT__PROGRAM_REF:
				setProgramRef((ProgramConfiguration)null);
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
			case DeclarationsPackage.INSTANCE_SPECIFIC_VAR_INIT__RESOURCE_REF:
				return resourceRef != null;
			case DeclarationsPackage.INSTANCE_SPECIFIC_VAR_INIT__PROGRAM_REF:
				return programRef != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceSpecificVarInitImpl
