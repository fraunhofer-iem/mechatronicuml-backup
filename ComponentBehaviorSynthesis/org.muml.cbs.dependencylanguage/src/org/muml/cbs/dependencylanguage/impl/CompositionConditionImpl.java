/**
 */
package org.muml.cbs.dependencylanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.muml.cbs.dependencylanguage.CompositionCondition;
import org.muml.cbs.dependencylanguage.Condition;
import org.muml.cbs.dependencylanguage.DependencylanguagePackage;
import org.muml.core.expressions.common.LogicOperator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composition Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.CompositionConditionImpl#getLeftCondition <em>Left Condition</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.CompositionConditionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.muml.cbs.dependencylanguage.impl.CompositionConditionImpl#getRightCondition <em>Right Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositionConditionImpl extends ConditionImpl implements CompositionCondition {
	/**
	 * The cached value of the '{@link #getLeftCondition() <em>Left Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition leftCondition;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final LogicOperator KIND_EDEFAULT = LogicOperator.AND;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected LogicOperator kind = KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRightCondition() <em>Right Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition rightCondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositionConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DependencylanguagePackage.Literals.COMPOSITION_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getLeftCondition() {
		return leftCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftCondition(Condition newLeftCondition, NotificationChain msgs) {
		Condition oldLeftCondition = leftCondition;
		leftCondition = newLeftCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.COMPOSITION_CONDITION__LEFT_CONDITION, oldLeftCondition, newLeftCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftCondition(Condition newLeftCondition) {
		if (newLeftCondition != leftCondition) {
			NotificationChain msgs = null;
			if (leftCondition != null)
				msgs = ((InternalEObject)leftCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.COMPOSITION_CONDITION__LEFT_CONDITION, null, msgs);
			if (newLeftCondition != null)
				msgs = ((InternalEObject)newLeftCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.COMPOSITION_CONDITION__LEFT_CONDITION, null, msgs);
			msgs = basicSetLeftCondition(newLeftCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.COMPOSITION_CONDITION__LEFT_CONDITION, newLeftCondition, newLeftCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicOperator getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(LogicOperator newKind) {
		LogicOperator oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.COMPOSITION_CONDITION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getRightCondition() {
		return rightCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightCondition(Condition newRightCondition, NotificationChain msgs) {
		Condition oldRightCondition = rightCondition;
		rightCondition = newRightCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.COMPOSITION_CONDITION__RIGHT_CONDITION, oldRightCondition, newRightCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightCondition(Condition newRightCondition) {
		if (newRightCondition != rightCondition) {
			NotificationChain msgs = null;
			if (rightCondition != null)
				msgs = ((InternalEObject)rightCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.COMPOSITION_CONDITION__RIGHT_CONDITION, null, msgs);
			if (newRightCondition != null)
				msgs = ((InternalEObject)newRightCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DependencylanguagePackage.COMPOSITION_CONDITION__RIGHT_CONDITION, null, msgs);
			msgs = basicSetRightCondition(newRightCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DependencylanguagePackage.COMPOSITION_CONDITION__RIGHT_CONDITION, newRightCondition, newRightCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DependencylanguagePackage.COMPOSITION_CONDITION__LEFT_CONDITION:
				return basicSetLeftCondition(null, msgs);
			case DependencylanguagePackage.COMPOSITION_CONDITION__RIGHT_CONDITION:
				return basicSetRightCondition(null, msgs);
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
			case DependencylanguagePackage.COMPOSITION_CONDITION__LEFT_CONDITION:
				return getLeftCondition();
			case DependencylanguagePackage.COMPOSITION_CONDITION__KIND:
				return getKind();
			case DependencylanguagePackage.COMPOSITION_CONDITION__RIGHT_CONDITION:
				return getRightCondition();
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
			case DependencylanguagePackage.COMPOSITION_CONDITION__LEFT_CONDITION:
				setLeftCondition((Condition)newValue);
				return;
			case DependencylanguagePackage.COMPOSITION_CONDITION__KIND:
				setKind((LogicOperator)newValue);
				return;
			case DependencylanguagePackage.COMPOSITION_CONDITION__RIGHT_CONDITION:
				setRightCondition((Condition)newValue);
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
			case DependencylanguagePackage.COMPOSITION_CONDITION__LEFT_CONDITION:
				setLeftCondition((Condition)null);
				return;
			case DependencylanguagePackage.COMPOSITION_CONDITION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case DependencylanguagePackage.COMPOSITION_CONDITION__RIGHT_CONDITION:
				setRightCondition((Condition)null);
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
			case DependencylanguagePackage.COMPOSITION_CONDITION__LEFT_CONDITION:
				return leftCondition != null;
			case DependencylanguagePackage.COMPOSITION_CONDITION__KIND:
				return kind != KIND_EDEFAULT;
			case DependencylanguagePackage.COMPOSITION_CONDITION__RIGHT_CONDITION:
				return rightCondition != null;
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

} //CompositionConditionImpl
