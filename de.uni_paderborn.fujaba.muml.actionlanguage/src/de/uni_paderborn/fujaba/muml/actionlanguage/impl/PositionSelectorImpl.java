/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uni_paderborn.fujaba.muml.actionlanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.storydriven.core.expressions.impl.ExpressionImpl;

import de.uni_paderborn.fujaba.muml.actionlanguage.ActionLanguagePackage;
import de.uni_paderborn.fujaba.muml.actionlanguage.PositionSelector;
import de.uni_paderborn.fujaba.muml.actionlanguage.PositionSelectorKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.impl.PositionSelectorImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link de.uni_paderborn.fujaba.muml.actionlanguage.impl.PositionSelectorImpl#getSuccessor <em>Successor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PositionSelectorImpl extends ExpressionImpl implements PositionSelector {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final PositionSelectorKind KIND_EDEFAULT = PositionSelectorKind.SELF;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected PositionSelectorKind kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuccessor() <em>Successor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessor()
	 * @generated
	 * @ordered
	 */
	protected PositionSelector successor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PositionSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActionLanguagePackage.Literals.POSITION_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionSelectorKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(PositionSelectorKind newKind) {
		PositionSelectorKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.POSITION_SELECTOR__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PositionSelector getSuccessor() {
		return successor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuccessor(PositionSelector newSuccessor, NotificationChain msgs) {
		PositionSelector oldSuccessor = successor;
		successor = newSuccessor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.POSITION_SELECTOR__SUCCESSOR, oldSuccessor, newSuccessor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuccessor(PositionSelector newSuccessor) {
		if (newSuccessor != successor) {
			NotificationChain msgs = null;
			if (successor != null)
				msgs = ((InternalEObject)successor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.POSITION_SELECTOR__SUCCESSOR, null, msgs);
			if (newSuccessor != null)
				msgs = ((InternalEObject)newSuccessor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActionLanguagePackage.POSITION_SELECTOR__SUCCESSOR, null, msgs);
			msgs = basicSetSuccessor(newSuccessor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActionLanguagePackage.POSITION_SELECTOR__SUCCESSOR, newSuccessor, newSuccessor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActionLanguagePackage.POSITION_SELECTOR__SUCCESSOR:
				return basicSetSuccessor(null, msgs);
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
			case ActionLanguagePackage.POSITION_SELECTOR__KIND:
				return getKind();
			case ActionLanguagePackage.POSITION_SELECTOR__SUCCESSOR:
				return getSuccessor();
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
			case ActionLanguagePackage.POSITION_SELECTOR__KIND:
				setKind((PositionSelectorKind)newValue);
				return;
			case ActionLanguagePackage.POSITION_SELECTOR__SUCCESSOR:
				setSuccessor((PositionSelector)newValue);
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
			case ActionLanguagePackage.POSITION_SELECTOR__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case ActionLanguagePackage.POSITION_SELECTOR__SUCCESSOR:
				setSuccessor((PositionSelector)null);
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
			case ActionLanguagePackage.POSITION_SELECTOR__KIND:
				return kind != KIND_EDEFAULT;
			case ActionLanguagePackage.POSITION_SELECTOR__SUCCESSOR:
				return successor != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //PositionSelectorImpl
