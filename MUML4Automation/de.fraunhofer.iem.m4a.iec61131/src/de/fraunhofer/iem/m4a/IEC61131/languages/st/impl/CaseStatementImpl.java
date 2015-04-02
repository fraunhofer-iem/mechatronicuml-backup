/**
 */
package de.fraunhofer.iem.m4a.IEC61131.languages.st.impl;

import de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseElement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.CaseStatement;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.Else;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.Expression;
import de.fraunhofer.iem.m4a.IEC61131.languages.st.StPackage;

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
 * An implementation of the model object '<em><b>Case Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.CaseStatementImpl#getElse <em>Else</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.CaseStatementImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.fraunhofer.iem.m4a.IEC61131.languages.st.impl.CaseStatementImpl#getCaseElements <em>Case Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseStatementImpl extends MinimalEObjectImpl.Container implements CaseStatement {
	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected Else else_;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Expression condition;

	/**
	 * The cached value of the '{@link #getCaseElements() <em>Case Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseElements()
	 * @generated
	 * @ordered
	 */
	protected EList<CaseElement> caseElements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StPackage.Literals.CASE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Else getElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(Else newElse, NotificationChain msgs) {
		Else oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StPackage.CASE_STATEMENT__ELSE, oldElse, newElse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(Else newElse) {
		if (newElse != else_) {
			NotificationChain msgs = null;
			if (else_ != null)
				msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StPackage.CASE_STATEMENT__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StPackage.CASE_STATEMENT__ELSE, null, msgs);
			msgs = basicSetElse(newElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.CASE_STATEMENT__ELSE, newElse, newElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Expression newCondition, NotificationChain msgs) {
		Expression oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StPackage.CASE_STATEMENT__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Expression newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StPackage.CASE_STATEMENT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StPackage.CASE_STATEMENT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StPackage.CASE_STATEMENT__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaseElement> getCaseElements() {
		if (caseElements == null) {
			caseElements = new EObjectContainmentEList<CaseElement>(CaseElement.class, this, StPackage.CASE_STATEMENT__CASE_ELEMENTS);
		}
		return caseElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StPackage.CASE_STATEMENT__ELSE:
				return basicSetElse(null, msgs);
			case StPackage.CASE_STATEMENT__CONDITION:
				return basicSetCondition(null, msgs);
			case StPackage.CASE_STATEMENT__CASE_ELEMENTS:
				return ((InternalEList<?>)getCaseElements()).basicRemove(otherEnd, msgs);
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
			case StPackage.CASE_STATEMENT__ELSE:
				return getElse();
			case StPackage.CASE_STATEMENT__CONDITION:
				return getCondition();
			case StPackage.CASE_STATEMENT__CASE_ELEMENTS:
				return getCaseElements();
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
			case StPackage.CASE_STATEMENT__ELSE:
				setElse((Else)newValue);
				return;
			case StPackage.CASE_STATEMENT__CONDITION:
				setCondition((Expression)newValue);
				return;
			case StPackage.CASE_STATEMENT__CASE_ELEMENTS:
				getCaseElements().clear();
				getCaseElements().addAll((Collection<? extends CaseElement>)newValue);
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
			case StPackage.CASE_STATEMENT__ELSE:
				setElse((Else)null);
				return;
			case StPackage.CASE_STATEMENT__CONDITION:
				setCondition((Expression)null);
				return;
			case StPackage.CASE_STATEMENT__CASE_ELEMENTS:
				getCaseElements().clear();
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
			case StPackage.CASE_STATEMENT__ELSE:
				return else_ != null;
			case StPackage.CASE_STATEMENT__CONDITION:
				return condition != null;
			case StPackage.CASE_STATEMENT__CASE_ELEMENTS:
				return caseElements != null && !caseElements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CaseStatementImpl
