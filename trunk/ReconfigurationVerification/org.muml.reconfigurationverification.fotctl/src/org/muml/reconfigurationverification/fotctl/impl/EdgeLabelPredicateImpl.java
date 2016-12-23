/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.muml.reconfigurationverification.fotctl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.reconfigurationverification.fotctl.EdgeLabelPredicate;
import org.muml.reconfigurationverification.fotctl.EdgeLabelPredicateDecl;
import org.muml.reconfigurationverification.fotctl.FotctlPackage;
import org.muml.reconfigurationverification.tctl.Term;
import org.muml.reconfigurationverification.tctl.impl.AtomicFormulaImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Edge Label Predicate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.reconfigurationverification.fotctl.impl.EdgeLabelPredicateImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.muml.reconfigurationverification.fotctl.impl.EdgeLabelPredicateImpl#getSecondTerm <em>Second Term</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EdgeLabelPredicateImpl extends AtomicFormulaImpl implements EdgeLabelPredicate {
	/**
	 * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaration()
	 * @generated
	 * @ordered
	 */
	protected EdgeLabelPredicateDecl declaration;

	/**
	 * The cached value of the '{@link #getSecondTerm() <em>Second Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondTerm()
	 * @generated
	 * @ordered
	 */
	protected Term secondTerm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EdgeLabelPredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FotctlPackage.Literals.EDGE_LABEL_PREDICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeLabelPredicateDecl getDeclaration() {
		if (declaration != null && declaration.eIsProxy()) {
			InternalEObject oldDeclaration = (InternalEObject)declaration;
			declaration = (EdgeLabelPredicateDecl)eResolveProxy(oldDeclaration);
			if (declaration != oldDeclaration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FotctlPackage.EDGE_LABEL_PREDICATE__DECLARATION, oldDeclaration, declaration));
			}
		}
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeLabelPredicateDecl basicGetDeclaration() {
		return declaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaration(EdgeLabelPredicateDecl newDeclaration) {
		EdgeLabelPredicateDecl oldDeclaration = declaration;
		declaration = newDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FotctlPackage.EDGE_LABEL_PREDICATE__DECLARATION, oldDeclaration, declaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getSecondTerm() {
		return secondTerm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondTerm(Term newSecondTerm, NotificationChain msgs) {
		Term oldSecondTerm = secondTerm;
		secondTerm = newSecondTerm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FotctlPackage.EDGE_LABEL_PREDICATE__SECOND_TERM, oldSecondTerm, newSecondTerm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondTerm(Term newSecondTerm) {
		if (newSecondTerm != secondTerm) {
			NotificationChain msgs = null;
			if (secondTerm != null)
				msgs = ((InternalEObject)secondTerm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FotctlPackage.EDGE_LABEL_PREDICATE__SECOND_TERM, null, msgs);
			if (newSecondTerm != null)
				msgs = ((InternalEObject)newSecondTerm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FotctlPackage.EDGE_LABEL_PREDICATE__SECOND_TERM, null, msgs);
			msgs = basicSetSecondTerm(newSecondTerm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FotctlPackage.EDGE_LABEL_PREDICATE__SECOND_TERM, newSecondTerm, newSecondTerm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FotctlPackage.EDGE_LABEL_PREDICATE__SECOND_TERM:
				return basicSetSecondTerm(null, msgs);
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
			case FotctlPackage.EDGE_LABEL_PREDICATE__DECLARATION:
				if (resolve) return getDeclaration();
				return basicGetDeclaration();
			case FotctlPackage.EDGE_LABEL_PREDICATE__SECOND_TERM:
				return getSecondTerm();
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
			case FotctlPackage.EDGE_LABEL_PREDICATE__DECLARATION:
				setDeclaration((EdgeLabelPredicateDecl)newValue);
				return;
			case FotctlPackage.EDGE_LABEL_PREDICATE__SECOND_TERM:
				setSecondTerm((Term)newValue);
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
			case FotctlPackage.EDGE_LABEL_PREDICATE__DECLARATION:
				setDeclaration((EdgeLabelPredicateDecl)null);
				return;
			case FotctlPackage.EDGE_LABEL_PREDICATE__SECOND_TERM:
				setSecondTerm((Term)null);
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
			case FotctlPackage.EDGE_LABEL_PREDICATE__DECLARATION:
				return declaration != null;
			case FotctlPackage.EDGE_LABEL_PREDICATE__SECOND_TERM:
				return secondTerm != null;
		}
		return super.eIsSet(featureID);
	}

} //EdgeLabelPredicateImpl
