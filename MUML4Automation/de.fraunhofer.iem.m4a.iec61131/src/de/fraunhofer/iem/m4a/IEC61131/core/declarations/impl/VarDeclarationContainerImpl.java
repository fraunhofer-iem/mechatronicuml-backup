/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarDeclarationType;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.VarInitDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Declaration Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.VarDeclarationContainerImpl#getDeclarationType <em>Declaration Type</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.VarDeclarationContainerImpl#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VarDeclarationContainerImpl extends MinimalEObjectImpl.Container implements VarDeclarationContainer {
	/**
	 * The default value of the '{@link #getDeclarationType() <em>Declaration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationType()
	 * @generated
	 * @ordered
	 */
	protected static final VarDeclarationType DECLARATION_TYPE_EDEFAULT = VarDeclarationType.NIL;

	/**
	 * The cached value of the '{@link #getDeclarationType() <em>Declaration Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarationType()
	 * @generated
	 * @ordered
	 */
	protected VarDeclarationType declarationType = DECLARATION_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<VarInitDeclaration> declarations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarDeclarationContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationsPackage.Literals.VAR_DECLARATION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarDeclarationType getDeclarationType() {
		return declarationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclarationType(VarDeclarationType newDeclarationType) {
		VarDeclarationType oldDeclarationType = declarationType;
		declarationType = newDeclarationType == null ? DECLARATION_TYPE_EDEFAULT : newDeclarationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.VAR_DECLARATION_CONTAINER__DECLARATION_TYPE, oldDeclarationType, declarationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarInitDeclaration> getDeclarations() {
		if (declarations == null) {
			declarations = new EObjectContainmentEList<VarInitDeclaration>(VarInitDeclaration.class, this, DeclarationsPackage.VAR_DECLARATION_CONTAINER__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationsPackage.VAR_DECLARATION_CONTAINER__DECLARATIONS:
				return ((InternalEList<?>)getDeclarations()).basicRemove(otherEnd, msgs);
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
			case DeclarationsPackage.VAR_DECLARATION_CONTAINER__DECLARATION_TYPE:
				return getDeclarationType();
			case DeclarationsPackage.VAR_DECLARATION_CONTAINER__DECLARATIONS:
				return getDeclarations();
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
			case DeclarationsPackage.VAR_DECLARATION_CONTAINER__DECLARATION_TYPE:
				setDeclarationType((VarDeclarationType)newValue);
				return;
			case DeclarationsPackage.VAR_DECLARATION_CONTAINER__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends VarInitDeclaration>)newValue);
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
			case DeclarationsPackage.VAR_DECLARATION_CONTAINER__DECLARATION_TYPE:
				setDeclarationType(DECLARATION_TYPE_EDEFAULT);
				return;
			case DeclarationsPackage.VAR_DECLARATION_CONTAINER__DECLARATIONS:
				getDeclarations().clear();
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
			case DeclarationsPackage.VAR_DECLARATION_CONTAINER__DECLARATION_TYPE:
				return declarationType != DECLARATION_TYPE_EDEFAULT;
			case DeclarationsPackage.VAR_DECLARATION_CONTAINER__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
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
		result.append(" (declarationType: ");
		result.append(declarationType);
		result.append(')');
		return result.toString();
	}

} //VarDeclarationContainerImpl
