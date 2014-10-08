/**
 */
package de.uni_paderborn.fujaba.muml.componentstorypattern.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import de.uni_paderborn.fujaba.muml.componentstorypattern.ComponentstorypatternPackage;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraint;
import de.uni_paderborn.fujaba.muml.componentstorypattern.MultiPortPositionConstraintType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Port Position Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.uni_paderborn.fujaba.muml.componentstorypattern.impl.MultiPortPositionConstraintImpl#getPositionConstraintType <em>Position Constraint Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiPortPositionConstraintImpl extends MultiPortConstraintImpl implements MultiPortPositionConstraint {
	/**
	 * The default value of the '{@link #getPositionConstraintType() <em>Position Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionConstraintType()
	 * @generated
	 * @ordered
	 */
	protected static final MultiPortPositionConstraintType POSITION_CONSTRAINT_TYPE_EDEFAULT = MultiPortPositionConstraintType.FIRST;

	/**
	 * The cached value of the '{@link #getPositionConstraintType() <em>Position Constraint Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionConstraintType()
	 * @generated
	 * @ordered
	 */
	protected MultiPortPositionConstraintType positionConstraintType = POSITION_CONSTRAINT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiPortPositionConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentstorypatternPackage.Literals.MULTI_PORT_POSITION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPortPositionConstraintType getPositionConstraintType() {
		return positionConstraintType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionConstraintType(MultiPortPositionConstraintType newPositionConstraintType) {
		MultiPortPositionConstraintType oldPositionConstraintType = positionConstraintType;
		positionConstraintType = newPositionConstraintType == null ? POSITION_CONSTRAINT_TYPE_EDEFAULT : newPositionConstraintType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__POSITION_CONSTRAINT_TYPE, oldPositionConstraintType, positionConstraintType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__POSITION_CONSTRAINT_TYPE:
				return getPositionConstraintType();
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
			case ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__POSITION_CONSTRAINT_TYPE:
				setPositionConstraintType((MultiPortPositionConstraintType)newValue);
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
			case ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__POSITION_CONSTRAINT_TYPE:
				setPositionConstraintType(POSITION_CONSTRAINT_TYPE_EDEFAULT);
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
			case ComponentstorypatternPackage.MULTI_PORT_POSITION_CONSTRAINT__POSITION_CONSTRAINT_TYPE:
				return positionConstraintType != POSITION_CONSTRAINT_TYPE_EDEFAULT;
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
		result.append(" (positionConstraintType: ");
		result.append(positionConstraintType);
		result.append(')');
		return result.toString();
	}

} //MultiPortPositionConstraintImpl
