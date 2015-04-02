/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st.impl;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseElement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseListElement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StatementList;

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
 * An implementation of the model object '<em><b>Case Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.CaseElementImpl#getCaseList <em>Case List</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.CaseElementImpl#getStatementList <em>Statement List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseElementImpl extends MinimalEObjectImpl.Container implements CaseElement {
	/**
	 * The cached value of the '{@link #getCaseList() <em>Case List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseList()
	 * @generated
	 * @ordered
	 */
	protected EList<CaseListElement> caseList;

	/**
	 * The cached value of the '{@link #getStatementList() <em>Statement List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatementList()
	 * @generated
	 * @ordered
	 */
	protected StatementList statementList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StPackage.Literals.CASE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaseListElement> getCaseList() {
		if (caseList == null) {
			caseList = new EObjectContainmentEList<CaseListElement>(CaseListElement.class, this, StPackage.CASE_ELEMENT__CASE_LIST);
		}
		return caseList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatementList getStatementList() {
		return statementList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatementList(StatementList newStatementList, NotificationChain msgs) {
		StatementList oldStatementList = statementList;
		statementList = newStatementList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StPackage.CASE_ELEMENT__STATEMENT_LIST, oldStatementList, newStatementList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatementList(StatementList newStatementList) {
		if (newStatementList != statementList) {
			NotificationChain msgs = null;
			if (statementList != null)
				msgs = ((InternalEObject)statementList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StPackage.CASE_ELEMENT__STATEMENT_LIST, null, msgs);
			if (newStatementList != null)
				msgs = ((InternalEObject)newStatementList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StPackage.CASE_ELEMENT__STATEMENT_LIST, null, msgs);
			msgs = basicSetStatementList(newStatementList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.CASE_ELEMENT__STATEMENT_LIST, newStatementList, newStatementList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StPackage.CASE_ELEMENT__CASE_LIST:
				return ((InternalEList<?>)getCaseList()).basicRemove(otherEnd, msgs);
			case StPackage.CASE_ELEMENT__STATEMENT_LIST:
				return basicSetStatementList(null, msgs);
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
			case StPackage.CASE_ELEMENT__CASE_LIST:
				return getCaseList();
			case StPackage.CASE_ELEMENT__STATEMENT_LIST:
				return getStatementList();
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
			case StPackage.CASE_ELEMENT__CASE_LIST:
				getCaseList().clear();
				getCaseList().addAll((Collection<? extends CaseListElement>)newValue);
				return;
			case StPackage.CASE_ELEMENT__STATEMENT_LIST:
				setStatementList((StatementList)newValue);
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
			case StPackage.CASE_ELEMENT__CASE_LIST:
				getCaseList().clear();
				return;
			case StPackage.CASE_ELEMENT__STATEMENT_LIST:
				setStatementList((StatementList)null);
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
			case StPackage.CASE_ELEMENT__CASE_LIST:
				return caseList != null && !caseList.isEmpty();
			case StPackage.CASE_ELEMENT__STATEMENT_LIST:
				return statementList != null;
		}
		return super.eIsSet(featureID);
	}

} //CaseElementImpl
