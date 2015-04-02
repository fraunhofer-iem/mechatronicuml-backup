/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.DeclarationsPackage;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarContainer;
import de.fraunhofer.iem.m4a.IEC61131.core.declarations.IncomplLocatedVarDeclaration;

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
 * An implementation of the model object '<em><b>Incompl Located Var Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.IncomplLocatedVarContainerImpl#isRetain <em>Retain</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.declarations.impl.IncomplLocatedVarContainerImpl#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncomplLocatedVarContainerImpl extends MinimalEObjectImpl.Container implements IncomplLocatedVarContainer {
	/**
	 * The default value of the '{@link #isRetain() <em>Retain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetain()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETAIN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRetain() <em>Retain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetain()
	 * @generated
	 * @ordered
	 */
	protected boolean retain = RETAIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<IncomplLocatedVarDeclaration> declarations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IncomplLocatedVarContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationsPackage.Literals.INCOMPL_LOCATED_VAR_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRetain() {
		return retain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetain(boolean newRetain) {
		boolean oldRetain = retain;
		retain = newRetain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationsPackage.INCOMPL_LOCATED_VAR_CONTAINER__RETAIN, oldRetain, retain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IncomplLocatedVarDeclaration> getDeclarations() {
		if (declarations == null) {
			declarations = new EObjectContainmentEList<IncomplLocatedVarDeclaration>(IncomplLocatedVarDeclaration.class, this, DeclarationsPackage.INCOMPL_LOCATED_VAR_CONTAINER__DECLARATIONS);
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
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_CONTAINER__DECLARATIONS:
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
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_CONTAINER__RETAIN:
				return isRetain();
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_CONTAINER__DECLARATIONS:
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
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_CONTAINER__RETAIN:
				setRetain((Boolean)newValue);
				return;
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_CONTAINER__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends IncomplLocatedVarDeclaration>)newValue);
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
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_CONTAINER__RETAIN:
				setRetain(RETAIN_EDEFAULT);
				return;
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_CONTAINER__DECLARATIONS:
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
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_CONTAINER__RETAIN:
				return retain != RETAIN_EDEFAULT;
			case DeclarationsPackage.INCOMPL_LOCATED_VAR_CONTAINER__DECLARATIONS:
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
		result.append(" (retain: ");
		result.append(retain);
		result.append(')');
		return result.toString();
	}

} //IncomplLocatedVarContainerImpl
