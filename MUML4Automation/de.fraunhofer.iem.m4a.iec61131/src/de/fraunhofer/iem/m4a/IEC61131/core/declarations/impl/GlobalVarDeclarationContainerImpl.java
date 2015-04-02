/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalAttribute;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.GlobalVarDeclarationContainer;

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
 * An implementation of the model object '<em><b>Global Var Declaration Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.GlobalVarDeclarationContainerImpl#getDeclarations <em>Declarations</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.GlobalVarDeclarationContainerImpl#getGlobalAttribute <em>Global Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalVarDeclarationContainerImpl extends MinimalEObjectImpl.Container implements GlobalVarDeclarationContainer {
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalVarDeclaration> declarations;

	/**
	 * The default value of the '{@link #getGlobalAttribute() <em>Global Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final GlobalAttribute GLOBAL_ATTRIBUTE_EDEFAULT = GlobalAttribute.CONSTANT;

	/**
	 * The cached value of the '{@link #getGlobalAttribute() <em>Global Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalAttribute()
	 * @generated
	 * @ordered
	 */
	protected GlobalAttribute globalAttribute = GLOBAL_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalVarDeclarationContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationsPackage.Literals.GLOBAL_VAR_DECLARATION_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalVarDeclaration> getDeclarations() {
		if (declarations == null) {
			declarations = new EObjectContainmentEList<GlobalVarDeclaration>(GlobalVarDeclaration.class, this, DeclarationsPackage.GLOBAL_VAR_DECLARATION_CONTAINER__DECLARATIONS);
		}
		return declarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalAttribute getGlobalAttribute() {
		return globalAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalAttribute(GlobalAttribute newGlobalAttribute) {
		GlobalAttribute oldGlobalAttribute = globalAttribute;
		globalAttribute = newGlobalAttribute == null ? GLOBAL_ATTRIBUTE_EDEFAULT : newGlobalAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.GLOBAL_VAR_DECLARATION_CONTAINER__GLOBAL_ATTRIBUTE, oldGlobalAttribute, globalAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION_CONTAINER__DECLARATIONS:
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
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION_CONTAINER__DECLARATIONS:
				return getDeclarations();
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION_CONTAINER__GLOBAL_ATTRIBUTE:
				return getGlobalAttribute();
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
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION_CONTAINER__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends GlobalVarDeclaration>)newValue);
				return;
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION_CONTAINER__GLOBAL_ATTRIBUTE:
				setGlobalAttribute((GlobalAttribute)newValue);
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
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION_CONTAINER__DECLARATIONS:
				getDeclarations().clear();
				return;
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION_CONTAINER__GLOBAL_ATTRIBUTE:
				setGlobalAttribute(GLOBAL_ATTRIBUTE_EDEFAULT);
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
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION_CONTAINER__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
			case DeclarationsPackage.GLOBAL_VAR_DECLARATION_CONTAINER__GLOBAL_ATTRIBUTE:
				return globalAttribute != GLOBAL_ATTRIBUTE_EDEFAULT;
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
		result.append(" (globalAttribute: ");
		result.append(globalAttribute);
		result.append(')');
		return result.toString();
	}

} //GlobalVarDeclarationContainerImpl
