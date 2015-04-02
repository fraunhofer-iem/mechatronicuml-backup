/**
 */
package de.fraunhofer.iem.m4a.IEC61131.core.pous.impl;

import de.fraunhofer.iem.m4a.IEC61131.core.declarations.IOVarDeclaration;

import de.fraunhofer.iem.m4a.IEC61131.core.pous.BlackboxFunctionBlockDeclaration;
import de.fraunhofer.iem.m4a.IEC61131.core.pous.PousPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blackbox Function Block Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.core.pous.impl.BlackboxFunctionBlockDeclarationImpl#getDeclarations <em>Declarations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlackboxFunctionBlockDeclarationImpl extends AbstractFunctionBlockDeclarationImpl implements BlackboxFunctionBlockDeclaration {
	/**
	 * The cached value of the '{@link #getDeclarations() <em>Declarations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclarations()
	 * @generated
	 * @ordered
	 */
	protected EList<IOVarDeclaration> declarations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlackboxFunctionBlockDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PousPackage.Literals.BLACKBOX_FUNCTION_BLOCK_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IOVarDeclaration> getDeclarations() {
		if (declarations == null) {
			declarations = new EObjectContainmentEList<IOVarDeclaration>(IOVarDeclaration.class, this, PousPackage.BLACKBOX_FUNCTION_BLOCK_DECLARATION__DECLARATIONS);
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
			case PousPackage.BLACKBOX_FUNCTION_BLOCK_DECLARATION__DECLARATIONS:
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
			case PousPackage.BLACKBOX_FUNCTION_BLOCK_DECLARATION__DECLARATIONS:
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
			case PousPackage.BLACKBOX_FUNCTION_BLOCK_DECLARATION__DECLARATIONS:
				getDeclarations().clear();
				getDeclarations().addAll((Collection<? extends IOVarDeclaration>)newValue);
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
			case PousPackage.BLACKBOX_FUNCTION_BLOCK_DECLARATION__DECLARATIONS:
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
			case PousPackage.BLACKBOX_FUNCTION_BLOCK_DECLARATION__DECLARATIONS:
				return declarations != null && !declarations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlackboxFunctionBlockDeclarationImpl
