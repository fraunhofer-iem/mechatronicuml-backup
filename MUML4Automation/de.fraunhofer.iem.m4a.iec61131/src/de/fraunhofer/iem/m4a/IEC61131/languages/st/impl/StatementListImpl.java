/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st.impl;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.Statement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StatementList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.StatementListImpl#getStatments <em>Statments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatementListImpl extends MinimalEObjectImpl.Container implements StatementList {
	/**
	 * The cached value of the '{@link #getStatments() <em>Statments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatments()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StPackage.Literals.STATEMENT_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatments() {
		if (statments == null) {
			statments = new EObjectContainmentEList<Statement>(Statement.class, this, StPackage.STATEMENT_LIST__STATMENTS);
		}
		return statments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StPackage.STATEMENT_LIST__STATMENTS:
				return ((InternalEList<?>)getStatments()).basicRemove(otherEnd, msgs);
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
			case StPackage.STATEMENT_LIST__STATMENTS:
				return getStatments();
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
			case StPackage.STATEMENT_LIST__STATMENTS:
				getStatments().clear();
				getStatments().addAll((Collection<? extends Statement>)newValue);
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
			case StPackage.STATEMENT_LIST__STATMENTS:
				getStatments().clear();
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
			case StPackage.STATEMENT_LIST__STATMENTS:
				return statments != null && !statments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StatementListImpl
