/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.configurations.ProgramConfiguration;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.FBInstance;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.SymbolicAccessPath;

import de.fraunhofer.iem.m4a.IEC61131.core.variables.SymbolicVariable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbolic Access Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SymbolicAccessPathImpl#getFbRef <em>Fb Ref</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SymbolicAccessPathImpl#getProgramRef <em>Program Ref</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.SymbolicAccessPathImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymbolicAccessPathImpl extends AccessDeclarationImpl implements SymbolicAccessPath {
	/**
	 * The cached value of the '{@link #getFbRef() <em>Fb Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFbRef()
	 * @generated
	 * @ordered
	 */
	protected FBInstance fbRef;

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
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected SymbolicVariable variable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymbolicAccessPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationsPackage.Literals.SYMBOLIC_ACCESS_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FBInstance getFbRef() {
		if (fbRef != null && fbRef.eIsProxy()) {
			InternalEObject oldFbRef = (InternalEObject)fbRef;
			fbRef = (FBInstance)eResolveProxy(oldFbRef);
			if (fbRef != oldFbRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationsPackage.SYMBOLIC_ACCESS_PATH__FB_REF, oldFbRef, fbRef));
			}
		}
		return fbRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FBInstance basicGetFbRef() {
		return fbRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFbRef(FBInstance newFbRef) {
		FBInstance oldFbRef = fbRef;
		fbRef = newFbRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.SYMBOLIC_ACCESS_PATH__FB_REF, oldFbRef, fbRef));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeclarationsPackage.SYMBOLIC_ACCESS_PATH__PROGRAM_REF, oldProgramRef, programRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.SYMBOLIC_ACCESS_PATH__PROGRAM_REF, oldProgramRef, programRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SymbolicVariable getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(SymbolicVariable newVariable, NotificationChain msgs) {
		SymbolicVariable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationsPackage.SYMBOLIC_ACCESS_PATH__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(SymbolicVariable newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.SYMBOLIC_ACCESS_PATH__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationsPackage.SYMBOLIC_ACCESS_PATH__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.SYMBOLIC_ACCESS_PATH__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationsPackage.SYMBOLIC_ACCESS_PATH__VARIABLE:
				return basicSetVariable(null, msgs);
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
			case DeclarationsPackage.SYMBOLIC_ACCESS_PATH__FB_REF:
				if (resolve) return getFbRef();
				return basicGetFbRef();
			case DeclarationsPackage.SYMBOLIC_ACCESS_PATH__PROGRAM_REF:
				if (resolve) return getProgramRef();
				return basicGetProgramRef();
			case DeclarationsPackage.SYMBOLIC_ACCESS_PATH__VARIABLE:
				return getVariable();
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
			case DeclarationsPackage.SYMBOLIC_ACCESS_PATH__FB_REF:
				setFbRef((FBInstance)newValue);
				return;
			case DeclarationsPackage.SYMBOLIC_ACCESS_PATH__PROGRAM_REF:
				setProgramRef((ProgramConfiguration)newValue);
				return;
			case DeclarationsPackage.SYMBOLIC_ACCESS_PATH__VARIABLE:
				setVariable((SymbolicVariable)newValue);
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
			case DeclarationsPackage.SYMBOLIC_ACCESS_PATH__FB_REF:
				setFbRef((FBInstance)null);
				return;
			case DeclarationsPackage.SYMBOLIC_ACCESS_PATH__PROGRAM_REF:
				setProgramRef((ProgramConfiguration)null);
				return;
			case DeclarationsPackage.SYMBOLIC_ACCESS_PATH__VARIABLE:
				setVariable((SymbolicVariable)null);
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
			case DeclarationsPackage.SYMBOLIC_ACCESS_PATH__FB_REF:
				return fbRef != null;
			case DeclarationsPackage.SYMBOLIC_ACCESS_PATH__PROGRAM_REF:
				return programRef != null;
			case DeclarationsPackage.SYMBOLIC_ACCESS_PATH__VARIABLE:
				return variable != null;
		}
		return super.eIsSet(featureID);
	}

} //SymbolicAccessPathImpl
